import java.util.Scanner;

public class Main {

    private static final Scanner terminal = new Scanner(System.in);

    private static ContaBancaria conta;

    public static void main(String[] args) {

        System.out.println("Digite seu deposito inicial para abrir sua conta: ");
        double depositoInicial = terminal.nextDouble();
        conta = new ContaBancaria(depositoInicial);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar saldo em conta");
            System.out.println("2 - Consultar limite do cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Consultar total disponível");
            System.out.println("7 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = terminal.nextInt();

            switch (opcao) {
                case 1 -> consultarSaldo();
                case 2 -> consultarLimiteChequeEspecial();
                case 3 -> depositarDinheiro();
                case 4 -> sacarDinheiro();
                case 5 -> pagarUmBoleto();
                case 6 -> consultarTotal();
                case 7 -> verificarUsoChequeEspecial();
                case 0 -> System.out.println("Finalizando...");
                default -> System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
        System.out.println("\n=== Programa encerrado ===");
        terminal.close();
    }
    private static void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", conta.consultarSaldoEmConta());
    }
    private static void consultarLimiteChequeEspecial() {
        System.out.printf("Seu limite do cheque especial é: R$ %.2f%n", conta.consultarLimiteChequeEspecial());
    }

    private static void depositarDinheiro() {
        System.out.println("Qual valor deseja depositar? ");
        double valor = terminal.nextDouble();
        conta.depositar(valor);
    }
    private static void sacarDinheiro() {
        System.out.println("Qual valor deseja sacar? ");
        double valor = terminal.nextDouble();
        conta.sacar(valor);
    }
    private static void pagarUmBoleto() {
        System.out.println("Qual o valor do boleto deseja pagar? ");
        double valor = terminal.nextDouble();
        conta.pagarBoleto(valor);
    }
    private static void consultarTotal() {
        System.out.printf("Seu saldo em conta junto com o cheque especial" +
                " é: R$ %.2f%n", conta.consultarTotalDisponivel());
    }
    private static void verificarUsoChequeEspecial() {
        System.out.printf("Você está usando R$ %.2f do cheque especial.%n", conta.consultarChequeEspecialUsado());
    }
}
