package mdc;

public class Main {

    public static float CalculaMDC(float m, float n){
        if (n == 0){
            return m;
        } else{
            return CalculaMDC(n, m%n);
        }
    }

    public static void main(String[] args) {
        System.out.println(CalculaMDC(3,168));
    }
}
