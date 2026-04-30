package javacore.qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Joao";
        String nome2 = "Joao";
        String nome3 = new String("Joao");

        System.out.println(nome.charAt(0));
        System.out.println(nome3.length());
        System.out.println(nome2.replace('a', 'z'));
        System.out.println(nome2.toLowerCase());
        System.out.println(nome2.toUpperCase());
        System.out.println(nome.substring(0,2));
        System.out.println(nome.trim());

        // String sao imutaveis e devemos tomar cuidado em associar um novo valor a variavel de referencia
        // Se nao, nao sera possivel utilizar o valor novo
    }
}
