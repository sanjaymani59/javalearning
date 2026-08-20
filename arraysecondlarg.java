class arraysecondlarg {
    public static void main(String[] args) {
        int[] a ={35,67,87,34,65};

        int large =a[0];
        int second=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>large){
                second =large;
                large=a[i];
            }else if(a[i]>second && a[i]!=large){
                second =a[i];
            }
        }
        System.out.println("larger"+large);
        System.out.println("secondlarge"+second);
    }

    
}
