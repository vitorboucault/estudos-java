package javacore.oexceptions.runtime.test;

public class RuntimeExceptionTest01 {
    // Checked e Unchecked
    // Exceções checadas são filhas da classe exception diretamente
    // Exceções unchecked são filhas ou a incluindo a classe RuntimeException
    // Quando lançadas pelo programa, o problema sou eu hahahaha
    // RuntimeException são do tipo unchecked não precisam ser tratadas, diferente
    // das checked exceptions

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }


}
