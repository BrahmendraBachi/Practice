package oopsPractice.abstractionPackage;

abstract class AbstractClass {

    String var1;

    private String var_p = "Initial Name";

    // If we create any parameterised constructor
    // The extending class should also declare the parameterised constructor

    public AbstractClass(String var1, String var_p){
        this.var1 = var1;
        this.var_p = var_p;
    }



    abstract void ab_method1();

    abstract void ab_method2();

    public void pub_method1(){
        System.out.println("From pub_method1\n");
    }

    private void pri_method1(){
        System.out.println("From pri_method1\n");
    }

    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass("Bachi", "new name") {
            @Override
            void ab_method1() {

            }

            @Override
            void ab_method2() {

            }
        };

        // Here we can access because it is in the same class
        System.out.println(abstractClass.var_p);
    }
}
