public class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int listSize;


    public T get(int index){
        return this.getNode(index).getData();
    }

    private Node<T> getNode(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("Empty list!");
        }

        if(index==0){
            return this.tail;
        }
        else{
            Node<T> pointer = this.tail;

            for (int i = 0; i < index && pointer != null; i++) {
                pointer = pointer.getNext();
            }
            return pointer;
        }
    }


    public int size(){
        return this.listSize;
    }


    public boolean isEmpty(){
        return this.listSize != 0 ? false : true;
    }



}
