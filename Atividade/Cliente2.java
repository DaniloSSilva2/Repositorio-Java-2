package Atividade;

public class Cliente2 {
private String nome;
private int idade;
private Pet3 pet;


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
public Pet3 getPet() {
    return pet;
}
public void setPet(Pet3 pet) {
    this.pet = pet;
}


public Cliente2(String nome, int idade, Pet3 pet) {
    this.nome = nome;
    this.idade = idade;
    this.pet = pet;
}
@Override
public String toString() {
    return "Cliente2 [nome=" + nome + ", idade=" + idade + ", pet=" + pet + ", getNome()=" + getNome() + ", getIdade()="
            + getIdade() + ", getPet()=" + getPet() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
            + ", toString()=" + super.toString() + "]";
}






}