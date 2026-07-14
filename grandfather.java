 class inher {
    public static void main(String[] args) {
        mother s=new mother();
        System.out.println(s.gender);
        s.println();


        uncle u=new uncle();
        System.out.println(u.gender);
        u.println();


    }
    
}


 public class  grandfather {

    char gender='M';

    void println(){

        System.out.println("parent class");
    }

    
}

class father extends grandfather{


}



class mother extends grandfather{
        char gender='F';

}

class uncle extends grandfather{

    char gender='M';
}

    
