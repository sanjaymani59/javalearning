class College  implements Runnable {
    public void run(){

        String[] day ={"monday","tuesday","wednesday","thusday","friday"};

        for(String days:day){
            System.out.println(days+ ":go to college");
            try{
                Thread.sleep(1000);
        }   catch(InterruptedException E){
                System.out.println("Interrupted Exception");
            
        }
    }
}

}
public class collegeroutin1{
        public static void main(String[] args) {
            College routin =new College();

            Thread t=new Thread(routin);

            t.start();
               }
    }

    


    

