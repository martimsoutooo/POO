package aula06.exercicio2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Integer;
import java.util.ArrayList;

public class Contacto extends Pessoa {
    private String pessoa;
    static int nextId = 1;
    private int numTel;
    private String email;
    private int id;
    static ArrayList<Contacto> contactList = new ArrayList<Contacto>();

    public Contacto(String nome, int cc, DateYMD dataNasc, int numTel, String email) {
        super(nome, cc, dataNasc);
        setEmail(email);
        setNumTel(numTel);
        nextId++;
    }
    public String getPessoa() {
        return this.pessoa;
    }
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
    public Contacto(String nome, int cc, DateYMD dataNasc, int numTel) {
        super(nome, cc, dataNasc);
        setNumTel(numTel);
        nextId++;
    }

    public Contacto(String nome, int cc, DateYMD dataNasc,String email) {
        super(nome, cc, dataNasc);
        setEmail(email);
        nextId++;
    }

    public static boolean validNumTel(int numTel) {
        String padraoRegex = "^9[0-9]{8}$";
        
        Pattern padrao = Pattern.compile(padraoRegex);
        Matcher matcher = padrao.matcher(Integer.toString(numTel));
    
        return matcher.matches();
    
    }

    public static boolean validEmail(String email){
        String padraoRegex = "^([a-z]|[0-9_.%-])+@([a-z]|[0-9])+.([a-z])+";

        Pattern padrao = Pattern.compile(padraoRegex);
        Matcher matcher = padrao.matcher(email);

        return matcher.matches();
    }
    public int getId() {
        return id;
    }
    public int getNumTel() {
        return numTel;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        validEmail(email);
        this.email = email;
    }

    public void setNumTel(int numTel) {
        validNumTel(numTel); 
        this.numTel = numTel;
    }
    
}
