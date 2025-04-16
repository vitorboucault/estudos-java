import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        Scanner teclado = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário

        System.out.println("Digite o número da agência: ");
        int numeroConta = teclado.nextInt();

        System.out.println("Digite o número da conta: ");
        String numeroAgencia = teclado.next();

        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();

        System.out.println("Digite o seu saldo: ");
        Double saldo = teclado.nextDouble();

        teclado.close();
                // Exibir a mensagem da conta criada

        System.out.print("Olá, " + nome + ", obrigado por criar uma conta em nosso banco! ");

        System.out.print("Sua agência é: " + numeroAgencia + " conta: " + numeroConta + " e seu saldo de R$"   + saldo);

        System.out.print(" já está disponível para saque.");


    }
}
