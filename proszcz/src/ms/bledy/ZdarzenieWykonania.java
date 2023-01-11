package ms.bledy;

import ms.drzewo.Węzeł;

public class ZdarzenieWykonania extends SemanticOccurence {
    public ZdarzenieWykonania(Level severity, Object offendingSymbol, int line, int charPositionInLine, String msg) {
        super(severity, offendingSymbol, line, charPositionInLine, msg);
    }
    public ZdarzenieWykonania(Węzeł w, String msg) {
        super(Level.ERROR, w, w!=null?(w.start!=null?w.start.getLine():-1):-1, w!=null?(w.start!=null?w.start.getCharPositionInLine():-1):-1, msg);
    }
    public ZdarzenieWykonania(Level poziom, Węzeł w, String msg) {
        super(poziom, w,  w!=null?(w.start!=null?w.start.getLine():-1):-1, w!=null?(w.start!=null?w.start.getCharPositionInLine():-1):-1, msg);
    }

}
