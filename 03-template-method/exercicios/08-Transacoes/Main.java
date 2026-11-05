public class Main {
    public static void main(String[] args) {
        TransacaoCripto transacaoBitcoin = new TransacaoBitcoin();
        TransacaoCripto transacaoEthereum = new TransacaoEthereum();

        System.out.println("Processando transacao Bitcoin:");
        transacaoBitcoin.processarTransacao();

        System.out.println();

        System.out.println("Processando transacao Ethereum:");
        transacaoEthereum.processarTransacao();
    }
}
