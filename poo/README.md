# Programação Orientada a Objetos em Java

Aqui vamos adentrar a POO, vendo alguns conceitos e assuntos importantes

### Programação Estruturada:
- É um paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de um program de computador
- Utilizamos a implementação de algoritmos com estruturas sequenciais denominados procedimentos lineares e pode afetar os valores de variáveis de escopo local ou global em uma aplicação

### Programação Orientada a Objetos
- É um paradigma de programação que "simula" objetos do mundo real
- Pode conter dados em forma de campos, os **atributos**. E códigos na forma de procedimentos, também conhecido como **métodos**
- Permite que o programador desenvolva algoritmos mais próximos de um fluxo comportamental
- É voltada para os conceitos de objetos e classes, diferente da programação estruturada

## Classes

A estrutura de código em Java é feita em arquivos .java denominado **classes**

As classes nos nossos projetos serão compostas por:

Identificador, características e comportamentos:
- **Classe (class):** A estrutura que direciona a criação dos objetos de mesmo tipo
- **Identificador (identity):** Proposta aos objetos que serão criados
- **Características (states):** Conhecidos como **atributos** ou **propriedades. É toda a informação e características que representam o estado do nosso objeto
- **Comportamentos (behavior):** Ações ou métodos, é toda a parte comportamental que um objeto dispõe
- **Instanciar (new):** É o ato de criar um objeto a partir da estrutura definida em uma classe

Seguindo convenções, as nossas classes são representadas como:
- **Classe de modelo (model):** Classes que representam a estrutura de dominio da aplicação. Ex.: Cliente, Pedido, NotaFiscal;
- **Classe de serviço (service):** Contém regras de negócio e validação do nosso sistema. Serve para checar algumas classes baseado nas regras de negócio
- **Classe de repositório (repository):** Contém integração com banco de dados
- **Classe de controle (controller):** Possui finalidade de comunicar alguma comunicação externa à nossa aplicação, tipo http web ou webservices
- **Classe utilitária (util):** Contém recurso comum a toda a aplicação

## Pacotes
São subdiretórios a partir da pasta **src** do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto

Existem algumas convenções para a criação de pacotes já utilizados no mercado.

### Nomenclaturas

Existe uma nomenclatura de pacotes para organização baseando-se na sua proposta:

- **Comercial:** com.pacote
- **Governamental:** gov.pacote
- **Código aberto:** org.pacote

Para organizar ainda mais, podemos utilizar nas nossas classes:

- **model:** Classes que representam a camada e modelo a aplicação. Ex.: Cliente, Pedido, Usuário, NotaFiscal
- **repository** Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados. Ex.: ClienteRepository
- **service:** Classe que contém regras de negócio. Ex.: ClienteService possui o método validar o CPF do cliente cadastrado
- **controller:** Classes que possuem a finalidade de disponibilizar recursos para outras aplicações via padrão HTTP
- **view:** Classes que possuem alguma interação com interface gráfica acessada pelo usuário
- **util:** Pacote que contém classes utilitárias do sistema. Ex.: ValidadorUtil, FormatadorNumeroUtil

### Identificação

As classes possuem identificação, porém, quando organizada em pacotes ela passa a ter duas identificações. O nome simples (**o próprio nome**) e agora o nome qualificado (endereçamento de pacote + nome).

### Package versus Import

Uma classe é localizada pela palavra package, logo uma classe só contém uma definição de package no arquivo, **sempre** na primeira linha do código

- Para utilizar uma classe existente em outros pacotes, necessitamos realizar a importação das mesmas:


```java
package

import ...
import ...

public class MinhaClasse {
    
}
```

### Por que compreender pacotes e qual a sua importância?

A linguagem Java é composta por milhares de classes, podendo existir classes com o mesmo nome. Então nós como desenvolvedores precisamos saber qual classe importar no nosso projeto

## Visibilidade dos recursos

### Modificadores

Em Java, usamos 3 palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir a visibilidade de atributos, métodos e até classes

### Modificador *public*

Quando uma classe, método ou atributo é definido como public, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos

### Modificador *private*

Serve para bloquear o acesso de pacotes a uma classe main da aplicação

## Getters & Setters

Seguindo a convenção Java Beans, são utilizados para buscar valores de atributos ou definir novos valores de atributos de instâncias de classes

- O método **Getter** retorna o valor do atributo especifico
- O método **Setter** define outro valor para o método especificado

