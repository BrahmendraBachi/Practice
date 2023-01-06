package oopsPractice.inheritancePractice.multilevel_InheritancePractice;

public class MainMethod {

    public static void main(String[] args) {

        Class_A a = new Class_A();

        System.out.println("takes from Class_C as Class_A extends Class_B which extends Class_C");
        System.out.println(a.name);


        //A -> B -> C
        //A can read Class_B properties as well as Class_C
        //B can read Class_C properties
        //Class_C is the parent Class


    }

}
