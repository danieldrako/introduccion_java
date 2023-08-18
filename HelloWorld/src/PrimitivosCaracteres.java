public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal == caracter);

        System.out.println("Corresponde a = " + Character.BYTES);
        System.out.println("Corresponde a = " + Character.SIZE);
        System.out.println("Corresponde a = " + Character.MIN_VALUE);
        System.out.println("Corresponde a = " + Character.MAX_VALUE);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (caracter == simbolo));

    }
}
