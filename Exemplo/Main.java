package Exemplo;
public class Main {
public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Marta", 30, "marta@gmail.com");


   // pessoa.setNome("Marta");
    //pessoa.setIdade(30);
    //pessoa.setEmail("marta@gmail.com");


    System.out.println("Nome:"+pessoa.getNome());
    System.out.println("Idade:"+pessoa.getIdade());
    System.out.println("Email:"+pessoa.getEmail());
}
}
