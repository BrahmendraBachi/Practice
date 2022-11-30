package Trees;

public class BinaryTreeMain {

    public static void main(String[] args){
//        System.out.println("Success");

        BTree root = new BTree();

        int[] arr = {3, 2, 1, 6, 7};

        root.data = arr[0];

        for(int i = 0; i < arr.length; i ++)
        {
//            System.out.println(root);
            root.addChild(arr[i], root);
        }

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.left.left.data);
        System.out.println(root.right.data);
        System.out.println(root.right.right.data);
    }

}
