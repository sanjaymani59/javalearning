class Cack extends Thread{
    public void run(){
        System.out.println("add ingrediant:"+Cack.currentThread().getId());
         System.out.println("mix the ingredent :"+Cack.currentThread().getId());
          System.out.println("decrotre the cack:"+Cack.currentThread().getId());
    }
}

class ThreadBaking{
    public static void main(String[] args){
    int countl=4;
        for (int i=0;i<countl;i++){
        Cack cack=new Cack();
        cack.start();
}
}
}