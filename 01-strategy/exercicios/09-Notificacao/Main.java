public class Main {
    public static void main(String[] args) {
        SistemaNotificacao sistema = new SistemaNotificacao(
                new NotificacaoEmail("cliente@email.com", "Pedido confirmado"));

        sistema.enviarMensagem("Seu pedido foi recebido com sucesso.");

        sistema.definirEstrategia(new NotificacaoSMS("(11) 99999-1234", "Claro"));
        sistema.enviarMensagem("Seu pedido está em processamento.");

        sistema.definirEstrategia(new NotificacaoPush("abc123token", "Android"));
        sistema.enviarMensagem("Seu pedido saiu para entrega.");
    }
}
