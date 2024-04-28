public class Main {
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoas fila1 = new OrdenacaoPessoas();
        fila1.adicionarPessoa("João", 18, 1.80);
        fila1.adicionarPessoa("Maria", 30, 1.66);
        fila1.adicionarPessoa("Eduardo", 17, 1.78);
        fila1.adicionarPessoa("Carla", 25, 1.73);

        
        //System.out.println(fila1.exibirLista());
        //System.out.println(fila1.ordenarPorAltura());
        System.out.println(fila1.ordenarPorIdade());
    }
}
