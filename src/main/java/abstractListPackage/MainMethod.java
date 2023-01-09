package abstractListPackage;


import java.util.AbstractList;

public class MainMethod {


    public static AbstractList_demo list_demo = new AbstractList_demo();

    public static void main(String[] args) {

        String str = new String("Bachi");

        list_demo.add(str);

        System.out.println(list_demo.size());

//        System.out.println(list_demo.get(0));

    }

}
