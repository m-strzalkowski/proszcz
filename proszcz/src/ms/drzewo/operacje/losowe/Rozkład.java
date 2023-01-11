package ms.drzewo.operacje.losowe;

import ms.bledy.SemanticOccurence;

public enum Rozkład {

    JEDNOSTAJNY(1),
    LOGARYTMICZNY(2);


    private final Integer t;

    Rozkład(int severity) {
        this.t = severity;
    }


    public String toString(){
        return switch (t) {
            case 1 -> "UNIFORM";
            case 2 -> "LOGARITHMIC";
            default -> "?";
        };
    }
    public static Rozkład zNapisu(String napis, Rozkład domyślny)
    {
        return switch (napis) {
            case "u","U", "uni", "uniform","UNIFORM" -> JEDNOSTAJNY;
            case "l","L", "log","logarithmic","LOGARITHMIC" -> LOGARYTMICZNY;
            default -> domyślny;
        };
    }

}
