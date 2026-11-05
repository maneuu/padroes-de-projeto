public class NotificacaoEmail extends Notificacao {
    @Override
    protected void validarDestinatario() {
        System.out.println("Validando endereco de e-mail");
    }

    @Override
    protected void prepararMensagem() {
        System.out.println("Preparando mensagem em formato HTML");
    }

    @Override
    protected void conectarServico() {
        System.out.println("Conectando ao servidor SMTP");
    }

    @Override
    protected void enviarMensagem() {
        System.out.println("Enviando e-mail");
    }
}
