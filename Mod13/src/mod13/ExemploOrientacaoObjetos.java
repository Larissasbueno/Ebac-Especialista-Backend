package mod13;

public class ExemploOrientacaoObjetos {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", 30, "123.456.789-00");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", 10, "12.345.678/0001-90");

        pessoaFisica.exibirInformacoes();
        System.out.println();
        pessoaJuridica.exibirInformacoes();
    }
}
abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void exibirInformacoes();
}

class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CNPJ: " + getCnpj());
    }
}

