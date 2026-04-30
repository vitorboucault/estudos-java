# Estruturas Condicionais

Controle de Fluxo é a habilidade de ajustar a maneira como um programa realiza suas tarefas. Essas tarefas podem ser executadas seletivamente, repetidamente ou excepcionalmente.

- Classificação:
    - 
    - **Estruturas condicionais:** if-else, switch-case
    - **Estruturas de repetição:** for, while, do-while
    - **Estruturas de exceções:** try-catch-finally, throw

    - Estruturas condicionais
        -
        - Possibilita a escolha de um grupo de ações e comportamentos a serem executados quando determinadas ações são ou não satisfeitas.
            - **Condicionais Simples:**
                - Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura **Simples** utilizando o `if`
            - **Condicionais Compostas:**
                - Algumas vezes nosso programa pode seguir mais de uma regra de execução com adicionando `else`
            - **Condicionais Encadeadas:**
                - Nem sempre se limita ao **se** `(if)` e ao **senão** `(else)`, poderemos ter uma terceira ou quarta condição e ou inumeras condições
            - **Condição ternária:**
                - Podemos abreviar nosso algoritmo condicional refatorando com o conceito de operador ternário
            - **Switch Case:**
                - A estrutura switch compara o valor de cada caso com o da váriavel sequecialmente. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos o comando **break** no final de cada bloco de código
                    - Se optar por usar **`switch`** / **`case`**, estudem um  pouco mais sobre os conceitos de **`continue`**, **`break`** e **`default`**
    - Estruturas de repetição
        - 
        - Também conhecidos como laços de repetição, iteração ou loops, são comandos que permitem iteração de código, ou seja, que comandos repetidos no bloco sejam repetidos várias vezes
            - **For (para):**
                - Permite que uma váriavel contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando.
                - O comando `for` recebe uma váriavel contadora, a condição e o valor de incrementação
                ```
                //estrutura do controle de fluxo for

                for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
                {
                    // comando que será executado até que a 
                    // expressão de validação torne-se falsa 
                    }
                ```
            - **For em Arrays:**
                - Utilizando arrays junto com o laço for

                    ```java
                        // ExemploFor.java
                        public class ExemploFor {
                        public static void main(String[] args) {
	                    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	                    for (int x=0; x<alunos.length; x++) {
		                    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	                        }

                        }
                        }
                        ```
                - Em array o indice de elementos inica com zero
                - Uso do `for/each` com array:
                    ```java
                    // ExemploFor.java

                    public class ExemploFor {
                    public static void main(String[] args) {
	                String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

                    //Forma abreviada
	                for(String aluno : alunos) {
	                    System.out.println(alunos);
	                    }
                    }
                    }
                    ```
                    1. `String aluno : alunos` -> De forma abreviada é criada uma variável `nome` obtendo um elemento do vetor a cada ocorrência.
                    2. A impressão de cada aluno é realizada.
            - **Break e continue:**
                - Java para o código quando encontra o comando `break`
                - `Continue` interrompe a iteração atual
                - Sempre o **`break`** e **`continue`** está condicinado a um critério de negócio.
                ```java
                // class ExemploBreakContinue.java
                public class ExemploBreakContinue {
	                public static void main(String[] args) {

	                    for(int numero = 1; numero <=5; numero ++){
		                    if(numero==3)
			                    break;
		                System.out.println(numero);
	                    }
	            //Qual a saída no console ?

                    }
                }
                ```
            - **While:**
                - Determina que enquanto uma condição for válida, o bloco de código será executado.
                - O laço **`while`** testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.
                ```
                //estrutura do controle de fluxo while

                while (expressão booleana de validação)
                {
                        // comando que será executado até que a 
                        // expressão de validação torne-se falsa 
                }
                ```
            - **Do/While:**
                - Na tradução literal pro português significa "faça enquanto...". Ele testa a condição após executar o código
                - Mesmo que a condição seja invalida ele executa o código uma vez
    - Estruturas excepcionais
        - 
        - Ao executar um código, diferentes erros podem acontecer: erros de código, entradas erradas ou imprevistos
        - Quando ocorre um erro, o Java para e relata um erro. O termo para isso é: Java lançará uma exceção
        - Exceções é um fluxo inesperado da nossa aplicação
        - É responsabilidade do desenvolvedor prever situações de erro e realizar o tratamento de exceções

        - **Tratamento de exceções:**
            - `try` permite que você defina um bloco de código para ser testado quando há algum erro
            - `catch` permite definir um bloco de código a ser executado caso tenha algum erro no bloco try
            - `finally` permite definir um bloco de código mesmo se tiver um erro ou não (opcional)

            ```java
            try {
                //  bloco de código conforme esperado
            }
            catch(Exception e) {// precisamos saber qual exceção
                // bloco de código que captura as exceções que podem acontecer
                // em caso de um fluxo não previsto
            }
            ```
        - **Hierarquia das exceções:**
            - A linguagem java dispões de classes que representam exceções e elas possuem uma hierarquia e são divididas em 2 conjuntos denominadas de **Checked** e **Unchecked Exceptions**
            - A proposta é o fato de ao tentar um usar um método, esse método determina que você precisa tratar esse erro imediatamente
            - **Exceções customizadas:**
                - Podemos criar nossas proprias exceções baseadas nas nossas regras de negócio para direcionar melhor quem for utilizar os recursos do projeto, exemplo:
                    - Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos, caso contrário lançará uma exceção que denominamos de **CepInvalidoException**.
                    - Primeiro criamos nossa exceção:

                    ```java
                    public class CepInvalidoException extends Exception {}
                    ```
                    - Em seguida criamos nosso método de formatação de cep.

                    ```java
                    static String formatarCep(String cep) throws CepInvalidoException{
                        if(cep.length() != 8)
                            throw new CepInvalidoException();
                    //simulando um cep formatado
                            return "23.765-064";
                        }
                    ```