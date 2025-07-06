package Day3_FinalKeyWord;

public class BankAccountSystem {
static String bankName="State Bank Of India";
String accountHolderName ;
 final int ACCOUNT_NUMBER;
 static int totalAccounts = 0;

BankAccountSystem(String accountHolderName,int accountNumber ){
	this.accountHolderName=accountHolderName;
	this.ACCOUNT_NUMBER=accountNumber;
	totalAccounts++;
	 
}

public static int getTotalAccounts()
{
	return totalAccounts;
}

public void displayAccountDetails() {
  
    if (this instanceof BankAccountSystem) {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + ACCOUNT_NUMBER);
    } else {
        System.out.println("Invalid account object.");
    }
}

public static void main(String[] args) {
	BankAccountSystem acc1 = new BankAccountSystem("spriha", 1001);
	BankAccountSystem acc2 = new BankAccountSystem("Singh", 1002);

    acc1.displayAccountDetails();
    System.out.println();

    acc2.displayAccountDetails();
    System.out.println();

    System.out.println("Total Bank Accounts: " + BankAccountSystem.getTotalAccounts());
}




}
