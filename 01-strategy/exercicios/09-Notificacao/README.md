# Exercicio 09 - Strategy: notificações com atributos próprios

Este exemplo aplica o padrão **Strategy** para representar diferentes formas de
notificação. Cada estratégia concreta possui atributos próprios e específicos,
mostrando que cada implementação pode ter seus próprios dados e configurações.

## Participantes

- `SistemaNotificacao`: **Context**. Mantém a estratégia atual e delega o envio
  da mensagem.
- `NotificacaoStrategy`: **Strategy**. Define o contrato comum de envio.
- `NotificacaoEmail`: **Concrete Strategy**. Possui `destinatario` e `assunto`.
- `NotificacaoSMS`: **Concrete Strategy**. Possui `numero` e `operadora`.
- `NotificacaoPush`: **Concrete Strategy**. Possui `tokenDispositivo` e `canal`.
- `Main`: troca a estratégia para demonstrar o uso dos atributos próprios.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
