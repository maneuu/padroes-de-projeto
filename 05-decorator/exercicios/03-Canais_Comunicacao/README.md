# Exercicio 03 - Decorator: canais de notificacao combinaveis

Este exemplo usa o padrao **Decorator** para manter o site como canal padrao e
adicionar canais extras de notificacao sem alterar o componente principal.

## Estrutura

- `Notificacao`: componente comum com a operacao de envio.
- `NotificacaoSite`: componente concreto e canal padrao do sistema.
- `NotificacaoDecorator`: decorator abstrato que mantem uma notificacao.
- `NotificacaoEmail`, `NotificacaoSMS` e `NotificacaoWhatsApp`: decorators que
  enviam a mesma mensagem por canais extras.
- `Main`: combina os tres canais extras sobre o canal do site.

Os decorators podem ser empilhados em qualquer ordem. Tambem e possivel usar
somente alguns deles, por exemplo, site + e-mail ou site + WhatsApp.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
[Site] Notificacao exibida no site
[Site] Mensagem: Seu pedido foi enviado.
[Email] Para: cliente@exemplo.com
[Email] Mensagem enviada: Seu pedido foi enviado.
[SMS] Para: (11) 99999-9999
[SMS] Mensagem enviada: Seu pedido foi enviado.
[WhatsApp] Para: (11) 98888-8888
[WhatsApp] Mensagem enviada: Seu pedido foi enviado.
```
