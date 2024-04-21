public class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int listSize;


    public int size(){
        return this.listSize;
    }


    public boolean isEmpty(){
        return this.listSize != 0 ? false : true;
    }

    

}
