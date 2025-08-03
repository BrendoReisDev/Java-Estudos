import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para ler dados da entrada padrão
        int idade = 0; // Essa Variavel do tipo int foi criada pois não e possivel que uma idade seja Ex: "23.5 anos"
        do {
            System.out.println("1000 - Para Sair | Digite sua idade: ");

            try {
                idade = scanner.nextInt();

                if (idade == 1000) {
                    System.out.println("Programa Encerrado..."); // Aparece quando o programa e encerrado
                    break; // Para o programa ao digitar 1000
                } else if (idade > 110 || idade < 0) { // Se for Maior que 110 ou Menor que 0
                    System.out.println("Idade Invalida");
                } else if (idade >= 60) { // Maior ou igual 60
                    System.out.println("Idoso");
                } else if (idade >= 18) { // Maior ou igual a 18
                    System.out.println("Adulto");
                } else if (idade >= 13) { // Maior ou igual a 13
                    System.out.println("Adolescente");
                } else { // caso não for nenhuma das anteriores
                    System.out.println("Criança");
                }
            } catch (InputMismatchException e) { // Trata exceção quando não e um número inteiro
                System.out.println("Tente Novamente, Caracter invalido");
              scanner.next();
            }
        } while (idade != 1000); // Ao digitar 1000 para o loop
        scanner.close(); // Fecha o Scanner
    }
}