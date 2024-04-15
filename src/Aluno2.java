public class Aluno2 {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private double totalDeNotas;

    public Aluno2(String n, int i, int i1, int i2, int i3) {
        this.nome = n;
        this.nota1 = i;
        this.nota2 = i1;
        this.nota3 = i2;
        this.nota4 = i3;
    }


    public double calcularMedia(){

        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public static void main(String[] args) {
        Aluno2 a = new Aluno2("Luís", 7, 8, 9, 0);
        Aluno2 a2 = new Aluno2("Amanda", 10, 10, 10, 10);

        System.out.println("-----------------------------------------------");
        System.out.println("Matéria: Matemática - 1º Semestre");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Nota: " + a.getNota1());
        System.out.println("Nota: " + a.getNota2());
        System.out.println("Nota: " + a.getNota3());
        System.out.println("Nota: " + a.getNota4());
        System.out.println("Media das Avaliações: " + a.calcularMedia());
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        System.out.println("Matéria: Geofrafia - 1º Semestre");
        System.out.println("Nome: " + a2.getNome());
        System.out.println("Nota: " + a2.getNota1());
        System.out.println("Nota: " + a2.getNota2());
        System.out.println("Nota: " + a2.getNota3());
        System.out.println("Nota: " + a2.getNota4());
        System.out.println("Media das Avaliações: " + a2.calcularMedia());
        System.out.println("-----------------------------------------------");


    }
}
