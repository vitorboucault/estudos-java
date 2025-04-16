# Java

Biblioteca de estudos da linguagem de programação Java

- Obs.: Estudos e aplicações é para serem executados em ordem sequencial

## 📚 Documentação

- [Documentação Java](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)


## 💻 Conhecimentos aprofundados

| Assuntos | O que é? |
| ------------- | ------------- |
| Anatomia das classes | Convenção das classes|
| Tipos e variáveis | O que são?
| Operadoradores

## 📖 Estudos e aplicações

### Anatomia das classes

- #### Padrão de nomenclatura:

    - Toda classe tem um metódo especial
        - Método *main* do tipo *String* 
    - Ex.:
    - Nome do projeto sempre será todo em minusculos
    - Nome dos arquivos .java criados para classes todas as letras e iniciais serão maiusculas.
        - Ex.: **M**inha**C**lasse
    - A classe deve possuir o mesmo nome do arquivo
    - Toda variavel deve começar com letra minuscula, e se for composta, a primeira letra das demais palavras devem ser maiúsculas:
        - Ex.: *minhaVariavel*
    - Existem variáveis que nunca mudará seu valor do tipo `final`
        - Essas variáveis terão a convenção Upper Case
        - Ex.: *PI*, *BR*, etc.
    - Variáveis devem conter apenas letras, _, $ ou os numeros de 0 a 9
        - Deve-se iniciar sempre com letras, _ ou $
        - Deve iniciar com letra minuscula (boa prática)
        - Não pode conter espaços
        - Não podemos usar palavras chave da linguagem
        - O nome deve ser único dentro do escopo
- #### Declarar váriaveis:
    - Sempre seguirá uma estrutura:
        - Tipo Nome = Atribuição (opcional em alguns casos)
        - Ex.: *int ano = 2022;*  
- #### Declarando métodos em Java segue uma estrutura simples   

    - TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
    - Ex.: *public static int somar(int numero1, int numero2);*
    - Ex.: *public static String formatarCep (long cep)*
- #### Identação
        É basicamente escrever o código de forma hierárquica pra deixar uma forma mais sutil e agradável de escrever os códigos para facilitar a visualização

- #### Organização de arquivos
    - Existem pacotes que possuem convenções de aplicabilidade
        - Ex.: `edu.joao.tema.logica`
- #### Java Beans
        A linguagem Java oferece, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes
    - Váriaveis:
        - Uma váriavel deve ser clara, sem abreviações ou definição sem sentido, sempre no singular, exceto quando se referir a um array ou coleção
        - Deve ser escrita em um idioma escolhido

### Tipos e variáveis
- Tipos primitivos

    - Valores inteiros
        - `byte` -> 1 byte
        - `short` -> 2 bytes
        - `int` -> 4 bytes
        - `long` -> 8 bytes
    - Podem conter partes fracionarias:
        - `float` -> 4 bytes
        - `double` -> 8 bytes
        - Ponto relevante para entender a definição dos tipos de dados é a definição do tipo para uma variável
        - Valores em milhar são definidos sem ponto ou virgula, e números fracionados utiliza-se ponto `.``
    - Atenção em alguns pontos:
        - Tipo `float` é importante utilizar `F`no final para não reconhecer como `double``
            - Ex.: `float PI = 3.14F;`
        - Tipo `long` precisa ter `L` no final, para o Java reconhecer como longo e não inteiro
            - Ex.: `long cpf = 98765432109L;`
        - Variaveis do tipo `int` ou `long` que começam com zero, é interassante mudar para `String`

    - Constantes:
        - São valores armazenados em memoria que não podem ser mudados depois de declarados, nesse caso é necessário utilizar o `final`
            - Ex.: `final double PI = 3.14F;`

### Operadores


