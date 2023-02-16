@echo off
rem Change the next line to point at the directory containing art.jar
set arthome=..

java -classpath %arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 %1.art
javac -Xlint -classpath .;%arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java
java --module-path "c:\openJFX\javafx-sdk-14.0.2.1\lib" --add-modules javafx.controls -cp .;%arthome%/art.jar ARTTestFX %2 %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%1.str' +phaseAG
