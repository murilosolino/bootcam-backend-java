 
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


## Níveis de Teste

  ### Unidade, Integração, Sistema, Regressão e Aceitação

**Unidade**: Teste relacionados a pequenas unidades de software.

**Integração** : Voltado para validar estruturas maiors do software. Simulação de APIs, chamadas para sistemas externos, Chamada ao Banco de Dados.

**Sistema**: Validações de funcionalidades via usuários em ambiente de Homologação.

**Regressão**:  Faz a reavaliação do que foi desenvolvido. Validação de novas features.

**Aceitação**: Usuário faz validações em ambiente de produção.

### Testes Alpha, Beta e Cannary

**Alpha**: Teste Aplha, início do softwares com pessoas selecionadas para realizar a validação do sistema

**Beta**: Teste Beta, abrange mais pessoas, disponibiliza uma versão inical para os  cliente realizarem validações. 

**Cannary**: Seguementa os usuários para testar novas versões, é aplicada em ambiente de produção.

## Técnicas de Testes

### Caixa Branca

- Teste estrtutural
- Validar dados, controle Fluxos, Chamadas
- Garantir a qualidade da implementação
- Níveis: Unidade,Integração e Regressão

### Caixa Preta

- Teste Funcional
- Verificar as saídas usando vários tipos de entrada
- Teste sem conhecer a estrutura interna do software
- Níveis: Integração, Sistema e Aceitação

### Caixa Cinza

- Mescla as técnicas da caixa branca e preta
- Analisa a parte lógica e também funcionalidade
- Ter acesso a documentação do código
- Engenharia Reversa

## Testes Não Funcionais

### Testes não funcionais estão ligados a requisitos não funcionais

- Comportamento do Sistema
- Performance
- Escaliabilidade
- Segurança
- Infraestrtutura
- 
 - [x] Testes não funcionais tem como Objetivo testar aspectos do software que não são associados as regras de negócio mas sim a requisitos não funcionais 
 - [x] Ferramentas que usam técnicas para apurar o comportamento do sistema em determinadas circunstâncias.
  
  ### Teste de Carga

  - [x] O teste de carga é realizado para verificar qual o volume de transações acessos simultâneos ou usuários que um servidor / software / sistema suporta.

  ### Teste  de Stress

  - [x]  O teste de stress é realizado para submeter o software a situações extremas. Baseia-se em testar os limites do softwares e avaliar seu comportamento.  

  ### Teste de Segurança
  - [x] O teste de segurança é um processo crítico de segurança cibernética que visa detectar a vulnerabilidades em sistemas, softwares, redes e aplicativos.

## Pirâmide de Testes

### Testes Unitários

Testam unidades individuais de código (por exemplo, funções ou métodos).
São rápidos de executar.
Devem ser numerosos para cobrir todas as partes críticas do código.

### Testes de Integração

Testam a interação entre diferentes partes do sistema (por exemplo, entre módulos ou serviços).
São mais lentos que os testes unitários.
Devem ser usados para garantir que as partes do sistema funcionam bem juntas.

### Testes de Ponta a Ponta (End-to-End)

Testam o sistema como um todo, do início ao fim.
São os mais lentos e difíceis de manter.
Devem ser limitados em número, mas são essenciais para garantir que o sistema funcione corretamente do ponto de vista do usuário final.


