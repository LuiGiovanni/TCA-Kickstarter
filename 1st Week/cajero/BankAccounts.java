import java.util.Random;

//import com.sun.org.apache.xpath.internal.SourceTree;

public class BankAccounts{
    Random rand = new Random();
    public int money;
    public int bankNumber;
    public String accountType;
    public double balance;
    public double creditLimit;
    public int accountLevel;
    public double debt;

    public BankAccounts(String accountType, int accountLevel){
        this.accountType = accountType;
        this.accountLevel = accountLevel;

        if(accountType == "Debit"){
            bankNumber = rand.nextInt(200000) + 100000;
            balance = 0;
        }else if(accountType == "Credit"){
            bankNumber = rand.nextInt(200000) + 100000;
            creditLimit = 1000 * accountLevel;
            debt = 0;
        }
    }

    public void depositFunds(int money){
        balance = balance + money;
    }

    public void withdrawFunds(int money){
        if((balance - money) < 0){
            System.out.println("Error: insufficient funds.");
        }else{
            balance = balance - money;
        }
    }

    public void addDebt(int money){
        if((debt + money) > creditLimit){
            System.out.println("Error: Credit limit exceeded");
        }else{
            debt = debt + money;
        }
    }

    public void payDebt(int money){
        debt = debt - money;
    }

    public void printDebit(){
        System.out.println("Account: " + bankNumber + ", balance: " + balance + ", Account type: " + accountType);
        /*if(accountType == "Credit"){
             balance = creditLimit;
        }
        return "Account: " + bankNumber + ", balance: " + balance + ", Account type: " + accountType;*/
    }

    public void printCredit(){
        System.out.println("Account: " + bankNumber + ", Credit limit: " + creditLimit + ", Account type: " + accountType + ", Debt: " + debt);
    }
    
}