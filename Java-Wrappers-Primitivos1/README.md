---

## Qual a Diferença entre Tipos Primitivos e Wrappers no Java?

## Introdução:

Olá, estou estudando Java e gostaria de compartilhar um pouco dos meus estudos. Espero que ajude vocês também!

Um tipo primitivo armazena valores simples diretamente na memória, não é um objeto, não possui comportamento nem estrutura interna e **não pode** ser `null`. **Por exemplo**, `int x = 10;` vai armazenar o **número** 10 sem nenhum comportamento específico.

Os tipos primitivos do Java são: `byte`, `short`, `long`, `float`, `char`, `int`, `double` e `boolean` — variantes de dados com tamanhos e precisões diferentes.

- `int`: números inteiros
- `double`: números decimais
- `boolean`: verdadeiro ou falso

Eles são muito utilizados em contagem de itens, cálculos matemáticos, controle de fluxo, armazenamento de caracteres, **entre outros**, pois são mais leves e rápidos.

Os Wrappers são as versões objeto dos tipos primitivos, ou seja, podem ser utilizados em métodos, listas e outras ferramentas que exigem objetos.

```java
int x = 5;           // tipo primitivo (int)
Integer y = x;       // objeto Integer (wrapper do int)

```

| Tipo Primitivo | Classe Wrapper |
| --- | --- |
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

## 🔧 Por que eu usaria isso?

Porque **alguns lugares no Java só aceitam objetos**, e os tipos primitivos como `int`, `double`, `boolean` não são objetos.

Exemplo:

```java
ArrayList<int> lista = new ArrayList<>(); // ERRADO ❌
ArrayList<Integer> lista = new ArrayList<>(); // CERTO ✅

```

O Java não deixa usar `int` em `ArrayList`, mas deixa usar `Integer`, porque `Integer` é objeto.

## Analogia

Pense nos tipos primitivos como telefones antigos: funcionam para o essencial, são leves, mas não têm recursos extras. Já os Wrappers são como smartphones modernos, que permitem guardar, mover e usar em vários lugares diferentes.

## O Java converte automaticamente de primitivo para wrapper

- **Autoboxing** → primitivo vira objeto

```java
int primitivo = 10;
Integer objeto = primitivo; // o Java cria um Integer com o valor 10 automaticamente

```

- **Unboxing** → objeto volta para primitivo

```java
Integer objeto = 20;
int primitivo = objeto; // o Java pega o valor inteiro dentro do objeto automaticamente

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            // lê a nota como string
            String stringNota = scanner.nextLine();
            // converte a string para double
            double doubleNota = Double.parseDouble(stringNota);

            // valida se a nota está dentro do intervalo permitido
            if (doubleNota < 0 || doubleNota > 10) {
                System.out.println("O máximo e 10!");
            } else if (doubleNota >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
        catch (NumberFormatException e) {
            // captura erro quando a string não é um número válido
            System.out.println("Entrada inválida. Use apenas números com ponto.");
        }
    }
}

```

## Fontes:

- https://www.alura.com.br/artigos/diferenca-entre-int-e-integer-em-java?srsltid=AfmBOoqeM5aiicpZp_4an1o03dyJHXDrz6f0Q-5SIdpINQ4Gy_-jBd8M
- https://www.quora.com/What-is-the-difference-between-primitive-data-type-and-type-wrapper-class-What-are-some-examples
