public class dummystd {
    String name;
    int age;

    
   
    dummystd(String name, int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println();
    }  

    public static void main(String[] args) {

        dummystd[] Dummystds={
        new dummystd("arum", 56),
        new dummystd("rum", 34),
        new dummystd("ram", 26)
    };

    for (int i=0;i<Dummystds.length;i++){
        Dummystds[i].display();
    }
    }
}
