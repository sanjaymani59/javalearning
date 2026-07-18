import java.util.Scanner;
import java.io.File;

class Fileread {
    public static void main(String[] args) {
        try{
            File F= new File("hello.txt");

            Scanner reader=new Scanner(F);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

        }
        
    catch(Exception E){
            System.out.println(E);
        }
        
    }


    
}
