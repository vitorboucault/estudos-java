package fatorial;

public class Main {

    public static int fatorial (int n){
        if (n <= 1){
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }

    public static void main(String[] args) {
        // um metodo recursivo ele chama a si mesmo
        int numero = 10;
        System.out.println(fatorial(numero));
    }
}

