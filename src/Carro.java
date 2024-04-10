import java.util.Date;

public class Carro {

    String modelo;
    String cor;
    int ano;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano:" + ano);
    }
    int calculaIdade() {
        return 2024 - ano;
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Idea";
        meuCarro.cor = "Prata";
        meuCarro.ano = 2010;

        meuCarro.exibeFichaTecnica();

        System.out.println("idade do carro: " + meuCarro.calculaIdade() + " anos" );

    }
}

