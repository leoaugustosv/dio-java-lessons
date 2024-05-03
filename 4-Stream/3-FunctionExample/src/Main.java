import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> numerosInteiros = Arrays.asList(1, 3, 4, 56, 34, 7, 4, 2);

        // Function<Integer, Integer> dobrarNum = num -> num * 2;

        List<Integer> numerosDobrados = numerosInteiros.stream()
                .map(num -> num * 2)
                .toList();

        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
