# Diagrama UML - Strategy

```mermaid
classDiagram
    class FileCompressionTools {
        -CompressionStrategy strategy
        +FileCompressionTools(CompressionStrategy strategy)
        +setStrategy(CompressionStrategy strategy) void
        +compress(String fileName) String
    }

    class CompressionStrategy {
        <<interface>>
        +compress(String fileName) String
    }

    class ZipCompression {
        +compress(String fileName) String
    }

    class RarCompression {
        +compress(String fileName) String
    }

    class SevenZipCompression {
        +compress(String fileName) String
    }

    FileCompressionTools o--> CompressionStrategy : utiliza
    CompressionStrategy <|.. ZipCompression
    CompressionStrategy <|.. RarCompression
    CompressionStrategy <|.. SevenZipCompression
```

## Participantes do padrão

- **FileCompressionTools**: contexto que delega a compressao para a estrategia
  selecionada.
- **CompressionStrategy**: interface comum dos algoritmos.
- **ZipCompression**, **RarCompression** e **SevenZipCompression**:
  estrategias concretas.
