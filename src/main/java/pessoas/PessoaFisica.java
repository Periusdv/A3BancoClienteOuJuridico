package pessoas;

public class PessoaFisica extends Pessoa{
    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
    }
    
    @Override
    public String getTipoPessoa() {
        return "Pessoa Física";
    }
}
