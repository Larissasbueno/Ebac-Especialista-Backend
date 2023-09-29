/**
 * @author l.bueno
 */

public class FabricaCarrosSedan extends FabricaCarros {
    @Override
    public Carro criarCarro() {
        return new CarroSedan();
    }
}