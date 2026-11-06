public class Amarelo implements EstadoSemaforo {
    @Override
    public void avancar(Semaforo semaforo) {
        // O contexto recebido e o semaforo que deve voltar para Vermelho.
        semaforo.definirEstado(new Vermelho());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Sinal: Amarelo");
    }
}
