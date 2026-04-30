import java.util.Scanner;

public class Main {
    private static final Scanner terminal = new Scanner(System.in);

    private final static MaquinaDeBanho maquinaDeBanho = new MaquinaDeBanho();

    public static void main(String[] args) {

        int resposta = -1;
        do{
            terminal.useDelimiter("\\n");
            System.out.println("====Escolha uma das opções====");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verificar água da maquina");
            System.out.println("5 - Verificar shampoo da maquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            resposta = terminal.nextInt();

            switch(resposta){

                case 1 -> maquinaDeBanho.darBanho();
                case 2 -> abastecerAgua();
                case 3 -> abastecerShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> verificarSeTemPetNoBanho();
                case 7 -> colocarPetNaMaquina();
                case 8 -> maquinaDeBanho.retirarPet();
                case 9 -> maquinaDeBanho.limparMaquina();
                default -> System.exit(0);

            }

        }while (true);
    }

    private static void abastecerAgua() {
        System.out.println("Tentando colocar água");
        maquinaDeBanho.adicionarAgua();
    }


    private static void abastecerShampoo() {
        System.out.println("Tentando colocar shampoo");
        maquinaDeBanho.adicionarShampoo();
    }

    private static void verificarAgua() {
        var quantidade = maquinaDeBanho.getAgua();
        System.out.println("A maquina está no momento com " + quantidade + " de água");
    }

    private static void verificarShampoo() {
        var quantidade = maquinaDeBanho.getShampoo();
        System.out.println("A maquina está no momento com " + quantidade + " de shampoo");
    }

    private static void verificarSeTemPetNoBanho() {
        var temPet = maquinaDeBanho.temPet();
        System.out.println(temPet ? "Tem pet na maquina" : "Não tem pet na maquina");
    }

    public static void colocarPetNaMaquina(){
        var nome = "";
        while (nome == null || nome.isEmpty()) {
            System.out.print("Digite o nome do pet: ");
            nome = terminal.next();
        }

        var pet = new Pet(nome);
        maquinaDeBanho.setPet(pet);
    }

}
