package ms.bledy.wykonania;

import ms.bledy.ZdarzenieWykonania;
import ms.drzewo.Węzeł;

public class NieznanaNazwa extends ZdarzenieWykonania {
    public NieznanaNazwa(Węzeł w, String msg) {
        super(w, "NIEZNANA NAZWA:"+msg);
    }
}
