set arthome=..

java -classpath %arthome%\art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 %1.art +osbrd
javac -classpath .;%arthome%/art.jar ARTGeneratedParser.java
java -classpath .;%arthome%/art.jar ARTGeneratedParser %1.str





