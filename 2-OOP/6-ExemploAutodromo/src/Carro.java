public class Carro extends Veiculo {

    public void ligar(){
        conferirCombustivel();
        ajustarRetrovisor();
        System.out.println("CARRO LIGADO!");
    }

    private void conferirCombustivel(){
        System.out.println("COMBUSTÍVEL CONFERIDO: TANQUE CHEIO!");
    }

    private void ajustarRetrovisor(){
        System.out.println("RETROVISORES AJUSTADOS!");
    }



}
