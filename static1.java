public class static1 {
    static int a=4;
    static int b;
    static{
        System.out.println("Im in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        static1 s=new static1();

        System.out.println(static1.a+" threela"+static1.b);

    }
    
}
