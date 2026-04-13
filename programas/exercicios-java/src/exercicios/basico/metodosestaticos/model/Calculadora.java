package exercicios.basico.metodosestaticos.model;

public class Calculadora {
    public static void somar(double a, double b){
        double c = a + b;
        System.out.println("O resultado de  " + a+ " + " + b +" é igual a " + c);
    }

    public static void subtrair(double a, double b){
        double c = a - b;
        System.out.println("O resultado de  " + a+ " - " + b +" é igual a " + c);
    }
    public static void multiplicar(double a, double b){
        double c = a * b;
        System.out.println("O resultado de  " + a + " * " + b +" é igual a " + c);
    }
    public static void dividir(double a, double b){
        if ( b == 0){
            System.out.println("Divisao por zero nao pode ser realizada");
            return;
        }
        double c = a / b;
        System.out.println("O resultado de  " + a + "/" + b +" é igual a " + c);
    }

    public static void media(double a, double b, double c){
        double media = (a + b + c)/3;
        System.out.println("O resultado é = " + media);
    }


}
