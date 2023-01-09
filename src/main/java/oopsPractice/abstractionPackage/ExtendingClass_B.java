package oopsPractice.abstractionPackage;


//When we extend any abstract class we should implement the abstract methods
// by overriding them.
public class ExtendingClass_B extends AbstractClass{
    public ExtendingClass_B(String var1, String var2) {
        super(var1, var2);
    }

    @Override
    void ab_method1() {
        System.out.println("From ExtendingClass_B - ab_method1()\n");
    }

    @Override
    void ab_method2() {
        System.out.println("From ExtendingClass_B - ab_method2()\n");
    }
}
