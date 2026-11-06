public class Verde implements EstadoSemaforo {
    @Override
    public void avancar(Semaforo semaforo) {
        // O contexto recebido e o semaforo que deve seguir para Amarelo.
        semaforo.definirEstado(new Amarelo());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Sinal: Verde");
    }
}
