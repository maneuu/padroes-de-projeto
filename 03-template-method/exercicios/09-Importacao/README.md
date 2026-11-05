# Exercicio 09 - Template Method: importacao de arquivos

Este exemplo aplica o padrao **Template Method** a importacao de arquivos CSV
e JSON. O fluxo geral permanece igual, enquanto cada formato implementa suas
proprias etapas de leitura, interpretacao, validacao e persistencia.

## Estrutura

- `ImportacaoArquivo`: classe abstrata que define o algoritmo fixo.
- `ImportacaoCSV` e `ImportacaoJSON`: implementacoes concretas.
- `Main`: executa as duas importacoes.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `importarArquivo` e o **template method**. Ele e `final` para impedir
que as subclasses alterem a ordem das etapas. `finalizarImportacao` e um
**hook** opcional: o CSV o sobrescreve para gerar um resumo, enquanto o JSON
mantem o comportamento vazio.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Importando arquivo CSV:
Abrindo arquivo para importacao
Lendo linhas separadas por virgula
Separando colunas do arquivo CSV
Validando cabecalho e quantidade de colunas
Salvando registros importados do CSV
Gerando resumo da importacao CSV

Importando arquivo JSON:
Abrindo arquivo para importacao
Lendo estrutura de objetos JSON
Convertendo objetos JSON em registros
Validando campos obrigatorios do JSON
Salvando registros importados do JSON
```
