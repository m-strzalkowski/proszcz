find . -type d \( -path ./ms/parser -o -path ./ms/gp/parser \) -prune -o -name '*.java' -print | xargs wc -l