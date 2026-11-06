public class Autenticacao {
    private final String usuario;
    private final String senha;
    private final String permissao;

    public Autenticacao(String usuario, String senha, String permissao) {
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = permissao;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getPermissao() {
        return permissao;
    }
}
