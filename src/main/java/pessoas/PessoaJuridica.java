package pessoas;

public class PessoaJuridica extends Pessoa {
    public PessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
    }
    
    @Override
    public String getTipoPessoa() {
        return "Pessoa Jurídica";
    }
}
