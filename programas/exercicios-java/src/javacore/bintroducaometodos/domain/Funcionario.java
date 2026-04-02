package javacore.bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private double[] salarios;
    private int idade;
    private double media = 0;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null){
            return;
        }
        for (double salario : this.salarios) {
                System.out.print("R$" + salario + " | ");
        }
        mediaSalario();
    }

    private void mediaSalario() {
        if (salarios == null) {
            return;
        }

            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        System.out.println("\n\nMedia: " + "R$" + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }
}
