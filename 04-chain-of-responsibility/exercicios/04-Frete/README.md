# Exercicio 04 - Chain of Responsibility: sistema de frete

Este exemplo usa o padrao **Chain of Responsibility** para escolher uma
transportadora conforme as caracteristicas do pedido. O cliente envia o
pedido apenas para a primeira transportadora da cadeia. Cada transportadora
decide se atende a entrega ou encaminha para a proxima.

## Regras

- `Loggi`: pedidos de ate 5 kg e ate 50 km.
- `Jadlog`: pedidos de ate 20 kg e ate 300 km.
- `Correios`: pedidos de ate 30 kg.
- `J&T Express`: transportadora de fallback para os demais pedidos.

## Estrutura

- `Pedido`: informa o valor dos produtos, o peso e a distancia da entrega.
- `Frete`: handler abstrato que guarda o proximo handler e encaminha pedidos.
- `Loggi`, `Jadlog`, `Correios` e `JTExpress`: handlers concretos que
  verificam suas regras e calculam o frete.
- `Main`: monta a cadeia e envia os pedidos.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Entrega local: Loggi - frete R$ 15.20 - total R$ 135.20
Entrega regional: Jadlog - frete R$ 110.20 - total R$ 460.20
Caixa pesada: Correios - frete R$ 267.00 - total R$ 767.00
Carga especial: J&T Express - frete R$ 477.00 - total R$ 1277.00
```
