# **Christian Gonthier - 3IGTpart**![](http://bgg.kicks-ass.org/trackacces/parimage.php?image=hearc-long-detoure.png&cours=GES-DP180219-INDUS-serie-1)

## GES-DP180219-INDUS-serie 1

1. Utilisation des outils du JDK : veuillez réaliser les points suivants ou répondre aux questions en utilisant des lignes de commandes uniquement ! Utiliser la documentation Java et Internet, si vous en avez besoin, pour vous aider.

   1. Quelle est la version de Java par défaut sur votre machine ?

      ```
      C:\Users\christia.gonthier>java -version
      java version "1.8.0_92"
      Java(TM) SE Runtime Environment (build 1.8.0_92-b14)
      Java HotSpot(TM) 64-Bit Server VM (build 25.92-b14, mixed mode)
      ```

   2. Quelles autres versions se trouvent sur votre machine ?
      -jdk1.8.0_45
      -jdk1.8.0_92
      -jdk1.8.0_131
      -jre1.8.0_45

   3. Assurez-vous de disposer de Java 8, et de faire en sorte qu’il s’agisse de l’environnement utilisé par défaut.
      OK (J'ai que du 8)

2. Acceptez le devoir github classroom

3. Vous allez créer un petit programme Java à la main, en utilisant uniquement un simple éditeur de texte (notepad++ par exemple). Référez-vous à la documentation des utilitaires Java. N’utilisez que les utilitaires en ligne de commande pour réaliser les actions de compilation et exécution cidessous. 

   1. Créez une classe Java vide (pas d’attribut, uniquement un constructeur sans paramètre) appelée « Personne », puis compilez-la avec l’outil javac.

   2. Une fois que votre classe vide se compile, ajoutez-lui les attributs « nom » et « prenom », avec les getters/setters et le constructeur paramétré correspondants. Ajoutez-y enfin une méthode « sePresenter » qui affiche « Bonjour, je m’appelle » suivi du nom complet de la personne dans la console.

   3. Créez une nouvelle classe, appelée « MesPersonnes », qui contient une méthode « main ». Dans cette méthode, créez quelques instances de personnes, faites des appels à leurs méthodes, etc.

   4. Compilez et exécutez votre programme de test.

   5. Consignez les commandes utilisées pour les étapes 1 et 4 dans un fichier texte.
      Mettre toutes les classes dans "Projet\Serie1"
      Se positionner sur "Projet" avec la console 
      ça crée les .class

      ```
      javac -cp . Serie1\MesPersonnes.java
      ```

      ça éxecute le programme

      ```
      java Serie1/MesPersonnes
      ```

      Exemple :

      ```
      PS C:\WINDOWS\system32> cd C:\tmp
      PS C:\tmp> javac -cp . Serie1\MesPersonnes.java
      PS C:\tmp> java Serie1/MesPersonnes
      Bonjour, je m'appel otot toto.
      Bonjour, je m'appel utut tutu.
      PS C:\tmp>
      ```

4. Déposez tous ces fichiers (sources .java, fichiers compilés et notes) dans le devoir correspondant sur github classroom.

(Cette page est auditée)