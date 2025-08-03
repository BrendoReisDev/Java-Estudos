import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String string = scanner.nextLine();
        double primDouble = Double.parseDouble(string);
        System.out.println(primDouble * 2);

    }
}