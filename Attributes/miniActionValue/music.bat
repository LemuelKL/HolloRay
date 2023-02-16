rem Change the next line to point at the directory containing art.jar
set arthome=../..

call clean

java -classpath %arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 miniMusic.art
javac -Xlint -classpath .;%arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java MiniMusicPlayer.java Scale.java Chord.java
java -classpath .;%arthome%/art.jar ARTTest miniMusic.str +phaseAG



