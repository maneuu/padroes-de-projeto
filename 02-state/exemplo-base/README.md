# Estrutura base - State

Este exemplo apresenta somente a estrutura do padrao **State**, sem usar um
tema de negocio.

## Arquivos

- `Estado`: contrato comum para todos os estados.
- `Contexto`: guarda o estado atual e delega a operacao.
- `EstadoConcretoA`: implementa um comportamento e muda para o estado B.
- `EstadoConcretoB`: implementa outro comportamento e volta para o estado A.
- `Main`: cria o contexto e executa o fluxo.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como funciona

O contexto mantém uma referencia para o estado atual. Quando o cliente chama
`operar()`, o contexto encaminha a chamada para esse estado:

```java
estado.operar(this);
```

O `this` representa o proprio contexto. Ele e passado ao estado concreto para
que o estado possa solicitar uma transicao usando `definirEstado`.

Cada estado decide seu proximo estado:

```text
Contexto
   |
   v
Estado A ----operar()----> Estado B
   ^                         |
   |---------operar()--------|
```

As letras `"A"` e `"B"` nao representam um problema real. Elas existem
somente para mostrar como o comportamento muda conforme o estado atual.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Estado atual: A
Estado atual: B
Estado atual: A
Estado atual: B
```
