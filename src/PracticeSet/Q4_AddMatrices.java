package PracticeSet;

public class Q4_AddMatrices {
    public static void main(String[] args) {
        int[][] m1 = {{1,2,3}, {4,5,6}};
        int[][] m2 = {{1,2,3}, {4,5,6}};
        int sum=0;
        for(int i=0; i< m1.length; i++){
            for(int j=0; j< m1[i].length; j++){
                sum = m1[i][j]+m2[i][j];
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
