public class DoublyLinkedList<T> {
    
    private Node<T> firstNode;
    private Node<T> lastNode;

    private int nodeSize;
    
    public DoublyLinkedList(){
        this.nodeSize = 0;
        this.firstNode = null;
        this.lastNode = null;
    }
    
    public int size(){
        return nodeSize;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        newNode.setNext(null);
        newNode.setPrev(lastNode);

        if(firstNode == null){
            firstNode = newNode;
        }

        if(lastNode != null){
            lastNode.setNext(newNode);
        }

        lastNode = newNode;
        nodeSize++;
    }

    public void remove(int index){
        nodeSize--;
    }


    public void addBefore(int index, T data){
        Node<T> pointer = getNode(index);
        Node<T> newNode = new Node<>(data);

        newNode.setNext(pointer);

        if(newNode.getNext() != null){
            newNode.setPrev(pointer.getPrev());
            newNode.getNext().setPrev(newNode);;
        }
        else{
            newNode.setPrev(lastNode);
            lastNode = newNode;
        }

        if(index == 0){
            firstNode = newNode;
        }
        else{
            newNode.getPrev().setNext(newNode);
        }
        nodeSize++;
    }


    public T get(int index){
        return this.getNode(index).getData();
    }


    private Node<T> getNode(int index){

        if (index > this.nodeSize){
            throw new IndexOutOfBoundsException();
        }

        Node<T> pointer = firstNode;

        for (int i = 0; (i < index) && (pointer != null); i++) {
            pointer = pointer.getNext();
        }

        return pointer; 
    }





}
