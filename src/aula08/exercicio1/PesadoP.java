package aula08.exercicio1;

public class PesadoP extends Veiculo {
    private int peso;
    private int numMaxPassageiros;

    public PesadoP(String matricula, String marca, String modelo, int potencia, int numQuadro, int peso, int numMaxPassageiros) {
        super(matricula, marca, modelo, potencia, numQuadro);
        this.peso = peso;
        this.numMaxPassageiros = numMaxPassageiros;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getNumMaxPassageiros() {
        return numMaxPassageiros;
    }

    public void setNumMaxPassageiros(int numMaxPassageiros) {
        this.numMaxPassageiros = numMaxPassageiros;
    }

    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Peso: " + this.peso + ", " + "Numero Maximo de Passageiros: " + this.numMaxPassageiros;
    }
}

