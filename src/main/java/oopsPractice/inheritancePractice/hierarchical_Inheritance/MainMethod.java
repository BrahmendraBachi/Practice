package oopsPractice.inheritancePractice.hierarchical_Inheritance;

import oopsPractice.inheritancePractice.singleInheritance.Class_A;

public class MainMethod {

    //Hierarchical Inheritance means one class can serve as parent class for one or more classes
    //Class_C serves as parent class for both Class A and Class B

    public static void main(String[] args) {

        Class_A a = new Class_A();

        System.out.println("reads from Class_C");
        System.out.println(a.name);

        Class_B b = new Class_B();

        System.out.println("reads from Class_C");
        System.out.println(b.name);
    }

}