Uma classe que contém estrutura de estados deverá seguir as regras abaixo:

- Os atributos precisam ter o modificador private. Ex.: private String nome;
- Como agora os atributos estarão a nível de classe, precisaremos dos métodos getX e setX. Ex.: getNome() e setNome(String novoNome);
- O método get é responsável por obter o valor atual do atributo, precisando ser public. Ex.: public String getNome() {};
- O método set é responsável por definir ou modificar o valor de um atributo e um objeto, logo precisa ser public, receber um parametro do mesmo tipo da variável mas não retorna nenhum valor void. Ex.: public void setNome(String newNome);

## Construtores

- Para criar um objeto na linguagem Java utilizamos uma convenção padrão 

```java

Classe novoObjeto = new Classe();

```
- É um recurso conhecido como instanciar um novo objeto

- Os construtores são métodos que tem o nome idêntico ao da classe e recebem parameters
- Evitar todos os atributos em um construtor, pois não são boas prática

## Enums

É um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponíveis por toda a aplicação

- Usamos quando o nosso modelo de negócio possui objetos de mesmo contexto que já existem com a certeza de que não haverá alteração de valores
- Exemplos
  - Grau de escolaridade: Analfabeto, Fundamental, Médio, Superior
  - Estado civil: Solteiro, Casado, Divorciado
  - Estados brasileiros: São Paulo, Rio de Janeiro, Piaui, Maranhão

###
    - Não confunda uma lista de constantes com enum

## UML

Linguagem de Modelagem Unificada é uma notação que possibilita a representação gráfica do projeto

Existem 3 conceitos para entender inicialmente:

- Diagramas
- Elementos
- Relacionamentos


### Diagramas estruturais

  - **Diagrama de classe:**
    - É utilizado para fazer a representação de estruturas de classes de negócio, interfaces e outros componentes do sistema. É considerado o mais importante, pois auxilia a maioria dos outros diagramas
  - **Diagrama de objetos:**
    - Representa os objetos existentes em determinado instante ou fato na aplicação.

### Diagrama de classe

- A estrutura das classes é constituída por: 
  - **Identificação:** Nome e/ou finalidade da classe
  - **Atributos**: Propriedades e/ou características
  - **Operações**: Ações e/ou métodos

### Relacionamentos

No diagrama, as classes podem existir de forma individual, porém pode haver em alguma etapa do programa a necessidade deles se relacionarem

O que devemos entender é o nível de compreensão entre elas

#### Associação

Define um relacionamento entre duas classes, permitindo que um objeto tenha acesso à estrutura de outro objeto

- Agregação: A classe principal possui uma relação com a agregadora, mas não depende dela para existir.
- Composição: Caracteriza uma dependência existencial entre a classe principal e a classe agregadora. Ou seja, a classe principal depende do candidato
- Multiplicidade: Um determinado cenário poderá exigir multiplicidades específicas
  - Associação contendo um elemento: 1. 
  - Associação contendo uma lista de elementos: *.
  - Associação contendo zero ou um elemento: 0..1
  - Associação contendo zero ou uma lista de elementos: 0..*
  - Associação contendo um ou uma lista de elementos: 1..*
- Visibilidade: 
  - Atributos ou métodos podem receber níveis de visibilidade, e na UML existem símbolos que representam cada um deles:
    - (+) Visibilidade pública
    - (#) Visibilidade protegida (associada com herança)
    - (-) Visibilidade privada
## Pilares do POO

- Encapsulamento: Nem tudo precisa estar visível, grande parte da nossa aplicação pode ser distribuído em métodos com finalidades específicas que complementa uma ação na nossa aplicação
- Herança: Características e comportamentos comuns pode ser elevados e compartilhados através de uma hierarquia de objetos
- Abstração: É a indisponibilidade para determinar a lógica de um ou vários comportamentos de um objeto. Em Java, eles são representados pela palavra `abstract` e não possuem corpo na classe abstrata
- Polimorfismo: São inúmeras maneiras de se realizar a mesma ação

`Com o modificador private somente a classe conhece a implementação quanto que o modicador public todos passarão a conhecer. E o modificador protected somente as classes filhas conhecem`

## Interface

Java não permite heranças multipla, então o interface serve para poder implementar as classes em Java

- Não pode ter definição de construtores
- Uma classe pode implementar mais de uma interface



  



    

