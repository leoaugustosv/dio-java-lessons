import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {
    public static void main(String[] args) throws Exception {
        //Without Generics
        Set set = new HashSet();
        set.add("Element 1");
        set.add(10); //Allows any type

        //With Generics
        Set<String> setG = new HashSet<>();
        setG.add("Element A");
        setG.add("Element B");
        //listG.add(10);


        //Iterating through set with Generics
        for(String element: setG){
            System.out.println("With Generics: "+element);
        }

        //Iterating through set without Generics
        for(Object element: set){
            String str = element.toString();
            System.out.println("Without Generics: "+str);
        }

    }
}
