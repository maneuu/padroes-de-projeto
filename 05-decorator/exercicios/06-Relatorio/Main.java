public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioBase(
                "Vendas do mes",
                "Total vendido: R$ 12.500,00");
        relatorio = new CabecalhoDecorator(relatorio);
        relatorio = new RodapeDecorator(relatorio);

        System.out.println(relatorio.gerar());
    }
}
