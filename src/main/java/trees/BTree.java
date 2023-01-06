package trees;

public class BTree {

    public int data;

    public BTree left;

    public BTree right;

    public BTree()
    {
        super();
    }

    public void addChild(int data, BTree root) {

        if(data < root.data)
        {
            if(root.left != null)
            {
                addChild(data, root.left);
            }
            else{
                BTree node = new BTree();
                node.data = data;
                root.left = node;
            }
        }
        if(data > root.data)
        {
            if(root.right != null)
            {
                addChild(data, root.right);
            }
            else{
                BTree node = new BTree();
                node.data = data;
                root.right = node;
            }
        }
    }
}
