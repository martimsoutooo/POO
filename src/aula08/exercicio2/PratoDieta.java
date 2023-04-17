package aula08.exercicio2;


public class PratoDieta extends Prato{
    private double maxCalorias;

    public PratoDieta(String nome, double maxCalorias){
        super(nome);
        this.maxCalorias = maxCalorias;
    }

    public void setMaxCalorias(double maxCalorias) {
        this.maxCalorias = maxCalorias;
    }

    public double getMaxCalorias() {
        return maxCalorias;
    }
    @Override
    public String toString() {
        return super.toString() + "- Dieta ("+maxCalorias+" Calorias)";
    }
}
