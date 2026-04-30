package exercicios.lista5alunos.domain;

public class Aluno extends Pessoa {
    private String matricula;

    @Override
    public String toString() {
        return "Aluno: " + getNome() + " | Matrícula: " + matricula;
    }

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
