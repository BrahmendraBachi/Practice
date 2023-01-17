package interfacePackage.polygonPackage;

import interfacePackage.polygonPackage.triangle.Triangle;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class MainMethod {


    @GetMapping("/super")
    public String superRaMacha(){
        return "SuperRaMacha";
    }

    public static void main(String[] args) {

        Map<String, Double> values = new HashMap<>();
        values.put("sideA", 10.0);
        values.put("sideB", 10.0);
        values.put("sideC", 10.0);



        getPolygon_Area(new Triangle(10, 20, 20));

    }

    // polygon is an interface object through implemented classes
    static void getPolygon_Area(Polygon polygon){
        System.out.println(polygon);

        System.out.println(polygon.getArea());
    }

}
