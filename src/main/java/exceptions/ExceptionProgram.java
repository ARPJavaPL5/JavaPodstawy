package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionProgram {
    public static void main(String[] args) {

        int i = 12;
        int j = 2;

        try {

            // praca, którą chcemy wykonać
            int result = i / (j - 2);
            System.out.println(result);

        } catch (ArithmeticException ex) {

        } catch (Exception ex) {

            // obsługa potencjalnego błędu, który
            // wystąpił w trakcie pracy
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            cleanUp();
        }

        System.out.println("KONIEC");

        // readFile();

        try (AutoCloseableExample a = new AutoCloseableExample();
            AutoCloseableExample b = new AutoCloseableExample();
            AutoCloseableExample c = new AutoCloseableExample()) {
            int aa = 1/0;
            System.out.println("try");
        } catch (Exception ex) {
            System.out.println("exception");
        }
    }

    private static void cleanUp() {
        // czyszczenie danych
        System.out.println("clean up");
    }

    // obsługa plików
    private static void readFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("filename"));
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        finally {
            try {
                System.out.println("Closing file");
                if (reader != null) {
                    reader.close();
                };
            } catch (Exception ex) {
                System.out.println("Error closing file");
            }
        }
    }

    private static void readFile2() {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("filename"))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
