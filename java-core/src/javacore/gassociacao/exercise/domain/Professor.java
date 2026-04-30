package javacore.gassociacao.exercise.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("-------");
        System.out.println("Nome do professor: " + this.nome);
        if(this.seminarios == null) return;
        System.out.println("\n---Seminario cadastrados---");

        for (Seminario seminario : this.seminarios){
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());

            if (seminario.getAluno() == null) continue;

            System.out.println("\n---Alunos---");
            for (Aluno aluno : seminario.getAluno()) {
                System.out.println("Aluno: " + aluno.getNome() + " | " + aluno.getIdade());
            }

        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
