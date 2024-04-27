public class NOMATCHEXCP extends Exception{
    public NOMATCHEXCP(int lineNumber, String input) {
        super("Error at line " + lineNumber + ": Input '" + input + "' does not match 'India'");
    }
}
