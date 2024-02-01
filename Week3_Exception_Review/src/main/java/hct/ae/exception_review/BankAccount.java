/*
In this example, we have defined a custom exception called "InsufficientFundsException". 
This exception will be thrown when a user tries to withdraw an amount of money
that is greater than their available balance. 
The exception class has a constructor that takes the amount of money that was attempted
to be withdrawn, and a getter method that returns this value.
In this example, we have defined a simple bank account class that has a balance
and a method to withdraw money. If the amount being withdrawn is greater than the balance
, an instance of the "InsufficientFundsException" is thrown, 
indicating that the user does not have sufficient funds to complete the transaction.


 */
package hct.ae.exception_review;

/**
 *
 * @author nlakhal
 */
public class BankAccount {
   private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
   
   public BankAccount(double balance) {
      this.balance = balance;
   }
   
   public void withdraw(double amount) throws InsufficientFundsException  { //either ad it the exception in try catch or use throws
     //no need to hanlde it, propagate it to the caller
     //it's the responsibility of the calling code to catch and handle it.
       if (amount > balance) {
         throw new InsufficientFundsException(amount - balance);
      }
      balance -= amount;
   }
   
   public void withdraw_method2(double amount) { //using try catch block
    try {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount; //balance = balance - amount;
    } catch (InsufficientFundsException e) {
        // Handle the exception here, e.g., log the error or take appropriate action
        System.err.println("Insufficient funds: " + e.getMessage());
    }
}

   
   
   
}
