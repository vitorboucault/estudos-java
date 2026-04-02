package javacore.bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public double[] salarios;
    public int idade;

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
        double media = 0;
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        System.out.println("\n\nMedia: " + media);
    }
}
