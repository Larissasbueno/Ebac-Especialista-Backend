package modelos;

import carros.Carro;

/**
 * @author l.bueno
 */

public class CarroSedan extends Carro {
    public CarroSedan(String nome) {
        super(nome);
    }

    @Override
    public void acelerar() {
        System.out.println(nome + " está acelerando suavemente!");
    }

    @Override
    public void frear() {
        System.out.println(nome + " está freando normalmente.");
    }
}
