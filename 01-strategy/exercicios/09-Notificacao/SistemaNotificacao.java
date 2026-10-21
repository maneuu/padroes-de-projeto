public class SistemaNotificacao {
    private NotificacaoStrategy estrategia;

    public SistemaNotificacao(NotificacaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void definirEstrategia(NotificacaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void enviarMensagem(String mensagem) {
        estrategia.enviar(mensagem);
    }
}
