import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // DESAFIO: Calcule a média dos números maiores que 5

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().filter(num -> num > 5).mapToInt(num -> num).average().getAsDouble());

    }
}
