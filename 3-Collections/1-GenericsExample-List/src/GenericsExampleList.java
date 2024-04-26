import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) throws Exception {
        //Without Generics
        List list = new ArrayList();
        list.add("Element 1");
        list.add(10); //Allows any type

        //With Generics
        List<String> listG = new ArrayList<>();
        listG.add("Element A");
        listG.add("Element B");
        //listG.add(10);


        //Iterating through list with Generics
        for(String element: listG){
            System.out.println("With Generics: "+element);
        }

        //Iterating through list with Generics
        for(Object element: list){
            String str = element.toString();
            System.out.println("Without Generics: "+str);
        }

    }
}
