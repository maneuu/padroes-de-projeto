# Exercicio 07 - Chain of Responsibility: solicitacao de reembolso

Este exemplo usa o padrao **Chain of Responsibility** para encaminhar uma
solicitacao de reembolso ao responsavel adequado conforme o seu valor. O
cliente envia a solicitacao apenas para o primeiro aprovador, e cada
participante decide se pode aprovar ou se deve encaminhar a solicitacao.

## Regras

- `Coordenador`: aprova reembolsos de ate R$ 500,00.
- `Gerente`: aprova reembolsos acima de R$ 500,00 e de ate R$ 3.000,00.
- `Diretor`: aprova reembolsos acima de R$ 3.000,00.

## Estrutura

- `Reembolso`: representa o solicitante, a descricao e o valor da solicitacao.
- `AprovadorReembolso`: handler abstrato que guarda o proximo aprovador e
  encaminha o reembolso.
- `Coordenador`, `Gerente` e `Diretor`: handlers concretos com limites de
  aprovacao diferentes.
- `Main`: monta a cadeia e envia as solicitacoes.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Coordenador aprovou o reembolso de Ana: Alimentacao em viagem (R$ 180.00)
Gerente aprovou o reembolso de Bruno: Hospedagem em evento (R$ 1500.00)
Diretor aprovou o reembolso de Carla: Despesas de representacao (R$ 7500.00)
```
