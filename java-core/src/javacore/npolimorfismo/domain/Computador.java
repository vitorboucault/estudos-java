package javacore.npolimorfismo.domain;

public class Computador extends Produto {

    public static final double IMPOSTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        return this.valor * IMPOSTO;
    }
}
