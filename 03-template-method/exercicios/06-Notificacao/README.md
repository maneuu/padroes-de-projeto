# Exercicio 06 - Template Method: envio de notificacoes

Este exemplo aplica o padrao **Template Method** ao envio de notificacoes por
e-mail e SMS. A classe base controla a ordem do processo, enquanto cada canal
implementa suas etapas especificas.

## Estrutura

- `Notificacao`: classe abstrata que define o algoritmo fixo de envio.
- `NotificacaoEmail` e `NotificacaoSMS`: implementacoes concretas.
- `Main`: executa os dois canais de notificacao.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `enviarNotificacao` e o **template method**. Ele e `final` para
impedir que as subclasses alterem a ordem das etapas. Os metodos abstratos
representam as etapas obrigatorias, enquanto `registrarEnvio` e uma etapa comum
para todos os canais.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Enviando notificacao por e-mail:
Validando endereco de e-mail
Preparando mensagem em formato HTML
Conectando ao servidor SMTP
Enviando e-mail
Registrando envio da notificacao

Enviando notificacao por SMS:
Validando numero de telefone
Preparando mensagem com limite de caracteres
Conectando a operadora de telefonia
Enviando SMS
Registrando envio da notificacao
```
