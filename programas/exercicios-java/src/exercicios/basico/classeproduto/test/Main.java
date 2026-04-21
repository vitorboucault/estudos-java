package exercicios.basico.classeproduto.test;

import exercicios.basico.classeproduto.model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto("Tomate",10);
        Produto p3 = new Produto("Tomate", 10, 10);
    }
}
