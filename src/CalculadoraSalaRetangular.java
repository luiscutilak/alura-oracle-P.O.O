public class CalculadoraSalaRetangular implements CalculoGeometrico   {
    double altura;
    double largura;
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A area da sala tem o total de: " + area + "m²");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
    double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é de: " + perimetro);
    }
    public static void main(String[] args) {
        CalculadoraSalaRetangular csr = new CalculadoraSalaRetangular();
        csr.calcularArea(5, 8);
        csr.calcularPerimetro(5, 8);
    }


}
