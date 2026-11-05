public class NotificacaoSMS extends Notificacao {
    @Override
    protected void validarDestinatario() {
        System.out.println("Validando numero de telefone");
    }

    @Override
    protected void prepararMensagem() {
        System.out.println("Preparando mensagem com limite de caracteres");
    }

    @Override
    protected void conectarServico() {
        System.out.println("Conectando a operadora de telefonia");
    }

    @Override
    protected void enviarMensagem() {
        System.out.println("Enviando SMS");
    }
}
