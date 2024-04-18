package Week_12_PA;

import java.util.Scanner;
interface Vehicle {
    void start();
    void accelerate();
    void brake();
}
// Implement two classes, Car and Bike, that implement the Vehicle interface. 

class Car implements Vehicle{
  
  int doors;
  
  public Car(int doors){
    
    this.doors = doors;  
  }
  
  public void start(){
    
    System.out.println("Car with " + doors + " doors started");
    
  }
  public void accelerate(){
    
    System.out.println("Accelerating to 60 mph");
    
    
  }
  public void brake(){
    
    System.out.print("Applying brakes");
    
  }
}


class Bike implements Vehicle{
  
  int wheels;
  
  public Bike(int wheels){
    
    this.wheels = wheels;  
  }
  
  public void start(){
    
    System.out.println("Bike with " + wheels + " wheels started");
    
  }
  public void accelerate(){
    
    System.out.println("Accelerating to 40 mph");
    
    
  }
  public void brake(){
    
    System.out.print("Applying brakes");
    
  }
  
  
}


public class W12_PA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();

        // Fixed code: Prefix
        Vehicle vehicle = null;
        switch (vehicleType) {
            case "Car":
                int numDoors = scanner.nextInt();
                vehicle = new Car(numDoors);
                break;
            case "Bike":
                int numWheels = scanner.nextInt();
                vehicle = new Bike(numWheels);
                break;
            default:
                System.out.println("Invalid vehicle type");
                scanner.close();
                System.exit(1);
        }
        if (vehicle != null) {
            vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
        }
        scanner.close();
    }

}