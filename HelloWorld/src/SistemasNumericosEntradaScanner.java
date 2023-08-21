import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");

        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numeroDecimal a binario " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) );

        System.out.println("binario  a octal " + numeroDecimal  + " = " + Integer.toOctalString(numeroDecimal) );

        System.out.println("Decimal a hex +  = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += ".\n Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += ".\n Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);
    }
}
