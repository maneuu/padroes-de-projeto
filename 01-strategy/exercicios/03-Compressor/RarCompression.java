/**
 * Concrete Strategy: comprime o arquivo no formato RAR.
 */
public class RarCompression implements CompressionStrategy {
    @Override
    public String compress(String fileName) {
        return "Arquivo " + fileName + " comprimido no formato RAR.";
    }
}
