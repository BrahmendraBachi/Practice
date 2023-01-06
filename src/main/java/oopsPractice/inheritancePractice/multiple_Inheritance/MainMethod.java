package oopsPractice.inheritancePractice.multiple_Inheritance;

public class MainMethod {

    public static void main(String[] args) {

        //ImplementingClass is a class which implements one or more Interfaces
        // and should override methods present in both the classes
        ImplementingClass implementingClass = new ImplementingClass();


        System.out.println(implementingClass.method_A() + "\n");

        System.out.println(implementingClass.method_B() + "\n");

        Class_C class_c = new Class_C();

        //class_C is indirectly doing multilevel Inheritance with ImplementingClass
        //and ImplementingClass is doing multiple Inheritance with Interface_A and Interface_B
        System.out.println("reads method_A from ImplementingClass");
        System.out.println(class_c.method_A() + "\n");

        System.out.println("reads from method_B from ImplementingClass");
        System.out.println(class_c.method_B());

    }

}
