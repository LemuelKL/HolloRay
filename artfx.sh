#!/bin/bash

java -Dprism.forceGPU=true --add-modules javafx.controls -cp ".:art.jar" uk.ac.rhul.cs.csle.art.ARTFX $1
