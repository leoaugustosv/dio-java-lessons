public class Main {
    public static void main(String[] args) throws Exception {
        SomaNumeros numeros1 = new SomaNumeros();
        numeros1.adicionarVariosNumeros(4,5,5,7,8,9,14,15,15,125,12,13,3,15,5,7,4,7);
        
        System.out.println(numeros1.exibirNumeros());

        System.out.println(numeros1.encontrarMaiorNumero());
        System.out.println(numeros1.encontrarMenorNumero());

        System.out.println(numeros1.calcularSomaLista());
        

        SomaNumeros numeros2 = new SomaNumeros();
        numeros2.adicionarVariosNumeros(3,5,2);

        System.out.println(numeros2.calcularSomaLista());
    }
}
