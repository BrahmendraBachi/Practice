package interfacePackage.polygonPackage;

import interfacePackage.polygonPackage.rectangle.Rectangle;

import interfacePackage.polygonPackage.triangle.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class MainMethod {

    @GetMapping("/super")
    public String superRaMacha(){
        return "SuperRaMacha";
    }

    public static void main(String[] args) {
        getPolygon_Area(new Triangle(10, 20, 20));

    }

    // polygon is an interface object through implemented classes
    static void getPolygon_Area(Polygon polygon){
        System.out.println(polygon);

        System.out.println(polygon.getArea());
    }

}
