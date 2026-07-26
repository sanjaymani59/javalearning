import java.util.Scanner;

class traffic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Colour in traffic signal(Red,Yellow,Green)");

        String colour =sc.nextLine();

        switch (colour.toLowerCase()) {
            case "red":
                System.out.println("stop");
                break;

            case "yellow":
                System.out.println("ready/start");
                break;

            case "green":
                System.out.println("Go");
                break;


            
        
            default:
                System.out.println("invalide colour");
                break;
        }



        sc.close();




    }
}
        /* String y=hello.nextLine();
        String g=hello.nextLine(); */


        
 

    

