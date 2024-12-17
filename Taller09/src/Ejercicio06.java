
import java.util.Scanner;


public class Ejercicio06 {
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String letra;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese una letra(EN MAYUSCULA):");
            letra = teclado.nextLine();

            if (letra.length() == 1) {
                for (int i = 0; i < nombres.length; i++) {
                    if (nombres[i].startsWith(letra)) {
                        System.out.println("Coincidencia encontrada con: " + nombres[i]);
                        continuar = false;
                        break;
                    }
                }

                if (continuar) {
                    System.out.println("No hay coincidencia, intente de nuevo");
                }
            } else {
                System.out.println("ingrese solo una letra");
            }
        }


    }
}
/***
 * Ingrese una letra(EN MAYUSCULA):
B
No hay coincidencia, intente de nuevo
Ingrese una letra(EN MAYUSCULA):
M
Coincidencia encontrada con: Mark
 */