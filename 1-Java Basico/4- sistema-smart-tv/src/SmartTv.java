public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void exibirStatusTV(){
        System.out.println("\n---EXIBINDO STATUS---\n");
        System.out.println("Televisão ligada? " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume + "%");
        System.out.println("\n---FIM---\n");
    }


    public void ligar() {
        ligada = true;
        System.out.println("TV ligada!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada!");
    }

    public void aumentarVolume(){
        if ((volume + 10) > 100){
            volume = 100;
        }
        else {
            volume=volume+10;  
        }
        System.out.println("Volume aumentado para " + volume);
        
    }

    public void diminuirVolume(){
        if ((volume - 10) < 0){
            volume = 0;
        }
        else {
            volume=volume-10;  
        }
        System.out.println("Volume diminuído para " + volume);
        
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Canal alterado para " + novoCanal);
    }

}
