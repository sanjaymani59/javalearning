// Java public static void main(String[] args) — Beginner to Advanced 🚀

// Step 1: Your First Java Program

/* public class psvm01{
    public static void main(String[] args) {
        System.out.println(" hello world");
    }
} */

    // Example 2: With static

/* class Student{
    static void study(){
        System.out.println("student is studying");
    }
}
public class psvm01{

    public static void main(String[] args) {
        Student.study();
    }
} */


    // Step 4: What is void?
// Meaning: void means the method does not return a value.

/* public class maincode{

    public static void main(String[] args) {
        display();
    }
    static void display(){
        System.out.println("welcome to java ");
    }
} */

/* public class maincode {

    public static void main(String[] args) {
        int result =add();

        System.out.println(result);
    }

    static int add(){
        return 10+20;
    }
} */


// Step 5: What is main?
// main is the name of the method that acts as the traditional entry point of a Java application.

/* public class maincode{
    public static void main(String[] args) {
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println("step 3");
    }
} */

    // Step 6: What is String[] args?
    // String → Represents text.
// [] → Declares an array.
// args → The variable name.
// Together, String[] args declares an array of strings that can receive command-line arguments.

/* // public class maincode {

//     public static void main(String[] args) {
//         System.out.println(args.length);
//     }
// } */


// Example 2: Passing arguments

/* public class maincode {
    
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

    }
} */


    // Step 9: Can main() Call Another Method?

public class maincode {

    public static void main(String[] args) {
        int result =add(10,20);
        System.out.println(result);
    }
    static int add(int a,int b){
        return a+b;
    }
}


















































