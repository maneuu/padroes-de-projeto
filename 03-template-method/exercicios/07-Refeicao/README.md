# Exercicio 07 - Template Method: preparacao de refeicoes

Este exemplo aplica o padrao **Template Method** a preparacao de cafe da manha
e almoco. A ordem geral do preparo permanece fixa, enquanto cada tipo de
refeicao define seus ingredientes e sua forma de cozimento.

## Estrutura

- `Refeicao`: classe abstrata que define o algoritmo fixo de preparacao.
- `CafeDaManha` e `Almoco`: implementacoes concretas das etapas variaveis.
- `Main`: executa os dois tipos de refeicao.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `prepararRefeicao` e o **template method**. Ele e `final` para impedir
que as subclasses alterem a ordem das etapas. `adicionarAcompanhamento` e um
**hook** opcional que pode ser sobrescrito por cada refeicao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Preparando cafe da manha:
Separando pao, ovos e frutas
Preparando ovos mexidos
Tostando o pao e aquecendo o cafe
Servindo a refeicao
Adicionando frutas e suco

Preparando almoco:
Separando arroz, feijao e legumes
Temperando o frango
Cozinhando arroz, feijao e frango
Servindo a refeicao
Adicionando salada
```
