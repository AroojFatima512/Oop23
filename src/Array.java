public class Array {
    public static void main(String[] args) {
        int[] marks = {90, 76, 86, 48, 99};
        //Printing array in reverse order using for loop
        for(int i= marks.length-1; i>=0; i--)
            System.out.println(marks[i]);

        //Printing array using foreach loop
        for (int element: marks)
            System.out.println(element);


      /*  for(Seat[] temp:seats)
                for(Seat seat:temp)
                    System.out.println(seat);*/
    }
}
