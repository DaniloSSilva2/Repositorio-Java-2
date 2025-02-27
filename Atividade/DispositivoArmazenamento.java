package Atividade;

public class DispositivoArmazenamento extends Id {

private double capacidadearmazenamento;

private String tipoconexao;

public DispositivoArmazenamento(String marca, String modelo, double capacidadearmazenamento, String tipoconexao) {
    super(marca, modelo);
    this.capacidadearmazenamento = capacidadearmazenamento;
    this.tipoconexao = tipoconexao;
}

public double getCapacidadearmazenamento() {
    return capacidadearmazenamento;
}

public void setCapacidadearmazenamento(double capacidadearmazenamento) {
    this.capacidadearmazenamento = capacidadearmazenamento;
}

public String getTipoconexao() {
    return tipoconexao;
}

public void setTipoconexao(String tipoconexao) {
    this.tipoconexao = tipoconexao;
}

@Override
public String toString() {
    return "DispositivoArmazenamento [marca=" + marca + ", capacidadearmazenamento=" + capacidadearmazenamento
            + ", modelo=" + modelo + ", tipoconexao=" + tipoconexao + "]";
}















}
