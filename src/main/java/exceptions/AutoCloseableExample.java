package exceptions;

public class AutoCloseableExample implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Close from AutoCloseableExample");
    }
}
