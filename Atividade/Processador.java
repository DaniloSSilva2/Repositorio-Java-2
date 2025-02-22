package Atividade;

public class Processador extends Id {

private double frequencia;

public Processador(String marca, String modelo, double frequencia) {
    super(marca, modelo);
    this.frequencia = frequencia;
}

public double getFrequencia() {
    return frequencia;
}

public void setFrequencia(double frequencia) {
    this.frequencia = frequencia;
}

@Override
public String toString() {
    return "Processador [marca=" + marca + ", frequencia=" + frequencia + ", modelo=" + modelo + "]";
}







}
