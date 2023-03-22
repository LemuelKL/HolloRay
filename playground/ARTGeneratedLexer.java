import java.io.FileNotFoundException;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.*;
import uk.ac.rhul.cs.csle.art.v3.lex.*;
import uk.ac.rhul.cs.csle.art.v3.manager.*;
import uk.ac.rhul.cs.csle.art.v3.manager.grammar.*;
import uk.ac.rhul.cs.csle.art.v3.manager.mode.*;
import uk.ac.rhul.cs.csle.art.util.*;
import uk.ac.rhul.cs.csle.art.util.text.*;
import uk.ac.rhul.cs.csle.art.v3.value.*;
import uk.ac.rhul.cs.csle.art.term.*;
import uk.ac.rhul.cs.csle.art.value.*;
/*******************************************************************************
*
* ARTGeneratedLexer.java
*
*******************************************************************************/
@SuppressWarnings("fallthrough") public class ARTGeneratedLexer extends ARTLexerV3 {
public void artLexicaliseBuiltinInstances() throws ARTException {
  artBuiltin_SIMPLE_WHITESPACE();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_SIMPLE_WHITESPACE);
}

public void artLexicalisePreparseWhitespaceInstances() throws ARTException {
  artBuiltin_SIMPLE_WHITESPACE();
}

};
