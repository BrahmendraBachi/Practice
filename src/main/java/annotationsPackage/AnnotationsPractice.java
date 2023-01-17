package annotationsPackage;

import castingPackage.Class_A;

import java.lang.annotation.*;

/*
@Target(ElementType.CONSTRUCTOR) //It works with in the constructor
@Target(ElementType.METHOD) //It works with in the Method
@Retention(RetentionPolicy.SOURCE) // It works with in the source
@Retention(RetentionPolicy.CLASS) // It works with in the Class
 */
@Retention(RetentionPolicy.RUNTIME) // It works till the runtime
@Target(ElementType.TYPE) // It represents we are using this annotation in class Type
@interface SmartPhone{

    String os() default "Symbian";
    int version();

    // os() an version() are the values of the annotation
    // If you don't have any values - Marker annotation
    // 1 value - Single value annotation
    // n values - Multi value annotation

}




// we can declare this annotation
// with one value as *os* has default value

//default values can be changed
@SmartPhone(version = 6)
class NokiaBSeries{

}


//Here you need to declare two values of the parameters if they don't have any default value
@SmartPhone(os = "Android", version = 6)
class NokiaASeries{

    String model;
    int cost;

    public NokiaASeries(String model, int cost){
        this.model = model;
        this.cost = cost;

    }

}





public class AnnotationsPractice{


    public static void main(String[] args) {


        NokiaASeries obj = new NokiaASeries("A Series", 100000);

        Class c = obj.getClass();

        //We use Annotation class to print the values of the annotations

        //getAnnotation(*annotation*) gives the annotation present in that class c i.e., NokiaASeries
        Annotation an = c.getAnnotation(SmartPhone.class);

        //Here *an* is of annotation type where we can use type casting to change the type of the variable
        SmartPhone s = (SmartPhone) an;


        //prints the value present in the annotation - SmartPhone
        System.out.println(s.os());
        System.out.println(s.version());




    }
}


