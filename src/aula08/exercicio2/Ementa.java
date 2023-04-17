package aula08.exercicio2;

public class Ementa {

    public static final int NR_PRATOS_NA_EMENTA = 15;

    private String nome;
    private String local;
    private Prato[] pratos;
    private int nrPratosAdicionados;

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        pratos = new Prato[NR_PRATOS_NA_EMENTA];
        nrPratosAdicionados = 0;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nrPratosAdicionados; i++) {
            builder.append(pratos[i]).append(", dia ").append(DiaSemana.values()[i]).append("\n");
        }
        return builder.toString();

    }
    public void addPrato(Prato prato, DiaSemana diaSemana) {
        pratos[nrPratosAdicionados] = prato;
        nrPratosAdicionados++;
    }

    public Prato listarPrato(int ordem) {
        return pratos[ordem];
    }


}
