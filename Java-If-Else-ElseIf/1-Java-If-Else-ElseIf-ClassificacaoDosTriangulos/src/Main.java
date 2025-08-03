import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para ler dados da entrada padrão
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;

        System.out.println("Digite lado 1 do triangulo: ");
        lado1 = scanner.nextInt();
        System.out.println("Digite lado 2 do triangulo: ");
        lado2 = scanner.nextInt();
        System.out.println("Digite lado 3 do triangulo: ");
        lado3 = scanner.nextInt();


        // Triangulo: Equilátero
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo: Equilátero");

            // Triangulo: Isósceles
        } else if ((lado1 == lado2 || lado2 == lado3 || lado1 == lado3) && !(lado1 == lado2 && lado2 == lado3)) {
            System.out.println("Triângulo: Isósceles");
        }

        // Triangulo: Escaleno
        else if ((lado1 != lado2 && lado2 != lado3 && lado1 != lado3)) {
            System.out.println("Triângulo:Escaleno");
        }
    }
}
