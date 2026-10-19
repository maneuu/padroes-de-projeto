# Exercicio 02 - Strategy: formatacao de texto

Este exemplo mostra o padrao **Strategy** de forma simples. Um
`EditorDeTexto` pode formatar uma mensagem usando diferentes estrategias.

## Participantes

- `EditorDeTexto`: **Context**. Mantem uma estrategia e delega a formatacao
  para ela.
- `EstrategiaDeFormatacao`: **Strategy**. Define a interface comum.
- `FormatacaoMaiuscula`, `FormatacaoMinuscula` e `FormatacaoComPrefixo`:
  **Concrete Strategies**. Cada classe possui uma forma diferente de
  formatar o texto.

O ponto principal e que o `EditorDeTexto` nao conhece os detalhes de cada
formatacao. Para mudar o comportamento, basta trocar a estrategia com
`definirEstrategia`.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```
