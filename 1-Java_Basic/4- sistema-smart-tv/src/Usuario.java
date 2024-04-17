public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

        smartTv.exibirStatusTV();
        
        smartTv.ligar();
        smartTv.aumentarVolume();
        

        smartTv.mudarCanal(11);
        smartTv.exibirStatusTV();
    }

}
