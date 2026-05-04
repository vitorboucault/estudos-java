public class ListaDupla {
    private No inicio;
    private No fim;

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    public void inserirNoFim(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public Integer removerNoInicio() {
        if (inicio == null) {
            return null;
        }

        int valorRemovido = inicio.valor;

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }

        return valorRemovido;
    }

    public Integer removerNoFim() {
        if (fim == null) {
            return null;
        }

        int valorRemovido = fim.valor;

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }

        return valorRemovido;
    }

    public void listarDoInicio() {
        No atual = inicio;

        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void listarDoFim() {
        No atual = fim;

        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}
