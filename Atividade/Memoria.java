package Atividade;

public class Memoria extends Id {

private double capacidadeDeArmazenamento;

public Memoria(String marca, String modelo, double capacidadeDeArmazenamento) {
    super(marca, modelo);
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
}

public double getCapacidadeDeArmazenamento() {
    return capacidadeDeArmazenamento;
}

public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
}

@Override
public String toString() {
    return "Memoria [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + ", modelo=" + modelo
            + "]";
}
















}
