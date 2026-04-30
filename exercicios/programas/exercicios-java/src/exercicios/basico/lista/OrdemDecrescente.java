package exercicios.basico.lista;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Leia o numero A");
        int n1 = ler.nextInt();
        System.out.println("Leia o numero B");
        int n2 = ler.nextInt();
        System.out.println("Leia o numero C");
        int n3 = ler.nextInt();

        int[] values = {n1, n2, n3};

        Arrays.sort(values);

        for (int i = values.length -1; i >= 0; i--){
            System.out.println(values[i] + 0);
        }


    }
}
