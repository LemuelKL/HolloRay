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
  private static boolean[] ARTSet44;
  private static boolean[] ARTSet45;
  private static boolean[] ARTSet46;
  private static boolean[] ARTSet47;
  private static boolean[] ARTSet48;

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
  public static final int ARTTS__SEMICOLON = 14;
  public static final int ARTTS__LT = 15;
  public static final int ARTTS__EQUAL = 16;
  public static final int ARTTS__EQUAL_EQUAL = 17;
  public static final int ARTTS__GT = 18;
  public static final int ARTTS_backend = 19;
  public static final int ARTTS_else = 20;
  public static final int ARTTS_fi = 21;
  public static final int ARTTS_if = 22;
  public static final int ARTTS_init = 23;
  public static final int ARTTS_paint = 24;
  public static final int ARTTS_print = 25;
  public static final int ARTTS_while = 26;
  public static final int ARTX_EPSILON = 27;
  public static final int ARTL_ART_ID = 28;
  public static final int ARTL_ART_INTEGER = 29;
  public static final int ARTL_ART_REAL = 30;
  public static final int ARTL_ART_STRING_DQ = 31;
  public static final int ARTL_ART_add = 32;
  public static final int ARTL_ART_assign = 33;
  public static final int ARTL_ART_backend = 34;
  public static final int ARTL_ART_deref = 35;
  public static final int ARTL_ART_div = 36;
  public static final int ARTL_ART_eq = 37;
  public static final int ARTL_ART_gt = 38;
  public static final int ARTL_ART_if = 39;
  public static final int ARTL_ART_init = 40;
  public static final int ARTL_ART_lt = 41;
  public static final int ARTL_ART_mul = 42;
  public static final int ARTL_ART_ne = 43;
  public static final int ARTL_ART_operand = 44;
  public static final int ARTL_ART_paint = 45;
  public static final int ARTL_ART_print = 46;
  public static final int ARTL_ART_relExpr = 47;
  public static final int ARTL_ART_seq = 48;
  public static final int ARTL_ART_statement = 49;
  public static final int ARTL_ART_sub = 50;
  public static final int ARTL_ART_subExpr = 51;
  public static final int ARTL_ART_while = 52;
  public static final int ARTL_ART_ID_277 = 53;
  public static final int ARTL_ART_ID_278 = 54;
  public static final int ARTL_ART_ID_279 = 55;
  public static final int ARTL_ART_ID_280 = 56;
  public static final int ARTL_ART_INTEGER_283 = 57;
  public static final int ARTL_ART_INTEGER_284 = 58;
  public static final int ARTL_ART_INTEGER_285 = 59;
  public static final int ARTL_ART_INTEGER_286 = 60;
  public static final int ARTL_ART_REAL_289 = 61;
  public static final int ARTL_ART_REAL_290 = 62;
  public static final int ARTL_ART_REAL_291 = 63;
  public static final int ARTL_ART_REAL_292 = 64;
  public static final int ARTL_ART_STRING_DQ_295 = 65;
  public static final int ARTL_ART_STRING_DQ_296 = 66;
  public static final int ARTL_ART_STRING_DQ_297 = 67;
  public static final int ARTL_ART_STRING_DQ_298 = 68;
  public static final int ARTL_ART_add_225 = 69;
  public static final int ARTL_ART_add_226 = 70;
  public static final int ARTL_ART_add_227 = 71;
  public static final int ARTL_ART_add_228 = 72;
  public static final int ARTL_ART_add_229 = 73;
  public static final int ARTL_ART_add_230 = 74;
  public static final int ARTL_ART_add_231 = 75;
  public static final int ARTL_ART_add_232 = 76;
  public static final int ARTL_ART_assign_39 = 77;
  public static final int ARTL_ART_assign_40 = 78;
  public static final int ARTL_ART_assign_41 = 79;
  public static final int ARTL_ART_assign_42 = 80;
  public static final int ARTL_ART_assign_43 = 81;
  public static final int ARTL_ART_assign_44 = 82;
  public static final int ARTL_ART_assign_45 = 83;
  public static final int ARTL_ART_assign_46 = 84;
  public static final int ARTL_ART_assign_47 = 85;
  public static final int ARTL_ART_assign_48 = 86;
  public static final int ARTL_ART_backend_89 = 87;
  public static final int ARTL_ART_backend_90 = 88;
  public static final int ARTL_ART_backend_91 = 89;
  public static final int ARTL_ART_backend_92 = 90;
  public static final int ARTL_ART_backend_93 = 91;
  public static final int ARTL_ART_backend_94 = 92;
  public static final int ARTL_ART_backend_95 = 93;
  public static final int ARTL_ART_backend_96 = 94;
  public static final int ARTL_ART_backend_97 = 95;
  public static final int ARTL_ART_backend_98 = 96;
  public static final int ARTL_ART_backend_99 = 97;
  public static final int ARTL_ART_backend_100 = 98;
  public static final int ARTL_ART_backend_101 = 99;
  public static final int ARTL_ART_backend_102 = 100;
  public static final int ARTL_ART_backend_103 = 101;
  public static final int ARTL_ART_backend_104 = 102;
  public static final int ARTL_ART_backend_105 = 103;
  public static final int ARTL_ART_backend_106 = 104;
  public static final int ARTL_ART_deref_273 = 105;
  public static final int ARTL_ART_deref_274 = 106;
  public static final int ARTL_ART_deref_275 = 107;
  public static final int ARTL_ART_deref_276 = 108;
  public static final int ARTL_ART_div_241 = 109;
  public static final int ARTL_ART_div_242 = 110;
  public static final int ARTL_ART_div_243 = 111;
  public static final int ARTL_ART_div_244 = 112;
  public static final int ARTL_ART_div_245 = 113;
  public static final int ARTL_ART_div_246 = 114;
  public static final int ARTL_ART_div_247 = 115;
  public static final int ARTL_ART_div_248 = 116;
  public static final int ARTL_ART_eq_189 = 117;
  public static final int ARTL_ART_eq_190 = 118;
  public static final int ARTL_ART_eq_191 = 119;
  public static final int ARTL_ART_eq_192 = 120;
  public static final int ARTL_ART_eq_193 = 121;
  public static final int ARTL_ART_eq_194 = 122;
  public static final int ARTL_ART_eq_195 = 123;
  public static final int ARTL_ART_eq_196 = 124;
  public static final int ARTL_ART_gt_165 = 125;
  public static final int ARTL_ART_gt_166 = 126;
  public static final int ARTL_ART_gt_167 = 127;
  public static final int ARTL_ART_gt_168 = 128;
  public static final int ARTL_ART_gt_169 = 129;
  public static final int ARTL_ART_gt_170 = 130;
  public static final int ARTL_ART_gt_171 = 131;
  public static final int ARTL_ART_gt_172 = 132;
  public static final int ARTL_ART_if_49 = 133;
  public static final int ARTL_ART_if_50 = 134;
  public static final int ARTL_ART_if_51 = 135;
  public static final int ARTL_ART_if_52 = 136;
  public static final int ARTL_ART_if_53 = 137;
  public static final int ARTL_ART_if_54 = 138;
  public static final int ARTL_ART_if_55 = 139;
  public static final int ARTL_ART_if_56 = 140;
  public static final int ARTL_ART_if_57 = 141;
  public static final int ARTL_ART_if_58 = 142;
  public static final int ARTL_ART_if_59 = 143;
  public static final int ARTL_ART_if_60 = 144;
  public static final int ARTL_ART_if_61 = 145;
  public static final int ARTL_ART_if_62 = 146;
  public static final int ARTL_ART_if_63 = 147;
  public static final int ARTL_ART_if_64 = 148;
  public static final int ARTL_ART_if_65 = 149;
  public static final int ARTL_ART_if_66 = 150;
  public static final int ARTL_ART_if_67 = 151;
  public static final int ARTL_ART_if_68 = 152;
  public static final int ARTL_ART_if_69 = 153;
  public static final int ARTL_ART_if_70 = 154;
  public static final int ARTL_ART_if_71 = 155;
  public static final int ARTL_ART_if_72 = 156;
  public static final int ARTL_ART_if_73 = 157;
  public static final int ARTL_ART_if_74 = 158;
  public static final int ARTL_ART_if_75 = 159;
  public static final int ARTL_ART_if_76 = 160;
  public static final int ARTL_ART_if_77 = 161;
  public static final int ARTL_ART_if_78 = 162;
  public static final int ARTL_ART_if_79 = 163;
  public static final int ARTL_ART_if_80 = 164;
  public static final int ARTL_ART_init_119 = 165;
  public static final int ARTL_ART_init_120 = 166;
  public static final int ARTL_ART_init_121 = 167;
  public static final int ARTL_ART_init_122 = 168;
  public static final int ARTL_ART_init_123 = 169;
  public static final int ARTL_ART_init_124 = 170;
  public static final int ARTL_ART_init_125 = 171;
  public static final int ARTL_ART_init_126 = 172;
  public static final int ARTL_ART_init_127 = 173;
  public static final int ARTL_ART_init_128 = 174;
  public static final int ARTL_ART_init_129 = 175;
  public static final int ARTL_ART_init_130 = 176;
  public static final int ARTL_ART_init_131 = 177;
  public static final int ARTL_ART_init_132 = 178;
  public static final int ARTL_ART_init_133 = 179;
  public static final int ARTL_ART_init_134 = 180;
  public static final int ARTL_ART_lt_181 = 181;
  public static final int ARTL_ART_lt_182 = 182;
  public static final int ARTL_ART_lt_183 = 183;
  public static final int ARTL_ART_lt_184 = 184;
  public static final int ARTL_ART_lt_185 = 185;
  public static final int ARTL_ART_lt_186 = 186;
  public static final int ARTL_ART_lt_187 = 187;
  public static final int ARTL_ART_lt_188 = 188;
  public static final int ARTL_ART_mul_233 = 189;
  public static final int ARTL_ART_mul_234 = 190;
  public static final int ARTL_ART_mul_235 = 191;
  public static final int ARTL_ART_mul_236 = 192;
  public static final int ARTL_ART_mul_237 = 193;
  public static final int ARTL_ART_mul_238 = 194;
  public static final int ARTL_ART_mul_239 = 195;
  public static final int ARTL_ART_mul_240 = 196;
  public static final int ARTL_ART_ne_173 = 197;
  public static final int ARTL_ART_ne_174 = 198;
  public static final int ARTL_ART_ne_175 = 199;
  public static final int ARTL_ART_ne_176 = 200;
  public static final int ARTL_ART_ne_177 = 201;
  public static final int ARTL_ART_ne_178 = 202;
  public static final int ARTL_ART_ne_179 = 203;
  public static final int ARTL_ART_ne_180 = 204;
  public static final int ARTL_ART_operand_249 = 205;
  public static final int ARTL_ART_operand_250 = 206;
  public static final int ARTL_ART_operand_251 = 207;
  public static final int ARTL_ART_operand_252 = 208;
  public static final int ARTL_ART_operand_253 = 209;
  public static final int ARTL_ART_operand_254 = 210;
  public static final int ARTL_ART_operand_255 = 211;
  public static final int ARTL_ART_operand_256 = 212;
  public static final int ARTL_ART_operand_257 = 213;
  public static final int ARTL_ART_operand_258 = 214;
  public static final int ARTL_ART_operand_259 = 215;
  public static final int ARTL_ART_operand_260 = 216;
  public static final int ARTL_ART_operand_261 = 217;
  public static final int ARTL_ART_operand_262 = 218;
  public static final int ARTL_ART_operand_263 = 219;
  public static final int ARTL_ART_operand_264 = 220;
  public static final int ARTL_ART_operand_265 = 221;
  public static final int ARTL_ART_operand_266 = 222;
  public static final int ARTL_ART_operand_267 = 223;
  public static final int ARTL_ART_operand_268 = 224;
  public static final int ARTL_ART_operand_269 = 225;
  public static final int ARTL_ART_operand_270 = 226;
  public static final int ARTL_ART_operand_271 = 227;
  public static final int ARTL_ART_operand_272 = 228;
  public static final int ARTL_ART_paint_135 = 229;
  public static final int ARTL_ART_paint_136 = 230;
  public static final int ARTL_ART_paint_137 = 231;
  public static final int ARTL_ART_paint_138 = 232;
  public static final int ARTL_ART_paint_139 = 233;
  public static final int ARTL_ART_paint_140 = 234;
  public static final int ARTL_ART_paint_141 = 235;
  public static final int ARTL_ART_paint_142 = 236;
  public static final int ARTL_ART_paint_143 = 237;
  public static final int ARTL_ART_paint_144 = 238;
  public static final int ARTL_ART_print_107 = 239;
  public static final int ARTL_ART_print_108 = 240;
  public static final int ARTL_ART_print_109 = 241;
  public static final int ARTL_ART_print_110 = 242;
  public static final int ARTL_ART_print_111 = 243;
  public static final int ARTL_ART_print_112 = 244;
  public static final int ARTL_ART_print_113 = 245;
  public static final int ARTL_ART_print_114 = 246;
  public static final int ARTL_ART_print_115 = 247;
  public static final int ARTL_ART_print_116 = 248;
  public static final int ARTL_ART_print_117 = 249;
  public static final int ARTL_ART_print_118 = 250;
  public static final int ARTL_ART_relExpr_145 = 251;
  public static final int ARTL_ART_relExpr_146 = 252;
  public static final int ARTL_ART_relExpr_147 = 253;
  public static final int ARTL_ART_relExpr_148 = 254;
  public static final int ARTL_ART_relExpr_149 = 255;
  public static final int ARTL_ART_relExpr_150 = 256;
  public static final int ARTL_ART_relExpr_151 = 257;
  public static final int ARTL_ART_relExpr_152 = 258;
  public static final int ARTL_ART_relExpr_153 = 259;
  public static final int ARTL_ART_relExpr_154 = 260;
  public static final int ARTL_ART_relExpr_155 = 261;
  public static final int ARTL_ART_relExpr_156 = 262;
  public static final int ARTL_ART_relExpr_157 = 263;
  public static final int ARTL_ART_relExpr_158 = 264;
  public static final int ARTL_ART_relExpr_159 = 265;
  public static final int ARTL_ART_relExpr_160 = 266;
  public static final int ARTL_ART_relExpr_161 = 267;
  public static final int ARTL_ART_relExpr_162 = 268;
  public static final int ARTL_ART_relExpr_163 = 269;
  public static final int ARTL_ART_relExpr_164 = 270;
  public static final int ARTL_ART_seq_33 = 271;
  public static final int ARTL_ART_seq_34 = 272;
  public static final int ARTL_ART_seq_35 = 273;
  public static final int ARTL_ART_seq_36 = 274;
  public static final int ARTL_ART_seq_37 = 275;
  public static final int ARTL_ART_seq_38 = 276;
  public static final int ARTL_ART_statement_1 = 277;
  public static final int ARTL_ART_statement_2 = 278;
  public static final int ARTL_ART_statement_3 = 279;
  public static final int ARTL_ART_statement_4 = 280;
  public static final int ARTL_ART_statement_5 = 281;
  public static final int ARTL_ART_statement_6 = 282;
  public static final int ARTL_ART_statement_7 = 283;
  public static final int ARTL_ART_statement_8 = 284;
  public static final int ARTL_ART_statement_9 = 285;
  public static final int ARTL_ART_statement_10 = 286;
  public static final int ARTL_ART_statement_11 = 287;
  public static final int ARTL_ART_statement_12 = 288;
  public static final int ARTL_ART_statement_13 = 289;
  public static final int ARTL_ART_statement_14 = 290;
  public static final int ARTL_ART_statement_15 = 291;
  public static final int ARTL_ART_statement_16 = 292;
  public static final int ARTL_ART_statement_17 = 293;
  public static final int ARTL_ART_statement_18 = 294;
  public static final int ARTL_ART_statement_19 = 295;
  public static final int ARTL_ART_statement_20 = 296;
  public static final int ARTL_ART_statement_21 = 297;
  public static final int ARTL_ART_statement_22 = 298;
  public static final int ARTL_ART_statement_23 = 299;
  public static final int ARTL_ART_statement_24 = 300;
  public static final int ARTL_ART_statement_25 = 301;
  public static final int ARTL_ART_statement_26 = 302;
  public static final int ARTL_ART_statement_27 = 303;
  public static final int ARTL_ART_statement_28 = 304;
  public static final int ARTL_ART_statement_29 = 305;
  public static final int ARTL_ART_statement_30 = 306;
  public static final int ARTL_ART_statement_31 = 307;
  public static final int ARTL_ART_statement_32 = 308;
  public static final int ARTL_ART_sub_217 = 309;
  public static final int ARTL_ART_sub_218 = 310;
  public static final int ARTL_ART_sub_219 = 311;
  public static final int ARTL_ART_sub_220 = 312;
  public static final int ARTL_ART_sub_221 = 313;
  public static final int ARTL_ART_sub_222 = 314;
  public static final int ARTL_ART_sub_223 = 315;
  public static final int ARTL_ART_sub_224 = 316;
  public static final int ARTL_ART_subExpr_197 = 317;
  public static final int ARTL_ART_subExpr_198 = 318;
  public static final int ARTL_ART_subExpr_199 = 319;
  public static final int ARTL_ART_subExpr_200 = 320;
  public static final int ARTL_ART_subExpr_201 = 321;
  public static final int ARTL_ART_subExpr_202 = 322;
  public static final int ARTL_ART_subExpr_203 = 323;
  public static final int ARTL_ART_subExpr_204 = 324;
  public static final int ARTL_ART_subExpr_205 = 325;
  public static final int ARTL_ART_subExpr_206 = 326;
  public static final int ARTL_ART_subExpr_207 = 327;
  public static final int ARTL_ART_subExpr_208 = 328;
  public static final int ARTL_ART_subExpr_209 = 329;
  public static final int ARTL_ART_subExpr_210 = 330;
  public static final int ARTL_ART_subExpr_211 = 331;
  public static final int ARTL_ART_subExpr_212 = 332;
  public static final int ARTL_ART_subExpr_213 = 333;
  public static final int ARTL_ART_subExpr_214 = 334;
  public static final int ARTL_ART_subExpr_215 = 335;
  public static final int ARTL_ART_subExpr_216 = 336;
  public static final int ARTL_ART_while_81 = 337;
  public static final int ARTL_ART_while_82 = 338;
  public static final int ARTL_ART_while_83 = 339;
  public static final int ARTL_ART_while_84 = 340;
  public static final int ARTL_ART_while_85 = 341;
  public static final int ARTL_ART_while_86 = 342;
  public static final int ARTL_ART_while_87 = 343;
  public static final int ARTL_ART_while_88 = 344;
  public static final int ARTX_DESPATCH = 345;
  public static final int ARTX_DUMMY = 346;
  public static final int ARTX_LABEL_EXTENT = 347;
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
          artFindDescriptor(ARTL_ART_ID_278, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_278: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_280, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_INTEGER_284, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_284: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_286, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_REAL_290, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_290: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_292, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_STRING_DQ() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal STRING_DQ production descriptor loads*/
      case ARTL_ART_STRING_DQ: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_STRING_DQ_296, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_296: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_298, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_add_226, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal add: match production*/
      case ARTL_ART_add_226: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_228, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_add_228: 
        /* Nonterminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_add_230, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_232, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_add_232: 
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
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_assign_40, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_40: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_42, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_assign_42: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_44, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_assign_46: 
        /* Nonterminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_48, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_backend() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal backend production descriptor loads*/
      case ARTL_ART_backend: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_backend_90, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal backend: match production*/
      case ARTL_ART_backend_90: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_backend, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_92, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_94, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_96: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_98, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_100, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_100: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_102, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_104, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_104: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_106, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_deref() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal deref production descriptor loads*/
      case ARTL_ART_deref: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_deref_274, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal deref: match production*/
      case ARTL_ART_deref_274: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_deref_276, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_deref_276: 
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
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_div_242, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal div: match production*/
      case ARTL_ART_div_242: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_244, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_div_244: 
        /* Nonterminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_div_246, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_248, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_div_248: 
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
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_eq_190, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal eq: match production*/
      case ARTL_ART_eq_190: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_192, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_eq_192: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_eq_194, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_196, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_eq_196: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_gt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal gt production descriptor loads*/
      case ARTL_ART_gt: 
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_gt_166, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal gt: match production*/
      case ARTL_ART_gt_166: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_168, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_gt_168: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_gt_170, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_172, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_gt_172: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_if() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal if production descriptor loads*/
      case ARTL_ART_if: 
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_68, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal if: match production*/
      case ARTL_ART_if_50: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_52, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_54, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_56: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_58, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_60, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_60: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_62, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_64, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_64: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_fi, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_66, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal if: match production*/
      case ARTL_ART_if_68: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_70, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_72, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_74, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_74: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_76, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_78, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_78: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_fi, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_80, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_init() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal init production descriptor loads*/
      case ARTL_ART_init: 
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_init_120, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal init: match production*/
      case ARTL_ART_init_120: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_init, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_122, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_124, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_init_126, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_init_126: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_128, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_init_130, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_init_130: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_132, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_134, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_lt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal lt production descriptor loads*/
      case ARTL_ART_lt: 
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_lt_182, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal lt: match production*/
      case ARTL_ART_lt_182: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_184, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_lt_184: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_lt_186, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_188, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_lt_188: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_mul() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal mul production descriptor loads*/
      case ARTL_ART_mul: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mul_234, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal mul: match production*/
      case ARTL_ART_mul_234: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_236, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_mul_236: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_mul_238, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_240, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_mul_240: 
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
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ne_174, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ne: match production*/
      case ARTL_ART_ne_174: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_176, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_ne_176: 
        /* Nonterminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ne_178, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_180, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_ne_180: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_250, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_254, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_258, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_262, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_266, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_250: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_252, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_operand_252: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_254: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_256, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_256: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_258: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_260, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_operand_260: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_262: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_264, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_operand_264: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_266: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_268, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_270, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_operand_270: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_272, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_paint() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal paint production descriptor loads*/
      case ARTL_ART_paint: 
        if (ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_paint_136, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal paint: match production*/
      case ARTL_ART_paint_136: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_paint, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_138, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_140, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_142, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_144, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_print() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal print production descriptor loads*/
      case ARTL_ART_print: 
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_print_108, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal print: match production*/
      case ARTL_ART_print_108: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_print, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_110, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_112, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_print_114, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_print_114: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_116, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_118, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_relExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal relExpr production descriptor loads*/
      case ARTL_ART_relExpr: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_146, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_150, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_154, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_158, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_162, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_146: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_148, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_148: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_150: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_152, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_gt; return; }
      case ARTL_ART_relExpr_152: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_154: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_156, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ne; return; }
      case ARTL_ART_relExpr_156: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_158: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_160, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_lt; return; }
      case ARTL_ART_relExpr_160: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_162: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_164, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_eq; return; }
      case ARTL_ART_relExpr_164: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_seq() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal seq production descriptor loads*/
      case ARTL_ART_seq: 
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_seq_34, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal seq: match production*/
      case ARTL_ART_seq_34: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_36, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_36: 
        /* Nonterminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_38, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_38: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_10, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_18, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_22, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_26, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_30, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
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
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_22: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_24, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_print; return; }
      case ARTL_ART_statement_24: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_26: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_28, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_init; return; }
      case ARTL_ART_statement_28: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_30: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_32, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_paint; return; }
      case ARTL_ART_statement_32: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sub() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sub production descriptor loads*/
      case ARTL_ART_sub: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sub_218, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sub: match production*/
      case ARTL_ART_sub_218: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_220, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_sub_220: 
        /* Nonterminal template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sub_222, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_224, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_sub_224: 
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
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_198, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_202, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_206, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_210, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_214, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_198: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_200, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_200: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_202: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_204, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sub; return; }
      case ARTL_ART_subExpr_204: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_206: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_208, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_add; return; }
      case ARTL_ART_subExpr_208: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_210: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_212, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mul; return; }
      case ARTL_ART_subExpr_212: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_214: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_216, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_div; return; }
      case ARTL_ART_subExpr_216: 
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
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_while_82, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal while: match production*/
      case ARTL_ART_while_82: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_86, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_while_86: 
        /* Nonterminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_88, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_while_88: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 53;
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
        case ARTL_ART_STRING_DQ: 
          ARTPF_ART_STRING_DQ();
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
        case ARTL_ART_init: 
          ARTPF_ART_init();
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
        case ARTL_ART_paint: 
          ARTPF_ART_paint();
          break;
        case ARTL_ART_print: 
          ARTPF_ART_print();
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
    ARTSet6[ARTTS__SEMICOLON] = true;
    ARTSet6[ARTTS__LT] = true;
    ARTSet6[ARTTS__EQUAL_EQUAL] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS_backend] = true;
    ARTSet6[ARTTS_if] = true;
    ARTSet6[ARTTS_init] = true;
    ARTSet6[ARTTS_paint] = true;
    ARTSet6[ARTTS_print] = true;
    ARTSet6[ARTTS_while] = true;
    ARTSet6[ARTL_ART_ID] = true;
    ARTSet6[ARTL_ART_assign] = true;
    ARTSet6[ARTL_ART_backend] = true;
    ARTSet6[ARTL_ART_if] = true;
    ARTSet6[ARTL_ART_init] = true;
    ARTSet6[ARTL_ART_paint] = true;
    ARTSet6[ARTL_ART_print] = true;
    ARTSet6[ARTL_ART_seq] = true;
    ARTSet6[ARTL_ART_statement] = true;
    ARTSet6[ARTL_ART_while] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTB_ID] = true;
    ARTSet22[ARTTS__SHREIK_EQUAL] = true;
    ARTSet22[ARTTS__RPAR] = true;
    ARTSet22[ARTTS__LT] = true;
    ARTSet22[ARTTS__EQUAL_EQUAL] = true;
    ARTSet22[ARTTS__GT] = true;
    ARTSet22[ARTTS_backend] = true;
    ARTSet22[ARTTS_if] = true;
    ARTSet22[ARTTS_init] = true;
    ARTSet22[ARTTS_paint] = true;
    ARTSet22[ARTTS_print] = true;
    ARTSet22[ARTTS_while] = true;
    ARTSet22[ARTL_ART_ID] = true;
    ARTSet22[ARTL_ART_assign] = true;
    ARTSet22[ARTL_ART_backend] = true;
    ARTSet22[ARTL_ART_if] = true;
    ARTSet22[ARTL_ART_init] = true;
    ARTSet22[ARTL_ART_paint] = true;
    ARTSet22[ARTL_ART_print] = true;
    ARTSet22[ARTL_ART_seq] = true;
    ARTSet22[ARTL_ART_statement] = true;
    ARTSet22[ARTL_ART_while] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTB_ID] = true;
    ARTSet12[ARTL_ART_ID] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTB_INTEGER] = true;
    ARTSet30[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTS_if] = true;
    ARTSet41[ARTL_ART_if] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS_init] = true;
    ARTSet45[ARTL_ART_init] = true;
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
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__EQUAL] = true;
    ARTSet3[ARTTS__EQUAL_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS_backend] = true;
    ARTSet3[ARTTS_if] = true;
    ARTSet3[ARTTS_init] = true;
    ARTSet3[ARTTS_paint] = true;
    ARTSet3[ARTTS_print] = true;
    ARTSet3[ARTTS_while] = true;
    ARTSet3[ARTL_ART_ID] = true;
    ARTSet3[ARTL_ART_assign] = true;
    ARTSet3[ARTL_ART_backend] = true;
    ARTSet3[ARTL_ART_if] = true;
    ARTSet3[ARTL_ART_init] = true;
    ARTSet3[ARTL_ART_paint] = true;
    ARTSet3[ARTL_ART_print] = true;
    ARTSet3[ARTL_ART_seq] = true;
    ARTSet3[ARTL_ART_statement] = true;
    ARTSet3[ARTL_ART_while] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTB_STRING_DQ] = true;
    ARTSet37[ARTL_ART_STRING_DQ] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS_paint] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTS_while] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTB_ID] = true;
    ARTSet34[ARTTB_INTEGER] = true;
    ARTSet34[ARTTB_REAL] = true;
    ARTSet34[ARTTB_STRING_DQ] = true;
    ARTSet34[ARTTS__LPAR] = true;
    ARTSet34[ARTL_ART_ID] = true;
    ARTSet34[ARTL_ART_INTEGER] = true;
    ARTSet34[ARTL_ART_REAL] = true;
    ARTSet34[ARTL_ART_STRING_DQ] = true;
    ARTSet34[ARTL_ART_deref] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTB_ID] = true;
    ARTSet35[ARTL_ART_ID] = true;
    ARTSet35[ARTL_ART_deref] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTB_ID] = true;
    ARTSet21[ARTTB_INTEGER] = true;
    ARTSet21[ARTTB_REAL] = true;
    ARTSet21[ARTTB_STRING_DQ] = true;
    ARTSet21[ARTTS__LPAR] = true;
    ARTSet21[ARTL_ART_ID] = true;
    ARTSet21[ARTL_ART_INTEGER] = true;
    ARTSet21[ARTL_ART_REAL] = true;
    ARTSet21[ARTL_ART_STRING_DQ] = true;
    ARTSet21[ARTL_ART_add] = true;
    ARTSet21[ARTL_ART_deref] = true;
    ARTSet21[ARTL_ART_div] = true;
    ARTSet21[ARTL_ART_eq] = true;
    ARTSet21[ARTL_ART_gt] = true;
    ARTSet21[ARTL_ART_lt] = true;
    ARTSet21[ARTL_ART_mul] = true;
    ARTSet21[ARTL_ART_ne] = true;
    ARTSet21[ARTL_ART_operand] = true;
    ARTSet21[ARTL_ART_relExpr] = true;
    ARTSet21[ARTL_ART_sub] = true;
    ARTSet21[ARTL_ART_subExpr] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS_if] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS_else] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS_backend] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTB_ID] = true;
    ARTSet40[ARTL_ART_ID] = true;
    ARTSet40[ARTL_ART_assign] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS__LPAR] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS_backend] = true;
    ARTSet43[ARTL_ART_backend] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTB_ID] = true;
    ARTSet9[ARTTB_INTEGER] = true;
    ARTSet9[ARTTB_REAL] = true;
    ARTSet9[ARTTB_STRING_DQ] = true;
    ARTSet9[ARTTS__LPAR] = true;
    ARTSet9[ARTL_ART_ID] = true;
    ARTSet9[ARTL_ART_INTEGER] = true;
    ARTSet9[ARTL_ART_REAL] = true;
    ARTSet9[ARTL_ART_STRING_DQ] = true;
    ARTSet9[ARTL_ART_add] = true;
    ARTSet9[ARTL_ART_deref] = true;
    ARTSet9[ARTL_ART_div] = true;
    ARTSet9[ARTL_ART_mul] = true;
    ARTSet9[ARTL_ART_operand] = true;
    ARTSet9[ARTL_ART_sub] = true;
    ARTSet9[ARTL_ART_subExpr] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS__RPAR] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS_paint] = true;
    ARTSet46[ARTL_ART_paint] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTB_ID] = true;
    ARTSet11[ARTTB_INTEGER] = true;
    ARTSet11[ARTTB_REAL] = true;
    ARTSet11[ARTTB_STRING_DQ] = true;
    ARTSet11[ARTTS__LPAR] = true;
    ARTSet11[ARTL_ART_ID] = true;
    ARTSet11[ARTL_ART_INTEGER] = true;
    ARTSet11[ARTL_ART_REAL] = true;
    ARTSet11[ARTL_ART_STRING_DQ] = true;
    ARTSet11[ARTL_ART_deref] = true;
    ARTSet11[ARTL_ART_operand] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS__STAR] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS__PLUS] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTX_EOS] = true;
    ARTSet13[ARTTB_ID] = true;
    ARTSet13[ARTTS_backend] = true;
    ARTSet13[ARTTS_else] = true;
    ARTSet13[ARTTS_fi] = true;
    ARTSet13[ARTTS_if] = true;
    ARTSet13[ARTTS_init] = true;
    ARTSet13[ARTTS_paint] = true;
    ARTSet13[ARTTS_print] = true;
    ARTSet13[ARTTS_while] = true;
    ARTSet13[ARTL_ART_ID] = true;
    ARTSet13[ARTL_ART_assign] = true;
    ARTSet13[ARTL_ART_backend] = true;
    ARTSet13[ARTL_ART_if] = true;
    ARTSet13[ARTL_ART_init] = true;
    ARTSet13[ARTL_ART_paint] = true;
    ARTSet13[ARTL_ART_print] = true;
    ARTSet13[ARTL_ART_seq] = true;
    ARTSet13[ARTL_ART_statement] = true;
    ARTSet13[ARTL_ART_while] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__COMMA] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTS__MINUS] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS__SLASH] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTB_REAL] = true;
    ARTSet36[ARTL_ART_REAL] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTB_ID] = true;
    ARTSet26[ARTTS_backend] = true;
    ARTSet26[ARTTS_if] = true;
    ARTSet26[ARTTS_init] = true;
    ARTSet26[ARTTS_paint] = true;
    ARTSet26[ARTTS_print] = true;
    ARTSet26[ARTTS_while] = true;
    ARTSet26[ARTL_ART_ID] = true;
    ARTSet26[ARTL_ART_assign] = true;
    ARTSet26[ARTL_ART_backend] = true;
    ARTSet26[ARTL_ART_if] = true;
    ARTSet26[ARTL_ART_init] = true;
    ARTSet26[ARTL_ART_paint] = true;
    ARTSet26[ARTL_ART_print] = true;
    ARTSet26[ARTL_ART_seq] = true;
    ARTSet26[ARTL_ART_statement] = true;
    ARTSet26[ARTL_ART_while] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTS_print] = true;
    ARTSet44[ARTL_ART_print] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS_print] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS__LT] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__EQUAL] = true;
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

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS__GT] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS_init] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS_fi] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTS_while] = true;
    ARTSet42[ARTL_ART_while] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet6initialise();
    ARTSet22initialise();
    ARTSet12initialise();
    ARTSet30initialise();
    ARTSet41initialise();
    ARTSet45initialise();
    ARTSet3initialise();
    ARTSet37initialise();
    ARTSet38initialise();
    ARTSet48initialise();
    ARTSet34initialise();
    ARTSet35initialise();
    ARTSet21initialise();
    ARTSet2initialise();
    ARTSet25initialise();
    ARTSet27initialise();
    ARTSet23initialise();
    ARTSet5initialise();
    ARTSet16initialise();
    ARTSet40initialise();
    ARTSet17initialise();
    ARTSet43initialise();
    ARTSet9initialise();
    ARTSet19initialise();
    ARTSet46initialise();
    ARTSet11initialise();
    ARTSet32initialise();
    ARTSet10initialise();
    ARTSet13initialise();
    ARTSet18initialise();
    ARTSet8initialise();
    ARTSet47initialise();
    ARTSet20initialise();
    ARTSet36initialise();
    ARTSet26initialise();
    ARTSet44initialise();
    ARTSet39initialise();
    ARTSet15initialise();
    ARTSet31initialise();
    ARTSet33initialise();
    ARTSet14initialise();
    ARTSet4initialise();
    ARTSet7initialise();
    ARTSet24initialise();
    ARTSet29initialise();
    ARTSet28initialise();
    ARTSet42initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_278] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_278] = "";
    artlhsL[ARTL_ART_ID_278] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_278] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_278] = true;
    artFolds[ARTL_ART_ID_280] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_ID_279] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_279] = "";
    artlhsL[ARTL_ART_ID_279] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_279] = true;
    artLabelInternalStrings[ARTL_ART_ID_280] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_280] = "";
    artlhsL[ARTL_ART_ID_280] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_280] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_280] = true;
    arteoR_pL[ARTL_ART_ID_280] = true;
    artPopD[ARTL_ART_ID_280] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_284] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_284] = "";
    artlhsL[ARTL_ART_INTEGER_284] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_284] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_284] = true;
    artFolds[ARTL_ART_INTEGER_286] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_INTEGER_285] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_285] = "";
    artlhsL[ARTL_ART_INTEGER_285] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_285] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_286] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_286] = "";
    artlhsL[ARTL_ART_INTEGER_286] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_286] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_286] = true;
    arteoR_pL[ARTL_ART_INTEGER_286] = true;
    artPopD[ARTL_ART_INTEGER_286] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_290] = "REAL ::= . &REAL  ";
    artLabelStrings[ARTL_ART_REAL_290] = "";
    artlhsL[ARTL_ART_REAL_290] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_290] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_290] = true;
    artFolds[ARTL_ART_REAL_292] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_REAL_291] = "REAL ::= &REAL  ";
    artLabelStrings[ARTL_ART_REAL_291] = "";
    artlhsL[ARTL_ART_REAL_291] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_291] = true;
    artLabelInternalStrings[ARTL_ART_REAL_292] = "REAL ::= &REAL  .";
    artLabelStrings[ARTL_ART_REAL_292] = "";
    artlhsL[ARTL_ART_REAL_292] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_292] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_292] = true;
    arteoR_pL[ARTL_ART_REAL_292] = true;
    artPopD[ARTL_ART_REAL_292] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_296] = "STRING_DQ ::= . &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_296] = "";
    artlhsL[ARTL_ART_STRING_DQ_296] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_296] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_296] = true;
    artFolds[ARTL_ART_STRING_DQ_298] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_297] = "STRING_DQ ::= &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_297] = "";
    artlhsL[ARTL_ART_STRING_DQ_297] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_297] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_298] = "STRING_DQ ::= &STRING_DQ  .";
    artLabelStrings[ARTL_ART_STRING_DQ_298] = "";
    artlhsL[ARTL_ART_STRING_DQ_298] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_298] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_298] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_298] = true;
    artPopD[ARTL_ART_STRING_DQ_298] = true;
  }

  public void artTableInitialiser_ART_add() {
    artLabelInternalStrings[ARTL_ART_add] = "add";
    artLabelStrings[ARTL_ART_add] = "add";
    artKindOfs[ARTL_ART_add] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_add_226] = "add ::= . subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_226] = "";
    artlhsL[ARTL_ART_add_226] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_226] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_228] = "add ::= subExpr . '+'  operand ";
    artLabelStrings[ARTL_ART_add_228] = "";
    artlhsL[ARTL_ART_add_228] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_228] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_add_228] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_add_228] = true;
    artFolds[ARTL_ART_add_230] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_add_229] = "add ::= subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_229] = "";
    artlhsL[ARTL_ART_add_229] = ARTL_ART_add;
    artLabelInternalStrings[ARTL_ART_add_230] = "add ::= subExpr '+'  . operand ";
    artLabelStrings[ARTL_ART_add_230] = "";
    artlhsL[ARTL_ART_add_230] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_230] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_232] = "add ::= subExpr '+'  operand .";
    artLabelStrings[ARTL_ART_add_232] = "";
    artlhsL[ARTL_ART_add_232] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_232] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_add_232] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_add_232] = true;
    arteoR_pL[ARTL_ART_add_232] = true;
    artPopD[ARTL_ART_add_232] = true;
  }

  public void artTableInitialiser_ART_assign() {
    artLabelInternalStrings[ARTL_ART_assign] = "assign";
    artLabelStrings[ARTL_ART_assign] = "assign";
    artKindOfs[ARTL_ART_assign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_assign_40] = "assign ::= . ID '='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_40] = "";
    artlhsL[ARTL_ART_assign_40] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_40] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_42] = "assign ::= ID . '='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_42] = "";
    artlhsL[ARTL_ART_assign_42] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_42] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_assign_42] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_assign_42] = true;
    artFolds[ARTL_ART_assign_44] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_43] = "assign ::= ID '='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_43] = "";
    artlhsL[ARTL_ART_assign_43] = ARTL_ART_assign;
    artLabelInternalStrings[ARTL_ART_assign_44] = "assign ::= ID '='  . subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_44] = "";
    artlhsL[ARTL_ART_assign_44] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_44] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_46] = "assign ::= ID '='  subExpr . ';'  ";
    artLabelStrings[ARTL_ART_assign_46] = "";
    artlhsL[ARTL_ART_assign_46] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_46] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_assign_46] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_assign_46] = true;
    artFolds[ARTL_ART_assign_48] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_47] = "assign ::= ID '='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_47] = "";
    artlhsL[ARTL_ART_assign_47] = ARTL_ART_assign;
    artPopD[ARTL_ART_assign_47] = true;
    artLabelInternalStrings[ARTL_ART_assign_48] = "assign ::= ID '='  subExpr ';'  .";
    artLabelStrings[ARTL_ART_assign_48] = "";
    artlhsL[ARTL_ART_assign_48] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_48] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_48] = true;
    arteoR_pL[ARTL_ART_assign_48] = true;
    artPopD[ARTL_ART_assign_48] = true;
  }

  public void artTableInitialiser_ART_backend() {
    artLabelInternalStrings[ARTL_ART_backend] = "backend";
    artLabelStrings[ARTL_ART_backend] = "backend";
    artKindOfs[ARTL_ART_backend] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_backend_90] = "backend ::= . 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_90] = "";
    artlhsL[ARTL_ART_backend_90] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_90] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_92] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_91] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_91] = "";
    artlhsL[ARTL_ART_backend_91] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_92] = "backend ::= 'backend'  . '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_92] = "";
    artlhsL[ARTL_ART_backend_92] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_92] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_backend_92] = true;
    artFolds[ARTL_ART_backend_94] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_93] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_93] = "";
    artlhsL[ARTL_ART_backend_93] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_94] = "backend ::= 'backend'  '('  . subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_94] = "";
    artlhsL[ARTL_ART_backend_94] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_94] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_96] = "backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_96] = "";
    artlhsL[ARTL_ART_backend_96] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_96] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_96] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_98] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_97] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_97] = "";
    artlhsL[ARTL_ART_backend_97] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_98] = "backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_98] = "";
    artlhsL[ARTL_ART_backend_98] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_98] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_100] = "backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_100] = "";
    artlhsL[ARTL_ART_backend_100] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_100] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_100] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_102] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_101] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_101] = "";
    artlhsL[ARTL_ART_backend_101] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_102] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_102] = "";
    artlhsL[ARTL_ART_backend_102] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_102] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_104] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_backend_104] = "";
    artlhsL[ARTL_ART_backend_104] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_104] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_104] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_backend_104] = true;
    artFolds[ARTL_ART_backend_106] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_105] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_105] = "";
    artlhsL[ARTL_ART_backend_105] = ARTL_ART_backend;
    artPopD[ARTL_ART_backend_105] = true;
    artLabelInternalStrings[ARTL_ART_backend_106] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .";
    artLabelStrings[ARTL_ART_backend_106] = "";
    artlhsL[ARTL_ART_backend_106] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_106] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_backend_106] = true;
    arteoR_pL[ARTL_ART_backend_106] = true;
    artPopD[ARTL_ART_backend_106] = true;
  }

  public void artTableInitialiser_ART_deref() {
    artLabelInternalStrings[ARTL_ART_deref] = "deref";
    artLabelStrings[ARTL_ART_deref] = "deref";
    artKindOfs[ARTL_ART_deref] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_deref_274] = "deref ::= . ID ";
    artLabelStrings[ARTL_ART_deref_274] = "";
    artlhsL[ARTL_ART_deref_274] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_deref_274] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_deref_276] = "deref ::= ID .";
    artLabelStrings[ARTL_ART_deref_276] = "";
    artlhsL[ARTL_ART_deref_276] = ARTL_ART_deref;
    artSlotInstanceOfs[ARTL_ART_deref_276] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_deref_276] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_deref_276] = true;
    arteoR_pL[ARTL_ART_deref_276] = true;
    artPopD[ARTL_ART_deref_276] = true;
  }

  public void artTableInitialiser_ART_div() {
    artLabelInternalStrings[ARTL_ART_div] = "div";
    artLabelStrings[ARTL_ART_div] = "div";
    artKindOfs[ARTL_ART_div] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_div_242] = "div ::= . subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_242] = "";
    artlhsL[ARTL_ART_div_242] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_242] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_244] = "div ::= subExpr . '/'  operand ";
    artLabelStrings[ARTL_ART_div_244] = "";
    artlhsL[ARTL_ART_div_244] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_244] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_div_244] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_div_244] = true;
    artFolds[ARTL_ART_div_246] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_div_245] = "div ::= subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_245] = "";
    artlhsL[ARTL_ART_div_245] = ARTL_ART_div;
    artLabelInternalStrings[ARTL_ART_div_246] = "div ::= subExpr '/'  . operand ";
    artLabelStrings[ARTL_ART_div_246] = "";
    artlhsL[ARTL_ART_div_246] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_246] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_248] = "div ::= subExpr '/'  operand .";
    artLabelStrings[ARTL_ART_div_248] = "";
    artlhsL[ARTL_ART_div_248] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_248] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_div_248] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_div_248] = true;
    arteoR_pL[ARTL_ART_div_248] = true;
    artPopD[ARTL_ART_div_248] = true;
  }

  public void artTableInitialiser_ART_eq() {
    artLabelInternalStrings[ARTL_ART_eq] = "eq";
    artLabelStrings[ARTL_ART_eq] = "eq";
    artKindOfs[ARTL_ART_eq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_eq_190] = "eq ::= . relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_190] = "";
    artlhsL[ARTL_ART_eq_190] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_190] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_192] = "eq ::= relExpr . '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_192] = "";
    artlhsL[ARTL_ART_eq_192] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_192] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_eq_192] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_eq_192] = true;
    artFolds[ARTL_ART_eq_194] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_eq_193] = "eq ::= relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_193] = "";
    artlhsL[ARTL_ART_eq_193] = ARTL_ART_eq;
    artLabelInternalStrings[ARTL_ART_eq_194] = "eq ::= relExpr '=='  . subExpr ";
    artLabelStrings[ARTL_ART_eq_194] = "";
    artlhsL[ARTL_ART_eq_194] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_194] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_196] = "eq ::= relExpr '=='  subExpr .";
    artLabelStrings[ARTL_ART_eq_196] = "";
    artlhsL[ARTL_ART_eq_196] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_196] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_eq_196] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_eq_196] = true;
    arteoR_pL[ARTL_ART_eq_196] = true;
    artPopD[ARTL_ART_eq_196] = true;
  }

  public void artTableInitialiser_ART_gt() {
    artLabelInternalStrings[ARTL_ART_gt] = "gt";
    artLabelStrings[ARTL_ART_gt] = "gt";
    artKindOfs[ARTL_ART_gt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_gt_166] = "gt ::= . relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_166] = "";
    artlhsL[ARTL_ART_gt_166] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_166] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_168] = "gt ::= relExpr . '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_168] = "";
    artlhsL[ARTL_ART_gt_168] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_168] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_gt_168] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_gt_168] = true;
    artFolds[ARTL_ART_gt_170] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_gt_169] = "gt ::= relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_169] = "";
    artlhsL[ARTL_ART_gt_169] = ARTL_ART_gt;
    artLabelInternalStrings[ARTL_ART_gt_170] = "gt ::= relExpr '>'  . subExpr ";
    artLabelStrings[ARTL_ART_gt_170] = "";
    artlhsL[ARTL_ART_gt_170] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_170] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_172] = "gt ::= relExpr '>'  subExpr .";
    artLabelStrings[ARTL_ART_gt_172] = "";
    artlhsL[ARTL_ART_gt_172] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_172] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_gt_172] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_gt_172] = true;
    arteoR_pL[ARTL_ART_gt_172] = true;
    artPopD[ARTL_ART_gt_172] = true;
  }

  public void artTableInitialiser_ART_if() {
    artLabelInternalStrings[ARTL_ART_if] = "if";
    artLabelStrings[ARTL_ART_if] = "if";
    artKindOfs[ARTL_ART_if] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_if_50] = "if ::= . 'if'  '('  relExpr ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_50] = "";
    artlhsL[ARTL_ART_if_50] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_50] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_52] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_51] = "if ::= 'if'  '('  relExpr ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_51] = "";
    artlhsL[ARTL_ART_if_51] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_52] = "if ::= 'if'  . '('  relExpr ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_52] = "";
    artlhsL[ARTL_ART_if_52] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_52] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_if_52] = true;
    artFolds[ARTL_ART_if_54] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_53] = "if ::= 'if'  '('  relExpr ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_53] = "";
    artlhsL[ARTL_ART_if_53] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_54] = "if ::= 'if'  '('  . relExpr ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_54] = "";
    artlhsL[ARTL_ART_if_54] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_54] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_56] = "if ::= 'if'  '('  relExpr . ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_56] = "";
    artlhsL[ARTL_ART_if_56] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_56] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_if_56] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_58] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_57] = "if ::= 'if'  '('  relExpr ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_57] = "";
    artlhsL[ARTL_ART_if_57] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_58] = "if ::= 'if'  '('  relExpr ')'  . statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_58] = "";
    artlhsL[ARTL_ART_if_58] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_58] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_60] = "if ::= 'if'  '('  relExpr ')'  statement . 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_60] = "";
    artlhsL[ARTL_ART_if_60] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_60] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_60] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_62] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_61] = "if ::= 'if'  '('  relExpr ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_61] = "";
    artlhsL[ARTL_ART_if_61] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_62] = "if ::= 'if'  '('  relExpr ')'  statement 'else'  . statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_62] = "";
    artlhsL[ARTL_ART_if_62] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_62] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_64] = "if ::= 'if'  '('  relExpr ')'  statement 'else'  statement . 'fi'  ";
    artLabelStrings[ARTL_ART_if_64] = "";
    artlhsL[ARTL_ART_if_64] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_64] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_64] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_if_64] = true;
    artFolds[ARTL_ART_if_66] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_65] = "if ::= 'if'  '('  relExpr ')'  statement 'else'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_65] = "";
    artlhsL[ARTL_ART_if_65] = ARTL_ART_if;
    artPopD[ARTL_ART_if_65] = true;
    artLabelInternalStrings[ARTL_ART_if_66] = "if ::= 'if'  '('  relExpr ')'  statement 'else'  statement 'fi'  .";
    artLabelStrings[ARTL_ART_if_66] = "";
    artlhsL[ARTL_ART_if_66] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_66] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_if_66] = true;
    arteoR_pL[ARTL_ART_if_66] = true;
    artPopD[ARTL_ART_if_66] = true;
    artLabelInternalStrings[ARTL_ART_if_68] = "if ::= . 'if'  '('  relExpr ')'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_68] = "";
    artlhsL[ARTL_ART_if_68] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_68] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_70] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_69] = "if ::= 'if'  '('  relExpr ')'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_69] = "";
    artlhsL[ARTL_ART_if_69] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_70] = "if ::= 'if'  . '('  relExpr ')'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_70] = "";
    artlhsL[ARTL_ART_if_70] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_70] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_if_70] = true;
    artFolds[ARTL_ART_if_72] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_71] = "if ::= 'if'  '('  relExpr ')'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_71] = "";
    artlhsL[ARTL_ART_if_71] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_72] = "if ::= 'if'  '('  . relExpr ')'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_72] = "";
    artlhsL[ARTL_ART_if_72] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_72] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_74] = "if ::= 'if'  '('  relExpr . ')'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_74] = "";
    artlhsL[ARTL_ART_if_74] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_74] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_if_74] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_76] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_75] = "if ::= 'if'  '('  relExpr ')'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_75] = "";
    artlhsL[ARTL_ART_if_75] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_76] = "if ::= 'if'  '('  relExpr ')'  . statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_76] = "";
    artlhsL[ARTL_ART_if_76] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_76] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_78] = "if ::= 'if'  '('  relExpr ')'  statement . 'fi'  ";
    artLabelStrings[ARTL_ART_if_78] = "";
    artlhsL[ARTL_ART_if_78] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_78] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_78] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_if_78] = true;
    artFolds[ARTL_ART_if_80] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_79] = "if ::= 'if'  '('  relExpr ')'  statement 'fi'  ";
    artLabelStrings[ARTL_ART_if_79] = "";
    artlhsL[ARTL_ART_if_79] = ARTL_ART_if;
    artPopD[ARTL_ART_if_79] = true;
    artLabelInternalStrings[ARTL_ART_if_80] = "if ::= 'if'  '('  relExpr ')'  statement 'fi'  .";
    artLabelStrings[ARTL_ART_if_80] = "";
    artlhsL[ARTL_ART_if_80] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_80] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_if_80] = true;
    arteoR_pL[ARTL_ART_if_80] = true;
    artPopD[ARTL_ART_if_80] = true;
  }

  public void artTableInitialiser_ART_init() {
    artLabelInternalStrings[ARTL_ART_init] = "init";
    artLabelStrings[ARTL_ART_init] = "init";
    artKindOfs[ARTL_ART_init] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_init_120] = "init ::= . 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_120] = "";
    artlhsL[ARTL_ART_init_120] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_120] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_init_122] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_121] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_121] = "";
    artlhsL[ARTL_ART_init_121] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_122] = "init ::= 'init'  . '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_122] = "";
    artlhsL[ARTL_ART_init_122] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_122] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_init_122] = true;
    artFolds[ARTL_ART_init_124] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_123] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_123] = "";
    artlhsL[ARTL_ART_init_123] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_124] = "init ::= 'init'  '('  . INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_124] = "";
    artlhsL[ARTL_ART_init_124] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_124] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_init_126] = "init ::= 'init'  '('  INTEGER . ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_126] = "";
    artlhsL[ARTL_ART_init_126] = ARTL_ART_init;
    artSlotInstanceOfs[ARTL_ART_init_126] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_init_126] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_init_128] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_127] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_127] = "";
    artlhsL[ARTL_ART_init_127] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_128] = "init ::= 'init'  '('  INTEGER ','  . INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_128] = "";
    artlhsL[ARTL_ART_init_128] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_128] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_init_130] = "init ::= 'init'  '('  INTEGER ','  INTEGER . ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_130] = "";
    artlhsL[ARTL_ART_init_130] = ARTL_ART_init;
    artSlotInstanceOfs[ARTL_ART_init_130] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_init_130] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_init_130] = true;
    artFolds[ARTL_ART_init_132] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_131] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_131] = "";
    artlhsL[ARTL_ART_init_131] = ARTL_ART_init;
    artPopD[ARTL_ART_init_131] = true;
    artLabelInternalStrings[ARTL_ART_init_132] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  . ';'  ";
    artLabelStrings[ARTL_ART_init_132] = "";
    artlhsL[ARTL_ART_init_132] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_132] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_init_132] = true;
    artFolds[ARTL_ART_init_134] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_133] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_133] = "";
    artlhsL[ARTL_ART_init_133] = ARTL_ART_init;
    artPopD[ARTL_ART_init_133] = true;
    artLabelInternalStrings[ARTL_ART_init_134] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  .";
    artLabelStrings[ARTL_ART_init_134] = "";
    artlhsL[ARTL_ART_init_134] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_init_134] = true;
    arteoR_pL[ARTL_ART_init_134] = true;
    artPopD[ARTL_ART_init_134] = true;
  }

  public void artTableInitialiser_ART_lt() {
    artLabelInternalStrings[ARTL_ART_lt] = "lt";
    artLabelStrings[ARTL_ART_lt] = "lt";
    artKindOfs[ARTL_ART_lt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_lt_182] = "lt ::= . relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_182] = "";
    artlhsL[ARTL_ART_lt_182] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_182] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_184] = "lt ::= relExpr . '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_184] = "";
    artlhsL[ARTL_ART_lt_184] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_184] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_lt_184] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_lt_184] = true;
    artFolds[ARTL_ART_lt_186] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_lt_185] = "lt ::= relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_185] = "";
    artlhsL[ARTL_ART_lt_185] = ARTL_ART_lt;
    artLabelInternalStrings[ARTL_ART_lt_186] = "lt ::= relExpr '<'  . subExpr ";
    artLabelStrings[ARTL_ART_lt_186] = "";
    artlhsL[ARTL_ART_lt_186] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_186] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_188] = "lt ::= relExpr '<'  subExpr .";
    artLabelStrings[ARTL_ART_lt_188] = "";
    artlhsL[ARTL_ART_lt_188] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_188] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_lt_188] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_lt_188] = true;
    arteoR_pL[ARTL_ART_lt_188] = true;
    artPopD[ARTL_ART_lt_188] = true;
  }

  public void artTableInitialiser_ART_mul() {
    artLabelInternalStrings[ARTL_ART_mul] = "mul";
    artLabelStrings[ARTL_ART_mul] = "mul";
    artKindOfs[ARTL_ART_mul] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_mul_234] = "mul ::= . subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_234] = "";
    artlhsL[ARTL_ART_mul_234] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_234] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_236] = "mul ::= subExpr . '*'  operand ";
    artLabelStrings[ARTL_ART_mul_236] = "";
    artlhsL[ARTL_ART_mul_236] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_236] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_mul_236] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mul_236] = true;
    artFolds[ARTL_ART_mul_238] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_mul_237] = "mul ::= subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_237] = "";
    artlhsL[ARTL_ART_mul_237] = ARTL_ART_mul;
    artLabelInternalStrings[ARTL_ART_mul_238] = "mul ::= subExpr '*'  . operand ";
    artLabelStrings[ARTL_ART_mul_238] = "";
    artlhsL[ARTL_ART_mul_238] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_238] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_240] = "mul ::= subExpr '*'  operand .";
    artLabelStrings[ARTL_ART_mul_240] = "";
    artlhsL[ARTL_ART_mul_240] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_240] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_mul_240] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mul_240] = true;
    arteoR_pL[ARTL_ART_mul_240] = true;
    artPopD[ARTL_ART_mul_240] = true;
  }

  public void artTableInitialiser_ART_ne() {
    artLabelInternalStrings[ARTL_ART_ne] = "ne";
    artLabelStrings[ARTL_ART_ne] = "ne";
    artKindOfs[ARTL_ART_ne] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ne_174] = "ne ::= . relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_174] = "";
    artlhsL[ARTL_ART_ne_174] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_174] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_176] = "ne ::= relExpr . '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_176] = "";
    artlhsL[ARTL_ART_ne_176] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_176] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_ne_176] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ne_176] = true;
    artFolds[ARTL_ART_ne_178] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_ne_177] = "ne ::= relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_177] = "";
    artlhsL[ARTL_ART_ne_177] = ARTL_ART_ne;
    artLabelInternalStrings[ARTL_ART_ne_178] = "ne ::= relExpr '!='  . subExpr ";
    artLabelStrings[ARTL_ART_ne_178] = "";
    artlhsL[ARTL_ART_ne_178] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_178] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_180] = "ne ::= relExpr '!='  subExpr .";
    artLabelStrings[ARTL_ART_ne_180] = "";
    artlhsL[ARTL_ART_ne_180] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_180] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_ne_180] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ne_180] = true;
    arteoR_pL[ARTL_ART_ne_180] = true;
    artPopD[ARTL_ART_ne_180] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_250] = "operand ::= . deref ";
    artLabelStrings[ARTL_ART_operand_250] = "";
    artlhsL[ARTL_ART_operand_250] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_250] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_252] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_252] = "operand ::= deref .";
    artLabelStrings[ARTL_ART_operand_252] = "";
    artlhsL[ARTL_ART_operand_252] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_252] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_operand_252] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_252] = true;
    arteoR_pL[ARTL_ART_operand_252] = true;
    artPopD[ARTL_ART_operand_252] = true;
    artLabelInternalStrings[ARTL_ART_operand_254] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_254] = "";
    artlhsL[ARTL_ART_operand_254] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_254] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_256] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_256] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_256] = "";
    artlhsL[ARTL_ART_operand_256] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_256] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_256] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_256] = true;
    arteoR_pL[ARTL_ART_operand_256] = true;
    artPopD[ARTL_ART_operand_256] = true;
    artLabelInternalStrings[ARTL_ART_operand_258] = "operand ::= . REAL ";
    artLabelStrings[ARTL_ART_operand_258] = "";
    artlhsL[ARTL_ART_operand_258] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_258] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_260] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_260] = "operand ::= REAL .";
    artLabelStrings[ARTL_ART_operand_260] = "";
    artlhsL[ARTL_ART_operand_260] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_260] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_operand_260] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_260] = true;
    arteoR_pL[ARTL_ART_operand_260] = true;
    artPopD[ARTL_ART_operand_260] = true;
    artLabelInternalStrings[ARTL_ART_operand_262] = "operand ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_operand_262] = "";
    artlhsL[ARTL_ART_operand_262] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_262] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_264] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_264] = "operand ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_operand_264] = "";
    artlhsL[ARTL_ART_operand_264] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_264] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_operand_264] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_264] = true;
    arteoR_pL[ARTL_ART_operand_264] = true;
    artPopD[ARTL_ART_operand_264] = true;
    artLabelInternalStrings[ARTL_ART_operand_266] = "operand ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_266] = "";
    artlhsL[ARTL_ART_operand_266] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_266] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_268] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_267] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_267] = "";
    artlhsL[ARTL_ART_operand_267] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_268] = "operand ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_268] = "";
    artlhsL[ARTL_ART_operand_268] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_268] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_268] = true;
    artFolds[ARTL_ART_operand_270] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_270] = "operand ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_270] = "";
    artlhsL[ARTL_ART_operand_270] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_270] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_operand_270] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_270] = true;
    artFolds[ARTL_ART_operand_272] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_271] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_271] = "";
    artlhsL[ARTL_ART_operand_271] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_271] = true;
    artLabelInternalStrings[ARTL_ART_operand_272] = "operand ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_272] = "";
    artlhsL[ARTL_ART_operand_272] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_272] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_272] = true;
    arteoR_pL[ARTL_ART_operand_272] = true;
    artPopD[ARTL_ART_operand_272] = true;
  }

  public void artTableInitialiser_ART_paint() {
    artLabelInternalStrings[ARTL_ART_paint] = "paint";
    artLabelStrings[ARTL_ART_paint] = "paint";
    artKindOfs[ARTL_ART_paint] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_paint_136] = "paint ::= . 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_136] = "";
    artlhsL[ARTL_ART_paint_136] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_136] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_136] = true;
    artFolds[ARTL_ART_paint_138] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_137] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_137] = "";
    artlhsL[ARTL_ART_paint_137] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_137] = true;
    artLabelInternalStrings[ARTL_ART_paint_138] = "paint ::= 'paint'  . '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_138] = "";
    artlhsL[ARTL_ART_paint_138] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_138] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_paint_138] = true;
    artPopD[ARTL_ART_paint_138] = true;
    artFolds[ARTL_ART_paint_140] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_139] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_139] = "";
    artlhsL[ARTL_ART_paint_139] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_139] = true;
    artLabelInternalStrings[ARTL_ART_paint_140] = "paint ::= 'paint'  '('  . ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_140] = "";
    artlhsL[ARTL_ART_paint_140] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_140] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_140] = true;
    artFolds[ARTL_ART_paint_142] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_141] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_141] = "";
    artlhsL[ARTL_ART_paint_141] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_141] = true;
    artLabelInternalStrings[ARTL_ART_paint_142] = "paint ::= 'paint'  '('  ')'  . ';'  ";
    artLabelStrings[ARTL_ART_paint_142] = "";
    artlhsL[ARTL_ART_paint_142] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_142] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_142] = true;
    artFolds[ARTL_ART_paint_144] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_143] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_143] = "";
    artlhsL[ARTL_ART_paint_143] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_143] = true;
    artLabelInternalStrings[ARTL_ART_paint_144] = "paint ::= 'paint'  '('  ')'  ';'  .";
    artLabelStrings[ARTL_ART_paint_144] = "";
    artlhsL[ARTL_ART_paint_144] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_144] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_paint_144] = true;
    arteoR_pL[ARTL_ART_paint_144] = true;
    artPopD[ARTL_ART_paint_144] = true;
  }

  public void artTableInitialiser_ART_print() {
    artLabelInternalStrings[ARTL_ART_print] = "print";
    artLabelStrings[ARTL_ART_print] = "print";
    artKindOfs[ARTL_ART_print] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_print_108] = "print ::= . 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_108] = "";
    artlhsL[ARTL_ART_print_108] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_108] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_print_110] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_109] = "print ::= 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_109] = "";
    artlhsL[ARTL_ART_print_109] = ARTL_ART_print;
    artLabelInternalStrings[ARTL_ART_print_110] = "print ::= 'print'  . '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_110] = "";
    artlhsL[ARTL_ART_print_110] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_110] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_print_110] = true;
    artFolds[ARTL_ART_print_112] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_111] = "print ::= 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_111] = "";
    artlhsL[ARTL_ART_print_111] = ARTL_ART_print;
    artLabelInternalStrings[ARTL_ART_print_112] = "print ::= 'print'  '('  . subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_112] = "";
    artlhsL[ARTL_ART_print_112] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_112] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_print_114] = "print ::= 'print'  '('  subExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_114] = "";
    artlhsL[ARTL_ART_print_114] = ARTL_ART_print;
    artSlotInstanceOfs[ARTL_ART_print_114] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_print_114] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_print_114] = true;
    artFolds[ARTL_ART_print_116] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_115] = "print ::= 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_115] = "";
    artlhsL[ARTL_ART_print_115] = ARTL_ART_print;
    artPopD[ARTL_ART_print_115] = true;
    artLabelInternalStrings[ARTL_ART_print_116] = "print ::= 'print'  '('  subExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_print_116] = "";
    artlhsL[ARTL_ART_print_116] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_116] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_print_116] = true;
    artFolds[ARTL_ART_print_118] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_117] = "print ::= 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_117] = "";
    artlhsL[ARTL_ART_print_117] = ARTL_ART_print;
    artPopD[ARTL_ART_print_117] = true;
    artLabelInternalStrings[ARTL_ART_print_118] = "print ::= 'print'  '('  subExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_print_118] = "";
    artlhsL[ARTL_ART_print_118] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_118] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_print_118] = true;
    arteoR_pL[ARTL_ART_print_118] = true;
    artPopD[ARTL_ART_print_118] = true;
  }

  public void artTableInitialiser_ART_relExpr() {
    artLabelInternalStrings[ARTL_ART_relExpr] = "relExpr";
    artLabelStrings[ARTL_ART_relExpr] = "relExpr";
    artKindOfs[ARTL_ART_relExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_relExpr_146] = "relExpr ::= . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_146] = "";
    artlhsL[ARTL_ART_relExpr_146] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_146] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_148] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_148] = "relExpr ::= subExpr .";
    artLabelStrings[ARTL_ART_relExpr_148] = "";
    artlhsL[ARTL_ART_relExpr_148] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_148] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_148] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_148] = true;
    arteoR_pL[ARTL_ART_relExpr_148] = true;
    artPopD[ARTL_ART_relExpr_148] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_150] = "relExpr ::= . gt ";
    artLabelStrings[ARTL_ART_relExpr_150] = "";
    artlhsL[ARTL_ART_relExpr_150] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_150] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_152] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_152] = "relExpr ::= gt .";
    artLabelStrings[ARTL_ART_relExpr_152] = "";
    artlhsL[ARTL_ART_relExpr_152] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_152] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_relExpr_152] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_152] = true;
    arteoR_pL[ARTL_ART_relExpr_152] = true;
    artPopD[ARTL_ART_relExpr_152] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_154] = "relExpr ::= . ne ";
    artLabelStrings[ARTL_ART_relExpr_154] = "";
    artlhsL[ARTL_ART_relExpr_154] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_154] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_156] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_156] = "relExpr ::= ne .";
    artLabelStrings[ARTL_ART_relExpr_156] = "";
    artlhsL[ARTL_ART_relExpr_156] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_156] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_relExpr_156] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_156] = true;
    arteoR_pL[ARTL_ART_relExpr_156] = true;
    artPopD[ARTL_ART_relExpr_156] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_158] = "relExpr ::= . lt ";
    artLabelStrings[ARTL_ART_relExpr_158] = "";
    artlhsL[ARTL_ART_relExpr_158] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_158] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_160] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_160] = "relExpr ::= lt .";
    artLabelStrings[ARTL_ART_relExpr_160] = "";
    artlhsL[ARTL_ART_relExpr_160] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_160] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_relExpr_160] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_160] = true;
    arteoR_pL[ARTL_ART_relExpr_160] = true;
    artPopD[ARTL_ART_relExpr_160] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_162] = "relExpr ::= . eq ";
    artLabelStrings[ARTL_ART_relExpr_162] = "";
    artlhsL[ARTL_ART_relExpr_162] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_162] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_164] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_164] = "relExpr ::= eq .";
    artLabelStrings[ARTL_ART_relExpr_164] = "";
    artlhsL[ARTL_ART_relExpr_164] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_164] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_relExpr_164] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_164] = true;
    arteoR_pL[ARTL_ART_relExpr_164] = true;
    artPopD[ARTL_ART_relExpr_164] = true;
  }

  public void artTableInitialiser_ART_seq() {
    artLabelInternalStrings[ARTL_ART_seq] = "seq";
    artLabelStrings[ARTL_ART_seq] = "seq";
    artKindOfs[ARTL_ART_seq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_seq_34] = "seq ::= . statement statement ";
    artLabelStrings[ARTL_ART_seq_34] = "";
    artlhsL[ARTL_ART_seq_34] = ARTL_ART_seq;
    artKindOfs[ARTL_ART_seq_34] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_seq_36] = "seq ::= statement . statement ";
    artLabelStrings[ARTL_ART_seq_36] = "";
    artlhsL[ARTL_ART_seq_36] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_36] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_36] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_seq_36] = true;
    artLabelInternalStrings[ARTL_ART_seq_38] = "seq ::= statement statement .";
    artLabelStrings[ARTL_ART_seq_38] = "";
    artlhsL[ARTL_ART_seq_38] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_38] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_38] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_seq_38] = true;
    arteoR_pL[ARTL_ART_seq_38] = true;
    artPopD[ARTL_ART_seq_38] = true;
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
    artLabelInternalStrings[ARTL_ART_statement_22] = "statement ::= . print ";
    artLabelStrings[ARTL_ART_statement_22] = "";
    artlhsL[ARTL_ART_statement_22] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_22] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_24] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_24] = "statement ::= print .";
    artLabelStrings[ARTL_ART_statement_24] = "";
    artlhsL[ARTL_ART_statement_24] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_24] = ARTL_ART_print;
    artKindOfs[ARTL_ART_statement_24] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_24] = true;
    arteoR_pL[ARTL_ART_statement_24] = true;
    artPopD[ARTL_ART_statement_24] = true;
    artLabelInternalStrings[ARTL_ART_statement_26] = "statement ::= . init ";
    artLabelStrings[ARTL_ART_statement_26] = "";
    artlhsL[ARTL_ART_statement_26] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_26] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_28] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_28] = "statement ::= init .";
    artLabelStrings[ARTL_ART_statement_28] = "";
    artlhsL[ARTL_ART_statement_28] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_28] = ARTL_ART_init;
    artKindOfs[ARTL_ART_statement_28] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_28] = true;
    arteoR_pL[ARTL_ART_statement_28] = true;
    artPopD[ARTL_ART_statement_28] = true;
    artLabelInternalStrings[ARTL_ART_statement_30] = "statement ::= . paint ";
    artLabelStrings[ARTL_ART_statement_30] = "";
    artlhsL[ARTL_ART_statement_30] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_30] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_32] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_32] = "statement ::= paint .";
    artLabelStrings[ARTL_ART_statement_32] = "";
    artlhsL[ARTL_ART_statement_32] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_32] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_statement_32] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_32] = true;
    arteoR_pL[ARTL_ART_statement_32] = true;
    artPopD[ARTL_ART_statement_32] = true;
  }

  public void artTableInitialiser_ART_sub() {
    artLabelInternalStrings[ARTL_ART_sub] = "sub";
    artLabelStrings[ARTL_ART_sub] = "sub";
    artKindOfs[ARTL_ART_sub] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_sub_218] = "sub ::= . subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_218] = "";
    artlhsL[ARTL_ART_sub_218] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_218] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_220] = "sub ::= subExpr . '-'  operand ";
    artLabelStrings[ARTL_ART_sub_220] = "";
    artlhsL[ARTL_ART_sub_220] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_220] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_sub_220] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sub_220] = true;
    artFolds[ARTL_ART_sub_222] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sub_221] = "sub ::= subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_221] = "";
    artlhsL[ARTL_ART_sub_221] = ARTL_ART_sub;
    artLabelInternalStrings[ARTL_ART_sub_222] = "sub ::= subExpr '-'  . operand ";
    artLabelStrings[ARTL_ART_sub_222] = "";
    artlhsL[ARTL_ART_sub_222] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_222] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_224] = "sub ::= subExpr '-'  operand .";
    artLabelStrings[ARTL_ART_sub_224] = "";
    artlhsL[ARTL_ART_sub_224] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_224] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_sub_224] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sub_224] = true;
    arteoR_pL[ARTL_ART_sub_224] = true;
    artPopD[ARTL_ART_sub_224] = true;
  }

  public void artTableInitialiser_ART_subExpr() {
    artLabelInternalStrings[ARTL_ART_subExpr] = "subExpr";
    artLabelStrings[ARTL_ART_subExpr] = "subExpr";
    artKindOfs[ARTL_ART_subExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExpr_198] = "subExpr ::= . operand ";
    artLabelStrings[ARTL_ART_subExpr_198] = "";
    artlhsL[ARTL_ART_subExpr_198] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_198] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_200] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_200] = "subExpr ::= operand .";
    artLabelStrings[ARTL_ART_subExpr_200] = "";
    artlhsL[ARTL_ART_subExpr_200] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_200] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_200] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_200] = true;
    arteoR_pL[ARTL_ART_subExpr_200] = true;
    artPopD[ARTL_ART_subExpr_200] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_202] = "subExpr ::= . sub ";
    artLabelStrings[ARTL_ART_subExpr_202] = "";
    artlhsL[ARTL_ART_subExpr_202] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_202] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_204] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_204] = "subExpr ::= sub .";
    artLabelStrings[ARTL_ART_subExpr_204] = "";
    artlhsL[ARTL_ART_subExpr_204] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_204] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_subExpr_204] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_204] = true;
    arteoR_pL[ARTL_ART_subExpr_204] = true;
    artPopD[ARTL_ART_subExpr_204] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_206] = "subExpr ::= . add ";
    artLabelStrings[ARTL_ART_subExpr_206] = "";
    artlhsL[ARTL_ART_subExpr_206] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_206] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_208] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_208] = "subExpr ::= add .";
    artLabelStrings[ARTL_ART_subExpr_208] = "";
    artlhsL[ARTL_ART_subExpr_208] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_208] = ARTL_ART_add;
    artKindOfs[ARTL_ART_subExpr_208] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_208] = true;
    arteoR_pL[ARTL_ART_subExpr_208] = true;
    artPopD[ARTL_ART_subExpr_208] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_210] = "subExpr ::= . mul ";
    artLabelStrings[ARTL_ART_subExpr_210] = "";
    artlhsL[ARTL_ART_subExpr_210] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_210] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_212] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_212] = "subExpr ::= mul .";
    artLabelStrings[ARTL_ART_subExpr_212] = "";
    artlhsL[ARTL_ART_subExpr_212] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_212] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_subExpr_212] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_212] = true;
    arteoR_pL[ARTL_ART_subExpr_212] = true;
    artPopD[ARTL_ART_subExpr_212] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_214] = "subExpr ::= . div ";
    artLabelStrings[ARTL_ART_subExpr_214] = "";
    artlhsL[ARTL_ART_subExpr_214] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_214] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_216] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_216] = "subExpr ::= div .";
    artLabelStrings[ARTL_ART_subExpr_216] = "";
    artlhsL[ARTL_ART_subExpr_216] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_216] = ARTL_ART_div;
    artKindOfs[ARTL_ART_subExpr_216] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_216] = true;
    arteoR_pL[ARTL_ART_subExpr_216] = true;
    artPopD[ARTL_ART_subExpr_216] = true;
  }

  public void artTableInitialiser_ART_while() {
    artLabelInternalStrings[ARTL_ART_while] = "while";
    artLabelStrings[ARTL_ART_while] = "while";
    artKindOfs[ARTL_ART_while] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_while_82] = "while ::= . 'while'  relExpr statement ";
    artLabelStrings[ARTL_ART_while_82] = "";
    artlhsL[ARTL_ART_while_82] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_82] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_84] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_83] = "while ::= 'while'  relExpr statement ";
    artLabelStrings[ARTL_ART_while_83] = "";
    artlhsL[ARTL_ART_while_83] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_84] = "while ::= 'while'  . relExpr statement ";
    artLabelStrings[ARTL_ART_while_84] = "";
    artlhsL[ARTL_ART_while_84] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_84] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_while_84] = true;
    artLabelInternalStrings[ARTL_ART_while_86] = "while ::= 'while'  relExpr . statement ";
    artLabelStrings[ARTL_ART_while_86] = "";
    artlhsL[ARTL_ART_while_86] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_86] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_while_86] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_while_88] = "while ::= 'while'  relExpr statement .";
    artLabelStrings[ARTL_ART_while_88] = "";
    artlhsL[ARTL_ART_while_88] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_88] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_while_88] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_while_88] = true;
    arteoR_pL[ARTL_ART_while_88] = true;
    artPopD[ARTL_ART_while_88] = true;
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
    artLabelStrings[ARTTS_backend] = "backend";
    artLabelInternalStrings[ARTTS_backend] = "'backend'";
    artKindOfs[ARTTS_backend] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_backend] = true;
    artLabelStrings[ARTTS_else] = "else";
    artLabelInternalStrings[ARTTS_else] = "'else'";
    artKindOfs[ARTTS_else] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_else] = true;
    artLabelStrings[ARTTS_fi] = "fi";
    artLabelInternalStrings[ARTTS_fi] = "'fi'";
    artKindOfs[ARTTS_fi] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_fi] = true;
    artLabelStrings[ARTTS_if] = "if";
    artLabelInternalStrings[ARTTS_if] = "'if'";
    artKindOfs[ARTTS_if] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_if] = true;
    artLabelStrings[ARTTS_init] = "init";
    artLabelInternalStrings[ARTTS_init] = "'init'";
    artKindOfs[ARTTS_init] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_init] = true;
    artLabelStrings[ARTTS_paint] = "paint";
    artLabelInternalStrings[ARTTS_paint] = "'paint'";
    artKindOfs[ARTTS_paint] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_paint] = true;
    artLabelStrings[ARTTS_print] = "print";
    artLabelInternalStrings[ARTTS_print] = "'print'";
    artKindOfs[ARTTS_print] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_print] = true;
    artLabelStrings[ARTTS_while] = "while";
    artLabelInternalStrings[ARTTS_while] = "'while'";
    artKindOfs[ARTTS_while] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_while] = true;
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_REAL();
    artTableInitialiser_ART_STRING_DQ();
    artTableInitialiser_ART_add();
    artTableInitialiser_ART_assign();
    artTableInitialiser_ART_backend();
    artTableInitialiser_ART_deref();
    artTableInitialiser_ART_div();
    artTableInitialiser_ART_eq();
    artTableInitialiser_ART_gt();
    artTableInitialiser_ART_if();
    artTableInitialiser_ART_init();
    artTableInitialiser_ART_lt();
    artTableInitialiser_ART_mul();
    artTableInitialiser_ART_ne();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_paint();
    artTableInitialiser_ART_print();
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
    artSetExtent = 53;
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
    public double v;
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
    public String v;
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
      case ARTL_ART_ID_280: 
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
    case ARTL_ART_INTEGER_286: 
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
    case ARTL_ART_REAL_292: 
            ARTRD_REAL(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL);
            if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      REAL.lexeme = artLexeme(REAL.leftExtent, REAL.rightExtent);
REAL.v = artLexemeAsInteger(REAL.leftExtent, REAL.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_REAL: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_STRING_DQ_298: 
            ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ);
            if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      STRING_DQ.lexeme = artLexeme(STRING_DQ.leftExtent, STRING_DQ.rightExtent);
STRING_DQ.v = artLexemeAsString(STRING_DQ.leftExtent, STRING_DQ.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_STRING_DQ: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_add_230: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*add ::= subExpr '+'  operand .*/
    case ARTL_ART_add_232: 
            ARTRD_add(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
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
    case ARTL_ART_assign_44: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                        break;
    /*assign ::= ID '='  subExpr . ';'  */
    case ARTL_ART_assign_46: 
      ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*assign ::= ID '='  subExpr ';'  .*/
    case ARTL_ART_assign_48: 
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
    case ARTL_ART_backend_94: 
                              break;
    /*backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_96: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_98: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  */
    case ARTL_ART_backend_100: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  */
    case ARTL_ART_backend_102: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  */
    case ARTL_ART_backend_104: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .*/
    case ARTL_ART_backend_106: 
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
    case ARTL_ART_deref_276: 
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
    case ARTL_ART_div_246: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*div ::= subExpr '/'  operand .*/
    case ARTL_ART_div_248: 
            ARTRD_div(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
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
    case ARTL_ART_eq_194: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*eq ::= relExpr '=='  subExpr .*/
    case ARTL_ART_eq_196: 
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
    case ARTL_ART_gt_170: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*gt ::= relExpr '>'  subExpr .*/
    case ARTL_ART_gt_172: 
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
    /*if ::= 'if'  '('  . relExpr ')'  statement 'else'  statement 'fi'  */
    case ARTL_ART_if_54: 
                              break;
    /*if ::= 'if'  '('  relExpr . ')'  statement 'else'  statement 'fi'  */
    case ARTL_ART_if_56: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  . statement 'else'  statement 'fi'  */
    case ARTL_ART_if_58: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  statement . 'else'  statement 'fi'  */
    case ARTL_ART_if_60: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  statement 'else'  . statement 'fi'  */
    case ARTL_ART_if_62: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  statement 'else'  statement . 'fi'  */
    case ARTL_ART_if_64: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  statement 'else'  statement 'fi'  .*/
    case ARTL_ART_if_66: 
            ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  . relExpr ')'  statement 'fi'  */
    case ARTL_ART_if_72: 
                              break;
    /*if ::= 'if'  '('  relExpr . ')'  statement 'fi'  */
    case ARTL_ART_if_74: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  . statement 'fi'  */
    case ARTL_ART_if_76: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  statement . 'fi'  */
    case ARTL_ART_if_78: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  statement 'fi'  .*/
    case ARTL_ART_if_80: 
            ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_if: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_init(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_INTEGER INTEGER2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*init ::= 'init'  '('  . INTEGER ','  INTEGER ')'  ';'  */
    case ARTL_ART_init_124: 
                              break;
    /*init ::= 'init'  '('  INTEGER . ','  INTEGER ')'  ';'  */
    case ARTL_ART_init_126: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*init ::= 'init'  '('  INTEGER ','  . INTEGER ')'  ';'  */
    case ARTL_ART_init_128: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER . ')'  ';'  */
    case ARTL_ART_init_130: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
      INTEGER2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER2));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER2);
            break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER ')'  . ';'  */
    case ARTL_ART_init_132: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  .*/
    case ARTL_ART_init_134: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      INTEGER2 = new ARTAT_ART_INTEGER();
            ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
        default:
          throw new ARTException("ARTRD_init: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_lt_186: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*lt ::= relExpr '<'  subExpr .*/
    case ARTL_ART_lt_188: 
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
    case ARTL_ART_mul_238: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*mul ::= subExpr '*'  operand .*/
    case ARTL_ART_mul_240: 
            ARTRD_mul(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
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
    case ARTL_ART_ne_178: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ne ::= relExpr '!='  subExpr .*/
    case ARTL_ART_ne_180: 
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

public void ARTRD_operand(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_REAL REAL1, ARTAT_ART_STRING_DQ STRING_DQ1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*operand ::= deref .*/
    case ARTL_ART_operand_252: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_256: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*operand ::= REAL .*/
    case ARTL_ART_operand_260: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*operand ::= STRING_DQ .*/
    case ARTL_ART_operand_264: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
            break;
    /*operand ::= '('  subExpr . ')'  */
    case ARTL_ART_operand_270: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*operand ::= '('  subExpr ')'  .*/
    case ARTL_ART_operand_272: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
                  break;
        default:
          throw new ARTException("ARTRD_operand: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_paint(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*paint ::= 'paint'  '('  . ')'  ';'  */
    case ARTL_ART_paint_140: 
                              break;
    /*paint ::= 'paint'  '('  ')'  . ';'  */
    case ARTL_ART_paint_142: 
      ARTRD_paint(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*paint ::= 'paint'  '('  ')'  ';'  .*/
    case ARTL_ART_paint_144: 
            ARTRD_paint(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_paint: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_print(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*print ::= 'print'  '('  . subExpr ')'  ';'  */
    case ARTL_ART_print_112: 
                              break;
    /*print ::= 'print'  '('  subExpr . ')'  ';'  */
    case ARTL_ART_print_114: 
      ARTRD_print(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*print ::= 'print'  '('  subExpr ')'  . ';'  */
    case ARTL_ART_print_116: 
      ARTRD_print(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*print ::= 'print'  '('  subExpr ')'  ';'  .*/
    case ARTL_ART_print_118: 
            ARTRD_print(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_print: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_relExpr_148: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= gt .*/
    case ARTL_ART_relExpr_152: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_gt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= ne .*/
    case ARTL_ART_relExpr_156: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ne(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= lt .*/
    case ARTL_ART_relExpr_160: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_lt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= eq .*/
    case ARTL_ART_relExpr_164: 
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
    case ARTL_ART_seq_38: 
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
    /*statement ::= print .*/
    case ARTL_ART_statement_24: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_print(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= init .*/
    case ARTL_ART_statement_28: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_init(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*statement ::= paint .*/
    case ARTL_ART_statement_32: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_paint(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
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
    case ARTL_ART_sub_222: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*sub ::= subExpr '-'  operand .*/
    case ARTL_ART_sub_224: 
            ARTRD_sub(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
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
    case ARTL_ART_subExpr_200: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*subExpr ::= sub .*/
    case ARTL_ART_subExpr_204: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sub(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= add .*/
    case ARTL_ART_subExpr_208: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_add(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= mul .*/
    case ARTL_ART_subExpr_212: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_mul(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= div .*/
    case ARTL_ART_subExpr_216: 
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
    case ARTL_ART_while_86: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*while ::= 'while'  relExpr statement .*/
    case ARTL_ART_while_88: 
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
    case ARTL_ART_STRING_DQ:  ARTRD_STRING_DQ(artElement.element, artParent, artWriteable, (ARTAT_ART_STRING_DQ) artAttributes); break;
    case ARTL_ART_add: ARTRD_add(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_assign: ARTRD_assign(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_backend: ARTRD_backend(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_deref: ARTRD_deref(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_div: ARTRD_div(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_eq: ARTRD_eq(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_gt: ARTRD_gt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_if: ARTRD_if(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_init: ARTRD_init(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_lt: ARTRD_lt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_mul: ARTRD_mul(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ne: ARTRD_ne(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_operand: ARTRD_operand(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_paint: ARTRD_paint(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_print: ARTRD_print(artElement.element, artParent, artWriteable); break;
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
