
public class ModeloCarro extends Carro{
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.cor("vermelho");
        meuCarro.definirModelo("Hatch");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}
