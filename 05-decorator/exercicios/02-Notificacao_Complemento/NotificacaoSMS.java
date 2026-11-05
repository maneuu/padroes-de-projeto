public class NotificacaoSMS implements Notificacao {
    private final String telefone;

    public NotificacaoSMS(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Para: " + telefone);
        System.out.println("[SMS] Mensagem: " + mensagem);
    }
}
