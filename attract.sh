#!/bin/sh

cparg=".:art.jar:guava-31.1-jre.jar"

javac --add-modules javafx.controls -cp $cparg ValueUserPlugin.java

java -cp $cparg uk.ac.rhul.cs.csle.art.v3.ARTV3 $1.art
javac -Xlint -cp $cparg ARTGeneratedParser.java ARTGeneratedLexer.java
java -Dprism.forceGPU=true --add-modules javafx.controls -cp $cparg ARTTest $1.str +phaseAG
