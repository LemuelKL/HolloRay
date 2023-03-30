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

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_SIMPLE_WHITESPACE = 1;
  public static final int ARTTS_a = 2;
  public static final int ARTTS_b = 3;
  public static final int ARTX_EPSILON = 4;
  public static final int ARTL_ART_A = 5;
  public static final int ARTL_ART_B = 6;
  public static final int ARTL_ART_S = 7;
  public static final int ARTL_ART_A_19 = 8;
  public static final int ARTL_ART_A_20 = 9;
  public static final int ARTL_ART_A_21 = 10;
  public static final int ARTL_ART_A_22 = 11;
  public static final int ARTL_ART_B_25 = 12;
  public static final int ARTL_ART_B_26 = 13;
  public static final int ARTL_ART_B_27 = 14;
  public static final int ARTL_ART_B_28 = 15;
  public static final int ARTL_ART_S_1 = 16;
  public static final int ARTL_ART_S_2 = 17;
  public static final int ARTL_ART_S_3 = 18;
  public static final int ARTL_ART_S_4 = 19;
  public static final int ARTL_ART_S_5 = 20;
  public static final int ARTL_ART_S_6 = 21;
  public static final int ARTL_ART_S_7 = 22;
  public static final int ARTL_ART_S_8 = 23;
  public static final int ARTL_ART_S_9 = 24;
  public static final int ARTL_ART_S_10 = 25;
  public static final int ARTL_ART_S_11 = 26;
  public static final int ARTL_ART_S_12 = 27;
  public static final int ARTL_ART_S_13 = 28;
  public static final int ARTL_ART_S_14 = 29;
  public static final int ARTL_ART_S_15 = 30;
  public static final int ARTL_ART_S_16 = 31;
  public static final int ARTX_DESPATCH = 32;
  public static final int ARTX_DUMMY = 33;
  public static final int ARTX_LABEL_EXTENT = 34;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_A() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal A production descriptor loads*/
      case ARTL_ART_A: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_A_20, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal A: match production*/
      case ARTL_ART_A_20: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_a, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_A_22, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_B() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal B production descriptor loads*/
      case ARTL_ART_B: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_B_26, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal B: match production*/
      case ARTL_ART_B_26: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_b, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_B_28, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_S() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal S production descriptor loads*/
      case ARTL_ART_S: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_S_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_S_8, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_S_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal S: match production*/
      case ARTL_ART_S_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_S_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_A; return; }
      case ARTL_ART_S_4: 
        /* Nonterminal template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_S_6, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_S; return; }
      case ARTL_ART_S_6: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal S: match production*/
      case ARTL_ART_S_8: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_S_10, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_B; return; }
      case ARTL_ART_S_10: 
        /* Nonterminal template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_S_12, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_S; return; }
      case ARTL_ART_S_12: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal S: match production*/
      case ARTL_ART_S_14: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_S_16, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 8;
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
        case ARTL_ART_A: 
          ARTPF_ART_A();
          break;
        case ARTL_ART_B: 
          ARTPF_ART_B();
          break;
        case ARTL_ART_S: 
          ARTPF_ART_S();
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

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTX_EOS] = true;
    ARTSet3[ARTTS_a] = true;
    ARTSet3[ARTTS_b] = true;
    ARTSet3[ARTL_ART_A] = true;
    ARTSet3[ARTL_ART_B] = true;
    ARTSet3[ARTL_ART_S] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTX_EOS] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTS_a] = true;
    ARTSet8[ARTL_ART_A] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS_b] = true;
    ARTSet10[ARTL_ART_B] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTS_a] = true;
    ARTSet6[ARTTS_b] = true;
    ARTSet6[ARTL_ART_A] = true;
    ARTSet6[ARTL_ART_B] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS_a] = true;
    ARTSet9[ARTTS_b] = true;
    ARTSet9[ARTL_ART_A] = true;
    ARTSet9[ARTL_ART_B] = true;
    ARTSet9[ARTL_ART_S] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTS_a] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTS_b] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet3initialise();
    ARTSet7initialise();
    ARTSet8initialise();
    ARTSet10initialise();
    ARTSet6initialise();
    ARTSet9initialise();
    ARTSet4initialise();
    ARTSet2initialise();
    ARTSet5initialise();
  }

  public void artTableInitialiser_ART_A() {
    artLabelInternalStrings[ARTL_ART_A] = "A";
    artLabelStrings[ARTL_ART_A] = "A";
    artKindOfs[ARTL_ART_A] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_A_20] = "A ::= . 'a'  ";
    artLabelStrings[ARTL_ART_A_20] = "";
    artlhsL[ARTL_ART_A_20] = ARTL_ART_A;
    artKindOfs[ARTL_ART_A_20] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_A_20] = true;
    artLabelInternalStrings[ARTL_ART_A_21] = "A ::= 'a'  ";
    artLabelStrings[ARTL_ART_A_21] = "";
    artlhsL[ARTL_ART_A_21] = ARTL_ART_A;
    artPopD[ARTL_ART_A_21] = true;
    artLabelInternalStrings[ARTL_ART_A_22] = "A ::= 'a'  .";
    artLabelStrings[ARTL_ART_A_22] = "";
    artlhsL[ARTL_ART_A_22] = ARTL_ART_A;
    artKindOfs[ARTL_ART_A_22] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_A_22] = true;
    arteoR_pL[ARTL_ART_A_22] = true;
    artPopD[ARTL_ART_A_22] = true;
  }

  public void artTableInitialiser_ART_B() {
    artLabelInternalStrings[ARTL_ART_B] = "B";
    artLabelStrings[ARTL_ART_B] = "B";
    artKindOfs[ARTL_ART_B] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_B_26] = "B ::= . 'b'  ";
    artLabelStrings[ARTL_ART_B_26] = "";
    artlhsL[ARTL_ART_B_26] = ARTL_ART_B;
    artKindOfs[ARTL_ART_B_26] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_B_26] = true;
    artLabelInternalStrings[ARTL_ART_B_27] = "B ::= 'b'  ";
    artLabelStrings[ARTL_ART_B_27] = "";
    artlhsL[ARTL_ART_B_27] = ARTL_ART_B;
    artPopD[ARTL_ART_B_27] = true;
    artLabelInternalStrings[ARTL_ART_B_28] = "B ::= 'b'  .";
    artLabelStrings[ARTL_ART_B_28] = "";
    artlhsL[ARTL_ART_B_28] = ARTL_ART_B;
    artKindOfs[ARTL_ART_B_28] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_B_28] = true;
    arteoR_pL[ARTL_ART_B_28] = true;
    artPopD[ARTL_ART_B_28] = true;
  }

  public void artTableInitialiser_ART_S() {
    artLabelInternalStrings[ARTL_ART_S] = "S";
    artLabelStrings[ARTL_ART_S] = "S";
    artKindOfs[ARTL_ART_S] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_S_2] = "S ::= . A S ";
    artLabelStrings[ARTL_ART_S_2] = "";
    artlhsL[ARTL_ART_S_2] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_S_4] = "S ::= A . S ";
    artLabelStrings[ARTL_ART_S_4] = "";
    artlhsL[ARTL_ART_S_4] = ARTL_ART_S;
    artSlotInstanceOfs[ARTL_ART_S_4] = ARTL_ART_A;
    artKindOfs[ARTL_ART_S_4] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_S_4] = true;
    artLabelInternalStrings[ARTL_ART_S_6] = "S ::= A S .";
    artLabelStrings[ARTL_ART_S_6] = "";
    artlhsL[ARTL_ART_S_6] = ARTL_ART_S;
    artSlotInstanceOfs[ARTL_ART_S_6] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_6] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_S_6] = true;
    arteoR_pL[ARTL_ART_S_6] = true;
    artPopD[ARTL_ART_S_6] = true;
    artLabelInternalStrings[ARTL_ART_S_8] = "S ::= . B S ";
    artLabelStrings[ARTL_ART_S_8] = "";
    artlhsL[ARTL_ART_S_8] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_8] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_S_10] = "S ::= B . S ";
    artLabelStrings[ARTL_ART_S_10] = "";
    artlhsL[ARTL_ART_S_10] = ARTL_ART_S;
    artSlotInstanceOfs[ARTL_ART_S_10] = ARTL_ART_B;
    artKindOfs[ARTL_ART_S_10] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_S_10] = true;
    artLabelInternalStrings[ARTL_ART_S_12] = "S ::= B S .";
    artLabelStrings[ARTL_ART_S_12] = "";
    artlhsL[ARTL_ART_S_12] = ARTL_ART_S;
    artSlotInstanceOfs[ARTL_ART_S_12] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_12] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_S_12] = true;
    arteoR_pL[ARTL_ART_S_12] = true;
    artPopD[ARTL_ART_S_12] = true;
    artLabelInternalStrings[ARTL_ART_S_14] = "S ::= . # ";
    artLabelStrings[ARTL_ART_S_14] = "";
    artlhsL[ARTL_ART_S_14] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_14] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_S_14] = true;
    artLabelInternalStrings[ARTL_ART_S_16] = "S ::= # .";
    artLabelStrings[ARTL_ART_S_16] = "";
    artlhsL[ARTL_ART_S_16] = ARTL_ART_S;
    artKindOfs[ARTL_ART_S_16] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_S_16] = true;
    arteoR_pL[ARTL_ART_S_16] = true;
    artPopD[ARTL_ART_S_16] = true;
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
    artLabelStrings[ARTTS_a] = "a";
    artLabelInternalStrings[ARTTS_a] = "'a'";
    artKindOfs[ARTTS_a] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_a] = true;
    artLabelStrings[ARTTS_b] = "b";
    artLabelInternalStrings[ARTTS_b] = "'b'";
    artKindOfs[ARTTS_b] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_b] = true;
    artTableInitialiser_ART_A();
    artTableInitialiser_ART_B();
    artTableInitialiser_ART_S();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS_a;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 8;
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
  public void ARTRD_A(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*A ::= 'a'  .*/
      case ARTL_ART_A_22: 
                ARTRD_A(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
         System.out.println("A"); 
        break;
        default:
          throw new ARTException("ARTRD_A: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_B(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*B ::= 'b'  .*/
    case ARTL_ART_B_28: 
            ARTRD_B(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       System.out.println("B"); 
      break;
        default:
          throw new ARTException("ARTRD_B: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_S(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*S ::= A S .*/
    case ARTL_ART_S_6: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_A(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_S(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*S ::= B S .*/
    case ARTL_ART_S_12: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_B(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_S(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*S ::= # .*/
    case ARTL_ART_S_16: 
            ARTRD_S(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       System.out.println("FINISHED"); 
      break;
        default:
          throw new ARTException("ARTRD_S: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_A: ARTRD_A(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_B: ARTRD_B(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_S: ARTRD_S(artElement.element, artParent, artWriteable); break;
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
