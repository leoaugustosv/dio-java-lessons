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
        this.nodeSize++;
    }

    public void remove(int index){

        if (index > this.nodeSize){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            firstNode = firstNode.getNext();
            if(firstNode != null){
                firstNode.setPrev(null);
            }
        }
        else{
            Node<T> pointer = getNode(index);
            pointer.getPrev().setNext(pointer.getNext());
            if (pointer != lastNode) {
                pointer.getNext().setPrev(pointer.getPrev());                
            }
            else{
                lastNode = pointer;
            }
        }

        this.nodeSize--;
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

    @Override
    public String toString(){
        String str = "";

        Node<T> pointer = firstNode;

        for (int i = 0; i < nodeSize; i++) {
            str += "[Node{data="+pointer.getData()+"}]---->";
            pointer = pointer.getNext();

        }
        str += "null";
        return str;
    }



}
