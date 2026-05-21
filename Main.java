import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        int aprobados = 0, reprobados = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEstudiante " + (i + 1));

            System.out.print("Cedula: ");
            String cedula = sc.next();

            System.out.print("Nombre: ");
            String nombre = sc.next();

            System.out.print("Apellido: ");
            String apellido = sc.next();

            double n1, n2, n3;

            do {
                System.out.print("Nota 1: ");
                n1 = sc.nextDouble();
            } while (n1 < 0 || n1 > 10);

            do {
                System.out.print("Nota 2: ");
                n2 = sc.nextDouble();
            } while (n2 < 0 || n2 > 10);

            do {
                System.out.print("Nota 3: ");
                n3 = sc.nextDouble();
            } while (n3 < 0 || n3 > 10);

            Estudiante e = new Estudiante(cedula, nombre, apellido, n1, n2, n3);
            estudiantes.add(e);
        }

        System.out.println("\nLISTADO DE ESTUDIANTES");

        for (Estudiante e : estudiantes) {
            e.mostrar();
            if (e.aprobo())
                aprobados++;
            else
                reprobados++;
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        sc.close();
    }
}