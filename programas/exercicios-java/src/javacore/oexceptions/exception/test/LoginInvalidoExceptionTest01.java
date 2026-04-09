package javacore.oexceptions.exception.test;

import javacore.oexceptions.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar(){
        Scanner ler = new Scanner(System.in);

        String usernameDB = "Naruto";
        String senhaDB = "1234";

        System.out.println("Usuario: ");
        String usernameDigitado = ler.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = ler.nextLine();

        if (! usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalido");
        }
        System.out.println("Logado com sucesso");
    }
}
