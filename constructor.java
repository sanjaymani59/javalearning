public class constructor {
    String name;
    int age;

    constructor(String n,int a,int b,int c){
        name =n;
        age=a;
        age1=b;
        age2=c;

    }
    void display(){
        System.out.println(name+""+age);
        System.out.println(name+""+age1);
        System.out.println(name+""+age2);


    }
    public static void main(String[] args) {
        constructor c=new constructor("sam",45,67,80);

        c.display();

    }
    
}
