package Pasta;

// Arquivo Livro.java
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeropaginas;
    private double preco;

    // Construtor
    public Livro(String titulo, String autor, String isbn, int numeropaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeropaginas = numeropaginas;
        this.preco = preco;
    }

    // Getters e Setters
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Número de Páginas: " + getNumeropaginas());
        System.out.println("Preço: R$ " + getPreco());
    }
}
