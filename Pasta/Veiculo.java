package Pasta;

class Veiculo {
    private String placa;
    private String cor;
    private int numpassageiros;
    private double capacidadetanque;
    private double velocidademaxima;
    private double consumomedio;

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumpassageiros() {
        return numpassageiros;
    }

    public void setNumpassageiros(int numpassageiros) {
        this.numpassageiros = numpassageiros;
    }

    public double getCapacidadetanque() {
        return capacidadetanque;
    }

    public void setCapacidadetanque(double capacidadetanque) {
        this.capacidadetanque = capacidadetanque;
    }

    public double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public double getConsumomedio() {
        return consumomedio;
    }

    public void setConsumomedio(double consumomedio) {
        this.consumomedio = consumomedio;
    }

    // Construtor
    public Veiculo(String placa, String cor, int numpassageiros, double capacidadetanque, double velocidademaxima, double consumomedio) {
        this.placa = placa;
        this.cor = cor;
        this.numpassageiros = numpassageiros;
        this.capacidadetanque = capacidadetanque;
        this.velocidademaxima = velocidademaxima;
        this.consumomedio = consumomedio;
    }

    // Método para exibir as informações do veículo
    public void exibirInformacoes() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Cor: " + getCor());
        System.out.println("Número de passageiros: " + getNumpassageiros());
        System.out.println("Capacidade do tanque: " + getCapacidadetanque() + " litros");
        System.out.println("Velocidade máxima: " + getVelocidademaxima() + " km/h");
        System.out.println("Consumo médio: " + getConsumomedio() + " km/l");
    }
}


