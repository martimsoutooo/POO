package aula08.exercicio1;

public abstract class Veiculo implements KmPercorridosInterface{

    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int potencia;
    protected int numQuadro;
    protected int distanciaTotalPercorrida;
    protected int ultimoTrajetoPercorrido;

    public void trajeto(int quilometros) {
        this.distanciaTotalPercorrida += quilometros;
        this.ultimoTrajetoPercorrido = quilometros;

        aftertrajeto(quilometros);
    }

    public void aftertrajeto(int quilometros){}
    

    public int ultimoTrajeto() {
        return this.ultimoTrajetoPercorrido;
    }

    public int distanciaTotal() {
        return this.distanciaTotalPercorrida;
    }

    public Veiculo(String matricula, String marca, String modelo, int potencia, int numQuadro){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.numQuadro = numQuadro;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public void setNumQuadro(int numQuadro){
        this.numQuadro = numQuadro;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public int getNumQuadro(){
        return this.numQuadro;
    }
}
