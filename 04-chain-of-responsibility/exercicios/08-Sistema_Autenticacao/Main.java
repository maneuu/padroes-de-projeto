public class Main {
    public static void main(String[] args) {
        Verificador usuario = new VerificadorUsuario();
        Verificador senha = new VerificadorSenha();
        Verificador permissao = new VerificadorPermissao();

        // Fluxo: usuario -> senha -> permissoes de acesso.
        usuario.definirProximo(senha)
                .definirProximo(permissao);

        usuario.verificar(new Autenticacao("ana", "senha123", "admin"));
        usuario.verificar(new Autenticacao("bruno", "senha456", "relatorios"));
        usuario.verificar(new Autenticacao("bruno", "senhaerrada", "relatorios"));
        usuario.verificar(new Autenticacao("carla", "senha789", "relatorios"));
        usuario.verificar(new Autenticacao("bruno", "senha456", "admin"));
    }
}
