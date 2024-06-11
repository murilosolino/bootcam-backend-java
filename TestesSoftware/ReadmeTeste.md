 
 ## Evolução de Testes na Engenharia de Software

 ### Modelo Cascata
  - Especificação -> Projeto de Software -> Implementação -> Testes -> Implantação.

 ### Desenvolvimento ágil
- Reunião e Planejamento -> Desing -> Teste e de Desenvolvimento -> Realse -> FeedBack -> Reunião e Planejamento...

 ## Defeito, Falha e Erro

 ### Defeito (Bug ou Fault):

- **Definição:** Um defeito é uma falha no código ou na lógica de um software que pode causar o comportamento incorreto do sistema. Pode ser um erro de programação, um problema de design ou um erro nos requisitos.
**Exemplo:** Um desenvolvedor pode esquecer de inicializar uma variável, o que leva a resultados inesperados quando essa variável é usada.

### Erro (Mistake ou Error):

- **Definição:** Um erro é uma ação incorreta ou decisão errada tomada por um desenvolvedor, analista ou qualquer outra pessoa envolvida no desenvolvimento do software. É o erro humano que introduz um defeito no software.
**Exemplo:** Um analista de requisitos pode interpretar mal as necessidades do cliente e, consequentemente, documentar um requisito incorreto. Esse erro nos requisitos pode levar a defeitos no design e no código.

### Falha (Failure):

- **Definição:** Uma falha ocorre quando o software não executa uma função esperada ou se comporta de maneira inesperada. É a manifestação de um defeito durante a execução do software. Em outras palavras, é quando um defeito se manifesta e resulta em um comportamento incorreto do software.
**Exemplo:** Durante a execução de um teste, o sistema pode travar ou produzir resultados incorretos devido a um defeito presente no código.

### Relação entre os termos:
**Erro** -> O erro é cometido por uma pessoa durante as fases de desenvolvimento do software (análise, design, codificação, etc.).

**Defeito ->** O erro introduzido no software leva a um defeito (bug) no código ou na lógica do sistema.

**Falha ->** Quando o software com um defeito é executado, ele pode falhar, exibindo um comportamento inesperado ou incorreto.

## Verificação e Validação

### Verificação
**Definição:** A verificação é o processo de garantir que o software foi desenvolvido corretamente, de acordo com as especificações e requisitos definidos. É uma atividade que foca em revisar e avaliar produtos intermediários de trabalho (como documentos de requisitos, designs, código-fonte) para assegurar que eles estejam conformes com os padrões e procedimentos estabelecidos.

### Validação
**Definição:** A validação é o processo de garantir que o software atende às necessidades e expectativas do cliente e do usuário final. Foca em avaliar o produto final para assegurar que ele realmente cumpre seu propósito e resolve os problemas para os quais foi desenvolvido.

| Característica         | Verificação                                    | Validação                                 |
|------------------------|------------------------------------------------|-------------------------------------------|
| Foco                   | Processo e produto intermediário               | Produto final e requisitos do usuário     |
| Objetivo               | Garantir conformidade com especificações       | Garantir que o produto atenda às necessidades do usuário |
| Pergunta central       | "Estamos construindo o produto corretamente?"  | "Estamos construindo o produto certo?"    |
| Métodos                | Revisões, inspeções, análises estáticas        | Testes funcionais, testes de usabilidade  |
| Quando ocorre          | Durante todo o ciclo de desenvolvimento        | Principalmente no final do ciclo de desenvolvimento |
