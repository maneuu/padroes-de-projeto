# Exercicio 02 - Decorator: notificacao

Este exemplo usa o padrao **Decorator** para adicionar comportamentos ao envio
de notificacoes sem alterar os canais concretos.

## Estrutura

- `Notificacao`: componente comum com a operacao de envio.
- `NotificacaoEmail` e `NotificacaoSMS`: componentes concretos.
- `NotificacaoDecorator`: decorator abstrato que mantem uma notificacao.
- `NotificacaoComLog`: registra o inicio e o fim do envio.
- `NotificacaoComPrioridade`: adiciona a prioridade a mensagem.
- `Main`: empilha decorators em tempo de execucao.

Cada decorator tambem e uma `Notificacao`, portanto decorators podem ser
combinados e usados com qualquer canal.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
[Log] Iniciando envio da notificacao
[Email] Para: cliente@exemplo.com
[Email] Assunto: Pedido atualizado
[Email] Mensagem: [URGENTE] Seu pedido foi enviado.
[Log] Notificacao enviada com sucesso

[Log] Iniciando envio da notificacao
[SMS] Para: (11) 99999-9999
[SMS] Mensagem: Seu pedido chegou.
[Log] Notificacao enviada com sucesso
```
