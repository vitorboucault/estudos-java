public class Operadores {
    public static void main(String[] args) {
        
        // Atribuição com "=""

        String nome = "Joao"; // Para caracteres, sempre utilizar ""
        int numero2 = 1;
        float PI = 3.14F;

        // Concatenação utilizando símbolo "+""

        String nomeCompleto = "Joao " + "Vitor";

        int numero = 5; // Valor positivo
        numero = - numero; // Para definir como numero negativo
        numero = numero * -1; // Para tornar positivo
        System.out.println(numero);
        System.out.println(numero); // Não afeta variavel principal


        int numero3 = 4;
        
        numero3 ++; // igual a numero2 = numero2 + 1;

        System.out.println(numero3);
        System.out.println(++numero3);

        boolean variavel = true;

        System.out.println(!variavel); // inverte o valor booleano

        variavel = !variavel; // para atribuir na memoria

        

    }
}
