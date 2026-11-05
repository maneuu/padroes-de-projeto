public class ImportacaoJSON extends ImportacaoArquivo {
    @Override
    protected void lerConteudo() {
        System.out.println("Lendo estrutura de objetos JSON");
    }

    @Override
    protected void interpretarDados() {
        System.out.println("Convertendo objetos JSON em registros");
    }

    @Override
    protected void validarDados() {
        System.out.println("Validando campos obrigatorios do JSON");
    }

    @Override
    protected void salvarDados() {
        System.out.println("Salvando registros importados do JSON");
    }

    // O JSON nao precisa de uma etapa adicional ao finalizar a importacao.
}
