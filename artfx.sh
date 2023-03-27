#!/bin/bash

java -Dprism.forceGPU=true --add-modules javafx.controls -cp ".:art.jar:guava-31.1-jre.jar" uk.ac.rhul.cs.csle.art.ARTFX eSOSRules.art term.txt
