package exercicios.basico.revisao;

import java.util.Scanner;

public class Natacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        idade = entrada.nextInt();
        classifica(idade);
    }

    public static void classifica(int id){
        if (id < 5) {
            System.out.println("Não tem categoria para essa idade");
        }else {
            if (id <= 7) {
                System.out.println("Infantil A");
            }else {
                if (id <= 10) {
                    System.out.println("Infantil B");
                }else{
                    if (id <= 13) {
                        System.out.println("Infantil C");
                    }else{
                        System.out.println("Senior");
                    }
                }
            }
        }
    }
}
