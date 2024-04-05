package com.bank;

public class BankAccount {

        private int accountNumber;
        private String accountHolderName;
        private double accountBalance = 0.0;

    // Constructor
        public BankAccount(int accountNumber, String accountHolderName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0.0;
    }
    public BankAccount(){

    }
    // Method to deposit money
    public void deposit(double amount){
        accountBalance += amount;
        System.out.println("Deposited : " + amount);
        System.out.println("Current Balance : " + accountBalance);
    }
    // Method to withdraw money.
    public void withdraw(double amount){
            if(amount <= accountBalance){
                accountBalance -= amount;
                System.out.println("Enter amount to withdraw : " + amount);
                System.out.println("Current Balance : " + accountBalance);
            } else
                System.out.println("Insufficient Funds for withdrawal.");
    }
    // Method to get current balance.
    public double getBalance(){
            return accountBalance;
    }

    // Getter to get accountHolderName
    public String getAccountHolderName(){
            return accountHolderName;
    }
    // Method to represent BankAccount object as a string
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + accountBalance +
                '}';
    }
    
    public static void main(String[] args) {
            BankAccount account = new BankAccount();
            account.deposit(10000);
            account.withdraw(5000);
            account.withdraw(60000);

        System.out.println("Account Details : ");
        System.out.println(account);

    }
}
