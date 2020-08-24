package pl.waw.sgh.shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double a) {
        super(a, a, a);
    }

    public double calcSurface() {
        return (parA * parA * Math.sqrt(3)) / 4;
    }

    public double calcPerimeter() {
        return 3 * parA;
    }
}
