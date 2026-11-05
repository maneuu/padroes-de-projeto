public class RelatorioHTML extends Relatorio {
    @Override
    protected void coletarDados() {
        System.out.println("Consultando dados de vendas");
    }

    @Override
    protected void formatarDados() {
        System.out.println("Formatando dados com tags HTML");
    }

    @Override
    protected void adicionarCabecalho() {
        System.out.println("Adicionando cabecalho HTML");
    }

    @Override
    protected void adicionarCorpo() {
        System.out.println("Adicionando tabela de vendas");
    }

    @Override
    protected void adicionarRodape() {
        System.out.println("Adicionando rodape HTML");
    }
}
