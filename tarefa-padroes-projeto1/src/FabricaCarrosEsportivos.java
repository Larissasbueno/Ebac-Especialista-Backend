/**
 * @author l.bueno
 */

public class FabricaCarrosEsportivos extends FabricaCarros {
    @Override
    public Carro criarCarro() {
        return new CarroEsportivo();
    }
}
