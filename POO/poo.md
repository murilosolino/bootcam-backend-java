## 💻 Programação Orientada a Objetos 
 
 - **POO** é um ``paradigma de programação`` baseado no conceito de ``objetos``, que podem conter ``dados`` na forma de ``campos``, também conhecidos como atributos, e códigos, na forma de procedimentos conhecido como ``metodos``.

 - Na POO a base no coneceito de objetos traz uma maior proxímidade com a realidade.

## Classes 
 - Toda estrutura de código na linguagaem Java é distribuído em arquivos de extensão **.java** denominados de **classe**.

 - As classes existentes em nosso projeto serão compostas por **Identificador, Características e Comportamentos**.

## Pacotes 
 - Para previnir a desordem, a linguagem dispoe de um recurso que organiza as classes padrao e criada por nos, que conhecemos como package. Os pacotes sao subdiretorios a partir da pasta ``src`` do noddo projeto onde estao localizadas as classes da linguiagem e novas que forem criadas para o projeto.

### package vs import 
- A localizacao de uma classe e definida pela palavra reservada package, logo, uma classse so contem uma definicao de package no arquivo,sempre na primeira linha de codigo. Para a utilizacao de uma classe existente em outro pacote, necessitamos realizar a importacao das mesmas, seguindo a recomendacao abaixo.

```java
    package exemplo_package

    import java.util.Scanner
    import ...

    public class Classe{

    }
```

## Modificadores

### Public, Private e Protected

 - **public**: Como o proprio nome representa, quando a classe, metodo ou atributo e definido como public, qualquer outra classe em qualquer outro pacote pode visualziar tais recursos

- **private**: Quando a classe, metodo ou atributo eh denominada como ``private`` apenas elementos daquela mesma classe podem visualizar tais recuros.

- **protected** Quando a classe, metodo ou atributo eh denominada como ``protected`` apenas elementos daquele mesmo diretorio podem visualizar tais recuros.

## Getters e Setters
- Getters e setters são métodos de acesso utilizados para ler (get) e modificar (set) os valores dos atributos de um objeto de uma classe. Eles são comumente usados para garantir o encapsulamento dos dados, um princípio importante da programação orientada a objetos.

- Getter (método de acesso): Um método que retorna o valor de um atributo privado de uma classe. Ele fornece acesso somente leitura aos atributos. Por exemplo, se tivermos um atributo privado chamado "nome" em uma classe Pessoa, um método getter chamado "getNome()" seria usado para obter o valor desse atributo.
  
- Setter (método de modificação): Um método que permite modificar o valor de um atributo privado de uma classe. Ele fornece acesso somente de escrita aos atributos. Usando o mesmo exemplo da classe Pessoa, um método setter chamado "setNome(String novoNome)" seria usado para definir o valor do atributo "nome". A utilização de getters e setters promove o princípio de encapsulamento, 
  
- permitindo que os atributos de uma classe sejam acessados e modificados de forma controlada, o que ajuda a manter a integridade dos dados e facilita futuras mudanças na implementação da classe sem afetar o código que a utiliza.

```java
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Getter para o atributo "nome"
    public String getNome() {
        return nome;
    }

    // Setter para o atributo "nome"
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    // Getter para o atributo "idade"
    public int getIdade() {
        return idade;
    }

    // Setter para o atributo "idade"
    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    // Método main para demonstração
    public static void main(String[] args) {
        // Criando um objeto Pessoa
        Pessoa pessoa = new Pessoa();

        // Usando os setters para definir os valores dos atributos
        pessoa.setNome("João");
        pessoa.setIdade(30);

        // Usando os getters para obter os valores dos atributos e exibindo na tela
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}

```

## Construtores 

- Os ``construtores`` são métodos especiais usados para inicializar objetos de uma classe. Eles têm o mesmo nome que a classe e são invocados automaticamente quando um objeto é criado. ``Os construtores podem ser usados para definir os valores iniciais dos atributos de um objeto``. Eles podem ter parâmetros que são usados para passar os valores iniciais para os atributos da classe. Por exemplo, em uma classe "Pessoa", podemos ter um construtor que aceita parâmetros como nome, idade e sexo para inicializar um objeto Pessoa com esses valores.

``` java
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Construtor que recebe nome e idade como parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

     // Método main para demonstração
    public static void main(String[] args) {
        // Criando um objeto Pessoa usando o construtor
        Pessoa pessoa = new Pessoa("João", 30);

        // Usando os getters para obter os valores dos atributos e exibindo na tela
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
```

## Enums

  - ``Enums (enumerações)`` são tipos de dados especiais que consistem em um conjunto fixo de constantes nomeadas. Eles são usados para representar conjuntos de valores que são conhecidos durante a compilação. Em muitas linguagens de programação, como Java, os enums são usados para representar um conjunto finito de valores que uma variável pode ter. Por exemplo, em uma enumeração ``"DiaDaSemana"``, podemos ter constantes nomeadas como ``"SEGUNDA_FEIRA"``, ``"TERCA_FEIRA"``, etc., representando os dias da semana.

```java
public enum DiaDaSemana {
    DOMINGO,
    SEGUNDA_FEIRA,
    TERCA_FEIRA,
    QUARTA_FEIRA,
    QUINTA_FEIRA,
    SEXTA_FEIRA,
    SABADO
}

// Método main para demonstração
class Main {
    public static void main(String[] args) {
        // Acessando os valores do enum DiaDaSemana
        System.out.println("Dias da semana:");
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
    }
}

```