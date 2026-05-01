package javacore.uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
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
        // ? = Zero ou uma ocorrencia
        // * = zero ou mais ocorrencias
        // + = uma ou mais ocorrencias
        // {x,y} = ocorrencias de x até y
        // () = serve para agrupamento
        // | = serve para expressao "ou"
        // $ = representa o fim da linha
        // . ex.: 1.3 = encontra 123, 133, 1@3
        // ^ = pode ser utilizado para dar um match do que se quer encontrar no começo da linha

        String regex = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //regex de email
        String texto = "vitorboucault@gmail.com, 12jotaro@gmail.com.br, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
        System.out.println("" + "zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}