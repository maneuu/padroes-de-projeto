# Exercicio 05 - Strategy: exportação de relatórios

Este exemplo aplica o padrão **Strategy** para representar diferentes formatos
de exportação de um relatório.

## Participantes

- `Relatorio`: **Context**. Mantém o título e os dados do relatório e delega a
  exportação para a estratégia escolhida.
- `ExportacaoStrategy`: **Strategy**. Define o contrato comum das exportações.
- `ExportacaoPDF`: **Concrete Strategy**. Simula a geração de um arquivo PDF.
- `ExportacaoCSV`: **Concrete Strategy**. Simula a geração de um arquivo CSV.
- `ExportacaoExcel`: **Concrete Strategy**. Simula a geração de um arquivo Excel.
- `Main`: cria um relatório e troca a estratégia para demonstrar cada formato.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
