# DIAGRAMA DE CLASSES #

```mermaid
classDiagram
    class App{
        -ArrayList~Tarefa~ tarefa
    }

    App "1" *-- "1" Tarefa

    class Tarefa{
        -String: titulo
        -LocalDate: data de Entrega
        -LocalDate: data de Conclusão
        -Categoria: categoria
        -ArrayList~Pessoas~ responsaveis
    }

    Tarefa "1" o-- "0..*" Pessoas

    class Pessoas{
        -String: nome
        -String: sobrenome
    }

    Tarefa "1" o-- "1" Categoria

    class Categoria{
        -Sting: descricao;
        -Int: id
    }