public abstract class ProcessoTemplate {
    // Template Method: define a ordem fixa das etapas do processo.
    public final void executar() {
        preparar();
        realizarEtapaPrincipal();
        finalizar();
        opcional();
    }

    // Etapa comum para todas as implementacoes.
    private void preparar() {
        System.out.println("Preparando o processo");
    }

    // Etapa que varia conforme a classe concreta.
    protected abstract void realizarEtapaPrincipal();

    // Outra etapa comum para todas as implementacoes.
    private void finalizar() {
        System.out.println("Finalizando o processo");
    }

    // Hook opcional: a subclasse pode sobrescrever esta etapa.
    protected void opcional() {}
}
