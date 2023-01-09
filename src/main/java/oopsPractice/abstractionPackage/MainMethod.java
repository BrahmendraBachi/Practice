package oopsPractice.abstractionPackage;

public class MainMethod {
    public static void main(String[] args) {

        // As the class ExtendingClass_A is extending AbstractClass which has
        //parameterised constructor. We should declare a constructor with the
        // parameters in AbstractClass

        ExtendingClass_A ec_A  = new ExtendingClass_A("Name_A", "Name_A_P");

        //prints *Name_A*
        System.out.println(ec_A.var1 + "\n");


        ec_A.ab_method1();

        ec_A.ab_method2();

        // public method can be accessible
        ec_A.pub_method1();

        /* we cannot call private method pri_method1() */

        // As the class ExtendingClass_A is extending AbstractClass which has
        //parameterised constructor. We should declare a constructor with the
        // parameters in AbstractClass
        ExtendingClass_B ec_B = new ExtendingClass_B("Name_B", "Name_B_P");

        //prints *Name_B*
        System.out.println(ec_B.var1 + "\n");

        ec_B.ab_method1();

        ec_B.ab_method2();

        // public method can be accessible
        ec_B.pub_method1();



    }
}
