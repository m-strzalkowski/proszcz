import os
import numpy as np
from math import sin, cos,tan,log,pi
import re
f1 = lambda x :5*x**3-2**2+3*x-17
v = [
    #           funkcja         ,ilość prób for t in [kolejne przedziały dziedzin kubicznych]
    *[(lambda x :5*x**3-2**2+3*x-17, 300,t) for t in [(-10,10), (0,100), (-1,1), (-1000,1000)]],
    *[(lambda x :sin(x) + cos(x), 100,t) for t in [[-3.14, 3.14], [0,7], [0, 100], [-100, 100]]],
    *[(lambda x : 2* log(x+1) , 100,t) for t in [[0,4], [0, 9], [0,99], [0,999]]],
    *[(lambda x,y : x + 2*y, 500,t) for t in [[0, 1], [-10, 10], [0, 100], [-1000, 1000]]],
    *[(lambda x,y : sin(x/2) + 2*cos(x), 500,t) for t in [[-3.14, 3.14], [0,7], [0, 100], [-100, 100]]],
    *[(lambda x,y : x**2 + 3*x*y - 7*y + 1, 500,t) for t in [[-10, 10], [0,100], [-1, 1], [-1000, 1000]]],
    *[(lambda x,y,z :x+y+z, 5000,t) for t in [[-1,1]]],

    *[(lambda x :sin(x+pi/2), 100,t) for t in [[-pi/2,pi*3/2]]],
    *[(lambda x :tan(2*x+1), 100,t) for t in [[-1,pi/4-0.5]]]
    #*[(lambda x :, "4",t) for t in []],
     ]
def turbonest(x:list, n:int):
    if n <= 1:
        return [(t,) for t in x]
    przody = turbonest(x,n-1)
    wyn = list()
    for p in przody:
        for t in x:
            wyn.append((*p,t))
    return wyn
    #return [(w,t) for t in w]
from inspect import signature, getsource
#lines = getsource(l)

def piszplik(arg):
    (funkcja, ileprob,(amin,amax)) = arg
    ilearg = len(signature(funkcja).parameters)
    kodfunkcji = re.search(r"lambda(.*:[^,]*),",getsource(funkcja)).group(1).replace(" ", '').replace("*", "X").replace("/",";").replace(":", "=")
    print(kodfunkcji)
    fname = kodfunkcji + str([amin,amax]).replace(' ','')+".dat"
    fp = open(fname, "w")
    fp.write(f"{ilearg} {100} {amin} {amax} {ileprob}")
    dl_baz_wektora = int(ileprob**(1.0/ilearg))
    ileprob = dl_baz_wektora**ilearg
    print(f"dl_wektora:{dl_baz_wektora}, ilosc prób:{ileprob}")
    pkt = [p for p in np.linspace(amin, amax, dl_baz_wektora)]
    for argumenty in turbonest(pkt,ilearg):
        fp.write("\n")
        for arg in argumenty:
            fp.write(f"{arg} ")
        fp.write(f"{funkcja(*argumenty)}")
    fp.close()

for elm in v:
    piszplik(elm)
