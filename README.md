# HolloRay

## Important resources

- `informalAndInternal.txt`
- `eSOSRules.art`
- `ValueUserPlugin.java`
- `guava-31.1-jre.jar`
- `dev.sh`
- `programs/` contains test programs in external syntax for External-to-Internal translation and eSOS rules.
- `terms/` contains test terms in internal syntax for eSOS rules.

## How to test run `programs/*`

1. Run `./dev.sh <path_to_program>`, try `./dev.sh programs/3nplus1`. This will translate the external syntax to the internal syntax and then run with the eSOS rules. It also build the plugin behind the scene. Note that it requires the intermediate file `term.txt`.
2. Parse tree will show in the terminal, then followed by the internal syntax of the program.
3. eSOS rewritting begins. Trace level is set to `1` by default, can be changed in `dev.sh`. 
4. Terminal output from the Java plugin is coloured for better readability.
