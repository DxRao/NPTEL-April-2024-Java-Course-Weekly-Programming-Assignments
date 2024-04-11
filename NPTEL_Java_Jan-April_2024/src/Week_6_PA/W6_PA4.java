package Week_6_PA;

import java.util.Scanner;
public class W6_PA4{     
  
    public static void main(String[] args) 
    {
        double sum = 0.0;
        double standardDeviation = 0.0;
        double mean = 0.0;
        double res = 0.0;
        double sq = 0.0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double arr[] = new double[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextDouble();
        }
        // write code to find standard deviation of input array		
    
        for (double i : arr) {
      
        	sum += i;
        }
    
        int length = arr.length;
        mean = sum / length;    
    
        for (double number : arr){
      
        	standardDeviation += Math.pow(number - mean, 2);
        }

        res = Math.sqrt(standardDeviation / length);

        System.out.print("Standard Deviation: " + res);
    }
}