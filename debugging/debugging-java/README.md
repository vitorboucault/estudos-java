# Debugging em Java

- São denominados bugs, e o processo de encontrar e corrigir esses bugs é chamado de **debugging** ou **depuração**
- Existem duas categorias que englobam a origem do erro:


    - <h3>Erros de sintaxe:</h3>

        Caracteriza erros de escrita em linguagens:
            
            - Parenteses, chaves, colchetes que fecham mas não abrem
            - Duas instruções sem ponto e virgula entre elas
            - Uma palavra chave sendo usada numa posição inesperada
        Geralmente não necessita de debbuging, pois a propria IDE já mostra o erro com as linhas vermelhas abaixo das palavras erradas no código

    - <h3>Erros de semântica:</h3>

        Erro na lógica do código. Com a sintática correta, funciona, porém não faz o que se esperava dele.

## Depuração/Debugging
Os depuradores funcionam como uma ferramenta que assume o controle do tempo de execução de um programa e você pode o observar e controlar

Ou seja, nós podemos parar o programa para fazer os tratamentos de exceção.

## Pilha de Execução de um Programa Java/Stack Trace

<p><h3>Pilha de Execução:</h3>

Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um.

Quando um método termina, ele volta pro método que o invocou

<p><h3>Stack Trace:</h3>

É a matriz onde colocamos a pilha de execução. Ou seja, o rastreamento de pilha busca a próxima linha que a exceção pode surgir




