public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {

            //e.printStackTrace();
            System.out.println("O CEP digitado não está em formato válido. Por favor tente novamente.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();
            
            return "23.765-064";
        
    }
}
