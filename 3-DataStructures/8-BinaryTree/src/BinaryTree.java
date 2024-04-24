public class BinaryTree<T extends Comparable<T>> {
    
    private Node<T> root;
    
    public BinaryTree(){
        this.root = null;
    }

    public void insert(T data){
        Node<T> newNode = new Node<>(data);
        this.root = insert(root, newNode);
    }

    private Node<T> insert(Node<T> current, Node<T> newNode){
        if(current == null){
            return newNode;
        }
        else if(newNode.getData().compareTo(current.getData()) < 0){
            current.setLeft(insert(current.getLeft(), newNode));
        }
        else{
            current.setRight(insert(current.getRight(), newNode));
        }
        return newNode;
    }

    public void displayInOrder(){
        System.out.println("\n Showing In Order");
        displayInOrder(this.root);
    }

    private void displayInOrder(Node<T> current){
        if(current != null){
            displayInOrder(current.getLeft());
            System.out.println(current.getData() + ", ");
            displayInOrder(current.getRight());
        }
    }

}
