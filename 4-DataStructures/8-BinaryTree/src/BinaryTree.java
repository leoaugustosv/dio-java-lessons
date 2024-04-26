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

    public void displayPostOrder(){
        System.out.println("\n Showing Post Order");
        displayInOrder(this.root);
    }

    private void displayPostOrder(Node<T> current){
        if(current != null){
            displayPostOrder(current.getLeft());
            displayPostOrder(current.getRight());
            System.out.println(current.getData() + ", ");
        }
    }

    public void displayPreOrder(){
        System.out.println("\n Showing Pre Order");
        displayPreOrder(this.root);
    }

    private void displayPreOrder(Node<T> current){
        if(current != null){
            System.out.println(current.getData() + ", ");
            displayPreOrder(current.getLeft());
            displayPreOrder(current.getRight());
        }
    }


    public void remove(T data){
        try {
            Node<T> current = this.root;
            Node<T> parent = null;
            Node<T> child = null;
            Node<T> temp = null;

            while (current != null && !current.getData().equals(data)) {
                parent = current;
                if(data.compareTo(current.getData()) < 0){
                current = current.getLeft();
                }
                else{
                current = current.getRight();
                }
            }

            if (current == null) {
                System.out.println("Content not found --Try");
            }


            if(parent == null){
                if(current.getRight() == null){
                    this.root = current.getLeft();
                }else if(current.getLeft() == null){
                    this.root = current.getRight();
                }else {
                    for(temp = current, child = current.getLeft();
                        child.getRight() != null;
                        temp = child, child = child.getLeft()
                    ){
                        if(child != current.getLeft()){
                            temp.setRight(child.getLeft());
                            child.setLeft(root.getLeft());
                        }
                    }
                    child.setRight(root.getRight());
                    root = child;
                }
            }else if(current.getRight() == null){
                if(parent.getLeft() == current){
                    parent.setLeft(current.getLeft());
                }else {
                    parent.setRight(current.getLeft());
                }
            }else if(current.getLeft() == null){
                if(parent.getLeft() == current){
                    parent.setLeft(current.getRight());
                }else {
                    parent.setRight(current.getRight());
                }
            }else{
                for(
                        temp = current, child = current.getLeft();
                        child.getRight() != null;
                        temp = child, child = child.getRight()
                ){
                    if(child != current.getLeft()){
                        temp.setRight(child.getLeft());
                        child.setLeft(current.getLeft());
                    }
                    child.setRight(current.getRight());
                    if(parent.getLeft() == current){
                        parent.setLeft(child);
                    }else{
                        parent.setRight(child);
                    }
                }
            }



        } catch (NullPointerException e) {
           System.out.println("Content not found --Catch");
        }
    }


}
