package week04.Cinema;

public class Utility {

    public static void displaySeats(Seat seats[][]){
        for(int j=0;j<seats.length;j++)
            displaySeats(seats[j]);

    }

    public static void displaySeats(Seat seats[]){
        for(int i=0;i<seats.length;i++)
            System.out.println(seats[i]);
    }

}
