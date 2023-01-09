package constructorsPackage.NoConstructor;

public class MainMethod {

    public static void main(String[] args) {

        //As we have not declared any constructor
        // But java compiler assigns a default NoArgsConstructor
        Class_A a = new Class_A();

        System.out.println(a.name);
        System.out.println(a.emailId);
        System.out.println(a.phoneNumber);
        System.out.println(a.city);
    }

}
