import java.util.Scanner;
public class _stddd{
    int roll;
    String name;

    void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number:");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        name=sc.nextLine();
    }

    void display(){
        System.out.println("Roll number:"+ roll);
        System.out.println("Name:"+ name);

    }

    public static void main(String[] args){
        _stddd obj = new _stddd();
        obj.input();
        obj.display();
        }

    }