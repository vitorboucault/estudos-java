public class Main {
    public static void main(String[] args) {
        MeiaEntrada meia = new MeiaEntrada(40, "Minecraft", true);
        System.out.println("Valor do ingresso é: " + meia.valorReal());

        IngressoFamilia familia = new IngressoFamilia(20, "Hurry Up", true, 10);
        System.out.println("Valor do ingresso: " + familia.valorReal());
    }
}
