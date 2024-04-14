package Week_9_PA;

	//Complete the code segment to define a class Point with parameter x,y and method distance()for calculating distance between two points.
	// Note: Pass objects of type class Point as argument in distance() method.

import java.util.Scanner;

class Point {
    
    private  double x;
	private  double y;    
	private double distance;    

	public Point(double x, double y) { 
    	this.x=x; 
    	this.y=y;
	}

	public double distance(Point p2) {
    	double dx = x - p2.x;
    	double dy = y - p2.y;
  		distance = Math.sqrt((dx * dx) + (dy*dy));
  		return distance;
    
	}
}

public class W9_PA4{
            
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        System.out.print(p1.distance(p2));
        
        }
}    