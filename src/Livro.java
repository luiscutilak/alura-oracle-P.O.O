import br.com.alura.livros.Calculavel2;

public class Livro extends Produto implements Calculavel2 {
    private String autor;

    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}


