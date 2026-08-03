class bankaccount {

    String name;
    double balance;

    void deposite(int amount){
       balance +=amount;
    //    System.out.println("Balance:"+balance);
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Balance:"+balance);
    }
    public static void main(String[] args) {
        
        bankaccount ac=new bankaccount();
        ac.name="jayam";
        ac.balance=5000.45;


        ac.deposite(6000te);


        ac.display();
    }
    
}
    
