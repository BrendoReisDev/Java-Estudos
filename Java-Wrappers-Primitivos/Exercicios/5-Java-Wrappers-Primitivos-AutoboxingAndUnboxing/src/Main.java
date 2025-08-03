public class Main {
    public static void main(String[] args) {
        // auto e o un podem ser utilizados sozinhos!

        // byte
        byte primByte = 1;
        Byte objByte = primByte;          // autoboxing
        byte primByte2 = objByte;         // unboxing

        // short
        short primShort = 2;
        Short objShort = primShort;       // autoboxing
        short primShort2 = objShort;      // unboxing

        // int
        int primInt = 3;
        Integer objInt = primInt;         // autoboxing
        int primInt2 = objInt;            // unboxing

        // long
        long primLong = 4L;
        Long objLong = primLong;          // autoboxing
        long primLong2 = objLong;         // unboxing

        // float
        float primFloat = 5.5f;
        Float objFloat = primFloat;       // autoboxing
        float primFloat2 = objFloat;      // unboxing

        // double
        double primDouble = 6.6;
        Double objDouble = primDouble;    // autoboxing
        double primDouble2 = objDouble;   // unboxing

        // char
        char primChar = 'A';
        Character objChar = primChar;     // autoboxing
        char primChar2 = objChar;         // unboxing

        // boolean
        boolean primBoolean = true;
        Boolean objBoolean = primBoolean; // autoboxing
        boolean primBoolean2 = objBoolean;// unboxing

      
        System.out.println("byte: " + primByte2);
        System.out.println("short: " + primShort2);
        System.out.println("int: " + primInt2);
        System.out.println("long: " + primLong2);
        System.out.println("float: " + primFloat2);
        System.out.println("double: " + primDouble2);
        System.out.println("char: " + primChar2);
        System.out.println("boolean: " + primBoolean2);
    }
}
