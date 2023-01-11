package enumPackage;

public class EnumPractice {
    public static void main(String[] args) {

        Mobile1 mobile1 = Mobile1.APPLE;

        switch (mobile1){
            case APPLE:
                System.out.println(mobile1 + " Mobile");
        }

        System.out.println(Mobile2.APPLE.getPrice());

    }
}

/*
class Mobile1{
    static final Mobile1 APPLE = new Mobile1();
    static final Mobile1 SAMSUNG = new Mobile1();

    static final Mobile1 REDMI = new Mobile1();



}
*/

//Every enum creates a class with the name of enum as in the above way
//enum extends Enum Class and multiple inheritance cannot be done but can implement n number of interfaces
enum Mobile1{
    APPLE, SAMSUNG, REDMI;

    Mobile1(){
//        System.out.println("Mobile is triggered");
    }
}

enum Mobile2{
    APPLE(100), SAMSUNG(100), REDMI(80);

    int price;

    // we can write constructors in enum
    Mobile2(int p){
        price = p;
    }

    //methods can be written in enums
    public int getPrice(){
        return price;
    }
}
