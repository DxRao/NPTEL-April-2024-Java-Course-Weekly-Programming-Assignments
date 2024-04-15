package Week_10_PA;

import java.util.Scanner;

class PrintNumbers implements Runnable {
	//Create a constructor of this class that takes two private parameters (start and end) and 
	//initializes the instance variables with the provided values.
	//Create Run() method

	int start;
	int end;

	public PrintNumbers(int start, int end){
  
		this.start = start;
		this.end = end;  
	}

	@Override
	public void run(){
  
		if(Thread.currentThread().getName() == "OddThread"){
    
			Thread.yield();
    
			for( int i = start; i <= end; i++){
      
				if((i % 2) != 0){
        
					System.out.println("OddThread: " + i);        
				}      
			}    
		}
     
		if(Thread.currentThread().getName() == "EvenThread"){    
    
			for( int i = start; i <= end; i++){
      
				if((i % 2) == 0){
        
					System.out.println("EvenThread: " + i);
        
				}
      
			}
    
		}  
  
	}
}
public class W10_PA3{
    
	//Code to create two threads, one printing even numbers and the other printing odd numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the starting value for even numbers: ");
        int evenStart = scanner.nextInt();
       // System.out.print("Enter the ending value for even numbers: ");
        int evenEnd = scanner.nextInt();

       // System.out.print("Enter the starting value for odd numbers: ");
        int oddStart = scanner.nextInt();
       // System.out.print("Enter the ending value for odd numbers: ");
        int oddEnd = scanner.nextInt();

        Thread evenThread = new Thread(new PrintNumbers(evenStart, evenEnd), "EvenThread");
        Thread oddThread = new Thread(new PrintNumbers(oddStart, oddEnd), "OddThread");

        evenThread.start();
        
        try {
        	
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) {
            
        	e.printStackTrace();
        }
        
        oddThread.start();

        scanner.close();
    }
}