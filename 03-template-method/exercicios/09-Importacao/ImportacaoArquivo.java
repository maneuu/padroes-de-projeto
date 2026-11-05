public abstract class ImportacaoArquivo {
    // Template Method: define a ordem fixa da importacao de qualquer arquivo.
    public final void importarArquivo() {
        abrirArquivo();
        lerConteudo();
        interpretarDados();
        validarDados();
        salvarDados();
        finalizarImportacao();
    }

    // Etapa comum: toda importacao comeca abrindo o arquivo.
    private void abrirArquivo() {
        System.out.println("Abrindo arquivo para importacao");
    }

    // Cada formato possui uma forma diferente de leitura.
    protected abstract void lerConteudo();

    // O conteudo e interpretado conforme o formato do arquivo.
    protected abstract void interpretarDados();

    // Cada formato pode possuir regras proprias de validacao.
    protected abstract void validarDados();

    // A persistencia pode variar conforme os dados importados.
    protected abstract void salvarDados();

    // Hook: permite executar uma acao opcional ao final da importacao.
    protected void finalizarImportacao() {}
}
