public class NotificacaoSMS extends NotificacaoDecorator {
    private final String telefone;

    public NotificacaoSMS(Notificacao notificacao, String telefone) {
        super(notificacao);
        this.telefone = telefone;
    }

    @Override
    public void enviar(String mensagem) {
        notificacao.enviar(mensagem);
        System.out.println("[SMS] Para: " + telefone);
        System.out.println("[SMS] Mensagem enviada: " + mensagem);
    }
}
