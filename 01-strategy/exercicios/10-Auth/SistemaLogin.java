public class SistemaLogin {
    private AutenticacaoStrategy estrategia;

    public SistemaLogin(AutenticacaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void definirEstrategia(AutenticacaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void login(String usuario) {
        estrategia.autenticar(usuario);
    }
}
