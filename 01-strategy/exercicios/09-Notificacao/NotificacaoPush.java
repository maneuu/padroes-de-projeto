public class NotificacaoPush implements NotificacaoStrategy {
    private final String tokenDispositivo;
    private final String canal;

    public NotificacaoPush(String tokenDispositivo, String canal) {
        this.tokenDispositivo = tokenDispositivo;
        this.canal = canal;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[Push] Token: " + tokenDispositivo);
        System.out.println("[Push] Canal: " + canal);
        System.out.println("[Push] Mensagem: " + mensagem);
    }
}
