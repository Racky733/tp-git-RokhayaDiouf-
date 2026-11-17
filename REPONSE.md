Reponses.md

Q1: Dans quel fichier l'option --global enregistre-t-elle la configuration ? Quelle différence avec une configuration sans --global , faite dans un dépôt (fichier .git/config)?
==> --global enregistre la configuration dans ~/.gitconfig qui est le dossier personnel de l'utilisateur et s'applique aussi a tous les depots. 	
	Sans --global la configuration va dans .git/config et ne vaut que pour ce depot .

Q2:Pourquoi l'email configuré doit-il correspondre à celui du compte GitHub ?
==> Parce que sinon les commits n'appraitront pas dans le profil GitHub.

Q3. Que contient le dossier .git ? Que perdrait-on en le supprimant ?
==> Le fichier .git contient tout l'historique, les commits , les fichiers , les branches etc ...
 Le supprimer fera perdre tout l'historique , il ne restera plus que les fichiers actuels et ce ne sera donc plus un depot.

Q4. Quelle est la différence entre git diff et git diff --staged ?
==> git diff compare le repertoire de travail a l'index alors qie git diff --staged compare l'index au dernier commit

Q5. Que représente la suite de caractères au début de chaque ligne de git log --oneline ?
==> C'est l'identifiant du commit

Q6. Pourquoi ne versionne-t-on pas le fichier compilé Main.class? En quoi .gitignore simplifie-t-il l'usage de git add .?
==> On ne versionne pas Main.class parecqu'il peu etre recreer par Main.java donc il alourdi le depot et cree des conflits inutiles.
    .gitignore lit ces fichiers donc git add . ne les ajoute pas.

Q7. Quelle différence entre git revert et git reset ? Lequel utiliser sur une branche déjà partagée sur GitHub, et pourquoi ?
==> git revert cree un nouveau commit qui annule le commit precedent alors que git reset deplace la branche en arriere et reecrit
    l'historique.Sur une branche deja partage , on utilise revert pour ne pas casser l'historique des autres.

Q8. Que signifie HEAD~1 ? Que veut dire le message « detached HEAD » vu à l'étape 3.8 ?
==> HEAD~1 designe le commit parent de HEAD. « detached HEAD » signifie que HEAD pointe directement sur un commit et non sur une branche .
