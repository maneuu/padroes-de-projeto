public class EnvioSMS extends EnvioStrategy {
    private final String numero;
    private final String operadora;

    public EnvioSMS(String numero, String operadora) {
        super("SMS");
        this.numero = numero;
        this.operadora = operadora;
    }

    @Override
    protected void processarMensagem(String mensagem) {
        System.out.println("[SMS] Para: " + numero);
        System.out.println("[SMS] Operadora: " + operadora);
        System.out.println("[SMS] Mensagem: " + mensagem);
    }
}
