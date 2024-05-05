import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // DESAFIO: Verifique se todos os números da lista são positivos

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().allMatch(num -> num > 0));
    }
}
