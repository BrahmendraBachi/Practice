package oopsPractice.inheritancePractice.multiple_Inheritance;

public class ImplementingClass implements Interface_A, Interface_B {

    @Override
    public String method_A() {
        return "From Method_A";
    }

    @Override
    public String method_B() {
        return "From Method_B";
    }
}
