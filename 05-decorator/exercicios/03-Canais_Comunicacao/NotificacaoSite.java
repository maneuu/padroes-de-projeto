public class NotificacaoSite implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[Site] Notificacao exibida no site");
        System.out.println("[Site] Mensagem: " + mensagem);
    }
}
