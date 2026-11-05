public class Main {
    public static void main(String[] args) {
        Notificacao notificacaoEmail = new NotificacaoEmail(
                "cliente@exemplo.com",
                "Pedido atualizado");
        notificacaoEmail = new NotificacaoComPrioridade(notificacaoEmail, "URGENTE");
        notificacaoEmail = new NotificacaoComLog(notificacaoEmail);

        notificacaoEmail.enviar("Seu pedido foi enviado.");

        System.out.println();

        Notificacao notificacaoSMS = new NotificacaoSMS("(11) 99999-9999");
        notificacaoSMS = new NotificacaoComLog(notificacaoSMS);
        notificacaoSMS.enviar("Seu pedido chegou.");
    }
}
