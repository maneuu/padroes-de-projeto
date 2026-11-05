public class RelatorioPDF extends Relatorio {
    @Override
    protected void coletarDados() {
        System.out.println("Lendo dados do banco de dados");
    }

    @Override
    protected void formatarDados() {
        System.out.println("Formatando dados para PDF");
    }

    @Override
    protected void adicionarCabecalho() {
        System.out.println("Adicionando titulo e logotipo");
    }

    @Override
    protected void adicionarCorpo() {
        System.out.println("Desenhando o conteudo do relatorio");
    }

    @Override
    protected void adicionarRodape() {
        System.out.println("Adicionando numero da pagina");
    }
}
