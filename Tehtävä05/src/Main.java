public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankAccountSingleton account = BankAccountSingleton.getInstance();
        System.out.println(account);
        System.out.println(account.getBalance());
        account.addFunds(100);
        account.withdrawFunds(50);
        System.out.println(account.getBalance());
                
        BankAccountSingleton account2 = BankAccountSingleton.getInstance();
         System.out.println(account2);
        System.out.println(account2.getBalance());
        account2.addFunds(100);
        account2.withdrawFunds(50);
        System.out.println(account2.getBalance());;
    }
}
