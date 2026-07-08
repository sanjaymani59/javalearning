class studentname {

    String name ="sam";
    int age=20;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }
}

public class studentapp{
    
    public static void main(String[]args) {
        studentname s1= new studentname();
        s1.display();
    }
}
