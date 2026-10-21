public class Main {
    public static void main(String[] args) {
        SistemaEnvio sistema = new SistemaEnvio(
                new EnvioEmail("cliente@email.com", "Pedido confirmado"));

        sistema.enviarMensagem("Seu pedido foi recebido com sucesso.");

        sistema.definirEstrategia(new EnvioSMS("(11) 99999-1234", "Claro"));
        sistema.enviarMensagem("Seu pedido está em processamento.");

        sistema.definirEstrategia(new EnvioWhatsApp("(11) 98888-7766", true));
        sistema.enviarMensagem("Seu pedido saiu para entrega.");
    }
}
