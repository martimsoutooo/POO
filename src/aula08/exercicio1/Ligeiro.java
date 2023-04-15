package aula08.exercicio1;

public class Ligeiro extends Veiculo {
    private int capacidadeBagageira;

    public Ligeiro(String matricula, String marca, String modelo, int potencia, int numQuadro, int capacidadeBagageira) {
        super(matricula, marca, modelo, potencia, numQuadro);
        this.capacidadeBagageira = capacidadeBagageira;
    }

    public int getCapacidadeBagageira() {
        return capacidadeBagageira;
    }

    public void setCapacidadeBagageira(int capacidadeBagageira) {
        this.capacidadeBagageira = capacidadeBagageira;
    }
    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Capacidade da Bagageira: " + this.capacidadeBagageira;
    }
}
