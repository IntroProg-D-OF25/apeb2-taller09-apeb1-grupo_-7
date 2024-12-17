
import java.util.Scanner;

public class Ejercicio001 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el limite: ");
        int limite = teclado.nextInt();

        System.out.println("Figura 1:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 2:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= (limite - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 3:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= (limite - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = limite - 1;
        while (i > 0) {
            for (int j = 1; j <= (limite - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }

    }
}
/***
 * Ingrese el limite: 7
Figura 1:
*
**
***
****
*****
******
*******

Figura 2:
      *
     ***
    *****
   *******
  *********
 ***********
*************

Figura 3:
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */
