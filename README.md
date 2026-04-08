# trabalho

git config --global user.name "Seu Nome" → define seu nome
git config --global user.email "seu@email.com" → define seu email
📁 Criar e clonar repositórios
git init → inicia um repositório local
git clone <url> → copia um repositório remoto
📌 Controle de mudanças
git status → mostra o estado atual dos arquivos
git add <arquivo> → adiciona arquivo para staging
git add . → adiciona tudo
git commit -m "mensagem" → salva as mudanças
🔍 Histórico
git log → mostra histórico de commits
git log --oneline → versão resumida
🌿 Branches (ramificações)
git branch → lista branches
git branch <nome> → cria nova branch
git checkout <nome> → troca de branch
git checkout -b <nome> → cria e já muda
git merge <branch> → junta branches
🔄 Sincronização com remoto
git remote add origin <url> → conecta repositório remoto
git push origin <branch> → envia alterações
git pull → baixa e mescla alterações
git fetch → busca mudanças sem aplicar
⚠️ Desfazer coisas
git reset <arquivo> → remove do staging
git checkout -- <arquivo> → descarta alterações
git revert <commit> → desfaz commit criando outro
