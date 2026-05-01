package javacore.uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // linguagem que utiliza simbolos
        // para encontrar padrões em um texto
        // metodo caracteres:
        // \d = Retorna todos os digitos (numeros)
        // \D = retorna tudo o que não for digito
        // \s \t \n \f \r = todos os Espaços em branco
        // \S = Todos os caracteres excluindo os brancos
        // \w = tudo o que for de a-ZA-Z, digitos, e _
        // \W = tudo o que não for incluso no \w
        // [] = range de caracteres
        // [a-d] = utilizar o traço para o range

        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        int numeroHex = 0x591F132; // numeros hexadecimais precisam começar com 0x
        System.out.println("numeroHex: " + numeroHex);
    }
}
