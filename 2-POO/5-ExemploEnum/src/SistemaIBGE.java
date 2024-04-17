public class SistemaIBGE {
    public static void main(String[] args) throws Exception {
        // for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
        //     System.out.println(e.getSigla() + " - " + e.getNome());
        // }

        EstadoBrasileiro sp = EstadoBrasileiro.SAO_PAULO;

        System.out.println(sp.getNome());
        System.out.println(sp.getSigla());
        System.out.println(sp.getNomeMaiusculo());
        System.out.println(sp.getIBGE());
    }
}
