

// Abstraction = showing what an object can do, while hiding how it does it.

// Abstraction
// │
// ├── 1. Abstract class
// │
// └── 2. Interface



/* abstract class Animal{
    abstract void sound();

}

class Dog extends  Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.sound();
    }
} */

// Level 3 — Abstract Class with Normal Method
// An abstract class can contain both:
// Abstract methods
// Normal methods

/* abstract class Animal{
    abstract void sound();

    void eat(){
        System.out.println("Animal is eating ");
    }
}

class Dog extends Animal{
    @Override 
    void  sound(){
        System.out.println("dog barks");
    }
}

public class abstraction {

    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
        d.eat();
        d.sound();
    }
} */


    // Level 4 — Abstract Class with Variables
/* 
abstract class vechical {
    String brand ="Toyoto";

    abstract void start();
    void displayBrand(){
        System.out.println("Brand" +brand);
    }
}
class Car extends  vechical{
    @Override 
    void start(){
        System.out.println("Car starts");
    }
}

public class abstraction {

    public static void main(String[] args) {
        
        Car c=new Car();
        c.displayBrand();
        c.start();
        
    }
} */


// Level 5 — Abstract Class Constructor
// Many beginners think abstract classes cannot have constructors.

abstract class Animal {
    Animal(){
        System.out.println("Animal constructor");
    }

    abstract void sound();
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor");
    }
    void sound(){
        System.out.println("Dog barks");
    }
}

public class abstraction {

    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}