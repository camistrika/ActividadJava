package com.introduccion;

public class Estudiante {
    private static int estudiantesTotales = 0;
    private String nombre;
    private int edad;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        estudiantesTotales++;
    }

    // Método de instancia para presentarse
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad);
    }

    // Método de clase para obtener el valor de estudiantesTotales
    public static int getEstudiantesTotales() {
        return estudiantesTotales;
    }

    // Método de clase para agregar un nuevo estudiante
    public static Estudiante agregarEstudiante(String nombre, int edad) {
        return new Estudiante(nombre, edad);
    }

    public static void main(String[] args) {
        // Crear estudiantes y mostrar información
        Estudiante estudiante1 = new Estudiante("Juan", 20);
        Estudiante estudiante2 = new Estudiante("Maria", 22);

        estudiante1.presentarse();
        estudiante2.presentarse();

        // Obtener el número total de estudiantes
        int totalEstudiantes = Estudiante.getEstudiantesTotales();
        System.out.println("Numero total de estudiantes: " + totalEstudiantes);

        // Agregar un nuevo estudiante
        Estudiante nuevoEstudiante = Estudiante.agregarEstudiante("Carlos", 19);
        nuevoEstudiante.presentarse();

        // Actualizar el número total de estudiantes
        totalEstudiantes = Estudiante.getEstudiantesTotales();
        System.out.println("Numero total de estudiantes: " + totalEstudiantes);
    }
}
