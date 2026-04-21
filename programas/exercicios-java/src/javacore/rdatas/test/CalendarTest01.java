package javacore.rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // Segunda classe de datas criadas
        // para corrigir os problemas da primeira
        // Classe abstrata não pode utilizar new
        // classe date e calendar são mais utilizadas em sistemas legado
        // classe time é a mais utilizada em sistemas modernos

        Calendar calendar = Calendar.getInstance();

        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        } else {
            System.out.println("Não é o primeiro dia");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        //calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.roll(Calendar.HOUR, 6);

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
