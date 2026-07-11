public class matrix {
    public static void main(String[] args) {
        int [][] matrix= new int[5][2];

        matrix[0][1]=1;
        matrix[2][0]=2;
        matrix[4][1]=5;

        for (int i=0;i<5;i++){
            for(int j=0;j<2;j++){
        
            System.out.print(matrix[i][j]);
            }
            System.out.println("");
    }
    }
}

