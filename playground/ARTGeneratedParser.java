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
* ARTGeneratedParser.java
*
*******************************************************************************/
@SuppressWarnings("fallthrough") public class ARTGeneratedParser extends ARTGLLParserHashPool {
  private String artInputString; // This is used in the MGLL generated parser instead of artlexer.artinputString
  private static boolean[] ARTSet1;
  private static boolean[] ARTSet2;
  private static boolean[] ARTSet3;
  private static boolean[] ARTSet4;
  private static boolean[] ARTSet5;
  private static boolean[] ARTSet6;
  private static boolean[] ARTSet7;
  private static boolean[] ARTSet8;
  private static boolean[] ARTSet9;
  private static boolean[] ARTSet10;
  private static boolean[] ARTSet11;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_SIMPLE_WHITESPACE = 1;
  public static final int ARTTS__AT = 2;
  public static final int ARTTS_a = 3;
  public static final int ARTTS_b = 4;
  public static final int ARTTS_x = 5;
  public static final int ARTX_EPSILON = 6;
  public static final int ARTL_ART_S = 7;
  public static final int ARTL_ART_X = 8;
  public static final int ARTL_ART_S_1 = 9;
  public static final int ARTL_ART_S_2 = 10;
  public static final int ARTL_ART_S_3 = 11;
  public static final int ARTL_ART_S_4 = 12;
  public static final int ARTL_ART_S_5 = 13;
  public static final int ARTL_ART_S_6 = 14;
  public static final int ARTL_ART_S_7 = 15;
  public static final int ARTL_ART_S_8 = 16;
  public static final int ARTL_ART_S_9 = 17;
  public static final int ARTL_ART_S_10 = 18;
  public static final int ARTL_ART_S_11 = 19;
  public static final int ARTL_ART_S_12 = 20;
  public static final int ARTL_ART_X_13 = 21;
  public static final int ARTL_ART_X_14 = 22;
  public static final int ARTL_ART_X_15 = 23;
  public static final int ARTL_ART_X_16 = 24;
  public static final int ARTL_ART_X_17 = 25;
  public static final int ARTL_ART_X_18 = 26;
  public static final int ARTL_ART_X_19 = 27;
  public static final int ARTL_ART_X_20 = 28;
  public static final int ARTL_ART_X_21 = 29;
  public static final int ARTL_ART_X_22 = 30;
  public static final int ARTX_DESPATCH = 31;
  public static final int ARTX_DUMMY = 32;
  public static final int ARTX_LABEL_EXTENT = 33;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_S() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal S production descriptor loads*/
      case ARTL_ART_S: 
        if (ARTSet4[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_S_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_S_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal S: match production*/
      case ARTL_ART_S_2: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_b, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_S_4, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal S: match production*/
      case ARTL_ART_S_6: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_a, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_S_8, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_S_10, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_X; return; }
      case ARTL_ART_S_10: 
        /* Nonterminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_S_12, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_X() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal X production descriptor loads*/
      case ARTL_ART_X: 
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_X_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_X_20, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal X: match production*/
      case ARTL_ART_X_14: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_x, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_X_16, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_X_18, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_X; return; }
      case ARTL_ART_X_18: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal X: match production*/
      case ARTL_ART_X_20: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_X_22, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 9;
    artLexicaliseForV3GLL(artInputString, null);
    artLexCompleteTime = artReadClock();
    artDummySPPFNode = artFindSPPFInitial(ARTL_DUMMY, 0, 0);
    artCurrentSPPFNode = artDummySPPFNode;
    artRootGSSNode = artFindGSS(ARTL_EOS, 0, 0, 0);
    artCurrentGSSNode = artRootGSSNode;
    artCurrentRestartLabel = artStartSymbolLabel;
    artCurrentInputPairIndex = 0;
    artCurrentInputPairReference = 0;
    while (true)
      switch (artlhsL[artCurrentRestartLabel]) {
        case ARTL_ART_S: 
          ARTPF_ART_S();
          break;
        case ARTL_ART_X: 
          ARTPF_ART_X();
          break;
        case ARTX_DESPATCH: 
          if (artNoDescriptors()) { 
            artCheckAcceptance();
            artParseCompleteTime = artReadClock();
            return;
           }
          artUnloadDescriptor();
      }
  }

  public void ARTSet1initialise() {
    ARTSet1 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet1, 0, artSetExtent, false);
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTS__AT] = true;
    ARTSet7[ARTTS_x] = true;
    ARTSet7[ARTL_ART_X] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTX_EOS] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS_x] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTS_a] = true;
    ARTSet2[ARTTS_b] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS__AT] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTS_a] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
    ARTSet4[ARTTS_b] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTS_x] = true;
    ARTSet8[ARTL_ART_X] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS_x] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet7initialise();
    ARTSet3initialise();
    ARTSet11initialise();
    ARTSet5initialise();
    ARTSet2initialise();
    ARTSet9initialise();
    ARTSet6initialise();
    ARTSet4initialise();
    ARTSet8initialise();
    ARTSet10initialise();
  }

  public void artTableInitialiser_ART_S() {
    artLabelInternalStrings[ARTL_ART_S] = "S";
    artLabelStrings[ARTL_ART_S] = "S";
    artKindOfs[ARTL_ART_S] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_S_2] = "S ::= . 'b'  ";
    artLabelStrings[ARTL_ART_S_2] = "";
    artlhsL[ARTL_ART_S_2] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_2] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_S_2] = true;
    artLabelInternalStrings[ARTL_ART_S_3] = "S ::= 'b'  ";
    artLabelStrings[ARTL_ART_S_3] = "";
    artlhsL[ARTL_ART_S_3] = ARTL_ART_S;
    artPopD[ARTL_ART_S_3] = true;
    artLabelInternalStrings[ARTL_ART_S_4] = "S ::= 'b'  .";
    artLabelStrings[ARTL_ART_S_4] = "";
    artlhsL[ARTL_ART_S_4] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_4] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_S_4] = true;
    arteoR_pL[ARTL_ART_S_4] = true;
    artPopD[ARTL_ART_S_4] = true;
    artLabelInternalStrings[ARTL_ART_S_6] = "S ::= . 'a'  X '@'  ";
    artLabelStrings[ARTL_ART_S_6] = "";
    artlhsL[ARTL_ART_S_6] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_6] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_S_7] = "S ::= 'a'  X '@'  ";
    artLabelStrings[ARTL_ART_S_7] = "";
    artlhsL[ARTL_ART_S_7] = ARTL_ART_S;
    artLabelInternalStrings[ARTL_ART_S_8] = "S ::= 'a'  . X '@'  ";
    artLabelStrings[ARTL_ART_S_8] = "";
    artlhsL[ARTL_ART_S_8] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_8] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_S_8] = true;
    artLabelInternalStrings[ARTL_ART_S_10] = "S ::= 'a'  X . '@'  ";
    artLabelStrings[ARTL_ART_S_10] = "";
    artlhsL[ARTL_ART_S_10] = ARTL_ART_S;
    artSlotInstanceOfs[ARTL_ART_S_10] = ARTL_ART_X;
    artKindOfs[ARTL_ART_S_10] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_S_10] = true;
    artLabelInternalStrings[ARTL_ART_S_11] = "S ::= 'a'  X '@'  ";
    artLabelStrings[ARTL_ART_S_11] = "";
    artlhsL[ARTL_ART_S_11] = ARTL_ART_S;
    artPopD[ARTL_ART_S_11] = true;
    artLabelInternalStrings[ARTL_ART_S_12] = "S ::= 'a'  X '@'  .";
    artLabelStrings[ARTL_ART_S_12] = "";
    artlhsL[ARTL_ART_S_12] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_12] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_S_12] = true;
    arteoR_pL[ARTL_ART_S_12] = true;
    artPopD[ARTL_ART_S_12] = true;
  }

  public void artTableInitialiser_ART_X() {
    artLabelInternalStrings[ARTL_ART_X] = "X";
    artLabelStrings[ARTL_ART_X] = "X";
    artKindOfs[ARTL_ART_X] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_X_14] = "X ::= . 'x'  X ";
    artLabelStrings[ARTL_ART_X_14] = "";
    artlhsL[ARTL_ART_X_14] = ARTL_ART_X;
    artKindOfs[ARTL_ART_X_14] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_X_15] = "X ::= 'x'  X ";
    artLabelStrings[ARTL_ART_X_15] = "";
    artlhsL[ARTL_ART_X_15] = ARTL_ART_X;
    artLabelInternalStrings[ARTL_ART_X_16] = "X ::= 'x'  . X ";
    artLabelStrings[ARTL_ART_X_16] = "";
    artlhsL[ARTL_ART_X_16] = ARTL_ART_X;
    artKindOfs[ARTL_ART_X_16] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_X_16] = true;
    artLabelInternalStrings[ARTL_ART_X_18] = "X ::= 'x'  X .";
    artLabelStrings[ARTL_ART_X_18] = "";
    artlhsL[ARTL_ART_X_18] = ARTL_ART_X;
    artSlotInstanceOfs[ARTL_ART_X_18] = ARTL_ART_X;
    artKindOfs[ARTL_ART_X_18] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_X_18] = true;
    arteoR_pL[ARTL_ART_X_18] = true;
    artPopD[ARTL_ART_X_18] = true;
    artLabelInternalStrings[ARTL_ART_X_20] = "X ::= . # ";
    artLabelStrings[ARTL_ART_X_20] = "";
    artlhsL[ARTL_ART_X_20] = ARTL_ART_X;
    artKindOfs[ARTL_ART_X_20] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_X_20] = true;
    artLabelInternalStrings[ARTL_ART_X_22] = "X ::= # .";
    artLabelStrings[ARTL_ART_X_22] = "";
    artlhsL[ARTL_ART_X_22] = ARTL_ART_X;
    artKindOfs[ARTL_ART_X_22] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_X_22] = true;
    arteoR_pL[ARTL_ART_X_22] = true;
    artPopD[ARTL_ART_X_22] = true;
  }

  public void artTableInitialise() {
    artLabelInternalStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelInternalStrings[ARTL_EOS] = "ART$";
    artLabelStrings[ARTL_EOS] = " EOS $";
    artLabelInternalStrings[ARTX_DESPATCH] = "ARTX_DESPATCH";
    artLabelStrings[ARTX_DESPATCH] = " DESPATCH";
    artLabelInternalStrings[ARTL_DUMMY] = "ARTL_DUMMY";
    artLabelStrings[ARTL_DUMMY] = " DUMMY";
    artLabelInternalStrings[ARTX_LABEL_EXTENT] = "!!ILLEGAL!!";
    artLabelStrings[ARTX_LABEL_EXTENT] = " ILLEGAL";
    artLabelStrings[ARTL_EPSILON] = "#";
    artLabelInternalStrings[ARTL_EPSILON] = "#";

    artTerminalRequiresWhiteSpace = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalRequiresWhiteSpace, 0, ARTL_EPSILON, false);

    artTerminalCaseInsensitive = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalCaseInsensitive, 0, ARTL_EPSILON, false);

    artlhsL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artlhsL, 0, ARTX_LABEL_EXTENT);
    artlhsL[ARTX_DESPATCH] = ARTX_DESPATCH;

    artKindOfs = new int[ARTX_LABEL_EXTENT + 1];
    artKindOfs[ARTL_EOS] = ARTK_EOS;
    artKindOfs[ARTL_EPSILON] = ARTK_EPSILON;

    artHigher = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artLonger = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artShorter = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artPreSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPreSlots, 0, ARTX_LABEL_EXTENT);

    artPostSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPostSlots, 0, ARTX_LABEL_EXTENT);

    artInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artSlotInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artSlotInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artUserNameOfs = new int[ARTX_LABEL_EXTENT + 1];

    artGathers = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artGathers, 0, ARTX_LABEL_EXTENT);

    artFolds = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artFolds, 0, ARTX_LABEL_EXTENT, 0);

    artpL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artpL, 0, ARTX_LABEL_EXTENT);

    artaL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artaL, 0, ARTX_LABEL_EXTENT);

    artcolonL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artcolonL, 0, ARTX_LABEL_EXTENT);

    arteoOPL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoOPL, 0, ARTX_LABEL_EXTENT, false);

    artfiRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiRL, 0, ARTX_LABEL_EXTENT, false);

    artfiPCL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiPCL, 0, ARTX_LABEL_EXTENT, false);

    arteoRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoRL, 0, ARTX_LABEL_EXTENT, false);

    arteoR_pL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoR_pL, 0, ARTX_LABEL_EXTENT, false);

    artPopD = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artPopD, 0, ARTX_LABEL_EXTENT, false);

    artLabelStrings[ARTTB_SIMPLE_WHITESPACE] = "SIMPLE_WHITESPACE";
    artLabelInternalStrings[ARTTB_SIMPLE_WHITESPACE] = "&SIMPLE_WHITESPACE";
    artKindOfs[ARTTB_SIMPLE_WHITESPACE] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_SIMPLE_WHITESPACE] = true;
    artLabelStrings[ARTTS__AT] = "@";
    artLabelInternalStrings[ARTTS__AT] = "'@'";
    artKindOfs[ARTTS__AT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__AT] = true;
    artLabelStrings[ARTTS_a] = "a";
    artLabelInternalStrings[ARTTS_a] = "'a'";
    artKindOfs[ARTTS_a] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_a] = true;
    artLabelStrings[ARTTS_b] = "b";
    artLabelInternalStrings[ARTTS_b] = "'b'";
    artKindOfs[ARTTS_b] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_b] = true;
    artLabelStrings[ARTTS_x] = "x";
    artLabelInternalStrings[ARTTS_x] = "'x'";
    artKindOfs[ARTTS_x] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_x] = true;
    artTableInitialiser_ART_S();
    artTableInitialiser_ART_X();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__AT;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 9;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_S;
    artBuildDirectives = "ARTDirectives [verbosityLevel=0, statistics=false, trace=false, inputs=[], inputFilenames=[], lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;
  public void ARTRD_S(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*S ::= 'b'  .*/
      case ARTL_ART_S_4: 
                ARTRD_S(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
                break;
      /*S ::= 'a'  X . '@'  */
      case ARTL_ART_S_10: 
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
                artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
        ARTRD_X(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
                break;
      /*S ::= 'a'  X '@'  .*/
      case ARTL_ART_S_12: 
                ARTRD_S(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
                break;
        default:
          throw new ARTException("ARTRD_S: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_X(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*X ::= 'x'  X .*/
    case ARTL_ART_X_18: 
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_X(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*X ::= # .*/
    case ARTL_ART_X_22: 
            ARTRD_X(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_X: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_S: ARTRD_S(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_X: ARTRD_X(artElement.element, artParent, artWriteable); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artInputString);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), null));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), null, artNewParent, artNewWriteable);
  artAttributeEvaluateCompleteTime = artReadClock();
  return artRDT;
}
};
