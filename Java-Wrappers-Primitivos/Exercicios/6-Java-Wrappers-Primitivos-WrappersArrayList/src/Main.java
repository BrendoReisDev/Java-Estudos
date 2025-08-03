import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int calc;
        double calcD;
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        ArrayList<Double> listadouble = new ArrayList<>();
        listadouble.add(1.0);
        listadouble.add(2.0);
        listadouble.add(3.0);
        listadouble.add(4.0);
        listadouble.add(5.0);


        int soma = 0;
        for (int num : lista) {
            soma += num;
        }
        System.out.println("Soma: " + soma);


        double somaD = 0;
        for (double num : listadouble) {
            somaD += num;
        }
        System.out.println("Soma: " + somaD);
    }
}
