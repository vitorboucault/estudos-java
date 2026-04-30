package javacore.qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Joao";
        nome.concat(" CiberSec");
        System.out.println(nome);
        StringBuilder s = new StringBuilder("Joao"); //stringbuilder nao é uma string
        s.append(" CiberSec");
        s.reverse();
        s.delete(0,1);
        System.out.println(s);



    }
}
