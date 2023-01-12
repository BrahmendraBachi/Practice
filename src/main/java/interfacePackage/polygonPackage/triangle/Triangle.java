package interfacePackage.polygonPackage.triangle;

import interfacePackage.polygonPackage.Polygon;

public class Triangle implements Polygon {

    double sideA, sideB, sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    int sides;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sides = 3;
    }

    public double getArea(double base, double height){
        return (0.5)*base*height;
    }



    @Override
    public double getArea() {

        double s = (sideA + sideB + sideC)/2;

        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double sides() {
        return this.sides;
    }
}
