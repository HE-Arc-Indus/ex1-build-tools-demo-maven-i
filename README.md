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



















































Créer un fichier pom.xml avec quelque valeur dedans<?xml version="1.0" encoding="UTF-8"?>

```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

<modelVersion>4.0.0</modelVersion>
<groupId>ch.hegarc.ig.idl</groupId>
<artifactId>IDL_Serie_2</artifactId>
<version>TestBidule</version>
<packaging>jar</packaging>
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties>

</project>
```
3. Avec le cmd se positionner dans le répertoire ou se trouve les fichiers .java

lancer la commande suivante

```
mvn compile
```

il doit retourner un truc du style[INFO] Scanning for projects...

```
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building IDL_Serie_2 TestBidule
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ IDL_Serie_2 ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\IG15-GonthierC\Cours\620 Systèmes d'information\625-1.1 Industrialisation du logiciel\Ex2\Serie2\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ IDL_Serie_2 ---
[INFO] No sources to compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.521s
[INFO] Finished at: Mon Feb 26 12:27:26 CET 2018
[INFO] Final Memory: 6M/238M
[INFO] ------------------------------------------------------------------------
```

​

sdfsdf

sdfsdf

​

(Cette page est auditée)