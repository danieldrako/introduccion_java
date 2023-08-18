import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "ingrese un numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numeroDecimal a binario " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) );

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("binario  a octal " + numeroDecimal  + " = " + Integer.toOctalString(numeroDecimal) );
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("Decimal a hex +  = " + numeroDecimal + " = " + Integer.toHexString(numeroOctal));
        int numeroHex = 0x1F4;

        String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += ".\n Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += ".\n Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
