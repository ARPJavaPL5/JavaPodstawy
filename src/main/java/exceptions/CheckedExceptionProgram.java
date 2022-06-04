package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionProgram {
    public static void main(String[] args) {
        method();
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        methodA();
    }

    private static void method() throws RuntimeException {

    }

    private static void method2() throws Exception {

    }

    private static void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void methodB() throws Exception {
        methodC();
    }

    private static void methodC() throws Exception {
        throw new Exception("method C exception details");
    }

    private void fileNotFound() throws FileNotFoundException {

    }

    private void io() throws IOException {
        fileNotFound();
    }
}
