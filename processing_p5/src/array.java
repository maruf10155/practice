public class array {
    public static void main(String[] args) {
        float[][] a=new float[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                a[i][j]=4;
            }
        }
        System.out.println(a[1][1]);
        int[][] mat={{1,1,1},{1,1,1},{1,1,1}};
        float[][] a1={{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(matmul.matmul(a1,mat,3));
    }
}
