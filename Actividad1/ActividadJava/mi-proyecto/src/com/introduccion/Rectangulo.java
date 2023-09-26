package com.introduccion;

public class Rectangulo {
    private double largo;
    private double ancho;

    // Constructor de la clase Rectangulo
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return largo * ancho;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    public static void main(String[] args) {
        // Crear objetos de tipo Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(5.0, 3.0);
        Rectangulo rectangulo2 = new Rectangulo(7.0, 4.0);

        // Calcular y mostrar el área y el perímetro de los rectángulos
        System.out.println("Rectangulo 1:");
        System.out.println("area: " + rectangulo1.calcularArea());
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());

        System.out.println("\nRectangulo 2:");
        System.out.println("area: " + rectangulo2.calcularArea());
        System.out.println("Perimetro: " + rectangulo2.calcularPerimetro());
    }
}
