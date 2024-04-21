package br.com.alura.livros;

public class ProdutoFisico extends Produto implements Calculavel2{
    @Override
    public double calcularPrecoFinal(){

        double preco = 50.0;
        return preco * 1.05;

    }

}
