package javacore.npolimorfismo.services;

import javacore.npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvo com sucesso na memoria");
    }
}
