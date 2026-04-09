package javacore.oexceptions.exception.test;

import javacore.oexceptions.exception.domain.Funcionario;
import javacore.oexceptions.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
