import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // DESAFIO: Imprima a soma dos números pares da lista

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(
                numeros.stream()
                        .filter(num -> num % 2 == 0)
                        .reduce(0, (num1, num2) -> num1 + num2));

    }
}
