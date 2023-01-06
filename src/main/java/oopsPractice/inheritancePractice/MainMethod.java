package oopsPractice.inheritancePractice;

import com.sun.org.apache.xalan.internal.xsltc.compiler.CompilerException;
import jdk.nashorn.internal.ir.annotations.Ignore;

public class MainMethod {

    public static void main(String[] args) {

        Class_A a = new Class_A();

        //Class_B extends Class_A and the
        //attribute name can be publicly accessible
        System.out.println(a.name);

        //but this throws an error b

        /*
          System.out.println(a.nickname);
         */

        //returns the name present in Class_a
        System.out.println(a.namefromA()+"\n");

        //returns the name present in Class_B using super keyword
        System.out.println(a.namefromB()+"\n");

        System.out.println("If method is present in Class_A"+"\n");
        a.methodA();

        System.out.println("If method is not present in Class_A"+"\n");
        a.methodB(); // inherits methods from Class_B as it extends the class

        //If the method is present in both the classes
        System.out.println("If the method is present in both the classes");
        System.out.println(a.commonMethod()+"\n");// returns from Class_A

        System.out.println(a.commonMethodFromClass_B());
    }

}
