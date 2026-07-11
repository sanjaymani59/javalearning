public class switchcase {
    public static void main(String[] args) {
        char attendance='s';
        switch (attendance) {


            case 'o':
                System.out.println("present");
                
                break;

            case 'a':
                System.out.println("on duty");
                break;

            case 's':
                System.out.println("abesent");
                break;
            default:
                System.out.println("invalide syntax");
                break;
        }
    }
    
}
