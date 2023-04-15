package aula08.exercicio1;

public class PesadoEle extends  VeiculoEletrico {
    private int numPassageiros;
    private int peso;

    public PesadoEle(String matricula, String marca, String modelo, int potencia, int numQuadro, int autonomia, int percentagemAtual, int numPassageiros, int peso) {
        super(matricula, marca, modelo, potencia, numQuadro, autonomia, percentagemAtual);
        this.numPassageiros = numPassageiros;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Autonomia: " + this.autonomia + ", " + "Percentagem de Bateri " + this.percentagemAtual+ ", " + "Numero de Passageiros: " + this.numPassageiros + ", " + "Peso: " + this.peso ;
    }

}
