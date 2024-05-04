import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> listaPalavras = Arrays.asList("Chave", "Carregador", "Cobertor", "Garrafa", "Comida");

        listaPalavras.stream()
                .filter(p -> p.length() > 5)
                // .forEach(n -> System.out.println(n));
                .forEach(System.out::println);

    }
}
