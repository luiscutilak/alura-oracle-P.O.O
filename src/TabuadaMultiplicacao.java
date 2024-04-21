public class TabuadaMultiplicacao implements Tabuada {

    int multiplicando;
    @Override
    public void mostrartabuada(int multiplicador) {
        System.out.println("Tabuada do multiplicador: " + multiplicador);
        for (int i = 0; i <= 10 ; i++) {
            int produto = multiplicador * i;
            System.out.println(multiplicador + " x " + i + " = " + produto);
        }
    }
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrartabuada(5);
    }


}
