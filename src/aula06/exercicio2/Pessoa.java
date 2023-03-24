package aula06.exercicio2;

class Pessoa{
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }
    public String getName(){
        return nome;
    }

    public int getCc(){
        return cc;
    }

    public DateYMD getdataNasc(){
        return dataNasc;
    }

    public void setCc(int cc) {
        this.cc = cc;

    }
    public void setDataNasc(DateYMD dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean validInfo(String nome, int cc, DateYMD dataNasc){
        String regexNome = "^[A-Za-z]+(\\s[A-Za-z]+)+$";
        if (!nome.matches(regexNome)) {
            return false;
        }
    
        String regexCC = "^\\d{9}$";
        if (!String.valueOf(cc).matches(regexCC)) {
            return false;
        }
        
        return true;
    }
    @Override
    public String toString(){
        return getName() + ";" + " CC: " + getCc() + ";" + " Data de Nascimento: " + getdataNasc();
    }
}
    

class Aluno extends Pessoa{
        private int NMec;
        static int nextId = 100;
        private DateYMD dataInsc;

        public Aluno(String nome, int cc, DateYMD dataNasc,DateYMD dataInsc) {
            super(nome, cc, dataNasc);
            this.dataInsc = dataInsc;
            this.NMec = nextId;
            nextId++;
        }
        public Aluno(String nome, int cc, DateYMD dataNasc) {
            super(nome, cc, dataNasc);
            this.NMec = nextId;
            nextId++;
        }

        public int getNMec() {
            return NMec;
        }

        public DateYMD getDataInsc(){
            return dataInsc;
        }

        public void setDataInsc(DateYMD dataInsc) {
            this.dataInsc = dataInsc;
        }

}    

class Professor extends Pessoa{
        private String categoria;
        private String departamento;
        public Professor(String nome, int cc, DateYMD dataNasc, String categoria, String departamento) {
            super(nome, cc, dataNasc);
            this.categoria = categoria;
            this.departamento = departamento;
        }

        public String getCategoria() {
            return categoria;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }   
}

class Bolseiro extends Aluno{
        private Professor orientador;
        private int montante;
        public Bolseiro(String nome, int cc, DateYMD dataNasc,DateYMD dataInsc, Professor orientador, int montante){
            super(nome, cc, dataNasc,dataInsc);
            this.orientador = orientador;
            this.montante = montante;
        }

        public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor orientador, int montante){
            super(nome, cc, dataNasc);
            this.orientador = orientador;
            this.montante = montante;
        }

        public int getBolsa() {
            return montante;
        }

        public Professor getOrientador() {
            return orientador;
        }

        public void setBolsa(int montante) {
            this.montante = montante;
        }

        public void setOrientador(Professor orientador) {
            this.orientador = orientador;
        }

}


