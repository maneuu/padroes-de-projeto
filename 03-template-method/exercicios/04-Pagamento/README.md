# Exercicio 04 - Template Method: processamento de pagamentos

Este exemplo aplica o padrao **Template Method** ao processamento de
pagamentos com cartao e Pix. A classe base controla a ordem do fluxo, enquanto
cada forma de pagamento implementa suas etapas especificas.

## Estrutura

- `Pagamento`: classe abstrata que define o algoritmo fixo.
- `PagamentoCartao` e `PagamentoPix`: implementacoes concretas.
- `Main`: executa as duas formas de pagamento.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `processarPagamento` e o **template method**. Ele e `final` para
impedir que as subclasses alterem a ordem das etapas. `notificarCliente` e um
**hook** opcional, personalizado por cada forma de pagamento.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Processando pagamento com cartao:
Validando numero, validade e titular do cartao
Solicitando autorizacao a operadora do cartao
Confirmando pagamento no cartao
Emitindo comprovante do pagamento
Enviando notificacao por e-mail

Processando pagamento com Pix:
Validando chave Pix e valor da transferencia
Validando o QR Code ou codigo Pix
Confirmando transferencia Pix
Emitindo comprovante do pagamento
Enviando notificacao no aplicativo
```
