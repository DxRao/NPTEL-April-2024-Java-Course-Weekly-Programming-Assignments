package Week_7_PA;

import java.util.Scanner;

class BankAccount {
    private double balance;


	public BankAccount(double balance){
      
      this.balance = balance;     
    }

	public void deposit(double depositAmount){
      
      balance = balance + depositAmount;     
    }

	public void withdraw(double withdrawAmount ){
      
      if(balance < withdrawAmount){
        
        System.out.println("Insufficient funds!");
      }      
      
      if(balance >= withdrawAmount){
        
        balance = balance - withdrawAmount;        
      }       
    }    
	public double getBalance(){
      
      return balance;   
    } 
} 
  
public class W7_PA2{  
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        // System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.print("Balance: " + account.getBalance());

        scanner.close();
    }
}