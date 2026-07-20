import java.util.Scanner;

class q1{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        int date =scan.nextInt();

        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Date "+date);

    }
}