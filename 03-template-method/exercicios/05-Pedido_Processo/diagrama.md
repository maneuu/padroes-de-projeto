# Diagrama UML

```mermaid
classDiagram
    class ProcessamentoPedido {
        <<abstract>>
        +processarPedido() final
        #validarPedido()*
        #calcularTotal()*
        #separarPedido()*
        #enviarPedido()*
        #enviarNotificacao()
        #registrarAuditoria()
    }

    class PedidoOnline {
        #validarPedido()
        #calcularTotal()
        #separarPedido()
        #enviarPedido()
        #enviarNotificacao()
        #registrarAuditoria()
    }

    class PedidoLoja {
        #validarPedido()
        #calcularTotal()
        #separarPedido()
        #enviarPedido()
        #registrarAuditoria()
    }

    class PedidoAssinatura {
        #validarPedido()
        #calcularTotal()
        #separarPedido()
        #enviarPedido()
        #enviarNotificacao()
    }

    ProcessamentoPedido <|-- PedidoOnline
    ProcessamentoPedido <|-- PedidoLoja
    ProcessamentoPedido <|-- PedidoAssinatura
```

`processarPedido` controla o fluxo comum. Os quatro primeiros metodos sao
etapas obrigatorias; `enviarNotificacao` e `registrarAuditoria` sao hooks com
implementacao vazia, usados apenas pelas subclasses que precisam deles.
