package collectionsDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Class {

    public static void main(String[] args) {

        // Set is an interface
        // HashSet is a class which implements Set Interface
        Set<Integer> values = new HashSet();

        System.out.println(values.add(89)); // add() methods adds the value to the Set and returns the
        System.out.println(values.add(67)); // boolean type if the value is added or not i.e., return true
        System.out.println(values.add(90));
        System.out.println(values.add(90)); //returns false because set not allows duplicate elements

        //Enhanced for loop can be used
        for(int i : values){
            System.out.println(i);
        }

        //Values that will print are not in sorted order
        System.out.println("TreeSet Implementation");

        Set<Integer> Tset = new TreeSet();

        //Tree set adds the elements in the sorted way
        System.out.println(Tset.add(89));
        System.out.println(Tset.add(67));
        System.out.println(Tset.add(90));
        System.out.println(Tset.add(90));

        for(int i : Tset)
        {
            System.out.println(i);
        }
    }

}
