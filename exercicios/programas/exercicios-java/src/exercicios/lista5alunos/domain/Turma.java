package exercicios.lista5alunos.domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeTurma;
    private List<Pessoa> membros;
    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.membros = new ArrayList<>();
    }
    public void adicionarMembro(Pessoa pessoa){
        membros.add(pessoa);
    }
    public void removerMembro(Pessoa pessoa){
        membros.remove(pessoa);
    }
    public void removerPorIndice(int indice){
        if (indice >= 0 && indice < membros.size()){
            Pessoa removido = membros.remove(indice);
            System.out.println("Removido: " + removido);
        } else {
            System.out.println("Indice invalido");
        }
    }
    public boolean verificarNome(String nome){
        for (Pessoa pessoa : membros){
            if (pessoa.getNome().equalsIgnoreCase(nome)) return true;
        }
        return false;
    }
    public void listarTodos(){
        for (Pessoa pessoa : membros){
            System.out.println(pessoa);
        }
    }
}
