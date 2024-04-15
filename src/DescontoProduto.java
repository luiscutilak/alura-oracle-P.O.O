
public class DescontoProduto {
    private  String nome;
    private double preco;

    public DescontoProduto(String n, double v) {
        this.nome = n;
        this.preco = v;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        double desconto = preco * (percentual/100);
        preco -= desconto;
    }

    public static void main(String[] args) {
        DescontoProduto p = new DescontoProduto("celular", 2000.00);

        //p.setNome("playstation");
        //p.setPreco(2000.00);

        System.out.println("Nome do Produto: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());

        p.aplicarDesconto(10);

        System.out.println("Preço do produto com desconto: " + p.getPreco());
    }
}
