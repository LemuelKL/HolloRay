#!/bin/sh
./clean.sh
java -classpath ".:../art.jar" uk.ac.rhul.cs.csle.art.v3.ARTV3 $1.art +osbrd
javac -classpath ".:../art.jar" ARTGeneratedParser.java
java -classpath  ".:../art.jar" ARTGeneratedParser $1.str
