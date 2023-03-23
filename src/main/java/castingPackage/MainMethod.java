package castingPackage;

public class MainMethod {

    public static void main(String[] args) {

        Class_A a = new Class_B("Bachi");

        //Upcasting is the process where parent class wants
        //use the method which is used by child with same name
        //then upcasting is used
        a.method1();

        //This is also called as Runtime Polymorphism

//        Class_B b = (Class_B) new Class_A();

//        System.out.println(b.var);

        Class_A obj = new Class_B("HAari");

        System.out.println(obj);


    }

}
