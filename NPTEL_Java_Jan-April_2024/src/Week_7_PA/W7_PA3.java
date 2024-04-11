package Week_7_PA;

import java.util.Scanner;

abstract class Shape {
    public abstract double area();

    public void displayInfo() {
        System.out.println("Shape - Area: " + area());
    }
}

final class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
}

@Override // Overriding a abstract method of a abstract class by implementing it in a derived class.
	public double area() {
    	return radius * radius * Math.PI;
	}

@Override
	public void displayInfo() { // Overriding a non-abstract method of a abstract class by giving a new body implementation.
        System.out.print("Circle - Radius: " + radius + ", Area: " + area());
	}
}
public class W7_PA3{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayInfo();

        scanner.close();
    }
}
