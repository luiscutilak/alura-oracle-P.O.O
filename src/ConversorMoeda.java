public class ConversorMoeda implements ConversaoFinanceira {
    double cotacaoDolar = 5.23;
    double valorReal;
    @Override
    public void converterDolarParaReal(double valorDolar) {
        cotacaoDolar = 5.23;
        valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$ " + valorReal );
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50);
    }
}
