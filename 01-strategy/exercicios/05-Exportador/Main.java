public class Main {
    public static void main(String[] args) {
        String[] dados = {
            "Vendas: R$ 1200",
            "Despesas: R$ 400",
            "Lucro: R$ 800",
            "Clientes ativos: 42"
        };

        Relatorio relatorio = new Relatorio("Dashboard Mensal", dados, new ExportacaoPDF());
        relatorio.exportar();

        relatorio.definirExportacao(new ExportacaoCSV());
        relatorio.exportar();

        relatorio.definirExportacao(new ExportacaoExcel());
        relatorio.exportar();
    }
}
