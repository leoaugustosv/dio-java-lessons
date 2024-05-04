import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14);

        // Consumer<Integer> imprimirNumeroPar = num -> {
        // if (num % 2 == 0) {
        // System.out.println(num);
        // }
        // };

        listaNumeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}
