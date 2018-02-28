# Christian Gonthier 

# Joyce Dubois

# Talha Sabir

# **3IGTpart**![](http://bgg.kicks-ass.org/trackacces/parimage.php?image=hearc-long-detoure.png&cours=GES-DP180219-INDUS-serie-2)

## INDUS-serie 2

### Régler ses variables d'envrionnements

MAVEN_HOME=répertoire au dessus d'où se trouve maven.cmd

et le PATH ...;%MAVERN_HOME%/bin;...

### Créer son environnement de travail

se placer dans son répertoire qui contient tout les projets et taper la commande suivante.

```
mvn archetype:generate -DgroupId=Serie2 -DartifactId=MesPersonnes -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Série2 = est le nom de package
MesPersonnes = est le nom de projet

Il va créer l'arborescence suivante

```
--MesPersonnes
----src
------main
--------java
----------Serie2
------------App.java
------test
--------java
----------Serie2
------------AppTest.java
----pom.xml
```

Au passage nous pouvons remarquer qu'il a créer un environnement de test Junit par la même occase.

### Mettre son code

A partir de là nous pouvons retirer le fichier MesPersonnes/src/main/java/Serie2/App.java et remplacer par les fichiers créer pour la série 1 (MesPersonnes.java et Personne.java).

### Le rendre executable

Il faut modifier le fichier pom.xml, rajouter ce qui suit :

	    ...
	    <url>http://maven.apache.org</url>
	    <build>
	        <plugins>
	            <plugin>
	                <groupId>org.apache.maven.plugins</groupId>
	                <artifactId>maven-jar-plugin</artifactId>
	                <configuration>
	                    <archive>
	                        <manifest>
	                            <mainClass>Serie2.MesPersonnes</mainClass>
	                        </manifest>
	                    </archive>
	                </configuration>
	            </plugin>
	        </plugins>
	    </build>
	    <dependencies>
	    ...
Serie2.MesPersonnes sont le package et la classe principale qu'il faut lui indiquer

### le builder

Executer à la racine du projet (répertoire MesPersonnes)

```
mvn clean-package
```

il créera le .jar avec les infos indiqué dans le pom.xml et plein d'autre répertoire que je ne vais pas énuméré ici.

### Executer son fichier jar

Il faut aller dans Série2/target/

```
java -jar "MesPersonnes-1.0-SNAPSHOT.jar"
```



(Cette page est auditée)