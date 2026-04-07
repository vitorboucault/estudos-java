package javacore.npolimorfismo.services;

import javacore.npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvo com sucesso no banco de dados");
    }
}
