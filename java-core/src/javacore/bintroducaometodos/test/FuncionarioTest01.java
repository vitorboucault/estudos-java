package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Maria");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[] {2000,1000,3000, 4500});
        funcionario.imprimeDados();

        System.out.println(funcionario.getMedia());
    }
}
