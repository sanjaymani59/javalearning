class arrayevenodd {
    public static void main(String[] args) {
        int[] num={23,56,76,44,63};

        for (int i =0;i<num.length;i++){
            if(num[i]%2==0){
                System.out.println("Even:"+num[i]);

            }else{
                System.out.println("odd:"+num[i]);
            }
        }
    }
    
}
