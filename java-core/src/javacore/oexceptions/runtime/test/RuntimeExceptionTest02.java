package javacore.oexceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(2,0));
    }
    private static int divisao(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Não pode ser zero");
        }
            return a/b;
    }
}
