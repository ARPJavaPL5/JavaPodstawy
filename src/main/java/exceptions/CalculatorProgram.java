package exceptions;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // [operacja= + - * /][liczba1][liczba2]

        String inputString = "";
        while (!inputString.equals("Q")) {
            System.out.println("Wprowadź trzy informacje: operator arytmetyczny, liczba 1 i liczba 2");
            System.out.println("Wprowadź Q by zakończyć");
            inputString = scanner.nextLine();
            String[] parts = inputString.split("\\s+");

            try {
                performOperation(parts);
            } catch (InvalidStatementException e) {
                // dla użytkownika końcowego to jest ok
                System.out.println(e.getMessage());

                // dla zespołu programistów
                // 1. message
                // 2. inputString
                // 3. cause (jeśli występuje)
                // 4. stos wywołań
            }
        }
    }

    private static void performOperation(String[] parts) throws InvalidStatementException {
        if (parts.length != 3) {
//            InvalidStatementException exception
//                    = new InvalidStatementException(
//                            "Statement must have 3 parts: operation, left value and right value"
//            );
//
//            exception.initCause(new Exception("cause..."));
            throw new InvalidStatementException(
                    "Statement must have 3 parts: operation, left value and right value",
                    new Exception("cause..."));

//            throw exception;
        }

        String operator = parts[0];
        switch (operator) {
            case "+":
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
            default:
                throw new InvalidStatementException(
                        "Unsupported operator " + operator);
        }
    }
}
