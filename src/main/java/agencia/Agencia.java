package agencia;

public class Agencia {
    private int numero;
    private String nome;
    
    public Agencia(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String toString() {
        return "Agência " + numero + " - " + nome;
    }
}
