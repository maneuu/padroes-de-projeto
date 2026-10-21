public class EnvioWhatsApp extends EnvioStrategy {
    private final String numero;
    private final boolean comImagem;

    public EnvioWhatsApp(String numero, boolean comImagem) {
        super("WHATSAPP");
        this.numero = numero;
        this.comImagem = comImagem;
    }

    @Override
    protected void processarMensagem(String mensagem) {
        System.out.println("[WhatsApp] Para: " + numero);
        System.out.println("[WhatsApp] Com imagem: " + comImagem);
        System.out.println("[WhatsApp] Mensagem: " + mensagem);
    }
}
