package aula08.exercicio2;

public class Ementa {

    public static final int NR_PRATOS_NA_EMENTA = 4;

    private String nome;
    private String local;
    private Prato[] pratos;
    private int nrPratosAdicionados;
    private java.time.LocalDateTime DiaSemana;

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

        builder.append("Ementa [nome=" + nome + ", local=" + local + ", dia " + DiaSemana + "]\n");
        for (Prato prato : pratos) {
            builder.append("\t");
            builder.append(prato.getNome());
            builder.append("\t");
        }
        builder.append("]");
        return builder.toString();

    }
    public void addPrato(Prato prato) {
        pratos[nrPratosAdicionados] = prato;
        nrPratosAdicionados++;
    }

    public Prato listarPrato(int ordem) {
        return pratos[ordem];
    }

    public void addPrato(Prato p, Object o) {
        throw new UnsupportedOperationException();
    }

    public void listarPratos() {
        throw new UnsupportedOperationException();
    }
}
