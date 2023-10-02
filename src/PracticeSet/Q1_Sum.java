package PracticeSet;

public class Q1_Sum {
    public static void main(String[] args) {
        float[] array={55.5f, 76.6f, 43.4f, 98.7f, 99.5f};
        float sum=0;
        for (int i=0; i< array.length; i++)
            sum=sum+array[i];
        System.out.println(sum);
    }
}
