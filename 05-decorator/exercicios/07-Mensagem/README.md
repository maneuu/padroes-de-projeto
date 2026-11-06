# Exercicio 08 - Decorator: mensagem criptografada

Este exemplo usa o padrao **Decorator** para encadear diferentes tipos de
criptografia sem modificar `MensagemSimples`.

## Estrutura

- `Mensagem`: componente comum com a operacao de obter o conteudo.
- `MensagemSimples`: componente concreto com a mensagem original.
- `MensagemDecorator`: decorator abstrato que mantem uma mensagem.
- `CesarDecorator`: representa uma criptografia de Cesar.
- `Base64Decorator`: representa uma criptografia Base64.
- `Main`: combina os decorators em tempo de execucao.
- `diagrama.md`: diagrama UML da estrutura do padrao.

Os decorators podem ser combinados em qualquer ordem. Para manter o foco no
padrao Decorator, as transformacoes sao representadas por prefixos no texto.
Em um sistema real, cada decorator teria o algoritmo correspondente.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Mensagem criptografada: [Base64] [Cesar] Mensagem secreta
```