- São simbolos especiais associados a alguma operação
    - Atribuição:
        - Representado pelo simbolo de `=``
        - Ex.: `String nome = "Joao";`
    - Aritméticos:
        - `+` adição
            - `Atenção!` Quando utilizado em variaveis do tipo texto, ele fará a concatenação de textos
                - Ex.: *String nome = "Joao" `+` "Vitor";*
        - `-` subtração
        - `*`multiplicação
        - `/` divisão
        - `%` resto de uma divisão

    - Unário
        - São utilizados com outros operadores aritmeticos:
            - (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
            - (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
            - (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
            - (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
            - (!) Operador unário lógico de negação – nega o valor de uma expressão booleana;
    - Ternário
        - Uma forma resumida para definir uma condição e escolher por um dentre dois valores.

        - O operador ternário é representado pelos símbolos `?:` utilizados na seguinte estrutura de sintaxe: 
            - `<Expressão Condicional> ? <Caso condição seja true>: <Caso condição seja false>`
    - Relacionais
        - Avaliam condições em algumas expressões
            - `==` verifica igualdade entre dois valores
            - `!=` verifica se uma variavel é diferente da outra
            - `>` para verificar se uma variavel é maior que a outra
            - `>=`para verificar se uma variavel é menor ou igual a outra
            - `<` para verificar se uma variavel é menor que a outra
            - `<=` para verificar se uma variavel é igual ou menor que a outra
    - Lógicos
        - São operadores para criar expressões lógicas com duas ou mais expressões
            - `&&` Operador Lógico "e"
            - `||` Operador lógico "ou"
### Métodos

- Uma classe é definida por métodos e atributos. Atributos são váriaveis de diferentes tipos de valores. Os métodos correspondem a funções ou sub-rotinas disponíveis dentro de nossas classe
    - Critério de nomeação de métodos:
        - Não são obrigatórios, mas é recomendável que seja seguidos, pois essas convenções facilitam a vida dos programadores. Os critérios são:

            - `Deve ser nomeado como verbo`
            - Seguir o padrão `camelCase`, todas as letras minusculas exceto a primeira letra da segunda palavra. Ex.: `calcularImposto``
        
                `Atenção!` *Não existe em Java o conceito de métodos globais. Todos os métodos devem estar inseridos em uma classe*
    - Critério de definição de métodos:
        - Como sabemos a melhor forma de definir os métodos das nossas classes? Para chegar nessa conclusão, temos uma convenção para nos auxiliar determinada pelos aspectos abaixo:
            - **Qual a proposta principal do método?** Se perguntar até entender final realidade do mesmo
            - **Qual o tipo de retorno esperado após executar o método?** Você deve ser responsável por analisar se o método irá retornar algum valor ou não

            - Caso o método não retorne nenhum valor, ele será representado pela palavra-chave `void`.

            - **Quais os parametros necessários para execução do método?** Os métodos as vezes precisam de argumentos como critérios para a execução
            - **O método possui risco de apresentar alguma exceção?** Exceções são comuns e as vezes é preciso prever e tratar a possível existência de uma exceção
            - **Qual a visibilidade do método?** Será necessário que o método seja visível a toda a aplicação, somente em mesmo pacotes, através de herança ou somente a nível a própria classe.

### Escopo

- Pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada. 

    - Uma variável deixa de estar disponível a depender de onde foi colocada 
    - Em uma classe podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da classe, sendo portanto acessíveis por todos os métodos
    - Caso declare uma váriavel **dentro de um método**, o escopo dessa variável está limitado apenas apenas ao corpo do método, ou seja, dentro das chaves que limitam o método.
    
        `Sem um dominio sobre o escopo de códigos, seu projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação`

### Palavras reservadas

- São identificadores de uma linguagem que não podem ser reutilizadas para nomear variáveis, classes, métodos ou atributos
- Java possui 52 palavras reservadas, classificadas em grupos e todas em letras minusculas:

    - Controle de pacotes
        - `import` importa pacotes dentro do código
        - `package` especifica a que pacote todas as classes de um arquivo pertencem
    - Modificadores de acesso
        - `public` acesso de qualquer classe
        - `private` acesso apenas dentro da classe
        - `protected` acesso por classes no mesmo pacote e subclasses
    - Primitivos
        - `boolean` 
        - `byte`
        - `char`
        - `double`
        - `float`
        - `int`
        - `long`
        - `short`
        - `void` indica que o método não tem retorno de valor
    - Modificadores de classes, váriaveis ou métodos
        - `abstract` classe que não pode ser instaciada ou método que precisa ser implementado por uma subclasse não abstrata
        - `class` especifica uma classe
        - `extends` indica a superclasse que a subclasse está estendendo
        -  `final` impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada
        - `implements` indica as interfaces que uma classe irá implementar
        - `interface` especifica uma interface
        - **`native`** indica que um método está escrito em uma linguagem dependente da plataforma, como o C
        - `new` instancia um novo objeto, chamando seu construtor
        - `static` faz um método ou váriavel pertencer à classe ao invés de às instâncias
        - `strictfp` usado em frente a um método ou classe para indicar
        - `synchronized` método que só pode ser acessado por uma thread de cada vez
        - `transient` impede a serialização de campos
        - `volatile` uma variavel que pode ser alterada durante o uso de threads
    - Controle de fluxo dentro de um bloco de código
        - `break` sai do bloco de código que ele está
        - `case` executa um bloco de código dependendo do teste do switch
        - `continue` pula a execução do código que viria após essa linha e vai para o próximo loop
        - `default` executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro
        - `do` executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente
        - `else` executa um bloco de código alternativo caso o teste if seja falso
        - `for` usado para realizar um loop condicional de um bloco de código
        - `if` usado para realizar um teste lógico de verdadeiro o falso
        - `instanceof` determina se um objeto é uma instância de determinada classe, superclasse ou interface
        - `return` retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)
        - `switch` indica a variável a ser comparada nas expressões case
        - `while` executa um bloco de código repetidamente enquanto a condição for verdadeira
    - Tratamento de erros
        - `assert` testa uma expressão condicional para verificar uma suposição do programador
        - `catch` declara o bloco de código usado para tratar uma exceção
        - `finally` bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção
        - `throw` usado para passar uma exceção para o método que o chamou
        - `throws` indica que um método pode passar uma exceção para o método que o chamou
        - `try` bloco de código que tentará ser executado, mas que pode causar uma exceção
    - Variáveis de referência
        - `super` refere-se a superclasse imediata
        - `this` refere-se a instância atual do objeto

