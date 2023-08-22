public class Circulo {
    private double coordX;
    private double coordY;
    private double raio;
   
    public Circulo(double x, double y, double r) {
        this.coordX = x;
        this.coordY = y;
        this.raio = r;
    }
    public double getRaio() {
        return raio;
    }
    public double circunferencia() {
        double result;
        result = Math.PI * this.raio * 2;
        return result;
    }
    public double area() {
        double result;
        result = Math.pow(this.raio, 2) * Math.PI;
        return result;
    }
    public double volumeEsfera() {
        double result;
        result = (Math.PI * Math.pow(this.raio, 3) * 4) / 3;
        return result;
    }
    public void moverCirculo(double x, double y) {
        this.coordX = x;
        this.coordY = y;
        System.out.println("Círculo movido com sucesso");
    }
    public double compareTo (Circulo outro) {
        double dif = this.raio - outro.getRaio();
        int result = (int) Math.round(dif);
        return result;
    }
     public String toString() {
        return "Coordenada X: " + this.coordX + " Coordenada Y: " + this.coordY + " Raio: " + this.raio;
    }
}
