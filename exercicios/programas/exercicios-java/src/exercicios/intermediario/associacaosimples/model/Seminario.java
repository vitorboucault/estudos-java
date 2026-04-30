package exercicios.intermediario.associacaosimples.model;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;
    private List<String> alunos = new ArrayList<>();

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarAluno(String nomeAluno) {
        if (!alunos.contains(nomeAluno)) {
            alunos.add(nomeAluno);
            System.out.println("Aluno " + nomeAluno +
                    " adicionado ao seminário '" + titulo + "'.");
        }else System.out.println("Aluno " + nomeAluno + " já está no seminário.");
    }

    public void imprimirParticipantes(){
        System.out.println("Seminário: " + titulo);
        System.out.print("Participantes: ");
        if (alunos.isEmpty()){
            System.out.println("Nenhum");
        } else{
            System.out.println(String.join(", ", alunos));
        }
        System.out.println();
    }

    public void removerAluno(Aluno aluno) {
        if (aluno == null) {
            return;
        }
        if(alunos.remove(aluno)){
            if(aluno.getSeminario() == this){
                aluno.setSeminario(null);
            }
        }
    }

    @Override
    public String toString() {
        return "Seminario{" +
                "titulo='" + titulo + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
