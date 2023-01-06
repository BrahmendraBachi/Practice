package oopsPractice.inheritancePractice;

public class Class_A extends Class_B{

    public static final String name = "Bachi";

    public String namefromA(){
        System.out.println("from Class_A");
        return name;
    }

    public String namefromB(){

        System.out.println("from Class_B");
        //super key word references to the parent class
        return super.name;
    }

    public static String methodA(){

        return "From Class_A";

    }

    public String commonMethod(){
        return "from Class_A";
    }

    public String commonMethodFromClass_B(){
        System.out.println("Super keyword calls the parent Class_B");
        return super.commonMethod();
    }



}
