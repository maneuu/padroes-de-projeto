public abstract class CasaTemplate {
    // Template Method: define a ordem fixa das etapas de construcao.
    public final void construirCasa() {
        prepararFundacao();
        construirEstrutura();
        instalarTelhado();
        instalarPortasEJanelas();
        decorar();
    }

    // Etapa comum para qualquer tipo de casa.
    private void prepararFundacao() {
        System.out.println("Preparando a fundacao");
    }

    // A estrutura varia conforme o material escolhido.
    protected abstract void construirEstrutura();

    // Cada tipo de casa possui uma forma diferente de instalar o telhado.
    protected abstract void instalarTelhado();

    // Esta etapa tambem pode ser adaptada pelas subclasses.
    protected abstract void instalarPortasEJanelas();

    // Hook: a decoracao e opcional e pode ser ignorada.
    protected void decorar() {}
}
