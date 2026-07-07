import java.util.Scanner;

    public class sumsum{
        static int maximum(int a,int b){
            if(a>b)
                return a;
            else
                return b;
        }

        public static void main(String[]args){

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number:");
            int a=sc.nextInt();


            System.out.print("Enter second number:");
            int b=sc.nextInt();

            int max =maximum(a,b);

            System.out.println("Maximun number ="+max);

            sc.close();
        }
    }

