/**
 * Context: utiliza a estrategia escolhida para comprimir arquivos.
 */
public class FileCompressionTools {
    private CompressionStrategy strategy;

    public FileCompressionTools(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public String compress(String fileName) {
        return strategy.compress(fileName);
    }
}
