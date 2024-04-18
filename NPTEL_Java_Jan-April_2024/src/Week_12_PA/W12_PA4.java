package Week_12_PA;

import java.util.Scanner;

abstract class Shape {
    protected abstract void calcArea();
    public abstract void printArea();
}
// Implement 3 classes here:
class Circle extends Shape {
  
  private String shapeType;
  private double area;
  private double radius;
  
  public Circle(String shapeType, double radius){
    
    this.shapeType = shapeType;    
    this.radius = radius;    
  }  
  public void calcArea(){
    
    area = Math.PI * (radius * radius);
    
  }
  
  public void printArea(){
    
    System.out.print("Area of Circle: " + area);
    
  }
}
class Rectangle extends Shape {
  
  private String shapeType;
  private double area;
  private double width;
  private double height;
  
  public Rectangle(String shapeType, double width, double height){
    
    this.shapeType = shapeType;
    this.width = width;
    this.height = height;    
  }
  
  public void calcArea(){
    
    area = width * height;
    
  }
  
  public void printArea(){
    
    System.out.print("Area of Rectangle: " + area);
    
  }
}
class Square extends Shape {
  
  private String shapeType;
  private double area;
  private double sides;
  
  public Square(String shapeType, double sides){
    
    this.shapeType = shapeType;    
    this.sides = sides; 
  }
  public void calcArea(){
    
    area = sides * sides;
    
  }
  
  public void printArea(){
    
    System.out.print("Area of Square: " + area);
    
  }
}
public class W12_PA4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter shape type (Circle, Rectangle or Square): ");
        String shapeType = scanner.nextLine();
        // System.out.print("Enter first dimension: ");
        double arg1 = scanner.nextDouble();
        Shape shape = null;
        if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle(shapeType, arg1);
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            double arg2 = scanner.nextDouble();
            shape = new Rectangle(shapeType, arg1, arg2);
        } else if (shapeType.equalsIgnoreCase("Square")) {
            shape = new Square(shapeType, arg1);
        } else {
            System.out.println("Invalid shape type");
            scanner.close();
            return;
        }
        shape.calcArea();
        shape.printArea();
        scanner.close();
    }
}