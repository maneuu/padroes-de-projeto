# Exercicio 04 - State: conta bancaria

Este exemplo usa o padrao **State** para representar os estados de uma conta
bancaria. O objeto `ContaBancaria` delega cada operacao ao estado atual, e
cada estado define quais operacoes sao permitidas.

## Estados e transicoes

- `Ativa`: permite depositos e saques e pode ser bloqueada.
- `Bloqueada`: impede depositos e saques e pode ser desbloqueada.

O fluxo principal e:

```text
Ativa -> Bloqueada -> Ativa
```

## Estrutura

- `EstadoConta`: contrato dos estados da conta.
- `ContaBancaria`: contexto que mantem o estado atual e o saldo.
- `Ativa` e `Bloqueada`: estados concretos com comportamentos diferentes.
- `Main`: demonstra operacoes permitidas e recusadas.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Estado atual: Ativa
Deposito realizado: R$ 50,00
Saque realizado: R$ 30,00
Saldo: R$ 120,00
Conta bloqueada.
Estado atual: Bloqueada
Nao e possivel sacar: a conta esta bloqueada.
Nao e possivel depositar: a conta esta bloqueada.
Conta desbloqueada.
Estado atual: Ativa
Deposito realizado: R$ 100,00
Saldo: R$ 220,00
```
