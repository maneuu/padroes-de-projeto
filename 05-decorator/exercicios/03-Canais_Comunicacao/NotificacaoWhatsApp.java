public class NotificacaoWhatsApp extends NotificacaoDecorator {
    private final String telefone;

    public NotificacaoWhatsApp(Notificacao notificacao, String telefone) {
        super(notificacao);
        this.telefone = telefone;
    }

    @Override
    public void enviar(String mensagem) {
        notificacao.enviar(mensagem);
        System.out.println("[WhatsApp] Para: " + telefone);
        System.out.println("[WhatsApp] Mensagem enviada: " + mensagem);
    }
}
