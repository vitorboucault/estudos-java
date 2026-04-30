package exercicios.lista5alunos.domain;

public class Professora extends Pessoa {

    private String disciplina;

    @Override
    public String toString() {
        return "Professora: " + getNome() + " | Disciplina: " + disciplina;
    }

    public Professora(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
