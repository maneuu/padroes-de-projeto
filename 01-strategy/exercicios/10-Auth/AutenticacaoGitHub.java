public class AutenticacaoGitHub implements AutenticacaoStrategy {
    private final String tokenAcesso;
    private final String nomeUsuarioGitHub;

    public AutenticacaoGitHub(String tokenAcesso, String nomeUsuarioGitHub) {
        this.tokenAcesso = tokenAcesso;
        this.nomeUsuarioGitHub = nomeUsuarioGitHub;
    }

    @Override
    public void autenticar(String usuario) {
        System.out.println("[GitHub] Usuário local: " + usuario);
        System.out.println("[GitHub] Usuário GitHub: " + nomeUsuarioGitHub);
        System.out.println("[GitHub] Validando token: " + tokenAcesso);
        System.out.println("[GitHub] Autenticação via GitHub concluída.");
    }
}
