public class SistemaIBGE {
    public static void main(String[] args) {
            Enum.EstadoBrasileiro eb = Enum.EstadoBrasileiro.CEARA;

            System.out.println(eb.getSigla());
            System.out.println(eb.getNome());
            System.out.println(eb.getNomeMaiusculo());
            System.out.println(eb.getIbge());

    }
}
