import java.util.Scanner;
  class Students{
                int id;
                String name;
                int age;
                String department;

                    Students(int id, String name, int age, String department) {
                    this.id = id;
                    this.name = name;
                    this.age = age;
                    this.department = department;
    }

                void display() {
                        System.out.println("----------------------");
                        System.out.println("ID : " + id);
                        System.out.println("Name : " + name);
                        System.out.println("Age : " + age);
                        System.out.println("Department : " + department);
    }
}
public class Student {

    

    public static void main(String[]args){
      Scanner sc =new Scanner(System.in);

       Students[] students = new Students[100];
       int count=0;

        while (true) {
            System.out.println("\n =====STUDENT MANAGEMENT SYSTEM======");
         
            System.out.println("1 . Add student");
            System.out.println("2. viwe student");
            System.out.println("3. search student");
            System.out.println("4. update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");

            System.out.println("Enter choice");
            int choice=sc.nextInt();

           
        switch(choice){

            case 1:
                System.out.println("Enter ID");
                int id =sc.nextInt();

                sc.nextLine();

                System.out.println("Enter Name");
                String name=sc.nextLine();

                System.out.println("Enter age");
                int age =sc.nextInt();

                sc.nextLine();


                System.out.println("Enter Department");
                String dept =sc.nextLine();

                students[count]= new Students(id,  name,  age, dept);
                count++;

                System.out.println("Student Added Successfully.");
                break;


            case 2:
                    if(count==0){
                        System.out.println("No Student Available."); 
                    }
                    else{
                        for (int i=0;i<count;i++){
                        students[i].display();
                    }                    
                }

                    break;

            case 3:
                System.out.println("Enter Student ID");
                int sid=sc.nextInt();

                boolean found =false;

                for(int i=0;i<count;i++){

                    if(students[i].id == sid){

                        students[i].display();
                        found=true;
                        break;
                    }
                }
                if(!found)
                    System.out.println("Student Not Found");
                break;


                case 4:
                    System.out.println("Enter Student ID");
                    sid =sc.nextInt();

                    found=false;

                    for(int i=0;i<count;i++){
                        if(students[i].id==sid){
                        sc.nextLine();

                        System.out.println("Enter New Name:");
                        students[i].name=sc.nextLine();

                        System.out.println("EnteNew age: ");
                        students[i].age=sc.nextInt();

                        sc.nextLine();


                        System.out.println("Enter new Department:");
                        students[i].department=sc.nextLine();

                        System.out.println("Student updated:");
                        found=true;
                        break;
                        }
                    }
                    if(!found)
                        System.out.println("Student Not found.");
                        
                    break;

                case 5:
                    System.out.println("Enter Student ID:");
                    sid =sc.nextInt();

                    found=false;

                    for (int i=0;i<count;i++){
                        if(students[i].id==sid){
    

                        for(int j=i;j<count-1;j++){
                            students[j]=students[j+1];
                        }
                        count--;
                        System.out.println("Student Deleted:");
                        found =true;
                        break;
                             } 
                            
                        }
                        if(!found)
                            System.out.println("Student not found:");

                        break;

                case 6:

                    System.out.println("Thank you");
                    System.exit(0);
                            
                default:
                    System.out.println("invalid choice");




                                        
    }
   }
 }
}


