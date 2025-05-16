public non-sealed class Gerente extends Empregado{

    private String login;

    private String senha;

    private double comissao;

    public Gerente(String codigo,
                   String nome,
                   String endereco,
                   int idade,
                   double salario,
                   String login,
                   String senha,
                   double comissao) {
        super(codigo,nome,endereco,idade, salario);
        this.login = login;
        this.senha = senha;
        this.comissao = comissao;
    }

    public Gerente() {

    }

    @Override
    public String getCodigo() {
        return "GERENTE" + this.codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getCalcularSalarioTotal() {
        return this.salario + this.comissao;
    }



}
