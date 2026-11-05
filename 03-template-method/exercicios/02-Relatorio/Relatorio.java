public abstract class Relatorio {
    // Template Method: define a ordem fixa para gerar qualquer relatorio.
    // As subclasses implementam apenas os passos que realmente variam.
    public final void gerarRelatorio() {
        abrirRelatorio();
        coletarDados();
        formatarDados();
        adicionarCabecalho();
        adicionarCorpo();
        adicionarRodape();
        fecharRelatorio();
    }

    // Etapa comum: toda geracao comeca abrindo o relatorio.
    private void abrirRelatorio() {
        System.out.println("Abrindo o relatorio");
    }

    // Cada formato pode buscar ou montar seus dados de uma maneira diferente.
    protected abstract void coletarDados();

    // Cada formato organiza os dados conforme sua propria sintaxe.
    protected abstract void formatarDados();

    // Hook: o cabecalho e opcional, pois alguns formatos podem dispensa-lo.
    protected void adicionarCabecalho() {}

    // O corpo e uma etapa obrigatoria para todos os relatorios.
    protected abstract void adicionarCorpo();

    // Hook: o rodape tambem pode ser customizado ou simplesmente ignorado.
    protected void adicionarRodape() {}

    // Etapa comum: toda geracao termina fechando o relatorio.
    private void fecharRelatorio() {
        System.out.println("Fechando o relatorio");
    }
}
