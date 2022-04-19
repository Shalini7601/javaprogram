public class BankAccount {
	
private String accountNumber;
private String accountName;
private double balance;

	

	
public BankAccount(String accNumber, String accName) {
accountNumber = accNumber;
accountName = accName;
balance = 0;
}

	
public String getAccountName() {
return accountName;
}

	
public String getAccountNumber() {
return accountNumber;
}

	
public double getBalance() {
return balance;
}

public static void main(String args[]){

public boolean deposit(double amount) {
if (amount > 0) {
balance = balance + amount;
return true;
} 
else {
return false;
}
}

	
public boolean withdraw(double amount) {
if (amount > balance) {
return false;
} 
else {
balance = balance - amount;
return true;
}
}
public class CheckingAccount extends BankAccount {
private int transactionCount;
private static final int NUM_FREE = 3;
private static final double TRANS_FEE = 2.0;
public CheckingAccount(String accNumber, String accName) {
super(accNumber, accName);
transactionCount = 0;
public boolean deposit(double amount) {
if (super.deposit(amount)) {
transactionCount++;
return true;
}
return false;
}
	
public boolean withdraw(double amount) {
if (super.withdraw(amount)) {
transactionCount++;
return true;
}
return false;
}
public void deductFees() {
if (transactionCount > NUM_FREE) {
double fees = TRANS_FEE * (transactionCount - NUM_FREE);
if (super.withdraw(fees)) {
transactionCount = 0;
}
}
}

}
}