package aula08.exercicio1;

import java.util.ArrayList;

public class EmpresaAlg {
    private String nome;
    private int codigoPostal;
    private String email;
    private ArrayList <Veiculo> veiculos;

    public EmpresaAlg(String nome, int codigoPostal, String email){
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.veiculos = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public String toString(){
        return "Empresa: " + this.nome + ", " + "Código Postal: " + this.codigoPostal + ", " + "Email: " + this.email + ", " + "Veiculos: " + this.veiculos;
    }
}
