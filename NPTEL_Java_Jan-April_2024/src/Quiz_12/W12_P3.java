package Quiz_12;

import java.util.*;


public class W12_P3{  	
  
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
    
    //word_count = strarray.length;
    
    for(int i = 0; i < strarray.length; i++){
      
      word_count++;
      
      for(int j = 0; j < strarray[i].length(); j++){
        
        char ch = strarray[i].charAt(j);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
           ch == 'O' || ch == 'U'){
          
          vowel_count = vowel_count + 1;
        }
      } 
    }    

// This is where you will write the code:
// 1. Split the text into words using a suitable delimiter (e.g., space).
// 2. Initialize variables to store the word count, longest word, and vowel count.
// 3. Loop through each word:
//     - Update the word count.
//     - Check if the current word is longer than the current longest word and update if necessary.
//     - Count the vowels in the current word and add it to the total vowel count.
// 4. After the loop, print the calculated results (word count, longest word, vowel count).
  
          
    System.out.println("Number of words: " + word_count);
    
    System.out.println("Longest word: " + longest_word);
    
    System.out.print("Vowel count: " + vowel_count);
  
  } //end of static method  
  
  public static void main(String[] args) {
        
  	//Scanner scanner = new Scanner(System.in);
        
    //String string = scanner.nextLine();
  
    //scanner.close();
	  
	  String string = "but I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system and expound the actual teachings of the great explorer of the truth the master builder of human happiness";
    
    if(string != null && !string.isEmpty()){      

    processGivenString(string);
          
    }  		
  }
}// end of class