package eccezione;

import java.io.PrintStream;
import java.io.PrintWriter;

public class CorsoJavaException extends Throwable{

    /*Il serialVersionUID si genera da IDE*/
    private static final long serialVersionUID = 181090653271288169L;

    /*Fare override di tutti i metodi della classe Throwable*/
    /*Per il nostro esempio, effettuiamo modifiche nel metodo
    * getMessage()*/

    public CorsoJavaException() {
        super();
    }

    public CorsoJavaException(String message) {
        super(message);
    }

    public CorsoJavaException(String message, Throwable cause) {
        super(message, cause);
    }

    public CorsoJavaException(Throwable cause) {
        super(cause);
    }

    protected CorsoJavaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        /*return super.getMessage()*/;
        return "ATTENZIONE: nel progetto Corso_JAVA_EE si e' verificato un errore!!!";
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }
}
