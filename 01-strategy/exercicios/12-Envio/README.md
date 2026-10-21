# Exercicio 12 - Strategy: envio de mensagens com classe abstrata

Este exemplo usa o padrão **Strategy**, mas com uma variação importante:

- em vez de usar uma interface, a base da estratégia é uma **classe abstrata**;
- a classe abstrata define um atributo comum e um comportamento compartilhado;
- cada estratégia concreta possui atributos próprios e implementa a parte
  específica do envio.

## Participantes

- `SistemaEnvio`: **Context**. Mantém a estratégia atual e delega o envio.
- `EnvioStrategy`: **Abstract Strategy**. Define o comportamento comum e o
  atributo `tipo`.
- `EnvioEmail`: **Concrete Strategy**. Possui `destinatario` e `assunto`.
- `EnvioSMS`: **Concrete Strategy**. Possui `numero` e `operadora`.
- `EnvioWhatsApp`: **Concrete Strategy**. Possui `numero` e `comImagem`.
- `Main`: troca a estratégia para demonstrar diferentes tipos de envio.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
