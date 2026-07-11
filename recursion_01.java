public class recursion_01 {
    public static void main(String[] args) {
        satnum(10);
    }
    public static void satnum(int n) {
        if(n==1){
                System.out.println("one");

        }else{

            System.out.println(n);
            satnum(n-1);

        }
    }
}
