
package PracticeSet;
import java.util.Scanner;
public class Q2_No_Exist {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,5};
        int num = 4;
        boolean isInArray=false;
        for (int i=0; i<arr.length; i++) {
            if (num == arr[i]) {
                isInArray = true;
                break;
            }
        }
        if (isInArray)
            System.out.println("The Value is present inside Array");
        else
            System.out.println("The Value is not present inside Array");

    }
}
