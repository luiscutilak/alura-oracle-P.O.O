public class Aluno {

    String nome;
    int idade;

    void exibeInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade);
    }
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.idade = 38;
        aluno1.nome = "Luis";


        aluno1.exibeInformacoes();


    }
}
