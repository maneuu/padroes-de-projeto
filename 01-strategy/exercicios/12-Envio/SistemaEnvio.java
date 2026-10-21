public class SistemaEnvio {
    private EnvioStrategy estrategia;

    public SistemaEnvio(EnvioStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void definirEstrategia(EnvioStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void enviarMensagem(String mensagem) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia não definida.");
        }

        estrategia.enviar(mensagem);
    }
}
