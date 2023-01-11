    public static ParseTree parsingProgramu(String tekstProgramu)
    {
        //1.Analiza leksykalna
        proszczLexer lexer = new proszczLexer(CharStreams.fromString(tekstProgramu));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //2.analiza syntaktyczna
        proszczParser parser = new proszczParser(tokens);
        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();
        parser.addErrorListener(syntaxErrorListener);
        ParseTree tree = parser.program(); // parse; start at prog <label id="code.tour.main.6"/>
        int nume = syntaxErrorListener.getNumberOfErrors();
        if (nume > 0) {
            System.err.println("THERE "+(nume>1?"WERE":"WAS")+" DETECTED " + nume + " SYNTAX ERROR"+(nume>1?"S":"")+". Analysis will not proceed.\n");
            System.err.println("incomplete tree:");
            System.err.println(tree.toStringTree(parser));
            return null;
        }
//        System.err.println(syntaxErrorListener.getNumberOfErrors());
//        System.err.println("|"+tekstProgramu+"|");
        //System.out.println("AST:"+tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
        return tree;
    }

    @Override
    public void wykonaj_tekst(String tekst) {
        ParseTree ptree = parsingProgramu(tekst);
        if(ptree==null){return;}//parsowanie sie ne powiodło
        proszczVisitor<Węzeł> konstruktorProgramów = new KonstruktorProgramów(this,Środowisko.domyślny_podawacz);
        konstruktorProgramów.visit(ptree);
    }