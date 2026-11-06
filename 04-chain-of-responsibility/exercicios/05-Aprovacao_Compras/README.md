# Exercicio 05 - Chain of Responsibility: aprovacao de compras

Este exemplo usa o padrao **Chain of Responsibility** para encaminhar uma
compra ao responsavel adequado conforme o seu valor. O cliente envia a compra
apenas para o primeiro aprovador, e cada participante decide se pode aprovar
ou se deve encaminhar a solicitacao.

## Regras

- `AnalistaCompras`: aprova compras de ate R$ 1.000,00.
- `GerenteCompras`: aprova compras acima de R$ 1.000,00 e de ate R$ 5.000,00.
- `DiretorFinanceiro`: aprova compras acima de R$ 5.000,00.

## Estrutura

- `Compra`: representa a compra que sera aprovada.
- `AprovadorCompra`: handler abstrato que guarda o proximo aprovador e
  encaminha a compra.
- `AnalistaCompras`, `GerenteCompras` e `DiretorFinanceiro`: handlers
  concretos com limites de aprovacao diferentes.
- `Main`: monta a cadeia e envia as compras.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Analista de compras aprovou: Material de escritorio (R$ 750.00)
Gerente de compras aprovou: Computadores novos (R$ 3500.00)
Diretor financeiro aprovou: Maquinas para a fabrica (R$ 15000.00)
```
