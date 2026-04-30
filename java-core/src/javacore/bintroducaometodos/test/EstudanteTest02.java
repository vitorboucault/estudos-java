package javacore.bintroducaometodos.test;

import javacore.bintroducaometodos.domain.Estudante;


public class EstudanteTest02 {

    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Joao";
        estudante01.sexo = 'M';
        estudante01.idade = 24;

        estudante02.nome = "Maria";
        estudante02.sexo = 'F';
        estudante02.idade = 23;

    }
}
