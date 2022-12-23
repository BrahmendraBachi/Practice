package CollectionsDemo;

import java.util.*;

public class CollectionClass {

    public static void main(String[] args) {

        // Can take any object
        List values = new ArrayList();

        //adds integer value to the values list
        values.add(10);

        //and adds String value to the values list
        values.add("Bachi");

        usageOfIterator(values);

        for(Object ob : values){
            System.out.println(ob);
        }

        //using Generics we can exclude this issue
        usingGenerics();

        // As T in Container<T> is any type, we can create an object of Container class with type Integer
        Container<Integer> obj = new Container<>();

        //I am just declaring Value as 9 which is an integer type
        obj.value = 9;

        //prints Integer class type
        obj.show();

        //as we can create an Object with String also
        Container<String> strObj = new Container<>();

        strObj.value = "Bachi";

        strObj.show();

    }

    private static void usageOfIterator(List values) {

        Iterator<Object> it = values.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    private static void usingGenerics() {

        //  <> represents generics
        List<Integer> values = new ArrayList<>();

        //takes only integers as object
        values.add(1);
        values.add(2);

        for(int i : values){
            System.out.println(i);
        }
    }


}

//Using generics we can declare a Type T(which we can use T as any type).
class Container<T>{

    T value;

    void show(){
        //prints Integer type class
        System.out.println(value.getClass().getName());
    }
}

