import java.util.Scanner;

public class studentdetails {
    
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        //user input
        

        System.out.println("Enter student name:");
        String studentName=sc.nextLine();

        System.out.println("Enter student ID:");
        int studentID=sc.nextInt();

        System.out.println("Enter student Age:");
        int studentAge=sc.nextInt();

        System.out.println("Enter studentFee:");
        char studentFee=sc.next().charAt(0);

        System.out.println("Enter student grade:");
        char studentGrade=sc.varCharAt(0);

        //display data

        System.out.println("\n STUDENT DETIIALS");

            System.out.println("Student name :"+ studentName);
            System.out.println("Student ID:" + studentID);
            System.out.println("Student Age:"+ studentAge);
            System.out.println("Student Fee:"+ studentFee);
            System.out.println("Student Grade:"+ studentGrade);

            sc.close();

        




    }
    
}
