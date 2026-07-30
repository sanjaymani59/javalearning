public class object_class2 {
    public static void main(String[] args) {
    

        int num=121;
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
    }

    
}
}
