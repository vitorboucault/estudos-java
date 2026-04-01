package javacore.bintroducaometodos.domain;

public class Calculadora {
    public void calcularSoma(){
        System.out.println(10+10);
    }

    public void calcularSubtracao(){
        System.out.println(10-10);
    }

    public void calcularMultiplicacao(double numUm, float numDois){
        System.out.println("O resultado é: " + numUm * numDois);
    }

    public void calcularDivisao(double numUm, double numDois){
        if(numDois == 0){
            System.out.println("Não é possível dividir por zero");
            return;
        }
        System.out.println(numUm / numDois);
    }

    public void alterarDoisNumeros (int numUm, int numDois){
        numUm = 99;
        numDois = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("NumUm: " + numUm);
        System.out.println("NumDois: " + numDois);
    }

}
