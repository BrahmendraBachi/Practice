package StreamsDemo;

import CollectionsDemo.CollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamClass {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();

        values.add(10);

        values.add(8);

        System.out.println("Before Sorting");

        //forEach is a streamsAPI which uses Lambda Expression
        values.forEach(System.out::println);


        //adds at the index
        values.add(1, 5);



        //Sorts the array
        Collections.sort(values);

        System.out.println("After Sorting");

        values.forEach(System.out::println);

    }

}
