public class Livro {

    private String titulo;
    private String autor;

    public Livro(String t, String a) {
        this.autor = a;
        this.titulo = t;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Mindset", "Carol Dwek");
        Livro livro2 = new Livro("Pai rico, Pai pobre", "Robert Kiyosaki");


        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("--------------------------------");
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Titulo: " + livro2.getTitulo());

    }
}
