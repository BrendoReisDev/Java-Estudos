import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            //   lê a nota como string
            String stringNota = scanner.nextLine();
            //  converte a string para double
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
            System.out.println("Entrada inválida");
        }
    }
}
