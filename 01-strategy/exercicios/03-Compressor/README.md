# Exercicio 03 - Strategy: File Compression Tools

Este exemplo mostra como usar o padrao **Strategy** para escolher diferentes
formatos de compressao de arquivos.

## Participantes

- `FileCompressionTools`: **Context**. Mantem a estrategia e delega a
  compressao para ela.
- `CompressionStrategy`: **Strategy**. Define o contrato comum.
- `ZipCompression`, `RarCompression` e `SevenZipCompression`: **Concrete
  Strategies**. Representam algoritmos de compressao diferentes.
- `Main`: cria o contexto e troca a estrategia durante a execucao.

As mensagens de compressao sao simuladas. O objetivo do exemplo e demonstrar
a estrutura do Strategy sem depender de bibliotecas externas ou de ferramentas
instaladas no sistema.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura do exemplo esta representada em [diagrama.md](./diagrama.md).
