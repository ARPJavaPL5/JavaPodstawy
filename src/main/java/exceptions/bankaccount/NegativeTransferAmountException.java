package exceptions.bankaccount;

public class NegativeTransferAmountException extends Exception {
    public NegativeTransferAmountException(String message) {
        super(message);
    }
}
