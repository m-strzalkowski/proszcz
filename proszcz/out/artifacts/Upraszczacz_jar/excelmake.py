#PRODUKOWANIE ARKUSZY I OBRAZKÓW WYKRESÓW Z PLIKÓW CSV
#argumenty: lista nazw plików, które połączone zostaną w jeden arkusz, ścieżka wyjściowa
#Program uznaje kolumny zaczynające sie z wielkich liter za argumenty a z małych za wartości

import sys
import re
import pandas as pd
#zwraca kolumny dla których funkcja zwraca true
def kolumny_dla_których(df:pd.DataFrame, predykat):
    return [col for col in df.columns if predykat(col)]
##    ret = list()
##    print(df.columns)
##    for col in df.columns:
##        if col[0].islower():
##            ret.append(col)
##    return ret
def listyrówne(a,b):
    for i,j in zip(a,b):
        if i != j:
            return False
    return True

filenames = ['log.dat']
outfile='out.xlsx'
if len(sys.argv)>2:
    filenames = sys.argv[1:-1]
    outfile=sys.argv[-1]
else:
    print("argumenty: lista nazw plików, które połączone zostaną w jeden arkusz, ścieżka wyjściowa (ostatni argument)",file=sys.stderr)
    exit(1)
argumenty=None
serie = list()#serie danych
adf=None#Agregated Data Frame
for filename in filenames:
    print("PLIK:",filename)
    #with open("../rozw/"+filename,"r") as f:
    #    formula = f.read()
    #print(formula)
    #czytanie jako csv
    df = pd.read_csv(filename,sep=' ')
    print(df)
    #print(df[1][1])
    print(len(df))
    #znajdowanie kolumn z argumentami
    argf = kolumny_dla_których(df,lambda x: str.isupper(x[0]))
    if (argumenty is not None) and not listyrówne(argumenty,argf):
        print("Plik ",filename, "ma osie:",argf,",które różnią się od już ustalonych:",argumenty,file=sys.stderr)
        exit(1)
    else:
        argumenty = argf
    print("ARGUMENTY:",argf)
    wart = kolumny_dla_których(df,lambda x: str.islower(x[0]))
    #wykluczamy duplikaty
    wart = [w for w in wart if w not in serie]
    print("nowe serie danych:",wart)
    #przycinanie dataFrame
    print([[*argumenty,*wart]])
    df=df[[*argumenty,*wart]]
    print('df:\n',df.head())
    serie=serie+wart
    df = df.set_index(argumenty)
    #złączenie z ramką już istniejącą
    if adf is not None:
        adf = adf.join(df,on=argumenty,how='outer',lsuffix='l',rsuffix='p')
    else:
        adf=df
    adf.sort_values(argumenty, axis=0,inplace=True)
    print(adf)
    #adf = adf.set_index(argumenty)
#Pisanie do arkusza
adf.reset_index(inplace=True)
adf.to_excel(outfile+".xlsx", index=False)
print('df:\n',adf.head())
#exit(0)
#Obrazek
from matplotlib import pyplot as plt
import re
tytuł = re.sub(r'\..*$','', re.sub(r'^.*/','', filenames[0]))
print('tytuł',tytuł)
if len(argumenty) == 1:
    print("2D")
    fig = plt.figure()
    ax = plt.gca()
    ax.set_title(tytuł)
    #ax.set_yscale('log')
    x = adf[argumenty[0]].to_numpy()
    for s in serie:
        y = adf[s].to_numpy()
        print('x:',x)
        print('y:',y)
        ax.scatter(x,y,marker='.',s=None, alpha=0.5, label=s)
    ax.set_xlabel(argumenty[0])
    ax.legend()
    plt.savefig(outfile+'.png')
    #plt.show()
elif len(argumenty) == 2:
    print("3D")
    fig = plt.figure()
    ax = fig.add_subplot(projection='3d')
    ax.set_title(tytuł)
    x = adf[argumenty[0]].to_numpy()
    y = adf[argumenty[1]].to_numpy()
    for s in serie:
        z = adf[s].to_numpy()
        print('x:',x)
        print('y:',y)
        print('z:',x)
        ax.scatter(x, y, z)
    ax.set_xlabel(argumenty[0])
    ax.set_ylabel(argumenty[1])
    ax.set_zlabel('f')
    plt.savefig(outfile+'.png')
    #plt.show()
else:
    print("DLA OSI W LICZBIĘ ",len(argumenty)," NIE POTRAFIE NARYSOWAĆ WYKRESU.")
print(outfile)
