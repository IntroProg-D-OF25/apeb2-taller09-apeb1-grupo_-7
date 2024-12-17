
public class Ejercicio07 {

    public static void main(String[] args) {
        String[] nombres = new String[28];
        double[] notas = new double[28];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "Alumno" + (i + 1);
        }

        for (int i = 0; i < notas.length; i++) {
            notas[i] = 1 + (Math.random() * 9);
        }

        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double promedio = suma / notas.length;

        System.out.println("Promedio del ciclo: " + promedio);

        System.out.println("Estudiantes con calificacion por encima del promedio:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedio) {
                System.out.println(nombres[i] + ": " + notas[i]);
            }
        }

        System.out.println("Estudiantes con calificacion por debajo del promedio:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < promedio) {
                System.out.println(nombres[i] + ": " + notas[i]);
            }
        }

        int mejor = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notas[mejor]) {
                mejor = i;
            }
        }
        System.out.println("Estudiante con la mejor calificacion: " + nombres[mejor] + " con " + notas[mejor]);

        int peor = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < notas[peor]) {
                peor = i;
            }
        }
        System.out.println("Estudiante con la calificacion mas baja: " + nombres[peor] + " con " + notas[peor]);
    }
}

/***
 * Promedio del ciclo: 5.155977298905192
Estudiantes con calificacion por encima del promedio:
Alumno1: 6.763634584160844
Alumno2: 5.938177757874618
Alumno3: 5.970788834174362
Alumno4: 8.277513470180853
Alumno5: 9.041428112214671
Alumno8: 6.919635675177121
Alumno10: 7.260047298749061
Alumno16: 8.479762620997208
Alumno21: 9.192539232163478
Alumno22: 6.229031398697519
Alumno24: 8.506263532737783
Alumno25: 7.505408746806613
Alumno27: 8.742007689577296
Estudiantes con calificacion por debajo del promedio:
Alumno6: 2.8393197332658744
Alumno7: 5.058711370727718
Alumno9: 1.3279914992780102
Alumno11: 1.2884211916235209
Alumno12: 2.9058685119127374
Alumno13: 2.4761995713535665
Alumno14: 4.025942023199903
Alumno15: 4.299786489569438
Alumno17: 3.0228961306290585
Alumno18: 2.4487553848210215
Alumno19: 4.817164473188884
Alumno20: 3.6018099948195306
Alumno23: 1.829653048022532
Alumno26: 2.5159437152136936
Alumno28: 3.0826622782084687
Estudiante con la mejor calificacion: Alumno21 con 9.192539232163478
Estudiante con la calificacion mas baja: Alumno11 con 1.2884211916235209
 */