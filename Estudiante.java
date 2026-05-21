public class Estudiante {
    private String cedula, nombre, apellido;
    private double nota1, nota2, nota3, promedio;

    public Estudiante(String c, String n, String a, double n1, double n2, double n3) {
        cedula = c;
        nombre = n;
        apellido = a;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        promedio = calcularPromedio();
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String estado() {
        return (promedio >= 7) ? "Aprobado" : "Reprobado";
    }

    public void mostrar() {
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + estado());
        System.out.println("---------------------");
    }

    public boolean aprobo() {
        return promedio >= 7;
    }
}