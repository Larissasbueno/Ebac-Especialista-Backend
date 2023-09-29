/**
 * @author l.bueno
 */

public class CarroEsportivo implements Carro {
    @Override
    public void acelerar() {
        System.out.println("Carro esportivo acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro esportivo freando...");
    }
}

