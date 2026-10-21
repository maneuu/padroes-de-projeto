public class NotificacaoSMS implements NotificacaoStrategy {
    private final String numero;
    private final String operadora;

    public NotificacaoSMS(String numero, String operadora) {
        this.numero = numero;
        this.operadora = operadora;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Para: " + numero);
        System.out.println("[SMS] Operadora: " + operadora);
        System.out.println("[SMS] Mensagem: " + mensagem);
    }
}
