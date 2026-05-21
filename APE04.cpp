#include <iostream>
#include <vector>
using namespace std;

class Estudiante {
private:
    string cedula, nombre, apellido;
    float nota1, nota2, nota3, promedio;

public:
    Estudiante(string c, string n, string a, float n1, float n2, float n3) {
        cedula = c;
        nombre = n;
        apellido = a;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        promedio = calcularPromedio();
    }

    float calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    string estado() {
        return (promedio >= 7) ? "Aprobado" : "Reprobado";
    }

    void mostrar() {
        cout << "Cedula: " << cedula << endl;
        cout << "Nombre: " << nombre << " " << apellido << endl;
        cout << "Promedio: " << promedio << endl;
        cout << "Estado: " << estado() << endl;
        cout << "-------------------------" << endl;
    }

    bool aprobo() {
        return promedio >= 7;
    }
};

int main() {
    vector<Estudiante> estudiantes;
    int aprobados = 0, reprobados = 0;

    for (int i = 0; i < 5; i++) {
        string cedula, nombre, apellido;
        float n1, n2, n3;

        cout << "\nEstudiante " << i + 1 << endl;

        cout << "Cedula: ";
        cin >> cedula;

        cout << "Nombre: ";
        cin >> nombre;

        cout << "Apellido: ";
        cin >> apellido;

        do {
            cout << "Nota 1: ";
            cin >> n1;
        } while (n1 < 0 || n1 > 10);

        do {
            cout << "Nota 2: ";
            cin >> n2;
        } while (n2 < 0 || n2 > 10);

        do {
            cout << "Nota 3: ";
            cin >> n3;
        } while (n3 < 0 || n3 > 10);

        Estudiante e(cedula, nombre, apellido, n1, n2, n3);
        estudiantes.push_back(e);
    }

    cout << "\nLISTADO DE ESTUDIANTES\n";

    for (auto &e : estudiantes) {
        e.mostrar();
        if (e.aprobo())
            aprobados++;
        else
            reprobados++;
    }

    cout << "Aprobados: " << aprobados << endl;
    cout << "Reprobados: " << reprobados << endl;

    return 0;
}