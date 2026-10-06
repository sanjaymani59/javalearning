

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

/* abstract class Animal {
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
} */


// Level 6 — Multiple Abstract Methods

/* abstract class Shape {
    abstract void area();
    abstract void perimeter();
}
class Rectangle extends Shape{
    int length=10;
    int width=5;

    void area(){
        System.out.println("Area:"+ (length*width));
    }
    void perimeter(){
        System.out.println("Peremeter:"+ (2*(length+width)));
    }
}

public class abstraction {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.area();
        r.perimeter();
    }
} */


// Level 7 — Abstraction + Inheritance

/* abstract class Shape {
    abstract void area();
}
class Rectangle extends Shape{
    void area(){
        System.out.println("Rectangal area");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Circle area ");
    }
}

public class abstract01{
    public static void main(String[] args) {
        
    
    Rectangle r=new Rectangle();
    r.area();
    Circle c= new Circle();
        c.area();
    }
} */

// Level 8 — Abstraction + Polymorphism

/* abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Braks");
    }
}

class Cat extends Animal{
    @Override 
    void sound(){
        System.out.println("Cat Meows");
    }
}

public  class abstract01 {

    public static void main(String[] args) {
        Animal a;

        a=new Dog();
        a.sound();

        a=new Cat();
        a.sound();
    }
} */

// Level 9 — Abstract Class + Array

abstract class Animal{
        abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}


public class abstract01 {

    public static void main(String[] args) {
        Animal[] animals={

            new Dog(),
            new Cat(),
            new Dog()
            
        };

        for(int i=0;i<animals.length;i++){
            animals[i].sound();
        }

    }
}