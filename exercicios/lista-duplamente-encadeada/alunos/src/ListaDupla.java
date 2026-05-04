public class ListaDupla {
    private No inicio;
    private No fim;

    public ListaDupla() {
        inicio = null;
        fim = null;
    }

    public void inserirNoFim(Alunos aluno) {
        No novo = new No(aluno);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void inserirNoInicio(Alunos aluno) {
        No novo = new No(aluno);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    public void listarAlunos() {
        No atual = inicio;

        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        while (atual != null) {
            System.out.println(atual.aluno);
            atual = atual.proximo;
        }
    }
}
