package carros;

/**
 * @author l.bueno
 */
public abstract class Carro {
    protected String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    public abstract void acelerar();
    public abstract void frear();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

