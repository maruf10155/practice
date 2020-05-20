public class matmul {
    public static float matmul(float[][] a, int[][] b,int n){
//        float[][] a =new float[n][n];
//        int[][] b = new int[n][n];
        float[][] c= new float[n][n];
        float s=0;
        for(int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                    c[i][j] += a[i][j] * b[i][j];
                    s=s+c[i][j];
            }
        }
        return (float) (s/Math.pow(n,2));

    }
}
