public abstract class Verificador {
    private Verificador proximo;

    public Verificador definirProximo(Verificador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void verificar(Autenticacao autenticacao);

    protected void encaminhar(Autenticacao autenticacao) {
        if (proximo == null) {
            System.out.println("Autenticacao concluida para o usuario "
                    + autenticacao.getUsuario());
            return;
        }

        proximo.verificar(autenticacao);
    }

    protected void negar(String mensagem) {
        System.out.println("Acesso negado: " + mensagem);
    }
}
