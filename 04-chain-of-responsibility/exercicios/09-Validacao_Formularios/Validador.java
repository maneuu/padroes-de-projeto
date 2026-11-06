public abstract class Validador {
    private Validador proximo;

    public Validador definirProximo(Validador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void validar(Formulario formulario);

    protected void encaminhar(Formulario formulario) {
        if (proximo == null) {
            System.out.println("Formulario valido");
            return;
        }

        proximo.validar(formulario);
    }

    protected void rejeitar(String mensagem) {
        System.out.println("Formulario invalido: " + mensagem);
    }
}
