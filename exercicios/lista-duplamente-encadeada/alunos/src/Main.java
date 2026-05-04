public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.inserirNoFim(new Alunos("Ana", 18));
        lista.inserirNoFim(new Alunos("Bruno", 19));
        lista.inserirNoFim(new Alunos("Carlos", 20));
        lista.inserirNoFim(new Alunos("Diana", 18));
        lista.inserirNoFim(new Alunos("Eduardo", 21));

        lista.inserirNoInicio(new Alunos("Marina", 22));

        lista.inserirNoFim(new Alunos("João", 23));

        System.out.println("=== Lista com 7 alunos ===");
        lista.listarAlunos();
    }
}
