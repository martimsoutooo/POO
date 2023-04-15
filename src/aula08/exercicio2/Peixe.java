package aula08.exercicio2;

public class Peixe extends Alimento {
    private TipoPeixe tipo;

    public Peixe(double calorias, double peso,double proteina, TipoPeixe tipo) {
        super(calorias, peso, proteina);
        this.tipo = tipo;
    }

    public TipoPeixe getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeixe tipo) {
        this.tipo = tipo;
    }
}
