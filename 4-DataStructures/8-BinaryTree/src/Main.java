import model.Obj;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Obj> myBinaryTree = new BinaryTree<>();

        myBinaryTree.insert(new Obj(13));
        myBinaryTree.insert(new Obj(10));
        myBinaryTree.insert(new Obj(25));
        myBinaryTree.insert(new Obj(2));
        myBinaryTree.insert(new Obj(12));
        myBinaryTree.insert(new Obj(20));
        myBinaryTree.insert(new Obj(31));
        myBinaryTree.insert(new Obj(29));
        myBinaryTree.insert(new Obj(32));
        myBinaryTree.remove(new Obj(32));

        myBinaryTree.displayInOrder();
        myBinaryTree.displayPreOrder();
        myBinaryTree.displayPostOrder();

    }
}
