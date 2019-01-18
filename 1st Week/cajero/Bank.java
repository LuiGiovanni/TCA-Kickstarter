public class Bank{

    public static void accountTransfer(Customers a, Customers b, int account1, int account2, int money){
        if(a == b){
            System.out.println("Same Customer!");
        }else{
            if(a.getAccountType(account1) == "Debit" && b.getAccountType(account2) == "Debit"){
                if((a.getBalance(account1) - money) < 0){
                    System.out.println("Error: not enough funds in account");
                }else{
                    a.withdraw(account1, money);
                    b.deposit(account2, money);
                }
            }else if(a.getAccountType(account1) == "Credit" && b.getAccountType(account2) == "Debit"){
                a.withdraw(account1, money);
                b.deposit(account2, money);
            }else if(a.getAccountType(account1) == "Debit" && b.getAccountType(account2) == "Credit"){
                if((a.getBalance(account1) - money) < 0){
                    System.out.println("Error: not enough funds in account");
                }else{
                    a.withdraw(account1, money);
                    b.deposit(account2, money);
                }
            }else{
                if(a.getAccountType(account1) == "Credit" && b.getAccountType(account2) == "Credit"){
                    System.out.println("Error: credit limit will be exceeded with this transaction");
                }else{
                    a.withdraw(account1, money);
                    b.deposit(account2, money);
                }
            }

        }
    }
    
    public static void main(String [] args){
        int bankNum1;
        int bankNum2;

        // Creating customers
        Customers c1 = new Customers("Giovanni");
        Customers c2 = new Customers("Miguel");
        Customers c3 = new Customers("Grecia");
        Customers c4 = new Customers("Melissa");

        // Printing customers
        System.out.println("Showing customers: ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("********************************************");

        // Creating a debit account for Giovanni
        System.out.println("Creating Giovanni a Debit account... ");
        c1.createAcc("Debit", 2);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Creating a credit account for Giovanni
        System.out.println("Creating Giovanni a Credit account... ");
        c1.createAcc("Credit", 2);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Making a deposit to Giovanni's debit account
        System.out.println("Making a deposit to Giovanni's debit account... ");
        bankNum1 = c1.getDebitAccount(1);
        c1.deposit(bankNum1, 2000);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Withdrawing from Giovanni's debit account
        System.out.println("Withdrawing from Giovanni's debit account... ");
        bankNum1 = c1.getDebitAccount(1);
        c1.withdraw(bankNum1, 150);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Adding debt to Giovanni's credit account, his credit limit is 2000
        System.out.println("Adding debt to Giovanni's credit account, his credit limit is 2000... ");
        bankNum1 = c1.getCreditAccount(1);
        c1.withdraw(bankNum1, 2000);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Let's try and add more debt, but we will fail since we've reached out limit
        System.out.println("Adding debt to Giovanni's credit account, but failing... ");
        bankNum1 = c1.getCreditAccount(1);
        c1.withdraw(bankNum1, 2000);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");
        
        // Let's pay part of our debt from Giovanni's credit card
        System.out.println("Paying debt with Giovanni's debt... ");
        bankNum1 = c1.getCreditAccount(1);
        c1.deposit(bankNum1, 150);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Now let's pay off the rest of the debt with out debit account
        System.out.println("Paying debt with Giovanni's debt with his debit account... ");
        bankNum1 = c1.getDebitAccount(1);
        bankNum2 = c1.getCreditAccount(1);
        c1.transfer(bankNum1, bankNum2, 1850);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Okay, now let's add funds to our debit card from our credit account
        System.out.println("Adding funds to Giovanni's debit account with his credit account... ");
        bankNum1 = c1.getCreditAccount(1);
        bankNum2 = c1.getDebitAccount(1);
        c1.transfer(bankNum1, bankNum2, 1850);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Let's create a second debit account
        System.out.println("Creating second debit account... ");
        c1.createAcc("Debit", 3);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Now let's transfer our money from our first debit account to the new one
        System.out.println("Transfering from our first debit account to the second... ");
        bankNum1 = c1.getDebitAccount(1);
        bankNum2 = c1.getDebitAccount(2);
        c1.transfer(bankNum1, bankNum2, 1850);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Let's do the same, but with two credit accounts, so first we create a new one
        System.out.println("Creating second credit account... ");
        c1.createAcc("Credit", 3);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Now we will use our new account to pay the debt of the old one
        System.out.println("Transfering from our first credit account to the second... ");
        bankNum1 = c1.getCreditAccount(2);
        bankNum2 = c1.getCreditAccount(1);
        c1.transfer(bankNum1, bankNum2, 1850);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");

        // Finally we will create Miguel an account, add some money and make a transfer to Giovanni
        System.out.println("Creating Miguel a debit account... ");
        c2.createAcc("Debit", 3);
        System.out.println(c2);
        c2.printAccounts();
        System.out.println("********************************************");

        // Adding some money
        System.out.println("Adding to Miguel's debit account... ");
        bankNum1 = c2.getDebitAccount(1);
        c2.deposit(bankNum1, 3000);
        System.out.println(c2);
        c2.printAccounts();
        System.out.println("********************************************");

        // Now let's make the transfer
        System.out.println("Transfer from Miguel's debit account to Giovanni's debit account... ");
        bankNum1 = c2.getDebitAccount(1);
        bankNum2 = c1.getDebitAccount(1);
        accountTransfer(c2,c1,bankNum1,bankNum2,1500);
        System.out.println(c1);
        c1.printAccounts();
        System.out.println("********************************************");
        System.out.println(c2);
        c2.printAccounts();
        System.out.println("********************************************");
        


    }

}