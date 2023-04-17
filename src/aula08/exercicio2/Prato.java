package aula08.exercicio2;

import java.util.List;
import java.util.ArrayList;
public class Prato {
    protected String nome;
    protected List<Alimento> listaAlimentos = new ArrayList<Alimento>();

    public Prato(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAlimentos(List<Alimento> alimentos){
        this.listaAlimentos = alimentos;
    }

    public String getNome(){
        return this.nome;
    }

    public List<Alimento> getAlimentos(){
        return this.listaAlimentos;
    }

    public boolean addIngrediente(Alimento alim) {
        listaAlimentos.add(alim);
        return true;
    }

    @Override
    public String toString() {
        return "Prato '" + nome + "', composto por " + listaAlimentos.size() + " Ingredientes";
    }
}
