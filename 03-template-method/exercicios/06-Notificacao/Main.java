public class Main {
    public static void main(String[] args) {
        Notificacao notificacaoEmail = new NotificacaoEmail();
        Notificacao notificacaoSMS = new NotificacaoSMS();

        System.out.println("Enviando notificacao por e-mail:");
        notificacaoEmail.enviarNotificacao();

        System.out.println();

        System.out.println("Enviando notificacao por SMS:");
        notificacaoSMS.enviarNotificacao();
    }
}
