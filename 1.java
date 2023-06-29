import java.util.Scanner;

public class EvaluacionesAlumno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las tres evaluaciones
        System.out.print("Ingrese la nota de la evaluación 1: ");
        double evaluacion1 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la evaluación 2: ");
        double evaluacion2 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la evaluación 3: ");
        double evaluacion3 = scanner.nextDouble();

        // Verificar si todas las evaluaciones son válidas (entre 0 y 10)
        if (evaluacion1 >= 0 && evaluacion1 <= 10 &&
                evaluacion2 >= 0 && evaluacion2 <= 10 &&
                evaluacion3 >= 0 && evaluacion3 <= 10) {

            // Calcular el promedio de las evaluaciones
            double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

            // Determinar el estado de aprobación o reprobación del alumno
            String estado = (promedio >= 7) ? "aprobado" : "reprobado";

            // Imprimir el promedio y el estado del alumno
            System.out.println("El promedio del alumno es: " + promedio);
            System.out.println("El alumno está " + estado + ".");
        } else {
            System.out.println("Ingrese notas válidas entre 0 y 10.");
        }

        scanner.close();
    }
}