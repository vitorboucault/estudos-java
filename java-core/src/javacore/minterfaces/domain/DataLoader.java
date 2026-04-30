package javacore.minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE=10;

    void load();

     default void checkPermission(){
         System.out.println("Fazendo checagem de permissoes");
     }

     static void retrieveMaxDataSize(){
         System.out.println("Dentro do retriveMaxDataSize na interface");
     }
}
