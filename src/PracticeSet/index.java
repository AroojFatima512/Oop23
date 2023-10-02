package PracticeSet;

public class index {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 5, 3};
        int num = 3;
        boolean isInArray=false;
        int i=0;
        for ( i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                isInArray=true;
        }
    }
        if (isInArray)
       {
        System.out.printf("The %d is present at index %d", num, i);
        System.out.println();
    }
        else  System.out.println("The value is not present");
    }
}
