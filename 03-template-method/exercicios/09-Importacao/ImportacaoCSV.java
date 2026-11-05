public class ImportacaoCSV extends ImportacaoArquivo {
    @Override
    protected void lerConteudo() {
        System.out.println("Lendo linhas separadas por virgula");
    }

    @Override
    protected void interpretarDados() {
        System.out.println("Separando colunas do arquivo CSV");
    }

    @Override
    protected void validarDados() {
        System.out.println("Validando cabecalho e quantidade de colunas");
    }

    @Override
    protected void salvarDados() {
        System.out.println("Salvando registros importados do CSV");
    }

    @Override
    protected void finalizarImportacao() {
        System.out.println("Gerando resumo da importacao CSV");
    }
}
