package lambdaExpressions;


// Interface which accepts only one method.
@FunctionalInterface
interface A
{
    void add(int a, int b);
}

public class LambdaPractice {

    public static void main(String[] args) {

        // If I am using any functional Interface then we can run method in
        // the interface using ** Lambda Expressions and **Anonymous Interface

        //using lambda expression
        A obj = (a, b) -> {

            System.out.println("\n *** using Lambda Expression");
            System.out.println(a + b);
        };
        obj.add(2, 3);


        //using Anonymous inner class
        A obj1 = new A() {
            public void add(int a, int b){

                System.out.println("\n ***using Anonymous Inner class");
                System.out.println(a + b);
            }

        };
        obj1.add(2, 3);
    }
}

