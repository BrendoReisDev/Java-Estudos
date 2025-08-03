import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Character letraCharac = scanner.next().charAt(0);
       char letra = letraCharac;
       if (Character.isUpperCase(letra)){
           System.out.println("Maiúsculo : "+letra);
       }
       else {
           System.out.println("Minúsculo: "+letra);
       }


    }
}