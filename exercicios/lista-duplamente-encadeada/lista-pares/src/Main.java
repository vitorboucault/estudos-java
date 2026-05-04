public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        for (int i = 1; i <= 29; i += 2) {
            lista.inserirNoFim(i);
        }

        System.out.println("Lista do início para o fim:");
        lista.listarDoInicio();

        System.out.println("Lista do fim para o início:");
        lista.listarDoFim();

        System.out.println("\nInserindo 99 no início:");
        lista.inserirNoInicio(99);
        lista.listarDoInicio();

        System.out.println("Inserindo 31 no fim:");
        lista.inserirNoFim(31);
        lista.listarDoInicio();

        System.out.println("\nRemovendo do início: " + lista.removerNoInicio());
        lista.listarDoInicio();

        System.out.println("Removendo do fim: " + lista.removerNoFim());
        lista.listarDoInicio();

        System.out.println("\nLista do fim para o início após remoções:");
        lista.listarDoFim();
    }
}
