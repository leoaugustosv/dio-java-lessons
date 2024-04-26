import java.util.HashMap;
import java.util.Map;

public class GenericsExampleMap {
    public static void main(String[] args) throws Exception {
        //Without Generics
        Map map = new HashMap();
        map.put("Key1", 10);
        map.put("Key2", "stringValue");

        //With Generics
        Map<String, Integer> mapG = new HashMap<>();
        mapG.put("Key1", 10);
        mapG.put("Key2", 20);


        //Iterating through set with Generics
        for(Map.Entry<String, Integer> entry : mapG.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println("Generics-> Key: "+key+" | Value: "+value);
        }

        //Iterating through set without Generics
        for(Object obj: map.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String key = entry.getKey().toString();
            Object value = entry.getValue();
            System.out.println("Without generics-> Key: "+key+" | Value: "+value);
        }
    }
}
