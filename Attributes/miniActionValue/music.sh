#!/bin/sh
./clean.sh

java -classpath ".:../../art.jar" uk.ac.rhul.cs.csle.art.v3.ARTV3 miniMusic.art 
javac -classpath ".:../../art.jar" ARTGeneratedParser.java ARTGeneratedLexer.java MiniMusicPlayer.java  Scale.java Chord.java
java -classpath ".:./../art.jar" ARTTest miniMusic.str +phaseAG


