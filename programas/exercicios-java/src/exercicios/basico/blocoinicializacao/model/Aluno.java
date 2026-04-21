package exercicios.basico.blocoinicializacao.model;

public class Aluno {
    private static int totalAlunos = 0;
    private String nome;
    private int matricula;

    {
        totalAlunos++;
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
