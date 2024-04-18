package Week_12_PA;

import java.util.Scanner;

public class W12_PA2 {
// create a static function validatePassword() to validate the password and print 
//the messages as needed

static void validatePassword(String password){
  
  int flag = 0;
  
  if(password.length() >= 8){
    
    flag = 1;
    
    //System.out.println("Your password is valid.");
    
  }
  else{
    
    flag = 0;   
    
  }
  if(flag != 1){      
      
    System.out.println("Your password is invalid.");
    System.out.println("The password must be at least 8 characters long.");
    
    }
  else{
  
  
    for (int p = 0; p < password.length(); p++) {
    
      if(Character.isUpperCase(password.charAt(p)) ){
      
        flag = 1;
        break;
      }
      else{
      
       flag = 0; 
      
      }
    }//for
  
    if(flag != 1){      
      
      System.out.println("Your password is invalid.");
      System.out.print("The password must contain at least one uppercase letter (A-Z)."); 
    }
    else{  
    
      for (int p = 0; p < password.length(); p++) {
    
        if(Character.isLowerCase(password.charAt(p)) ){
      
          flag = 1; 
          break;
    
        }
        else{
      
          flag = 0;  
    
        }
      }//for    
    
    if(flag != 1){      
      
      System.out.println("Your password is invalid.");
      System.out.print("The password must contain at least one lowercase letter (a-z).");   
    }
    else{
  
      for (int p = 0; p < password.length(); p++) {
    
        if(Character.isDigit(password.charAt(p)) ){
      
           flag = 1;
           break;    
        }
        else{
      
          flag = 0;   
    
         }
      }//for    
    
         if(flag != 1){      
      
            System.out.println("Your password is invalid.");
            System.out.print("The password must contain at least one digit (0-9).");    
         }
       }//else
     }//else
   } //else
  
  if(flag == 1){
    System.out.print("Your password is valid.");
  }  
}
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        validatePassword(password);
    }
}
