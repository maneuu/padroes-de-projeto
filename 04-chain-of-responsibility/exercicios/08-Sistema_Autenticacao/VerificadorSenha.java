public class VerificadorSenha extends Verificador {
    @Override
    public void verificar(Autenticacao autenticacao) {
        boolean senhaValida = (autenticacao.getUsuario().equals("ana")
                && autenticacao.getSenha().equals("senha123"))
                || (autenticacao.getUsuario().equals("bruno")
                && autenticacao.getSenha().equals("senha456"));

        if (senhaValida) {
            encaminhar(autenticacao);
            return;
        }

        negar("senha invalida");
    }
}
