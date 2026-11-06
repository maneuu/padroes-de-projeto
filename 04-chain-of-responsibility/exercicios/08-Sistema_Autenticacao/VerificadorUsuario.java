public class VerificadorUsuario extends Verificador {
    @Override
    public void verificar(Autenticacao autenticacao) {
        if (autenticacao.getUsuario().equals("ana")
                || autenticacao.getUsuario().equals("bruno")) {
            encaminhar(autenticacao);
            return;
        }

        negar("usuario nao encontrado");
    }
}
