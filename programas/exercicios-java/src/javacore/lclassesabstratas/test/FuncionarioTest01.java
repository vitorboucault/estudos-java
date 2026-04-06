package javacore.lclassesabstratas.test;

import javacore.lclassesabstratas.domain.Desenvolvedor;
import javacore.lclassesabstratas.domain.Funcionario;
import javacore.lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("jose", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("joao", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprimir();
        desenvolvedor.imprimir();

    }



}
