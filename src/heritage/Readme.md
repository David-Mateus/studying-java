
# Herança
    Herança permite o reuso de atributos e métodos
### Modificadores de acessos
    
    - Protected: Permite acesso a classe do mesmo pacote e em classe de diferente pacote, mas que seja subclasse(herança)
    
    - Private: Apenas dentro da própria classe onde o membro é declarado

    - Public: Acessível de qualquer lugar, tanto dentro do mesmo pacote quanto fora dele.
### Definições importantes
    - Relação "é-um": A subclasse é uma superclasse
    - Generalização/Especialização: A superclasse é uma generalização e a subclasse é uma especialização
    - Superclasse(classe base)/ subclasse(classe derivada)
    - Herança/extensão
    - Herança é uma associação entre classes(e não entre objetos)
### Upcasting e Downcasting
    - Upcasting: Casting da subclasse para superclasse.OBS: tratar um objeto de um subclasse como se fosse da superclasse. apenas os metodos da superclasse são acessiveis
    - Uso comum: Polimorfismo
    - Dowcasting: Casting da superclasse para sublclasse
    - Plavara instaceof
    - Uso comum: Métodos que recebem parâmetro generico(equals)
### Sobreposição, palavra super, anotação @Override
    - Super é um metodo usado para acessar membros da superclasse
### Classe e métodos final
    - Palavra chave: final
    - Classe: evita que a classe seja herdada
        `public final class SavingsAccount`
    - Método: evita que o metodo sob seja sobreposto
    -Final é usado por questão de segurança e performance
### Polimorfismo
    - Revisa anteiror e inicar novos estudos
    
    