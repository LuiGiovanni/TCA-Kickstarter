import java.util.Random;

public class BankAccounts extends Bank{
    Random rand = new Random();
    public int money;
    public int bankNumber;
    public String accountType;
    public double balance;
    public double creditLimit;
    public int accountLevel;

    public BankAccounts(String accountType, int accountLevel){
        super(accountType,accountLevel);
        this.accountType = accountType;

        if(accountType == "Debit"){
            bankNumber = rand.nextInt(200000) + 100000;
            balance = 0;
        }else if(accountType == "Credit"){
            bankNumber = rand.nextInt(200000) + 100000;
            creditLimit = 1000 * accountLevel;
        }
        
    }

    public void addFunds(int money){
        balance
    }

    
}