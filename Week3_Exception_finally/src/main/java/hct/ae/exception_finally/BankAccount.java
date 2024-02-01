/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hct.ae.exception_finally;

/**
 *We define a deposit method that allows you to deposit money into the account and a 
 * do error checks and provide feedback messages for successful and unsuccessful transactions.

* The finally block ensures that the balance is updated and transaction status is displayed after every operation,
* even in the presence of exceptions.


 * @author nlakhal
 */
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }
            balance += amount; //balance = balance+amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid deposit: " + e.getMessage());
        } finally {
            // This block ensures that the balance is updated even in case of exceptions
            System.out.println("Transaction completed. Current balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        // Perform some transactions on the same back account
    //    account.deposit(500.0);
        account.deposit(-100.0); // Invalid deposit
    }
}

