package basicInformationPackage;

public class ProtectedExample {

    String name;

    String emailId;

    //This variable cannot be used outside the package as it is protected
    protected String nickname;

    //This protected constructor cannot be used outside the package
    protected ProtectedExample(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }
}


