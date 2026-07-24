/* import java.util.Scanner; */
import java.io.File;


class filehandling {
        public static void main(String[] args) {
            File target =new File("example.txt");

            /* if(target.exists());
                System.out.println("file is exist "); */
                if (target.delete()) {
                    System.out.println("file is deleted ");

                    
                }else{
                    System.out.println("file is not exist");
                }

        }


    
}
