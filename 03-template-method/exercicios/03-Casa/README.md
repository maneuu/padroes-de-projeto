# Exercicio 03 - Template Method: construcao de casas

Este exemplo aplica o padrao **Template Method** a um processo comum:
construir casas de materiais diferentes. A ordem geral da construcao permanece
igual, enquanto as subclasses definem como cada etapa variavel e realizada.

## Estrutura

- `CasaTemplate`: classe abstrata que define o algoritmo fixo de construcao.
- `CasaDeAlvenaria` e `CasaDeMadeira`: implementacoes concretas das etapas que variam.
- `Main`: executa as duas variacoes de casa.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `construirCasa` e o **template method**. Ele e `final` para impedir
que as subclasses alterem a ordem das etapas. `decorar` e um **hook** opcional:
cada tipo de casa pode implementa-lo ou manter o comportamento vazio.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Construindo casa de alvenaria:
Preparando a fundacao
Construindo a estrutura com tijolos e cimento
Instalando telhado de telhas ceramicas
Instalando portas e janelas de aluminio
Pintando as paredes

Construindo casa de madeira:
Preparando a fundacao
Montando a estrutura com vigas de madeira
Instalando telhado de madeira
Instalando portas e janelas de madeira
Aplicando verniz nas paredes
```
