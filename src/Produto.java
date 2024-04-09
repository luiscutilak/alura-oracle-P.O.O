public class Produto {
    String nome;
    double preco;
    double descontoParaPix;


    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            double precoFinal = preco - descontoParaPix;
        } else {
            double precoFinal = preco;
        }
        return preco;
    }
    public static void main(String[] args) {
    Produto produto = new Produto();
    }


}
