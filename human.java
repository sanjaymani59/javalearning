public class human {
    int age;
    String name;
    int salary;
    boolean married;  
    static long population;
   
    public human(int age, String name,int salary,boolean married )
{
    this.age=age;
    this.name=name;
    this.salary=salary;
    this.married=married; 
    human.population+=1;

}
public static void main(String[] args) {
    human sam=new human(45, "sam", 3000, false);
    human jayam=new human(34, "jayam", 49939, false);

    System.out.println(sam);
    System.out.println(jayam);

    System.out.println(human.population);

}
}

