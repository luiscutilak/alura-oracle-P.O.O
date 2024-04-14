public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade(){
        if(idade >= 18){
            return "é maior de idade";
        } else {
            return "é menor de idade";
        }
    }

    public static void main(String[] args) {

        IdadePessoa idade = new IdadePessoa();
        idade.setIdade(17);
        idade.setNome("Arnaldo");

        System.out.println(idade.getNome());
        System.out.println(idade.verificarIdade());
    }
}
