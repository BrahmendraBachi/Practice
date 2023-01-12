package interfacePackage.polygonPackage.triangle;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    public boolean iRightAngledTriangle() {
        return (Math.pow(sideA, 2) == (Math.pow(sideB, 2) + Math.pow(sideC, 2)) ||
                (Math.pow(sideB, 2) == Math.pow(sideA, 2) + Math.pow(sideC, 2)) ||
                (Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideC, 2)));
    }

    public double square(double side) {
        return side * side;
    }


}
