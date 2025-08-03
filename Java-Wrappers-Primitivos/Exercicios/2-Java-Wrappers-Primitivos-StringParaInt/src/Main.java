import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String string = scanner.nextLine();
        int num = Integer.parseInt(string);
        num = num + 10;
        System.out.println("Resultado: " + num);
    }
}
