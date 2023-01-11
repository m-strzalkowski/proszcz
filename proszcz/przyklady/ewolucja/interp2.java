    public static ParseTree parsingProgramu(String tekstProgramu, Class LexerClass,Class ParserClass, String symbol_startowy)
    {
        //1.Analiza leksykalna
        //proszczLexer lexer = new proszczLexer(CharStreams.fromString(tekstProgramu));
        Constructor<?> cons = LexerClass.getConstructor(CharStreams.class);
        Lexer lexer = cons.newInstance(CharStreams.fromString(tekstProgramu));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //2.analiza syntaktyczna
        //proszczParser parser = new proszczParser(tokens);
        Constructor<?> consp = ParserClass.getConstructor(CharStreams.class);
        Parser parser = consp.newInstance(tokens);
        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();
        parser.addErrorListener(syntaxErrorListener);
        //ParseTree tree = parser.program(); // parse; start at prog <label id="code.tour.main.6"/>
        java.lang.reflect.Method method;
        try {
            //obj.getClass()
        var method = ParserClass.getMethod(symbol_startowy)//, param1.class, param2.class, ..);
        } catch (SecurityException e) { ... }
        catch (NoSuchMethodException e) { ... }
        try {
            method.invoke(parser);
        //method.invoke(obj, arg1, arg2,...);
        } catch (IllegalArgumentException e) { ... }
        catch (IllegalAccessException e) { ... }
        catch (InvocationTargetException e) { ... }
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
        //ParseTree ptree = parsingProgramu(tekst);
        ParseTree ptree = parsingProgramu(tekst,proszczLexer.class, proszczParser.class, "program");
        if(ptree==null){return;}//parsowanie sie ne powiodło
        proszczVisitor<Węzeł> konstruktorProgramów = new KonstruktorProgramów(this,Środowisko.domyślny_podawacz);
        konstruktorProgramów.visit(ptree);
    }