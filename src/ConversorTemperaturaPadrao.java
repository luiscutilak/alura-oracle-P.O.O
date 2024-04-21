public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double tempC) {
        System.out.println("Conversão Celsius para fahrenheit:");
        double fahrenheit = tempC * 1.8 + 32;
        System.out.println("A conversão de " + tempC +"° Celsius para fahrenheit é: " + fahrenheit+"º");

    }

    @Override
    public void fahrenheitParaCelsius(double tempF) {
        System.out.println("Conversão fahrenheit para Celsius:");
        double celsius = (tempF -32) / 1.8;
        System.out.println("A conversão de " + tempF +"° fahrenheit para Celsius é: " + celsius+"º");

    }
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(30);
        conversor.fahrenheitParaCelsius(75);

    }
}
