 class exception_02 {

    static void check(int age){
           if(age<18){

            throw new ArithmeticException ("invalide value");
        }
    }
    public static void main(String[] args) {
        int a=6;
    try{

            check(17);
        }
    catch(ArithmeticException E){

        System.out.println(E.getMessage());
    }
       
}
}


