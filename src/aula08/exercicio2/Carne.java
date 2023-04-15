package aula08.exercicio2;

public class Carne extends Alimento {
    protected VariedadeCarne variedade;

    public Carne(double calorias, double peso, double proteina, VariedadeCarne variedade){
        super(calorias, peso,proteina);
        this.variedade = variedade;
    }

    public void setVariedade(VariedadeCarne variedade){
        this.variedade = variedade;
    }

    public VariedadeCarne getVariedade(){
        return this.variedade;
    }
}
    

