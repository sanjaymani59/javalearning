
 import java.util.Scanner;
public class exe {
    public static void main(String[]args){
        /* int[] Score =new int[5]; */

        Scanner sc=new Scanner(System.in);

        int [] score=new int[5];
        int total=0;

        for( int i=0;i<5;i++){
            System.out.print("Enter Num"+(i+1)+":");
            score[i]=sc.nextInt();
            total += score[i];


        }
        System.out.println("Total Score="+total);

        



sc.close();


       /*  Score[0]=sc.nextInt();

        Score[1]=sc.nextInt();

        Score[2]=sc.nextInt();

        Score[3]=sc.nextInt();

        Score[4]=sc.nextInt();

        System.out.println(Score[0]+Score[2]+Score[3]+Score[4]+Score[1]); */
}
} 



