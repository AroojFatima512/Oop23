package PracticeSet;

public class Q3_marks {
    public static void main(String[] args) {
        float[] marks={55.5f, 76.6f, 43.4f, 98.7f, 99.5f};
        float sum=0;
        float average=0;
        for (float element: marks){
            sum = sum + element;
        }
        average = sum/ marks.length;
        System.out.println("The average value of all Marks" +average);
    }
}
