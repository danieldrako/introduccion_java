public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 1.5e-3f; //20120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("corresponde en byte a  = " + Float.BYTES);
        System.out.println("corresponde en bites a = " + Float.SIZE);
        System.out.println("valor máximo de un byte = " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un bye = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("corresponde en byte a  = " + Double.BYTES);
        System.out.println("corresponde en bites a = " + Double.SIZE);
        System.out.println("valor máximo de un byte = " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un bye = " + Double.MIN_VALUE);

    }
}

//Primitivos numéricos de punto flotante y sus constantes Floating-point numeric primitives and their constants