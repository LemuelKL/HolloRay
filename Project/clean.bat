@echo off
del term.txt  >nul 2>&1
del *.dot  >nul 2>&1
del *.dot.pdf  >nul 2>&1
del artSpecification.* >nul 2>&1 
del *.class >nul 2>&1
del ARTGeneratedLexer.java >nul 2>&1
del ARTGeneratedParser.java >nul 2>&1
del *.class
move ValueUserPlugin.java ValueUserPlugin.disabled
