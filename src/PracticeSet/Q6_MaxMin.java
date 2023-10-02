package PracticeSet;

public class Q6_MaxMin {
    public static void main(String[] args) {
        int[] arr = {14,6,54,7,-36,9,22,5};
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max)
                max=arr[i];
            if (arr[i]<min)
                min= arr[i];
        }
        System.out.println("The value of Maximum element in this array is: "+max);
        System.out.println("The value of Minimum element in this array is: "+min);;
  }
}
