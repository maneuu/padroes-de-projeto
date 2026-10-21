public class AutenticacaoEmailSenha implements AutenticacaoStrategy {
    private final String email;
    private final String senha;

    public AutenticacaoEmailSenha(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void autenticar(String usuario) {
        System.out.println("[Email/Senha] Usuário: " + usuario);
        System.out.println("[Email/Senha] Email: " + email);
        System.out.println("[Email/Senha] Validando senha...");
        System.out.println("[Email/Senha] Login realizado com sucesso.");
    }
}
