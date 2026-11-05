public class NotificacaoEmail extends NotificacaoDecorator {
    private final String destinatario;

    public NotificacaoEmail(Notificacao notificacao, String destinatario) {
        super(notificacao);
        this.destinatario = destinatario;
    }

    @Override
    public void enviar(String mensagem) {
        notificacao.enviar(mensagem);
        System.out.println("[Email] Para: " + destinatario);
        System.out.println("[Email] Mensagem enviada: " + mensagem);
    }
}
