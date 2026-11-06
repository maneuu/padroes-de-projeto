# Exercicio 01 - State: pedido

Este exemplo usa o padrao **State** para representar as etapas de um pedido.
O objeto `Pedido` delega cada operacao ao estado atual, e o proprio estado
decide se a operacao e permitida e qual sera a proxima transicao.

## Estados e transicoes

- `Pendente`: aguarda o pagamento e nao permite o envio.
- `Pago`: permite o envio e nao permite um novo pagamento.
- `Enviado`: representa o estado final do pedido.

O fluxo principal e:

```text
Pendente -> Pago -> Enviado
```

## Estrutura

- `EstadoPedido`: contrato dos estados do pedido.
- `Pedido`: contexto que mantem o estado atual e delega as operacoes.
- `Pendente`, `Pago` e `Enviado`: estados concretos com comportamentos
  diferentes.
- `Main`: demonstra as operacoes permitidas e recusadas.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Estado atual: Pendente
O pedido precisa ser pago antes do envio.
Pagamento aprovado.
Estado atual: Pago
O pedido ja foi pago.
Pedido enviado.
Estado atual: Enviado
O pedido ja foi enviado.
```
