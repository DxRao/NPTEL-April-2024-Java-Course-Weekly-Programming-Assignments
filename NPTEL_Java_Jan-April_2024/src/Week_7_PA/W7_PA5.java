package Week_7_PA;

import java.util.Scanner;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}
// TODO: Create a class "FlyingFish" that implements both "Flyable" and "Swimmable" interfaces.

class FlyingFish implements Flyable, Swimmable{
  
  private String fishName;
  
  public FlyingFish(String fishName){
    
    this.fishName = fishName;
    
  }
  
  public void fly(){
    
    System.out.println( fishName + " can glide through the air");    
    
  }
  
  public void swim(){
    
    System.out.print( fishName + " can swim in water");    
    
  }  
  
}
public class W7_PA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the name of the fish: ");
        String fishName = scanner.nextLine();

        FlyingFish flyingFish = new FlyingFish(fishName);

        // Test the FlyingFish class
        flyingFish.fly();
        flyingFish.swim();

        scanner.close();
    }
}