public abstract class EnvioStrategy {
    protected final String tipo;

    public EnvioStrategy(String tipo) {
        this.tipo = tipo;
    }

    public final void enviar(String mensagem) {
        System.out.println("[Comum] Tipo: " + tipo);
        processarMensagem(mensagem);
    }

    protected abstract void processarMensagem(String mensagem);
}
