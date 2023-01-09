package constructorsPackage.allArgsConstructorPackage;

public class MainMethod {

    public static void main(String[] args) {
        Class_A class_a = new Class_A
                ("Bachi", "abc@gmail.com", "6303621185", "Kavali");

        // prints all the details
        System.out.println(class_a.name);
        System.out.println(class_a.city);
        System.out.println(class_a.phoneNumber);
        System.out.println(class_a.emailId);

    }

}
