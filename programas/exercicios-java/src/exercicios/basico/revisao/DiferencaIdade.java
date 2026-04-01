package exercicios.basico.revisao;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira idade ");
        int idadeUm = entrada.nextInt();
        System.out.println("Digite a segunda idade ");
        int idadeDois = entrada.nextInt();
        int diferenca = (idadeUm - idadeDois);
        System.out.println("A diferença de idade é " + diferenca);
    }
}
