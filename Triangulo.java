package figura;

class Triangulo extends Figura {
    private double base;
    private double altura;

    // metodo constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    // la sobrescritura del metodo Area
    @Override
    public double Area() {
        return (base * altura) / 2;
    }
}

