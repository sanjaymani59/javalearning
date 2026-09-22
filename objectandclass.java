public class objectandclass {
    public  int  add(int d,int s){
        int c=d+s;
        return  c;
}
public static void main(String[] args) {
    int a=3;
    int b=4;
    // add(a, b);
    objectandclass c=new objectandclass();

    c.add(a, b);

    System.out.println(c);
    
    
}
}