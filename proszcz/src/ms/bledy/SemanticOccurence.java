package ms.bledy;

import org.antlr.v4.runtime.Token;

public class SemanticOccurence extends RuntimeException
{

    public enum Level {

        DEBUG(-1),
        INFO(0),
        WARN(1),
        ERROR(2),
        FATAL(3);

        private final Integer severity;

        Level(int severity) {
            this.severity = severity;
        }

        public boolean isWorseThan(Level other) {
            return this.severity > other.severity;
        }
        public boolean worseOrEqual(Level other) {
            return this.severity >= other.severity;
        }
        public String nazwapolska(){
            return switch (severity) {
                case -1 -> "DEBUG INFO";
                case 0 -> "INFORMACJA";
                case 1 -> "OSTRZEŻENIE";
                case 2 -> "BŁĄD";
                case 3 -> "FATALNY BŁĄD";
                default -> "?";
            };
        }
        public static Level zNapisu(String napis, Level domyślny)
        {
            return switch (napis) {
                case "debug", "debug info" -> Level.DEBUG;
                case "informacja", "info" -> Level.INFO;
                case "ostrzezenie", "ostrzeżenie" -> Level.WARN;
                case "blad", "błąd" -> Level.ERROR;
                case "fatal", "fatalny błąd", "fatalny blad" -> Level.FATAL;
                default -> domyślny;
            };
        }
    }

    private final Level severity;
    private final Object offendingSymbol;
    private final int line;
    private final int charPositionInLine;
    private final String message;


    public SemanticOccurence(Level severity, Object offendingSymbol, int line, int charPositionInLine, String msg)
    {
        this.severity = severity;
        this.offendingSymbol = offendingSymbol;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
        this.message = msg;

    }
    public SemanticOccurence(Level severity, Token offendingSymbol, String msg)
    {
        this.severity = severity;
        this.offendingSymbol = offendingSymbol;
        this.line = offendingSymbol!=null?offendingSymbol.getLine():-1;
        this.charPositionInLine = offendingSymbol!=null?offendingSymbol.getCharPositionInLine():-1;
        this.message = msg;

    }

    @Override
    public String toString() {
        return  severity.nazwapolska() +
                //" na symbolu" + offendingSymbol +
                " na pozycji:" + line +
                "," + charPositionInLine +
                ": " + message ;
    }

    public Level getSeverity() {
        return severity;
    }

    public Object getOffendingSymbol()
    {
        return offendingSymbol;
    }

    public int getLine()
    {
        return line;
    }

    public int getCharPositionInLine()
    {
        return charPositionInLine;
    }

    public String getMessage()
    {
        return message;
    }

}