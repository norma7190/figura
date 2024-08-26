package figura;

public class Main {
    public static void main(String[] args) {
        // la instancias de cada unas de las figuras
        Figura triangulo = new Triangulo(10, 15);
        Figura rectangulo = new Rectangulo(12, 35);
        Figura circulo = new Circulo(8);

        // Calcular y mostrar las áreas
        System.out.println("area del triangulo: " + triangulo.Area());
        System.out.println("area del rectangulo: " + rectangulo.Area());
        System.out.println("area del círculo: " + circulo.Area());
    }
}

