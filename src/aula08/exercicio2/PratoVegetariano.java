package aula08.exercicio2;

public class PratoVegetariano extends Prato {
    public PratoVegetariano(String nome){
        super(nome);
    }
    @Override
    public boolean addIngrediente(Alimento alim) {
        if (!(alim instanceof Legume) && !(alim instanceof Cereal)) return false;
        return super.addIngrediente(alim);
    }
}
