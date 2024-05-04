import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> listaNums = Arrays.asList(3, 6, 10);

        int resultado = listaNums.stream()
                // .reduce(0, (n1, n2) -> n1 + n2);
                .reduce(0, Integer::sum);

        System.out.println(resultado);
    }
}
