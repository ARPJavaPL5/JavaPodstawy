package exceptions.bankaccount;

public class MobileBankProgram {

    public static void main(String[] args) {

        AccountTransactionService accountTransactionService
                = new AccountTransactionService();

        try {
            transfer(accountTransactionService, "", -100);
        } catch (NegativeTransferAmountException e) {
            e.getMessage();
        } catch (AccountNotFoundException e) {
            e.getMessage();
        } catch (Exception e) {
            System.err.println("");
            System.err.println("****************************************");
            System.err.println("****** LOG *****************************");
            System.err.println("****************************************");
            System.err.println(e.getMessage());
            System.err.println("Account number: " + "132445354345");
            if (e.getCause() != null) {
                System.err.println(" caused by " + e.getCause());
            }
            e.printStackTrace(System.err);
        } finally {

        }
    }

    private static void transfer(AccountTransactionService accountTransactionService,
                                 String accountNumber,
                                 int amount) throws NegativeTransferAmountException, AccountNotFoundException {
        accountTransactionService.transferTo(accountNumber, amount);
    }
}
