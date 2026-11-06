# Exercicio 03 - Chain of Responsibility: sistema de descontos

Este exemplo usa o padrao **Chain of Responsibility** para encontrar o
desconto adequado conforme o valor do pedido.

## Regras

- Menos de R$ 500,00: desconto de 5%.
- De R$ 500,00 até menos de R$ 1.000,00: desconto de 10%.
- A partir de R$ 1.000,00: desconto de 20%.

## Estrutura

- `Pedido`: representa a solicitacao que recebera o desconto.
- `Desconto`: classe abstrata que guarda o proximo desconto e encaminha o
  pedido.
- `Desconto5`: aplica 5% ou passa para o proximo.
- `Desconto10`: aplica 10% ou passa para o proximo.
- `Desconto20`: aplica 20%.
- `Main`: monta a cadeia e envia os pedidos.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O cliente envia o pedido apenas para `Desconto5`. Cada classe decide se a
regra de desconto se aplica. Caso nao se aplique, o pedido segue para o
proximo desconto.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Pedido pequeno: 5% de desconto - valor final R$ 285,00
Pedido medio: 10% de desconto - valor final R$ 630,00
Pedido grande: 20% de desconto - valor final R$ 1200,00
```
