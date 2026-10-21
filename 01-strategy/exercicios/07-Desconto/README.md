# Exercicio 07 - Strategy: descontos promocionais

Este exemplo aplica o padrão **Strategy** para representar diferentes regras de
aplicação de descontos em um carrinho de compras.

## Participantes

- `Carrinho`: **Context**. Mantém o valor dos produtos e delega o cálculo do
  valor final para a estratégia de desconto escolhida.
- `DescontoStrategy`: **Strategy**. Define o contrato comum dos descontos.
- `SemDesconto`: **Concrete Strategy**. Não aplica qualquer desconto.
- `Desconto10Porcento`: **Concrete Strategy**. Aplica 10% de desconto.
- `Desconto20Porcento`: **Concrete Strategy**. Aplica 20% de desconto.
- `DescontoClienteVIP`: **Concrete Strategy**. Aplica 30% de desconto para
  clientes VIP.
- `Main`: cria um carrinho e troca a estratégia para demonstrar cada regra.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
