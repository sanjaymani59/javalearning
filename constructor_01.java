/* class std {
    std(){
        System.out.println("constructor called");
    }

}

public class  constructor_01 {
    public static void main(String[] args) {
        std c=new std();
    }
    
}
 */


/**
 *                      // // constructor_01
 */

/**
 * std()
 */
/* class std{

    std(){
        System.out.println("hello students");
    }
    
}

public class constructor_01 {

    public static void main(String[] args) {
        std s=new std();
    }
} */



    // constructor with variable 



/**
 * constructor_01       // 3..constructor with variable 
 */



/* class std {
    String name;
    int age;


    std(){
        name="sam";
        age=35;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class constructor_01 {
    public static void main(String[] args) {
        std s=new std();
        s.display();
    }
    
} */


//  4. Parameterized Constructor ⭐

// Instead of fixing the values, we can give values when creating the object.



/* class std{
    String name;
    int age;
    std(String n, int a){
       name=n;
       age=a;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }  
}

public class constructor_01 {
    public static void main(String[] args) {
        std s1=new std("sam", 25);
        std s2=new std("jayam", 45);

        s1.display();
        s2.display();

    }
    
} */


    //5. Multiple Constructors — Constructor Overloading

//A class can have more than one constructor.



/* class std {
    String name;
    int age;

    std(){
        name="unknown";
        age=45;
    }
    std(String n){
        name=n;
        age=0;
    }
    std(String n,int  a){
        name=n;
        age=a;

    }
    
    void display(){
        System.out.println(name+ " "+age);
    }
}
public class constructor_01 {
    public static void main(String[] args) {
        
    
    std s1=new std("sam",4);
    std s2=new std("sam2",3);
    std s3=new std("sam3", 2);

    s1.display();
    s2.display();
    s3.display();
    }
} */


    // 6. Using this Keyword ⭐
    // Sometimes constructor parameter names and variable names are the same.


/* class std{
    String name;
    int age;

    std(String name,int age){
        this.name=name;
        this.age=age;
    }

    void  display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class constructor_01 {
        public static void main(String[] args) {
            std s =new std("sam", 25);
            s.display();
        }
    
} */

// 7. Constructor with Calculation


/* class rectangle {
        int length;
        int width;
        int area;

        rectangle(int length,int width){
            this.length=length;
            this.width=width;

            area=length*width;
        }
        void display(){
            System.out.println("Area:" +area);
        }
    
}
public class constructor_01 {
    public static void main(String[] args) {
        
  
        rectangle r=new rectangle(5, 8);

        r.display();
    }
    
} */



    // 8. Constructor with Multiple Objects


/* class Employe {
        String name;
        int salary;
        Employe(String name,int salary){
           this.name=name;
           this.salary=salary;
        }
        void display(){
            System.out.println(name +' '+salary);
        }
    }
  
public class constructor_01 {
    public static void main(String[] args) {
        
 
        Employe em= new Employe("sam", 20);
        Employe em2= new Employe("jam", 21);
        Employe em3= new Employe("calm", 22);

        em.display();
        em2.display();
        em3.display();


    }
} */



    // 9. Constructor Calling Another Constructor — this()




   class std {
        String name;
        int age;

        std(){
            this("unknown",0);
        }

        std( String name ,int age){
            this.name=name;
            this.age=age;
        }

        void display(){
            System.out.println(name+ " " +age);
        }
   
    }

    public class constructor_01 {
        public static void main(String[] args) {
            std s=new std();
            std s1=new std("sam",8);

            s.display();
            s1.display();
        }
        
    }
