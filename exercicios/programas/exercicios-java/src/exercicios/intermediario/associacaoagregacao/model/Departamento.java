package exercicios.intermediario.associacaoagregacao.model;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolha(){
        double totalFolha = 0;
        for (Funcionario funcionario : funcionarios) {
            totalFolha += funcionario.getSalario();
        }
        return totalFolha;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
