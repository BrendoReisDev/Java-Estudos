public class Main {
    public static void main(String[] args) {
        // Integer com valor 127 (está dentro da faixa cacheada: -128 a 127)
        Integer a = 127;
        Integer b = 127;

        // Integer com valor 128 (fora da faixa cacheada)
        Integer c = 128;
        Integer d = 128;

        // Comparando a e b com '=='
        if (a == b) {
            // a e b apontam para o mesmo objeto (por causa do cache do Java)
            System.out.println("==");
        } else {
            System.out.println("Print");
        }

        // Comparando a e b com '.equals' (compara o conteúdo/valor)
        if (a.equals(b)) {
            System.out.println(".equals");
        } else {
            System.out.println("Print");
        }

        // Comparando c e d com '=='
        if (c == d) {
            // Aqui dá false, pois c e d são objetos diferentes
            System.out.println("==");
        } else {
            System.out.println("Print");
        }

        // Comparando c e d com '.equals' (compara o conteúdo)
        if (c.equals(d)) {
            System.out.println(".equals");
        } else {
            System.out.println("Print");
        }
    }
}
