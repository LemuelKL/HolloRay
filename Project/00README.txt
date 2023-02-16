This directory contains the source files for a MINIATURE version of the project.

--- GOALS ---

The language here is a version of the GCD language extended with a
backend constructor that connects to ValueUserPlugin.user()

The object is to demonstrate these core activities:

A. Writing eSOS rules and interpreting them

B. Connecting eSOS to the TEXT and JavaFX plugins

C. Writing a grammar that parses from external syntax to an internal syntax
   suitable for use with eSOS

D. Writing an attribute grammar to directly interpret the external
syntax, and connecting from attribute grammars to plugins.

Important note:

 these examples are deliberately minimal. Your project languages should be
 significantly richer than the language shown here.

--- IF YOU ARE RUNNING ON Un*x ---

The instructions below are for running the demonstrations on
Windows. If you are running on Un*x:

1. You will need to use commands of the form ./script.sh,
2. Please replace copy commands with cp and replace type commnds with cat.
3. Remember that Un*x is case-sensitive.
4. You may need to run chmod +x on each .sh file to make the scripts executable
5. You may need to run dos2unix on each .sh file to convert to Un*x line ends

--- INSTRUCTIONS FOR RUNNING EXAMPLES ---

1. For the JavaFX examples, you need to locate the module path to your
Java FX modules. On my system it is c:\openJFX\javafx-sdk-14.0.2.1\lib

Edit the files 

\SLELabs\project\buildplugin.bat 

and 

\SLELabs\artfx.bat

and change my module path to your module path

2. Run eSOS without a local plugin

> ..\art eSOS_PiM.art

...

Step 55
  [sequenceDone] rewrites to <backend(__int32(1), __int32(2), __int32(3)), {a=__int32(3), gcd=__int32(3), b=__int32(3)}>
Step 56
Default ValueUserPlugin called with these arguments
__int32(1) which has underlying Java class java.lang.Integer and value 1
__int32(2) which has underlying Java class java.lang.Integer and value 2
__int32(3) which has underlying Java class java.lang.Integer and value 3
  [backend] rewrites to <__string(Adrian)>

3. Copy the example text plugin to ValueUserPlugin.java and compile

>  copy ValueUserPlugin_TEXT.java ValueUserPlugin.java
>  buildPlugin.bat

4. Run eSOS with the compiled text plugin

> ..\art eSOS_PiM.art

...

Step 56
  Rewrite call 234 backend(1, 17, 3), {gcd=3, b=3, a=3}  ->
  -backend  --- backend(_P1, _P2, _P3), _sig -> __user(_P1, _P2, _P3)
__int32(1) which has underlying Java class java.lang.Integer and value 1
__int32(17) which has underlying Java class java.lang.Integer and value 17
__int32(3) which has underlying Java class java.lang.Integer and value 3
  -backend rewrites to "Return value from text example plugin"
  
5. Copy the example Java FX plugin to VAlueUserPlugin.java and compile

>  copy ValueUserPlugin_FX.java ValueUserPlugin.java
>  buildPlugin.bat

6. Run eSOS with the compiled Java FX plugin using the artfx script. 

> ..\artfx eSOS_PiM.art

...

Step 56
  Rewrite call 234 backend(1, 17, 3), {gcd=3, b=3, a=3}  ->
  -backend  --- backend(_P1, _P2, _P3), _sig -> __user(_P1, _P2, _P3)
  -backend rewrites to "Return value from JavaFX example plugin"
  
... and a JavaFX window opens displaying __int32(1)

7. Clean up (which removes the compiled ValueUserPlugin)

>  clean

8. Build a term

>  parse ExtToInt_PiM +showAll

9. Look at the term

>  type term.txt

seq(assign(a, 15), seq(seq(seq(assign(b, 9), while(ne(deref(a), deref(b)), if(gt(deref(a), deref(b)), assign(a, sub(deref(a), deref(b))), assign(b, sub(deref(b), deref(a)))))), assign(gcd, deref(a))), backend(1, 2, 3)))

10. Build and run the Java-native attribute grammar

>  parse.bat Attribute_PiM

** Accept
Default ValueUserPlugin called with 3 arguments
__int32(1) which has underlying Java class java.lang.Integer and value: 1
__int32(17) which has underlying Java class java.lang.Integer and value: 17
__int32(3) which has underlying Java class java.lang.Integer and value: 3
Variables at end of program: {a=3, b=3, gcd=3}

11. Build and run the Value attribute grammar

>  parse AttributeValue_PiM

** Accept
Default ValueUserPlugin called with 3 arguments
__int32(1) which has underlying Java class java.lang.Integer and value: 1
__int32(17) which has underlying Java class java.lang.Integer and value: 17
__int32(3) which has underlying Java class java.lang.Integer and value: 3
Variables at end of program: __map(__binding(__string("a"), __int32(3)),__binding(__string("b"), __int32(3)),__binding(__string("gcd"), __int32(3)))

12. Build and run the Java-native attribute grammar with a JavaFX backend

> copy ValueUserPlugin_FX.java ValueUserPlugin.java
> buildPlugin.bat
> parseFX Attribute_PiM
