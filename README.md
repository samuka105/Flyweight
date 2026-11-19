# Padrão Flyweight

Exemplo do padrão estrutural **Flyweight** aplicado a uma floresta com muitas
árvores. O que é comum entre as árvores de uma mesma espécie (nome, cor e textura)
fica em um único objeto compartilhado — o tipo da árvore —, criado e reaproveitado
por uma fábrica com cache. Cada árvore guarda apenas o que é próprio dela (posição)
e uma referência ao tipo, de modo que milhares de árvores reutilizam poucos tipos
em memória.

## Conteúdo do repositório

- **Código-fonte** do exemplo implementando o padrão Flyweight (floresta de árvores).
- **Casos de teste** (JUnit) cobrindo o compartilhamento de instâncias, a contagem de tipos únicos e a reutilização entre muitas árvores.
- **Diagrama UML** das classes, em formato de imagem.
