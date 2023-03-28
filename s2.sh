#!/bin/bash

output=$(./parse.sh ExtToInt +showAll)

if echo "$output" | grep -q '** Reject'; then
  echo "$output"
  exit 1
fi

echo "$output"

file1_contents=$(cat eSOSRules.art)
file2_contents=$(cat term.txt)
temp_file=$(mktemp)
echo "$file1_contents !trace 1 !try $file2_contents, __map" > "$temp_file"

./buildPlugin.sh

java -Dprism.forceGPU=true --add-modules javafx.controls -cp ".:art.jar:guava-31.1-jre.jar" uk.ac.rhul.cs.csle.art.ARTFX "$temp_file" 2>/dev/null

rm "$temp_file"
