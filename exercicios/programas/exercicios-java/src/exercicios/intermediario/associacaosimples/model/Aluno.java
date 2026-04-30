package exercicios.intermediario.associacaosimples.model;

public class Aluno {
    private String nome;
    private Seminario seminario;

    public Aluno(String nome) {
        this.nome = nome;
    }
    public Aluno(String nome, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void imprimirSeminario(){
        System.out.println("=============");
        if (this.seminario != null) {
            System.out.println(this.nome + " esta no seminario " +seminario.getTitulo());
        } else {
            System.out.println(this.nome + " não está vinculado a nenhum seminário.");
        }
    }

    public void vincularSeminario(Seminario seminario){
        if (seminario == null) {
            this.seminario = null;
        } else if (this.seminario != null) {
            System.out.println("Aluno ja matriculado em um seminario");
        } else {
            this.seminario = seminario;
            seminario.adicionarAluno(this.nome);
        }
    }
}
