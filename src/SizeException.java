import java.io.PrintStream;

/**
 * Created by SLASH on 20/10/2017.
 */
public class SizeException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
        System.out.println("Les vecteurs sont de tailles differentes !!");
    }
}
