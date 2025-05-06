package exercicios.basico;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Fahrenheit: ");
        double temperaturaFah = entrada.nextDouble();

        double temperaturaCelsius = (temperaturaFah - 32) * 5 / 9;

        System.out.printf("A temperatura convertida é: %.2fº%n", temperaturaCelsius);



    }
}
