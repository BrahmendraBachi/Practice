package constructorsPackage.noArgsConstrucorPackage;

public class MainMethod {

    public static void main(String[] args) {

        Class_A a = new Class_A();

        // prints the Class name of the a
        System.out.println(a.Class_A() + "\n");

        System.out.println(a.name);
        System.out.println(a.emailId);
        System.out.println(a.phoneNumber);
        System.out.println(a.city);

    }

}
