public class Node<T> {
    private Node<T> next;

    private T data;
    public Node(T data){
        this.next = null;
        this.data = data;
    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }

    

    
}
