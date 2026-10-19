# Exercicio 06 - Strategy: formas de pagamento

Este exemplo aplica o padrão **Strategy** para representar diferentes formas
de pagamento em um pedido de e-commerce.

## Participantes

- `Pedido`: **Context**. Mantém o valor total e delega o pagamento para a
  estratégia escolhida.
- `PagamentoStrategy`: **Strategy**. Define o contrato comum dos pagamentos.
- `PagamentoPayPal`: **Concrete Strategy**. Simula a validação dos dados e a
  autenticação no PayPal.
- `PagamentoCartaoCredito`: **Concrete Strategy**. Simula a validação dos
  dados do cartão.
- `Main`: cria o pedido, realiza um pagamento e troca a estratégia para
  demonstrar a outra forma de pagamento.

As validações e os processamentos são representados apenas por mensagens,
pois o objetivo é demonstrar a aplicação do padrão Strategy.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
