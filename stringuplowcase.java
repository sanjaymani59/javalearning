import java.util.Scanner;
public class stringuplowcase {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string:");
        String str =sc.nextLine();

        System.out.println("\n -----String operation-----");
        System.out.println("original String:"+str);

        int len = str.length();
        System.out.println("Length:"+len);

        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("lowercase:"+str.toLowerCase());

        sc.close();
    }

}
