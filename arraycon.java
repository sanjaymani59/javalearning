public class arraycon {
    public static void main(String[] args) {
    //     int [] num={45,50,9,45,35,34};
    //    /* System.out.println(num[4]);
    //     System.out.println(num[3]);
    //     System.out.println(num[2]);
    //     System.out.println(num[1]);
    //     System.out.println(num[5]); */
    //      int sum=0;

    //     for (int i=0;i<num.length;i++)
    //     {
            
    //         sum =sum+num[i];

    //         System.out.println(sum);
        // }
        

        int [] num={10,30,49,54,34};
        int sum =0;
        for (int i=0;i<num.length;i++){
            sum=sum+num[i];

        
         }
         float average=(float)sum/num.length;

         System.out.println(average);
    }
    
}
