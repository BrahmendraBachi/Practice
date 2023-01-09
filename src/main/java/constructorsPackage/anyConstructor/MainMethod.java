package constructorsPackage.anyConstructor;

public class MainMethod {

    public static void main(String[] args) {

        Class_A class_a = new Class_A(
                "Hari", "abc@gmail.com", "58758769576", "Kavali"
        );

        System.out.println(class_a.name);
        System.out.println(class_a.city);
        System.out.println(class_a.emailId);
        System.out.println(class_a.phoneNumber);

        //Prints Null because we haven't added this parameter in the constructor
        System.out.println(class_a.address);

        // class_a1 is calls constructor with parameters name and address
        Class_A class_a1 = new Class_A("Bachi", "Nellore");


        System.out.println(class_a.name);
        System.out.println(class_a.address);



    }

}
