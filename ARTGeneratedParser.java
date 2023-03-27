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
  private static boolean[] ARTSet33;
  private static boolean[] ARTSet34;
  private static boolean[] ARTSet35;
  private static boolean[] ARTSet36;
  private static boolean[] ARTSet37;
  private static boolean[] ARTSet38;
  private static boolean[] ARTSet39;
  private static boolean[] ARTSet40;
  private static boolean[] ARTSet41;
  private static boolean[] ARTSet42;
  private static boolean[] ARTSet43;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_REAL = 3;
  public static final int ARTTB_SIMPLE_WHITESPACE = 4;
  public static final int ARTTB_STRING_DQ = 5;
  public static final int ARTTS__SHREIK_EQUAL = 6;
  public static final int ARTTS__LPAR = 7;
  public static final int ARTTS__RPAR = 8;
  public static final int ARTTS__STAR = 9;
  public static final int ARTTS__PLUS = 10;
  public static final int ARTTS__COMMA = 11;
  public static final int ARTTS__MINUS = 12;
  public static final int ARTTS__SLASH = 13;
  public static final int ARTTS__SLASH_SLASH = 14;
  public static final int ARTTS__SEMICOLON = 15;
  public static final int ARTTS__LT = 16;
  public static final int ARTTS__EQUAL = 17;
  public static final int ARTTS__EQUAL_EQUAL = 18;
  public static final int ARTTS__GT = 19;
  public static final int ARTTS__BACKSLASHn = 20;
  public static final int ARTTS_backend = 21;
  public static final int ARTTS_else = 22;
  public static final int ARTTS_if = 23;
  public static final int ARTTS_while = 24;
  public static final int ARTX_EPSILON = 25;
  public static final int ARTL_ART_ID = 26;
  public static final int ARTL_ART_INTEGER = 27;
  public static final int ARTL_ART_REAL = 28;
  public static final int ARTL_ART_add = 29;
  public static final int ARTL_ART_assign = 30;
  public static final int ARTL_ART_backend = 31;
  public static final int ARTL_ART_comment = 32;
  public static final int ARTL_ART_deref = 33;
  public static final int ARTL_ART_div = 34;
  public static final int ARTL_ART_eq = 35;
  public static final int ARTL_ART_gt = 36;
  public static final int ARTL_ART_if = 37;
  public static final int ARTL_ART_lt = 38;
  public static final int ARTL_ART_mul = 39;
  public static final int ARTL_ART_ne = 40;
  public static final int ARTL_ART_operand = 41;
  public static final int ARTL_ART_relExpr = 42;
  public static final int ARTL_ART_seq = 43;
  public static final int ARTL_ART_statement = 44;
  public static final int ARTL_ART_sub = 45;
  public static final int ARTL_ART_subExpr = 46;
  public static final int ARTL_ART_while = 47;
  public static final int ARTL_ART_ID_215 = 48;
  public static final int ARTL_ART_ID_216 = 49;
  public static final int ARTL_ART_ID_217 = 50;
  public static final int ARTL_ART_ID_218 = 51;
  public static final int ARTL_ART_INTEGER_221 = 52;
  public static final int ARTL_ART_INTEGER_222 = 53;
  public static final int ARTL_ART_INTEGER_223 = 54;
  public static final int ARTL_ART_INTEGER_224 = 55;
  public static final int ARTL_ART_REAL_227 = 56;
  public static final int ARTL_ART_REAL_228 = 57;
  public static final int ARTL_ART_REAL_229 = 58;
  public static final int ARTL_ART_REAL_230 = 59;
  public static final int ARTL_ART_add_167 = 60;
  public static final int ARTL_ART_add_168 = 61;
  public static final int ARTL_ART_add_169 = 62;
  public static final int ARTL_ART_add_170 = 63;
  public static final int ARTL_ART_add_171 = 64;
  public static final int ARTL_ART_add_172 = 65;
  public static final int ARTL_ART_add_173 = 66;
  public static final int ARTL_ART_add_174 = 67;
  public static final int ARTL_ART_assign_31 = 68;
  public static final int ARTL_ART_assign_32 = 69;
  public static final int ARTL_ART_assign_33 = 70;
  public static final int ARTL_ART_assign_34 = 71;
  public static final int ARTL_ART_assign_35 = 72;
  public static final int ARTL_ART_assign_36 = 73;
  public static final int ARTL_ART_assign_37 = 74;
  public static final int ARTL_ART_assign_38 = 75;
  public static final int ARTL_ART_assign_39 = 76;
  public static final int ARTL_ART_assign_40 = 77;
  public static final int ARTL_ART_backend_61 = 78;
  public static final int ARTL_ART_backend_62 = 79;
  public static final int ARTL_ART_backend_63 = 80;
  public static final int ARTL_ART_backend_64 = 81;
  public static final int ARTL_ART_backend_65 = 82;
  public static final int ARTL_ART_backend_66 = 83;
  public static final int ARTL_ART_backend_67 = 84;
  public static final int ARTL_ART_backend_68 = 85;
  public static final int ARTL_ART_backend_69 = 86;
  public static final int ARTL_ART_backend_70 = 87;
  public static final int ARTL_ART_backend_71 = 88;
  public static final int ARTL_ART_backend_72 = 89;
  public static final int ARTL_ART_backend_73 = 90;
  public static final int ARTL_ART_backend_74 = 91;
  public static final int ARTL_ART_backend_75 = 92;
  public static final int ARTL_ART_backend_76 = 93;
  public static final int ARTL_ART_backend_77 = 94;
  public static final int ARTL_ART_backend_78 = 95;
  public static final int ARTL_ART_comment_79 = 96;
  public static final int ARTL_ART_comment_80 = 97;
  public static final int ARTL_ART_comment_81 = 98;
  public static final int ARTL_ART_comment_82 = 99;
  public static final int ARTL_ART_comment_83 = 100;
  public static final int ARTL_ART_comment_84 = 101;
  public static final int ARTL_ART_comment_85 = 102;
  public static final int ARTL_ART_comment_86 = 103;
  public static final int ARTL_ART_deref_211 = 104;
  public static final int ARTL_ART_deref_212 = 105;
  public static final int ARTL_ART_deref_213 = 106;
  public static final int ARTL_ART_deref_214 = 107;
  public static final int ARTL_ART_div_183 = 108;
  public static final int ARTL_ART_div_184 = 109;
  public static final int ARTL_ART_div_185 = 110;
  public static final int ARTL_ART_div_186 = 111;
  public static final int ARTL_ART_div_187 = 112;
  public static final int ARTL_ART_div_188 = 113;
  public static final int ARTL_ART_div_189 = 114;
  public static final int ARTL_ART_div_190 = 115;
  public static final int ARTL_ART_eq_131 = 116;
  public static final int ARTL_ART_eq_132 = 117;
  public static final int ARTL_ART_eq_133 = 118;
  public static final int ARTL_ART_eq_134 = 119;
  public static final int ARTL_ART_eq_135 = 120;
  public static final int ARTL_ART_eq_136 = 121;
  public static final int ARTL_ART_eq_137 = 122;
  public static final int ARTL_ART_eq_138 = 123;
  public static final int ARTL_ART_gt_107 = 124;
  public static final int ARTL_ART_gt_108 = 125;
  public static final int ARTL_ART_gt_109 = 126;
  public static final int ARTL_ART_gt_110 = 127;
  public static final int ARTL_ART_gt_111 = 128;
  public static final int ARTL_ART_gt_112 = 129;
  public static final int ARTL_ART_gt_113 = 130;
  public static final int ARTL_ART_gt_114 = 131;
  public static final int ARTL_ART_if_41 = 132;
  public static final int ARTL_ART_if_42 = 133;
  public static final int ARTL_ART_if_43 = 134;
  public static final int ARTL_ART_if_44 = 135;
  public static final int ARTL_ART_if_45 = 136;
  public static final int ARTL_ART_if_46 = 137;
  public static final int ARTL_ART_if_47 = 138;
  public static final int ARTL_ART_if_48 = 139;
  public static final int ARTL_ART_if_49 = 140;
  public static final int ARTL_ART_if_50 = 141;
  public static final int ARTL_ART_if_51 = 142;
  public static final int ARTL_ART_if_52 = 143;
  public static final int ARTL_ART_lt_123 = 144;
  public static final int ARTL_ART_lt_124 = 145;
  public static final int ARTL_ART_lt_125 = 146;
  public static final int ARTL_ART_lt_126 = 147;
  public static final int ARTL_ART_lt_127 = 148;
  public static final int ARTL_ART_lt_128 = 149;
  public static final int ARTL_ART_lt_129 = 150;
  public static final int ARTL_ART_lt_130 = 151;
  public static final int ARTL_ART_mul_175 = 152;
  public static final int ARTL_ART_mul_176 = 153;
  public static final int ARTL_ART_mul_177 = 154;
  public static final int ARTL_ART_mul_178 = 155;
  public static final int ARTL_ART_mul_179 = 156;
  public static final int ARTL_ART_mul_180 = 157;
  public static final int ARTL_ART_mul_181 = 158;
  public static final int ARTL_ART_mul_182 = 159;
  public static final int ARTL_ART_ne_115 = 160;
  public static final int ARTL_ART_ne_116 = 161;
  public static final int ARTL_ART_ne_117 = 162;
  public static final int ARTL_ART_ne_118 = 163;
  public static final int ARTL_ART_ne_119 = 164;
  public static final int ARTL_ART_ne_120 = 165;
  public static final int ARTL_ART_ne_121 = 166;
  public static final int ARTL_ART_ne_122 = 167;
  public static final int ARTL_ART_operand_191 = 168;
  public static final int ARTL_ART_operand_192 = 169;
  public static final int ARTL_ART_operand_193 = 170;
  public static final int ARTL_ART_operand_194 = 171;
  public static final int ARTL_ART_operand_195 = 172;
  public static final int ARTL_ART_operand_196 = 173;
  public static final int ARTL_ART_operand_197 = 174;
  public static final int ARTL_ART_operand_198 = 175;
  public static final int ARTL_ART_operand_199 = 176;
  public static final int ARTL_ART_operand_200 = 177;
  public static final int ARTL_ART_operand_201 = 178;
  public static final int ARTL_ART_operand_202 = 179;
  public static final int ARTL_ART_operand_203 = 180;
  public static final int ARTL_ART_operand_204 = 181;
  public static final int ARTL_ART_operand_205 = 182;
  public static final int ARTL_ART_operand_206 = 183;
  public static final int ARTL_ART_operand_207 = 184;
  public static final int ARTL_ART_operand_208 = 185;
  public static final int ARTL_ART_operand_209 = 186;
  public static final int ARTL_ART_operand_210 = 187;
  public static final int ARTL_ART_relExpr_87 = 188;
  public static final int ARTL_ART_relExpr_88 = 189;
  public static final int ARTL_ART_relExpr_89 = 190;
  public static final int ARTL_ART_relExpr_90 = 191;
  public static final int ARTL_ART_relExpr_91 = 192;
  public static final int ARTL_ART_relExpr_92 = 193;
  public static final int ARTL_ART_relExpr_93 = 194;
  public static final int ARTL_ART_relExpr_94 = 195;
  public static final int ARTL_ART_relExpr_95 = 196;
  public static final int ARTL_ART_relExpr_96 = 197;
  public static final int ARTL_ART_relExpr_97 = 198;
  public static final int ARTL_ART_relExpr_98 = 199;
  public static final int ARTL_ART_relExpr_99 = 200;
  public static final int ARTL_ART_relExpr_100 = 201;
  public static final int ARTL_ART_relExpr_101 = 202;
  public static final int ARTL_ART_relExpr_102 = 203;
  public static final int ARTL_ART_relExpr_103 = 204;
  public static final int ARTL_ART_relExpr_104 = 205;
  public static final int ARTL_ART_relExpr_105 = 206;
  public static final int ARTL_ART_relExpr_106 = 207;
  public static final int ARTL_ART_seq_25 = 208;
  public static final int ARTL_ART_seq_26 = 209;
  public static final int ARTL_ART_seq_27 = 210;
  public static final int ARTL_ART_seq_28 = 211;
  public static final int ARTL_ART_seq_29 = 212;
  public static final int ARTL_ART_seq_30 = 213;
  public static final int ARTL_ART_statement_1 = 214;
  public static final int ARTL_ART_statement_2 = 215;
  public static final int ARTL_ART_statement_3 = 216;
  public static final int ARTL_ART_statement_4 = 217;
  public static final int ARTL_ART_statement_5 = 218;
  public static final int ARTL_ART_statement_6 = 219;
  public static final int ARTL_ART_statement_7 = 220;
  public static final int ARTL_ART_statement_8 = 221;
  public static final int ARTL_ART_statement_9 = 222;
  public static final int ARTL_ART_statement_10 = 223;
  public static final int ARTL_ART_statement_11 = 224;
  public static final int ARTL_ART_statement_12 = 225;
  public static final int ARTL_ART_statement_13 = 226;
  public static final int ARTL_ART_statement_14 = 227;
  public static final int ARTL_ART_statement_15 = 228;
  public static final int ARTL_ART_statement_16 = 229;
  public static final int ARTL_ART_statement_17 = 230;
  public static final int ARTL_ART_statement_18 = 231;
  public static final int ARTL_ART_statement_19 = 232;
  public static final int ARTL_ART_statement_20 = 233;
  public static final int ARTL_ART_statement_21 = 234;
  public static final int ARTL_ART_statement_22 = 235;
  public static final int ARTL_ART_statement_23 = 236;
  public static final int ARTL_ART_statement_24 = 237;
  public static final int ARTL_ART_sub_159 = 238;
  public static final int ARTL_ART_sub_160 = 239;
  public static final int ARTL_ART_sub_161 = 240;
  public static final int ARTL_ART_sub_162 = 241;
  public static final int ARTL_ART_sub_163 = 242;
  public static final int ARTL_ART_sub_164 = 243;
  public static final int ARTL_ART_sub_165 = 244;
  public static final int ARTL_ART_sub_166 = 245;
  public static final int ARTL_ART_subExpr_139 = 246;
  public static final int ARTL_ART_subExpr_140 = 247;
  public static final int ARTL_ART_subExpr_141 = 248;
  public static final int ARTL_ART_subExpr_142 = 249;
  public static final int ARTL_ART_subExpr_143 = 250;
  public static final int ARTL_ART_subExpr_144 = 251;
  public static final int ARTL_ART_subExpr_145 = 252;
  public static final int ARTL_ART_subExpr_146 = 253;
  public static final int ARTL_ART_subExpr_147 = 254;
  public static final int ARTL_ART_subExpr_148 = 255;
  public static final int ARTL_ART_subExpr_149 = 256;
  public static final int ARTL_ART_subExpr_150 = 257;
  public static final int ARTL_ART_subExpr_151 = 258;
  public static final int ARTL_ART_subExpr_152 = 259;
  public static final int ARTL_ART_subExpr_153 = 260;
  public static final int ARTL_ART_subExpr_154 = 261;
  public static final int ARTL_ART_subExpr_155 = 262;
  public static final int ARTL_ART_subExpr_156 = 263;
  public static final int ARTL_ART_subExpr_157 = 264;
  public static final int ARTL_ART_subExpr_158 = 265;
  public static final int ARTL_ART_while_53 = 266;
  public static final int ARTL_ART_while_54 = 267;
  public static final int ARTL_ART_while_55 = 268;
  public static final int ARTL_ART_while_56 = 269;
  public static final int ARTL_ART_while_57 = 270;
  public static final int ARTL_ART_while_58 = 271;
  public static final int ARTL_ART_while_59 = 272;
  public static final int ARTL_ART_while_60 = 273;
  public static final int ARTX_DESPATCH = 274;
  public static final int ARTX_DUMMY = 275;
  public static final int ARTX_LABEL_EXTENT = 276;
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
          artFindDescriptor(ARTL_ART_ID_216, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_216: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_218, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_INTEGER_222, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_222: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_224, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_REAL() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal REAL production descriptor loads*/
      case ARTL_ART_REAL: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_REAL_228, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_228: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_230, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_add() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal add production descriptor loads*/
      case ARTL_ART_add: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_add_168, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal add: match production*/
      case ARTL_ART_add_168: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_170, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_add_170: 
        /* Nonterminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_add_172, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_174, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_add_174: 
        /* Nonterminal template end */
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
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_assign_32, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_32: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_34, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_assign_34: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_36, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_38, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_assign_38: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_40, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_backend() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal backend production descriptor loads*/
      case ARTL_ART_backend: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_backend_62, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal backend: match production*/
      case ARTL_ART_backend_62: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_backend, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_64, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_66, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_68, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_68: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_70, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_72, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_72: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_74, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_76, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_76: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_78, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_comment() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal comment production descriptor loads*/
      case ARTL_ART_comment: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_comment_80, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal comment: match production*/
      case ARTL_ART_comment_80: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH_SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_comment_82, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_comment_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__BACKSLASHn, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_comment_86, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_deref() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal deref production descriptor loads*/
      case ARTL_ART_deref: 
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_deref_212, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal deref: match production*/
      case ARTL_ART_deref_212: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_deref_214, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_deref_214: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_div() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal div production descriptor loads*/
      case ARTL_ART_div: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_div_184, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal div: match production*/
      case ARTL_ART_div_184: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_186, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_div_186: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_div_188, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_190, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_div_190: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_eq() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal eq production descriptor loads*/
      case ARTL_ART_eq: 
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_eq_132, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal eq: match production*/
      case ARTL_ART_eq_132: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_134, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_eq_134: 
        /* Nonterminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_eq_136, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_138, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_eq_138: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_gt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal gt production descriptor loads*/
      case ARTL_ART_gt: 
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_gt_108, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal gt: match production*/
      case ARTL_ART_gt_108: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_110, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_gt_110: 
        /* Nonterminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_gt_112, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_114, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_gt_114: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_if() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal if production descriptor loads*/
      case ARTL_ART_if: 
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_42, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal if: match production*/
      case ARTL_ART_if_42: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_44, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_46: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_48, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_48: 
        /* Nonterminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_50, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_52, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_52: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_lt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal lt production descriptor loads*/
      case ARTL_ART_lt: 
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_lt_124, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal lt: match production*/
      case ARTL_ART_lt_124: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_126, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_lt_126: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_lt_128, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_130, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_lt_130: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_mul() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal mul production descriptor loads*/
      case ARTL_ART_mul: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mul_176, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal mul: match production*/
      case ARTL_ART_mul_176: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_178, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_mul_178: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_mul_180, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_182, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_mul_182: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ne() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ne production descriptor loads*/
      case ARTL_ART_ne: 
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ne_116, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ne: match production*/
      case ARTL_ART_ne_116: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_118, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_ne_118: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ne_120, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_122, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_ne_122: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_192, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_196, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_200, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_204, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_192: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_194, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_operand_194: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_196: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_198, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_198: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_200: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_202, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_operand_202: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_204: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_206, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_208, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_operand_208: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_210, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_88, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_92, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_96, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_100, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_104, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_88: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_90, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_90: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_92: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_94, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_gt; return; }
      case ARTL_ART_relExpr_94: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_96: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_98, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ne; return; }
      case ARTL_ART_relExpr_98: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_100: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_102, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_lt; return; }
      case ARTL_ART_relExpr_102: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_104: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_eq; return; }
      case ARTL_ART_relExpr_106: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_seq() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal seq production descriptor loads*/
      case ARTL_ART_seq: 
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_seq_26, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal seq: match production*/
      case ARTL_ART_seq_26: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_28, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_28: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_30, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_30: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_10, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_18, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_22, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
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
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_22: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_24, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_comment; return; }
      case ARTL_ART_statement_24: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sub() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sub production descriptor loads*/
      case ARTL_ART_sub: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sub_160, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sub: match production*/
      case ARTL_ART_sub_160: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_162, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_sub_162: 
        /* Nonterminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sub_164, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_166, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_sub_166: 
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
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_140, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_144, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_148, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_152, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_156, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_140: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_142, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_142: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_144: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_146, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sub; return; }
      case ARTL_ART_subExpr_146: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_148: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_150, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_add; return; }
      case ARTL_ART_subExpr_150: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_152: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_154, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mul; return; }
      case ARTL_ART_subExpr_154: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_156: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_158, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_div; return; }
      case ARTL_ART_subExpr_158: 
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
        if (ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_while_54, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal while: match production*/
      case ARTL_ART_while_54: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_56, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_58, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_while_58: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_60, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_while_60: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 48;
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
        case ARTL_ART_REAL: 
          ARTPF_ART_REAL();
          break;
        case ARTL_ART_add: 
          ARTPF_ART_add();
          break;
        case ARTL_ART_assign: 
          ARTPF_ART_assign();
          break;
        case ARTL_ART_backend: 
          ARTPF_ART_backend();
          break;
        case ARTL_ART_comment: 
          ARTPF_ART_comment();
          break;
        case ARTL_ART_deref: 
          ARTPF_ART_deref();
          break;
        case ARTL_ART_div: 
          ARTPF_ART_div();
          break;
        case ARTL_ART_eq: 
          ARTPF_ART_eq();
          break;
        case ARTL_ART_gt: 
          ARTPF_ART_gt();
          break;
        case ARTL_ART_if: 
          ARTPF_ART_if();
          break;
        case ARTL_ART_lt: 
          ARTPF_ART_lt();
          break;
        case ARTL_ART_mul: 
          ARTPF_ART_mul();
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

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTB_ID] = true;
    ARTSet6[ARTTS__SHREIK_EQUAL] = true;
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__STAR] = true;
    ARTSet6[ARTTS__PLUS] = true;
    ARTSet6[ARTTS__COMMA] = true;
    ARTSet6[ARTTS__MINUS] = true;
    ARTSet6[ARTTS__SLASH] = true;
    ARTSet6[ARTTS__SLASH_SLASH] = true;
    ARTSet6[ARTTS__SEMICOLON] = true;
    ARTSet6[ARTTS__LT] = true;
    ARTSet6[ARTTS__EQUAL_EQUAL] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS_backend] = true;
    ARTSet6[ARTTS_if] = true;
    ARTSet6[ARTTS_while] = true;
    ARTSet6[ARTL_ART_ID] = true;
    ARTSet6[ARTL_ART_assign] = true;
    ARTSet6[ARTL_ART_backend] = true;
    ARTSet6[ARTL_ART_comment] = true;
    ARTSet6[ARTL_ART_if] = true;
    ARTSet6[ARTL_ART_seq] = true;
    ARTSet6[ARTL_ART_statement] = true;
    ARTSet6[ARTL_ART_while] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTB_ID] = true;
    ARTSet11[ARTL_ART_ID] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTB_INTEGER] = true;
    ARTSet35[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS_if] = true;
    ARTSet38[ARTL_ART_if] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS__BACKSLASHn] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS_while] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTB_ID] = true;
    ARTSet34[ARTL_ART_ID] = true;
    ARTSet34[ARTL_ART_deref] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS_if] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS_else] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTB_ID] = true;
    ARTSet28[ARTTS__SLASH_SLASH] = true;
    ARTSet28[ARTTS_backend] = true;
    ARTSet28[ARTTS_if] = true;
    ARTSet28[ARTTS_while] = true;
    ARTSet28[ARTL_ART_ID] = true;
    ARTSet28[ARTL_ART_assign] = true;
    ARTSet28[ARTL_ART_backend] = true;
    ARTSet28[ARTL_ART_comment] = true;
    ARTSet28[ARTL_ART_if] = true;
    ARTSet28[ARTL_ART_seq] = true;
    ARTSet28[ARTL_ART_statement] = true;
    ARTSet28[ARTL_ART_while] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS__SLASH_SLASH] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTS_backend] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTS__SLASH_SLASH] = true;
    ARTSet41[ARTL_ART_comment] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTB_ID] = true;
    ARTSet24[ARTTS__SHREIK_EQUAL] = true;
    ARTSet24[ARTTS__SLASH_SLASH] = true;
    ARTSet24[ARTTS__LT] = true;
    ARTSet24[ARTTS__EQUAL_EQUAL] = true;
    ARTSet24[ARTTS__GT] = true;
    ARTSet24[ARTTS_backend] = true;
    ARTSet24[ARTTS_if] = true;
    ARTSet24[ARTTS_while] = true;
    ARTSet24[ARTL_ART_ID] = true;
    ARTSet24[ARTL_ART_assign] = true;
    ARTSet24[ARTL_ART_backend] = true;
    ARTSet24[ARTL_ART_comment] = true;
    ARTSet24[ARTL_ART_if] = true;
    ARTSet24[ARTL_ART_seq] = true;
    ARTSet24[ARTL_ART_statement] = true;
    ARTSet24[ARTL_ART_while] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTX_EOS] = true;
    ARTSet12[ARTTB_ID] = true;
    ARTSet12[ARTTS__SLASH_SLASH] = true;
    ARTSet12[ARTTS_backend] = true;
    ARTSet12[ARTTS_else] = true;
    ARTSet12[ARTTS_if] = true;
    ARTSet12[ARTTS_while] = true;
    ARTSet12[ARTL_ART_ID] = true;
    ARTSet12[ARTL_ART_assign] = true;
    ARTSet12[ARTL_ART_backend] = true;
    ARTSet12[ARTL_ART_comment] = true;
    ARTSet12[ARTL_ART_if] = true;
    ARTSet12[ARTL_ART_seq] = true;
    ARTSet12[ARTL_ART_statement] = true;
    ARTSet12[ARTL_ART_while] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_ID] = true;
    ARTSet8[ARTTB_INTEGER] = true;
    ARTSet8[ARTTB_REAL] = true;
    ARTSet8[ARTTS__LPAR] = true;
    ARTSet8[ARTL_ART_ID] = true;
    ARTSet8[ARTL_ART_INTEGER] = true;
    ARTSet8[ARTL_ART_REAL] = true;
    ARTSet8[ARTL_ART_add] = true;
    ARTSet8[ARTL_ART_deref] = true;
    ARTSet8[ARTL_ART_div] = true;
    ARTSet8[ARTL_ART_mul] = true;
    ARTSet8[ARTL_ART_operand] = true;
    ARTSet8[ARTL_ART_sub] = true;
    ARTSet8[ARTL_ART_subExpr] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTB_ID] = true;
    ARTSet37[ARTL_ART_ID] = true;
    ARTSet37[ARTL_ART_assign] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS__LPAR] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTS_backend] = true;
    ARTSet40[ARTL_ART_backend] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__RPAR] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS__STAR] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS__PLUS] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS__COMMA] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTS__MINUS] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTB_ID] = true;
    ARTSet33[ARTTB_INTEGER] = true;
    ARTSet33[ARTTB_REAL] = true;
    ARTSet33[ARTTS__LPAR] = true;
    ARTSet33[ARTL_ART_ID] = true;
    ARTSet33[ARTL_ART_INTEGER] = true;
    ARTSet33[ARTL_ART_REAL] = true;
    ARTSet33[ARTL_ART_deref] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS__SLASH] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTB_REAL] = true;
    ARTSet36[ARTL_ART_REAL] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTB_ID] = true;
    ARTSet23[ARTTB_INTEGER] = true;
    ARTSet23[ARTTB_REAL] = true;
    ARTSet23[ARTTS__LPAR] = true;
    ARTSet23[ARTL_ART_ID] = true;
    ARTSet23[ARTL_ART_INTEGER] = true;
    ARTSet23[ARTL_ART_REAL] = true;
    ARTSet23[ARTL_ART_add] = true;
    ARTSet23[ARTL_ART_deref] = true;
    ARTSet23[ARTL_ART_div] = true;
    ARTSet23[ARTL_ART_eq] = true;
    ARTSet23[ARTL_ART_gt] = true;
    ARTSet23[ARTL_ART_lt] = true;
    ARTSet23[ARTL_ART_mul] = true;
    ARTSet23[ARTL_ART_ne] = true;
    ARTSet23[ARTL_ART_operand] = true;
    ARTSet23[ARTL_ART_relExpr] = true;
    ARTSet23[ARTL_ART_sub] = true;
    ARTSet23[ARTL_ART_subExpr] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTB_ID] = true;
    ARTSet10[ARTTB_INTEGER] = true;
    ARTSet10[ARTTB_REAL] = true;
    ARTSet10[ARTTS__LPAR] = true;
    ARTSet10[ARTL_ART_ID] = true;
    ARTSet10[ARTL_ART_INTEGER] = true;
    ARTSet10[ARTL_ART_REAL] = true;
    ARTSet10[ARTL_ART_deref] = true;
    ARTSet10[ARTL_ART_operand] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS__LT] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTS__EQUAL] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_REAL] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS__GT] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTB_ID] = true;
    ARTSet3[ARTTS__SHREIK_EQUAL] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__STAR] = true;
    ARTSet3[ARTTS__PLUS] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__SLASH] = true;
    ARTSet3[ARTTS__SLASH_SLASH] = true;
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__EQUAL] = true;
    ARTSet3[ARTTS__EQUAL_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS_backend] = true;
    ARTSet3[ARTTS_if] = true;
    ARTSet3[ARTTS_while] = true;
    ARTSet3[ARTL_ART_ID] = true;
    ARTSet3[ARTL_ART_assign] = true;
    ARTSet3[ARTL_ART_backend] = true;
    ARTSet3[ARTL_ART_comment] = true;
    ARTSet3[ARTL_ART_if] = true;
    ARTSet3[ARTL_ART_seq] = true;
    ARTSet3[ARTL_ART_statement] = true;
    ARTSet3[ARTL_ART_while] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS_while] = true;
    ARTSet39[ARTL_ART_while] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet6initialise();
    ARTSet11initialise();
    ARTSet35initialise();
    ARTSet38initialise();
    ARTSet21initialise();
    ARTSet43initialise();
    ARTSet34initialise();
    ARTSet2initialise();
    ARTSet27initialise();
    ARTSet29initialise();
    ARTSet28initialise();
    ARTSet19initialise();
    ARTSet25initialise();
    ARTSet5initialise();
    ARTSet15initialise();
    ARTSet41initialise();
    ARTSet24initialise();
    ARTSet12initialise();
    ARTSet8initialise();
    ARTSet37initialise();
    ARTSet16initialise();
    ARTSet40initialise();
    ARTSet18initialise();
    ARTSet31initialise();
    ARTSet9initialise();
    ARTSet17initialise();
    ARTSet20initialise();
    ARTSet42initialise();
    ARTSet33initialise();
    ARTSet22initialise();
    ARTSet36initialise();
    ARTSet23initialise();
    ARTSet10initialise();
    ARTSet14initialise();
    ARTSet30initialise();
    ARTSet32initialise();
    ARTSet13initialise();
    ARTSet4initialise();
    ARTSet7initialise();
    ARTSet26initialise();
    ARTSet3initialise();
    ARTSet39initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_216] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_216] = "";
    artlhsL[ARTL_ART_ID_216] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_216] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_216] = true;
    artFolds[ARTL_ART_ID_218] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_ID_217] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_217] = "";
    artlhsL[ARTL_ART_ID_217] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_217] = true;
    artLabelInternalStrings[ARTL_ART_ID_218] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_218] = "";
    artlhsL[ARTL_ART_ID_218] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_218] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_218] = true;
    arteoR_pL[ARTL_ART_ID_218] = true;
    artPopD[ARTL_ART_ID_218] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_222] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_222] = "";
    artlhsL[ARTL_ART_INTEGER_222] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_222] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_222] = true;
    artFolds[ARTL_ART_INTEGER_224] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_INTEGER_223] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_223] = "";
    artlhsL[ARTL_ART_INTEGER_223] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_223] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_224] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_224] = "";
    artlhsL[ARTL_ART_INTEGER_224] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_224] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_224] = true;
    arteoR_pL[ARTL_ART_INTEGER_224] = true;
    artPopD[ARTL_ART_INTEGER_224] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_228] = "REAL ::= . &REAL  ";
    artLabelStrings[ARTL_ART_REAL_228] = "";
    artlhsL[ARTL_ART_REAL_228] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_228] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_228] = true;
    artFolds[ARTL_ART_REAL_230] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_REAL_229] = "REAL ::= &REAL  ";
    artLabelStrings[ARTL_ART_REAL_229] = "";
    artlhsL[ARTL_ART_REAL_229] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_229] = true;
    artLabelInternalStrings[ARTL_ART_REAL_230] = "REAL ::= &REAL  .";
    artLabelStrings[ARTL_ART_REAL_230] = "";
    artlhsL[ARTL_ART_REAL_230] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_230] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_230] = true;
    arteoR_pL[ARTL_ART_REAL_230] = true;
    artPopD[ARTL_ART_REAL_230] = true;
  }

  public void artTableInitialiser_ART_add() {
    artLabelInternalStrings[ARTL_ART_add] = "add";
    artLabelStrings[ARTL_ART_add] = "add";
    artKindOfs[ARTL_ART_add] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_add_168] = "add ::= . subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_168] = "";
    artlhsL[ARTL_ART_add_168] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_168] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_170] = "add ::= subExpr . '+'  operand ";
    artLabelStrings[ARTL_ART_add_170] = "";
    artlhsL[ARTL_ART_add_170] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_170] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_add_170] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_add_170] = true;
    artFolds[ARTL_ART_add_172] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_add_171] = "add ::= subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_171] = "";
    artlhsL[ARTL_ART_add_171] = ARTL_ART_add;
    artLabelInternalStrings[ARTL_ART_add_172] = "add ::= subExpr '+'  . operand ";
    artLabelStrings[ARTL_ART_add_172] = "";
    artlhsL[ARTL_ART_add_172] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_172] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_174] = "add ::= subExpr '+'  operand .";
    artLabelStrings[ARTL_ART_add_174] = "";
    artlhsL[ARTL_ART_add_174] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_174] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_add_174] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_add_174] = true;
    arteoR_pL[ARTL_ART_add_174] = true;
    artPopD[ARTL_ART_add_174] = true;
  }

  public void artTableInitialiser_ART_assign() {
    artLabelInternalStrings[ARTL_ART_assign] = "assign";
    artLabelStrings[ARTL_ART_assign] = "assign";
    artKindOfs[ARTL_ART_assign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_assign_32] = "assign ::= . ID '='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_32] = "";
    artlhsL[ARTL_ART_assign_32] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_32] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_34] = "assign ::= ID . '='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_34] = "";
    artlhsL[ARTL_ART_assign_34] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_34] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_assign_34] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_assign_34] = true;
    artFolds[ARTL_ART_assign_36] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_35] = "assign ::= ID '='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_35] = "";
    artlhsL[ARTL_ART_assign_35] = ARTL_ART_assign;
    artLabelInternalStrings[ARTL_ART_assign_36] = "assign ::= ID '='  . subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_36] = "";
    artlhsL[ARTL_ART_assign_36] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_36] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_38] = "assign ::= ID '='  subExpr . ';'  ";
    artLabelStrings[ARTL_ART_assign_38] = "";
    artlhsL[ARTL_ART_assign_38] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_38] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_assign_38] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_assign_38] = true;
    artFolds[ARTL_ART_assign_40] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_39] = "assign ::= ID '='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_39] = "";
    artlhsL[ARTL_ART_assign_39] = ARTL_ART_assign;
    artPopD[ARTL_ART_assign_39] = true;
    artLabelInternalStrings[ARTL_ART_assign_40] = "assign ::= ID '='  subExpr ';'  .";
    artLabelStrings[ARTL_ART_assign_40] = "";
    artlhsL[ARTL_ART_assign_40] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_40] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_40] = true;
    arteoR_pL[ARTL_ART_assign_40] = true;
    artPopD[ARTL_ART_assign_40] = true;
  }

  public void artTableInitialiser_ART_backend() {
    artLabelInternalStrings[ARTL_ART_backend] = "backend";
    artLabelStrings[ARTL_ART_backend] = "backend";
    artKindOfs[ARTL_ART_backend] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_backend_62] = "backend ::= . 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_62] = "";
    artlhsL[ARTL_ART_backend_62] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_62] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_64] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_63] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_63] = "";
    artlhsL[ARTL_ART_backend_63] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_64] = "backend ::= 'backend'  . '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_64] = "";
    artlhsL[ARTL_ART_backend_64] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_64] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_backend_64] = true;
    artFolds[ARTL_ART_backend_66] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_65] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_65] = "";
    artlhsL[ARTL_ART_backend_65] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_66] = "backend ::= 'backend'  '('  . subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_66] = "";
    artlhsL[ARTL_ART_backend_66] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_66] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_68] = "backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_68] = "";
    artlhsL[ARTL_ART_backend_68] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_68] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_68] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_70] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_69] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_69] = "";
    artlhsL[ARTL_ART_backend_69] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_70] = "backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_70] = "";
    artlhsL[ARTL_ART_backend_70] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_70] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_72] = "backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_72] = "";
    artlhsL[ARTL_ART_backend_72] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_72] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_72] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_74] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_73] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_73] = "";
    artlhsL[ARTL_ART_backend_73] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_74] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_74] = "";
    artlhsL[ARTL_ART_backend_74] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_74] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_76] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_backend_76] = "";
    artlhsL[ARTL_ART_backend_76] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_76] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_76] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_backend_76] = true;
    artFolds[ARTL_ART_backend_78] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_77] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_77] = "";
    artlhsL[ARTL_ART_backend_77] = ARTL_ART_backend;
    artPopD[ARTL_ART_backend_77] = true;
    artLabelInternalStrings[ARTL_ART_backend_78] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .";
    artLabelStrings[ARTL_ART_backend_78] = "";
    artlhsL[ARTL_ART_backend_78] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_78] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_backend_78] = true;
    arteoR_pL[ARTL_ART_backend_78] = true;
    artPopD[ARTL_ART_backend_78] = true;
  }

  public void artTableInitialiser_ART_comment() {
    artLabelInternalStrings[ARTL_ART_comment] = "comment";
    artLabelStrings[ARTL_ART_comment] = "comment";
    artKindOfs[ARTL_ART_comment] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_comment_80] = "comment ::= . '//'  &STRING_DQ  '\\n'  ";
    artLabelStrings[ARTL_ART_comment_80] = "";
    artlhsL[ARTL_ART_comment_80] = ARTL_ART_comment;
    artKindOfs[ARTL_ART_comment_80] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_comment_80] = true;
    artFolds[ARTL_ART_comment_82] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_comment_81] = "comment ::= '//'  &STRING_DQ  '\\n'  ";
    artLabelStrings[ARTL_ART_comment_81] = "";
    artlhsL[ARTL_ART_comment_81] = ARTL_ART_comment;
    artPopD[ARTL_ART_comment_81] = true;
    artLabelInternalStrings[ARTL_ART_comment_82] = "comment ::= '//'  . &STRING_DQ  '\\n'  ";
    artLabelStrings[ARTL_ART_comment_82] = "";
    artlhsL[ARTL_ART_comment_82] = ARTL_ART_comment;
    artKindOfs[ARTL_ART_comment_82] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_comment_82] = true;
    artPopD[ARTL_ART_comment_82] = true;
    artLabelInternalStrings[ARTL_ART_comment_83] = "comment ::= '//'  &STRING_DQ  '\\n'  ";
    artLabelStrings[ARTL_ART_comment_83] = "";
    artlhsL[ARTL_ART_comment_83] = ARTL_ART_comment;
    artPopD[ARTL_ART_comment_83] = true;
    artLabelInternalStrings[ARTL_ART_comment_84] = "comment ::= '//'  &STRING_DQ  . '\\n'  ";
    artLabelStrings[ARTL_ART_comment_84] = "";
    artlhsL[ARTL_ART_comment_84] = ARTL_ART_comment;
    artKindOfs[ARTL_ART_comment_84] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_comment_84] = true;
    artFolds[ARTL_ART_comment_86] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_comment_85] = "comment ::= '//'  &STRING_DQ  '\\n'  ";
    artLabelStrings[ARTL_ART_comment_85] = "";
    artlhsL[ARTL_ART_comment_85] = ARTL_ART_comment;
    artPopD[ARTL_ART_comment_85] = true;
    artLabelInternalStrings[ARTL_ART_comment_86] = "comment ::= '//'  &STRING_DQ  '\\n'  .";
    artLabelStrings[ARTL_ART_comment_86] = "";
    artlhsL[ARTL_ART_comment_86] = ARTL_ART_comment;
    artKindOfs[ARTL_ART_comment_86] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_comment_86] = true;
    arteoR_pL[ARTL_ART_comment_86] = true;
    artPopD[ARTL_ART_comment_86] = true;
  }

  public void artTableInitialiser_ART_deref() {
    artLabelInternalStrings[ARTL_ART_deref] = "deref";
    artLabelStrings[ARTL_ART_deref] = "deref";
    artKindOfs[ARTL_ART_deref] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_deref_212] = "deref ::= . ID ";
    artLabelStrings[ARTL_ART_deref_212] = "";
    artlhsL[ARTL_ART_deref_212] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_deref_212] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_deref_214] = "deref ::= ID .";
    artLabelStrings[ARTL_ART_deref_214] = "";
    artlhsL[ARTL_ART_deref_214] = ARTL_ART_deref;
    artSlotInstanceOfs[ARTL_ART_deref_214] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_deref_214] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_deref_214] = true;
    arteoR_pL[ARTL_ART_deref_214] = true;
    artPopD[ARTL_ART_deref_214] = true;
  }

  public void artTableInitialiser_ART_div() {
    artLabelInternalStrings[ARTL_ART_div] = "div";
    artLabelStrings[ARTL_ART_div] = "div";
    artKindOfs[ARTL_ART_div] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_div_184] = "div ::= . subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_184] = "";
    artlhsL[ARTL_ART_div_184] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_184] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_186] = "div ::= subExpr . '/'  operand ";
    artLabelStrings[ARTL_ART_div_186] = "";
    artlhsL[ARTL_ART_div_186] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_186] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_div_186] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_div_186] = true;
    artFolds[ARTL_ART_div_188] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_div_187] = "div ::= subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_187] = "";
    artlhsL[ARTL_ART_div_187] = ARTL_ART_div;
    artLabelInternalStrings[ARTL_ART_div_188] = "div ::= subExpr '/'  . operand ";
    artLabelStrings[ARTL_ART_div_188] = "";
    artlhsL[ARTL_ART_div_188] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_188] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_190] = "div ::= subExpr '/'  operand .";
    artLabelStrings[ARTL_ART_div_190] = "";
    artlhsL[ARTL_ART_div_190] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_190] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_div_190] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_div_190] = true;
    arteoR_pL[ARTL_ART_div_190] = true;
    artPopD[ARTL_ART_div_190] = true;
  }

  public void artTableInitialiser_ART_eq() {
    artLabelInternalStrings[ARTL_ART_eq] = "eq";
    artLabelStrings[ARTL_ART_eq] = "eq";
    artKindOfs[ARTL_ART_eq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_eq_132] = "eq ::= . relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_132] = "";
    artlhsL[ARTL_ART_eq_132] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_132] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_134] = "eq ::= relExpr . '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_134] = "";
    artlhsL[ARTL_ART_eq_134] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_134] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_eq_134] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_eq_134] = true;
    artFolds[ARTL_ART_eq_136] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_eq_135] = "eq ::= relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_135] = "";
    artlhsL[ARTL_ART_eq_135] = ARTL_ART_eq;
    artLabelInternalStrings[ARTL_ART_eq_136] = "eq ::= relExpr '=='  . subExpr ";
    artLabelStrings[ARTL_ART_eq_136] = "";
    artlhsL[ARTL_ART_eq_136] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_136] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_138] = "eq ::= relExpr '=='  subExpr .";
    artLabelStrings[ARTL_ART_eq_138] = "";
    artlhsL[ARTL_ART_eq_138] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_138] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_eq_138] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_eq_138] = true;
    arteoR_pL[ARTL_ART_eq_138] = true;
    artPopD[ARTL_ART_eq_138] = true;
  }

  public void artTableInitialiser_ART_gt() {
    artLabelInternalStrings[ARTL_ART_gt] = "gt";
    artLabelStrings[ARTL_ART_gt] = "gt";
    artKindOfs[ARTL_ART_gt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_gt_108] = "gt ::= . relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_108] = "";
    artlhsL[ARTL_ART_gt_108] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_108] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_110] = "gt ::= relExpr . '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_110] = "";
    artlhsL[ARTL_ART_gt_110] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_110] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_gt_110] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_gt_110] = true;
    artFolds[ARTL_ART_gt_112] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_gt_111] = "gt ::= relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_111] = "";
    artlhsL[ARTL_ART_gt_111] = ARTL_ART_gt;
    artLabelInternalStrings[ARTL_ART_gt_112] = "gt ::= relExpr '>'  . subExpr ";
    artLabelStrings[ARTL_ART_gt_112] = "";
    artlhsL[ARTL_ART_gt_112] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_112] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_114] = "gt ::= relExpr '>'  subExpr .";
    artLabelStrings[ARTL_ART_gt_114] = "";
    artlhsL[ARTL_ART_gt_114] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_114] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_gt_114] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_gt_114] = true;
    arteoR_pL[ARTL_ART_gt_114] = true;
    artPopD[ARTL_ART_gt_114] = true;
  }

  public void artTableInitialiser_ART_if() {
    artLabelInternalStrings[ARTL_ART_if] = "if";
    artLabelStrings[ARTL_ART_if] = "if";
    artKindOfs[ARTL_ART_if] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_if_42] = "if ::= . 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_42] = "";
    artlhsL[ARTL_ART_if_42] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_42] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_44] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_43] = "if ::= 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_43] = "";
    artlhsL[ARTL_ART_if_43] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_44] = "if ::= 'if'  . relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_44] = "";
    artlhsL[ARTL_ART_if_44] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_44] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_if_44] = true;
    artLabelInternalStrings[ARTL_ART_if_46] = "if ::= 'if'  relExpr . statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_46] = "";
    artlhsL[ARTL_ART_if_46] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_46] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_if_46] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_48] = "if ::= 'if'  relExpr statement . 'else'  statement ";
    artLabelStrings[ARTL_ART_if_48] = "";
    artlhsL[ARTL_ART_if_48] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_48] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_48] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_50] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_49] = "if ::= 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_if_49] = "";
    artlhsL[ARTL_ART_if_49] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_50] = "if ::= 'if'  relExpr statement 'else'  . statement ";
    artLabelStrings[ARTL_ART_if_50] = "";
    artlhsL[ARTL_ART_if_50] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_50] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_52] = "if ::= 'if'  relExpr statement 'else'  statement .";
    artLabelStrings[ARTL_ART_if_52] = "";
    artlhsL[ARTL_ART_if_52] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_52] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_52] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_if_52] = true;
    arteoR_pL[ARTL_ART_if_52] = true;
    artPopD[ARTL_ART_if_52] = true;
  }

  public void artTableInitialiser_ART_lt() {
    artLabelInternalStrings[ARTL_ART_lt] = "lt";
    artLabelStrings[ARTL_ART_lt] = "lt";
    artKindOfs[ARTL_ART_lt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_lt_124] = "lt ::= . relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_124] = "";
    artlhsL[ARTL_ART_lt_124] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_124] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_126] = "lt ::= relExpr . '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_126] = "";
    artlhsL[ARTL_ART_lt_126] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_126] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_lt_126] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_lt_126] = true;
    artFolds[ARTL_ART_lt_128] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_lt_127] = "lt ::= relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_127] = "";
    artlhsL[ARTL_ART_lt_127] = ARTL_ART_lt;
    artLabelInternalStrings[ARTL_ART_lt_128] = "lt ::= relExpr '<'  . subExpr ";
    artLabelStrings[ARTL_ART_lt_128] = "";
    artlhsL[ARTL_ART_lt_128] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_128] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_130] = "lt ::= relExpr '<'  subExpr .";
    artLabelStrings[ARTL_ART_lt_130] = "";
    artlhsL[ARTL_ART_lt_130] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_130] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_lt_130] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_lt_130] = true;
    arteoR_pL[ARTL_ART_lt_130] = true;
    artPopD[ARTL_ART_lt_130] = true;
  }

  public void artTableInitialiser_ART_mul() {
    artLabelInternalStrings[ARTL_ART_mul] = "mul";
    artLabelStrings[ARTL_ART_mul] = "mul";
    artKindOfs[ARTL_ART_mul] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_mul_176] = "mul ::= . subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_176] = "";
    artlhsL[ARTL_ART_mul_176] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_176] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_178] = "mul ::= subExpr . '*'  operand ";
    artLabelStrings[ARTL_ART_mul_178] = "";
    artlhsL[ARTL_ART_mul_178] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_178] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_mul_178] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mul_178] = true;
    artFolds[ARTL_ART_mul_180] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_mul_179] = "mul ::= subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_179] = "";
    artlhsL[ARTL_ART_mul_179] = ARTL_ART_mul;
    artLabelInternalStrings[ARTL_ART_mul_180] = "mul ::= subExpr '*'  . operand ";
    artLabelStrings[ARTL_ART_mul_180] = "";
    artlhsL[ARTL_ART_mul_180] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_180] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_182] = "mul ::= subExpr '*'  operand .";
    artLabelStrings[ARTL_ART_mul_182] = "";
    artlhsL[ARTL_ART_mul_182] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_182] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_mul_182] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mul_182] = true;
    arteoR_pL[ARTL_ART_mul_182] = true;
    artPopD[ARTL_ART_mul_182] = true;
  }

  public void artTableInitialiser_ART_ne() {
    artLabelInternalStrings[ARTL_ART_ne] = "ne";
    artLabelStrings[ARTL_ART_ne] = "ne";
    artKindOfs[ARTL_ART_ne] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ne_116] = "ne ::= . relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_116] = "";
    artlhsL[ARTL_ART_ne_116] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_116] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_118] = "ne ::= relExpr . '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_118] = "";
    artlhsL[ARTL_ART_ne_118] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_118] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_ne_118] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ne_118] = true;
    artFolds[ARTL_ART_ne_120] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_ne_119] = "ne ::= relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_119] = "";
    artlhsL[ARTL_ART_ne_119] = ARTL_ART_ne;
    artLabelInternalStrings[ARTL_ART_ne_120] = "ne ::= relExpr '!='  . subExpr ";
    artLabelStrings[ARTL_ART_ne_120] = "";
    artlhsL[ARTL_ART_ne_120] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_120] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_122] = "ne ::= relExpr '!='  subExpr .";
    artLabelStrings[ARTL_ART_ne_122] = "";
    artlhsL[ARTL_ART_ne_122] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_122] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_ne_122] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ne_122] = true;
    arteoR_pL[ARTL_ART_ne_122] = true;
    artPopD[ARTL_ART_ne_122] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_192] = "operand ::= . deref ";
    artLabelStrings[ARTL_ART_operand_192] = "";
    artlhsL[ARTL_ART_operand_192] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_192] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_194] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_194] = "operand ::= deref .";
    artLabelStrings[ARTL_ART_operand_194] = "";
    artlhsL[ARTL_ART_operand_194] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_194] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_operand_194] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_194] = true;
    arteoR_pL[ARTL_ART_operand_194] = true;
    artPopD[ARTL_ART_operand_194] = true;
    artLabelInternalStrings[ARTL_ART_operand_196] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_196] = "";
    artlhsL[ARTL_ART_operand_196] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_196] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_198] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_198] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_198] = "";
    artlhsL[ARTL_ART_operand_198] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_198] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_198] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_198] = true;
    arteoR_pL[ARTL_ART_operand_198] = true;
    artPopD[ARTL_ART_operand_198] = true;
    artLabelInternalStrings[ARTL_ART_operand_200] = "operand ::= . REAL ";
    artLabelStrings[ARTL_ART_operand_200] = "";
    artlhsL[ARTL_ART_operand_200] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_200] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_202] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_202] = "operand ::= REAL .";
    artLabelStrings[ARTL_ART_operand_202] = "";
    artlhsL[ARTL_ART_operand_202] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_202] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_operand_202] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_202] = true;
    arteoR_pL[ARTL_ART_operand_202] = true;
    artPopD[ARTL_ART_operand_202] = true;
    artLabelInternalStrings[ARTL_ART_operand_204] = "operand ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_204] = "";
    artlhsL[ARTL_ART_operand_204] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_204] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_206] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_205] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_205] = "";
    artlhsL[ARTL_ART_operand_205] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_206] = "operand ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_206] = "";
    artlhsL[ARTL_ART_operand_206] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_206] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_206] = true;
    artFolds[ARTL_ART_operand_208] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_208] = "operand ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_208] = "";
    artlhsL[ARTL_ART_operand_208] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_208] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_operand_208] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_208] = true;
    artFolds[ARTL_ART_operand_210] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_209] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_209] = "";
    artlhsL[ARTL_ART_operand_209] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_209] = true;
    artLabelInternalStrings[ARTL_ART_operand_210] = "operand ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_210] = "";
    artlhsL[ARTL_ART_operand_210] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_210] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_210] = true;
    arteoR_pL[ARTL_ART_operand_210] = true;
    artPopD[ARTL_ART_operand_210] = true;
  }

  public void artTableInitialiser_ART_relExpr() {
    artLabelInternalStrings[ARTL_ART_relExpr] = "relExpr";
    artLabelStrings[ARTL_ART_relExpr] = "relExpr";
    artKindOfs[ARTL_ART_relExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_relExpr_88] = "relExpr ::= . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_88] = "";
    artlhsL[ARTL_ART_relExpr_88] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_88] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_90] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_90] = "relExpr ::= subExpr .";
    artLabelStrings[ARTL_ART_relExpr_90] = "";
    artlhsL[ARTL_ART_relExpr_90] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_90] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_90] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_90] = true;
    arteoR_pL[ARTL_ART_relExpr_90] = true;
    artPopD[ARTL_ART_relExpr_90] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_92] = "relExpr ::= . gt ";
    artLabelStrings[ARTL_ART_relExpr_92] = "";
    artlhsL[ARTL_ART_relExpr_92] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_92] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_94] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_94] = "relExpr ::= gt .";
    artLabelStrings[ARTL_ART_relExpr_94] = "";
    artlhsL[ARTL_ART_relExpr_94] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_94] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_relExpr_94] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_94] = true;
    arteoR_pL[ARTL_ART_relExpr_94] = true;
    artPopD[ARTL_ART_relExpr_94] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_96] = "relExpr ::= . ne ";
    artLabelStrings[ARTL_ART_relExpr_96] = "";
    artlhsL[ARTL_ART_relExpr_96] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_96] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_98] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_98] = "relExpr ::= ne .";
    artLabelStrings[ARTL_ART_relExpr_98] = "";
    artlhsL[ARTL_ART_relExpr_98] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_98] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_relExpr_98] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_98] = true;
    arteoR_pL[ARTL_ART_relExpr_98] = true;
    artPopD[ARTL_ART_relExpr_98] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_100] = "relExpr ::= . lt ";
    artLabelStrings[ARTL_ART_relExpr_100] = "";
    artlhsL[ARTL_ART_relExpr_100] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_100] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_102] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_102] = "relExpr ::= lt .";
    artLabelStrings[ARTL_ART_relExpr_102] = "";
    artlhsL[ARTL_ART_relExpr_102] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_102] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_relExpr_102] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_102] = true;
    arteoR_pL[ARTL_ART_relExpr_102] = true;
    artPopD[ARTL_ART_relExpr_102] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_104] = "relExpr ::= . eq ";
    artLabelStrings[ARTL_ART_relExpr_104] = "";
    artlhsL[ARTL_ART_relExpr_104] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_104] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_106] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_106] = "relExpr ::= eq .";
    artLabelStrings[ARTL_ART_relExpr_106] = "";
    artlhsL[ARTL_ART_relExpr_106] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_106] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_relExpr_106] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_106] = true;
    arteoR_pL[ARTL_ART_relExpr_106] = true;
    artPopD[ARTL_ART_relExpr_106] = true;
  }

  public void artTableInitialiser_ART_seq() {
    artLabelInternalStrings[ARTL_ART_seq] = "seq";
    artLabelStrings[ARTL_ART_seq] = "seq";
    artKindOfs[ARTL_ART_seq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_seq_26] = "seq ::= . statement statement ";
    artLabelStrings[ARTL_ART_seq_26] = "";
    artlhsL[ARTL_ART_seq_26] = ARTL_ART_seq;
    artKindOfs[ARTL_ART_seq_26] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_seq_28] = "seq ::= statement . statement ";
    artLabelStrings[ARTL_ART_seq_28] = "";
    artlhsL[ARTL_ART_seq_28] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_28] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_28] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_seq_28] = true;
    artLabelInternalStrings[ARTL_ART_seq_30] = "seq ::= statement statement .";
    artLabelStrings[ARTL_ART_seq_30] = "";
    artlhsL[ARTL_ART_seq_30] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_30] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_30] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_seq_30] = true;
    arteoR_pL[ARTL_ART_seq_30] = true;
    artPopD[ARTL_ART_seq_30] = true;
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
    artLabelInternalStrings[ARTL_ART_statement_22] = "statement ::= . comment ";
    artLabelStrings[ARTL_ART_statement_22] = "";
    artlhsL[ARTL_ART_statement_22] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_22] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_24] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_24] = "statement ::= comment .";
    artLabelStrings[ARTL_ART_statement_24] = "";
    artlhsL[ARTL_ART_statement_24] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_24] = ARTL_ART_comment;
    artKindOfs[ARTL_ART_statement_24] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_24] = true;
    arteoR_pL[ARTL_ART_statement_24] = true;
    artPopD[ARTL_ART_statement_24] = true;
  }

  public void artTableInitialiser_ART_sub() {
    artLabelInternalStrings[ARTL_ART_sub] = "sub";
    artLabelStrings[ARTL_ART_sub] = "sub";
    artKindOfs[ARTL_ART_sub] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_sub_160] = "sub ::= . subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_160] = "";
    artlhsL[ARTL_ART_sub_160] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_160] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_162] = "sub ::= subExpr . '-'  operand ";
    artLabelStrings[ARTL_ART_sub_162] = "";
    artlhsL[ARTL_ART_sub_162] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_162] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_sub_162] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sub_162] = true;
    artFolds[ARTL_ART_sub_164] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sub_163] = "sub ::= subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_163] = "";
    artlhsL[ARTL_ART_sub_163] = ARTL_ART_sub;
    artLabelInternalStrings[ARTL_ART_sub_164] = "sub ::= subExpr '-'  . operand ";
    artLabelStrings[ARTL_ART_sub_164] = "";
    artlhsL[ARTL_ART_sub_164] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_164] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_166] = "sub ::= subExpr '-'  operand .";
    artLabelStrings[ARTL_ART_sub_166] = "";
    artlhsL[ARTL_ART_sub_166] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_166] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_sub_166] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sub_166] = true;
    arteoR_pL[ARTL_ART_sub_166] = true;
    artPopD[ARTL_ART_sub_166] = true;
  }

  public void artTableInitialiser_ART_subExpr() {
    artLabelInternalStrings[ARTL_ART_subExpr] = "subExpr";
    artLabelStrings[ARTL_ART_subExpr] = "subExpr";
    artKindOfs[ARTL_ART_subExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExpr_140] = "subExpr ::= . operand ";
    artLabelStrings[ARTL_ART_subExpr_140] = "";
    artlhsL[ARTL_ART_subExpr_140] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_140] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_142] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_142] = "subExpr ::= operand .";
    artLabelStrings[ARTL_ART_subExpr_142] = "";
    artlhsL[ARTL_ART_subExpr_142] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_142] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_142] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_142] = true;
    arteoR_pL[ARTL_ART_subExpr_142] = true;
    artPopD[ARTL_ART_subExpr_142] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_144] = "subExpr ::= . sub ";
    artLabelStrings[ARTL_ART_subExpr_144] = "";
    artlhsL[ARTL_ART_subExpr_144] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_144] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_146] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_146] = "subExpr ::= sub .";
    artLabelStrings[ARTL_ART_subExpr_146] = "";
    artlhsL[ARTL_ART_subExpr_146] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_146] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_subExpr_146] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_146] = true;
    arteoR_pL[ARTL_ART_subExpr_146] = true;
    artPopD[ARTL_ART_subExpr_146] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_148] = "subExpr ::= . add ";
    artLabelStrings[ARTL_ART_subExpr_148] = "";
    artlhsL[ARTL_ART_subExpr_148] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_148] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_150] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_150] = "subExpr ::= add .";
    artLabelStrings[ARTL_ART_subExpr_150] = "";
    artlhsL[ARTL_ART_subExpr_150] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_150] = ARTL_ART_add;
    artKindOfs[ARTL_ART_subExpr_150] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_150] = true;
    arteoR_pL[ARTL_ART_subExpr_150] = true;
    artPopD[ARTL_ART_subExpr_150] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_152] = "subExpr ::= . mul ";
    artLabelStrings[ARTL_ART_subExpr_152] = "";
    artlhsL[ARTL_ART_subExpr_152] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_152] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_154] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_154] = "subExpr ::= mul .";
    artLabelStrings[ARTL_ART_subExpr_154] = "";
    artlhsL[ARTL_ART_subExpr_154] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_154] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_subExpr_154] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_154] = true;
    arteoR_pL[ARTL_ART_subExpr_154] = true;
    artPopD[ARTL_ART_subExpr_154] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_156] = "subExpr ::= . div ";
    artLabelStrings[ARTL_ART_subExpr_156] = "";
    artlhsL[ARTL_ART_subExpr_156] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_156] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_158] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_158] = "subExpr ::= div .";
    artLabelStrings[ARTL_ART_subExpr_158] = "";
    artlhsL[ARTL_ART_subExpr_158] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_158] = ARTL_ART_div;
    artKindOfs[ARTL_ART_subExpr_158] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_158] = true;
    arteoR_pL[ARTL_ART_subExpr_158] = true;
    artPopD[ARTL_ART_subExpr_158] = true;
  }

  public void artTableInitialiser_ART_while() {
    artLabelInternalStrings[ARTL_ART_while] = "while";
    artLabelStrings[ARTL_ART_while] = "while";
    artKindOfs[ARTL_ART_while] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_while_54] = "while ::= . 'while'  relExpr statement ";
    artLabelStrings[ARTL_ART_while_54] = "";
    artlhsL[ARTL_ART_while_54] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_54] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_56] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_55] = "while ::= 'while'  relExpr statement ";
    artLabelStrings[ARTL_ART_while_55] = "";
    artlhsL[ARTL_ART_while_55] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_56] = "while ::= 'while'  . relExpr statement ";
    artLabelStrings[ARTL_ART_while_56] = "";
    artlhsL[ARTL_ART_while_56] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_56] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_while_56] = true;
    artLabelInternalStrings[ARTL_ART_while_58] = "while ::= 'while'  relExpr . statement ";
    artLabelStrings[ARTL_ART_while_58] = "";
    artlhsL[ARTL_ART_while_58] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_58] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_while_58] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_while_60] = "while ::= 'while'  relExpr statement .";
    artLabelStrings[ARTL_ART_while_60] = "";
    artlhsL[ARTL_ART_while_60] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_60] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_while_60] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_while_60] = true;
    arteoR_pL[ARTL_ART_while_60] = true;
    artPopD[ARTL_ART_while_60] = true;
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
    artLabelStrings[ARTTB_REAL] = "REAL";
    artLabelInternalStrings[ARTTB_REAL] = "&REAL";
    artKindOfs[ARTTB_REAL] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_REAL] = true;
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
    artLabelStrings[ARTTS__SLASH_SLASH] = "//";
    artLabelInternalStrings[ARTTS__SLASH_SLASH] = "'//'";
    artKindOfs[ARTTS__SLASH_SLASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SLASH_SLASH] = true;
    artLabelStrings[ARTTS__SEMICOLON] = ";";
    artLabelInternalStrings[ARTTS__SEMICOLON] = "';'";
    artKindOfs[ARTTS__SEMICOLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SEMICOLON] = true;
    artLabelStrings[ARTTS__LT] = "<";
    artLabelInternalStrings[ARTTS__LT] = "'<'";
    artKindOfs[ARTTS__LT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT] = true;
    artLabelStrings[ARTTS__EQUAL] = "=";
    artLabelInternalStrings[ARTTS__EQUAL] = "'='";
    artKindOfs[ARTTS__EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL] = true;
    artLabelStrings[ARTTS__EQUAL_EQUAL] = "==";
    artLabelInternalStrings[ARTTS__EQUAL_EQUAL] = "'=='";
    artKindOfs[ARTTS__EQUAL_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL_EQUAL] = true;
    artLabelStrings[ARTTS__GT] = ">";
    artLabelInternalStrings[ARTTS__GT] = "'>'";
    artKindOfs[ARTTS__GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT] = true;
    artLabelStrings[ARTTS__BACKSLASHn] = "\\n";
    artLabelInternalStrings[ARTTS__BACKSLASHn] = "'\\n'";
    artKindOfs[ARTTS__BACKSLASHn] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__BACKSLASHn] = true;
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
    artTableInitialiser_ART_REAL();
    artTableInitialiser_ART_add();
    artTableInitialiser_ART_assign();
    artTableInitialiser_ART_backend();
    artTableInitialiser_ART_comment();
    artTableInitialiser_ART_deref();
    artTableInitialiser_ART_div();
    artTableInitialiser_ART_eq();
    artTableInitialiser_ART_gt();
    artTableInitialiser_ART_if();
    artTableInitialiser_ART_lt();
    artTableInitialiser_ART_mul();
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
    artSetExtent = 48;
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

  public static class ARTAT_ART_REAL extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public ARTValueReal64 v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*ID ::= &ID  .*/
      case ARTL_ART_ID_218: 
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
    case ARTL_ART_INTEGER_224: 
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

