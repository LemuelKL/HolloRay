#!/bin/bash

# java -cp ".:../art.jar" uk.ac.rhul.cs.csle.art.ART $1

java -jar art.jar $1 && pdflatex --interaction=batchmode artSpecification.tex && code artSpecification.pdf