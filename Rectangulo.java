package figura;

class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Sobrescritura del método calcularArea
    @Override
    public double Area() {
        return largo * ancho;
    }
}

