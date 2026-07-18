import java.io.File;
import java.io.FileWriter;


class filewriter {
    public static void main(String[] args) {

        try{
        File f= new File("hello.txt");
        FileWriter fw = new FileWriter(f);

        fw.write("This is my file writter code");

        fw.close();
    }catch(Exception E){
        System.out.println(E);
    }





    }
    
}
