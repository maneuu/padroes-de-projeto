# Diagrama UML - Strategy

```mermaid
classDiagram
    class Navegador {
        -EstrategiaDeRota estrategiaDeRota
        +Navegador(EstrategiaDeRota estrategiaDeRota)
        +definirEstrategia(EstrategiaDeRota estrategiaDeRota) void
        +calcularRota(String origem, String destino) String
    }

    class EstrategiaDeRota {
        <<interface>>
        +calcularRota(String origem, String destino) String
    }

    class RotaDeCarro {
        +calcularRota(String origem, String destino) String
    }

    class RotaDeTransportePublico {
        +calcularRota(String origem, String destino) String
    }

    class RotaAPe {
        +calcularRota(String origem, String destino) String
    }

    Navegador o--> EstrategiaDeRota : utiliza
    EstrategiaDeRota <|.. RotaDeCarro
    EstrategiaDeRota <|.. RotaDeTransportePublico
    EstrategiaDeRota <|.. RotaAPe
```

## Participantes do padrão

- **Navegador**: contexto que delega o cálculo para a estratégia selecionada.
- **EstrategiaDeRota**: interface comum das estratégias.
- **RotaDeCarro**, **RotaDeTransportePublico** e **RotaAPe**: estratégias concretas.

