class classobject{

    String name;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    // while using two class like "classobject" and "main"  we should use the  "javac classobject" and then "java main" class 
}
class Main{
    public static void main(String[] args){
        classobject sam =new classobject();
        sam.name="sam";
        sam.age=20;
        sam.display();

    }
    }
