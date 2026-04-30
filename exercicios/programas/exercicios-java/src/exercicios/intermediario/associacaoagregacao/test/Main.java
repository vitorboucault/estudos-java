package exercicios.intermediario.associacaoagregacao.test;

import exercicios.intermediario.associacaoagregacao.model.Departamento;
import exercicios.intermediario.associacaoagregacao.model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao",2000);
        Funcionario funcionario2 = new Funcionario("Maria",3000);
        Departamento departamento = new Departamento("TI");

        departamento.adicionarFuncionario(funcionario);
        departamento.adicionarFuncionario(funcionario2);

        System.out.println("Folha do departamento de "
                + departamento.getNome()+  ": R$" + departamento.calcularFolha());

    }
}
