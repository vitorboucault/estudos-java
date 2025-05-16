public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(int valor, String nomeDoFilme, boolean dublado) {
        super(valor, nomeDoFilme, dublado);
    }

    @Override
    public double valorReal() {
        return super.valorReal() / 2;
    }
}
