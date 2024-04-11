package Week_7_PA;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

	public Student(String name, int age){      
      
		this.name = name;      
      this.age = age;       
	}

	void setName(String name){ 
      
      this.name = name;      
    }

	void setAge(int age){
      
      this.age = age;      
    }

	String getName(){
      
      return name;       
    }

	int getAge(){
      
      return age;       
    }
}
  
public class W7_PA1{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter student name: ");
        String name = scanner.next();

        // System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        Student student = new Student(name, age);

        System.out.print("Name: " + student.getName() + ", Age: " + student.getAge());

        scanner.close(); 
	}
	
}