public class array2 {
    public static void main(String[] args) {
        int[] num={23,64,45,34};

        int lar=num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]>lar){
                lar=num[i];

            }
        }
        System.out.println("lar"+lar);
    }
}
