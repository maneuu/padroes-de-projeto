# Exercicio 02 - Template Method: geracao de relatorios

Este exemplo aplica o padrao **Template Method** em um processo muito comum:
gerar relatorios em formatos diferentes. O fluxo geral e sempre o mesmo, mas
cada formato implementa suas etapas especificas.

## Estrutura

- `Relatorio`: classe abstrata que define o algoritmo fixo de geracao.
- `RelatorioHTML`: gera um relatorio com estrutura HTML.
- `RelatorioPDF`: gera um relatorio com estrutura PDF.
- `Main`: executa as duas variacoes.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `gerarRelatorio` e o **template method**. Ele e `final` para impedir
que uma subclasse altere a ordem das etapas. Os metodos abstratos representam
passos obrigatorios, enquanto `adicionarCabecalho` e `adicionarRodape` sao
**hooks**: passos opcionais que possuem um comportamento vazio por padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Gerando relatorio HTML:
Abrindo o relatorio
Consultando dados de vendas
Formatando dados com tags HTML
Adicionando cabecalho HTML
Adicionando tabela de vendas
Adicionando rodape HTML
Fechando o relatorio

Gerando relatorio PDF:
Abrindo o relatorio
Lendo dados do banco de dados
Formatando dados para PDF
Adicionando titulo e logotipo
Desenhando o conteudo do relatorio
Adicionando numero da pagina
Fechando o relatorio
```
