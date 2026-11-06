# Exercicio 01 - Chain of Responsibility: aprovacao de despesas

Este exemplo usa o padrao **Chain of Responsibility** para encaminhar uma
despesa ao responsavel adequado conforme o seu valor.

## Estrutura

- `Despesa`: representa a solicitacao de despesa.
- `Aprovador`: define a referencia para o proximo aprovador.
- `Funcionario`: aprova despesas de ate R$ 1.000,00.
- `Gerente`: aprova despesas de ate R$ 5.000,00.
- `Diretor`: aprova despesas acima de R$ 5.000,00.
- `Main`: monta a cadeia e envia as despesas.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O cliente envia a despesa apenas para o primeiro aprovador. Cada participante
decide se pode aprovar ou encaminha a solicitacao para o proximo da cadeia.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Funcionario aprovou: Material de escritorio (R$ 500,00)
Gerente aprovou: Equipamento novo (R$ 2500,00)
Diretor aprovou: Reforma da filial (R$ 12000,00)
```
