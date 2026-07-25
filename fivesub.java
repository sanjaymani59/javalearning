import java.util.Scanner;

class fivesub {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        int e=obj.nextInt();


        int tm=a+b+c+d+e;
        int tn=tm/5;

        System.out.println("average:"+tn );

        if(tn<35){
            System.out.println("you need to extra class");
        }else{
            System.out.println("you are good");
        }
        
    }
    
}
