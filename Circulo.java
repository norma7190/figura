package figura;
class Circulo extends Figura {
    private double radio;
    // metodo constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    /*. la Sobrescritura del método calcularArea*/
    @Override
    public double Area() {
        return Math.PI * radio * radio;
    }
}
