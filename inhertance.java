class animal{

        int  fourleg = 4;

        public static void eat(){
        System.out.println("it can  eat");
    }

       public static void dance(){
       System.out.println("yes it can");

}
}

class dog extends animal {
 
     boolean bark =true;


}
class call{
     public static void main(String[] args) {
     dog obj=new dog();
     System.out.println(obj.fourleg);
     System.out.println(obj.bark);
     obj.eat();
     obj.dance();
;
    
}

}



