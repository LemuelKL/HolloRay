#!/bin/bash

output=$(./parse.sh ExtToInt +showAll)

if echo "$output" | grep -q '** Reject'; then
  echo "$output"
  exit 1
fi

# Read the contents of the files into variables
file1_contents=$(cat eSOSRules.art)
file2_contents=$(cat term.txt)

# Concatenate the contents of the variables and write to a temporary file
temp_file=$(mktemp)
echo "$file1_contents !try $file2_contents, __map" > "$temp_file"

# Pass the name of the temporary file as an argument to the java command
java -jar art.jar "$temp_file"

# Remove the temporary file
rm "$temp_file"
