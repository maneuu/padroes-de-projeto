public abstract class Suporte {
    protected Suporte proximo;

    public void setProximo(Suporte proximo) {
        this.proximo = proximo;
    }

    protected void encaminhar(int nivel) {
        if (proximo != null) {
            proximo.atender(nivel);
        } else {
            System.out.println("Nenhum suporte disponivel para este nivel");
        }
    }

    public abstract void atender(int nivel);
}
