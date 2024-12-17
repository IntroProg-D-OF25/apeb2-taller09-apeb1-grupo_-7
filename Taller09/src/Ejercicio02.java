
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el limite: ");
        int limite = teclado.nextInt();

        int a = 0, b = 1;
        int cont = 0;
        int numPrimo = 2;
        int contPrimos = 0;

        for (int i = 0; i < limite; i++) {
            int fibonacci = 0;
            if (cont < 2) {
                fibonacci = cont;
            } else {
                fibonacci = a + b;
                a = b;
                b = fibonacci;
            }
            cont++;

            while (true) {
                boolean Primo = true;
                if (numPrimo <= 1) {
                    Primo = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(numPrimo); j++) {
                        if (numPrimo % j == 0) {
                            Primo = false;
                            break;
                        }
                    }
                }
                if (Primo) {
                    contPrimos++;
                    break;
                }
                numPrimo++;
            }

            System.out.print(fibonacci + "/" + numPrimo);
            if (i < limite - 1) {
                System.out.print(", ");
            }

            numPrimo++;
        }

    }
}

/***
 * Ingrese el limite: 7
0/2, 1/3, 1/5, 2/7, 3/11, 5/13, 8/17
 */
