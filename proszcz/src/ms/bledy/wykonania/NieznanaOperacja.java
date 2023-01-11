package ms.bledy.wykonania;

import ms.bledy.ZdarzenieWykonania;
import ms.drzewo.Węzeł;

public class NieznanaOperacja extends ZdarzenieWykonania {
    public NieznanaOperacja(Węzeł w, String msg) {
        super(w, "NIEZNANA OPERACJA:"+msg);
    }
}
