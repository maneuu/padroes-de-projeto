public abstract class Notificacao {
    // Template Method: define a ordem fixa do envio de qualquer notificacao.
    public final void enviarNotificacao() {
        validarDestinatario();
        prepararMensagem();
        conectarServico();
        enviarMensagem();
        registrarEnvio();
    }

    // Cada canal possui regras proprias para validar o destinatario.
    protected abstract void validarDestinatario();

    // O formato da mensagem depende do canal de notificacao.
    protected abstract void prepararMensagem();

    // A conexao varia conforme o servico utilizado.
    protected abstract void conectarServico();

    // Cada canal envia a mensagem usando sua propria operacao.
    protected abstract void enviarMensagem();

    // Etapa comum para todos os canais.
    private void registrarEnvio() {
        System.out.println("Registrando envio da notificacao");
    }
}
