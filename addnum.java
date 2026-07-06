import java.util.Scanner;
public class addnum {
    static void add(int a,int b){
        int sum =a+b;
        System.out.println("sum =" +sum);
    }
    public static void main(String[] args){
            
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter first number:");
    int x=sc.nextInt();

    System.out.print("Enter second number:");

    int y= sc.nextInt();

    add(x,y);

    sc.close();




    
    }
    
}
