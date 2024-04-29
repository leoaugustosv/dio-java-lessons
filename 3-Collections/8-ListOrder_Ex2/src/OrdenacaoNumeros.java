import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {

    private List<Integer> listaNumeros = new ArrayList<Integer>();

    

    public void adicionarNumeros(int...num){
        for (int i : num) {
            listaNumeros.add(i);
        }
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> sortedList = new ArrayList<>(listaNumeros);
        Collections.sort(sortedList);
        return sortedList;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> sortedList = new ArrayList<>(listaNumeros);
        Collections.sort(sortedList, new NumerosComparator());
        return sortedList;
    }


    @Override
    public int compareTo(Integer o) {
        return Integer.compare(o, o);
    }

}

class NumerosComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2, o1);
    }
    
}
