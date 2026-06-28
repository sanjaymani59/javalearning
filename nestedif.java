import java.util.Scanner;

public class nestedif {

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age= sc.nextInt();

        System.out.println("Enter citizenship(india=1,other=2) ");
        int citizen=sc.nextInt();

        if(age>=18){
            if(citizen == 1){
                System.out.println("Eligible to vote");
            }
            else;
                System.out.println("not eligible : not citizen of india");
        }else{
            System.out.println("Not eligible : age is below 18");

        }
        sc.close();





    }
    
}