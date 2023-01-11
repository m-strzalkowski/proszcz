#Proxy dla graphviza Jako argument pzyjmuje nazwę pliku
import graphviz
from sys import argv,stderr

if len(argv)!=2:
    stderr.write("\7Miałem dostać dokładnie jeden argument!\n")
    fname=input()
else:
    fname=argv[1]

dot = graphviz.Source.from_file(fname)
print(dot.source)
#doctest_mark_exe()
dot.render(fname, view=True, format='svg')
