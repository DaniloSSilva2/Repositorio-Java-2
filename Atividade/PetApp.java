package Atividade;

import java.util.Scanner;

class Pet {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String alimentacao;

    
    public Pet(String nome, int idade, String raca, String porte, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.alimentacao = alimentacao;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getPorte() {
        return porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Raça: " + getRaca());
        System.out.println("Porte: " + getPorte());
        System.out.println("Alimentação: " + getAlimentacao());
    }
}

public class PetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro pet:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Idade: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido para a idade.");
            scanner.next(); 
        }
        int idade1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Raça: ");
        String raca1 = scanner.nextLine();
        System.out.print("Porte (pequeno, médio, grande): ");
        String porte1 = scanner.nextLine();
        System.out.print("Alimentação: ");
        String alimentacao1 = scanner.nextLine();

       
        Pet pet1 = new Pet(nome1, idade1, raca1, porte1, alimentacao1);

        
        System.out.println("\nDigite os dados do segundo pet:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Idade: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido para a idade.");
            scanner.next(); 
        }
        int idade2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Raça: ");
        String raca2 = scanner.nextLine();
        System.out.print("Porte (pequeno, médio, grande): ");
        String porte2 = scanner.nextLine();
        System.out.print("Alimentação: ");
        String alimentacao2 = scanner.nextLine();

        
        Pet pet2 = new Pet(nome2, idade2, raca2, porte2, alimentacao2);

        
        System.out.println("\nInformações do primeiro pet:");
        pet1.exibirInformacoes();

        System.out.println("\nInformações do segundo pet:");
        pet2.exibirInformacoes();

        scanner.close();
    }
}

