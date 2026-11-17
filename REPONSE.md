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
