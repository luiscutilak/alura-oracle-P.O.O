public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "Matrix";
        meuFilme.anoDeLancamento = 199;
        meuFilme.duracaoEmMinutos = 136;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(8.7);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());


    }
}