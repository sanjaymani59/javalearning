interface father {

   abstract void call();

   abstract void talk();
    
}

class son implements father {

    public void call(){
        System.out.println("calling");
    }

    public void talk(){
        System.out.println("talking");
    }
    public static void main(String[] args) {
        son ob=new son();
        ob.call();
        ob.talk();
    }
}  


  
