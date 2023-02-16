#!/bin/sh
java -Dprism.forceGPU=true --module-path /usr/share/openjfx/lib --add-modules javafx.controls -cp .:../art.jar uk.ac.rhul.cs.csle.art.ARTFX $1

