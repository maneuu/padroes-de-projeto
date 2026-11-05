public class NotificacaoComLog extends NotificacaoDecorator {
    public NotificacaoComLog(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[Log] Iniciando envio da notificacao");
        notificacao.enviar(mensagem);
        System.out.println("[Log] Notificacao enviada com sucesso");
    }
}
