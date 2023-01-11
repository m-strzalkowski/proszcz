package ms.bledy.wykonania;

import ms.bledy.ZdarzenieWykonania;
import ms.drzewo.Węzeł;

public class ZlyWezel extends ZdarzenieWykonania {

    public ZlyWezel(Węzeł offendingSymbol, String msg) {
        super(Level.FATAL, offendingSymbol, "MALFORMED NODE"+msg);
    }
    public ZlyWezel(Level severity, Object offendingSymbol, int line, int charPositionInLine, String msg) {
        super(severity, offendingSymbol, line, charPositionInLine, msg);
    }
}