#### Escopo de uso

| Uso      | Palavras                                                                     | Observação                                                           |
| -------- | ---------------------------------------------------------------------------- | -------------------------------------------------------------------- |
| Arquivo  | package, import, static                                                      |                                                                      |
| Classe   | public ou protected ou private + final ou abstract + extends ou implements   | **private** (em caso de classe interna), **final** ou **abstract** ? |
| Método   | public ou protected ou private + static ou final ou abstract + void e return | **void** em caso de não ter retorno ou **return** se houver          |
| Atributo | public ou protected ou private + static ou final + tipo primitivo            | ****                                                                 |

#### Palavras "opostas"

Assim como nas classificações gramaticais da língua portuguesa, existem algumas palavras que são completamente opostas (antônimas) na linguagem Java conforme tabela abaixo:

| Palavra | Palavra    | Explicação                                                                                                                                                                                                                                                                |
| ------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| package | import     | Enquanto **package** determina o diretório real da classe, o **import** informe de onde será imprtada a classe. Isso porque podemos ter classes de mesmo nome.                                                                                                            |
| extends | implements | enquanto **extends** determinas que uma classe estende outra classe, **implements** determina que uma classe implementa uma interface, porém nunca o contrário                                                                                                            |
| final   | abstract   | enquanto **final** determina fim de alteração de valor ou lógica comportamental, **abstract** em métodos exige que sub-classes precisarão definir comportamento é um método abstrato. NOTA: Se uma classe contém um único método abstrato, toda classe precisa ser.       |
| throws  | throw      | Esta é uma das situações mais complicadas de compreensão destas duas palavras. Enquanto a **throws** determina que um método pode lançar uma exceção, **throw** é a implementação que dispara a exceção. |

### Documentação

- Tags são dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos


| Tag      | Descrição                                              |
| -------- | ------------------------------------------------------ |
| @autor   | Autor / Criador                                        |
| @version | Versão do recurso disponibilizado                      |
| @since   | Versão / Data de início da disponibilização do recurso |
| @param   | Descrição dos parâmetros dos métodos criados           |
| @return  | Definição do tipo de retorno de um método              |
| @throws  | Se o método lança alguma exceção                       |

- Tipos de comentários
    - // comentário de uma linha
    - /* */ Comentário de várias linhas
    - /** */ Aspecto de documentação

    `Comentários não amenizam uma estrutura falha e não justifica deixar de seguir as convenções`
- Java Doc
    - É um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML.
        - Comando: `javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java`

### Terminal & Argumentos

Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

- Terminal
    -

    - Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

        1. Abra o MS-DOS ou Power Shell
        2. Localize o diretório do seu projeto: **`cd C:\estudos\dio-trilha-java-basico\java-terminal`**
        3. Acesse a pasta **_bin_:** **`cd bin`**
        4. Agora digite o comando: **`java MinhaClasse`** _(nome da sua classe sem a extensão .**class**)_&#x20;


- Argumentos (Array)
    -
    Quando executamos uma classe que tenha o método main, podemos passar um array[] de argumentos do tipo String. Logo podemos, após a definição da classe a ser executada informar esses parametros, exemplo:

    ````
    java MinhaClasse argumentoUm argumento dois
    `````

Exemplo

```java
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
```
- Argumentos
    - A classe Scanner permite que o usuário tenha uma interação mais assertiva com o nosso programa.


