public class EnvioEmail extends EnvioStrategy {
    private final String destinatario;
    private final String assunto;

    public EnvioEmail(String destinatario, String assunto) {
        super("EMAIL");
        this.destinatario = destinatario;
        this.assunto = assunto;
    }

    @Override
    protected void processarMensagem(String mensagem) {
        System.out.println("[Email] Para: " + destinatario);
        System.out.println("[Email] Assunto: " + assunto);
        System.out.println("[Email] Mensagem: " + mensagem);
    }
}
