public class Vendedor extends Usuario {
    public int quantidadeDeVendas = 0;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void realizarVenda(){
        this.quantidadeDeVendas++;
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }
}
