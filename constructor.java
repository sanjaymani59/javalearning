public class constructor {
    String name;
    int age;

    constructor(String n,int a){
        name =n;
        age=a;

    }
    void display(){
        System.out.println(name+""+age);

    }
    public static void main(String[] args) {
        constructor c=new constructor("sam",45);

        c.display();

    }
    
}
