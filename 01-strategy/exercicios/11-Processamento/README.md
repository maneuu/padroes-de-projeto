# Exercicio 11 - Strategy: processamento com atributo comum e atributos próprios

Este exemplo mostra uma variação do padrão **Strategy** em que a interface tem
um atributo comum e cada estratégia concreta também possui atributos próprios.

## Participantes

- `Processador`: **Context**. Mantém a estratégia atual e delega o processamento.
- `ProcessamentoStrategy`: **Strategy**. Possui o atributo comum `TIPO_PADRAO` e
  define o método `processar`.
- `ProcessamentoCSV`: **Concrete Strategy**. Além do atributo comum, possui
  `separador` e `charset`.
- `ProcessamentoJSON`: **Concrete Strategy**. Possui `formatado` e `indentacao`.
- `ProcessamentoXML`: **Concrete Strategy**. Possui `versao` e `comCabecalho`.
- `Main`: troca a estratégia para demonstrar o comportamento.

## Atributo comum e atributos específicos

A interface define um atributo compartilhado por todas as estratégias:

```java
String TIPO_PADRAO = "PROCESSAMENTO";
```

Cada classe concreta também implementa esse contrato e possui seus próprios
campos específicos:

- CSV: separador e charset
- JSON: formatado e indentacao
- XML: versao e comCabecalho

Isso mostra que o padrão Strategy pode misturar:

- um comportamento comum obrigatório;
- dados específicos de cada estratégia.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
