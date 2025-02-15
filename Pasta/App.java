package Pasta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados do livro
        System.out.println("Digite os dados do livro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int numeropaginas = scanner.nextInt();
        System.out.print("Preço: R$ ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha após ler o número

        // Criando o livro
        Livro livro = new Livro(titulo, autor, isbn, numeropaginas, preco);

        // Exibindo as informações do livro
        System.out.println("\nInformações do livro:");
        livro.exibirInformacoes();

        // Dados do veículo
        System.out.println("\nDigite os dados do veículo:");
        scanner.nextLine(); // Consumir a nova linha de antes (após o 'nextDouble()')
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Número de passageiros: ");
        int numpassageiros = scanner.nextInt();
        System.out.print("Capacidade do tanque (em litros): ");
        double capacidadetanque = scanner.nextDouble();
        System.out.print("Velocidade máxima (km/h): ");
        double velocidademaxima = scanner.nextDouble();
        System.out.print("Consumo médio (km/l): ");
        double consumomedio = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha após ler o número

        // Criando o veículo
        Veiculo veiculo = new Veiculo(placa, cor, numpassageiros, capacidadetanque, velocidademaxima, consumomedio);

        // Exibindo as informações do veículo
        System.out.println("\nInformações do veículo:");
        veiculo.exibirInformacoes();

        scanner.close();
    }
}






