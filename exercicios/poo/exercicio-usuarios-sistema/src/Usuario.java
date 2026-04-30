public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;

    public Usuario(String nome, String email, String senha, boolean administrador) {
    }

    public String realizarLogin(){
        return "Login realizado";
    }
    public String realizarLogoff(){
        return "Logoff realizado";
    }
    public String alterarNome() {
        return "Nome alterado";
    }
    public String alterarEmail() {
        return "Email alterado";
    }
    public String alterarSenha() {
        return "Senha alterada";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
