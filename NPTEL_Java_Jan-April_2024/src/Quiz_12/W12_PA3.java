package Quiz_12;

import java.util.Scanner;

public class W12_PA3{  	
  
  static void analyseString(String i_str){
    
    int w_count = 0;
    String l_word = "";
    int v_count = 0;    
    
    String[] strarr = i_str.split(" "); 
    
    w_count = strarr.length;
    
    l_word = strarr[0];
    
    for(int i = 1; i < strarr.length; i++){       
      
      if(l_word.length() < strarr[i].length() ){        
         
        l_word = strarr[i];        
      }       
    }    
    
    for(int i = 0; i < strarr.length; i++){      
      
      for(int j = 0; j < strarr[i].length(); j++){
        
        char ch = strarr[i].charAt(j);
        
        ch = Character.toLowerCase(ch);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          
        	v_count = v_count + 1;
        }
      } 
    } 
          
    System.out.println("Number of words: " + w_count);
    
    System.out.println("Longest word: " + l_word);
    
    System.out.print("Vowel count: " + v_count);
  
  } 
  
  public static void main(String[] args) {
        
  	Scanner scanner = new Scanner(System.in);
        
    String i_str = scanner.nextLine();
  
    scanner.close();           

    analyseString(i_str);      		
  }
}

/*

input string: qdqd piei qkdqkdlllddl I dd ueoipep I rororlml ipqip

Sample output from the program:

Number of words: 9
Longest word: qkdqkdlllddl
Vowel count: 14

*/