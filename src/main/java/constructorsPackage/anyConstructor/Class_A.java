package constructorsPackage.anyConstructor;

public class Class_A {

    String name;

    String emailId;

    String phoneNumber;

    String city;

    String address;

    private String nickname = "Bachi";

    // Here we have declared constructor with only few parameters not all
    public Class_A(String name, String emailId, String phoneNumber, String city){
        this.name = name;
        this.emailId = emailId;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    //We Can Overload the constructor
    public Class_A(String name, String address){
        this.name = name;
        this.address = address;
    }




}
