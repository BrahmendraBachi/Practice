package CollectionsDemo;

import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(15);

        //prints the size of the vector which is initially created i.e., 10
        System.out.println(v.capacity());

        //if we add again 9 elements (already 1 element is present which is 10)
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);

        //It prints double the previous size i.e., 10*2 = 20
        System.out.println(v.capacity());

        //We can use enhanced for loop to print vector elements
        for (int i : v)
        {
            System.out.println(i);
        }


        // Vector double its capacity every time if it runs out of space i.e., increases 100%

    }

}
