@echo off

del ARTGeneratedLexer.java >nul 2>&1
del ARTGeneratedParser.java >nul 2>&1

java -classpath %arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 cava.art
javac -Xlint -classpath .;%arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java
java -classpath .;%arthome%/art.jar ARTTest %2 %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%1' +phaseAG

