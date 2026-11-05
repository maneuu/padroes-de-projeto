public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoPix = new PagamentoPix();

        System.out.println("Processando pagamento com cartao:");
        pagamentoCartao.processarPagamento();

        System.out.println();

        System.out.println("Processando pagamento com Pix:");
        pagamentoPix.processarPagamento();
    }
}
