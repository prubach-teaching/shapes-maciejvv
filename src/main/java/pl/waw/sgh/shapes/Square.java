package pl.waw.sgh.shapes;

public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    public double calcSurface() {
        return parA * parA;
    }

    public double calcPerimeter() {
        return 4 * parA;
    }
}
