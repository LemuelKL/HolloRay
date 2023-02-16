#!/bin/bash

java -jar art.jar uk.ac.rhul.cs.csle.art.ART $1 && pdflatex --interaction=batchmode artSpecification.tex && code artSpecification.pdf