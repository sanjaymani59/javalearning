import java.util.Scanner;
public class using_scanner {

    public static void main(String[] args) {
            
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter N:");
            Double n =sc.nextDouble();
            // String n =sc.nextLine();
            System.out.println("Enter M:");
            double m=sc.nextDouble();
            System.out.println("Enter operater any one symbole(+,-,*,/,%)");
            char operaters=sc.next().charAt(0);

        switch (operaters){
                
                case '+':
                    System.out.println(+(n+m));
                    break;
                    
                case '-':
                    System.out.println(+(n-m));
                    break;
                case '*':
                    System.out.println(+(n*m));
                    break;

                case '/':
                    if(m!=0){
                        System.out.println(+(n/m));
                    }else{
                        System.out.println("it is zero division error");
                    }
                    break;
                case '%':
                    if(m!=0){
                        System.out.println(+(n%m));
                    }else{
                        System.out.println("it is zero division error");
                    }
                    break;
        default:
                System.out.println("invaled operater");
                    break;
            }
            sc.close();
        }

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            // if(n>m){
            //     System.out.println("n is greter:"+n);
            // }else{
            //     System.out.println("m is greater:"+m);
            // }


            // System.out.println("your name is:"+);


            }

    
        
