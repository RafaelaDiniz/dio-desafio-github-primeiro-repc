![Imagem logo git](./../Imagens/logo_git.jpg)
# *Comandos Git*

## *Git status*

Exibi as condições do diretório de trabalho e da área de staging.

Em outras palavras, ele permite inspecionar quais alterações foram despreparadas, quais não foram e quais arquivos não estão sendo monitorados pelo Git. 

Ao executar o comando git status, é possível obter o status completo do repositório (diretório onde os arquivos do seu projeto serão armazenados).

## *s = !git status -s*

Mas ao adotar o parâmetro -s no final do atalho criado, cria-se um status resumido, resultando em maior dinamismo.

## Git Commits

Commit = conjunto de alterações feitas em um projeto. 

*Git add --all*
Adiciona todos os arquivos para o staged de mudanças 

Utilizar *&&* para adcionar commit e a mensagem simultaneamente.
EX.: c = !git add --all && git commit -m

*Git commit -m*
commit com o parâmetro –m, que permite incluir a mensagem descritiva do nosso commit.

*Git add [nome do arquivo] e na sequencia git commit -m “[Mensagem Descritiva]” 
Para incluir arquivos individualmente no commit.

*Git Log*

permite ver o histórico de commits ou um específico 

utilizaremos o parâmetro –prety=format: que permitirá customizarmos a apresentação de nossos logs a partir do atalho que criarmos, com algumas opções específicas:

%h: o percentual com a letra h minúscula irá apresentar o hash reduzido do commit;
%d: o percentual com a letra d minúscula irá mostrar a branch e também a tag do commit (caso exista);
%s: o percentual coma letra s minúscula (de subject) irá demonstrar a mensagem do commit;
%cn: nome da pessoa que realizou o commit;
%cr: a data relativa do commit.
Também utilizaremos a opção de utilizar cores diferentes para cada coluna, o que facilita a visualização, utilizando o parâmetro % com a letra C maiúscula (%C) seguido da cor que desejamos entre parênteses (blue).

Ex.: l = !git log --pretty=format:'%C(blue)%h%C(red)%d %C(white)%s - %C(cyan)%cn, %C(green)%cr'

## *Git Init*

Cria um repositório vazio ou transforma uma pasta que você já tem e que não está com controle de versão em um repositório

## *Git clone*

baixar o código-fonte existente de um repositório remoto 

HTTPS : *git clone <https://url-do-link>*

Se você quiser desvincular a sua cópia do original, rode o comando abaixo:

*git remote rm origin*

## *Git branch*

Branch pode ser usado para três finalidades diferentes: criar, listar e excluir ramificações. Veja, na sequência, como trabalhar com cada uma delas.
Para criar uma nova branch local, digite:

*git branch <nome-da-branch>*

Este comando criará uma branch local. Para upar a nova branch para o repositório remoto, você precisa usar o seguinte comando:

*git push -u <remote> <nome-da-branch>*

Para ver as ramificações, por sua vez, use:

git branch --list

para deletar uma *branch

git branch -d <nome-da-branch>

## *Git checkout*

o principal objetivo do git checkout é ajudar você a mudar de uma branch para outra ou então verificar arquivos e commits:

*git checkout <nome-da-ramificação>*

Criar e ir para um branch de uma vez só:

git checkout -b <nome-da-branch>

## *Git diff*

sua execução realiza uma função de comparação nas fontes de dados Git e mostra quais linhas foram adicionadas e removidas.

## *Git add*

Inclui as alterações de um arquivo em nosso próximo commit.

Para adicionar apenas um arquivo:

*git add <arquivo>*

Para adicionar, de uma vez, todos os arquivos modificados:

*git add -A*

Vale lembrar que o comando git add não altera o repositório e as alterações não são salvas até usarmos o git commit.

## *Git Push*

envia as alterações para o servidor remoto:

*git push <remote> <nome-do-branch>*
No entanto, se seu branch for criado recentemente, você também precisará fazer upload do branch com o seguinte comando:

*git push -u origin <nome-do-branch>*

## *Git pull*

usado para obter atualizações do repositório remoto. 

recebe as atualizações do repositório remoto (git fetch) e aplica imediatamente as alterações mais recentes no seu local (git merge).

*git pull <remote>*

## *Git Revert*

Uma maneira segura de desfazer os commits é usando git revert.

*git revert 'número do hash'*

O número do hash pode ser conseguido pelo comando:

*git log -- oneline*

## *Git merge*

Mescla as branches

*git merge <nome-da-branch>*

## *Git stash*

arquiva as alterações que você fez na cópia de trabalho durante um determinado período para que seja possível retornar a ela mais tarde.

Para salvar as alterações sem commit, basta executar:

*git stash*

Para ver todas as stashes que você guardou, use:

*git stash list* 

aplicar stashes antigos, especificando:

*it stash apply stash@{2}.*


