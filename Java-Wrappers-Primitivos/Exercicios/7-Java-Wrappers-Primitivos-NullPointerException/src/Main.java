import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Integer numero = null;
            int numeroPrimitivo = scanner.nextInt();
            int calc;
            calc = numero + numeroPrimitivo;
            System.out.println(calc);
        }
        catch (NullPointerException e){
            System.out.println("Erro NullPointerException: Não e possivel calcular null ");
        }


    }
}