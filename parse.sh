#!/bin/sh

./clean.sh > /dev/null 2>&1

java -cp ".:../art.jar" uk.ac.rhul.cs.csle.art.v3.ARTV3 $1.art
javac -Xlint -cp ".:../art.jar" ARTGeneratedParser.java ARTGeneratedLexer.java
java -cp ".:../art.jar" ARTTest $2 $3 $4 $5 $6 $7 $8 $9 $1.str +phaseAG
