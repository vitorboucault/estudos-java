public class Gerente extends Usuario {

    private boolean administrador = true;

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório de financeiro gerado pelo gerente: " + getNome());
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas (acesso de gerente)...");
    }


}
