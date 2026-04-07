package javacore.npolimorfismo.test;

import javacore.npolimorfismo.repositorio.Repositorio;
import javacore.npolimorfismo.services.RepositorioArquivo;
import javacore.npolimorfismo.services.RepositorioBancoDeDados;
import javacore.npolimorfismo.services.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioArquivo();
        Repositorio repositorio3 = new RepositorioMemoria();

        List<String> list = new LinkedList<>();

        list.add("list");
        list.add("list2");
        list.add("list3");

        System.out.println(list);

        repositorio.salvar();
        repositorio2.salvar();
        repositorio3.salvar();

    }
}
