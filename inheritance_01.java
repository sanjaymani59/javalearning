
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

class person{
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
}