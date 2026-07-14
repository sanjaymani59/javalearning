abstract class computer {

    abstract void turnoff();

    void turnon(){
        System.out.println("hello,turn on");
    }





}


class hp extends computer{
    void turnoff(){
        System.out.println("Trying to learn");
    }


}

class dell extends computer{

    void turnoff(){
        System.out.println("I will conform complete this ");

    }

}

class abs{
    public static void main(String[] args) {
        hp ob=new hp();
        ob.turnon();
        ob.turnoff();

        dell ob2=new dell();
        ob2.turnon();
        ob2.turnoff();
        
    }
    
    

}

