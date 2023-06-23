Design Pattern
================================

O objetivo desse projeto é facilitar o entendimento dos designs patterns e como implementa-los em java. Estão separados de acordo com suas categorias:
- Criacionas
- Estruturais
- Comportamentais

Criacionais
----------
- Builder
> O padrão de design Builder é um padrão criacional que separa a construção de um objeto complexo da sua representação final. Ele permite que você crie objetos complexos passo a passo, usando um construtor (builder) dedicado, sem expor os detalhes de criação ao código cliente.

- Factory Method
> O padrão de design Factory (ou Fábrica) é um padrão de criação que fornece uma maneira de criar objetos sem especificar explicitamente sua classe exata. Ele encapsula a lógica de criação de objetos em uma classe separada, conhecida como "fábrica", que é responsável por criar objetos de um determinado tipo.
 
- Singleton
> O padrão de design Singleton (Único) é um padrão criacional que garante que uma classe tenha apenas uma única instância e fornece um ponto global de acesso a essa instância.

Estruturais
-----------
- Adapter
> O padrão de design Adapter (Adaptador) é um padrão estrutural que permite que objetos com interfaces incompatíveis possam trabalhar juntos. Ele converte a interface de uma classe em outra interface que o cliente espera, permitindo que classes com interfaces diferentes possam colaborar de forma transparente.

- Decorator
> O padrão de design Decorator (Decorador) é um padrão estrutural que permite adicionar funcionalidades extras a um objeto de forma dinâmica, sem alterar sua estrutura básica. O Decorator fornece uma alternativa flexível à criação de subclasses para estender as funcionalidades de um objeto.

Comportamentais
-----------
- Strategy
> O padrão de design Strategy (Estratégia) é um padrão comportamental que permite que você defina uma família de algoritmos, coloque cada um deles em uma classe separada e os torne intercambiáveis. Isso permite que os algoritmos variem independentemente dos clientes que os utilizam.