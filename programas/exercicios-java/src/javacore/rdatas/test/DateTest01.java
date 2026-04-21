package javacore.rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); // Classe depreciada
        // date trabalha em milisegundos
        //todos os metodos dessa classe estão obsoletos
        System.out.println(date.getTime());
        System.out.println(date);
    }
}
