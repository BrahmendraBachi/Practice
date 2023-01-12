package interfacePackage.polygonPackage.rectangle;

import interfacePackage.polygonPackage.Polygon;

public class Rectangle implements Polygon {

    double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }


    public void setSides(int sides) {
        this.sides = sides;
    }

    double breadth;

    int sides;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
        this.sides = 4;
    }

    @Override
    public double getArea() {
        return this.length * this.breadth;
    }

    @Override
    public double getPerimeter() {
        return this.length + this.breadth;
    }

    @Override
    public double sides() {
        return 4;
    }
}
