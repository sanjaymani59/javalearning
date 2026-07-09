public class student_02 {
    String name;
    int age;

    student_02(String n,int a){
        name =n;
        age=a;

    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) {
        student_02 s1=new student_02("sam",20 );
        s1.display();

    }
}
