# Exercicio 05 - Decorator: sistema de descontos

Este exemplo usa o padrao **Decorator** para combinar descontos sem modificar a
classe original do produto.

## Estrutura

- `Preco`: componente comum com descricao e valor.
- `PrecoOriginal`: componente concreto que representa o preco inicial.
- `PrecoDecorator`: decorator abstrato que mantem um preco.
- `DescontoNatal`: aplica 10% de desconto.
- `DescontoClienteVIP`: aplica 15% de desconto.
- `Main`: combina os descontos em tempo de execucao.
- `diagrama.md`: diagrama UML da estrutura do padrao.

Os descontos sao aplicados sobre o valor recebido do decorator anterior. Assim,
os descontos podem ser combinados em qualquer ordem.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Produto: Notebook (desconto de Natal) (desconto de cliente VIP)
Preco final: R$ 2295,00
```
