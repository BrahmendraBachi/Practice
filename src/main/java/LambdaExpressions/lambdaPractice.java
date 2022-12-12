package LambdaExpressions;


// Interface which accepts only one method.
@FunctionalInterface
interface A
{
    void add(int a, int b);
}

public class lambdaPractice {

    public static void main(String[] args) {

        //using lambda expression
        A obj = (a, b) -> {
            System.out.println(a + b);
        };
        obj.add(2, 3);


        //using Anonymous inner class
        A obj1 = new A() {
            public void add(int a, int b){
                System.out.println(a + b);
            }

        };
        obj1.add(2, 3);
    }
}

