import java.util.Scanner;

public class SwitchExample{

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number(1-3):");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("you seleted one");
                break;

            case 2:
                System.out.println("you selected Two");
                break;

            case 3:
                System.out.println("you selected Three");
                break;

                default:
                    System.out.println("invalide choice");
        
        }
        sc.close();





        }

    
}
