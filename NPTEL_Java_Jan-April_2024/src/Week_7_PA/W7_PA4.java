package Week_7_PA;

import java.util.Scanner;

interface Shape1 {
    double calculateArea();
}

class Circle1 implements Shape1{
    private double radius; 
  
    public Circle1(double circleRadius){
    
    this.radius = circleRadius;
    
    }  
  
    @Override
    public double calculateArea(){
    
    	return radius * radius * Math.PI;    
    }    
}

// TODO: Create another class "Rectangle" that implements the "Shape" interface and provides its own implementation for calculateArea().
class Rectangle implements Shape1{
    private double length;
    private double width;
  
    public Rectangle( double rectangleLength, double rectangleWidth){
    
    this.length = rectangleLength;
    
    this.width = rectangleWidth;
    
    }
  
    @Override
    public double calculateArea(){
    	
    	return length * width;   
    }  
}

public class W7_PA4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test the Circle class
        // System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle1 circle = new Circle1(circleRadius);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Test the Rectangle class
        // System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        // System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.print("Rectangle Area: " + rectangle.calculateArea());

        scanner.close();
    }
}