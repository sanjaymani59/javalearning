
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

class Std {
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
