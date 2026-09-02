public class method_example {
    void addition(){
        int a=10;
        int b=20;
        int c=a+b;

        System.out.println("result :" +c);
    }

    void sub(int a,int b){
        int c=a-b;
         System.out.println("result :" +c);
    }

public static void main(String[] args) {
    method_example caller =new method_example();

    caller.addition();
    caller.sub(55, 34);
}

}