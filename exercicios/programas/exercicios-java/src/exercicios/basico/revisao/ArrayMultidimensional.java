package exercicios.basico.revisao;

public class ArrayMultidimensional {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[3];
        arrayInt[1] = new int[2];
        arrayInt[2] = new int[4];

        for(int[] arrayBase : arrayInt ){
            for(int numero : arrayBase){
                System.out.print(numero);
            }
        }
    }
}
