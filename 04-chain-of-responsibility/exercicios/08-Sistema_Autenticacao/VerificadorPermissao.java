public class VerificadorPermissao extends Verificador {
    @Override
    public void verificar(Autenticacao autenticacao) {
        boolean permissaoValida = autenticacao.getUsuario().equals("ana")
                || (autenticacao.getUsuario().equals("bruno")
                && autenticacao.getPermissao().equals("relatorios"));

        if (permissaoValida) {
            encaminhar(autenticacao);
            return;
        }

        negar("usuario sem permissao para "
                + autenticacao.getPermissao());
    }
}
