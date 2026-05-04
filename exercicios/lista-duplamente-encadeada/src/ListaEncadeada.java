public class ListaEncadeada {
    No inicio;

    public void inserirFim(String nome) {
        No novo = new No(nome);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No atual = inicio;
        while (atual.prox != null) {
            atual = atual.prox;
        }
        atual.prox = novo;
    }

    public boolean contem(String nome) {
        No atual = inicio;
        while (atual != null) {
            if (atual.nome.equalsIgnoreCase(nome)) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    public void mostrar() {
        No atual = inicio;
        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        while (atual != null) {
            System.out.println(atual.nome);
            atual = atual.prox;
        }
    }
}
