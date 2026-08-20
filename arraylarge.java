class arraylarge {
    public static void main(String[] args) {
        int [] num={25,65,36,67,45};

        int large=num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]>large){
                large=num[i];
            }
        }
        System.out.println("large:"+large);
    }
    
}
