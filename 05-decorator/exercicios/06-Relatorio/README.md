# Exercicio 07 - Decorator: relatorio formatado

Este exemplo usa o padrao **Decorator** para adicionar elementos de formatacao
a um relatorio sem alterar sua classe original.

## Estrutura

- `Relatorio`: componente comum com a operacao de geracao.
- `RelatorioBase`: componente concreto com titulo e conteudo.
- `RelatorioDecorator`: decorator abstrato que mantem um relatorio.
- `CabecalhoDecorator`: adiciona um cabecalho ao relatorio.
- `RodapeDecorator`: adiciona um rodape ao relatorio.
- `Main`: combina os elementos de formatacao em tempo de execucao.
- `diagrama.md`: diagrama UML da estrutura do padrao.

Os elementos podem ser combinados em qualquer ordem.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
=== RELATORIO DA EMPRESA ===
Vendas do mes
Total vendido: R$ 12.500,00
--- Fim do relatorio ---
```
