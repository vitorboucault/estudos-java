public class Atendente extends Usuario {

    public int valorEmCaixa = 0;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }
    public void receberPagamento(double valor) {
        if (valor > 0){
            this.valorEmCaixa += valor;
            System.out.println("Pagamento de R$ " + valor
                    + " recebido. Valor em caixa: R$ " + this.valorEmCaixa);
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }
    public void fecharCaixa() {
        System.out.println("Fechando caixa. Valor final em caixa: R$ " + this.valorEmCaixa);
        this.valorEmCaixa = 0;
    }
}
