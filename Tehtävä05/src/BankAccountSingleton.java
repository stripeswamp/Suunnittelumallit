import java.util.UUID;
public class BankAccountSingleton {
    
    private static String accountNumber;
    private static BankAccountSingleton INSTANCE;
    private static float funds;
    
    private BankAccountSingleton() {
        BankAccountSingleton.accountNumber = UUID.randomUUID().toString();
        BankAccountSingleton.INSTANCE = null;
        BankAccountSingleton.funds = 0;
    }
    
    public static BankAccountSingleton getInstance() {
       
        if(BankAccountSingleton.INSTANCE == null)
        {
            BankAccountSingleton.INSTANCE = new BankAccountSingleton();
        }
        
        return BankAccountSingleton.INSTANCE;
    }
    
    public void addFunds(float inputValue)
    {
        BankAccountSingleton.funds += inputValue;
    }
    
    public void withdrawFunds(float inputValue)
    {
        BankAccountSingleton.funds -= inputValue;
    }
    
    public float getBalance()
    {
        return BankAccountSingleton.funds;
    }
    
    @Override
    public String toString()
    {
        return BankAccountSingleton.accountNumber;
    }
}
