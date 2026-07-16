public class exception {

    public static void main(String[] args) {
    int a=5;
    int b=0;

  
    try
        {
            System.out.println(a/b);
       

    }
    catch(Exception E){

        b=0;
        System.out.println("b is 0");
       
    }
    System.out.println("hello");
   
}
}
 
