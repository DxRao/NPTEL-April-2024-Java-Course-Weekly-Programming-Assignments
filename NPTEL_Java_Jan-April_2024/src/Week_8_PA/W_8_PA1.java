package Week_8_PA;

import java.util.Scanner;
//TODO: Create a class "Animal" that have a  parameterized constructor to initialize the protected fields and method of makeSound().
//Create a class called Dog that extends the Animal class.
//Create a class called Cat that extends the Animal class.

class Animal1{

protected String name;
protected String sound;

} 

class Dog1 extends Animal1{

public Dog1(String name){

this.name = name;   

}

public void makeSound(){
 
 sound = "says: Woof";
 
 System.out.println(name + " " + sound);
 
}

}

class Cat1 extends Animal1{

public Cat1(String name){

this.name = name;   

}

public void makeSound(){
 
 sound = "says: Meow";
 
 System.out.print(name + " " + sound);
 
}

}


public class W_8_PA1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String dogName = scanner.nextLine();
		String catName = scanner.nextLine();

		Dog1 dog = new Dog1(dogName);
		Cat1 cat = new Cat1(catName);

		dog.makeSound(); 
		cat.makeSound();  

		scanner.close();
	}
}