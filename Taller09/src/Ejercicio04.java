
public class Ejercicio04 {
    
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};

       
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double media = (double) suma / arreglo.length;
        int arriba = 0;
        int abajo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arriba++;
            } else if (arreglo[i] < media) {
                abajo++;
            }
        }
        System.out.println("La media aritmetica es: " + media);
        System.out.println("Cantidad de elementos por encima de la media: " + arriba);
        System.out.println("Cantidad de elementos por debajo de la media: " + abajo);
    }
}

/***
 * La media aritmetica es: 9.538461538461538
Cantidad de elementos por encima de la media: 8
Cantidad de elementos por debajo de la media: 5
 */