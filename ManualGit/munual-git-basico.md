
## Resumos Git

Repositorio para armazenar um manual básico de resumos sobre GIT

## 📕 Documentação
- [Documentacao Git] (https://git-scm.com/doc)
- [Documentacao Github] (https://docs.github.com/)


## ⚙️ Git Config

O Git possui 3 níveis de **níveis de configuração** são eles: 
 
 **1 - Global**
 - As configurações globais são aplicadas a todos os repositórios Git em sua máquina, independentemente do diretório em que você está trabalhando.
- Essas configurações são armazenadas no arquivo **.gitconfig** em seu diretório pessoal (~/ - no Linux/Mac ou C:\Users\NomeDoUsuario\ no Windows).
- Elas geralmente incluem informações de identificação do usuário, como nome e email, que serão usadas em todos os seus commits.

**2 - Local**
 - As configurações locais são específicas para um repositório Git individual.
- Elas são armazenadas no diretório **.git** dentro do repositório em questão.
- As configurações locais substituem as configurações globais para esse repositório específico, o que significa que elas têm precedência sobre as configurações globais.

**3 - System**
 - As configurações do sistema são aplicadas a todos os usuários e todos os repositórios em uma máquina.
- Elas são armazenadas em um arquivo específico do sistema, que geralmente está localizado em /etc/gitconfig no Linux/Mac ou C:\ProgramData\Git\config no Windows.
- Essas configurações são menos comuns e geralmente são usadas por administradores de sistema para definir políticas de configuração padrão para todos os usuários em uma máquina.


| Comandos | Resumos |
|-------|-----------|
|git config --global user.name | Este comando configura o nome do usuário para todos os    repositórios Git no sistema globalmente.
|git config --global user.email| Este comando configura o endereço de e-mail do usuário para todos os repositórios Git no sistema globalmente.
|git config --global --list| Este comando lista todas as configurações globais do usuário no Git.
| git conifg user.name & git config user.email| Estes comandos servem para vsiaulizar os valores configurados em user.name e user.email
|git config init.defaultBranch| Este comando serve para visualizar sua Branch padrão
|git congig --global init.defaultBranch nome| Este comando serve para redefinir sua Branch padrão globalmente

- Exemplos 
```
git config --global user.name "Seu Nome"
```
```
git config --global user.email "seuemail@example.com"
```
```
git config --global --list
```
```
git config --global init.defaultBranch main

``` 

## ⚡Git init
- O comando git init é usado para inicializar um repositório Git em um diretório local. Quando você executa git init em um diretório, ele cria um novo repositório Git nesse diretório ou converte um diretório existente em um repositório Git vazio.

- Criação de um Novo Repositório: Quando você inicia um novo projeto, muitas vezes deseja controlar suas versões usando o Git. O comando git init é usado para começar esse controle de versão. Ele cria uma pasta oculta chamada **.git** no diretório onde é executado, que é onde o Git armazena todos os metadados e históricos de versão do seu projeto.

- Configuração do Ambiente de Desenvolvimento: Quando você executa **git init**, o Git configura seu ambiente de desenvolvimento para que ele esteja pronto para o controle de versão. Isso inclui a criação de arquivos e pastas especiais necessários para funcionamento do Git, como o diretório **.git**.

- Registro de Mudanças: Uma vez que o repositório Git é inicializado com **git init**, você pode começar a registrar as mudanças no seu projeto usando comandos como **git add** e **git commit**.

- Histórico de Versão: O Git rastreia todas as alterações que você faz no seu projeto ao longo do tempo. Cada vez que você faz um commit, uma nova versão do seu projeto é criada e armazenada no repositório Git. Isso permite que você reverta para versões anteriores do seu projeto, veja o histórico de alterações e trabalhe em colaboração com outros desenvolvedores.

| Comandos | Resumos |
|-------|-----------|
|git init ||O comando git init cria um novo repositório Git vazio ou converte um diretório existente em um repositório Git, preparando-o para controle de versão. |

## 👨‍🧑‍ Git Clone

-  O comando git clone é usado para criar uma cópia exata de um repositório Git existente em um novo diretório local. Ele copia todos os arquivos, histórico de commits e branches do repositório remoto para o seu computador, permitindo que você trabalhe com o código e contribua para o projeto.

```
git clone https://github.com/murilosolino/repo_test.git

``` 

## 💻 Git remote add origin 

- Este comando é responsável por conectar seu repositório local ao repositório remoto. Permitindo que você interaja com esse repositório remoto usando o alias "origin" em outros comandos Git.

- Adição de um Repositório Remoto: Quando você clona um repositório Git usando git clone, automaticamente, o Git configura um repositório remoto padrão chamado "origin" para o repositório do qual você clonou. Isso permite que você envie suas alterações de volta para o repositório original. No entanto, se você criou um novo repositório local ou deseja adicionar um repositório remoto diferente, precisa usar o comando git remote add para configurar um novo repositório remoto.

 - Especificar o Nome e a URL do Repositório Remoto: Quando você usa git remote add origin, você está especificando o nome do repositório remoto (nesse caso, "origin") e a URL do repositório remoto ao qual deseja se conectar. A URL normalmente aponta para um serviço de hospedagem de repositórios Git, como GitHub, GitLab ou Bitbucket.

 - Facilitar a Interação com o Repositório Remoto: Após adicionar um repositório remoto com git remote add origin, você pode usar esse alias ("origin") em outros comandos Git para se referir ao repositório remoto. Por exemplo, ao enviar suas alterações para o repositório remoto, você pode usar **git push origin**.

```
git remote add origin https://github.com/murilosolino/repo_test.git

``` 
## 📊 Git status

 - O comando **git status** é usado para mostrar o estado atual do seu repositório Git local em relação ao repositório remoto e ao seu ambiente de trabalho. Ele fornece informações sobre quais arquivos foram modificados, quais arquivos estão prontos para serem confirmados (staged),a branch que você está trabalhandoe e se há algo a ser enviado para o repositório remoto.

- Visualiza o status da área de preparação

 ```
git status

``` 

## ➕ Git add
 - O comando git add é usado para adicionar alterações específicas dos arquivos no seu diretório de trabalho ao chamado "área de preparação" (staging area), preparando-os para serem incluídos no próximo commit. Isso significa que você está selecionando quais alterações deseja incluir no próximo snapshot do seu projeto.

 - Adicionando um arquivo específico:
  ```
git add README.md

```
- Adicionando arquivos em geral:

```
git add .

```

## ✅ Git commit 
- O **git commit** é usado para confirmar as alterações preparadas na área de preparação, criando um commit permanente no histórico do seu projeto Git. Cada commit é acompanhado de uma mensagem descritiva e representa uma versão específica do seu projeto em um determinado ponto no tempo.

```
git commit -m "mensagem do commit"

```
- Após realizar o commit pode-se utilizar o comando **git log** para obter as informaçõessobre o mesmo.

## ↗️ Git push

- O comando git push é reposnsável por enviar os commits para o repositório remoto. O comando precede os alias do servidor e da branch trabalhada.

```
git push origin main

```

## 🔙 Desfazendo Alterações no Repositóro Local 

- Caso o comando tenha incializado o versionamento através do comando git init no diretório incorreto podemos utilizar o seguinte comando para remover o versionamento.

```
rm -rf .git

```
 - Caso seja necessário restaurar algum arquivo após alguma modificação o seguinte comando pode ser aplicado. Este comando descarta todas as alterações realizadas localmente.    

```
git restore nomedoarquivo.extensao

```

 - Para alterar as mensagens do último commit usamos o seguinte comando Git
 ```
git commit --amend -m "nova mensagem"

```

- Para remover arquivos da  área de preparação é usado:

 ```
git restore --stage diretortio/nomedoraquivo.extensao

```

### 🔙 Git reset

 Para desfazer um commit podemos usar o git reset. O comando **git reset** é uma ferramenta poderosa do Git usada para desfazer alterações em um repositório.

  - É importante notar que o git reset é uma operação destrutiva, especialmente quando usado com as opções **--hard**, pois pode fazer com que você perca permanentemente as alterações. Portanto, é recomendado usar com cautela e sempre verificar o estado do seu repositório antes de executar o comando.

     - Para utilizar o reset precisamos passar o código do commit que desejamos resetar (Mantendo as alterações dos commits até o commit especificado, movendo-os de volta para o stage.) e conseguimos encontralo através do comando **git log**.

| Comandos | Resumos |
|-------|-----------|
|git reset --soft 0a00bd523652cc405bd45c0e07873aa3d229411e |**SOFT** mantém as alterações dos commits até o commit especificado, movendo-os de volta para o stage.|
|git reset --mixed 0a00bd523652cc405bd45c0e07873aa3d229411e |**MIXED** remove as alterações dos commits até o commit especificado, movendo-as de volta para o diretório de trabalho.
|git reset --hard 0a00bd523652cc405bd45c0e07873aa3d229411e|**HARD** remove completamente as alterações dos commits até o commit especificado, resetando o repositório ao estado exato em que estava naquele commit.

## 📬 Git pull

  - O comando git pull é usado para atualizar o seu repositório local com as alterações do repositório remoto. Ele combina dois outros comandos do Git: git fetch e git merge. Aqui está uma explicação detalhada do git pull:

- **git fetch**: Antes de mesclar quaisquer alterações, o git pull começa realizando um git fetch, que busca todas as atualizações do repositório remoto para o seu repositório local. Isso inclui informações sobre novas branches, novos commits e outras alterações no repositório remoto.
  
- **Mesclagem (Merge)**: Após o git fetch, o git pull automaticamente mescla (merge) as alterações recuperadas do repositório remoto com a sua branch local atual. Se houver conflitos de merge, você precisará resolvê-los manualmente antes que o merge seja concluído.
  
- Então, em resumo, o **git pull** é uma combinação dos comandos git fetch e git merge, usada para buscar as atualizações mais recentes do repositório remoto e mesclá-las automaticamente com a sua branch local atual. Isso garante que o seu repositório local esteja sempre atualizado com as últimas alterações feitas por outros colaboradores no repositório remoto.

## 🔀 Branch 

- ⚠️ Branches (ramificações) no Git são linhas de desenvolvimento separadas que permitem que você trabalhe em diferentes recursos ou versões do seu projeto simultaneamente. Cada branch representa uma versão independente do seu repositório, onde você pode fazer alterações sem afetar o código em outras branches.

- ⚠️ Branch Padrão (Default): Quando você inicia um repositório Git, é criada automaticamente uma branch principal chamada "master".

### ▶️ Criando Branches

-  Você pode criar novas branches a partir da branch atual usando o comando **git checkout -b nome-da-branch** 
  
 ```
git checkout -b branch-teste

```

### 🔃 Alternando entre Branches

- Você pode alternar entre branches existentes usando o comando **git checkout nome-da-branch.** Isso muda seu diretório de trabalho para a branch especificada.

```
git checkout branch-teste

```

### ❌ Apagando uma Branch

- Você pode excluir brancs atraves do comando **git branch -d nome da branch** isso remove a branch localmente
-  Se a branch não tiver sido mesclada em outra branch, você precisará usar **git branch -D nome-da-branch** para forçar a exclusão.

```
git branch -d branch-teste (exclui localmente)

git branch -D branch-teste (força a exclusão)
```

### 🔀 Mesclando Branchs

- Mesclagem (Merge): Quando você termina o trabalho em uma branch e deseja incorporar suas alterações de volta à branch principal (ou a outra branch), você pode fazer uma operação de **merge**. Isso combina as alterações feitas em uma branch com outra. O comando **git merge nome-da-branch** é usado para mesclar a branch passada no comando com a branch atual.

```
git merge nome-da-branch

```

### 🔎 Rastreando o último commit de cada Branch

- Caso precise identificar o último commit de cada Branch, você pode usar o comando **git branch -v**

```
git branch -v

```

### 🪪 Identificando todas as Branchs do repositório
 
 - Para visualizar todas as branchs presentes no repositório pode-se usar o comando **git branch**.
```
git branch

```

### 🧑‍🤝‍🧑 Clonando Branchs 

- Para clonar uma branch específica apenas do repositório remoto para o local podemos utilizar o seguinte comando:

```
git clone url --branch nome-da-branch --single-branch

```

### 🆎 Trabalhando com diferenças

| Comandos | Resumos |
|--------|------------|
|git fetch origin main | Baixa as alterações do repositório remoto mas não mescla com o local|
| git diff main origin | Visualiza as diferenças entre o local e o remoto após baixar com git fetch|
|git merge origin/main | Usado para atualizar o repositório local com as diferenças baixadas do repositório remoto|



