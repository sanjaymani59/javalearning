import java.util.Scanner;

public class Scannerinput {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner console =new Scanner(System.in);

        System.out.println("Enter the number a:");
        a=console.nextInt();


        System.out.println("Enter the number b:");
        b=console.nextInt();

        c=a+b;

        System.out.println("total: " +c);
        

    }
    
}
