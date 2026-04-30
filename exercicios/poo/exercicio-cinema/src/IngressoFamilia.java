public class IngressoFamilia extends Ingresso {
    public int numeroDePessoas;

    public IngressoFamilia(int valor, String nomeDoFilme, boolean dublado, int numeroDePessoas) {
        super(valor, nomeDoFilme, dublado);
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public double valorReal(){
        double total = super.valorReal() * numeroDePessoas;
        return numeroDePessoas > 3 ? total * 0.95 : total;
    }


}
