import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14);

        // FORMA 1
        Consumer<Integer> imprimirNumeroPar = num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        };

        listaNumeros.stream().forEach(imprimirNumeroPar);

        // FORMA 2
        listaNumeros.stream().forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                if (t % 2 == 0) {
                    System.out.println(t);
                }
            }

        });
    }
}
