public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new NotificacaoSite();
        notificacao = new NotificacaoEmail(notificacao, "cliente@exemplo.com");
        notificacao = new NotificacaoSMS(notificacao, "(11) 99999-9999");
        notificacao = new NotificacaoWhatsApp(notificacao, "(11) 98888-8888");

        notificacao.enviar("Seu pedido foi enviado.");
    }
}
