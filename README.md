# HolloRay

## Important resources

- `informalAndInternal.txt`
- `eSOSRules.art`
- `ValueUserPlugin.java`
- `guava-31.1-jre.jar`
- `dev.sh`
- `programs/` contains test programs in external syntax for External-to-Internal translation and eSOS rules.
- `terms/` contains test terms in internal syntax for eSOS rules.

## Deliverables names

1. eSOSRules.art
2. ExtToInt.art
3. AttrAct.art
4. ValueUserPlugin.java
5. programs/* and AttrAct.str

## [eSOS] How to test run `programs/*`

1. Run `./dev.sh <path_to_program>`, try `./dev.sh programs/3nplus1`. This will translate the external syntax to the internal syntax and then run with the eSOS rules. It also build the plugin behind the scene. Note that it requires the intermediate file `term.txt`.
2. Parse tree will show in the terminal, then followed by the internal syntax of the program.
3. eSOS rewritting begins. Trace level is set to `1` by default, can be changed in `dev.sh`. 
4. Terminal output from the Java plugin is coloured for better readability.

## [Interpreter] How to test run

```bash
./attract.sh AttrAct
```

## External Syntax design
I like the syntax of C very much. I think it is very intuitive and easy to read. I know I should get creative with the syntax, but my personal liking of C syntax is too strong.

## Features Highlight for External-to-Internal-then-Rewritten Syntax
* Common comparators and logical operators are implemented
* Nested brackets evaluation: `println(!(1 == 1))`
* Compound assignment: `x += 1`
* Flexible number of arguments, demonstrated by `println()`
* Flexible and mixable argument types, demonstrated by `println()`
* Optional `else` for `if`
* Control flows include for-loop and while-loop
* For-loop in theory can take a valid HolloRay program as its first and third argument
* Dot notation for carrying out JavaFX operations on dereferenced 3D shape variables, e.g. `myBox.scale(1.5, 1.0, 3.0)`

## Features Highlight for the Interpreter, on top of the above
* Optional body for for-loop and while-loop, useful for minimal predicates that have side effects
* Optional 1st and 3rd argument for for-loop
* Procedure definition and invoking
* Compound assignment with default value 0 for undefined variables

## Bugs
- The attribute action interpreter refuese to work with my plugin's JavaFX. Any way of invoking `new State()` or `new Scene()` would result in null pointer exception. I am guessing this is because JavaFX (and the ValueUserPlugin as a whole ) did not expect to be inside of another instance? (whatever Java host ART is calling it from, maybe the generated Java code?). JavaFX seems to be very sensitive to its runtime environment. From what I read online, it expects to run as a immediate, stnadalone application directly on top of the OS.
- As a result due to the above point, I am unable to test the dot notation for JavaFX operations in the attribute action interpreter.

## Interesting findings and reflections
- eSOS rules do not scale very well. Having the need to account for different variable types, and the need to take care of resolving expressions into literal values are verbose.
- Compared to the parser, the attributes and actions syntax is much more intuitive for me. Expressing optional arguments and flexible number of arguments is much easier, as evidenced by the amount of work required to realise the same features like `println()`.
- I genuinely hope there is a better way of thinking about the integer suffix notations. Perhaps using double underscores, then the integer would improve readability.
- Working with integers vs reals/doubles is trickier than I thought. I failed to come up with a systematic way of quickly incorporating types into both the parser and the interpreter. It seems there are just too many edge cases to handle for each type, for each rule.
- I am not really interested in the JavaFX part, but I am glad I got to learn about it. I spent most of my time on the parser and the interpreter to explore the language design space.
- I need to do double escapes for the print statements in the actions, like `System.out.println("Hello World!\\n")`. I guess this is because this string is first translated into a Java interpreter, during which one level of escape is lost.
- I am too stupid to figure out how to omit the need of a `;` for the 3rd argument for for-loops. Is there a concise way of doing this without writing a bunch of hardcoded hacks?
- I regret choosing JavaFX as my domain. The installation is of JavaFX is a pain, and many online resources are outright wrong or dating back to 2010. Reasoning 3D objects is also not very intuitive. Additionally, there are more examples for music in the textbook.
