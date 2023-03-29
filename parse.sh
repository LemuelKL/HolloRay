#!/bin/sh

./clean.sh > /dev/null 2>&1

java -cp ".:art.jar" uk.ac.rhul.cs.csle.art.v3.ARTV3 ExtToInt.art
javac -Xlint -cp ".:art.jar" ARTGeneratedParser.java ARTGeneratedLexer.java
java -cp ".:art.jar" ARTTest $1.str +phaseAG
