package Atividade;

import java.util.Scanner;

class Book {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private double preco;

    public Book(String titulo, String autor, int numeroDePaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de páginas: " + getNumeroDePaginas());
        System.out.println("Preço: R$ " + getPreco());
    }
}

public class Livro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro livro:");
        System.out.print("Título: ");
        String titulo1 = scanner.nextLine();
        System.out.print("Autor: ");
        String autor1 = scanner.nextLine();
        System.out.print("Número de páginas: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido para o número de páginas.");
            scanner.next(); // Limpa o buffer
        }
        int numeroDePaginas1 = scanner.nextInt();
        System.out.print("Preço: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um valor numérico válido para o preço.");
            scanner.next(); // Limpa o buffer
        }
        double preco1 = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer de linha após números

        Book book1 = new Book(titulo1, autor1, numeroDePaginas1, preco1);

        System.out.println("\nDigite os dados do segundo livro:");
        System.out.print("Título: ");
        String titulo2 = scanner.nextLine();
        System.out.print("Autor: ");
        String autor2 = scanner.nextLine();
        System.out.print("Número de páginas: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido para o número de páginas.");
            scanner.next(); 
        }
        int numeroDePaginas2 = scanner.nextInt();
        System.out.print("Preço: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um valor numérico válido para o preço.");
            scanner.next(); 
        }
        double preco2 = scanner.nextDouble();
        scanner.nextLine(); 

        Book book2 = new Book(titulo2, autor2, numeroDePaginas2, preco2);

        System.out.println("\nInformações do primeiro livro:");
        book1.exibirInformacoes();
        
        System.out.println("\nInformações do segundo livro:");
        book2.exibirInformacoes();

        scanner.close();
    }
}

