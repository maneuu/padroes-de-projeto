public class NotificacaoEmail implements NotificacaoStrategy {
    private final String destinatario;
    private final String assunto;

    public NotificacaoEmail(String destinatario, String assunto) {
        this.destinatario = destinatario;
        this.assunto = assunto;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[Email] Para: " + destinatario);
        System.out.println("[Email] Assunto: " + assunto);
        System.out.println("[Email] Mensagem: " + mensagem);
    }
}
