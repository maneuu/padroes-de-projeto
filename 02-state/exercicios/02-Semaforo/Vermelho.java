public class Vermelho implements EstadoSemaforo {
    @Override
    public void avancar(Semaforo semaforo) {
        // "semaforo" e o mesmo objeto enviado por Semaforo.avancar() com "this".
        // O estado Vermelho usa esse objeto para mudar o contexto para Verde.
        semaforo.definirEstado(new Verde());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Sinal: Vermelho");
    }
}
