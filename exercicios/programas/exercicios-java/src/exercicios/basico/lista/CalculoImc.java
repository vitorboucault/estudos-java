package exercicios.basico.lista;

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso ");
        double peso = scan.nextDouble();
        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();

        double imc = peso/(altura*altura);

        if (imc<=18.5){
            System.out.println("Abaixo do peso");
        } else if (imc>=18.6 && imc<24.9){
            System.out.println("Peso ideal");
        } else if (imc>=25 && imc<30){
            System.out.println("Levemente acima do peso");
        } else if (imc>=30 && imc<35){
            System.out.println("Obesidade grau 1");
        } else if (imc>=35 && imc<40){
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }
    }
}
