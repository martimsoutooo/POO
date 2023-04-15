package aula08.exercicio2;

public abstract class Alimento {
    protected double calorias;
    protected double peso;
    protected double proteina;

    public Alimento(double calorias, double peso, double proteina){
        this.calorias = calorias;
        this.peso = peso;
        this.proteina = proteina;
    }

    public void setCalorias(double calorias){
        this.calorias = calorias;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getCalorias(){
        return this.calorias;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getProteina(){
        return this.proteina;
    }

    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    @Override
    public String toString() {
        return "Alimento [proteinas=" + proteina + ", calorias=" + calorias + ", peso=" + peso + "]";
    }

    


}
