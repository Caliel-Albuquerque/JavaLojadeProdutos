package Entidades;

public class Fornecedor{
    private String Cnpj;
    private String Telefone;
    private String Nome;
    
    public Fornecedor() {
    }


    
    public Fornecedor(String cnpj, String telefone, String nome) {
        Cnpj = cnpj;
        Telefone = telefone;
        Nome = nome;
    }



    public String getCnpj() {
        return Cnpj;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }



    @Override
    public String toString() {
        return Nome ;
    }

    
    


}