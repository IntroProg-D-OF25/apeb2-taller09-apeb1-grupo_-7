
public class Ejercicio05 {

    public static void main(String[] args) {
        double[] notas = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] nombres = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson",
            "Mark Cook", "Jennifer Manning", "Juan Vasquez"};

        String[] calificaciones = new String[7];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] <= 5.9) {
                calificaciones[i] = "Regular";
            } else if (notas[i] >= 6 && notas[i] <= 8.9) {
                calificaciones[i] = "Bueno";
            } else if (notas[i] >= 9 && notas[i] <= 10) {
                calificaciones[i] = "Sobresaliente";
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo: %s%n", nombres[i], notas[i], calificaciones[i]);
        }
    }
}
/***
 * Kimberly Gonzalez promedio: 10,00 promedio cualitativo: Sobresaliente
Mark Hogan promedio: 10,00 promedio cualitativo: Sobresaliente
Teresa Martinez promedio: 9,10 promedio cualitativo: Sobresaliente
Julia Johnson promedio: 7,00 promedio cualitativo: Bueno
Mark Cook promedio: 6,10 promedio cualitativo: Bueno
Jennifer Manning promedio: 4,00 promedio cualitativo: Regular
Juan Vasquez promedio: 8,00 promedio cualitativo: Bueno
 */