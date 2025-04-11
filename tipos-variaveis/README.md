# Java

Biblioteca de estudos da linguagem de programação Java

- Obs.: Estudos e aplicações é para serem executados em ordem sequencial

## 📚 Documentação

- [Documentação Java](https://git-scm.com/doc)


## 💻 Conhecimentos aprofundados

| Assuntos | O que é? |
| ------------- | ------------- |
| Anatomia das classes | Convenção das classes|
| Tipos e variáveis | O que são?

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

#### Operadores

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
#### Métodos

Uma classe é definida por métodos e atributos. Atributos são váriaveis de diferentes tipos de valores. Os métodos correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes
        


