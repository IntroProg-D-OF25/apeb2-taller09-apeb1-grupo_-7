
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el numero de marcas: ");
        int num = teclado.nextInt();
      

        String[] marcas = new String[num];
        int contador = 0;

        while (contador < num) {
            System.out.print("Marca " + (contador + 1) + ": ");
            String marca = teclado.nextLine();

            if (marca.length() > 0) {
                if (!(marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T"))) {
                    marcas[contador] = marca;
                    contador++;
                } else {
                    System.out.println("Error, no puede empezar con A, C o T");
                }
            } else {
                System.out.println("Error.");
            }
        }

        System.out.println("Marcas ingresadas:");
        for (int i = 0; i < marcas.length; i++) {
            System.out.println("- " + marcas[i]);
        }

    }

}
/***
 * Ingresa el numero de marcas: 7
Marca 1: A
Error, no puede empezar con A, C o T
Marca 1: Mazda
Marca 2: Ferrari
Marca 3: Lambo
Marca 4: Jetour
Marca 5: Suzuki
Marca 6: Ford
Marca 7: Peugeot
Marcas ingresadas:
- Mazda
- Ferrari
- Lambo
- Jetour
- Suzuki
- Ford
- Peugeot
 */