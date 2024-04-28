import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumero = new ArrayList<Integer>();

    public SomaNumeros() {
    }

    public void adicionarNumero(int num){
        listaNumero.add(num);
    }

    public void adicionarVariosNumeros(int...num){
        for (int i : num) {
            listaNumero.add(i);
        }
    }

    public int calcularSomaLista(){
        int soma = 0;
        for (Integer num : listaNumero) {
            soma+=num;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        List<Integer> listaOrdenada = new ArrayList<>();
        for (Integer num : listaNumero) {
            listaOrdenada.add(num);
        }
        //Collections.sort(listaOrdenada);
        listaOrdenada.sort(null);
        return listaOrdenada.getLast();
    }

    public int encontrarMenorNumero(){
        List<Integer> listaOrdenada = new ArrayList<>();
        for (Integer num : listaNumero) {
            listaOrdenada.add(num);
        }
        //Collections.sort(listaOrdenada);
        listaOrdenada.sort(Collections.reverseOrder());
        return listaOrdenada.getLast();
    }

    public List<Integer> exibirNumeros(){
        return listaNumero;
    }

    
    
}
