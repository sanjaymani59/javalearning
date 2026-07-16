public class using_this {
    public static void main(String[] args) {

        father f=new father();

        f.print('M',20);

        
        System.out.println(f.gender);
        System.out.println(f.age);

        System.out.println();
        
    }
    
}

class father{
    char gender;
    int age;


    void print(char gender, int age){


        this.gender=gender;
        this.age =age;
    }
     

}
