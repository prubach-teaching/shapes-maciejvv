package pl.waw.sgh.shapes;

public class Triangle extends Shape implements PerimeterCalculation {

    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double calcSurface() {
        double p = (parA + parB + parC) / 2;
        return Math.sqrt(p * (p - parA) * (p - parB) * (p - parC));
    }

    @Override
    public double calcPerimeter() {
        return parA + parB + parC;
    }
}
