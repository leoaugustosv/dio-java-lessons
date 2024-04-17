public class Autodromo {
    public static void main(String[] args) throws Exception {
        
        Carro jeep = new Carro();
        //jeep.ligar();
        jeep.setChassi("ZKL-3918");

        Moto mitsubishi = new Moto();
        //mitsubishi.ligar();
        mitsubishi.setChassi("LIO-0469");

        Veiculo coringa = mitsubishi;

        coringa.ligar();


    }
}
