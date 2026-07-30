 public class object_class2 {
   public static void main(String[] args) {

        int num=10;
        boolean prime=true;

        for(int i=2;i<num;i++){

            if(num%i==0){
                prime=false;
                break;
            }

        }if(prime){
            System.out.println("it is prime");
        }else{
            System.out.println("not a prime");
        }
    }}
























    
  /*       int num=12345;
        int sum=0;

    while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
    }System.out.println(+sum);
}} */
    

      
       
        /*  int num=121;
        int original=num;
        int revers=0;

        while(num!=0){
        int digit=num%10;
        revers=revers%10+digit;
        num=num/10;

    }

   
        if(original==num){
        System.out.println("it is a palindrom");
    }   else{
        System.out.println("it is not a palidrom");
    } */

    

