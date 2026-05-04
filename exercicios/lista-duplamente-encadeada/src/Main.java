import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaEncadeada l1 = new ListaEncadeada();
        ListaEncadeada l2 = new ListaEncadeada();
        ListaEncadeada comuns = new ListaEncadeada();

        System.out.print("Quantos nomes deseja inserir na L1? ");
        int n1 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n1; i++) {
            System.out.print("Digite o nome " + (i + 1) + " da L1: ");
            String nome = sc.nextLine();
            l1.inserirFim(nome);
        }

        System.out.print("Quantos nomes deseja inserir na L2? ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n2; i++) {
            System.out.print("Digite o nome " + (i + 1) + " da L2: ");
            String nome = sc.nextLine();
            l2.inserirFim(nome);
        }

        No atual = l1.inicio;
        while (atual != null) {
            if (l2.contem(atual.nome) && !comuns.contem(atual.nome)) {
                comuns.inserirFim(atual.nome);
            }
            atual = atual.prox;
        }

        System.out.println("\nNomes comuns entre L1 e L2:");
        comuns.mostrar();

        sc.close();
    }
}