package javacore.npolimorfismo.services;

import javacore.npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvo com sucesso nos arquivos");
    }
}
