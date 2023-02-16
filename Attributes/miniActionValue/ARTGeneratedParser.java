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
public class ARTGeneratedParser extends ARTGLLParserHashPool {
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
  private static boolean[] ARTSet33;
  private static boolean[] ARTSet34;
  private static boolean[] ARTSet35;
  private static boolean[] ARTSet36;
  private static boolean[] ARTSet37;
  private static boolean[] ARTSet38;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_INTEGER = 1;
  public static final int ARTTB_SIMPLE_WHITESPACE = 2;
  public static final int ARTTB_STRING_DQ = 3;
  public static final int ARTTS__SHREIK_EQUAL = 4;
  public static final int ARTTS__PERCENT = 5;
  public static final int ARTTS__LPAR = 6;
  public static final int ARTTS__RPAR = 7;
  public static final int ARTTS__STAR = 8;
  public static final int ARTTS__STAR_STAR = 9;
  public static final int ARTTS__PLUS = 10;
  public static final int ARTTS__COMMA = 11;
  public static final int ARTTS__MINUS = 12;
  public static final int ARTTS__SLASH = 13;
  public static final int ARTTS__SEMICOLON = 14;
  public static final int ARTTS__LT = 15;
  public static final int ARTTS__LT_EQUAL = 16;
  public static final int ARTTS__EQUAL_EQUAL = 17;
  public static final int ARTTS__GT = 18;
  public static final int ARTTS__GT_EQUAL = 19;
  public static final int ARTTS_print = 20;
  public static final int ARTX_EPSILON = 21;
  public static final int ARTL_ART_INTEGER = 22;
  public static final int ARTL_ART_STRING_DQ = 23;
  public static final int ARTL_ART_e0 = 24;
  public static final int ARTL_ART_e1 = 25;
  public static final int ARTL_ART_e2 = 26;
  public static final int ARTL_ART_e3 = 27;
  public static final int ARTL_ART_e4 = 28;
  public static final int ARTL_ART_e5 = 29;
  public static final int ARTL_ART_printElements = 30;
  public static final int ARTL_ART_statement = 31;
  public static final int ARTL_ART_INTEGER_227 = 32;
  public static final int ARTL_ART_INTEGER_228 = 33;
  public static final int ARTL_ART_INTEGER_229 = 34;
  public static final int ARTL_ART_INTEGER_230 = 35;
  public static final int ARTL_ART_STRING_DQ_233 = 36;
  public static final int ARTL_ART_STRING_DQ_234 = 37;
  public static final int ARTL_ART_STRING_DQ_235 = 38;
  public static final int ARTL_ART_STRING_DQ_236 = 39;
  public static final int ARTL_ART_e0_45 = 40;
  public static final int ARTL_ART_e0_46 = 41;
  public static final int ARTL_ART_e0_47 = 42;
  public static final int ARTL_ART_e0_48 = 43;
  public static final int ARTL_ART_e0_51 = 44;
  public static final int ARTL_ART_e0_52 = 45;
  public static final int ARTL_ART_e0_53 = 46;
  public static final int ARTL_ART_e0_54 = 47;
  public static final int ARTL_ART_e0_55 = 48;
  public static final int ARTL_ART_e0_56 = 49;
  public static final int ARTL_ART_e0_57 = 50;
  public static final int ARTL_ART_e0_58 = 51;
  public static final int ARTL_ART_e0_61 = 52;
  public static final int ARTL_ART_e0_62 = 53;
  public static final int ARTL_ART_e0_63 = 54;
  public static final int ARTL_ART_e0_64 = 55;
  public static final int ARTL_ART_e0_65 = 56;
  public static final int ARTL_ART_e0_66 = 57;
  public static final int ARTL_ART_e0_67 = 58;
  public static final int ARTL_ART_e0_68 = 59;
  public static final int ARTL_ART_e0_71 = 60;
  public static final int ARTL_ART_e0_72 = 61;
  public static final int ARTL_ART_e0_73 = 62;
  public static final int ARTL_ART_e0_74 = 63;
  public static final int ARTL_ART_e0_75 = 64;
  public static final int ARTL_ART_e0_76 = 65;
  public static final int ARTL_ART_e0_77 = 66;
  public static final int ARTL_ART_e0_78 = 67;
  public static final int ARTL_ART_e0_81 = 68;
  public static final int ARTL_ART_e0_82 = 69;
  public static final int ARTL_ART_e0_83 = 70;
  public static final int ARTL_ART_e0_84 = 71;
  public static final int ARTL_ART_e0_85 = 72;
  public static final int ARTL_ART_e0_86 = 73;
  public static final int ARTL_ART_e0_87 = 74;
  public static final int ARTL_ART_e0_88 = 75;
  public static final int ARTL_ART_e0_91 = 76;
  public static final int ARTL_ART_e0_92 = 77;
  public static final int ARTL_ART_e0_93 = 78;
  public static final int ARTL_ART_e0_94 = 79;
  public static final int ARTL_ART_e0_95 = 80;
  public static final int ARTL_ART_e0_96 = 81;
  public static final int ARTL_ART_e0_97 = 82;
  public static final int ARTL_ART_e0_98 = 83;
  public static final int ARTL_ART_e0_101 = 84;
  public static final int ARTL_ART_e0_102 = 85;
  public static final int ARTL_ART_e0_103 = 86;
  public static final int ARTL_ART_e0_104 = 87;
  public static final int ARTL_ART_e0_105 = 88;
  public static final int ARTL_ART_e0_106 = 89;
  public static final int ARTL_ART_e0_107 = 90;
  public static final int ARTL_ART_e0_108 = 91;
  public static final int ARTL_ART_e1_111 = 92;
  public static final int ARTL_ART_e1_112 = 93;
  public static final int ARTL_ART_e1_113 = 94;
  public static final int ARTL_ART_e1_114 = 95;
  public static final int ARTL_ART_e1_117 = 96;
  public static final int ARTL_ART_e1_118 = 97;
  public static final int ARTL_ART_e1_119 = 98;
  public static final int ARTL_ART_e1_120 = 99;
  public static final int ARTL_ART_e1_121 = 100;
  public static final int ARTL_ART_e1_122 = 101;
  public static final int ARTL_ART_e1_123 = 102;
  public static final int ARTL_ART_e1_124 = 103;
  public static final int ARTL_ART_e1_127 = 104;
  public static final int ARTL_ART_e1_128 = 105;
  public static final int ARTL_ART_e1_129 = 106;
  public static final int ARTL_ART_e1_130 = 107;
  public static final int ARTL_ART_e1_131 = 108;
  public static final int ARTL_ART_e1_132 = 109;
  public static final int ARTL_ART_e1_133 = 110;
  public static final int ARTL_ART_e1_134 = 111;
  public static final int ARTL_ART_e2_137 = 112;
  public static final int ARTL_ART_e2_138 = 113;
  public static final int ARTL_ART_e2_139 = 114;
  public static final int ARTL_ART_e2_140 = 115;
  public static final int ARTL_ART_e2_143 = 116;
  public static final int ARTL_ART_e2_144 = 117;
  public static final int ARTL_ART_e2_145 = 118;
  public static final int ARTL_ART_e2_146 = 119;
  public static final int ARTL_ART_e2_147 = 120;
  public static final int ARTL_ART_e2_148 = 121;
  public static final int ARTL_ART_e2_149 = 122;
  public static final int ARTL_ART_e2_150 = 123;
  public static final int ARTL_ART_e2_153 = 124;
  public static final int ARTL_ART_e2_154 = 125;
  public static final int ARTL_ART_e2_155 = 126;
  public static final int ARTL_ART_e2_156 = 127;
  public static final int ARTL_ART_e2_157 = 128;
  public static final int ARTL_ART_e2_158 = 129;
  public static final int ARTL_ART_e2_159 = 130;
  public static final int ARTL_ART_e2_160 = 131;
  public static final int ARTL_ART_e2_163 = 132;
  public static final int ARTL_ART_e2_164 = 133;
  public static final int ARTL_ART_e2_165 = 134;
  public static final int ARTL_ART_e2_166 = 135;
  public static final int ARTL_ART_e2_167 = 136;
  public static final int ARTL_ART_e2_168 = 137;
  public static final int ARTL_ART_e2_169 = 138;
  public static final int ARTL_ART_e2_170 = 139;
  public static final int ARTL_ART_e3_173 = 140;
  public static final int ARTL_ART_e3_174 = 141;
  public static final int ARTL_ART_e3_175 = 142;
  public static final int ARTL_ART_e3_176 = 143;
  public static final int ARTL_ART_e3_179 = 144;
  public static final int ARTL_ART_e3_180 = 145;
  public static final int ARTL_ART_e3_181 = 146;
  public static final int ARTL_ART_e3_182 = 147;
  public static final int ARTL_ART_e3_183 = 148;
  public static final int ARTL_ART_e3_184 = 149;
  public static final int ARTL_ART_e3_187 = 150;
  public static final int ARTL_ART_e3_188 = 151;
  public static final int ARTL_ART_e3_189 = 152;
  public static final int ARTL_ART_e3_190 = 153;
  public static final int ARTL_ART_e3_191 = 154;
  public static final int ARTL_ART_e3_192 = 155;
  public static final int ARTL_ART_e4_195 = 156;
  public static final int ARTL_ART_e4_196 = 157;
  public static final int ARTL_ART_e4_197 = 158;
  public static final int ARTL_ART_e4_198 = 159;
  public static final int ARTL_ART_e4_201 = 160;
  public static final int ARTL_ART_e4_202 = 161;
  public static final int ARTL_ART_e4_203 = 162;
  public static final int ARTL_ART_e4_204 = 163;
  public static final int ARTL_ART_e4_205 = 164;
  public static final int ARTL_ART_e4_206 = 165;
  public static final int ARTL_ART_e4_207 = 166;
  public static final int ARTL_ART_e4_208 = 167;
  public static final int ARTL_ART_e5_211 = 168;
  public static final int ARTL_ART_e5_212 = 169;
  public static final int ARTL_ART_e5_213 = 170;
  public static final int ARTL_ART_e5_214 = 171;
  public static final int ARTL_ART_e5_217 = 172;
  public static final int ARTL_ART_e5_218 = 173;
  public static final int ARTL_ART_e5_219 = 174;
  public static final int ARTL_ART_e5_220 = 175;
  public static final int ARTL_ART_e5_221 = 176;
  public static final int ARTL_ART_e5_222 = 177;
  public static final int ARTL_ART_e5_225 = 178;
  public static final int ARTL_ART_e5_226 = 179;
  public static final int ARTL_ART_printElements_13 = 180;
  public static final int ARTL_ART_printElements_14 = 181;
  public static final int ARTL_ART_printElements_15 = 182;
  public static final int ARTL_ART_printElements_16 = 183;
  public static final int ARTL_ART_printElements_19 = 184;
  public static final int ARTL_ART_printElements_20 = 185;
  public static final int ARTL_ART_printElements_21 = 186;
  public static final int ARTL_ART_printElements_22 = 187;
  public static final int ARTL_ART_printElements_25 = 188;
  public static final int ARTL_ART_printElements_26 = 189;
  public static final int ARTL_ART_printElements_27 = 190;
  public static final int ARTL_ART_printElements_28 = 191;
  public static final int ARTL_ART_printElements_29 = 192;
  public static final int ARTL_ART_printElements_30 = 193;
  public static final int ARTL_ART_printElements_31 = 194;
  public static final int ARTL_ART_printElements_32 = 195;
  public static final int ARTL_ART_printElements_35 = 196;
  public static final int ARTL_ART_printElements_36 = 197;
  public static final int ARTL_ART_printElements_37 = 198;
  public static final int ARTL_ART_printElements_38 = 199;
  public static final int ARTL_ART_printElements_41 = 200;
  public static final int ARTL_ART_printElements_42 = 201;
  public static final int ARTL_ART_printElements_43 = 202;
  public static final int ARTL_ART_printElements_44 = 203;
  public static final int ARTL_ART_statement_1 = 204;
  public static final int ARTL_ART_statement_2 = 205;
  public static final int ARTL_ART_statement_3 = 206;
  public static final int ARTL_ART_statement_4 = 207;
  public static final int ARTL_ART_statement_5 = 208;
  public static final int ARTL_ART_statement_6 = 209;
  public static final int ARTL_ART_statement_7 = 210;
  public static final int ARTL_ART_statement_8 = 211;
  public static final int ARTL_ART_statement_9 = 212;
  public static final int ARTL_ART_statement_10 = 213;
  public static final int ARTL_ART_statement_11 = 214;
  public static final int ARTL_ART_statement_12 = 215;
  public static final int ARTX_DESPATCH = 216;
  public static final int ARTX_DUMMY = 217;
  public static final int ARTX_LABEL_EXTENT = 218;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_INTEGER() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal INTEGER production descriptor loads*/
      case ARTL_ART_INTEGER: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_INTEGER_228, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_228: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_230, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_STRING_DQ() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal STRING_DQ production descriptor loads*/
      case ARTL_ART_STRING_DQ: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_STRING_DQ_234, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_234: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_236, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e0() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e0 production descriptor loads*/
      case ARTL_ART_e0: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_46, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_52, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_62, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_72, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_82, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_92, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_102, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_46: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_48, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_48: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_52: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_54, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_54: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_56, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_58, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_58: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_62: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_64, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_64: 
        /* Nonterminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_66, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_68, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_68: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_72: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_74, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_74: 
        /* Nonterminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_76, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_78, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_78: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_82: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_84, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_84: 
        /* Nonterminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_86, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_88, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_88: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_92: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_94, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_94: 
        /* Nonterminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_96, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_98, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_98: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_102: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_104, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_104: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_106, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_108, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_108: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e1() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e1 production descriptor loads*/
      case ARTL_ART_e1: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_112, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_118, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_128, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_112: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_114, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_114: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_118: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_120, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e1_120: 
        /* Nonterminal template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e1_122, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_124, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_124: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_128: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_130, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e1_130: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e1_132, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_134, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_134: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e2() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e2 production descriptor loads*/
      case ARTL_ART_e2: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_138, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_144, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_154, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_164, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_138: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_140, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_140: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_144: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_146, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_146: 
        /* Nonterminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_148, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_150, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_150: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_154: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_156, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_156: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_158, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_160, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_160: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_164: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_166, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_166: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERCENT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_168, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_170, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_170: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e3() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e3 production descriptor loads*/
      case ARTL_ART_e3: 
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_174, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_180, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_188, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_174: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_176, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e4; return; }
      case ARTL_ART_e3_176: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_180: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e3_182, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_184, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e3_184: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_188: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e3_190, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_192, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e3_192: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e4() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e4 production descriptor loads*/
      case ARTL_ART_e4: 
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e4_196, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e4_202, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e4: match production*/
      case ARTL_ART_e4_196: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_198, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e5; return; }
      case ARTL_ART_e4_198: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e4: match production*/
      case ARTL_ART_e4_202: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_204, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e5; return; }
      case ARTL_ART_e4_204: 
        /* Nonterminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR_STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e4_206, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_208, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e4; return; }
      case ARTL_ART_e4_208: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e5() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e5 production descriptor loads*/
      case ARTL_ART_e5: 
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e5_212, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e5_218, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e5: match production*/
      case ARTL_ART_e5_212: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e5_214, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_e5_214: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e5: match production*/
      case ARTL_ART_e5_218: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e5_220, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e5_222, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e5_222: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e5_226, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_printElements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal printElements production descriptor loads*/
      case ARTL_ART_printElements: 
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_20, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_30, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_36, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_14: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_16, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_printElements_16: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_20: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_22, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_printElements_22: 
        /* Nonterminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printElements_26, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_28, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_printElements_28: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_30: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_32, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_printElements_32: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_36: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_38, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_printElements_38: 
        /* Nonterminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printElements_42, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_44, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_printElements_44: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_2: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_print, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_4, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_6, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_8, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_statement_8: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_10, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_12, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        case ARTL_ART_INTEGER: 
          ARTPF_ART_INTEGER();
          break;
        case ARTL_ART_STRING_DQ: 
          ARTPF_ART_STRING_DQ();
          break;
        case ARTL_ART_e0: 
          ARTPF_ART_e0();
          break;
        case ARTL_ART_e1: 
          ARTPF_ART_e1();
          break;
        case ARTL_ART_e2: 
          ARTPF_ART_e2();
          break;
        case ARTL_ART_e3: 
          ARTPF_ART_e3();
          break;
        case ARTL_ART_e4: 
          ARTPF_ART_e4();
          break;
        case ARTL_ART_e5: 
          ARTPF_ART_e5();
          break;
        case ARTL_ART_printElements: 
          ARTPF_ART_printElements();
          break;
        case ARTL_ART_statement: 
          ARTPF_ART_statement();
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

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTB_INTEGER] = true;
    ARTSet19[ARTTS__LPAR] = true;
    ARTSet19[ARTTS__PLUS] = true;
    ARTSet19[ARTTS__MINUS] = true;
    ARTSet19[ARTL_ART_INTEGER] = true;
    ARTSet19[ARTL_ART_e3] = true;
    ARTSet19[ARTL_ART_e4] = true;
    ARTSet19[ARTL_ART_e5] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTX_EOS] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTB_INTEGER] = true;
    ARTSet28[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTS__SHREIK_EQUAL] = true;
    ARTSet3[ARTTS__PERCENT] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__STAR] = true;
    ARTSet3[ARTTS__STAR_STAR] = true;
    ARTSet3[ARTTS__PLUS] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__SLASH] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__LT_EQUAL] = true;
    ARTSet3[ARTTS__EQUAL_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTB_INTEGER] = true;
    ARTSet23[ARTTS__LPAR] = true;
    ARTSet23[ARTTS__PLUS] = true;
    ARTSet23[ARTTS__MINUS] = true;
    ARTSet23[ARTL_ART_INTEGER] = true;
    ARTSet23[ARTL_ART_e4] = true;
    ARTSet23[ARTL_ART_e5] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTB_STRING_DQ] = true;
    ARTSet32[ARTL_ART_STRING_DQ] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__COMMA] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__SHREIK_EQUAL] = true;
    ARTSet18[ARTTS__PERCENT] = true;
    ARTSet18[ARTTS__RPAR] = true;
    ARTSet18[ARTTS__STAR] = true;
    ARTSet18[ARTTS__PLUS] = true;
    ARTSet18[ARTTS__COMMA] = true;
    ARTSet18[ARTTS__MINUS] = true;
    ARTSet18[ARTTS__SLASH] = true;
    ARTSet18[ARTTS__LT] = true;
    ARTSet18[ARTTS__LT_EQUAL] = true;
    ARTSet18[ARTTS__EQUAL_EQUAL] = true;
    ARTSet18[ARTTS__GT] = true;
    ARTSet18[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTB_INTEGER] = true;
    ARTSet35[ARTTS__LPAR] = true;
    ARTSet35[ARTTS__PLUS] = true;
    ARTSet35[ARTTS__MINUS] = true;
    ARTSet35[ARTL_ART_INTEGER] = true;
    ARTSet35[ARTL_ART_e0] = true;
    ARTSet35[ARTL_ART_e1] = true;
    ARTSet35[ARTL_ART_e2] = true;
    ARTSet35[ARTL_ART_e3] = true;
    ARTSet35[ARTL_ART_e4] = true;
    ARTSet35[ARTL_ART_e5] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTB_INTEGER] = true;
    ARTSet31[ARTTB_STRING_DQ] = true;
    ARTSet31[ARTTS__LPAR] = true;
    ARTSet31[ARTTS__PLUS] = true;
    ARTSet31[ARTTS__MINUS] = true;
    ARTSet31[ARTL_ART_INTEGER] = true;
    ARTSet31[ARTL_ART_STRING_DQ] = true;
    ARTSet31[ARTL_ART_e0] = true;
    ARTSet31[ARTL_ART_e1] = true;
    ARTSet31[ARTL_ART_e2] = true;
    ARTSet31[ARTL_ART_e3] = true;
    ARTSet31[ARTL_ART_e4] = true;
    ARTSet31[ARTL_ART_e5] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__SHREIK_EQUAL] = true;
    ARTSet14[ARTTS__RPAR] = true;
    ARTSet14[ARTTS__PLUS] = true;
    ARTSet14[ARTTS__COMMA] = true;
    ARTSet14[ARTTS__MINUS] = true;
    ARTSet14[ARTTS__LT] = true;
    ARTSet14[ARTTS__LT_EQUAL] = true;
    ARTSet14[ARTTS__EQUAL_EQUAL] = true;
    ARTSet14[ARTTS__GT] = true;
    ARTSet14[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_INTEGER] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTB_INTEGER] = true;
    ARTSet34[ARTTB_STRING_DQ] = true;
    ARTSet34[ARTTS__LPAR] = true;
    ARTSet34[ARTTS__PLUS] = true;
    ARTSet34[ARTTS__MINUS] = true;
    ARTSet34[ARTL_ART_INTEGER] = true;
    ARTSet34[ARTL_ART_STRING_DQ] = true;
    ARTSet34[ARTL_ART_e0] = true;
    ARTSet34[ARTL_ART_e1] = true;
    ARTSet34[ARTL_ART_e2] = true;
    ARTSet34[ARTL_ART_e3] = true;
    ARTSet34[ARTL_ART_e4] = true;
    ARTSet34[ARTL_ART_e5] = true;
    ARTSet34[ARTL_ART_printElements] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS__PERCENT] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTB_INTEGER] = true;
    ARTSet25[ARTTS__LPAR] = true;
    ARTSet25[ARTL_ART_INTEGER] = true;
    ARTSet25[ARTL_ART_e5] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS__LPAR] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS__RPAR] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS__STAR] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS__PLUS] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTB_INTEGER] = true;
    ARTSet15[ARTTS__LPAR] = true;
    ARTSet15[ARTTS__PLUS] = true;
    ARTSet15[ARTTS__MINUS] = true;
    ARTSet15[ARTL_ART_INTEGER] = true;
    ARTSet15[ARTL_ART_e2] = true;
    ARTSet15[ARTL_ART_e3] = true;
    ARTSet15[ARTL_ART_e4] = true;
    ARTSet15[ARTL_ART_e5] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS__COMMA] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS__MINUS] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTB_INTEGER] = true;
    ARTSet27[ARTTS__LPAR] = true;
    ARTSet27[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS__SLASH] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_INTEGER] = true;
    ARTSet7[ARTTS__LPAR] = true;
    ARTSet7[ARTTS__PLUS] = true;
    ARTSet7[ARTTS__MINUS] = true;
    ARTSet7[ARTL_ART_INTEGER] = true;
    ARTSet7[ARTL_ART_e1] = true;
    ARTSet7[ARTL_ART_e2] = true;
    ARTSet7[ARTL_ART_e3] = true;
    ARTSet7[ARTL_ART_e4] = true;
    ARTSet7[ARTL_ART_e5] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS_print] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS__LT] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTB_INTEGER] = true;
    ARTSet24[ARTTS__LPAR] = true;
    ARTSet24[ARTL_ART_INTEGER] = true;
    ARTSet24[ARTL_ART_e4] = true;
    ARTSet24[ARTL_ART_e5] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTS__GT] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS__STAR_STAR] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS__LT_EQUAL] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet19initialise();
    ARTSet37initialise();
    ARTSet28initialise();
    ARTSet3initialise();
    ARTSet23initialise();
    ARTSet32initialise();
    ARTSet6initialise();
    ARTSet18initialise();
    ARTSet35initialise();
    ARTSet31initialise();
    ARTSet14initialise();
    ARTSet12initialise();
    ARTSet2initialise();
    ARTSet34initialise();
    ARTSet22initialise();
    ARTSet25initialise();
    ARTSet29initialise();
    ARTSet30initialise();
    ARTSet20initialise();
    ARTSet16initialise();
    ARTSet15initialise();
    ARTSet33initialise();
    ARTSet5initialise();
    ARTSet17initialise();
    ARTSet27initialise();
    ARTSet21initialise();
    ARTSet7initialise();
    ARTSet36initialise();
    ARTSet38initialise();
    ARTSet9initialise();
    ARTSet13initialise();
    ARTSet24initialise();
    ARTSet4initialise();
    ARTSet8initialise();
    ARTSet10initialise();
    ARTSet26initialise();
    ARTSet11initialise();
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_228] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_228] = "";
    artlhsL[ARTL_ART_INTEGER_228] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_228] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_228] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_229] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_229] = "";
    artlhsL[ARTL_ART_INTEGER_229] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_229] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_230] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_230] = "";
    artlhsL[ARTL_ART_INTEGER_230] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_230] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_230] = true;
    arteoR_pL[ARTL_ART_INTEGER_230] = true;
    artPopD[ARTL_ART_INTEGER_230] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_234] = "STRING_DQ ::= . &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_234] = "";
    artlhsL[ARTL_ART_STRING_DQ_234] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_234] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_234] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_235] = "STRING_DQ ::= &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_235] = "";
    artlhsL[ARTL_ART_STRING_DQ_235] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_235] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_236] = "STRING_DQ ::= &STRING_DQ  .";
    artLabelStrings[ARTL_ART_STRING_DQ_236] = "";
    artlhsL[ARTL_ART_STRING_DQ_236] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_236] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_236] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_236] = true;
    artPopD[ARTL_ART_STRING_DQ_236] = true;
  }

  public void artTableInitialiser_ART_e0() {
    artLabelInternalStrings[ARTL_ART_e0] = "e0";
    artLabelStrings[ARTL_ART_e0] = "e0";
    artKindOfs[ARTL_ART_e0] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e0_46] = "e0 ::= . e1 ";
    artLabelStrings[ARTL_ART_e0_46] = "";
    artlhsL[ARTL_ART_e0_46] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_46] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_48] = "e0 ::= e1 .";
    artLabelStrings[ARTL_ART_e0_48] = "";
    artlhsL[ARTL_ART_e0_48] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_48] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_48] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_48] = true;
    arteoR_pL[ARTL_ART_e0_48] = true;
    artPopD[ARTL_ART_e0_48] = true;
    artLabelInternalStrings[ARTL_ART_e0_52] = "e0 ::= . e1 '>'  e1 ";
    artLabelStrings[ARTL_ART_e0_52] = "";
    artlhsL[ARTL_ART_e0_52] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_52] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_54] = "e0 ::= e1 . '>'  e1 ";
    artLabelStrings[ARTL_ART_e0_54] = "";
    artlhsL[ARTL_ART_e0_54] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_54] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_54] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_54] = true;
    artLabelInternalStrings[ARTL_ART_e0_55] = "e0 ::= e1 '>'  e1 ";
    artLabelStrings[ARTL_ART_e0_55] = "";
    artlhsL[ARTL_ART_e0_55] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_56] = "e0 ::= e1 '>'  . e1 ";
    artLabelStrings[ARTL_ART_e0_56] = "";
    artlhsL[ARTL_ART_e0_56] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_56] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_58] = "e0 ::= e1 '>'  e1 .";
    artLabelStrings[ARTL_ART_e0_58] = "";
    artlhsL[ARTL_ART_e0_58] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_58] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_58] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_58] = true;
    arteoR_pL[ARTL_ART_e0_58] = true;
    artPopD[ARTL_ART_e0_58] = true;
    artLabelInternalStrings[ARTL_ART_e0_62] = "e0 ::= . e1 '<'  e1 ";
    artLabelStrings[ARTL_ART_e0_62] = "";
    artlhsL[ARTL_ART_e0_62] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_62] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_64] = "e0 ::= e1 . '<'  e1 ";
    artLabelStrings[ARTL_ART_e0_64] = "";
    artlhsL[ARTL_ART_e0_64] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_64] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_64] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_64] = true;
    artLabelInternalStrings[ARTL_ART_e0_65] = "e0 ::= e1 '<'  e1 ";
    artLabelStrings[ARTL_ART_e0_65] = "";
    artlhsL[ARTL_ART_e0_65] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_66] = "e0 ::= e1 '<'  . e1 ";
    artLabelStrings[ARTL_ART_e0_66] = "";
    artlhsL[ARTL_ART_e0_66] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_66] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_68] = "e0 ::= e1 '<'  e1 .";
    artLabelStrings[ARTL_ART_e0_68] = "";
    artlhsL[ARTL_ART_e0_68] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_68] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_68] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_68] = true;
    arteoR_pL[ARTL_ART_e0_68] = true;
    artPopD[ARTL_ART_e0_68] = true;
    artLabelInternalStrings[ARTL_ART_e0_72] = "e0 ::= . e1 '>='  e1 ";
    artLabelStrings[ARTL_ART_e0_72] = "";
    artlhsL[ARTL_ART_e0_72] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_72] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_74] = "e0 ::= e1 . '>='  e1 ";
    artLabelStrings[ARTL_ART_e0_74] = "";
    artlhsL[ARTL_ART_e0_74] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_74] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_74] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_74] = true;
    artLabelInternalStrings[ARTL_ART_e0_75] = "e0 ::= e1 '>='  e1 ";
    artLabelStrings[ARTL_ART_e0_75] = "";
    artlhsL[ARTL_ART_e0_75] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_76] = "e0 ::= e1 '>='  . e1 ";
    artLabelStrings[ARTL_ART_e0_76] = "";
    artlhsL[ARTL_ART_e0_76] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_76] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_78] = "e0 ::= e1 '>='  e1 .";
    artLabelStrings[ARTL_ART_e0_78] = "";
    artlhsL[ARTL_ART_e0_78] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_78] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_78] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_78] = true;
    arteoR_pL[ARTL_ART_e0_78] = true;
    artPopD[ARTL_ART_e0_78] = true;
    artLabelInternalStrings[ARTL_ART_e0_82] = "e0 ::= . e1 '<='  e1 ";
    artLabelStrings[ARTL_ART_e0_82] = "";
    artlhsL[ARTL_ART_e0_82] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_82] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_84] = "e0 ::= e1 . '<='  e1 ";
    artLabelStrings[ARTL_ART_e0_84] = "";
    artlhsL[ARTL_ART_e0_84] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_84] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_84] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_84] = true;
    artLabelInternalStrings[ARTL_ART_e0_85] = "e0 ::= e1 '<='  e1 ";
    artLabelStrings[ARTL_ART_e0_85] = "";
    artlhsL[ARTL_ART_e0_85] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_86] = "e0 ::= e1 '<='  . e1 ";
    artLabelStrings[ARTL_ART_e0_86] = "";
    artlhsL[ARTL_ART_e0_86] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_86] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_88] = "e0 ::= e1 '<='  e1 .";
    artLabelStrings[ARTL_ART_e0_88] = "";
    artlhsL[ARTL_ART_e0_88] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_88] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_88] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_88] = true;
    arteoR_pL[ARTL_ART_e0_88] = true;
    artPopD[ARTL_ART_e0_88] = true;
    artLabelInternalStrings[ARTL_ART_e0_92] = "e0 ::= . e1 '=='  e1 ";
    artLabelStrings[ARTL_ART_e0_92] = "";
    artlhsL[ARTL_ART_e0_92] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_92] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_94] = "e0 ::= e1 . '=='  e1 ";
    artLabelStrings[ARTL_ART_e0_94] = "";
    artlhsL[ARTL_ART_e0_94] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_94] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_94] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_94] = true;
    artLabelInternalStrings[ARTL_ART_e0_95] = "e0 ::= e1 '=='  e1 ";
    artLabelStrings[ARTL_ART_e0_95] = "";
    artlhsL[ARTL_ART_e0_95] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_96] = "e0 ::= e1 '=='  . e1 ";
    artLabelStrings[ARTL_ART_e0_96] = "";
    artlhsL[ARTL_ART_e0_96] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_96] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_98] = "e0 ::= e1 '=='  e1 .";
    artLabelStrings[ARTL_ART_e0_98] = "";
    artlhsL[ARTL_ART_e0_98] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_98] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_98] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_98] = true;
    arteoR_pL[ARTL_ART_e0_98] = true;
    artPopD[ARTL_ART_e0_98] = true;
    artLabelInternalStrings[ARTL_ART_e0_102] = "e0 ::= . e1 '!='  e1 ";
    artLabelStrings[ARTL_ART_e0_102] = "";
    artlhsL[ARTL_ART_e0_102] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_102] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_104] = "e0 ::= e1 . '!='  e1 ";
    artLabelStrings[ARTL_ART_e0_104] = "";
    artlhsL[ARTL_ART_e0_104] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_104] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_104] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_104] = true;
    artLabelInternalStrings[ARTL_ART_e0_105] = "e0 ::= e1 '!='  e1 ";
    artLabelStrings[ARTL_ART_e0_105] = "";
    artlhsL[ARTL_ART_e0_105] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_106] = "e0 ::= e1 '!='  . e1 ";
    artLabelStrings[ARTL_ART_e0_106] = "";
    artlhsL[ARTL_ART_e0_106] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_106] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_108] = "e0 ::= e1 '!='  e1 .";
    artLabelStrings[ARTL_ART_e0_108] = "";
    artlhsL[ARTL_ART_e0_108] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_108] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_108] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_108] = true;
    arteoR_pL[ARTL_ART_e0_108] = true;
    artPopD[ARTL_ART_e0_108] = true;
  }

  public void artTableInitialiser_ART_e1() {
    artLabelInternalStrings[ARTL_ART_e1] = "e1";
    artLabelStrings[ARTL_ART_e1] = "e1";
    artKindOfs[ARTL_ART_e1] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e1_112] = "e1 ::= . e2 ";
    artLabelStrings[ARTL_ART_e1_112] = "";
    artlhsL[ARTL_ART_e1_112] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_112] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_114] = "e1 ::= e2 .";
    artLabelStrings[ARTL_ART_e1_114] = "";
    artlhsL[ARTL_ART_e1_114] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_114] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_114] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_114] = true;
    arteoR_pL[ARTL_ART_e1_114] = true;
    artPopD[ARTL_ART_e1_114] = true;
    artLabelInternalStrings[ARTL_ART_e1_118] = "e1 ::= . e1 '+'  e2 ";
    artLabelStrings[ARTL_ART_e1_118] = "";
    artlhsL[ARTL_ART_e1_118] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_118] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_120] = "e1 ::= e1 . '+'  e2 ";
    artLabelStrings[ARTL_ART_e1_120] = "";
    artlhsL[ARTL_ART_e1_120] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_120] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_120] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e1_120] = true;
    artLabelInternalStrings[ARTL_ART_e1_121] = "e1 ::= e1 '+'  e2 ";
    artLabelStrings[ARTL_ART_e1_121] = "";
    artlhsL[ARTL_ART_e1_121] = ARTL_ART_e1;
    artLabelInternalStrings[ARTL_ART_e1_122] = "e1 ::= e1 '+'  . e2 ";
    artLabelStrings[ARTL_ART_e1_122] = "";
    artlhsL[ARTL_ART_e1_122] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_122] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_124] = "e1 ::= e1 '+'  e2 .";
    artLabelStrings[ARTL_ART_e1_124] = "";
    artlhsL[ARTL_ART_e1_124] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_124] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_124] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_124] = true;
    arteoR_pL[ARTL_ART_e1_124] = true;
    artPopD[ARTL_ART_e1_124] = true;
    artLabelInternalStrings[ARTL_ART_e1_128] = "e1 ::= . e1 '-'  e2 ";
    artLabelStrings[ARTL_ART_e1_128] = "";
    artlhsL[ARTL_ART_e1_128] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_128] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_130] = "e1 ::= e1 . '-'  e2 ";
    artLabelStrings[ARTL_ART_e1_130] = "";
    artlhsL[ARTL_ART_e1_130] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_130] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_130] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e1_130] = true;
    artLabelInternalStrings[ARTL_ART_e1_131] = "e1 ::= e1 '-'  e2 ";
    artLabelStrings[ARTL_ART_e1_131] = "";
    artlhsL[ARTL_ART_e1_131] = ARTL_ART_e1;
    artLabelInternalStrings[ARTL_ART_e1_132] = "e1 ::= e1 '-'  . e2 ";
    artLabelStrings[ARTL_ART_e1_132] = "";
    artlhsL[ARTL_ART_e1_132] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_132] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_134] = "e1 ::= e1 '-'  e2 .";
    artLabelStrings[ARTL_ART_e1_134] = "";
    artlhsL[ARTL_ART_e1_134] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_134] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_134] = true;
    arteoR_pL[ARTL_ART_e1_134] = true;
    artPopD[ARTL_ART_e1_134] = true;
  }

  public void artTableInitialiser_ART_e2() {
    artLabelInternalStrings[ARTL_ART_e2] = "e2";
    artLabelStrings[ARTL_ART_e2] = "e2";
    artKindOfs[ARTL_ART_e2] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e2_138] = "e2 ::= . e3 ";
    artLabelStrings[ARTL_ART_e2_138] = "";
    artlhsL[ARTL_ART_e2_138] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_138] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_140] = "e2 ::= e3 .";
    artLabelStrings[ARTL_ART_e2_140] = "";
    artlhsL[ARTL_ART_e2_140] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_140] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_140] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_140] = true;
    arteoR_pL[ARTL_ART_e2_140] = true;
    artPopD[ARTL_ART_e2_140] = true;
    artLabelInternalStrings[ARTL_ART_e2_144] = "e2 ::= . e2 '*'  e3 ";
    artLabelStrings[ARTL_ART_e2_144] = "";
    artlhsL[ARTL_ART_e2_144] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_144] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_146] = "e2 ::= e2 . '*'  e3 ";
    artLabelStrings[ARTL_ART_e2_146] = "";
    artlhsL[ARTL_ART_e2_146] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_146] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_146] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_146] = true;
    artLabelInternalStrings[ARTL_ART_e2_147] = "e2 ::= e2 '*'  e3 ";
    artLabelStrings[ARTL_ART_e2_147] = "";
    artlhsL[ARTL_ART_e2_147] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_148] = "e2 ::= e2 '*'  . e3 ";
    artLabelStrings[ARTL_ART_e2_148] = "";
    artlhsL[ARTL_ART_e2_148] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_148] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_150] = "e2 ::= e2 '*'  e3 .";
    artLabelStrings[ARTL_ART_e2_150] = "";
    artlhsL[ARTL_ART_e2_150] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_150] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_150] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_150] = true;
    arteoR_pL[ARTL_ART_e2_150] = true;
    artPopD[ARTL_ART_e2_150] = true;
    artLabelInternalStrings[ARTL_ART_e2_154] = "e2 ::= . e2 '/'  e3 ";
    artLabelStrings[ARTL_ART_e2_154] = "";
    artlhsL[ARTL_ART_e2_154] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_154] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_156] = "e2 ::= e2 . '/'  e3 ";
    artLabelStrings[ARTL_ART_e2_156] = "";
    artlhsL[ARTL_ART_e2_156] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_156] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_156] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_156] = true;
    artLabelInternalStrings[ARTL_ART_e2_157] = "e2 ::= e2 '/'  e3 ";
    artLabelStrings[ARTL_ART_e2_157] = "";
    artlhsL[ARTL_ART_e2_157] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_158] = "e2 ::= e2 '/'  . e3 ";
    artLabelStrings[ARTL_ART_e2_158] = "";
    artlhsL[ARTL_ART_e2_158] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_158] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_160] = "e2 ::= e2 '/'  e3 .";
    artLabelStrings[ARTL_ART_e2_160] = "";
    artlhsL[ARTL_ART_e2_160] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_160] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_160] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_160] = true;
    arteoR_pL[ARTL_ART_e2_160] = true;
    artPopD[ARTL_ART_e2_160] = true;
    artLabelInternalStrings[ARTL_ART_e2_164] = "e2 ::= . e2 '%'  e3 ";
    artLabelStrings[ARTL_ART_e2_164] = "";
    artlhsL[ARTL_ART_e2_164] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_164] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_166] = "e2 ::= e2 . '%'  e3 ";
    artLabelStrings[ARTL_ART_e2_166] = "";
    artlhsL[ARTL_ART_e2_166] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_166] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_166] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_166] = true;
    artLabelInternalStrings[ARTL_ART_e2_167] = "e2 ::= e2 '%'  e3 ";
    artLabelStrings[ARTL_ART_e2_167] = "";
    artlhsL[ARTL_ART_e2_167] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_168] = "e2 ::= e2 '%'  . e3 ";
    artLabelStrings[ARTL_ART_e2_168] = "";
    artlhsL[ARTL_ART_e2_168] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_168] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_170] = "e2 ::= e2 '%'  e3 .";
    artLabelStrings[ARTL_ART_e2_170] = "";
    artlhsL[ARTL_ART_e2_170] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_170] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_170] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_170] = true;
    arteoR_pL[ARTL_ART_e2_170] = true;
    artPopD[ARTL_ART_e2_170] = true;
  }

  public void artTableInitialiser_ART_e3() {
    artLabelInternalStrings[ARTL_ART_e3] = "e3";
    artLabelStrings[ARTL_ART_e3] = "e3";
    artKindOfs[ARTL_ART_e3] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e3_174] = "e3 ::= . e4 ";
    artLabelStrings[ARTL_ART_e3_174] = "";
    artlhsL[ARTL_ART_e3_174] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_174] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_176] = "e3 ::= e4 .";
    artLabelStrings[ARTL_ART_e3_176] = "";
    artlhsL[ARTL_ART_e3_176] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_176] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e3_176] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_176] = true;
    arteoR_pL[ARTL_ART_e3_176] = true;
    artPopD[ARTL_ART_e3_176] = true;
    artLabelInternalStrings[ARTL_ART_e3_180] = "e3 ::= . '+'  e3 ";
    artLabelStrings[ARTL_ART_e3_180] = "";
    artlhsL[ARTL_ART_e3_180] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_180] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_181] = "e3 ::= '+'  e3 ";
    artLabelStrings[ARTL_ART_e3_181] = "";
    artlhsL[ARTL_ART_e3_181] = ARTL_ART_e3;
    artLabelInternalStrings[ARTL_ART_e3_182] = "e3 ::= '+'  . e3 ";
    artLabelStrings[ARTL_ART_e3_182] = "";
    artlhsL[ARTL_ART_e3_182] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_182] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e3_182] = true;
    artLabelInternalStrings[ARTL_ART_e3_184] = "e3 ::= '+'  e3 .";
    artLabelStrings[ARTL_ART_e3_184] = "";
    artlhsL[ARTL_ART_e3_184] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_184] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_184] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_184] = true;
    arteoR_pL[ARTL_ART_e3_184] = true;
    artPopD[ARTL_ART_e3_184] = true;
    artLabelInternalStrings[ARTL_ART_e3_188] = "e3 ::= . '-'  e3 ";
    artLabelStrings[ARTL_ART_e3_188] = "";
    artlhsL[ARTL_ART_e3_188] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_188] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_189] = "e3 ::= '-'  e3 ";
    artLabelStrings[ARTL_ART_e3_189] = "";
    artlhsL[ARTL_ART_e3_189] = ARTL_ART_e3;
    artLabelInternalStrings[ARTL_ART_e3_190] = "e3 ::= '-'  . e3 ";
    artLabelStrings[ARTL_ART_e3_190] = "";
    artlhsL[ARTL_ART_e3_190] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_190] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e3_190] = true;
    artLabelInternalStrings[ARTL_ART_e3_192] = "e3 ::= '-'  e3 .";
    artLabelStrings[ARTL_ART_e3_192] = "";
    artlhsL[ARTL_ART_e3_192] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_192] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_192] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_192] = true;
    arteoR_pL[ARTL_ART_e3_192] = true;
    artPopD[ARTL_ART_e3_192] = true;
  }

  public void artTableInitialiser_ART_e4() {
    artLabelInternalStrings[ARTL_ART_e4] = "e4";
    artLabelStrings[ARTL_ART_e4] = "e4";
    artKindOfs[ARTL_ART_e4] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e4_196] = "e4 ::= . e5 ";
    artLabelStrings[ARTL_ART_e4_196] = "";
    artlhsL[ARTL_ART_e4_196] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_196] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_198] = "e4 ::= e5 .";
    artLabelStrings[ARTL_ART_e4_198] = "";
    artlhsL[ARTL_ART_e4_198] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_198] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e4_198] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e4_198] = true;
    arteoR_pL[ARTL_ART_e4_198] = true;
    artPopD[ARTL_ART_e4_198] = true;
    artLabelInternalStrings[ARTL_ART_e4_202] = "e4 ::= . e5 '**'  e4 ";
    artLabelStrings[ARTL_ART_e4_202] = "";
    artlhsL[ARTL_ART_e4_202] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_202] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_204] = "e4 ::= e5 . '**'  e4 ";
    artLabelStrings[ARTL_ART_e4_204] = "";
    artlhsL[ARTL_ART_e4_204] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_204] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e4_204] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e4_204] = true;
    artLabelInternalStrings[ARTL_ART_e4_205] = "e4 ::= e5 '**'  e4 ";
    artLabelStrings[ARTL_ART_e4_205] = "";
    artlhsL[ARTL_ART_e4_205] = ARTL_ART_e4;
    artLabelInternalStrings[ARTL_ART_e4_206] = "e4 ::= e5 '**'  . e4 ";
    artLabelStrings[ARTL_ART_e4_206] = "";
    artlhsL[ARTL_ART_e4_206] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_206] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_208] = "e4 ::= e5 '**'  e4 .";
    artLabelStrings[ARTL_ART_e4_208] = "";
    artlhsL[ARTL_ART_e4_208] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_208] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_208] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e4_208] = true;
    arteoR_pL[ARTL_ART_e4_208] = true;
    artPopD[ARTL_ART_e4_208] = true;
  }

  public void artTableInitialiser_ART_e5() {
    artLabelInternalStrings[ARTL_ART_e5] = "e5";
    artLabelStrings[ARTL_ART_e5] = "e5";
    artKindOfs[ARTL_ART_e5] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e5_212] = "e5 ::= . INTEGER ";
    artLabelStrings[ARTL_ART_e5_212] = "";
    artlhsL[ARTL_ART_e5_212] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_212] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e5_214] = "e5 ::= INTEGER .";
    artLabelStrings[ARTL_ART_e5_214] = "";
    artlhsL[ARTL_ART_e5_214] = ARTL_ART_e5;
    artSlotInstanceOfs[ARTL_ART_e5_214] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_e5_214] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e5_214] = true;
    arteoR_pL[ARTL_ART_e5_214] = true;
    artPopD[ARTL_ART_e5_214] = true;
    artLabelInternalStrings[ARTL_ART_e5_218] = "e5 ::= . '('  e1 ')'  ";
    artLabelStrings[ARTL_ART_e5_218] = "";
    artlhsL[ARTL_ART_e5_218] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_218] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e5_219] = "e5 ::= '('  e1 ')'  ";
    artLabelStrings[ARTL_ART_e5_219] = "";
    artlhsL[ARTL_ART_e5_219] = ARTL_ART_e5;
    artLabelInternalStrings[ARTL_ART_e5_220] = "e5 ::= '('  . e1 ')'  ";
    artLabelStrings[ARTL_ART_e5_220] = "";
    artlhsL[ARTL_ART_e5_220] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_220] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e5_220] = true;
    artLabelInternalStrings[ARTL_ART_e5_222] = "e5 ::= '('  e1 . ')'  ";
    artLabelStrings[ARTL_ART_e5_222] = "";
    artlhsL[ARTL_ART_e5_222] = ARTL_ART_e5;
    artSlotInstanceOfs[ARTL_ART_e5_222] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e5_222] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_e5_222] = true;
    artLabelInternalStrings[ARTL_ART_e5_225] = "e5 ::= '('  e1 ')'  ";
    artLabelStrings[ARTL_ART_e5_225] = "";
    artlhsL[ARTL_ART_e5_225] = ARTL_ART_e5;
    artPopD[ARTL_ART_e5_225] = true;
    artLabelInternalStrings[ARTL_ART_e5_226] = "e5 ::= '('  e1 ')'  .";
    artLabelStrings[ARTL_ART_e5_226] = "";
    artlhsL[ARTL_ART_e5_226] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_226] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e5_226] = true;
    arteoR_pL[ARTL_ART_e5_226] = true;
    artPopD[ARTL_ART_e5_226] = true;
  }

  public void artTableInitialiser_ART_printElements() {
    artLabelInternalStrings[ARTL_ART_printElements] = "printElements";
    artLabelStrings[ARTL_ART_printElements] = "printElements";
    artKindOfs[ARTL_ART_printElements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_printElements_14] = "printElements ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_printElements_14] = "";
    artlhsL[ARTL_ART_printElements_14] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_14] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_16] = "printElements ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_printElements_16] = "";
    artlhsL[ARTL_ART_printElements_16] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_16] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_printElements_16] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_16] = true;
    arteoR_pL[ARTL_ART_printElements_16] = true;
    artPopD[ARTL_ART_printElements_16] = true;
    artLabelInternalStrings[ARTL_ART_printElements_20] = "printElements ::= . STRING_DQ ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_20] = "";
    artlhsL[ARTL_ART_printElements_20] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_20] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_22] = "printElements ::= STRING_DQ . ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_22] = "";
    artlhsL[ARTL_ART_printElements_22] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_22] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_printElements_22] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printElements_22] = true;
    artLabelInternalStrings[ARTL_ART_printElements_25] = "printElements ::= STRING_DQ ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_25] = "";
    artlhsL[ARTL_ART_printElements_25] = ARTL_ART_printElements;
    artLabelInternalStrings[ARTL_ART_printElements_26] = "printElements ::= STRING_DQ ','  . printElements ";
    artLabelStrings[ARTL_ART_printElements_26] = "";
    artlhsL[ARTL_ART_printElements_26] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_26] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_28] = "printElements ::= STRING_DQ ','  printElements .";
    artLabelStrings[ARTL_ART_printElements_28] = "";
    artlhsL[ARTL_ART_printElements_28] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_28] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_28] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_28] = true;
    arteoR_pL[ARTL_ART_printElements_28] = true;
    artPopD[ARTL_ART_printElements_28] = true;
    artLabelInternalStrings[ARTL_ART_printElements_30] = "printElements ::= . e0 ";
    artLabelStrings[ARTL_ART_printElements_30] = "";
    artlhsL[ARTL_ART_printElements_30] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_30] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_32] = "printElements ::= e0 .";
    artLabelStrings[ARTL_ART_printElements_32] = "";
    artlhsL[ARTL_ART_printElements_32] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_32] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_printElements_32] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_32] = true;
    arteoR_pL[ARTL_ART_printElements_32] = true;
    artPopD[ARTL_ART_printElements_32] = true;
    artLabelInternalStrings[ARTL_ART_printElements_36] = "printElements ::= . e0 ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_36] = "";
    artlhsL[ARTL_ART_printElements_36] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_36] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_38] = "printElements ::= e0 . ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_38] = "";
    artlhsL[ARTL_ART_printElements_38] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_38] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_printElements_38] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printElements_38] = true;
    artLabelInternalStrings[ARTL_ART_printElements_41] = "printElements ::= e0 ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_41] = "";
    artlhsL[ARTL_ART_printElements_41] = ARTL_ART_printElements;
    artLabelInternalStrings[ARTL_ART_printElements_42] = "printElements ::= e0 ','  . printElements ";
    artLabelStrings[ARTL_ART_printElements_42] = "";
    artlhsL[ARTL_ART_printElements_42] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_42] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_44] = "printElements ::= e0 ','  printElements .";
    artLabelStrings[ARTL_ART_printElements_44] = "";
    artlhsL[ARTL_ART_printElements_44] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_44] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_44] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_44] = true;
    arteoR_pL[ARTL_ART_printElements_44] = true;
    artPopD[ARTL_ART_printElements_44] = true;
  }

  public void artTableInitialiser_ART_statement() {
    artLabelInternalStrings[ARTL_ART_statement] = "statement";
    artLabelStrings[ARTL_ART_statement] = "statement";
    artKindOfs[ARTL_ART_statement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statement_2] = "statement ::= . 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_2] = "";
    artlhsL[ARTL_ART_statement_2] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_3] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_3] = "";
    artlhsL[ARTL_ART_statement_3] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_4] = "statement ::= 'print'  . '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_4] = "";
    artlhsL[ARTL_ART_statement_4] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_4] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_4] = true;
    artLabelInternalStrings[ARTL_ART_statement_5] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_5] = "";
    artlhsL[ARTL_ART_statement_5] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_6] = "statement ::= 'print'  '('  . printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_6] = "";
    artlhsL[ARTL_ART_statement_6] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_6] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_8] = "statement ::= 'print'  '('  printElements . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_8] = "";
    artlhsL[ARTL_ART_statement_8] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_8] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_statement_8] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_8] = true;
    artLabelInternalStrings[ARTL_ART_statement_9] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_9] = "";
    artlhsL[ARTL_ART_statement_9] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_9] = true;
    artLabelInternalStrings[ARTL_ART_statement_10] = "statement ::= 'print'  '('  printElements ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_10] = "";
    artlhsL[ARTL_ART_statement_10] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_10] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_10] = true;
    artLabelInternalStrings[ARTL_ART_statement_11] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_11] = "";
    artlhsL[ARTL_ART_statement_11] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_11] = true;
    artLabelInternalStrings[ARTL_ART_statement_12] = "statement ::= 'print'  '('  printElements ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_12] = "";
    artlhsL[ARTL_ART_statement_12] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_12] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_12] = true;
    arteoR_pL[ARTL_ART_statement_12] = true;
    artPopD[ARTL_ART_statement_12] = true;
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

    artLabelStrings[ARTTB_INTEGER] = "INTEGER";
    artLabelInternalStrings[ARTTB_INTEGER] = "&INTEGER";
    artKindOfs[ARTTB_INTEGER] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_INTEGER] = true;
    artLabelStrings[ARTTB_SIMPLE_WHITESPACE] = "SIMPLE_WHITESPACE";
    artLabelInternalStrings[ARTTB_SIMPLE_WHITESPACE] = "&SIMPLE_WHITESPACE";
    artKindOfs[ARTTB_SIMPLE_WHITESPACE] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_SIMPLE_WHITESPACE] = true;
    artLabelStrings[ARTTB_STRING_DQ] = "STRING_DQ";
    artLabelInternalStrings[ARTTB_STRING_DQ] = "&STRING_DQ";
    artKindOfs[ARTTB_STRING_DQ] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_STRING_DQ] = true;
    artLabelStrings[ARTTS__SHREIK_EQUAL] = "!=";
    artLabelInternalStrings[ARTTS__SHREIK_EQUAL] = "'!='";
    artKindOfs[ARTTS__SHREIK_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK_EQUAL] = true;
    artLabelStrings[ARTTS__PERCENT] = "%";
    artLabelInternalStrings[ARTTS__PERCENT] = "'%'";
    artKindOfs[ARTTS__PERCENT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERCENT] = true;
    artLabelStrings[ARTTS__LPAR] = "(";
    artLabelInternalStrings[ARTTS__LPAR] = "'('";
    artKindOfs[ARTTS__LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LPAR] = true;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__STAR] = "*";
    artLabelInternalStrings[ARTTS__STAR] = "'*'";
    artKindOfs[ARTTS__STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR] = true;
    artLabelStrings[ARTTS__STAR_STAR] = "**";
    artLabelInternalStrings[ARTTS__STAR_STAR] = "'**'";
    artKindOfs[ARTTS__STAR_STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR_STAR] = true;
    artLabelStrings[ARTTS__PLUS] = "+";
    artLabelInternalStrings[ARTTS__PLUS] = "'+'";
    artKindOfs[ARTTS__PLUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PLUS] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS] = "-";
    artLabelInternalStrings[ARTTS__MINUS] = "'-'";
    artKindOfs[ARTTS__MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS] = true;
    artLabelStrings[ARTTS__SLASH] = "/";
    artLabelInternalStrings[ARTTS__SLASH] = "'/'";
    artKindOfs[ARTTS__SLASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SLASH] = true;
    artLabelStrings[ARTTS__SEMICOLON] = ";";
    artLabelInternalStrings[ARTTS__SEMICOLON] = "';'";
    artKindOfs[ARTTS__SEMICOLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SEMICOLON] = true;
    artLabelStrings[ARTTS__LT] = "<";
    artLabelInternalStrings[ARTTS__LT] = "'<'";
    artKindOfs[ARTTS__LT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT] = true;
    artLabelStrings[ARTTS__LT_EQUAL] = "<=";
    artLabelInternalStrings[ARTTS__LT_EQUAL] = "'<='";
    artKindOfs[ARTTS__LT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT_EQUAL] = true;
    artLabelStrings[ARTTS__EQUAL_EQUAL] = "==";
    artLabelInternalStrings[ARTTS__EQUAL_EQUAL] = "'=='";
    artKindOfs[ARTTS__EQUAL_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL_EQUAL] = true;
    artLabelStrings[ARTTS__GT] = ">";
    artLabelInternalStrings[ARTTS__GT] = "'>'";
    artKindOfs[ARTTS__GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT] = true;
    artLabelStrings[ARTTS__GT_EQUAL] = ">=";
    artLabelInternalStrings[ARTTS__GT_EQUAL] = "'>='";
    artKindOfs[ARTTS__GT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT_EQUAL] = true;
    artLabelStrings[ARTTS_print] = "print";
    artLabelInternalStrings[ARTTS_print] = "'print'";
    artKindOfs[ARTTS_print] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_print] = true;
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_STRING_DQ();
    artTableInitialiser_ART_e0();
    artTableInitialiser_ART_e1();
    artTableInitialiser_ART_e2();
    artTableInitialiser_ART_e3();
    artTableInitialiser_ART_e4();
    artTableInitialiser_ART_e5();
    artTableInitialiser_ART_printElements();
    artTableInitialiser_ART_statement();
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
  public static class ARTAT_ART_INTEGER extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public Value v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_STRING_DQ extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public Value v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e0 extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle e11;
    ARTGLLRDTHandle e12;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e1 extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle e11;
    ARTGLLRDTHandle e21;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e2 extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle e21;
    ARTGLLRDTHandle e31;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e3 extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle e31;
    ARTGLLRDTHandle e41;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e4 extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle e41;
    ARTGLLRDTHandle e51;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e5 extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle INTEGER1;
    ARTGLLRDTHandle e11;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public void ARTRD_INTEGER(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*INTEGER ::= &INTEGER  .*/
      case ARTL_ART_INTEGER_230: 
                ARTRD_INTEGER(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER);
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
        INTEGER.lexeme = artLexeme(INTEGER.leftExtent, INTEGER.rightExtent); INTEGER.v = new __int32(artLexemeAsInteger(INTEGER.leftExtent, INTEGER.rightExtent), 0); 
        break;
        default:
          throw new ARTException("ARTRD_INTEGER: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_STRING_DQ(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*STRING_DQ ::= &STRING_DQ  .*/
    case ARTL_ART_STRING_DQ_236: 
            ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      STRING_DQ.lexeme = artLexeme(STRING_DQ.leftExtent, STRING_DQ.rightExtent); STRING_DQ.v = new __string(artLexemeAsString(STRING_DQ.leftExtent, STRING_DQ.rightExtent)); 
      break;
        default:
          throw new ARTException("ARTRD_STRING_DQ: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e0(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e0 e0, ARTAT_ART_e1 e11, ARTAT_ART_e1 e12) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e0 ::= e1 .*/
    case ARTL_ART_e0_48: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
       e0.v = e11.v; 
      break;
    /*e0 ::= e1 '>'  . e1 */
    case ARTL_ART_e0_56: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '>'  e1 .*/
    case ARTL_ART_e0_58: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v.__gt(e12.v); 
      break;
    /*e0 ::= e1 '<'  . e1 */
    case ARTL_ART_e0_66: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '<'  e1 .*/
    case ARTL_ART_e0_68: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v.__lt(e12.v); 
      break;
    /*e0 ::= e1 '>='  . e1 */
    case ARTL_ART_e0_76: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '>='  e1 .*/
    case ARTL_ART_e0_78: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v.__ge(e12.v); 
      break;
    /*e0 ::= e1 '<='  . e1 */
    case ARTL_ART_e0_86: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '<='  e1 .*/
    case ARTL_ART_e0_88: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v.__le(e12.v); 
      break;
    /*e0 ::= e1 '=='  . e1 */
    case ARTL_ART_e0_96: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '=='  e1 .*/
    case ARTL_ART_e0_98: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v.__eq(e12.v); 
      break;
    /*e0 ::= e1 '!='  . e1 */
    case ARTL_ART_e0_106: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '!='  e1 .*/
    case ARTL_ART_e0_108: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v.__ne(e12.v); 
      break;
        default:
          throw new ARTException("ARTRD_e0: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e1(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e1 e1, ARTAT_ART_e1 e11, ARTAT_ART_e2 e21) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e1 ::= e2 .*/
    case ARTL_ART_e1_114: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e21.v; 
      break;
    /*e1 ::= e1 '+'  . e2 */
    case ARTL_ART_e1_122: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e1 ::= e1 '+'  e2 .*/
    case ARTL_ART_e1_124: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e11.v.__add(e21.v); 
      break;
    /*e1 ::= e1 '-'  . e2 */
    case ARTL_ART_e1_132: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e1 ::= e1 '-'  e2 .*/
    case ARTL_ART_e1_134: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e11.v.__sub(e21.v); 
      break;
        default:
          throw new ARTException("ARTRD_e1: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e2(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e2 e2, ARTAT_ART_e2 e21, ARTAT_ART_e3 e31) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e2 ::= e3 .*/
    case ARTL_ART_e2_140: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v= e31.v; 
      break;
    /*e2 ::= e2 '*'  . e3 */
    case ARTL_ART_e2_148: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '*'  e3 .*/
    case ARTL_ART_e2_150: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v.__mul(e31.v); 
      break;
    /*e2 ::= e2 '/'  . e3 */
    case ARTL_ART_e2_158: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '/'  e3 .*/
    case ARTL_ART_e2_160: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v.__div(e31.v); 
      break;
    /*e2 ::= e2 '%'  . e3 */
    case ARTL_ART_e2_168: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '%'  e3 .*/
    case ARTL_ART_e2_170: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v.__exp(e31.v); 
      break;
        default:
          throw new ARTException("ARTRD_e2: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e3(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e3 e3, ARTAT_ART_e3 e31, ARTAT_ART_e4 e41) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e3 ::= e4 .*/
    case ARTL_ART_e3_176: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            ARTRD_e3(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e3, e31, e41);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e41));
      ARTRD_e4(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e41, null, null);
      e3.v = e41.v; 
      break;
    /*e3 ::= '+'  e3 .*/
    case ARTL_ART_e3_184: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
      e3.v = e41.v; 
      break;
    /*e3 ::= '-'  e3 .*/
    case ARTL_ART_e3_192: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
      e3.v = new __int32(0,0).__sub(e41.v); 
      break;
        default:
          throw new ARTException("ARTRD_e3: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e4(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e4 e4, ARTAT_ART_e4 e41, ARTAT_ART_e5 e51) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e4 ::= e5 .*/
    case ARTL_ART_e4_198: 
      e41 = new ARTAT_ART_e4();
      e51 = new ARTAT_ART_e5();
            ARTRD_e4(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e4, e41, e51);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e51));
      ARTRD_e5(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e51, null, null);
       e4.v = e51.v; 
      break;
    /*e4 ::= e5 '**'  . e4 */
    case ARTL_ART_e4_206: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e51));
      ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e51, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e4 ::= e5 '**'  e4 .*/
    case ARTL_ART_e4_208: 
      e41 = new ARTAT_ART_e4();
      e51 = new ARTAT_ART_e5();
            ARTRD_e4(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e4, e41, e51);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e41));
      ARTRD_e4(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e41, null, null);
      e4.v = e51.v.__exp(e41.v); 
      break;
        default:
          throw new ARTException("ARTRD_e4: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e5(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e5 e5, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_e1 e11) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e5 ::= INTEGER .*/
    case ARTL_ART_e5_214: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      e11 = new ARTAT_ART_e1();
            ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e5, INTEGER1, e11);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
      e5.v = INTEGER1.v; 
      break;
    /*e5 ::= '('  e1 . ')'  */
    case ARTL_ART_e5_222: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
       e5.v = e11.v; 
      break;
    /*e5 ::= '('  e1 ')'  .*/
    case ARTL_ART_e5_226: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      e11 = new ARTAT_ART_e1();
            ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e5, INTEGER1, e11);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_e5: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_printElements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ1, ARTAT_ART_e0 e01) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*printElements ::= STRING_DQ .*/
    case ARTL_ART_printElements_16: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       System.out.print(STRING_DQ1.v.toString()); 
      break;
    /*printElements ::= STRING_DQ ','  . printElements */
    case ARTL_ART_printElements_26: 
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       System.out.print(STRING_DQ1.v.toString()); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*printElements ::= STRING_DQ ','  printElements .*/
    case ARTL_ART_printElements_28: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*printElements ::= e0 .*/
    case ARTL_ART_printElements_32: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
       System.out.printf(e01.v.toString()); 
      break;
    /*printElements ::= e0 ','  . printElements */
    case ARTL_ART_printElements_42: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
       System.out.print(e01.v.toString()); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*printElements ::= e0 ','  printElements .*/
    case ARTL_ART_printElements_44: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
        default:
          throw new ARTException("ARTRD_printElements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statement ::= 'print'  '('  . printElements ')'  ';'  */
    case ARTL_ART_statement_6: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'print'  '('  printElements . ')'  ';'  */
    case ARTL_ART_statement_8: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*statement ::= 'print'  '('  printElements ')'  . ';'  */
    case ARTL_ART_statement_10: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'print'  '('  printElements ')'  ';'  .*/
    case ARTL_ART_statement_12: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_statement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_INTEGER:  ARTRD_INTEGER(artElement.element, artParent, artWriteable, (ARTAT_ART_INTEGER) artAttributes); break;
    case ARTL_ART_STRING_DQ:  ARTRD_STRING_DQ(artElement.element, artParent, artWriteable, (ARTAT_ART_STRING_DQ) artAttributes); break;
    case ARTL_ART_e0:  ARTRD_e0(artElement.element, artParent, artWriteable, (ARTAT_ART_e0) artAttributes, null, null); break;
    case ARTL_ART_e1:  ARTRD_e1(artElement.element, artParent, artWriteable, (ARTAT_ART_e1) artAttributes, null, null); break;
    case ARTL_ART_e2:  ARTRD_e2(artElement.element, artParent, artWriteable, (ARTAT_ART_e2) artAttributes, null, null); break;
    case ARTL_ART_e3:  ARTRD_e3(artElement.element, artParent, artWriteable, (ARTAT_ART_e3) artAttributes, null, null); break;
    case ARTL_ART_e4:  ARTRD_e4(artElement.element, artParent, artWriteable, (ARTAT_ART_e4) artAttributes, null, null); break;
    case ARTL_ART_e5:  ARTRD_e5(artElement.element, artParent, artWriteable, (ARTAT_ART_e5) artAttributes, null, null); break;
    case ARTL_ART_printElements: ARTRD_printElements(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_statement: ARTRD_statement(artElement.element, artParent, artWriteable); break;
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
