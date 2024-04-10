
public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {

        System.out.println("Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);

    }

    void avaliacao(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return avaliacao / numAvaliacoes;
    }
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Porque ele vive";
        minhaMusica.artista = "Victor Valente-Dunamis";
        minhaMusica.anoLancamento = 2017;

        minhaMusica.exibeFichaTecnica();
        minhaMusica.avaliacao(10);
        minhaMusica.avaliacao(9.8);
        minhaMusica.avaliacao(9);

        System.out.println(minhaMusica.avaliacao);
        System.out.println(minhaMusica.numAvaliacoes);
        System.out.println(minhaMusica.pegaMedia());


    }
}
