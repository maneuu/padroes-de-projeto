public class AutenticacaoGoogle implements AutenticacaoStrategy {
    private final String clientId;
    private final String clientSecret;

    public AutenticacaoGoogle(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    public void autenticar(String usuario) {
        System.out.println("[Google] Usuário: " + usuario);
        System.out.println("[Google] Client ID: " + clientId);
        System.out.println("[Google] Verificando client secret...");
        System.out.println("[Google] Login com Google aprovado.");
    }
}
