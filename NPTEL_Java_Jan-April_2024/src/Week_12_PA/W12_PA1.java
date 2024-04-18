package Week_12_PA;

import java.util.Scanner;

public class W12_PA1 {
// Create a static function calculateGrade() to calculate the grade as needed and 
//return to main() where it will automatically get printed

	static char calculateGrade(int score){
  
		if (score >= 80){
    
			return 'A'; 
    
		}
		else if(score >= 70){
    
			return 'B';
    
		}
		else if(score >= 60){
    
			return 'C';
    
		}
		else if(score >= 50){
    
			return 'D';
    
		}
		else if(score >= 40){
    
			return 'P';
    
		}
		else{
    
			return 'F';
    
		}  
  
}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the numerical score: ");
        int score = scanner.nextInt();
        scanner.close();
        // If score is greater than 100 or less than 0, print "Invalid Input"
        if (score > 100 || score < 0) {
            System.out.println("Invalid Input");
            return;
        }
        char grade = calculateGrade(score);
        System.out.println("Grade: " + grade);
    }
}