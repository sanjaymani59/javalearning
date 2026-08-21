public class search_an_element {
    public static void main(String[] args) {
        int [] a={23,45,67,43,77,34};
        boolean found =false;

        int search=67;

        for (int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println("The search number found in th index of:"+(i+1));
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element is not found");
        }
    }
    
}
