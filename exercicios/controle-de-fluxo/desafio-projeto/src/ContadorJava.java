import java.util.InputMismatchException;
import java.util.Scanner;

public class ContadorJava {
    public static void main(String[] args) {

        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite apenas números inteiros.");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        for (int i = 1; i <= (parametroDois - parametroUm);i++) {
            System.out.println("Imprimindo o número " + i);
        }
        //realizar o for para imprimir os números com base na variável contagem
    }
}