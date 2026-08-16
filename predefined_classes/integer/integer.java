package predefined_classes.integer;

public class integer {
    public static void main(String[] args) {
        String s = "10";
        System.out.println(Integer.parseInt(s)); // it return the int value
        System.out.println(Integer.valueOf(s)); // it return the object
        System.out.println(Integer.toString(1)); // it return the string

        // Decimal → Binary
        System.out.println(Integer.toBinaryString(10)); // 1010

        // Decimal → Octal
        System.out.println(Integer.toOctalString(10)); // 12

        // Decimal → Hexadecimal
        System.out.println(Integer.toHexString(10)); // a

        // -----------------------------------------------------------------------------------------
        // Binary → Decimal
        System.out.println(Integer.parseInt("1010", 2));

        // Binary → Octal
        System.out.println(Integer.toOctalString(Integer.parseInt("1010", 2)));

        // Binary → Hexadecimal
        System.out.println(Integer.toHexString(Integer.parseInt("1010", 2)));

        // ----------------------------------------------------------------------------------------
        // Octal → Decimal
        System.out.println(Integer.parseInt("12", 8));

        // Octal → Binary
        System.out.println(Integer.toBinaryString(Integer.parseInt("12", 8)));

        // Octal → Hexadecimal
        System.out.println(Integer.toHexString(Integer.parseInt("12", 8)));
        
        // -------------------------------------------------------------------------------------------
        // Hexadecimal → Decimal
        System.out.println(Integer.parseInt("A", 16));

        // Hexadecimal → Binary
        System.out.println(Integer.toBinaryString(Integer.parseInt("A", 16)));

        // Hexadecimal → Octal
        System.out.println(Integer.toOctalString(Integer.parseInt("A", 16)));
    }
}
