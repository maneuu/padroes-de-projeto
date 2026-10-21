public class Main {
    public static void main(String[] args) {
        SistemaLogin sistema = new SistemaLogin(
                new AutenticacaoEmailSenha("joao@email.com", "123456"));

        sistema.login("joao");

        sistema.definirEstrategia(
                new AutenticacaoGoogle("google-client-123", "secret-abc"));
        sistema.login("joao");

        sistema.definirEstrategia(
                new AutenticacaoGitHub("ghp_abc123", "joao-github"));
        sistema.login("joao");
    }
}
