package javacore.heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Bloco estático dentro de funcionario");
    }
    {
        System.out.println("Bloco nao estatico de funcionario 1");
    }
    {
        System.out.println("Bloco nao estatico de funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
