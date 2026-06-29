import java.util.Scanner;
public class breakexample{
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value (50-100):");

        int stop =sc.nextInt();
        for(int i=50;i<=100;i++){
            if(i==stop){

                break;
            }
            System.out.println(i);
        }
        sc.close();
        
    }

    
}
