# Exercicio 04 - Decorator: personagem de jogo

Este exemplo usa o padrao **Decorator** para equipar um personagem em tempo de
execucao, adicionando atributos e habilidades sem alterar a classe base.

## Estrutura

- `Personagem`: componente comum com descricao, ataque, defesa e habilidades.
- `PersonagemBase`: componente concreto com os atributos iniciais.
- `PersonagemDecorator`: decorator abstrato que mantem um personagem.
- `ArmaduraDecorator`: adiciona defesa e a habilidade `Resistencia`.
- `ArmaDecorator`: adiciona ataque e a habilidade `Golpe poderoso`.
- `Main`: equipa o personagem empilhando decorators.
- `diagrama.md`: diagrama UML da estrutura do padrao.

Cada equipamento tambem e um `Personagem`, portanto armaduras e armas podem ser
combinadas em qualquer ordem.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Personagem: Personagem base, armadura, arma
Ataque: 25
Defesa: 15
Habilidades: Resistencia, Golpe poderoso
```
