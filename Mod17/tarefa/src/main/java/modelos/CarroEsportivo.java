package modelos;

import carros.Carro;

/**
 * @author l.bueno
 */

public class CarroEsportivo extends Carro {
    public CarroEsportivo(String nome) {
        super(nome);
    }

    @Override
    public void acelerar() {
        System.out.println(nome + " está acelerando rapidamente!");
    }

    @Override
    public void frear() {
        System.out.println(nome + " está freando com potência!");
    }
}
