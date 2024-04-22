public class Main {
    public static void main(String[] args){
        CircularLinkedList<String> myCircularLinkedList = new CircularLinkedList<>();


        System.out.println(myCircularLinkedList);
        myCircularLinkedList.add("c0");
        myCircularLinkedList.add("c1");
        myCircularLinkedList.add("c2");
        
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add(1, "cnew");

        System.out.println(myCircularLinkedList);

        myCircularLinkedList.remove(1);
       
        System.out.println(myCircularLinkedList);
        
        for (int i = 0; i < 11; i++) {
            System.out.println(myCircularLinkedList.get(i));
        }
        
        
    }
}
