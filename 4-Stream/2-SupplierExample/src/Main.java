import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> saudacaoLista = Stream.generate(saudacao)
                .limit(5)
                // .collect(Collectors.toList());
                .toList();

        // Imprimir as saudações geradas

        // FORMA 1
        saudacaoLista.stream().forEach(s -> System.out.println(s));

        // FORMA 2
        saudacaoLista.forEach(System.out::println);
    }
}
