#!/bin/sh
echo "** miniSyntax"
./parse.sh miniSyntax
echo "** miniSyntaxRDT"
./parse.sh miniSyntaxRDT
echo "** miniCalc"
./parse.sh miniCalc
echo "** miniAssign"
./parse.sh miniAssign
echo "** miniIf"
./parse.sh miniIf
echo "** miniWhile"
./parse.sh miniWhile
echo "** miniCall"
./parse.sh miniCall
echo "** miniMusic"
./music.sh

