package Week_12_PA;

import java.util.*;


public class W12_PA3{  	
  
  static void processGivenString(String string){
    
    int word_count = 0;
    String longest_word = "";
    int vowel_count = 0;
    
    string = string.replaceAll("[^a-zA-Z\\s+]", "");
    
    String[] strarray = string.trim().split(" ");    
    
    longest_word = strarray[0].trim();
    
    for(int i = 1; i < strarray.length; i++){      
      
      strarray[i] = strarray[i].trim();
      
      if(longest_word.length() < strarray[i].length() ){        
         
        longest_word = strarray[i];        
      }       
    }    
    
    
    for(int i = 0; i < strarray.length; i++){
      
      word_count++;
      
      for(int j = 0; j < strarray[i].length(); j++){
        
        char ch = strarray[i].charAt(j);
        ch = Character.toLowerCase(ch);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u'){
          
          vowel_count = vowel_count + 1;
        }
      } 
    } 

          
    System.out.println("Number of words: " + word_count);
    
    System.out.println("Longest word: " + longest_word);
    
    System.out.print("Vowel count: " + vowel_count);
  
  } //end of static method  
  
  public static void main(String[] args) {
        
  	Scanner scanner = new Scanner(System.in);
        
    String string = scanner.nextLine();
  
    scanner.close();	  
    
    if(string != null && !string.isEmpty()){      

    processGivenString(string);
          
    }  		
  }
}// end of class