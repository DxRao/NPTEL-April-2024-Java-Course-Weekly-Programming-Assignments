package Week_8_PA;

import java.util.Scanner;
//TODO: Create a class "Animal" that have a  parameterized constructor to initialize the protected fields and method of makeSound().
//Create a class called Dog that extends the Animal class.
//Create a class called Cat that extends the Animal class.

class Animal{

protected String name;
protected String sound;

} 

class Dog extends Animal{
 
 public Dog(String name){
 
 this.name = name;   
 
}
 
 public void makeSound(){
   
   sound = "says: Woof";
   
   System.out.println(name + " " + sound);
   
 }
 
}

class Cat extends Animal{
 
 public Cat(String name){
 
 this.name = name;   
 
}
 
 public void makeSound(){
   
   sound = "says: Meow";
   
   System.out.print(name + " " + sound);
   
 }
 
}


class W8_PA1{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     String dogName = scanner.nextLine();
     String catName = scanner.nextLine();

     Dog dog = new Dog(dogName);
     Cat cat = new Cat(catName);

     dog.makeSound(); 
     cat.makeSound();  

     scanner.close();
 }
}