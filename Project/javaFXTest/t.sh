#!/bin/sh

javac --module-path ./../../javafx/lib --add-modules javafx.controls $1.java
java -Dprism.forceGPU=true --module-path ./../../javafx/lib --add-modules javafx.controls $1
