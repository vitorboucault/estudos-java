package javacore.npolimorfismo.domain;

public class Celular extends Produto {

    public static final double IMPOSTO = 0.175;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        return this.valor * IMPOSTO;
    }
}

