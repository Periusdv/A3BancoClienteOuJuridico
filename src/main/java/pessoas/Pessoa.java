package pessoas;

//Classe abstrata que representa uma pessoa física ou juridica
public abstract class Pessoa {
    //Atribuito protegido, guarda nome de pessoa
    protected String nome;
    //Atribuito protegido, guarda CPF ou CNPJ
    protected String numDocumento;
    
    //Construtor da classe pessoa(física ou juridica) e documento(CPF ou CNPJ)
    public Pessoa(String nome, String numDocumento) {
        this.nome = nome;
        this.numDocumento = numDocumento;
    }
    
    //Retorno do nome da pessoa
    public String getNome() {
        return nome;
    }
    
    //Retorna número do documento
    public String getNumDocumento() {
        return numDocumento;
    }
    
    //Método abstrato para indicar se é uma pessoa física ou jurídica
    public abstract String getTipoPessoa();
}
