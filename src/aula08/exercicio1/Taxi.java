package aula08.exercicio1;

public class Taxi extends Ligeiro{
    private int numLicenca;
    private int capacidadeBagageira;

    public Taxi(String matricula, String marca, String modelo, int potencia, int numQuadro, int capacidadeBagageira, int numLicenca) {
        super(matricula, marca, modelo, potencia, numQuadro, capacidadeBagageira);
        this.numLicenca = numLicenca;
    }

    public int getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(int numLicenca) {
        this.numLicenca = numLicenca;
    }

    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Capacidade da Bagageira: " + this.capacidadeBagageira + ", " + "Numero de Licenca: " + this.numLicenca;
    }
}
