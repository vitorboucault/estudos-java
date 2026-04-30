package javacore.heranca.test;


import javacore.heranca.domain.Endereco;
import javacore.heranca.domain.Funcionario;
import javacore.heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Roberto");
        endereco.setCep("12345678-9");

        Pessoa pessoa = new Pessoa("Pessoa 1");
        pessoa.setCpf("1234567897");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Kakuzu");
        funcionario.setCpf("123456789");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();


    }
}
