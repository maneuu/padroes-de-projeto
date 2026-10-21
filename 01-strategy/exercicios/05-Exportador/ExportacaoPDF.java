public class ExportacaoPDF implements ExportacaoStrategy {
    @Override
    public void exportar(String titulo, String[] dados) {
        System.out.println("Exportando PDF: " + titulo);
        System.out.println("[PDF] Cabeçalho: Relatório gerado");
        for (String dado : dados) {
            System.out.println("[PDF] " + dado);
        }
        System.out.println("[PDF] Arquivo salvo em: relatorio.pdf");
    }
}
