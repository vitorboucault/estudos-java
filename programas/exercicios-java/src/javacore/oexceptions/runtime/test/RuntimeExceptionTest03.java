package javacore.oexceptions.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static void abreConexao() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escreveu dados no arquivo");

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Fechando o recurso liberado pelo SO");
        }
    }
}
