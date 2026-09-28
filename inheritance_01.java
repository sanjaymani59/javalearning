
// Level 1 — Basic Inheritance
/* class Animal {
    void eat(){
        System.out.println("animal is eating");
    } 
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking ");
    }
    
}


public class inheritance_01 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
 */


// Level 2 — Inheriting Variables

/* class Std {
    String name="sam";
    int age =89;    
}
 class college extends Std {
        String course ="Cse";    
}

public class inheritance_01 {
        public static void main(String[] args) {
                college c=new college();
                System.out.println(c.name);
                System.out.println(c.age);
                System.out.println(c.course);
        }
    
}
 */

// Level 3 — Parent and Child Methods

/* class vehical {
    void start(){
        System.out.println("vechical started");
    }  
}
class Car extends vehical {
    void driver(){
        System.out.println("Car is Driving");
    } 
}

public class inheritance_01 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.driver();
    }
    
} */



// Level 4 — Constructor + Inheritance

/* class person{
    person(){
        System.out.println("person constructor");
    }
}
class std extends person {
    std(){
        System.out.println("Student constructor");
    }
}

public class inheritance_01 {
    public static void main(String[] args) {
        std s=new std();
        
       
    }
} */

    // Level 5 — super

/* class animal {
    String name="animal ";

    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends animal{
    String name="Dog ";

    void display(){
        System.out.println(name);
        System.out.println(super.name);
        super.sound();
    }

}

public class inheritance_01{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.display();
    }
} */

    // Level 6 — Method Overriding

// This is very important.

// The child provides its own version of the parent's method.
// The child version overrides the parent version.
/* 
class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog  extends  Animal{
    @Override 
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class inheritance_01 {

    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
    }
} */ 
// output >>> dog barks;

// Level 7 — Parent Reference + Child Object

/* class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog Barks");
    }
}

public class inheritance_01 {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
} */

// Level 8 — Multilevel Inheritance

class Animal{
    void eat(){
        System.out.println("Animal is eating ");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking ");
    }
}
class puppy extends Dog{
    void play(){
        System.out.println("Puppy is playing ");
    }
}

public class inheritance_01 {
    public static void main(String[] args) {
        puppy p=new puppy();

        p.eat();
        p.bark();
        p.play();
    }
    
}