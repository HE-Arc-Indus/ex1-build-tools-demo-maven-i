# **Christian Gonthier - 3IGTpart**![](http://bgg.kicks-ass.org/trackacces/parimage.php?image=hearc-long-detoure.png&cours=GES-DP180219-INDUS-serie-1)

## GES-DP180219-INDUS-serie 1

1. Utilisation des outils du JDK : veuillez r�aliser les points suivants ou r�pondre aux questions en utilisant des lignes de commandes uniquement ! Utiliser la documentation Java et Internet, si vous en avez besoin, pour vous aider.

   1. Quelle est la version de Java par d�faut sur votre machine ?

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

   3. Assurez-vous de disposer de Java 8, et de faire en sorte qu�il s�agisse de l�environnement utilis� par d�faut.
      OK (J'ai que du 8)

2. Acceptez le devoir github classroom

3. Vous allez cr�er un petit programme Java � la main, en utilisant uniquement un simple �diteur de texte (notepad++ par exemple). R�f�rez-vous � la documentation des utilitaires Java. N�utilisez que les utilitaires en ligne de commande pour r�aliser les actions de compilation et ex�cution cidessous. 

   1. Cr�ez une classe Java vide (pas d�attribut, uniquement un constructeur sans param�tre) appel�e � Personne �, puis compilez-la avec l�outil javac.

   2. Une fois que votre classe vide se compile, ajoutez-lui les attributs � nom � et � prenom �, avec les getters/setters et le constructeur param�tr� correspondants. Ajoutez-y enfin une m�thode � sePresenter � qui affiche � Bonjour, je m�appelle � suivi du nom complet de la personne dans la console.

   3. Cr�ez une nouvelle classe, appel�e � MesPersonnes �, qui contient une m�thode � main �. Dans cette m�thode, cr�ez quelques instances de personnes, faites des appels � leurs m�thodes, etc.

   4. Compilez et ex�cutez votre programme de test.

   5. Consignez les commandes utilis�es pour les �tapes 1 et 4 dans un fichier texte.
      Mettre toutes les classes dans "Projet\Serie1"
      Se positionner sur "Projet" avec la console 
      �a cr�e les .class

      ```
      javac -cp . Serie1\MesPersonnes.java
      ```

      �a �xecute le programme

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

4. D�posez tous ces fichiers (sources .java, fichiers compil�s et notes) dans le devoir correspondant sur github classroom.

(Cette page est audit�e)