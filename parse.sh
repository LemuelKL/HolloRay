#!/bin/sh

./clean.sh > /dev/null 2>&1

cparg=".:art.jar:guava-31.1-jre.jar"

java -cp $cparg uk.ac.rhul.cs.csle.art.v3.ARTV3 $1.art
javac -Xlint -cp $cparg ARTGeneratedParser.java ARTGeneratedLexer.java
java -cp $cparg ARTTest $1.str +phaseAG
