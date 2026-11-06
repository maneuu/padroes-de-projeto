public abstract class Aprovador {
    private Aprovador proximo;

    public Aprovador definirProximo(Aprovador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void aprovar(Despesa despesa);

    protected void encaminhar(Despesa despesa) {
        if (proximo == null) {
            System.out.println("Despesa sem aprovador disponivel: "
                    + despesa.getDescricao());
            return;
        }

        proximo.aprovar(despesa);
    }
}
