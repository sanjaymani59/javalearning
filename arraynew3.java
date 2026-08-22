
class arraynew3 {
    public static void main(String[]args){


    
    int [] a={10,20,30,10,40,50};
    for(int i=0;i<a.length;i++){
        boolean  duplicate=false;

        for(int j=0;j<i;j++){
            if(a[i]==a[j]){
                duplicate=true;
                break;
            }

        }
        if(!duplicate){
            System.out.println(a[i]+"");
        }
    }
}
}