# Exercicio 02 - Chain of Responsibility: suporte tecnico

Este exemplo mostra uma cadeia de atendimento. Cada suporte verifica se pode
resolver o nivel recebido. Caso contrario, encaminha a solicitacao para o
proximo suporte.

## Estrutura

- `Suporte`: Handler abstrato com a referencia para o proximo suporte.
- `SuporteNivel1`: resolve solicitacoes de nivel 1.
- `SuporteNivel2`: resolve solicitacoes de nivel 2.
- `Gerente`: resolve solicitacoes de nivel 3.
- `Main`: monta a cadeia e inicia o atendimento.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Resolvido pelo gerente
Resolvido pelo suporte nivel 1
Resolvido pelo suporte nivel 2
Nenhum suporte disponivel para este nivel
```
