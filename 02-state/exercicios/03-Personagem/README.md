# Exercicio 03 - State: personagem

Este exemplo usa o padrao **State** para representar os estados de um
personagem. O objeto `Personagem` delega cada transicao ao estado atual, e
cada estado define qual sera a proxima acao.

## Estados e transicoes

- `Parado`: inicia uma corrida.
- `Correndo`: inicia um pulo.
- `Pulando`: volta ao estado parado.

O fluxo principal e:

```text
Parado -> Correndo -> Pulando -> Parado
```

## Estrutura

- `EstadoPersonagem`: contrato dos estados do personagem.
- `Personagem`: contexto que mantem o estado atual e delega as transicoes.
- `Parado`, `Correndo` e `Pulando`: estados concretos com comportamentos
  diferentes.
- `Main`: demonstra o ciclo completo do personagem.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Personagem: Parado
Personagem: Correndo
Personagem: Pulando
Personagem: Parado
Personagem: Correndo
```
