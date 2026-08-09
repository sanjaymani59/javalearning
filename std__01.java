class std__01 {

    String name;
    int mark;

    void checkmark(){

    if(mark>=50){
        System.out.println(name+" "+"is pass");
    }else{
        
        System.out.println(mark+" " +"is mark");
        System.out.println("so,it consider as fail");
    }

    }
    public static void main(String[] args) {
        std__01 s1=new std__01();

        s1.name="sam";
        s1.mark=40;

        s1.checkmark();
    }
    
}
