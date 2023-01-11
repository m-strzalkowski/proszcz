package ms.bledy.wykonania;

import ms.bledy.ZdarzenieWykonania;
import ms.drzewo.Węzeł;

public class BłądAlokacji extends ZdarzenieWykonania {
    public BłądAlokacji(Węzeł w, String msg) {
        super(w, "BŁĄD ALOKACJI:"+msg);
    }
}
