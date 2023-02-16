import java.io.FileNotFoundException;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.*;
import uk.ac.rhul.cs.csle.art.v3.lex.*;
import uk.ac.rhul.cs.csle.art.v3.manager.*;
import uk.ac.rhul.cs.csle.art.v3.manager.grammar.*;
import uk.ac.rhul.cs.csle.art.v3.manager.mode.*;
import uk.ac.rhul.cs.csle.art.util.text.*;
import uk.ac.rhul.cs.csle.art.term.*;
import uk.ac.rhul.cs.csle.art.util.bitset.ARTBitSet;
/*******************************************************************************
*
* ARTGeneratedLexer.java
*
*******************************************************************************/
@SuppressWarnings("fallthrough") public class ARTGeneratedLexer extends ARTLexerV3 {
public void artLexicaliseBuiltinInstances() {
  artBuiltin_ID();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_ID);
  artBuiltin_INTEGER();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_INTEGER);
  artBuiltin_REAL();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_REAL);
  artBuiltin_STRING_DQ();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_STRING_DQ);
  artBuiltin_STRING_SQ();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_STRING_SQ);
}

public void artLexicalisePreparseWhitespaceInstances() {
  artBuiltin_COMMENT_BLOCK_C();
  artBuiltin_COMMENT_LINE_C();
  artBuiltin_SIMPLE_WHITESPACE();
}

};
