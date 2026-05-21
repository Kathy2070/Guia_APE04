Algoritmo APE04
	Definir cedula, nombre, apellido Como Cadena
    Definir nota1, nota2, nota3, promedio Como Real
    Definir aprobados, reprobados Como Entero
	
    aprobados <- 0
    reprobados <- 0
	
    Para i <- 1 Hasta 5 Hacer
        
        Escribir "Ingrese cédula:"
        Leer cedula
        
        Escribir "Ingrese nombre:"
        Leer nombre
        
        Escribir "Ingrese apellido:"
        Leer apellido
        
        Repetir
            Escribir "Ingrese nota 1 (0-10):"
            Leer nota1
        Hasta Que nota1 >= 0 Y nota1 <= 10
        
        Repetir
            Escribir "Ingrese nota 2 (0-10):"
            Leer nota2
        Hasta Que nota2 >= 0 Y nota2 <= 10
        
        Repetir
            Escribir "Ingrese nota 3 (0-10):"
            Leer nota3
        Hasta Que nota3 >= 0 Y nota3 <= 10
        
        promedio <- (nota1 + nota2 + nota3) / 3
        
        Si promedio >= 7 Entonces
            Escribir "APROBADO"
            aprobados <- aprobados + 1
        SiNo
            Escribir "REPROBADO"
            reprobados <- reprobados + 1
        FinSi
        
        Escribir "Promedio: ", promedio
        
    FinPara
	
    Escribir "Total aprobados: ", aprobados
    Escribir "Total reprobados: ", reprobados
FinAlgoritmo