public void ARTRD_REAL(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*REAL ::= &REAL  .*/
    case ARTL_ART_REAL_230: 
            ARTRD_REAL(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL);
            if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       REAL.lexeme = artLexeme(REAL.leftExtent, REAL.rightExtent);
  REAL.v = new ARTValueReal64(artLexemeAsReal(REAL.leftExtent, REAL.rightExtent)); 
      break;
        default:
          throw new ARTException("ARTRD_REAL: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_add(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*add ::= subExpr '+'  . operand */
    case ARTL_ART_add_172: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*add ::= subExpr '+'  operand .*/
    case ARTL_ART_add_174: 
            ARTRD_add(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
        default:
          throw new ARTException("ARTRD_add: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_assign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*assign ::= ID '='  . subExpr ';'  */
    case ARTL_ART_assign_36: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                        break;
    /*assign ::= ID '='  subExpr . ';'  */
    case ARTL_ART_assign_38: 
      ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*assign ::= ID '='  subExpr ';'  .*/
    case ARTL_ART_assign_40: 
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
    case ARTL_ART_backend_66: 
                              break;
    /*backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_68: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_70: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  */
    case ARTL_ART_backend_72: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  */
    case ARTL_ART_backend_74: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  */
    case ARTL_ART_backend_76: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .*/
    case ARTL_ART_backend_78: 
            ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_backend: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_comment(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*comment ::= '//'  &STRING_DQ  . '\n'  */
    case ARTL_ART_comment_84: 
                  artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*comment ::= '//'  &STRING_DQ  '\n'  .*/
    case ARTL_ART_comment_86: 
            ARTRD_comment(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_comment: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_deref_214: 
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

public void ARTRD_div(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*div ::= subExpr '/'  . operand */
    case ARTL_ART_div_188: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*div ::= subExpr '/'  operand .*/
    case ARTL_ART_div_190: 
            ARTRD_div(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
        default:
          throw new ARTException("ARTRD_div: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_eq(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*eq ::= relExpr '=='  . subExpr */
    case ARTL_ART_eq_136: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*eq ::= relExpr '=='  subExpr .*/
    case ARTL_ART_eq_138: 
            ARTRD_eq(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_eq: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_gt_112: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*gt ::= relExpr '>'  subExpr .*/
    case ARTL_ART_gt_114: 
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
    case ARTL_ART_if_46: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  relExpr statement . 'else'  statement */
    case ARTL_ART_if_48: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  relExpr statement 'else'  . statement */
    case ARTL_ART_if_50: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  relExpr statement 'else'  statement .*/
    case ARTL_ART_if_52: 
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

public void ARTRD_lt(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*lt ::= relExpr '<'  . subExpr */
    case ARTL_ART_lt_128: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*lt ::= relExpr '<'  subExpr .*/
    case ARTL_ART_lt_130: 
            ARTRD_lt(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_lt: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_mul(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*mul ::= subExpr '*'  . operand */
    case ARTL_ART_mul_180: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*mul ::= subExpr '*'  operand .*/
    case ARTL_ART_mul_182: 
            ARTRD_mul(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
        default:
          throw new ARTException("ARTRD_mul: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_ne_120: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ne ::= relExpr '!='  subExpr .*/
    case ARTL_ART_ne_122: 
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

public void ARTRD_operand(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_REAL REAL1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*operand ::= deref .*/
    case ARTL_ART_operand_194: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_198: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*operand ::= REAL .*/
    case ARTL_ART_operand_202: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*operand ::= '('  subExpr . ')'  */
    case ARTL_ART_operand_208: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*operand ::= '('  subExpr ')'  .*/
    case ARTL_ART_operand_210: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1);
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
    case ARTL_ART_relExpr_90: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= gt .*/
    case ARTL_ART_relExpr_94: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_gt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= ne .*/
    case ARTL_ART_relExpr_98: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ne(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= lt .*/
    case ARTL_ART_relExpr_102: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_lt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= eq .*/
    case ARTL_ART_relExpr_106: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_eq(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
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
    case ARTL_ART_seq_30: 
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
    /*statement ::= comment .*/
    case ARTL_ART_statement_24: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_comment(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
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
    case ARTL_ART_sub_164: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*sub ::= subExpr '-'  operand .*/
    case ARTL_ART_sub_166: 
            ARTRD_sub(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
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
    case ARTL_ART_subExpr_142: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*subExpr ::= sub .*/
    case ARTL_ART_subExpr_146: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sub(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= add .*/
    case ARTL_ART_subExpr_150: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_add(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= mul .*/
    case ARTL_ART_subExpr_154: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_mul(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= div .*/
    case ARTL_ART_subExpr_158: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_div(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
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
    case ARTL_ART_while_58: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*while ::= 'while'  relExpr statement .*/
    case ARTL_ART_while_60: 
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
    case ARTL_ART_REAL:  ARTRD_REAL(artElement.element, artParent, artWriteable, (ARTAT_ART_REAL) artAttributes); break;
    case ARTL_ART_add: ARTRD_add(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_assign: ARTRD_assign(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_backend: ARTRD_backend(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_comment: ARTRD_comment(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_deref: ARTRD_deref(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_div: ARTRD_div(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_eq: ARTRD_eq(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_gt: ARTRD_gt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_if: ARTRD_if(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_lt: ARTRD_lt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_mul: ARTRD_mul(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ne: ARTRD_ne(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_operand: ARTRD_operand(artElement.element, artParent, artWriteable, null, null); break;
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
