public class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int listSize;



    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if(this.isEmpty()){
            this.tail = newNode;
            this.head = this.tail;
            this.head.setNext(this.tail);
        }
        else{
            newNode.setNext(this.tail);
            this.head.setNext(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }


    public void add(int index,T data){
        Node<T> newNode = new Node<>(data);

        if(index > this.size()){
            throw new IndexOutOfBoundsException("Index bigger than current list size!");
        }

        if(this.isEmpty()){
            this.tail = newNode;
            this.head = this.tail;
            this.head.setNext(this.tail);
        }
        else{

            Node<T> pointer = this.tail;

            for (int i = 0; i < index-1; i++) {
                pointer = pointer.getNext();
            }
            pointer.setNext(newNode);
        }

        this.listSize++;
    }



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

    @Override
    public String toString() {

        String str = "";

        Node<T> pointer = this.tail;
        for (int i = 0; i < this.size(); i++) {
            str += "[Node{data="+pointer.getData()+"}]---->";
            pointer = pointer.getNext();
        }

        str += "(returns to the start)";

        if(this.isEmpty()){
            str = "[Node{Empty List}]";
        }
        return str;
    }


    

}
