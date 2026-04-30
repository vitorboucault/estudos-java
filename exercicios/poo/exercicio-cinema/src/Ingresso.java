public class Ingresso {

    private int valor;

    private String nomeDoFilme;

    private boolean dublado;

    private int numeroDePessoas;

    public Ingresso(int valor, String nomeDoFilme, boolean dublado) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.dublado = dublado;
    }

    public double valorReal() {
        return valor;
    }
}
