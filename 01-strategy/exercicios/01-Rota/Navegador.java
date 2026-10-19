public class Navegador {
    private EstrategiaDeRota estrategiaDeRota;

    public Navegador(EstrategiaDeRota estrategiaDeRota) {
        this.estrategiaDeRota = estrategiaDeRota;
    }

    public void definirEstrategia(EstrategiaDeRota estrategiaDeRota) {
        this.estrategiaDeRota = estrategiaDeRota;
    }

    public String calcularRota(String origem, String destino) {
        return estrategiaDeRota.calcularRota(origem, destino);
    }
}
