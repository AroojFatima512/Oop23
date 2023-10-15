package week02;

public class Rectangle {
    double length;
    double width;
    double x;
    double y;

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    Rectangle(double length, double width, double x, double y) {
        setLength(length);
        setWidth(width);
        setX(x);
        setY(y);
    }

    public Rectangle Max(Rectangle r1, Rectangle r2){
        if (r1.Area()>r2.Area())
            return r1;
        else
            return r2;
    }

    public void CheckMax(Rectangle r1, Rectangle r2){
        Rectangle output = Max(r1,r2);
        if (output == r1)
            System.out.println("Rectangle 1 is greater");
        else
            System.out.println("Rectangle 2 is greater");
    }

    public Rectangle Overlap(Rectangle r1, Rectangle r2){
        double x1 = r1.getX();
        double x2 = x1 + r1.getWidth();
        double y1 = r1.getY();
        double y2 = r1.getY()+ r1.getLength();
        double x3 = r2.getX();
        double x4 = x3 + r2.getWidth();
        double y3 = r2.getY();
        double y4 = y3 + r2.getLength();

        if (x1 <= x4 &&  x2  >= x3 && y1 <= y4 && y2 >= y3)
            return r1;
        else
            return r2;

    }

    public void CheckOverlap(Rectangle r1, Rectangle r2){
        Rectangle result = Overlap(r1, r2);
        if (result == r1)
            System.out.println("The Rectangles are overlapping");
        else if (result == r2)
            System.out.println("The Rectangles are not overlapping");
    }
    public double Area(){

        return length*width;
    }

    public double Circumference(){

        return 2*(length+width);
    }
    public double getLength() {

        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

