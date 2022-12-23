package CollectionsDemo;

import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(15);

        System.out.println("\n *** After adding 15 to the vector v the capacity of vector is \n");

        //prints the size of the vector which is initially created i.e., 10
        System.out.println(v.capacity());

        //if we add again 10 elements (already 1 element is present which is 10)
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(8);
        v.add(9);

        //It prints double the previous size i.e., 10*2 = 20
        System.out.println("\n ***After adding 11 elements the capacity changes to 20");

        System.out.println(v.capacity());

        System.out.println("\n *** Printing values of Vector v using enhanced for loop \n");

        //We can use enhanced for loop to print vector elements
        for (int i : v)
        {
            System.out.println(i);
        }


        // Vector double its capacity every time if it runs out of space i.e., increases 100%

        //Vectors dynamically increase memory capacity upto 100% when the vector is running
        // out of space
    }

}
