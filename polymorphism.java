// Simple meaning
// Polymorphism = one name, many forms.



// Level 1 — Basic Method Overloading

// Same method name, but different parameters.
/* class calculator {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        calculator c=new calculator();

        c.add(4, 5);
        c.add(2, 4, 5);
    }
} */



// Level 2 — Overloading with Different Data Types


/* class Printer{

    void print(int value){
        System.out.println(value);
    }
    void  print1(String value){
        System.out.println(value);
    }
    void print2(double value){
        System.out.println(value);
    }
}
public class polymorphism {

    public static void main(String[] args) {
        Printer p=new Printer();

        p.print(45);
        p.print1("hello");
        p.print2(4.3);
    }
} */



    // Level 3 — Overloading by Number of Parameters


/* class Student{

    void  display(){
        System.out.println("No data");
    }
    void display(String name){
        System.out.println(name);
    }

    void display(String name ,int age){
        System.out.println(name);
        System.out.println(age );
    }
}
public class polymorphism {

    public static void main(String[] args) {
        Student s=new Student();

        s.display();
        s.display("sam");
        s.display("sam", 20);
    }
}
 */


// Level 4 — Basic Method Overriding

// Now we move to runtime polymorphism.

/* class Animal{
    void sound(){
        System.out.println("Dog is making sound "   );

    }

}

class Dog extends Animal{
    @Override 

    void sound(){
        System.out.println("Dog is baking ");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Dog d=new Dog();

        d.sound();
    }
} */



    // Level 5 — Parent Reference + Child Object

/* class Animal{

    void  sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("Dog sound ");
    }
}

public class polymorphism{
    public static void main(String[] args) {
        Animal a=new Dog();

        a.sound();
    }
} */


// Level 6 — Multiple Child Classes

/* class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends  Animal{
    @Override
    void sound(){
        System.out.println("Dog bark ");
    }
}
class Cat extends Animal{
    @Override 
    void sound(){
        System.out.println("Cat meows");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.sound();
        a=new Cat();
        a.sound();
    }
} */


// Level 7 — Polymorphism with Method Parameter

/* class Animal{

    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends  Animal{
    @Override 
    void  sound(){
        System.out.println("Dog is bark");
    }
}

class Cat extends Animal{
    @Override 
    void sound(){
        System.out.println("Cat Mewos");
    }
}


public  class polymorphism {
    static void makesound(Animal animal){
        animal.sound();
    }

    public static void main(String[] args) {
        Dog  d= new Dog();
        Cat c=new Cat();

        makesound(d);
        makesound(c);

    }
    
} */


// Level 8 — Array + Polymorphism

// Now combine arrays + inheritance + polymorphism.


/* class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog bark ");
    }
}

class Cat extends Animal{
    @Override 
    void sound(){
        System.out.println("Cat meows");
    }
}

public class  polymorphism{
    public static void main(String[] args) {
        Animal [] animals ={
            new Dog(),
            new Cat(),
            new Dog()
        };

        for (int i=0;i<animals.length;i++){
            animals[i].sound();
        }
    }
} */

// Level 9 — Polymorphism + super

/* class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        
        super.sound();
        System.out.println("dog barks");
    }
}
class Cat extends Animal{
    void sound(){

        super.sound();
        System.out.println("Cat mewos");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Dog d=new Dog();
        
        Cat c=new Cat();

        d.sound();
        c.sound();
    }
} */


    // Level 10 — Polymorphism with Abstract Class

/* abstract class Animal{
    abstract void sound();
    }
class Dog extends  Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override 
    void sound(){
        System.out.println("Cat meows");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.sound();

        a=new Cat();
        a.sound();
    }
} */


// Level 11 — Interface + Polymorphism

/* interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay(){
        System.out.println("Payment using UPI");
    }
}
class Card implements Payment{
    public void pay(){
        System.out.println("Payment using card");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Payment p;

        p=new UPI();
        p.pay();

        p=new Card();
        p.pay();
    }
} */

// Level 14 — Downcasting

/* class Animal{
    void eat(){
        System.out.println("Eating ");
    }
}
class Dog  extends Animal{
    void bark(){
        System.out.println("Barking ");
    }
}

public  class polymorphism{

    public static void main(String[] args) {
        Animal a=new Dog();
        Dog d = (Dog) a;
        d.bark();
    }
} */

// Level 15 — Safe Downcasting with instanceof


/* class Animal{
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog Bark");
    }
}

public class polymorphism{
    public static void main(String[] args) {
        Animal a= new Dog();

        if (a instanceof Dog ){
            Dog d=(Dog) a;
            d.bark();
        }
    }
} */