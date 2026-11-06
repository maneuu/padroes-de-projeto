# Exercicio 02 - State: semaforo

Este exemplo usa o padrao **State** para representar as cores de um semaforo.
O objeto `Semaforo` delega a transicao para o estado atual, e cada estado
define qual sera a proxima cor.

## Estados e transicoes

- `Vermelho`: muda para verde.
- `Verde`: muda para amarelo.
- `Amarelo`: muda para vermelho.

O fluxo principal e:

```text
Vermelho -> Verde -> Amarelo -> Vermelho
```

## Estrutura

- `EstadoSemaforo`: contrato dos estados do semaforo.
- `Semaforo`: contexto que mantem o estado atual e delega as transicoes.
- `Vermelho`, `Amarelo` e `Verde`: estados concretos com comportamentos
  diferentes.
- `Main`: demonstra o ciclo completo do semaforo.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Sinal: Vermelho
Sinal: Verde
Sinal: Amarelo
Sinal: Vermelho
Sinal: Verde
```
