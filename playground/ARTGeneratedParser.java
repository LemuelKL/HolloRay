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
  private static boolean[] ARTSet12;
  private static boolean[] ARTSet13;
  private static boolean[] ARTSet14;
  private static boolean[] ARTSet15;
  private static boolean[] ARTSet16;
  private static boolean[] ARTSet17;
  private static boolean[] ARTSet18;
  private static boolean[] ARTSet19;
  private static boolean[] ARTSet20;
  private static boolean[] ARTSet21;
  private static boolean[] ARTSet22;
  private static boolean[] ARTSet23;
  private static boolean[] ARTSet24;
  private static boolean[] ARTSet25;
  private static boolean[] ARTSet26;
  private static boolean[] ARTSet27;
  private static boolean[] ARTSet28;
  private static boolean[] ARTSet29;
  private static boolean[] ARTSet30;
  private static boolean[] ARTSet31;
  private static boolean[] ARTSet32;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_SIMPLE_WHITESPACE = 3;
  public static final int ARTTS__SHREIK_EQUAL = 4;
  public static final int ARTTS__LPAR = 5;
  public static final int ARTTS__RPAR = 6;
  public static final int ARTTS__COMMA = 7;
  public static final int ARTTS__MINUS = 8;
  public static final int ARTTS__COLON_EQUAL = 9;
  public static final int ARTTS__SEMICOLON = 10;
  public static final int ARTTS__GT = 11;
  public static final int ARTTS_backend = 12;
  public static final int ARTTS_else = 13;
  public static final int ARTTS_if = 14;
  public static final int ARTTS_while = 15;
  public static final int ARTX_EPSILON = 16;
  public static final int ARTL_ART_ID = 17;
  public static final int ARTL_ART_INTEGER = 18;
  public static final int ARTL_ART_assign = 19;
  public static final int ARTL_ART_backend = 20;
  public static final int ARTL_ART_deref = 21;
  public static final int ARTL_ART_gt = 22;
  public static final int ARTL_ART_if = 23;
  public static final int ARTL_ART_ne = 24;
  public static final int ARTL_ART_operand = 25;
  public static final int ARTL_ART_relExpr = 26;
  public static final int ARTL_ART_seq = 27;
  public static final int ARTL_ART_statement = 28;
  public static final int ARTL_ART_sub = 29;
  public static final int ARTL_ART_subExpr = 30;
  public static final int ARTL_ART_while = 31;
  public static final int ARTL_ART_ID_139 = 32;
  public static final int ARTL_ART_ID_140 = 33;
  public static final int ARTL_ART_ID_141 = 34;
  public static final int ARTL_ART_ID_142 = 35;
  public static final int ARTL_ART_INTEGER_145 = 36;
  public static final int ARTL_ART_INTEGER_146 = 37;
  public static final int ARTL_ART_INTEGER_147 = 38;
  public static final int ARTL_ART_INTEGER_148 = 39;
  public static final int ARTL_ART_assign_27 = 40;
  public static final int ARTL_ART_assign_28 = 41;
  public static final int ARTL_ART_assign_29 = 42;
  public static final int ARTL_ART_assign_30 = 43;
  public static final int ARTL_ART_assign_31 = 44;
  public static final int ARTL_ART_assign_32 = 45;
  public static final int ARTL_ART_assign_33 = 46;
  public static final int ARTL_ART_assign_34 = 47;
  public static final int ARTL_ART_assign_35 = 48;
  public static final int ARTL_ART_assign_36 = 49;
  public static final int ARTL_ART_backend_57 = 50;
  public static final int ARTL_ART_backend_58 = 51;
  public static final int ARTL_ART_backend_59 = 52;
  public static final int ARTL_ART_backend_60 = 53;
  public static final int ARTL_ART_backend_61 = 54;
  public static final int ARTL_ART_backend_62 = 55;
  public static final int ARTL_ART_backend_63 = 56;
  public static final int ARTL_ART_backend_64 = 57;
  public static final int ARTL_ART_backend_65 = 58;
  public static final int ARTL_ART_backend_66 = 59;
  public static final int ARTL_ART_backend_67 = 60;
  public static final int ARTL_ART_backend_68 = 61;
  public static final int ARTL_ART_backend_69 = 62;
  public static final int ARTL_ART_backend_70 = 63;
  public static final int ARTL_ART_backend_71 = 64;
  public static final int ARTL_ART_backend_72 = 65;
  public static final int ARTL_ART_backend_73 = 66;
  public static final int ARTL_ART_backend_74 = 67;
  public static final int ARTL_ART_deref_135 = 68;
  public static final int ARTL_ART_deref_136 = 69;
  public static final int ARTL_ART_deref_137 = 70;
  public static final int ARTL_ART_deref_138 = 71;
  public static final int ARTL_ART_gt_87 = 72;
  public static final int ARTL_ART_gt_88 = 73;
  public static final int ARTL_ART_gt_89 = 74;
  public static final int ARTL_ART_gt_90 = 75;
  public static final int ARTL_ART_gt_91 = 76;
  public static final int ARTL_ART_gt_92 = 77;
  public static final int ARTL_ART_gt_93 = 78;
  public static final int ARTL_ART_gt_94 = 79;
  public static final int ARTL_ART_if_37 = 80;
  public static final int ARTL_ART_if_38 = 81;
  public static final int ARTL_ART_if_39 = 82;
  public static final int ARTL_ART_if_40 = 83;
  public static final int ARTL_ART_if_41 = 84;
  public static final int ARTL_ART_if_42 = 85;
  public static final int ARTL_ART_if_43 = 86;
  public static final int ARTL_ART_if_44 = 87;
  public static final int ARTL_ART_if_45 = 88;
  public static final int ARTL_ART_if_46 = 89;
  public static final int ARTL_ART_if_47 = 90;
  public static final int ARTL_ART_if_48 = 91;
  public static final int ARTL_ART_ne_95 = 92;
  public static final int ARTL_ART_ne_96 = 93;
  public static final int ARTL_ART_ne_97 = 94;
  public static final int ARTL_ART_ne_98 = 95;
  public static final int ARTL_ART_ne_99 = 96;
  public static final int ARTL_ART_ne_100 = 97;
  public static final int ARTL_ART_ne_101 = 98;
  public static final int ARTL_ART_ne_102 = 99;
  public static final int ARTL_ART_operand_119 = 100;
  public static final int ARTL_ART_operand_120 = 101;
  public static final int ARTL_ART_operand_121 = 102;
  public static final int ARTL_ART_operand_122 = 103;
  public static final int ARTL_ART_operand_123 = 104;
  public static final int ARTL_ART_operand_124 = 105;
  public static final int ARTL_ART_operand_125 = 106;
  public static final int ARTL_ART_operand_126 = 107;
  public static final int ARTL_ART_operand_127 = 108;
  public static final int ARTL_ART_operand_128 = 109;
  public static final int ARTL_ART_operand_129 = 110;
  public static final int ARTL_ART_operand_130 = 111;
  public static final int ARTL_ART_operand_131 = 112;
  public static final int ARTL_ART_operand_132 = 113;
  public static final int ARTL_ART_operand_133 = 114;
  public static final int ARTL_ART_operand_134 = 115;
  public static final int ARTL_ART_relExpr_75 = 116;
  public static final int ARTL_ART_relExpr_76 = 117;
  public static final int ARTL_ART_relExpr_77 = 118;
  public static final int ARTL_ART_relExpr_78 = 119;
  public static final int ARTL_ART_relExpr_79 = 120;
  public static final int ARTL_ART_relExpr_80 = 121;
  public static final int ARTL_ART_relExpr_81 = 122;
  public static final int ARTL_ART_relExpr_82 = 123;
  public static final int ARTL_ART_relExpr_83 = 124;
  public static final int ARTL_ART_relExpr_84 = 125;
  public static final int ARTL_ART_relExpr_85 = 126;
  public static final int ARTL_ART_relExpr_86 = 127;
  public static final int ARTL_ART_seq_21 = 128;
  public static final int ARTL_ART_seq_22 = 129;
  public static final int ARTL_ART_seq_23 = 130;
  public static final int ARTL_ART_seq_24 = 131;
  public static final int ARTL_ART_seq_25 = 132;
  public static final int ARTL_ART_seq_26 = 133;
  public static final int ARTL_ART_statement_1 = 134;
  public static final int ARTL_ART_statement_2 = 135;
  public static final int ARTL_ART_statement_3 = 136;
  public static final int ARTL_ART_statement_4 = 137;
  public static final int ARTL_ART_statement_5 = 138;
  public static final int ARTL_ART_statement_6 = 139;
  public static final int ARTL_ART_statement_7 = 140;
  public static final int ARTL_ART_statement_8 = 141;
  public static final int ARTL_ART_statement_9 = 142;
  public static final int ARTL_ART_statement_10 = 143;
  public static final int ARTL_ART_statement_11 = 144;
  public static final int ARTL_ART_statement_12 = 145;
  public static final int ARTL_ART_statement_13 = 146;
  public static final int ARTL_ART_statement_14 = 147;
  public static final int ARTL_ART_statement_15 = 148;
  public static final int ARTL_ART_statement_16 = 149;
  public static final int ARTL_ART_statement_17 = 150;
  public static final int ARTL_ART_statement_18 = 151;
  public static final int ARTL_ART_statement_19 = 152;
  public static final int ARTL_ART_statement_20 = 153;
  public static final int ARTL_ART_sub_111 = 154;
  public static final int ARTL_ART_sub_112 = 155;
  public static final int ARTL_ART_sub_113 = 156;
  public static final int ARTL_ART_sub_114 = 157;
  public static final int ARTL_ART_sub_115 = 158;
  public static final int ARTL_ART_sub_116 = 159;
  public static final int ARTL_ART_sub_117 = 160;
  public static final int ARTL_ART_sub_118 = 161;
  public static final int ARTL_ART_subExpr_103 = 162;
  public static final int ARTL_ART_subExpr_104 = 163;
  public static final int ARTL_ART_subExpr_105 = 164;
  public static final int ARTL_ART_subExpr_106 = 165;
  public static final int ARTL_ART_subExpr_107 = 166;
  public static final int ARTL_ART_subExpr_108 = 167;
  public static final int ARTL_ART_subExpr_109 = 168;
  public static final int ARTL_ART_subExpr_110 = 169;
  public static final int ARTL_ART_while_49 = 170;
  public static final int ARTL_ART_while_50 = 171;
  public static final int ARTL_ART_while_51 = 172;
  public static final int ARTL_ART_while_52 = 173;
  public static final int ARTL_ART_while_53 = 174;
  public static final int ARTL_ART_while_54 = 175;
  public static final int ARTL_ART_while_55 = 176;
  public static final int ARTL_ART_while_56 = 177;
  public static final int ARTX_DESPATCH = 178;
  public static final int ARTX_DUMMY = 179;
  public static final int ARTX_LABEL_EXTENT = 180;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_ID() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ID production descriptor loads*/
      case ARTL_ART_ID: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ID_140, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_140: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_142, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_INTEGER() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal INTEGER production descriptor loads*/
      case ARTL_ART_INTEGER: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_INTEGER_146, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_146: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_148, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_assign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal assign production descriptor loads*/
      case ARTL_ART_assign: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_assign_28, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_28: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_30, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_assign_30: 
        /* Nonterminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COLON_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_32, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_34, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_assign_34: 
        /* Nonterminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_36, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_backend() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal backend production descriptor loads*/
      case ARTL_ART_backend: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_backend_58, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal backend: match production*/
      case ARTL_ART_backend_58: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_backend, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_60, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_62, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_64, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_64: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_66, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_68, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_68: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_70, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_72, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_72: 
        /* Nonterminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_74, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_deref() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal deref production descriptor loads*/
      case ARTL_ART_deref: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_deref_136, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal deref: match production*/
      case ARTL_ART_deref_136: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_deref_138, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_deref_138: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_gt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal gt production descriptor loads*/
      case ARTL_ART_gt: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_gt_88, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal gt: match production*/
      case ARTL_ART_gt_88: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_90, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_gt_90: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_gt_92, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_94, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_gt_94: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_if() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal if production descriptor loads*/
      case ARTL_ART_if: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_38, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal if: match production*/
      case ARTL_ART_if_38: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_40, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_42, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_42: 
        /* Nonterminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_44, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_44: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_46, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_48, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_48: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ne() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ne production descriptor loads*/
      case ARTL_ART_ne: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ne_96, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ne: match production*/
      case ARTL_ART_ne_96: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_98, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_ne_98: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ne_100, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_102, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_ne_102: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_120, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_124, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_128, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_120: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_122, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_operand_122: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_124: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_126, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_126: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_128: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_130, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_132, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_operand_132: 
        /* Nonterminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_134, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_relExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal relExpr production descriptor loads*/
      case ARTL_ART_relExpr: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_76, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_80, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_84, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_76: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_78, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_78: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_80: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_82, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_gt; return; }
      case ARTL_ART_relExpr_82: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_84: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_86, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ne; return; }
      case ARTL_ART_relExpr_86: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_seq() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal seq production descriptor loads*/
      case ARTL_ART_seq: 
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_seq_22, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal seq: match production*/
      case ARTL_ART_seq_22: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_24, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_24: 
        /* Nonterminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_26, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_26: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_10, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_18, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_seq; return; }
      case ARTL_ART_statement_4: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_6: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_8, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_assign; return; }
      case ARTL_ART_statement_8: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_10: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_12, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_if; return; }
      case ARTL_ART_statement_12: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_14: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_16, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_while; return; }
      case ARTL_ART_statement_16: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_18: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_20, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_backend; return; }
      case ARTL_ART_statement_20: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sub() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sub production descriptor loads*/
      case ARTL_ART_sub: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sub_112, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sub: match production*/
      case ARTL_ART_sub_112: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_114, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_sub_114: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sub_116, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_118, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_sub_118: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExpr production descriptor loads*/
      case ARTL_ART_subExpr: 
        if (ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_104, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_108, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_104: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_106: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_108: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_110, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sub; return; }
      case ARTL_ART_subExpr_110: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_while() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal while production descriptor loads*/
      case ARTL_ART_while: 
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_while_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal while: match production*/
      case ARTL_ART_while_50: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_52, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_54, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_while_54: 
        /* Nonterminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_while_56: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 32;
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
        case ARTL_ART_ID: 
          ARTPF_ART_ID();
          break;
        case ARTL_ART_INTEGER: 
          ARTPF_ART_INTEGER();
          break;
        case ARTL_ART_assign: 
          ARTPF_ART_assign();
          break;
        case ARTL_ART_backend: 
          ARTPF_ART_backend();
          break;
        case ARTL_ART_deref: 
          ARTPF_ART_deref();
          break;
        case ARTL_ART_gt: 
          ARTPF_ART_gt();
          break;
        case ARTL_ART_if: 
          ARTPF_ART_if();
          break;
        case ARTL_ART_ne: 
          ARTPF_ART_ne();
          break;
        case ARTL_ART_operand: 
          ARTPF_ART_operand();
          break;
        case ARTL_ART_relExpr: 
          ARTPF_ART_relExpr();
          break;
        case ARTL_ART_seq: 
          ARTPF_ART_seq();
          break;
        case ARTL_ART_statement: 
          ARTPF_ART_statement();
          break;
        case ARTL_ART_sub: 
          ARTPF_ART_sub();
          break;
        case ARTL_ART_subExpr: 
          ARTPF_ART_subExpr();
          break;
        case ARTL_ART_while: 
          ARTPF_ART_while();
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
    ARTSet7[ARTTB_ID] = true;
    ARTSet7[ARTL_ART_ID] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTB_INTEGER] = true;
    ARTSet25[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTB_ID] = true;
    ARTSet23[ARTTB_INTEGER] = true;
    ARTSet23[ARTTS__LPAR] = true;
    ARTSet23[ARTL_ART_ID] = true;
    ARTSet23[ARTL_ART_INTEGER] = true;
    ARTSet23[ARTL_ART_deref] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS_if] = true;
    ARTSet27[ARTL_ART_if] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTB_ID] = true;
    ARTSet16[ARTTB_INTEGER] = true;
    ARTSet16[ARTTS__LPAR] = true;
    ARTSet16[ARTL_ART_ID] = true;
    ARTSet16[ARTL_ART_INTEGER] = true;
    ARTSet16[ARTL_ART_deref] = true;
    ARTSet16[ARTL_ART_gt] = true;
    ARTSet16[ARTL_ART_ne] = true;
    ARTSet16[ARTL_ART_operand] = true;
    ARTSet16[ARTL_ART_relExpr] = true;
    ARTSet16[ARTL_ART_sub] = true;
    ARTSet16[ARTL_ART_subExpr] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS_while] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTB_ID] = true;
    ARTSet24[ARTL_ART_ID] = true;
    ARTSet24[ARTL_ART_deref] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS_if] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTB_ID] = true;
    ARTSet3[ARTTS__SHREIK_EQUAL] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__COLON_EQUAL] = true;
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS_backend] = true;
    ARTSet3[ARTTS_if] = true;
    ARTSet3[ARTTS_while] = true;
    ARTSet3[ARTL_ART_ID] = true;
    ARTSet3[ARTL_ART_assign] = true;
    ARTSet3[ARTL_ART_backend] = true;
    ARTSet3[ARTL_ART_if] = true;
    ARTSet3[ARTL_ART_seq] = true;
    ARTSet3[ARTL_ART_statement] = true;
    ARTSet3[ARTL_ART_while] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS_else] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTB_ID] = true;
    ARTSet6[ARTTS__SHREIK_EQUAL] = true;
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__COMMA] = true;
    ARTSet6[ARTTS__MINUS] = true;
    ARTSet6[ARTTS__SEMICOLON] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS_backend] = true;
    ARTSet6[ARTTS_if] = true;
    ARTSet6[ARTTS_while] = true;
    ARTSet6[ARTL_ART_ID] = true;
    ARTSet6[ARTL_ART_assign] = true;
    ARTSet6[ARTL_ART_backend] = true;
    ARTSet6[ARTL_ART_if] = true;
    ARTSet6[ARTL_ART_seq] = true;
    ARTSet6[ARTL_ART_statement] = true;
    ARTSet6[ARTL_ART_while] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTX_EOS] = true;
    ARTSet8[ARTTB_ID] = true;
    ARTSet8[ARTTS_backend] = true;
    ARTSet8[ARTTS_else] = true;
    ARTSet8[ARTTS_if] = true;
    ARTSet8[ARTTS_while] = true;
    ARTSet8[ARTL_ART_ID] = true;
    ARTSet8[ARTL_ART_assign] = true;
    ARTSet8[ARTL_ART_backend] = true;
    ARTSet8[ARTL_ART_if] = true;
    ARTSet8[ARTL_ART_seq] = true;
    ARTSet8[ARTL_ART_statement] = true;
    ARTSet8[ARTL_ART_while] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTS_backend] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTB_ID] = true;
    ARTSet26[ARTL_ART_ID] = true;
    ARTSet26[ARTL_ART_assign] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTS__LPAR] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS_backend] = true;
    ARTSet29[ARTL_ART_backend] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTS__RPAR] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__COMMA] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS__MINUS] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTB_ID] = true;
    ARTSet17[ARTTS__SHREIK_EQUAL] = true;
    ARTSet17[ARTTS__GT] = true;
    ARTSet17[ARTTS_backend] = true;
    ARTSet17[ARTTS_if] = true;
    ARTSet17[ARTTS_while] = true;
    ARTSet17[ARTL_ART_ID] = true;
    ARTSet17[ARTL_ART_assign] = true;
    ARTSet17[ARTL_ART_backend] = true;
    ARTSet17[ARTL_ART_if] = true;
    ARTSet17[ARTL_ART_seq] = true;
    ARTSet17[ARTL_ART_statement] = true;
    ARTSet17[ARTL_ART_while] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTB_ID] = true;
    ARTSet31[ARTTB_INTEGER] = true;
    ARTSet31[ARTTS__LPAR] = true;
    ARTSet31[ARTL_ART_ID] = true;
    ARTSet31[ARTL_ART_INTEGER] = true;
    ARTSet31[ARTL_ART_deref] = true;
    ARTSet31[ARTL_ART_operand] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTB_ID] = true;
    ARTSet10[ARTTB_INTEGER] = true;
    ARTSet10[ARTTS__LPAR] = true;
    ARTSet10[ARTL_ART_ID] = true;
    ARTSet10[ARTL_ART_INTEGER] = true;
    ARTSet10[ARTL_ART_deref] = true;
    ARTSet10[ARTL_ART_operand] = true;
    ARTSet10[ARTL_ART_sub] = true;
    ARTSet10[ARTL_ART_subExpr] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__GT] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTB_ID] = true;
    ARTSet20[ARTTS_backend] = true;
    ARTSet20[ARTTS_if] = true;
    ARTSet20[ARTTS_while] = true;
    ARTSet20[ARTL_ART_ID] = true;
    ARTSet20[ARTL_ART_assign] = true;
    ARTSet20[ARTL_ART_backend] = true;
    ARTSet20[ARTL_ART_if] = true;
    ARTSet20[ARTL_ART_seq] = true;
    ARTSet20[ARTL_ART_statement] = true;
    ARTSet20[ARTL_ART_while] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS__COLON_EQUAL] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS_while] = true;
    ARTSet28[ARTL_ART_while] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet7initialise();
    ARTSet25initialise();
    ARTSet23initialise();
    ARTSet27initialise();
    ARTSet16initialise();
    ARTSet32initialise();
    ARTSet24initialise();
    ARTSet2initialise();
    ARTSet19initialise();
    ARTSet3initialise();
    ARTSet21initialise();
    ARTSet6initialise();
    ARTSet8initialise();
    ARTSet5initialise();
    ARTSet12initialise();
    ARTSet26initialise();
    ARTSet13initialise();
    ARTSet29initialise();
    ARTSet15initialise();
    ARTSet14initialise();
    ARTSet30initialise();
    ARTSet17initialise();
    ARTSet31initialise();
    ARTSet10initialise();
    ARTSet11initialise();
    ARTSet22initialise();
    ARTSet4initialise();
    ARTSet18initialise();
    ARTSet20initialise();
    ARTSet9initialise();
    ARTSet28initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_140] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_140] = "";
    artlhsL[ARTL_ART_ID_140] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_140] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_140] = true;
    artFolds[ARTL_ART_ID_142] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_ID_141] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_141] = "";
    artlhsL[ARTL_ART_ID_141] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_141] = true;
    artLabelInternalStrings[ARTL_ART_ID_142] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_142] = "";
    artlhsL[ARTL_ART_ID_142] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_142] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_142] = true;
    arteoR_pL[ARTL_ART_ID_142] = true;
    artPopD[ARTL_ART_ID_142] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_146] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_146] = "";
    artlhsL[ARTL_ART_INTEGER_146] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_146] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_146] = true;
    artFolds[ARTL_ART_INTEGER_148] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_INTEGER_147] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_147] = "";
    artlhsL[ARTL_ART_INTEGER_147] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_147] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_148] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_148] = "";
    artlhsL[ARTL_ART_INTEGER_148] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_148] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_148] = true;
    arteoR_pL[ARTL_ART_INTEGER_148] = true;
    artPopD[ARTL_ART_INTEGER_148] = true;
  }

  public void artTableInitialiser_ART_assign() {
    artLabelInternalStrings[ARTL_ART_assign] = "assign";
    artLabelStrings[ARTL_ART_assign] = "assign";
    artKindOfs[ARTL_ART_assign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_assign_28] = "assign ::= . ID ':='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_28] = "";
    artlhsL[ARTL_ART_assign_28] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_28] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_30] = "assign ::= ID . ':='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_30] = "";
    artlhsL[ARTL_ART_assign_30] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_30] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_assign_30] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_assign_30] = true;
    artFolds[ARTL_ART_assign_32] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_31] = "assign ::= ID ':='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_31] = "";
    artlhsL[ARTL_ART_assign_31] = ARTL_ART_assign;
    artLabelInternalStrings[ARTL_ART_assign_32] = "assign ::= ID ':='  . subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_32] = "";
    artlhsL[ARTL_ART_assign_32] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_32] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_34] = "assign ::= ID ':='  subExpr . ';'  ";
    artLabelStrings[ARTL_ART_assign_34] = "";
    artlhsL[ARTL_ART_assign_34] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_34] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_assign_34] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_assign_34] = true;
    artFolds[ARTL_ART_assign_36] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_35] = "assign ::= ID ':='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_35] = "";
    artlhsL[ARTL_ART_assign_35] = ARTL_ART_assign;
    artPopD[ARTL_ART_assign_35] = true;
    artLabelInternalStrings[ARTL_ART_assign_36] = "assign ::= ID ':='  subExpr ';'  .";
    artLabelStrings[ARTL_ART_assign_36] = "";
    artlhsL[ARTL_ART_assign_36] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_36] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_36] = true;
    arteoR_pL[ARTL_ART_assign_36] = true;
    artPopD[ARTL_ART_assign_36] = true;
  }

  public void artTableInitialiser_ART_backend() {
    artLabelInternalStrings[ARTL_ART_backend] = "backend";
    artLabelStrings[ARTL_ART_backend] = "backend";
    artKindOfs[ARTL_ART_backend] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_backend_58] = "backend ::= . 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_58] = "";
    artlhsL[ARTL_ART_backend_58] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_58] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_60] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_59] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_59] = "";
    artlhsL[ARTL_ART_backend_59] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_60] = "backend ::= 'backend'  . '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_60] = "";
    artlhsL[ARTL_ART_backend_60] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_60] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_backend_60] = true;
    artFolds[ARTL_ART_backend_62] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_61] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_61] = "";
    artlhsL[ARTL_ART_backend_61] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_62] = "backend ::= 'backend'  '('  . subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_62] = "";
    artlhsL[ARTL_ART_backend_62] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_62] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_64] = "backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_64] = "";
    artlhsL[ARTL_ART_backend_64] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_64] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_64] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_66] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_65] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_65] = "";
    artlhsL[ARTL_ART_backend_65] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_66] = "backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_66] = "";
    artlhsL[ARTL_ART_backend_66] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_66] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_68] = "backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_68] = "";
    artlhsL[ARTL_ART_backend_68] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_68] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_68] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_70] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_69] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_69] = "";
    artlhsL[ARTL_ART_backend_69] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_70] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_70] = "";
    artlhsL[ARTL_ART_backend_70] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_70] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_72] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_backend_72] = "";
    artlhsL[ARTL_ART_backend_72] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_72] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_72] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_backend_72] = true;
    artFolds[ARTL_ART_backend_74] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_73] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_73] = "";
    artlhsL[ARTL_ART_backend_73] = ARTL_ART_backend;
    artPopD[ARTL_ART_backend_73] = true;
    artLabelInternalStrings[ARTL_ART_backend_74] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .";
    artLabelStrings[ARTL_ART_backend_74] = "";
    artlhsL[ARTL_ART_backend_74] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_74] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_backend_74] = true;
    arteoR_pL[ARTL_ART_backend_74] = true;
    artPopD[ARTL_ART_backend_74] = true;
  }

  public void artTableInitialiser_ART_deref() {
    artLabelInternalStrings[ARTL_ART_deref] = "deref";
    artLabelStrings[ARTL_ART_deref] = "deref";
    artKindOfs[ARTL_ART_deref] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_deref_136] = "deref ::= . ID ";
    artLabelStrings[ARTL_ART_deref_136] = "";
    artlhsL[ARTL_ART_deref_136] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_deref_136] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_deref_138] = "deref ::= ID .";
    artLabelStrings[ARTL_ART_deref_138] = "";
    artlhsL[ARTL_ART_deref_138] = ARTL_ART_deref;
    artSlotInstanceOfs[ARTL_ART_deref_138] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_deref_138] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_deref_138] = true;
    arteoR_pL[ARTL_ART_deref_138] = true;
    artPopD[ARTL_ART_deref_138] = true;
  }

  public void artTableInitialiser_ART_gt() {
    artLabelInternalStrings[ARTL_ART_gt] = "gt";
    artLabelStrings[ARTL_ART_gt] = "gt";
    artKindOfs[ARTL_ART_gt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_gt_88] = "gt ::= . relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_88] = "";
    artlhsL[ARTL_ART_gt_88] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_88] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_90] = "gt ::= relExpr . '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_90] = "";
    artlhsL[ARTL_ART_gt_90] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_90] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_gt_90] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_gt_90] = true;
    artFolds[ARTL_ART_gt_92] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_gt_91] = "gt ::= relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_91] = "";
    artlhsL[ARTL_ART_gt_91] = ARTL_ART_gt;
    artLabelInternalStrings[ARTL_ART_gt_92] = "gt ::= relExpr '>'  . subExpr ";
    artLabelStrings[ARTL_ART_gt_92] = "";
    artlhsL[ARTL_ART_gt_92] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_92] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_94] = "gt ::= relExpr '>'  subExpr .";
    artLabelStrings[ARTL_ART_gt_94] = "";
    artlhsL[ARTL_ART_gt_94] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_94] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_gt_94] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_gt_94] = true;
    arteoR_pL[ARTL_ART_gt_94] = true;
    artPopD[ARTL_ART_gt_94] = true;
  }

  public void artTableInitialiser_ART_if() {
    artLabelInternalStrings[ARTL_ART_if] = "if";
    artLabelStrings[ARTL_ART_if] = "if";
    artKindOfs[ARTL_ART_if] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_if_38] = "if ::= . 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_38] = "";
    artlhsL[ARTL_ART_if_38] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_38] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_40] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_39] = "if ::= 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_39] = "";
    artlhsL[ARTL_ART_if_39] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_40] = "if ::= 'if'  . relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_40] = "";
    artlhsL[ARTL_ART_if_40] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_40] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_if_40] = true;
    artLabelInternalStrings[ARTL_ART_if_42] = "if ::= 'if'  relExpr . statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_42] = "";
    artlhsL[ARTL_ART_if_42] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_42] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_if_42] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_44] = "if ::= 'if'  relExpr statement . 'else'  statement ";
    artLabelStrings[ARTL_ART_if_44] = "";
    artlhsL[ARTL_ART_if_44] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_44] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_44] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_46] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_45] = "if ::= 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_45] = "";
    artlhsL[ARTL_ART_if_45] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_46] = "if ::= 'if'  relExpr statement 'else'  . statement ";
    artLabelStrings[ARTL_ART_if_46] = "";
    artlhsL[ARTL_ART_if_46] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_46] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_48] = "if ::= 'if'  relExpr statement 'else'  statement .";
    artLabelStrings[ARTL_ART_if_48] = "";
    artlhsL[ARTL_ART_if_48] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_48] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_48] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_if_48] = true;
    arteoR_pL[ARTL_ART_if_48] = true;
    artPopD[ARTL_ART_if_48] = true;
  }

  public void artTableInitialiser_ART_ne() {
    artLabelInternalStrings[ARTL_ART_ne] = "ne";
    artLabelStrings[ARTL_ART_ne] = "ne";
    artKindOfs[ARTL_ART_ne] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ne_96] = "ne ::= . relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_96] = "";
    artlhsL[ARTL_ART_ne_96] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_96] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_98] = "ne ::= relExpr . '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_98] = "";
    artlhsL[ARTL_ART_ne_98] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_98] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_ne_98] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ne_98] = true;
    artFolds[ARTL_ART_ne_100] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_ne_99] = "ne ::= relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_99] = "";
    artlhsL[ARTL_ART_ne_99] = ARTL_ART_ne;
    artLabelInternalStrings[ARTL_ART_ne_100] = "ne ::= relExpr '!='  . subExpr ";
    artLabelStrings[ARTL_ART_ne_100] = "";
    artlhsL[ARTL_ART_ne_100] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_100] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_102] = "ne ::= relExpr '!='  subExpr .";
    artLabelStrings[ARTL_ART_ne_102] = "";
    artlhsL[ARTL_ART_ne_102] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_102] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_ne_102] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ne_102] = true;
    arteoR_pL[ARTL_ART_ne_102] = true;
    artPopD[ARTL_ART_ne_102] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_120] = "operand ::= . deref ";
    artLabelStrings[ARTL_ART_operand_120] = "";
    artlhsL[ARTL_ART_operand_120] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_120] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_122] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_122] = "operand ::= deref .";
    artLabelStrings[ARTL_ART_operand_122] = "";
    artlhsL[ARTL_ART_operand_122] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_122] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_operand_122] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_122] = true;
    arteoR_pL[ARTL_ART_operand_122] = true;
    artPopD[ARTL_ART_operand_122] = true;
    artLabelInternalStrings[ARTL_ART_operand_124] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_124] = "";
    artlhsL[ARTL_ART_operand_124] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_124] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_126] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_126] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_126] = "";
    artlhsL[ARTL_ART_operand_126] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_126] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_126] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_126] = true;
    arteoR_pL[ARTL_ART_operand_126] = true;
    artPopD[ARTL_ART_operand_126] = true;
    artLabelInternalStrings[ARTL_ART_operand_128] = "operand ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_128] = "";
    artlhsL[ARTL_ART_operand_128] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_128] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_130] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_129] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_129] = "";
    artlhsL[ARTL_ART_operand_129] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_130] = "operand ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_130] = "";
    artlhsL[ARTL_ART_operand_130] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_130] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_130] = true;
    artFolds[ARTL_ART_operand_132] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_132] = "operand ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_132] = "";
    artlhsL[ARTL_ART_operand_132] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_132] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_operand_132] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_132] = true;
    artFolds[ARTL_ART_operand_134] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_133] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_133] = "";
    artlhsL[ARTL_ART_operand_133] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_133] = true;
    artLabelInternalStrings[ARTL_ART_operand_134] = "operand ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_134] = "";
    artlhsL[ARTL_ART_operand_134] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_134] = true;
    arteoR_pL[ARTL_ART_operand_134] = true;
    artPopD[ARTL_ART_operand_134] = true;
  }

  public void artTableInitialiser_ART_relExpr() {
    artLabelInternalStrings[ARTL_ART_relExpr] = "relExpr";
    artLabelStrings[ARTL_ART_relExpr] = "relExpr";
    artKindOfs[ARTL_ART_relExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_relExpr_76] = "relExpr ::= . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_76] = "";
    artlhsL[ARTL_ART_relExpr_76] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_76] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_78] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_78] = "relExpr ::= subExpr .";
    artLabelStrings[ARTL_ART_relExpr_78] = "";
    artlhsL[ARTL_ART_relExpr_78] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_78] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_78] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_78] = true;
    arteoR_pL[ARTL_ART_relExpr_78] = true;
    artPopD[ARTL_ART_relExpr_78] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_80] = "relExpr ::= . gt ";
    artLabelStrings[ARTL_ART_relExpr_80] = "";
    artlhsL[ARTL_ART_relExpr_80] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_80] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_82] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_82] = "relExpr ::= gt .";
    artLabelStrings[ARTL_ART_relExpr_82] = "";
    artlhsL[ARTL_ART_relExpr_82] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_82] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_relExpr_82] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_82] = true;
    arteoR_pL[ARTL_ART_relExpr_82] = true;
    artPopD[ARTL_ART_relExpr_82] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_84] = "relExpr ::= . ne ";
    artLabelStrings[ARTL_ART_relExpr_84] = "";
    artlhsL[ARTL_ART_relExpr_84] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_84] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_86] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_86] = "relExpr ::= ne .";
    artLabelStrings[ARTL_ART_relExpr_86] = "";
    artlhsL[ARTL_ART_relExpr_86] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_86] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_relExpr_86] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_86] = true;
    arteoR_pL[ARTL_ART_relExpr_86] = true;
    artPopD[ARTL_ART_relExpr_86] = true;
  }

  public void artTableInitialiser_ART_seq() {
    artLabelInternalStrings[ARTL_ART_seq] = "seq";
    artLabelStrings[ARTL_ART_seq] = "seq";
    artKindOfs[ARTL_ART_seq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_seq_22] = "seq ::= . statement statement ";
    artLabelStrings[ARTL_ART_seq_22] = "";
    artlhsL[ARTL_ART_seq_22] = ARTL_ART_seq;
    artKindOfs[ARTL_ART_seq_22] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_seq_24] = "seq ::= statement . statement ";
    artLabelStrings[ARTL_ART_seq_24] = "";
    artlhsL[ARTL_ART_seq_24] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_24] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_24] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_seq_24] = true;
    artLabelInternalStrings[ARTL_ART_seq_26] = "seq ::= statement statement .";
    artLabelStrings[ARTL_ART_seq_26] = "";
    artlhsL[ARTL_ART_seq_26] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_26] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_26] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_seq_26] = true;
    arteoR_pL[ARTL_ART_seq_26] = true;
    artPopD[ARTL_ART_seq_26] = true;
  }

  public void artTableInitialiser_ART_statement() {
    artLabelInternalStrings[ARTL_ART_statement] = "statement";
    artLabelStrings[ARTL_ART_statement] = "statement";
    artKindOfs[ARTL_ART_statement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statement_2] = "statement ::= . seq ";
    artLabelStrings[ARTL_ART_statement_2] = "";
    artlhsL[ARTL_ART_statement_2] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_2] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_4] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_4] = "statement ::= seq .";
    artLabelStrings[ARTL_ART_statement_4] = "";
    artlhsL[ARTL_ART_statement_4] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_4] = ARTL_ART_seq;
    artKindOfs[ARTL_ART_statement_4] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_4] = true;
    arteoR_pL[ARTL_ART_statement_4] = true;
    artPopD[ARTL_ART_statement_4] = true;
    artLabelInternalStrings[ARTL_ART_statement_6] = "statement ::= . assign ";
    artLabelStrings[ARTL_ART_statement_6] = "";
    artlhsL[ARTL_ART_statement_6] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_6] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_8] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_8] = "statement ::= assign .";
    artLabelStrings[ARTL_ART_statement_8] = "";
    artlhsL[ARTL_ART_statement_8] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_8] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_statement_8] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_8] = true;
    arteoR_pL[ARTL_ART_statement_8] = true;
    artPopD[ARTL_ART_statement_8] = true;
    artLabelInternalStrings[ARTL_ART_statement_10] = "statement ::= . if ";
    artLabelStrings[ARTL_ART_statement_10] = "";
    artlhsL[ARTL_ART_statement_10] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_10] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_12] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_12] = "statement ::= if .";
    artLabelStrings[ARTL_ART_statement_12] = "";
    artlhsL[ARTL_ART_statement_12] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_12] = ARTL_ART_if;
    artKindOfs[ARTL_ART_statement_12] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_12] = true;
    arteoR_pL[ARTL_ART_statement_12] = true;
    artPopD[ARTL_ART_statement_12] = true;
    artLabelInternalStrings[ARTL_ART_statement_14] = "statement ::= . while ";
    artLabelStrings[ARTL_ART_statement_14] = "";
    artlhsL[ARTL_ART_statement_14] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_14] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_16] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_16] = "statement ::= while .";
    artLabelStrings[ARTL_ART_statement_16] = "";
    artlhsL[ARTL_ART_statement_16] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_16] = ARTL_ART_while;
    artKindOfs[ARTL_ART_statement_16] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_16] = true;
    arteoR_pL[ARTL_ART_statement_16] = true;
    artPopD[ARTL_ART_statement_16] = true;
    artLabelInternalStrings[ARTL_ART_statement_18] = "statement ::= . backend ";
    artLabelStrings[ARTL_ART_statement_18] = "";
    artlhsL[ARTL_ART_statement_18] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_18] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_20] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_20] = "statement ::= backend .";
    artLabelStrings[ARTL_ART_statement_20] = "";
    artlhsL[ARTL_ART_statement_20] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_20] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_statement_20] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_20] = true;
    arteoR_pL[ARTL_ART_statement_20] = true;
    artPopD[ARTL_ART_statement_20] = true;
  }

  public void artTableInitialiser_ART_sub() {
    artLabelInternalStrings[ARTL_ART_sub] = "sub";
    artLabelStrings[ARTL_ART_sub] = "sub";
    artKindOfs[ARTL_ART_sub] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_sub_112] = "sub ::= . subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_112] = "";
    artlhsL[ARTL_ART_sub_112] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_112] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_114] = "sub ::= subExpr . '-'  operand ";
    artLabelStrings[ARTL_ART_sub_114] = "";
    artlhsL[ARTL_ART_sub_114] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_114] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_sub_114] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sub_114] = true;
    artFolds[ARTL_ART_sub_116] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sub_115] = "sub ::= subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_115] = "";
    artlhsL[ARTL_ART_sub_115] = ARTL_ART_sub;
    artLabelInternalStrings[ARTL_ART_sub_116] = "sub ::= subExpr '-'  . operand ";
    artLabelStrings[ARTL_ART_sub_116] = "";
    artlhsL[ARTL_ART_sub_116] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_116] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_118] = "sub ::= subExpr '-'  operand .";
    artLabelStrings[ARTL_ART_sub_118] = "";
    artlhsL[ARTL_ART_sub_118] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_118] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_sub_118] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sub_118] = true;
    arteoR_pL[ARTL_ART_sub_118] = true;
    artPopD[ARTL_ART_sub_118] = true;
  }

  public void artTableInitialiser_ART_subExpr() {
    artLabelInternalStrings[ARTL_ART_subExpr] = "subExpr";
    artLabelStrings[ARTL_ART_subExpr] = "subExpr";
    artKindOfs[ARTL_ART_subExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExpr_104] = "subExpr ::= . operand ";
    artLabelStrings[ARTL_ART_subExpr_104] = "";
    artlhsL[ARTL_ART_subExpr_104] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_104] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_106] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_106] = "subExpr ::= operand .";
    artLabelStrings[ARTL_ART_subExpr_106] = "";
    artlhsL[ARTL_ART_subExpr_106] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_106] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_106] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_106] = true;
    arteoR_pL[ARTL_ART_subExpr_106] = true;
    artPopD[ARTL_ART_subExpr_106] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_108] = "subExpr ::= . sub ";
    artLabelStrings[ARTL_ART_subExpr_108] = "";
    artlhsL[ARTL_ART_subExpr_108] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_108] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_110] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_110] = "subExpr ::= sub .";
    artLabelStrings[ARTL_ART_subExpr_110] = "";
    artlhsL[ARTL_ART_subExpr_110] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_110] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_subExpr_110] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_110] = true;
    arteoR_pL[ARTL_ART_subExpr_110] = true;
    artPopD[ARTL_ART_subExpr_110] = true;
  }

  public void artTableInitialiser_ART_while() {
    artLabelInternalStrings[ARTL_ART_while] = "while";
    artLabelStrings[ARTL_ART_while] = "while";
    artKindOfs[ARTL_ART_while] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_while_50] = "while ::= . 'while'  relExpr statement ";
    artLabelStrings[ARTL_ART_while_50] = "";
    artlhsL[ARTL_ART_while_50] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_50] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_52] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_51] = "while ::= 'while'  relExpr statement ";
    artLabelStrings[ARTL_ART_while_51] = "";
    artlhsL[ARTL_ART_while_51] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_52] = "while ::= 'while'  . relExpr statement ";
    artLabelStrings[ARTL_ART_while_52] = "";
    artlhsL[ARTL_ART_while_52] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_52] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_while_52] = true;
    artLabelInternalStrings[ARTL_ART_while_54] = "while ::= 'while'  relExpr . statement ";
    artLabelStrings[ARTL_ART_while_54] = "";
    artlhsL[ARTL_ART_while_54] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_54] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_while_54] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_while_56] = "while ::= 'while'  relExpr statement .";
    artLabelStrings[ARTL_ART_while_56] = "";
    artlhsL[ARTL_ART_while_56] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_56] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_while_56] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_while_56] = true;
    arteoR_pL[ARTL_ART_while_56] = true;
    artPopD[ARTL_ART_while_56] = true;
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

    artLabelStrings[ARTTB_ID] = "ID";
    artLabelInternalStrings[ARTTB_ID] = "&ID";
    artKindOfs[ARTTB_ID] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_ID] = true;
    artLabelStrings[ARTTB_INTEGER] = "INTEGER";
    artLabelInternalStrings[ARTTB_INTEGER] = "&INTEGER";
    artKindOfs[ARTTB_INTEGER] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_INTEGER] = true;
    artLabelStrings[ARTTB_SIMPLE_WHITESPACE] = "SIMPLE_WHITESPACE";
    artLabelInternalStrings[ARTTB_SIMPLE_WHITESPACE] = "&SIMPLE_WHITESPACE";
    artKindOfs[ARTTB_SIMPLE_WHITESPACE] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_SIMPLE_WHITESPACE] = true;
    artLabelStrings[ARTTS__SHREIK_EQUAL] = "!=";
    artLabelInternalStrings[ARTTS__SHREIK_EQUAL] = "'!='";
    artKindOfs[ARTTS__SHREIK_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK_EQUAL] = true;
    artLabelStrings[ARTTS__LPAR] = "(";
    artLabelInternalStrings[ARTTS__LPAR] = "'('";
    artKindOfs[ARTTS__LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LPAR] = true;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS] = "-";
    artLabelInternalStrings[ARTTS__MINUS] = "'-'";
    artKindOfs[ARTTS__MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS] = true;
    artLabelStrings[ARTTS__COLON_EQUAL] = ":=";
    artLabelInternalStrings[ARTTS__COLON_EQUAL] = "':='";
    artKindOfs[ARTTS__COLON_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COLON_EQUAL] = true;
    artLabelStrings[ARTTS__SEMICOLON] = ";";
    artLabelInternalStrings[ARTTS__SEMICOLON] = "';'";
    artKindOfs[ARTTS__SEMICOLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SEMICOLON] = true;
    artLabelStrings[ARTTS__GT] = ">";
    artLabelInternalStrings[ARTTS__GT] = "'>'";
    artKindOfs[ARTTS__GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT] = true;
    artLabelStrings[ARTTS_backend] = "backend";
    artLabelInternalStrings[ARTTS_backend] = "'backend'";
    artKindOfs[ARTTS_backend] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_backend] = true;
    artLabelStrings[ARTTS_else] = "else";
    artLabelInternalStrings[ARTTS_else] = "'else'";
    artKindOfs[ARTTS_else] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_else] = true;
    artLabelStrings[ARTTS_if] = "if";
    artLabelInternalStrings[ARTTS_if] = "'if'";
    artKindOfs[ARTTS_if] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_if] = true;
    artLabelStrings[ARTTS_while] = "while";
    artLabelInternalStrings[ARTTS_while] = "'while'";
    artKindOfs[ARTTS_while] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_while] = true;
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_assign();
    artTableInitialiser_ART_backend();
    artTableInitialiser_ART_deref();
    artTableInitialiser_ART_gt();
    artTableInitialiser_ART_if();
    artTableInitialiser_ART_ne();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_relExpr();
    artTableInitialiser_ART_seq();
    artTableInitialiser_ART_statement();
    artTableInitialiser_ART_sub();
    artTableInitialiser_ART_subExpr();
    artTableInitialiser_ART_while();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__SHREIK_EQUAL;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 32;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_statement;
    artBuildDirectives = "ARTDirectives [verbosityLevel=0, statistics=false, trace=false, inputs=[], inputFilenames=[], lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;
  public static class ARTAT_ART_ID extends ARTGLLAttributeBlock {
    public int rightExtent;
    public ARTValueString v;
    public int leftExtent;
    public String lexeme;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " v=" + v;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public static class ARTAT_ART_INTEGER extends ARTGLLAttributeBlock {
    public ARTValueInteger32 v;
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*ID ::= &ID  .*/
      case ARTL_ART_ID_142: 
                ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID);
                if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
        ID.lexeme = artLexeme(ID.leftExtent, ID.rightExtent);
  ID.v = new ARTValueString(artLexemeAsID(ID.leftExtent, ID.rightExtent)); 
        break;
        default:
          throw new ARTException("ARTRD_ID: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_INTEGER(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*INTEGER ::= &INTEGER  .*/
    case ARTL_ART_INTEGER_148: 
            ARTRD_INTEGER(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER);
            if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       INTEGER.lexeme = artLexeme(INTEGER.leftExtent, INTEGER.rightExtent);
  INTEGER.v = new ARTValueInteger32(artLexemeAsInteger(INTEGER.leftExtent, INTEGER.rightExtent)); 
      break;
        default:
          throw new ARTException("ARTRD_INTEGER: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_assign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*assign ::= ID ':='  . subExpr ';'  */
    case ARTL_ART_assign_32: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                        break;
    /*assign ::= ID ':='  subExpr . ';'  */
    case ARTL_ART_assign_34: 
      ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*assign ::= ID ':='  subExpr ';'  .*/
    case ARTL_ART_assign_36: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
                  break;
        default:
          throw new ARTException("ARTRD_assign: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_backend(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*backend ::= 'backend'  '('  . subExpr ','  subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_62: 
                              break;
    /*backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_64: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_66: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  */
    case ARTL_ART_backend_68: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  */
    case ARTL_ART_backend_70: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  */
    case ARTL_ART_backend_72: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .*/
    case ARTL_ART_backend_74: 
            ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_backend: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_deref(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*deref ::= ID .*/
    case ARTL_ART_deref_138: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
        default:
          throw new ARTException("ARTRD_deref: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_gt(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*gt ::= relExpr '>'  . subExpr */
    case ARTL_ART_gt_92: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*gt ::= relExpr '>'  subExpr .*/
    case ARTL_ART_gt_94: 
            ARTRD_gt(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_gt: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_if(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*if ::= 'if'  relExpr . statement 'else'  statement */
    case ARTL_ART_if_42: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  relExpr statement . 'else'  statement */
    case ARTL_ART_if_44: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  relExpr statement 'else'  . statement */
    case ARTL_ART_if_46: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  relExpr statement 'else'  statement .*/
    case ARTL_ART_if_48: 
            ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_if: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ne(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ne ::= relExpr '!='  . subExpr */
    case ARTL_ART_ne_100: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ne ::= relExpr '!='  subExpr .*/
    case ARTL_ART_ne_102: 
            ARTRD_ne(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ne: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_operand(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*operand ::= deref .*/
    case ARTL_ART_operand_122: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_126: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*operand ::= '('  subExpr . ')'  */
    case ARTL_ART_operand_132: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*operand ::= '('  subExpr ')'  .*/
    case ARTL_ART_operand_134: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1);
                  break;
        default:
          throw new ARTException("ARTRD_operand: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_relExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*relExpr ::= subExpr .*/
    case ARTL_ART_relExpr_78: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= gt .*/
    case ARTL_ART_relExpr_82: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_gt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= ne .*/
    case ARTL_ART_relExpr_86: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ne(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_relExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_seq(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*seq ::= statement statement .*/
    case ARTL_ART_seq_26: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_seq: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statement ::= seq .*/
    case ARTL_ART_statement_4: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_seq(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= assign .*/
    case ARTL_ART_statement_8: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_assign(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= if .*/
    case ARTL_ART_statement_12: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_if(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= while .*/
    case ARTL_ART_statement_16: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_while(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= backend .*/
    case ARTL_ART_statement_20: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_backend(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_statement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_sub(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*sub ::= subExpr '-'  . operand */
    case ARTL_ART_sub_116: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*sub ::= subExpr '-'  operand .*/
    case ARTL_ART_sub_118: 
            ARTRD_sub(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_sub: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExpr ::= operand .*/
    case ARTL_ART_subExpr_106: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*subExpr ::= sub .*/
    case ARTL_ART_subExpr_110: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sub(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_subExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_while(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*while ::= 'while'  relExpr . statement */
    case ARTL_ART_while_54: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*while ::= 'while'  relExpr statement .*/
    case ARTL_ART_while_56: 
            ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_while: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_ID:  ARTRD_ID(artElement.element, artParent, artWriteable, (ARTAT_ART_ID) artAttributes); break;
    case ARTL_ART_INTEGER:  ARTRD_INTEGER(artElement.element, artParent, artWriteable, (ARTAT_ART_INTEGER) artAttributes); break;
    case ARTL_ART_assign: ARTRD_assign(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_backend: ARTRD_backend(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_deref: ARTRD_deref(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_gt: ARTRD_gt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_if: ARTRD_if(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ne: ARTRD_ne(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_operand: ARTRD_operand(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_relExpr: ARTRD_relExpr(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_seq: ARTRD_seq(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_statement: ARTRD_statement(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_sub: ARTRD_sub(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_subExpr: ARTRD_subExpr(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_while: ARTRD_while(artElement.element, artParent, artWriteable); break;
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
