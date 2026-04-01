package javacore.aintroducaoclasses.teste;

import javacore.aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Pedro";
        estudante.sexo = 'M';
        estudante.idade = 12;

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante);

    }
}
