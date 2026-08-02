
class simple_class {


    int id;
    String name;
    double salary;

    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);


    }

    public static void main(String[] args) {
        simple_class sam=new simple_class();

        sam.id=101;
        sam.name="jayam";
        sam.salary=20000.45;
        sam.display();
    }

  

}


