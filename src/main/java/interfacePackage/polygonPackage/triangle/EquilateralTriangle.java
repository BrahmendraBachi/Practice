package interfacePackage.polygonPackage.triangle;




public class EquilateralTriangle extends Triangle{

    double side;

    public EquilateralTriangle(double side) {
        super(side, side, side);
    }


    // Here this is method Overriding and also called as RunTimePloymorphism
    @Override
    public double getArea(){
        return Math.sqrt(3) * side * side / 4;
    }
}
