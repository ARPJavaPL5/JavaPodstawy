package exceptions.bankaccount;

public class AccountTransactionService {

    public void transferTo(String accountNumber, int amount) throws AccountNotFoundException, NegativeTransferAmountException {
        Object account = getAccount(accountNumber);
        if (amount <= 0) {
            throw new NegativeTransferAmountException(
                    "Wartość przelewu w kwocie " + amount + " jest niedozwolona");
        }

        // account.transfer(amount);
    }

    public Object getAccount(String accountNumber) throws AccountNotFoundException {

        if (accountNumber.equals("")) {
            throw new RuntimeException("coś poszło nie tak");
        }
        // logika do pobierania informacji o koncie z bazy danych
        //...
        // konto o takim numerze nie istnieje
        throw new AccountNotFoundException(
                "Konto o numerze " + accountNumber + " nie istnieje");
    }
}
