public class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public void remove(int index){
        if(index > this.listSize){
            throw new IndexOutOfBoundsException("Index bigger than the list current size!");
        }

        Node<T> pointer = this.tail;

        if(index == 0){
            this.tail = this.tail.getNext();
            this.head.setNext(this.tail);
        }
        else if(index==1){
            this.tail.setNext(this.tail.getNext().getNext());
        }
        else{
            for (int i = 0; i < index-1; i++) {
                pointer = pointer.getNext();
            }
            pointer.setNext(pointer.getNext().getNext());
        }
        this.listSize--;
    }

    public T get(int index){
        return this.getNode(index).getData();
    }

    private Node<T> getNode(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("List is currently empty!");
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
