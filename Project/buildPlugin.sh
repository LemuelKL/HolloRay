#!/bin/bash
javac --module-path /usr/share/openjfx/lib --add-modules javafx.controls -cp ".:../art.jar" ValueUserPlugin.java
