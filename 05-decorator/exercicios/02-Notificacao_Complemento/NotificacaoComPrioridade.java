public class NotificacaoComPrioridade extends NotificacaoDecorator {
    private final String prioridade;

    public NotificacaoComPrioridade(Notificacao notificacao, String prioridade) {
        super(notificacao);
        this.prioridade = prioridade;
    }

    @Override
    public void enviar(String mensagem) {
        notificacao.enviar("[" + prioridade + "] " + mensagem);
    }
}
