# **Christian Gonthier - 3IGTpart**![](http://bgg.kicks-ass.org/trackacces/parimage.php?image=hearc-long-detoure.png&cours=GES-DP180219-INDUS-serie-2)

## INDUS-serie 2

1. Régler ses variables d'envrionnements

MAVEN_HOME=répertoire ou se trouve maven.cmd
et le PATH ...;%MAVERN_HOME%/bin;...

2. Créer son environnement de travail

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

3. Mettre son code

A partir de là nous pouvons retirer le fichier MesPersonnes/src/main/java/Serie2/App.java et remplacer par les fichiers créer pour la série 1 (MesPersonnes.java et Personne.java).

4. Le rendre executable

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












​

(Cette page est auditée)