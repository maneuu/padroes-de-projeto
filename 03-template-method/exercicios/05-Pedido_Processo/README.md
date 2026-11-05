# Exercicio 05 - Template Method: processamento de pedidos

Este exemplo aplica o padrao **Template Method** ao processamento de pedidos
em diferentes canais. A sequencia geral permanece a mesma, mas cada tipo de
pedido define suas proprias regras para as etapas obrigatorias.

## Estrutura

- `ProcessamentoPedido`: classe abstrata que define o algoritmo fixo.
- `PedidoOnline`, `PedidoLoja` e `PedidoAssinatura`: implementacoes concretas.
- `Main`: executa os tres tipos de processamento.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `processarPedido` e o **template method**. Ele e `final` para impedir
que as subclasses alterem a ordem das etapas. `enviarNotificacao` e
`registrarAuditoria` sao **hooks** opcionais:

- `PedidoOnline` sobrescreve os dois hooks.
- `PedidoLoja` sobrescreve apenas `registrarAuditoria` e ignora a notificacao.
- `PedidoAssinatura` sobrescreve apenas `enviarNotificacao` e ignora a auditoria.

Assim, as subclasses podem participar dos pontos de extensao somente quando
precisam, sem duplicar o fluxo principal.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Processando pedido online:
Validando endereco e dados de pagamento
Calculando total com frete
Separando itens no centro de distribuicao
Enviando pedido pela transportadora
Enviando e-mail com o codigo de rastreamento
Registrando pedido online no sistema

Processando pedido da loja:
Validando cadastro do cliente no caixa
Calculando total com desconto da loja
Separando itens no estoque da loja
Disponibilizando pedido para retirada
Registrando retirada no sistema da loja

Processando pedido de assinatura:
Validando assinatura ativa do cliente
Calculando mensalidade recorrente
Separando itens do kit mensal
Enviando kit pelo servico de entrega
Enviando mensagem sobre a proxima cobranca
```
