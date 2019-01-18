import java.util.Scanner; 
import java.util.Random;

public class Customers{
    public String name;
    public int numberOfAcc;
    public int aux;
    public int accountIndex1;
    public int accountIndex2;
    public int counter;
    public String account1;
    public String account2;
    public boolean atine;
    public int i;
    public BankAccounts b[] = new BankAccounts[10];
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public Customers(String name){
        this.name = name;
        numberOfAcc = 0;
        atine = false;
        counter = 0;
    }

    public String toString(){
        return "Client name: " + name + ", number of accounts: " + numberOfAcc;
    }
    
    public void createAcc(String accountType, int accountLevel){
        if(numberOfAcc == 10){
            System.out.println("Number of account limit reached");
        }else{
            b[0+numberOfAcc] = new BankAccounts(accountType, accountLevel);
            numberOfAcc++;
        }
    }

    // This method finds the index of a account number, making the finding of accounts easier
    public int findAccount(int bankNum){
        for(int i=0;i<numberOfAcc;i++){
            if(b[i].bankNumber == bankNum){
                aux = i;
            }
        }
        return aux;
    }

    public String getAccountType(int bankNum){
        accountIndex1 = findAccount(bankNum);
        return b[accountIndex1].accountType;
    }

    public double getBalance(int bankNum){
        accountIndex1 = findAccount(bankNum);
        return b[accountIndex1].balance;
    }

    public void printAccounts(){
        for(int i=0;i<numberOfAcc;i++){
            if(b[i].accountType == "Debit"){
                b[i].printDebit();
            }else{
                b[i].printCredit();
            }
        }
    }

    // These two methods, find a debit or credit account respectively and return it to main
    public int getDebitAccount(int count){
        counter = 0;
        do{
            for(i=0;i<numberOfAcc;i++){
                if(b[i].accountType == "Debit"){
                    counter++;
                    if(counter == count){
                        aux = b[i].bankNumber;
                        atine = true;
                        break;
                    }else{
                        atine = false;
                    }
                }
            }            
        }while(atine == false);
        return aux;
    }

    public int getCreditAccount(int count){
        counter = 0;
        do{
            for(i=0;i<numberOfAcc;i++){
                if(b[i].accountType == "Credit"){
                    counter++;
                    if(counter == count){
                        aux = b[i].bankNumber;
                        atine = true;
                        break;
                    }else{
                        atine = false;
                    }
                }
            }
        }while(atine == false);
        return aux;
    }

    // ****************************** Movements *******************************
    // These are movements made only in one singular account

    public void deposit(int bankNum, int money){
        accountIndex1 = findAccount(bankNum);
        if(b[accountIndex1].accountType == "Debit"){
            b[accountIndex1].depositFunds(money);
        }else{
            b[accountIndex1].payDebt(money);
        }
    }

    public void withdraw(int bankNum, int money){
        accountIndex1 = findAccount(bankNum);
        if(b[accountIndex1].accountType == "Debit"){
            b[accountIndex1].withdrawFunds(money);
        }else{
            b[accountIndex1].addDebt(money);
        }
    }

    public void transfer(int bankNum1, int bankNum2, int money){
        if(bankNum1 == bankNum2){
            System.out.println("Same account!!");
        }else{
            // Finding both of the accounts in the array
            accountIndex1 = findAccount(bankNum1);
            accountIndex2 = findAccount(bankNum2);

    // Considering each posible tranfer: Debit - Debit, Debit - Credit (And viceversa), Credit - Credit

            if(b[accountIndex1].accountType == "Debit" && b[accountIndex2].accountType == "Debit"){
                if((b[accountIndex1].balance - money) < 0){
                    System.out.println("Error: not enough funds in account");
                }else{
                    b[accountIndex1].withdrawFunds(money);
                    b[accountIndex2].depositFunds(money);
                }
            }else if(b[accountIndex1].accountType == "Credit" && b[accountIndex2].accountType == "Debit"){
                b[accountIndex1].addDebt(money);
                b[accountIndex2].depositFunds(money);
            }else if(b[accountIndex1].accountType == "Debit" && b[accountIndex2].accountType == "Credit"){
                if((b[accountIndex1].balance - money) < 0){
                    System.out.println("Error: not enough funds in account");
                }else{
                    b[accountIndex1].withdrawFunds(money);
                    b[accountIndex2].payDebt(money);
                }
            }else{
                if((b[accountIndex1].debt + money) > b[accountIndex1].creditLimit){
                    System.out.println("Error: credit limit will be exceeded with this transaction");
                }else{
                    b[accountIndex1].addDebt(money);
                    b[accountIndex2].payDebt(money);
                }
            }
        }

    }
}