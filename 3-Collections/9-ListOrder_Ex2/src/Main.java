public class Main {
    public static void main(String[] args) throws Exception {
        OrdenacaoNumeros listaNum1 = new OrdenacaoNumeros();
        listaNum1.adicionarNumeros(6,23,7,83,426,7345,26,4,356,887,2);
        
        System.out.println("Ascendente: "+listaNum1.ordenarAscendente());
        System.out.println("Descendente: "+listaNum1.ordenarDescendente());
    }
}
