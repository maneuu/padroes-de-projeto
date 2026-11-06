# Exercicio 09 - Chain of Responsibility: validacao de formularios

Este exemplo usa o padrao **Chain of Responsibility** para validar os campos
de um formulario em etapas. O cliente envia o formulario apenas para o
primeiro validador, e cada etapa passa a solicitacao para a proxima quando a
validacao tem sucesso.

## Regras

- `ValidadorNome`: verifica se o nome foi informado.
- `ValidadorCpf`: verifica se o CPF possui 11 digitos.
- `ValidadorEmail`: verifica se o e-mail possui formato valido.
- Uma falha interrompe a cadeia e rejeita o formulario.

## Estrutura

- `Formulario`: representa o nome, o CPF e o e-mail informado.
- `Validador`: handler abstrato que guarda o proximo validador e encaminha o
  formulario.
- `ValidadorNome`, `ValidadorCpf` e `ValidadorEmail`: handlers concretos de
  cada etapa da validacao.
- `Main`: monta a cadeia e envia os formularios.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Formulario valido
Formulario invalido: nome obrigatorio
Formulario invalido: CPF deve conter 11 digitos
Formulario invalido: e-mail invalido
```
