public class Main {
    public static void main(String[] args) {
        FabricaCarros fabricaEsportivos = new FabricaCarrosEsportivos();
        Carro carroEsportivo = fabricaEsportivos.criarCarro();
        carroEsportivo.acelerar();
        carroEsportivo.frear();

        FabricaCarros fabricaSedan = new FabricaCarrosSedan();
        Carro carroSedan = fabricaSedan.criarCarro();
        carroSedan.acelerar();
        carroSedan.frear();
    }
}