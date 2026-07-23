class Undefind extends Exception {

    Undefind(String str){
    super(str);

}

    
}
class HandlingException {


    public static void  check(int age) throws  Undefind ,ArithmeticException {
    if(age<18){
        throw new Undefind("valide");
    }else
        {
        throw new ArithmeticException("invalide");
    }

}
public static void main(String[] args) {
    
        int a=19;

        try{

            check(19);
            
        } 
        catch(Undefind E){
            System.out.println(E.getMessage());
            
        }
        catch (ArithmeticException E) {
            System.out.println(E.getMessage());
        }


        
    }
}
