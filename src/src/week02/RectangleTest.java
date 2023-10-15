package week02;

public class RectangleTest {  public static void main(String[] args) {

    Rectangle  r1 = new Rectangle(4, 4, 0, 0);
    Rectangle r2 = new Rectangle(3, 3, 2, 2);


    Rectangle maxRec = r1.Max(r1,r2);
    Rectangle overlapRec = r1.Overlap(r1,r2);

//        System.out.println(r1.length);
//        System.out.println(r1.width);
//        System.out.println(r2.getLength());
//        System.out.println(r2.getWidth());
//        System.out.println(r1.Area());
//        System.out.println(r1.Circumference());
    System.out.println(maxRec.Area());

    r1.CheckMax(r1,r2);
    r2.CheckOverlap(r1,r2);
}
}
