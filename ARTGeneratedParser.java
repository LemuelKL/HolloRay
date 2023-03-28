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
  private static boolean[] ARTSet49;
  private static boolean[] ARTSet50;
  private static boolean[] ARTSet51;
  private static boolean[] ARTSet52;
  private static boolean[] ARTSet53;
  private static boolean[] ARTSet54;
  private static boolean[] ARTSet55;
  private static boolean[] ARTSet56;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_REAL = 3;
  public static final int ARTTB_SIMPLE_WHITESPACE = 4;
  public static final int ARTTB_STRING_DQ = 5;
  public static final int ARTTS__SHREIK = 6;
  public static final int ARTTS__SHREIK_EQUAL = 7;
  public static final int ARTTS__AMPERSAND_AMPERSAND = 8;
  public static final int ARTTS__LPAR = 9;
  public static final int ARTTS__RPAR = 10;
  public static final int ARTTS__STAR = 11;
  public static final int ARTTS__STAR_STAR = 12;
  public static final int ARTTS__PLUS = 13;
  public static final int ARTTS__COMMA = 14;
  public static final int ARTTS__MINUS = 15;
  public static final int ARTTS__SLASH = 16;
  public static final int ARTTS__SEMICOLON = 17;
  public static final int ARTTS__LT = 18;
  public static final int ARTTS__EQUAL = 19;
  public static final int ARTTS__EQUAL_EQUAL = 20;
  public static final int ARTTS__GT = 21;
  public static final int ARTTS__UPARROW = 22;
  public static final int ARTTS_backend = 23;
  public static final int ARTTS_else = 24;
  public static final int ARTTS_if = 25;
  public static final int ARTTS_init = 26;
  public static final int ARTTS_paint = 27;
  public static final int ARTTS_print = 28;
  public static final int ARTTS_while = 29;
  public static final int ARTTS__LBRACE = 30;
  public static final int ARTTS__BAR_BAR = 31;
  public static final int ARTTS__RBRACE = 32;
  public static final int ARTX_EPSILON = 33;
  public static final int ARTL_ART_ID = 34;
  public static final int ARTL_ART_INTEGER = 35;
  public static final int ARTL_ART_REAL = 36;
  public static final int ARTL_ART_STRING_DQ = 37;
  public static final int ARTL_ART_add = 38;
  public static final int ARTL_ART_and = 39;
  public static final int ARTL_ART_assign = 40;
  public static final int ARTL_ART_backend = 41;
  public static final int ARTL_ART_deref = 42;
  public static final int ARTL_ART_div = 43;
  public static final int ARTL_ART_eq = 44;
  public static final int ARTL_ART_exp = 45;
  public static final int ARTL_ART_gt = 46;
  public static final int ARTL_ART_if = 47;
  public static final int ARTL_ART_init = 48;
  public static final int ARTL_ART_lt = 49;
  public static final int ARTL_ART_mul = 50;
  public static final int ARTL_ART_ne = 51;
  public static final int ARTL_ART_neg = 52;
  public static final int ARTL_ART_not = 53;
  public static final int ARTL_ART_operand = 54;
  public static final int ARTL_ART_or = 55;
  public static final int ARTL_ART_paint = 56;
  public static final int ARTL_ART_print = 57;
  public static final int ARTL_ART_relExpr = 58;
  public static final int ARTL_ART_seq = 59;
  public static final int ARTL_ART_statement = 60;
  public static final int ARTL_ART_sub = 61;
  public static final int ARTL_ART_subExpr = 62;
  public static final int ARTL_ART_while = 63;
  public static final int ARTL_ART_xor = 64;
  public static final int ARTL_ART_ID_361 = 65;
  public static final int ARTL_ART_ID_362 = 66;
  public static final int ARTL_ART_ID_363 = 67;
  public static final int ARTL_ART_ID_364 = 68;
  public static final int ARTL_ART_INTEGER_367 = 69;
  public static final int ARTL_ART_INTEGER_368 = 70;
  public static final int ARTL_ART_INTEGER_369 = 71;
  public static final int ARTL_ART_INTEGER_370 = 72;
  public static final int ARTL_ART_REAL_373 = 73;
  public static final int ARTL_ART_REAL_374 = 74;
  public static final int ARTL_ART_REAL_375 = 75;
  public static final int ARTL_ART_REAL_376 = 76;
  public static final int ARTL_ART_STRING_DQ_379 = 77;
  public static final int ARTL_ART_STRING_DQ_380 = 78;
  public static final int ARTL_ART_STRING_DQ_381 = 79;
  public static final int ARTL_ART_STRING_DQ_382 = 80;
  public static final int ARTL_ART_add_295 = 81;
  public static final int ARTL_ART_add_296 = 82;
  public static final int ARTL_ART_add_297 = 83;
  public static final int ARTL_ART_add_298 = 84;
  public static final int ARTL_ART_add_299 = 85;
  public static final int ARTL_ART_add_300 = 86;
  public static final int ARTL_ART_add_301 = 87;
  public static final int ARTL_ART_add_302 = 88;
  public static final int ARTL_ART_and_229 = 89;
  public static final int ARTL_ART_and_230 = 90;
  public static final int ARTL_ART_and_231 = 91;
  public static final int ARTL_ART_and_232 = 92;
  public static final int ARTL_ART_and_233 = 93;
  public static final int ARTL_ART_and_234 = 94;
  public static final int ARTL_ART_and_235 = 95;
  public static final int ARTL_ART_and_236 = 96;
  public static final int ARTL_ART_assign_39 = 97;
  public static final int ARTL_ART_assign_40 = 98;
  public static final int ARTL_ART_assign_41 = 99;
  public static final int ARTL_ART_assign_42 = 100;
  public static final int ARTL_ART_assign_43 = 101;
  public static final int ARTL_ART_assign_44 = 102;
  public static final int ARTL_ART_assign_45 = 103;
  public static final int ARTL_ART_assign_46 = 104;
  public static final int ARTL_ART_assign_47 = 105;
  public static final int ARTL_ART_assign_48 = 106;
  public static final int ARTL_ART_backend_105 = 107;
  public static final int ARTL_ART_backend_106 = 108;
  public static final int ARTL_ART_backend_107 = 109;
  public static final int ARTL_ART_backend_108 = 110;
  public static final int ARTL_ART_backend_109 = 111;
  public static final int ARTL_ART_backend_110 = 112;
  public static final int ARTL_ART_backend_111 = 113;
  public static final int ARTL_ART_backend_112 = 114;
  public static final int ARTL_ART_backend_113 = 115;
  public static final int ARTL_ART_backend_114 = 116;
  public static final int ARTL_ART_backend_115 = 117;
  public static final int ARTL_ART_backend_116 = 118;
  public static final int ARTL_ART_backend_117 = 119;
  public static final int ARTL_ART_backend_118 = 120;
  public static final int ARTL_ART_backend_119 = 121;
  public static final int ARTL_ART_backend_120 = 122;
  public static final int ARTL_ART_backend_121 = 123;
  public static final int ARTL_ART_backend_122 = 124;
  public static final int ARTL_ART_deref_357 = 125;
  public static final int ARTL_ART_deref_358 = 126;
  public static final int ARTL_ART_deref_359 = 127;
  public static final int ARTL_ART_deref_360 = 128;
  public static final int ARTL_ART_div_311 = 129;
  public static final int ARTL_ART_div_312 = 130;
  public static final int ARTL_ART_div_313 = 131;
  public static final int ARTL_ART_div_314 = 132;
  public static final int ARTL_ART_div_315 = 133;
  public static final int ARTL_ART_div_316 = 134;
  public static final int ARTL_ART_div_317 = 135;
  public static final int ARTL_ART_div_318 = 136;
  public static final int ARTL_ART_eq_221 = 137;
  public static final int ARTL_ART_eq_222 = 138;
  public static final int ARTL_ART_eq_223 = 139;
  public static final int ARTL_ART_eq_224 = 140;
  public static final int ARTL_ART_eq_225 = 141;
  public static final int ARTL_ART_eq_226 = 142;
  public static final int ARTL_ART_eq_227 = 143;
  public static final int ARTL_ART_eq_228 = 144;
  public static final int ARTL_ART_exp_325 = 145;
  public static final int ARTL_ART_exp_326 = 146;
  public static final int ARTL_ART_exp_327 = 147;
  public static final int ARTL_ART_exp_328 = 148;
  public static final int ARTL_ART_exp_329 = 149;
  public static final int ARTL_ART_exp_330 = 150;
  public static final int ARTL_ART_exp_331 = 151;
  public static final int ARTL_ART_exp_332 = 152;
  public static final int ARTL_ART_gt_197 = 153;
  public static final int ARTL_ART_gt_198 = 154;
  public static final int ARTL_ART_gt_199 = 155;
  public static final int ARTL_ART_gt_200 = 156;
  public static final int ARTL_ART_gt_201 = 157;
  public static final int ARTL_ART_gt_202 = 158;
  public static final int ARTL_ART_gt_203 = 159;
  public static final int ARTL_ART_gt_204 = 160;
  public static final int ARTL_ART_if_49 = 161;
  public static final int ARTL_ART_if_50 = 162;
  public static final int ARTL_ART_if_51 = 163;
  public static final int ARTL_ART_if_52 = 164;
  public static final int ARTL_ART_if_53 = 165;
  public static final int ARTL_ART_if_54 = 166;
  public static final int ARTL_ART_if_55 = 167;
  public static final int ARTL_ART_if_56 = 168;
  public static final int ARTL_ART_if_57 = 169;
  public static final int ARTL_ART_if_58 = 170;
  public static final int ARTL_ART_if_59 = 171;
  public static final int ARTL_ART_if_60 = 172;
  public static final int ARTL_ART_if_61 = 173;
  public static final int ARTL_ART_if_62 = 174;
  public static final int ARTL_ART_if_63 = 175;
  public static final int ARTL_ART_if_64 = 176;
  public static final int ARTL_ART_if_65 = 177;
  public static final int ARTL_ART_if_66 = 178;
  public static final int ARTL_ART_if_67 = 179;
  public static final int ARTL_ART_if_68 = 180;
  public static final int ARTL_ART_if_69 = 181;
  public static final int ARTL_ART_if_70 = 182;
  public static final int ARTL_ART_if_71 = 183;
  public static final int ARTL_ART_if_72 = 184;
  public static final int ARTL_ART_if_73 = 185;
  public static final int ARTL_ART_if_74 = 186;
  public static final int ARTL_ART_if_75 = 187;
  public static final int ARTL_ART_if_76 = 188;
  public static final int ARTL_ART_if_77 = 189;
  public static final int ARTL_ART_if_78 = 190;
  public static final int ARTL_ART_if_79 = 191;
  public static final int ARTL_ART_if_80 = 192;
  public static final int ARTL_ART_if_81 = 193;
  public static final int ARTL_ART_if_82 = 194;
  public static final int ARTL_ART_if_83 = 195;
  public static final int ARTL_ART_if_84 = 196;
  public static final int ARTL_ART_if_85 = 197;
  public static final int ARTL_ART_if_86 = 198;
  public static final int ARTL_ART_if_87 = 199;
  public static final int ARTL_ART_if_88 = 200;
  public static final int ARTL_ART_init_135 = 201;
  public static final int ARTL_ART_init_136 = 202;
  public static final int ARTL_ART_init_137 = 203;
  public static final int ARTL_ART_init_138 = 204;
  public static final int ARTL_ART_init_139 = 205;
  public static final int ARTL_ART_init_140 = 206;
  public static final int ARTL_ART_init_141 = 207;
  public static final int ARTL_ART_init_142 = 208;
  public static final int ARTL_ART_init_143 = 209;
  public static final int ARTL_ART_init_144 = 210;
  public static final int ARTL_ART_init_145 = 211;
  public static final int ARTL_ART_init_146 = 212;
  public static final int ARTL_ART_init_147 = 213;
  public static final int ARTL_ART_init_148 = 214;
  public static final int ARTL_ART_init_149 = 215;
  public static final int ARTL_ART_init_150 = 216;
  public static final int ARTL_ART_lt_213 = 217;
  public static final int ARTL_ART_lt_214 = 218;
  public static final int ARTL_ART_lt_215 = 219;
  public static final int ARTL_ART_lt_216 = 220;
  public static final int ARTL_ART_lt_217 = 221;
  public static final int ARTL_ART_lt_218 = 222;
  public static final int ARTL_ART_lt_219 = 223;
  public static final int ARTL_ART_lt_220 = 224;
  public static final int ARTL_ART_mul_303 = 225;
  public static final int ARTL_ART_mul_304 = 226;
  public static final int ARTL_ART_mul_305 = 227;
  public static final int ARTL_ART_mul_306 = 228;
  public static final int ARTL_ART_mul_307 = 229;
  public static final int ARTL_ART_mul_308 = 230;
  public static final int ARTL_ART_mul_309 = 231;
  public static final int ARTL_ART_mul_310 = 232;
  public static final int ARTL_ART_ne_205 = 233;
  public static final int ARTL_ART_ne_206 = 234;
  public static final int ARTL_ART_ne_207 = 235;
  public static final int ARTL_ART_ne_208 = 236;
  public static final int ARTL_ART_ne_209 = 237;
  public static final int ARTL_ART_ne_210 = 238;
  public static final int ARTL_ART_ne_211 = 239;
  public static final int ARTL_ART_ne_212 = 240;
  public static final int ARTL_ART_neg_319 = 241;
  public static final int ARTL_ART_neg_320 = 242;
  public static final int ARTL_ART_neg_321 = 243;
  public static final int ARTL_ART_neg_322 = 244;
  public static final int ARTL_ART_neg_323 = 245;
  public static final int ARTL_ART_neg_324 = 246;
  public static final int ARTL_ART_not_245 = 247;
  public static final int ARTL_ART_not_246 = 248;
  public static final int ARTL_ART_not_247 = 249;
  public static final int ARTL_ART_not_248 = 250;
  public static final int ARTL_ART_not_249 = 251;
  public static final int ARTL_ART_not_250 = 252;
  public static final int ARTL_ART_operand_333 = 253;
  public static final int ARTL_ART_operand_334 = 254;
  public static final int ARTL_ART_operand_335 = 255;
  public static final int ARTL_ART_operand_336 = 256;
  public static final int ARTL_ART_operand_337 = 257;
  public static final int ARTL_ART_operand_338 = 258;
  public static final int ARTL_ART_operand_339 = 259;
  public static final int ARTL_ART_operand_340 = 260;
  public static final int ARTL_ART_operand_341 = 261;
  public static final int ARTL_ART_operand_342 = 262;
  public static final int ARTL_ART_operand_343 = 263;
  public static final int ARTL_ART_operand_344 = 264;
  public static final int ARTL_ART_operand_345 = 265;
  public static final int ARTL_ART_operand_346 = 266;
  public static final int ARTL_ART_operand_347 = 267;
  public static final int ARTL_ART_operand_348 = 268;
  public static final int ARTL_ART_operand_349 = 269;
  public static final int ARTL_ART_operand_350 = 270;
  public static final int ARTL_ART_operand_351 = 271;
  public static final int ARTL_ART_operand_352 = 272;
  public static final int ARTL_ART_operand_353 = 273;
  public static final int ARTL_ART_operand_354 = 274;
  public static final int ARTL_ART_operand_355 = 275;
  public static final int ARTL_ART_operand_356 = 276;
  public static final int ARTL_ART_or_237 = 277;
  public static final int ARTL_ART_or_238 = 278;
  public static final int ARTL_ART_or_239 = 279;
  public static final int ARTL_ART_or_240 = 280;
  public static final int ARTL_ART_or_241 = 281;
  public static final int ARTL_ART_or_242 = 282;
  public static final int ARTL_ART_or_243 = 283;
  public static final int ARTL_ART_or_244 = 284;
  public static final int ARTL_ART_paint_151 = 285;
  public static final int ARTL_ART_paint_152 = 286;
  public static final int ARTL_ART_paint_153 = 287;
  public static final int ARTL_ART_paint_154 = 288;
  public static final int ARTL_ART_paint_155 = 289;
  public static final int ARTL_ART_paint_156 = 290;
  public static final int ARTL_ART_paint_157 = 291;
  public static final int ARTL_ART_paint_158 = 292;
  public static final int ARTL_ART_paint_159 = 293;
  public static final int ARTL_ART_paint_160 = 294;
  public static final int ARTL_ART_print_123 = 295;
  public static final int ARTL_ART_print_124 = 296;
  public static final int ARTL_ART_print_125 = 297;
  public static final int ARTL_ART_print_126 = 298;
  public static final int ARTL_ART_print_127 = 299;
  public static final int ARTL_ART_print_128 = 300;
  public static final int ARTL_ART_print_129 = 301;
  public static final int ARTL_ART_print_130 = 302;
  public static final int ARTL_ART_print_131 = 303;
  public static final int ARTL_ART_print_132 = 304;
  public static final int ARTL_ART_print_133 = 305;
  public static final int ARTL_ART_print_134 = 306;
  public static final int ARTL_ART_relExpr_161 = 307;
  public static final int ARTL_ART_relExpr_162 = 308;
  public static final int ARTL_ART_relExpr_163 = 309;
  public static final int ARTL_ART_relExpr_164 = 310;
  public static final int ARTL_ART_relExpr_165 = 311;
  public static final int ARTL_ART_relExpr_166 = 312;
  public static final int ARTL_ART_relExpr_167 = 313;
  public static final int ARTL_ART_relExpr_168 = 314;
  public static final int ARTL_ART_relExpr_169 = 315;
  public static final int ARTL_ART_relExpr_170 = 316;
  public static final int ARTL_ART_relExpr_171 = 317;
  public static final int ARTL_ART_relExpr_172 = 318;
  public static final int ARTL_ART_relExpr_173 = 319;
  public static final int ARTL_ART_relExpr_174 = 320;
  public static final int ARTL_ART_relExpr_175 = 321;
  public static final int ARTL_ART_relExpr_176 = 322;
  public static final int ARTL_ART_relExpr_177 = 323;
  public static final int ARTL_ART_relExpr_178 = 324;
  public static final int ARTL_ART_relExpr_179 = 325;
  public static final int ARTL_ART_relExpr_180 = 326;
  public static final int ARTL_ART_relExpr_181 = 327;
  public static final int ARTL_ART_relExpr_182 = 328;
  public static final int ARTL_ART_relExpr_183 = 329;
  public static final int ARTL_ART_relExpr_184 = 330;
  public static final int ARTL_ART_relExpr_185 = 331;
  public static final int ARTL_ART_relExpr_186 = 332;
  public static final int ARTL_ART_relExpr_187 = 333;
  public static final int ARTL_ART_relExpr_188 = 334;
  public static final int ARTL_ART_relExpr_189 = 335;
  public static final int ARTL_ART_relExpr_190 = 336;
  public static final int ARTL_ART_relExpr_191 = 337;
  public static final int ARTL_ART_relExpr_192 = 338;
  public static final int ARTL_ART_relExpr_193 = 339;
  public static final int ARTL_ART_relExpr_194 = 340;
  public static final int ARTL_ART_relExpr_195 = 341;
  public static final int ARTL_ART_relExpr_196 = 342;
  public static final int ARTL_ART_seq_33 = 343;
  public static final int ARTL_ART_seq_34 = 344;
  public static final int ARTL_ART_seq_35 = 345;
  public static final int ARTL_ART_seq_36 = 346;
  public static final int ARTL_ART_seq_37 = 347;
  public static final int ARTL_ART_seq_38 = 348;
  public static final int ARTL_ART_statement_1 = 349;
  public static final int ARTL_ART_statement_2 = 350;
  public static final int ARTL_ART_statement_3 = 351;
  public static final int ARTL_ART_statement_4 = 352;
  public static final int ARTL_ART_statement_5 = 353;
  public static final int ARTL_ART_statement_6 = 354;
  public static final int ARTL_ART_statement_7 = 355;
  public static final int ARTL_ART_statement_8 = 356;
  public static final int ARTL_ART_statement_9 = 357;
  public static final int ARTL_ART_statement_10 = 358;
  public static final int ARTL_ART_statement_11 = 359;
  public static final int ARTL_ART_statement_12 = 360;
  public static final int ARTL_ART_statement_13 = 361;
  public static final int ARTL_ART_statement_14 = 362;
  public static final int ARTL_ART_statement_15 = 363;
  public static final int ARTL_ART_statement_16 = 364;
  public static final int ARTL_ART_statement_17 = 365;
  public static final int ARTL_ART_statement_18 = 366;
  public static final int ARTL_ART_statement_19 = 367;
  public static final int ARTL_ART_statement_20 = 368;
  public static final int ARTL_ART_statement_21 = 369;
  public static final int ARTL_ART_statement_22 = 370;
  public static final int ARTL_ART_statement_23 = 371;
  public static final int ARTL_ART_statement_24 = 372;
  public static final int ARTL_ART_statement_25 = 373;
  public static final int ARTL_ART_statement_26 = 374;
  public static final int ARTL_ART_statement_27 = 375;
  public static final int ARTL_ART_statement_28 = 376;
  public static final int ARTL_ART_statement_29 = 377;
  public static final int ARTL_ART_statement_30 = 378;
  public static final int ARTL_ART_statement_31 = 379;
  public static final int ARTL_ART_statement_32 = 380;
  public static final int ARTL_ART_sub_287 = 381;
  public static final int ARTL_ART_sub_288 = 382;
  public static final int ARTL_ART_sub_289 = 383;
  public static final int ARTL_ART_sub_290 = 384;
  public static final int ARTL_ART_sub_291 = 385;
  public static final int ARTL_ART_sub_292 = 386;
  public static final int ARTL_ART_sub_293 = 387;
  public static final int ARTL_ART_sub_294 = 388;
  public static final int ARTL_ART_subExpr_259 = 389;
  public static final int ARTL_ART_subExpr_260 = 390;
  public static final int ARTL_ART_subExpr_261 = 391;
  public static final int ARTL_ART_subExpr_262 = 392;
  public static final int ARTL_ART_subExpr_263 = 393;
  public static final int ARTL_ART_subExpr_264 = 394;
  public static final int ARTL_ART_subExpr_265 = 395;
  public static final int ARTL_ART_subExpr_266 = 396;
  public static final int ARTL_ART_subExpr_267 = 397;
  public static final int ARTL_ART_subExpr_268 = 398;
  public static final int ARTL_ART_subExpr_269 = 399;
  public static final int ARTL_ART_subExpr_270 = 400;
  public static final int ARTL_ART_subExpr_271 = 401;
  public static final int ARTL_ART_subExpr_272 = 402;
  public static final int ARTL_ART_subExpr_273 = 403;
  public static final int ARTL_ART_subExpr_274 = 404;
  public static final int ARTL_ART_subExpr_275 = 405;
  public static final int ARTL_ART_subExpr_276 = 406;
  public static final int ARTL_ART_subExpr_277 = 407;
  public static final int ARTL_ART_subExpr_278 = 408;
  public static final int ARTL_ART_subExpr_279 = 409;
  public static final int ARTL_ART_subExpr_280 = 410;
  public static final int ARTL_ART_subExpr_281 = 411;
  public static final int ARTL_ART_subExpr_282 = 412;
  public static final int ARTL_ART_subExpr_283 = 413;
  public static final int ARTL_ART_subExpr_284 = 414;
  public static final int ARTL_ART_subExpr_285 = 415;
  public static final int ARTL_ART_subExpr_286 = 416;
  public static final int ARTL_ART_while_89 = 417;
  public static final int ARTL_ART_while_90 = 418;
  public static final int ARTL_ART_while_91 = 419;
  public static final int ARTL_ART_while_92 = 420;
  public static final int ARTL_ART_while_93 = 421;
  public static final int ARTL_ART_while_94 = 422;
  public static final int ARTL_ART_while_95 = 423;
  public static final int ARTL_ART_while_96 = 424;
  public static final int ARTL_ART_while_97 = 425;
  public static final int ARTL_ART_while_98 = 426;
  public static final int ARTL_ART_while_99 = 427;
  public static final int ARTL_ART_while_100 = 428;
  public static final int ARTL_ART_while_101 = 429;
  public static final int ARTL_ART_while_102 = 430;
  public static final int ARTL_ART_while_103 = 431;
  public static final int ARTL_ART_while_104 = 432;
  public static final int ARTL_ART_xor_251 = 433;
  public static final int ARTL_ART_xor_252 = 434;
  public static final int ARTL_ART_xor_253 = 435;
  public static final int ARTL_ART_xor_254 = 436;
  public static final int ARTL_ART_xor_255 = 437;
  public static final int ARTL_ART_xor_256 = 438;
  public static final int ARTL_ART_xor_257 = 439;
  public static final int ARTL_ART_xor_258 = 440;
  public static final int ARTX_DESPATCH = 441;
  public static final int ARTX_DUMMY = 442;
  public static final int ARTX_LABEL_EXTENT = 443;
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
          artFindDescriptor(ARTL_ART_ID_362, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_362: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_364, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_INTEGER_368, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_368: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_370, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_REAL_374, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_374: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_376, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_STRING_DQ_380, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_380: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_382, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_add_296, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal add: match production*/
      case ARTL_ART_add_296: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_298, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_add_298: 
        /* Nonterminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_add_300, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_302, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_add_302: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_and() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal and production descriptor loads*/
      case ARTL_ART_and: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_and_230, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal and: match production*/
      case ARTL_ART_and_230: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_and_232, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_and_232: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND_AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_and_234, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_and_236, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_and_236: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_assign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal assign production descriptor loads*/
      case ARTL_ART_assign: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_44, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_assign_46: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_48, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_backend() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal backend production descriptor loads*/
      case ARTL_ART_backend: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_backend_106, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal backend: match production*/
      case ARTL_ART_backend_106: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_backend, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_108, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_110, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_112, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_112: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_114, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_116, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_116: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_118, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_backend_120, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_backend_120: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_backend_122, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_deref() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal deref production descriptor loads*/
      case ARTL_ART_deref: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_deref_358, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal deref: match production*/
      case ARTL_ART_deref_358: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_deref_360, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_deref_360: 
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
          artFindDescriptor(ARTL_ART_div_312, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal div: match production*/
      case ARTL_ART_div_312: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_314, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_div_314: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_div_316, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_318, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_div_318: 
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
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_eq_222, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal eq: match production*/
      case ARTL_ART_eq_222: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_224, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_eq_224: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_eq_226, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_228, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_eq_228: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_exp() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal exp production descriptor loads*/
      case ARTL_ART_exp: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_exp_326, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal exp: match production*/
      case ARTL_ART_exp_326: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_exp_328, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_exp_328: 
        /* Nonterminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR_STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_exp_330, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_exp_332, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_exp_332: 
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
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_gt_198, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal gt: match production*/
      case ARTL_ART_gt_198: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_200, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_gt_200: 
        /* Nonterminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_gt_202, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_204, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_gt_204: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_if() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal if production descriptor loads*/
      case ARTL_ART_if: 
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_74, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
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
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_54, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_56: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_58, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_60, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_62, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_62: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_64, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_66, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_68, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_70, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_70: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_72, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal if: match production*/
      case ARTL_ART_if_74: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_76, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_78, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_80, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_80: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_82, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_86, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_86: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_88, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_init() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal init production descriptor loads*/
      case ARTL_ART_init: 
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_init_136, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal init: match production*/
      case ARTL_ART_init_136: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_init, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_138, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_140, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_init_142, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_init_142: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_144, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_init_146, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_init_146: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_148, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_150, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_lt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal lt production descriptor loads*/
      case ARTL_ART_lt: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_lt_214, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal lt: match production*/
      case ARTL_ART_lt_214: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_216, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_lt_216: 
        /* Nonterminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_lt_218, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_220, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_lt_220: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_mul() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal mul production descriptor loads*/
      case ARTL_ART_mul: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mul_304, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal mul: match production*/
      case ARTL_ART_mul_304: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_306, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_mul_306: 
        /* Nonterminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_mul_308, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_310, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_mul_310: 
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
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ne_206, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ne: match production*/
      case ARTL_ART_ne_206: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_208, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_ne_208: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ne_210, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_212, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_ne_212: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_neg() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal neg production descriptor loads*/
      case ARTL_ART_neg: 
        if (ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_neg_320, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal neg: match production*/
      case ARTL_ART_neg_320: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_neg_322, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_neg_324, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_neg_324: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_not() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal not production descriptor loads*/
      case ARTL_ART_not: 
        if (ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_not_246, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal not: match production*/
      case ARTL_ART_not_246: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_not_248, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_not_250, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_not_250: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_334, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_338, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_342, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_346, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_350, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_334: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_336, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_operand_336: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_338: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_340, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_340: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_342: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_344, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_operand_344: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_346: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_348, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_operand_348: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_350: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_352, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_354, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_operand_354: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_356, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_or() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal or production descriptor loads*/
      case ARTL_ART_or: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_or_238, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal or: match production*/
      case ARTL_ART_or_238: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_or_240, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_or_240: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__BAR_BAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_or_242, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_or_244, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_or_244: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_paint() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal paint production descriptor loads*/
      case ARTL_ART_paint: 
        if (ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_paint_152, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal paint: match production*/
      case ARTL_ART_paint_152: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_paint, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_154, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_156, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_158, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_160, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_print() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal print production descriptor loads*/
      case ARTL_ART_print: 
        if (ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_print_124, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal print: match production*/
      case ARTL_ART_print_124: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_print, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_126, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_128, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_print_130, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_print_130: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_132, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_134, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_relExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal relExpr production descriptor loads*/
      case ARTL_ART_relExpr: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_162, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_166, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_170, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_174, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_178, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_182, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_186, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_190, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_194, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_162: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_164, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_164: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_166: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_168, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_gt; return; }
      case ARTL_ART_relExpr_168: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_170: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_172, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ne; return; }
      case ARTL_ART_relExpr_172: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_174: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_176, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_lt; return; }
      case ARTL_ART_relExpr_176: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_178: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_180, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_eq; return; }
      case ARTL_ART_relExpr_180: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_182: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_184, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_and; return; }
      case ARTL_ART_relExpr_184: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_186: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_188, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_or; return; }
      case ARTL_ART_relExpr_188: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_190: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_192, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_not; return; }
      case ARTL_ART_relExpr_192: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_194: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_196, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_xor; return; }
      case ARTL_ART_relExpr_196: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_seq() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal seq production descriptor loads*/
      case ARTL_ART_seq: 
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_38, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_38: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_10, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet49[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_18, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet51[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_22, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_26, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sub() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sub production descriptor loads*/
      case ARTL_ART_sub: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sub_288, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sub: match production*/
      case ARTL_ART_sub_288: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_290, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_sub_290: 
        /* Nonterminal template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sub_292, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_294, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_sub_294: 
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
          artFindDescriptor(ARTL_ART_subExpr_260, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_264, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_268, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_272, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_276, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_280, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_284, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_260: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_262, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_262: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_264: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_266, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sub; return; }
      case ARTL_ART_subExpr_266: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_268: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_270, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_add; return; }
      case ARTL_ART_subExpr_270: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_272: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_274, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mul; return; }
      case ARTL_ART_subExpr_274: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_276: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_278, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_div; return; }
      case ARTL_ART_subExpr_278: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_280: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_282, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_neg; return; }
      case ARTL_ART_subExpr_282: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_284: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_286, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_exp; return; }
      case ARTL_ART_subExpr_286: 
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
        if (ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_while_90, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal while: match production*/
      case ARTL_ART_while_90: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_92, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_94, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_while_96: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_98, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_100, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_102, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_while_102: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_104, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_xor() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal xor production descriptor loads*/
      case ARTL_ART_xor: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_xor_252, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal xor: match production*/
      case ARTL_ART_xor_252: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_xor_254, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_xor_254: 
        /* Nonterminal template end */
        if (!ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__UPARROW, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_xor_256, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_xor_258, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_xor_258: 
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
    artTokenExtent = 65;
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
        case ARTL_ART_and: 
          ARTPF_ART_and();
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
        case ARTL_ART_exp: 
          ARTPF_ART_exp();
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
        case ARTL_ART_neg: 
          ARTPF_ART_neg();
          break;
        case ARTL_ART_not: 
          ARTPF_ART_not();
          break;
        case ARTL_ART_operand: 
          ARTPF_ART_operand();
          break;
        case ARTL_ART_or: 
          ARTPF_ART_or();
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
        case ARTL_ART_xor: 
          ARTPF_ART_xor();
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

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTB_INTEGER] = true;
    ARTSet33[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[ARTTS_init] = true;
    ARTSet52[ARTL_ART_init] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTS_paint] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[ARTTS_while] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTB_ID] = true;
    ARTSet39[ARTTB_INTEGER] = true;
    ARTSet39[ARTTB_REAL] = true;
    ARTSet39[ARTTB_STRING_DQ] = true;
    ARTSet39[ARTTS__LPAR] = true;
    ARTSet39[ARTL_ART_ID] = true;
    ARTSet39[ARTL_ART_INTEGER] = true;
    ARTSet39[ARTL_ART_REAL] = true;
    ARTSet39[ARTL_ART_STRING_DQ] = true;
    ARTSet39[ARTL_ART_deref] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS_if] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS_else] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS__SHREIK] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTB_ID] = true;
    ARTSet12[ARTTB_INTEGER] = true;
    ARTSet12[ARTTB_REAL] = true;
    ARTSet12[ARTTB_STRING_DQ] = true;
    ARTSet12[ARTTS__SHREIK] = true;
    ARTSet12[ARTTS__LPAR] = true;
    ARTSet12[ARTTS__MINUS] = true;
    ARTSet12[ARTL_ART_ID] = true;
    ARTSet12[ARTL_ART_INTEGER] = true;
    ARTSet12[ARTL_ART_REAL] = true;
    ARTSet12[ARTL_ART_STRING_DQ] = true;
    ARTSet12[ARTL_ART_add] = true;
    ARTSet12[ARTL_ART_and] = true;
    ARTSet12[ARTL_ART_deref] = true;
    ARTSet12[ARTL_ART_div] = true;
    ARTSet12[ARTL_ART_eq] = true;
    ARTSet12[ARTL_ART_exp] = true;
    ARTSet12[ARTL_ART_gt] = true;
    ARTSet12[ARTL_ART_lt] = true;
    ARTSet12[ARTL_ART_mul] = true;
    ARTSet12[ARTL_ART_ne] = true;
    ARTSet12[ARTL_ART_neg] = true;
    ARTSet12[ARTL_ART_not] = true;
    ARTSet12[ARTL_ART_operand] = true;
    ARTSet12[ARTL_ART_or] = true;
    ARTSet12[ARTL_ART_relExpr] = true;
    ARTSet12[ARTL_ART_sub] = true;
    ARTSet12[ARTL_ART_subExpr] = true;
    ARTSet12[ARTL_ART_xor] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS__LPAR] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS__RPAR] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTS__STAR] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS__PLUS] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS__COMMA] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTS__MINUS] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS__SLASH] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTB_ID] = true;
    ARTSet29[ARTTS_backend] = true;
    ARTSet29[ARTTS_if] = true;
    ARTSet29[ARTTS_init] = true;
    ARTSet29[ARTTS_paint] = true;
    ARTSet29[ARTTS_print] = true;
    ARTSet29[ARTTS_while] = true;
    ARTSet29[ARTL_ART_ID] = true;
    ARTSet29[ARTL_ART_assign] = true;
    ARTSet29[ARTL_ART_backend] = true;
    ARTSet29[ARTL_ART_if] = true;
    ARTSet29[ARTL_ART_init] = true;
    ARTSet29[ARTL_ART_paint] = true;
    ARTSet29[ARTL_ART_print] = true;
    ARTSet29[ARTL_ART_seq] = true;
    ARTSet29[ARTL_ART_statement] = true;
    ARTSet29[ARTL_ART_while] = true;
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[ARTTS_print] = true;
    ARTSet51[ARTL_ART_print] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTS__SHREIK_EQUAL] = true;
    ARTSet13[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet13[ARTTS__RPAR] = true;
    ARTSet13[ARTTS__SEMICOLON] = true;
    ARTSet13[ARTTS__LT] = true;
    ARTSet13[ARTTS__EQUAL_EQUAL] = true;
    ARTSet13[ARTTS__GT] = true;
    ARTSet13[ARTTS__UPARROW] = true;
    ARTSet13[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTS__LT] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTS__SHREIK_EQUAL] = true;
    ARTSet6[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__STAR] = true;
    ARTSet6[ARTTS__STAR_STAR] = true;
    ARTSet6[ARTTS__PLUS] = true;
    ARTSet6[ARTTS__COMMA] = true;
    ARTSet6[ARTTS__MINUS] = true;
    ARTSet6[ARTTS__SLASH] = true;
    ARTSet6[ARTTS__SEMICOLON] = true;
    ARTSet6[ARTTS__LT] = true;
    ARTSet6[ARTTS__EQUAL_EQUAL] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS__UPARROW] = true;
    ARTSet6[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS__EQUAL] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS__GT] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__AMPERSAND_AMPERSAND] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS__STAR_STAR] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS_init] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTB_ID] = true;
    ARTSet15[ARTL_ART_ID] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTS_if] = true;
    ARTSet48[ARTL_ART_if] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTB_STRING_DQ] = true;
    ARTSet42[ARTL_ART_STRING_DQ] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTX_EOS] = true;
    ARTSet16[ARTTB_ID] = true;
    ARTSet16[ARTTS_backend] = true;
    ARTSet16[ARTTS_if] = true;
    ARTSet16[ARTTS_init] = true;
    ARTSet16[ARTTS_paint] = true;
    ARTSet16[ARTTS_print] = true;
    ARTSet16[ARTTS_while] = true;
    ARTSet16[ARTTS__RBRACE] = true;
    ARTSet16[ARTL_ART_ID] = true;
    ARTSet16[ARTL_ART_assign] = true;
    ARTSet16[ARTL_ART_backend] = true;
    ARTSet16[ARTL_ART_if] = true;
    ARTSet16[ARTL_ART_init] = true;
    ARTSet16[ARTL_ART_paint] = true;
    ARTSet16[ARTL_ART_print] = true;
    ARTSet16[ARTL_ART_seq] = true;
    ARTSet16[ARTL_ART_statement] = true;
    ARTSet16[ARTL_ART_while] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTB_ID] = true;
    ARTSet40[ARTL_ART_ID] = true;
    ARTSet40[ARTL_ART_deref] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[ARTTS__UPARROW] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS_backend] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTB_ID] = true;
    ARTSet47[ARTL_ART_ID] = true;
    ARTSet47[ARTL_ART_assign] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[ARTTS_backend] = true;
    ARTSet50[ARTL_ART_backend] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[ARTTS_paint] = true;
    ARTSet53[ARTL_ART_paint] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTB_ID] = true;
    ARTSet9[ARTTB_INTEGER] = true;
    ARTSet9[ARTTB_REAL] = true;
    ARTSet9[ARTTB_STRING_DQ] = true;
    ARTSet9[ARTTS__LPAR] = true;
    ARTSet9[ARTTS__MINUS] = true;
    ARTSet9[ARTL_ART_ID] = true;
    ARTSet9[ARTL_ART_INTEGER] = true;
    ARTSet9[ARTL_ART_REAL] = true;
    ARTSet9[ARTL_ART_STRING_DQ] = true;
    ARTSet9[ARTL_ART_add] = true;
    ARTSet9[ARTL_ART_deref] = true;
    ARTSet9[ARTL_ART_div] = true;
    ARTSet9[ARTL_ART_exp] = true;
    ARTSet9[ARTL_ART_mul] = true;
    ARTSet9[ARTL_ART_neg] = true;
    ARTSet9[ARTL_ART_operand] = true;
    ARTSet9[ARTL_ART_sub] = true;
    ARTSet9[ARTL_ART_subExpr] = true;
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

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS__SHREIK] = true;
    ARTSet46[ARTL_ART_not] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTB_REAL] = true;
    ARTSet41[ARTL_ART_REAL] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTS__SHREIK_EQUAL] = true;
    ARTSet3[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__STAR] = true;
    ARTSet3[ARTTS__STAR_STAR] = true;
    ARTSet3[ARTTS__PLUS] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__SLASH] = true;
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__EQUAL] = true;
    ARTSet3[ARTTS__EQUAL_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS__UPARROW] = true;
    ARTSet3[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS_print] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[ARTTS__MINUS] = true;
    ARTSet54[ARTL_ART_neg] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS__LBRACE] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS__RBRACE] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_REAL] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet49initialise() {
    ARTSet49 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet49, 0, artSetExtent, false);
    ARTSet49[ARTTS_while] = true;
    ARTSet49[ARTL_ART_while] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet33initialise();
    ARTSet52initialise();
    ARTSet44initialise();
    ARTSet55initialise();
    ARTSet39initialise();
    ARTSet27initialise();
    ARTSet31initialise();
    ARTSet24initialise();
    ARTSet38initialise();
    ARTSet12initialise();
    ARTSet20initialise();
    ARTSet22initialise();
    ARTSet35initialise();
    ARTSet10initialise();
    ARTSet21initialise();
    ARTSet37initialise();
    ARTSet23initialise();
    ARTSet29initialise();
    ARTSet51initialise();
    ARTSet13initialise();
    ARTSet18initialise();
    ARTSet34initialise();
    ARTSet36initialise();
    ARTSet6initialise();
    ARTSet17initialise();
    ARTSet4initialise();
    ARTSet26initialise();
    ARTSet14initialise();
    ARTSet25initialise();
    ARTSet32initialise();
    ARTSet15initialise();
    ARTSet48initialise();
    ARTSet42initialise();
    ARTSet16initialise();
    ARTSet40initialise();
    ARTSet2initialise();
    ARTSet56initialise();
    ARTSet5initialise();
    ARTSet19initialise();
    ARTSet47initialise();
    ARTSet50initialise();
    ARTSet53initialise();
    ARTSet9initialise();
    ARTSet11initialise();
    ARTSet46initialise();
    ARTSet8initialise();
    ARTSet41initialise();
    ARTSet3initialise();
    ARTSet45initialise();
    ARTSet54initialise();
    ARTSet28initialise();
    ARTSet30initialise();
    ARTSet7initialise();
    ARTSet43initialise();
    ARTSet49initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_362] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_362] = "";
    artlhsL[ARTL_ART_ID_362] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_362] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_362] = true;
    artFolds[ARTL_ART_ID_364] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_ID_363] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_363] = "";
    artlhsL[ARTL_ART_ID_363] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_363] = true;
    artLabelInternalStrings[ARTL_ART_ID_364] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_364] = "";
    artlhsL[ARTL_ART_ID_364] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_364] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_364] = true;
    arteoR_pL[ARTL_ART_ID_364] = true;
    artPopD[ARTL_ART_ID_364] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_368] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_368] = "";
    artlhsL[ARTL_ART_INTEGER_368] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_368] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_368] = true;
    artFolds[ARTL_ART_INTEGER_370] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_INTEGER_369] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_369] = "";
    artlhsL[ARTL_ART_INTEGER_369] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_369] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_370] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_370] = "";
    artlhsL[ARTL_ART_INTEGER_370] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_370] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_370] = true;
    arteoR_pL[ARTL_ART_INTEGER_370] = true;
    artPopD[ARTL_ART_INTEGER_370] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_374] = "REAL ::= . &REAL  ";
    artLabelStrings[ARTL_ART_REAL_374] = "";
    artlhsL[ARTL_ART_REAL_374] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_374] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_374] = true;
    artFolds[ARTL_ART_REAL_376] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_REAL_375] = "REAL ::= &REAL  ";
    artLabelStrings[ARTL_ART_REAL_375] = "";
    artlhsL[ARTL_ART_REAL_375] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_375] = true;
    artLabelInternalStrings[ARTL_ART_REAL_376] = "REAL ::= &REAL  .";
    artLabelStrings[ARTL_ART_REAL_376] = "";
    artlhsL[ARTL_ART_REAL_376] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_376] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_376] = true;
    arteoR_pL[ARTL_ART_REAL_376] = true;
    artPopD[ARTL_ART_REAL_376] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_380] = "STRING_DQ ::= . &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_380] = "";
    artlhsL[ARTL_ART_STRING_DQ_380] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_380] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_380] = true;
    artFolds[ARTL_ART_STRING_DQ_382] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_381] = "STRING_DQ ::= &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_381] = "";
    artlhsL[ARTL_ART_STRING_DQ_381] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_381] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_382] = "STRING_DQ ::= &STRING_DQ  .";
    artLabelStrings[ARTL_ART_STRING_DQ_382] = "";
    artlhsL[ARTL_ART_STRING_DQ_382] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_382] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_382] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_382] = true;
    artPopD[ARTL_ART_STRING_DQ_382] = true;
  }

  public void artTableInitialiser_ART_add() {
    artLabelInternalStrings[ARTL_ART_add] = "add";
    artLabelStrings[ARTL_ART_add] = "add";
    artKindOfs[ARTL_ART_add] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_add_296] = "add ::= . subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_296] = "";
    artlhsL[ARTL_ART_add_296] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_296] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_298] = "add ::= subExpr . '+'  operand ";
    artLabelStrings[ARTL_ART_add_298] = "";
    artlhsL[ARTL_ART_add_298] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_298] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_add_298] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_add_298] = true;
    artFolds[ARTL_ART_add_300] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_add_299] = "add ::= subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_299] = "";
    artlhsL[ARTL_ART_add_299] = ARTL_ART_add;
    artLabelInternalStrings[ARTL_ART_add_300] = "add ::= subExpr '+'  . operand ";
    artLabelStrings[ARTL_ART_add_300] = "";
    artlhsL[ARTL_ART_add_300] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_300] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_302] = "add ::= subExpr '+'  operand .";
    artLabelStrings[ARTL_ART_add_302] = "";
    artlhsL[ARTL_ART_add_302] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_302] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_add_302] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_add_302] = true;
    arteoR_pL[ARTL_ART_add_302] = true;
    artPopD[ARTL_ART_add_302] = true;
  }

  public void artTableInitialiser_ART_and() {
    artLabelInternalStrings[ARTL_ART_and] = "and";
    artLabelStrings[ARTL_ART_and] = "and";
    artKindOfs[ARTL_ART_and] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_and_230] = "and ::= . relExpr '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_230] = "";
    artlhsL[ARTL_ART_and_230] = ARTL_ART_and;
    artKindOfs[ARTL_ART_and_230] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_and_232] = "and ::= relExpr . '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_232] = "";
    artlhsL[ARTL_ART_and_232] = ARTL_ART_and;
    artSlotInstanceOfs[ARTL_ART_and_232] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_and_232] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_and_232] = true;
    artFolds[ARTL_ART_and_234] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_and_233] = "and ::= relExpr '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_233] = "";
    artlhsL[ARTL_ART_and_233] = ARTL_ART_and;
    artLabelInternalStrings[ARTL_ART_and_234] = "and ::= relExpr '&&'  . relExpr ";
    artLabelStrings[ARTL_ART_and_234] = "";
    artlhsL[ARTL_ART_and_234] = ARTL_ART_and;
    artKindOfs[ARTL_ART_and_234] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_and_236] = "and ::= relExpr '&&'  relExpr .";
    artLabelStrings[ARTL_ART_and_236] = "";
    artlhsL[ARTL_ART_and_236] = ARTL_ART_and;
    artSlotInstanceOfs[ARTL_ART_and_236] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_and_236] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_and_236] = true;
    arteoR_pL[ARTL_ART_and_236] = true;
    artPopD[ARTL_ART_and_236] = true;
  }

  public void artTableInitialiser_ART_assign() {
    artLabelInternalStrings[ARTL_ART_assign] = "assign";
    artLabelStrings[ARTL_ART_assign] = "assign";
    artKindOfs[ARTL_ART_assign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_assign_40] = "assign ::= . ID '='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_40] = "";
    artlhsL[ARTL_ART_assign_40] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_40] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_42] = "assign ::= ID . '='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_42] = "";
    artlhsL[ARTL_ART_assign_42] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_42] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_assign_42] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_assign_42] = true;
    artFolds[ARTL_ART_assign_44] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_43] = "assign ::= ID '='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_43] = "";
    artlhsL[ARTL_ART_assign_43] = ARTL_ART_assign;
    artLabelInternalStrings[ARTL_ART_assign_44] = "assign ::= ID '='  . relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_44] = "";
    artlhsL[ARTL_ART_assign_44] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_44] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_46] = "assign ::= ID '='  relExpr . ';'  ";
    artLabelStrings[ARTL_ART_assign_46] = "";
    artlhsL[ARTL_ART_assign_46] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_46] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_assign_46] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_assign_46] = true;
    artFolds[ARTL_ART_assign_48] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_47] = "assign ::= ID '='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_47] = "";
    artlhsL[ARTL_ART_assign_47] = ARTL_ART_assign;
    artPopD[ARTL_ART_assign_47] = true;
    artLabelInternalStrings[ARTL_ART_assign_48] = "assign ::= ID '='  relExpr ';'  .";
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
    artLabelInternalStrings[ARTL_ART_backend_106] = "backend ::= . 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_106] = "";
    artlhsL[ARTL_ART_backend_106] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_106] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_108] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_107] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_107] = "";
    artlhsL[ARTL_ART_backend_107] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_108] = "backend ::= 'backend'  . '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_108] = "";
    artlhsL[ARTL_ART_backend_108] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_108] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_backend_108] = true;
    artFolds[ARTL_ART_backend_110] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_109] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_109] = "";
    artlhsL[ARTL_ART_backend_109] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_110] = "backend ::= 'backend'  '('  . subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_110] = "";
    artlhsL[ARTL_ART_backend_110] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_110] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_112] = "backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_112] = "";
    artlhsL[ARTL_ART_backend_112] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_112] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_112] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_114] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_113] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_113] = "";
    artlhsL[ARTL_ART_backend_113] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_114] = "backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_114] = "";
    artlhsL[ARTL_ART_backend_114] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_114] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_116] = "backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_116] = "";
    artlhsL[ARTL_ART_backend_116] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_116] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_116] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_backend_118] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_117] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_117] = "";
    artlhsL[ARTL_ART_backend_117] = ARTL_ART_backend;
    artLabelInternalStrings[ARTL_ART_backend_118] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_118] = "";
    artlhsL[ARTL_ART_backend_118] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_118] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_backend_120] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_backend_120] = "";
    artlhsL[ARTL_ART_backend_120] = ARTL_ART_backend;
    artSlotInstanceOfs[ARTL_ART_backend_120] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_backend_120] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_backend_120] = true;
    artFolds[ARTL_ART_backend_122] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_backend_121] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  ";
    artLabelStrings[ARTL_ART_backend_121] = "";
    artlhsL[ARTL_ART_backend_121] = ARTL_ART_backend;
    artPopD[ARTL_ART_backend_121] = true;
    artLabelInternalStrings[ARTL_ART_backend_122] = "backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .";
    artLabelStrings[ARTL_ART_backend_122] = "";
    artlhsL[ARTL_ART_backend_122] = ARTL_ART_backend;
    artKindOfs[ARTL_ART_backend_122] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_backend_122] = true;
    arteoR_pL[ARTL_ART_backend_122] = true;
    artPopD[ARTL_ART_backend_122] = true;
  }

  public void artTableInitialiser_ART_deref() {
    artLabelInternalStrings[ARTL_ART_deref] = "deref";
    artLabelStrings[ARTL_ART_deref] = "deref";
    artKindOfs[ARTL_ART_deref] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_deref_358] = "deref ::= . ID ";
    artLabelStrings[ARTL_ART_deref_358] = "";
    artlhsL[ARTL_ART_deref_358] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_deref_358] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_deref_360] = "deref ::= ID .";
    artLabelStrings[ARTL_ART_deref_360] = "";
    artlhsL[ARTL_ART_deref_360] = ARTL_ART_deref;
    artSlotInstanceOfs[ARTL_ART_deref_360] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_deref_360] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_deref_360] = true;
    arteoR_pL[ARTL_ART_deref_360] = true;
    artPopD[ARTL_ART_deref_360] = true;
  }

  public void artTableInitialiser_ART_div() {
    artLabelInternalStrings[ARTL_ART_div] = "div";
    artLabelStrings[ARTL_ART_div] = "div";
    artKindOfs[ARTL_ART_div] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_div_312] = "div ::= . subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_312] = "";
    artlhsL[ARTL_ART_div_312] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_312] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_314] = "div ::= subExpr . '/'  operand ";
    artLabelStrings[ARTL_ART_div_314] = "";
    artlhsL[ARTL_ART_div_314] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_314] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_div_314] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_div_314] = true;
    artFolds[ARTL_ART_div_316] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_div_315] = "div ::= subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_315] = "";
    artlhsL[ARTL_ART_div_315] = ARTL_ART_div;
    artLabelInternalStrings[ARTL_ART_div_316] = "div ::= subExpr '/'  . operand ";
    artLabelStrings[ARTL_ART_div_316] = "";
    artlhsL[ARTL_ART_div_316] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_316] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_318] = "div ::= subExpr '/'  operand .";
    artLabelStrings[ARTL_ART_div_318] = "";
    artlhsL[ARTL_ART_div_318] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_318] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_div_318] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_div_318] = true;
    arteoR_pL[ARTL_ART_div_318] = true;
    artPopD[ARTL_ART_div_318] = true;
  }

  public void artTableInitialiser_ART_eq() {
    artLabelInternalStrings[ARTL_ART_eq] = "eq";
    artLabelStrings[ARTL_ART_eq] = "eq";
    artKindOfs[ARTL_ART_eq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_eq_222] = "eq ::= . relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_222] = "";
    artlhsL[ARTL_ART_eq_222] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_222] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_224] = "eq ::= relExpr . '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_224] = "";
    artlhsL[ARTL_ART_eq_224] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_224] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_eq_224] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_eq_224] = true;
    artFolds[ARTL_ART_eq_226] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_eq_225] = "eq ::= relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_225] = "";
    artlhsL[ARTL_ART_eq_225] = ARTL_ART_eq;
    artLabelInternalStrings[ARTL_ART_eq_226] = "eq ::= relExpr '=='  . subExpr ";
    artLabelStrings[ARTL_ART_eq_226] = "";
    artlhsL[ARTL_ART_eq_226] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_226] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_228] = "eq ::= relExpr '=='  subExpr .";
    artLabelStrings[ARTL_ART_eq_228] = "";
    artlhsL[ARTL_ART_eq_228] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_228] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_eq_228] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_eq_228] = true;
    arteoR_pL[ARTL_ART_eq_228] = true;
    artPopD[ARTL_ART_eq_228] = true;
  }

  public void artTableInitialiser_ART_exp() {
    artLabelInternalStrings[ARTL_ART_exp] = "exp";
    artLabelStrings[ARTL_ART_exp] = "exp";
    artKindOfs[ARTL_ART_exp] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_exp_326] = "exp ::= . subExpr '**'  operand ";
    artLabelStrings[ARTL_ART_exp_326] = "";
    artlhsL[ARTL_ART_exp_326] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_exp_326] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_exp_328] = "exp ::= subExpr . '**'  operand ";
    artLabelStrings[ARTL_ART_exp_328] = "";
    artlhsL[ARTL_ART_exp_328] = ARTL_ART_exp;
    artSlotInstanceOfs[ARTL_ART_exp_328] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_exp_328] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_exp_328] = true;
    artFolds[ARTL_ART_exp_330] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_exp_329] = "exp ::= subExpr '**'  operand ";
    artLabelStrings[ARTL_ART_exp_329] = "";
    artlhsL[ARTL_ART_exp_329] = ARTL_ART_exp;
    artLabelInternalStrings[ARTL_ART_exp_330] = "exp ::= subExpr '**'  . operand ";
    artLabelStrings[ARTL_ART_exp_330] = "";
    artlhsL[ARTL_ART_exp_330] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_exp_330] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_exp_332] = "exp ::= subExpr '**'  operand .";
    artLabelStrings[ARTL_ART_exp_332] = "";
    artlhsL[ARTL_ART_exp_332] = ARTL_ART_exp;
    artSlotInstanceOfs[ARTL_ART_exp_332] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_exp_332] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_exp_332] = true;
    arteoR_pL[ARTL_ART_exp_332] = true;
    artPopD[ARTL_ART_exp_332] = true;
  }

  public void artTableInitialiser_ART_gt() {
    artLabelInternalStrings[ARTL_ART_gt] = "gt";
    artLabelStrings[ARTL_ART_gt] = "gt";
    artKindOfs[ARTL_ART_gt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_gt_198] = "gt ::= . relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_198] = "";
    artlhsL[ARTL_ART_gt_198] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_198] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_200] = "gt ::= relExpr . '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_200] = "";
    artlhsL[ARTL_ART_gt_200] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_200] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_gt_200] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_gt_200] = true;
    artFolds[ARTL_ART_gt_202] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_gt_201] = "gt ::= relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_201] = "";
    artlhsL[ARTL_ART_gt_201] = ARTL_ART_gt;
    artLabelInternalStrings[ARTL_ART_gt_202] = "gt ::= relExpr '>'  . subExpr ";
    artLabelStrings[ARTL_ART_gt_202] = "";
    artlhsL[ARTL_ART_gt_202] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_202] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_204] = "gt ::= relExpr '>'  subExpr .";
    artLabelStrings[ARTL_ART_gt_204] = "";
    artlhsL[ARTL_ART_gt_204] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_204] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_gt_204] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_gt_204] = true;
    arteoR_pL[ARTL_ART_gt_204] = true;
    artPopD[ARTL_ART_gt_204] = true;
  }

  public void artTableInitialiser_ART_if() {
    artLabelInternalStrings[ARTL_ART_if] = "if";
    artLabelStrings[ARTL_ART_if] = "if";
    artKindOfs[ARTL_ART_if] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_if_50] = "if ::= . 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_50] = "";
    artlhsL[ARTL_ART_if_50] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_50] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_52] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_51] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_51] = "";
    artlhsL[ARTL_ART_if_51] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_52] = "if ::= 'if'  . '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_52] = "";
    artlhsL[ARTL_ART_if_52] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_52] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_if_52] = true;
    artFolds[ARTL_ART_if_54] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_53] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_53] = "";
    artlhsL[ARTL_ART_if_53] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_54] = "if ::= 'if'  '('  . relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_54] = "";
    artlhsL[ARTL_ART_if_54] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_54] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_56] = "if ::= 'if'  '('  relExpr . ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_56] = "";
    artlhsL[ARTL_ART_if_56] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_56] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_if_56] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_58] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_57] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_57] = "";
    artlhsL[ARTL_ART_if_57] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_58] = "if ::= 'if'  '('  relExpr ')'  . '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_58] = "";
    artlhsL[ARTL_ART_if_58] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_58] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_60] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_59] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_59] = "";
    artlhsL[ARTL_ART_if_59] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_60] = "if ::= 'if'  '('  relExpr ')'  '{'  . statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_60] = "";
    artlhsL[ARTL_ART_if_60] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_60] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_62] = "if ::= 'if'  '('  relExpr ')'  '{'  statement . '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_62] = "";
    artlhsL[ARTL_ART_if_62] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_62] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_62] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_64] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_63] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_63] = "";
    artlhsL[ARTL_ART_if_63] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_64] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  . 'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_64] = "";
    artlhsL[ARTL_ART_if_64] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_64] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_66] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_65] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_65] = "";
    artlhsL[ARTL_ART_if_65] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_66] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  . '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_66] = "";
    artlhsL[ARTL_ART_if_66] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_66] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_68] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_67] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_67] = "";
    artlhsL[ARTL_ART_if_67] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_68] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  . statement '}'  ";
    artLabelStrings[ARTL_ART_if_68] = "";
    artlhsL[ARTL_ART_if_68] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_68] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_70] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement . '}'  ";
    artLabelStrings[ARTL_ART_if_70] = "";
    artlhsL[ARTL_ART_if_70] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_70] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_70] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_if_70] = true;
    artFolds[ARTL_ART_if_72] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_71] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_71] = "";
    artlhsL[ARTL_ART_if_71] = ARTL_ART_if;
    artPopD[ARTL_ART_if_71] = true;
    artLabelInternalStrings[ARTL_ART_if_72] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  .";
    artLabelStrings[ARTL_ART_if_72] = "";
    artlhsL[ARTL_ART_if_72] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_72] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_if_72] = true;
    arteoR_pL[ARTL_ART_if_72] = true;
    artPopD[ARTL_ART_if_72] = true;
    artLabelInternalStrings[ARTL_ART_if_74] = "if ::= . 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_74] = "";
    artlhsL[ARTL_ART_if_74] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_74] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_76] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_75] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_75] = "";
    artlhsL[ARTL_ART_if_75] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_76] = "if ::= 'if'  . '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_76] = "";
    artlhsL[ARTL_ART_if_76] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_76] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_if_76] = true;
    artFolds[ARTL_ART_if_78] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_77] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_77] = "";
    artlhsL[ARTL_ART_if_77] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_78] = "if ::= 'if'  '('  . relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_78] = "";
    artlhsL[ARTL_ART_if_78] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_78] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_80] = "if ::= 'if'  '('  relExpr . ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_80] = "";
    artlhsL[ARTL_ART_if_80] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_80] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_if_80] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_82] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_81] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_81] = "";
    artlhsL[ARTL_ART_if_81] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_82] = "if ::= 'if'  '('  relExpr ')'  . '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_82] = "";
    artlhsL[ARTL_ART_if_82] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_82] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_84] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_83] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_83] = "";
    artlhsL[ARTL_ART_if_83] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_84] = "if ::= 'if'  '('  relExpr ')'  '{'  . statement '}'  ";
    artLabelStrings[ARTL_ART_if_84] = "";
    artlhsL[ARTL_ART_if_84] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_84] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_86] = "if ::= 'if'  '('  relExpr ')'  '{'  statement . '}'  ";
    artLabelStrings[ARTL_ART_if_86] = "";
    artlhsL[ARTL_ART_if_86] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_86] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_86] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_if_86] = true;
    artFolds[ARTL_ART_if_88] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_87] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_87] = "";
    artlhsL[ARTL_ART_if_87] = ARTL_ART_if;
    artPopD[ARTL_ART_if_87] = true;
    artLabelInternalStrings[ARTL_ART_if_88] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  .";
    artLabelStrings[ARTL_ART_if_88] = "";
    artlhsL[ARTL_ART_if_88] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_88] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_if_88] = true;
    arteoR_pL[ARTL_ART_if_88] = true;
    artPopD[ARTL_ART_if_88] = true;
  }

  public void artTableInitialiser_ART_init() {
    artLabelInternalStrings[ARTL_ART_init] = "init";
    artLabelStrings[ARTL_ART_init] = "init";
    artKindOfs[ARTL_ART_init] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_init_136] = "init ::= . 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_136] = "";
    artlhsL[ARTL_ART_init_136] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_136] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_init_138] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_137] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_137] = "";
    artlhsL[ARTL_ART_init_137] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_138] = "init ::= 'init'  . '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_138] = "";
    artlhsL[ARTL_ART_init_138] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_138] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_init_138] = true;
    artFolds[ARTL_ART_init_140] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_139] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_139] = "";
    artlhsL[ARTL_ART_init_139] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_140] = "init ::= 'init'  '('  . INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_140] = "";
    artlhsL[ARTL_ART_init_140] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_140] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_init_142] = "init ::= 'init'  '('  INTEGER . ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_142] = "";
    artlhsL[ARTL_ART_init_142] = ARTL_ART_init;
    artSlotInstanceOfs[ARTL_ART_init_142] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_init_142] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_init_144] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_143] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_143] = "";
    artlhsL[ARTL_ART_init_143] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_144] = "init ::= 'init'  '('  INTEGER ','  . INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_144] = "";
    artlhsL[ARTL_ART_init_144] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_144] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_init_146] = "init ::= 'init'  '('  INTEGER ','  INTEGER . ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_146] = "";
    artlhsL[ARTL_ART_init_146] = ARTL_ART_init;
    artSlotInstanceOfs[ARTL_ART_init_146] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_init_146] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_init_146] = true;
    artFolds[ARTL_ART_init_148] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_147] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_147] = "";
    artlhsL[ARTL_ART_init_147] = ARTL_ART_init;
    artPopD[ARTL_ART_init_147] = true;
    artLabelInternalStrings[ARTL_ART_init_148] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  . ';'  ";
    artLabelStrings[ARTL_ART_init_148] = "";
    artlhsL[ARTL_ART_init_148] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_148] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_init_148] = true;
    artFolds[ARTL_ART_init_150] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_149] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_149] = "";
    artlhsL[ARTL_ART_init_149] = ARTL_ART_init;
    artPopD[ARTL_ART_init_149] = true;
    artLabelInternalStrings[ARTL_ART_init_150] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  .";
    artLabelStrings[ARTL_ART_init_150] = "";
    artlhsL[ARTL_ART_init_150] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_150] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_init_150] = true;
    arteoR_pL[ARTL_ART_init_150] = true;
    artPopD[ARTL_ART_init_150] = true;
  }

  public void artTableInitialiser_ART_lt() {
    artLabelInternalStrings[ARTL_ART_lt] = "lt";
    artLabelStrings[ARTL_ART_lt] = "lt";
    artKindOfs[ARTL_ART_lt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_lt_214] = "lt ::= . relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_214] = "";
    artlhsL[ARTL_ART_lt_214] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_214] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_216] = "lt ::= relExpr . '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_216] = "";
    artlhsL[ARTL_ART_lt_216] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_216] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_lt_216] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_lt_216] = true;
    artFolds[ARTL_ART_lt_218] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_lt_217] = "lt ::= relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_217] = "";
    artlhsL[ARTL_ART_lt_217] = ARTL_ART_lt;
    artLabelInternalStrings[ARTL_ART_lt_218] = "lt ::= relExpr '<'  . subExpr ";
    artLabelStrings[ARTL_ART_lt_218] = "";
    artlhsL[ARTL_ART_lt_218] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_218] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_220] = "lt ::= relExpr '<'  subExpr .";
    artLabelStrings[ARTL_ART_lt_220] = "";
    artlhsL[ARTL_ART_lt_220] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_220] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_lt_220] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_lt_220] = true;
    arteoR_pL[ARTL_ART_lt_220] = true;
    artPopD[ARTL_ART_lt_220] = true;
  }

  public void artTableInitialiser_ART_mul() {
    artLabelInternalStrings[ARTL_ART_mul] = "mul";
    artLabelStrings[ARTL_ART_mul] = "mul";
    artKindOfs[ARTL_ART_mul] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_mul_304] = "mul ::= . subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_304] = "";
    artlhsL[ARTL_ART_mul_304] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_304] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_306] = "mul ::= subExpr . '*'  operand ";
    artLabelStrings[ARTL_ART_mul_306] = "";
    artlhsL[ARTL_ART_mul_306] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_306] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_mul_306] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mul_306] = true;
    artFolds[ARTL_ART_mul_308] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_mul_307] = "mul ::= subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_307] = "";
    artlhsL[ARTL_ART_mul_307] = ARTL_ART_mul;
    artLabelInternalStrings[ARTL_ART_mul_308] = "mul ::= subExpr '*'  . operand ";
    artLabelStrings[ARTL_ART_mul_308] = "";
    artlhsL[ARTL_ART_mul_308] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_308] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_310] = "mul ::= subExpr '*'  operand .";
    artLabelStrings[ARTL_ART_mul_310] = "";
    artlhsL[ARTL_ART_mul_310] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_310] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_mul_310] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mul_310] = true;
    arteoR_pL[ARTL_ART_mul_310] = true;
    artPopD[ARTL_ART_mul_310] = true;
  }

  public void artTableInitialiser_ART_ne() {
    artLabelInternalStrings[ARTL_ART_ne] = "ne";
    artLabelStrings[ARTL_ART_ne] = "ne";
    artKindOfs[ARTL_ART_ne] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ne_206] = "ne ::= . relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_206] = "";
    artlhsL[ARTL_ART_ne_206] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_206] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_208] = "ne ::= relExpr . '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_208] = "";
    artlhsL[ARTL_ART_ne_208] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_208] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_ne_208] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ne_208] = true;
    artFolds[ARTL_ART_ne_210] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_ne_209] = "ne ::= relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_209] = "";
    artlhsL[ARTL_ART_ne_209] = ARTL_ART_ne;
    artLabelInternalStrings[ARTL_ART_ne_210] = "ne ::= relExpr '!='  . subExpr ";
    artLabelStrings[ARTL_ART_ne_210] = "";
    artlhsL[ARTL_ART_ne_210] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_210] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_212] = "ne ::= relExpr '!='  subExpr .";
    artLabelStrings[ARTL_ART_ne_212] = "";
    artlhsL[ARTL_ART_ne_212] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_212] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_ne_212] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ne_212] = true;
    arteoR_pL[ARTL_ART_ne_212] = true;
    artPopD[ARTL_ART_ne_212] = true;
  }

  public void artTableInitialiser_ART_neg() {
    artLabelInternalStrings[ARTL_ART_neg] = "neg";
    artLabelStrings[ARTL_ART_neg] = "neg";
    artKindOfs[ARTL_ART_neg] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_neg_320] = "neg ::= . '-'  operand ";
    artLabelStrings[ARTL_ART_neg_320] = "";
    artlhsL[ARTL_ART_neg_320] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_neg_320] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_neg_322] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_neg_321] = "neg ::= '-'  operand ";
    artLabelStrings[ARTL_ART_neg_321] = "";
    artlhsL[ARTL_ART_neg_321] = ARTL_ART_neg;
    artLabelInternalStrings[ARTL_ART_neg_322] = "neg ::= '-'  . operand ";
    artLabelStrings[ARTL_ART_neg_322] = "";
    artlhsL[ARTL_ART_neg_322] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_neg_322] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_neg_322] = true;
    artLabelInternalStrings[ARTL_ART_neg_324] = "neg ::= '-'  operand .";
    artLabelStrings[ARTL_ART_neg_324] = "";
    artlhsL[ARTL_ART_neg_324] = ARTL_ART_neg;
    artSlotInstanceOfs[ARTL_ART_neg_324] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_neg_324] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_neg_324] = true;
    arteoR_pL[ARTL_ART_neg_324] = true;
    artPopD[ARTL_ART_neg_324] = true;
  }

  public void artTableInitialiser_ART_not() {
    artLabelInternalStrings[ARTL_ART_not] = "not";
    artLabelStrings[ARTL_ART_not] = "not";
    artKindOfs[ARTL_ART_not] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_not_246] = "not ::= . '!'  relExpr ";
    artLabelStrings[ARTL_ART_not_246] = "";
    artlhsL[ARTL_ART_not_246] = ARTL_ART_not;
    artKindOfs[ARTL_ART_not_246] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_not_248] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_not_247] = "not ::= '!'  relExpr ";
    artLabelStrings[ARTL_ART_not_247] = "";
    artlhsL[ARTL_ART_not_247] = ARTL_ART_not;
    artLabelInternalStrings[ARTL_ART_not_248] = "not ::= '!'  . relExpr ";
    artLabelStrings[ARTL_ART_not_248] = "";
    artlhsL[ARTL_ART_not_248] = ARTL_ART_not;
    artKindOfs[ARTL_ART_not_248] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_not_248] = true;
    artLabelInternalStrings[ARTL_ART_not_250] = "not ::= '!'  relExpr .";
    artLabelStrings[ARTL_ART_not_250] = "";
    artlhsL[ARTL_ART_not_250] = ARTL_ART_not;
    artSlotInstanceOfs[ARTL_ART_not_250] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_not_250] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_not_250] = true;
    arteoR_pL[ARTL_ART_not_250] = true;
    artPopD[ARTL_ART_not_250] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_334] = "operand ::= . deref ";
    artLabelStrings[ARTL_ART_operand_334] = "";
    artlhsL[ARTL_ART_operand_334] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_334] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_336] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_336] = "operand ::= deref .";
    artLabelStrings[ARTL_ART_operand_336] = "";
    artlhsL[ARTL_ART_operand_336] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_336] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_operand_336] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_336] = true;
    arteoR_pL[ARTL_ART_operand_336] = true;
    artPopD[ARTL_ART_operand_336] = true;
    artLabelInternalStrings[ARTL_ART_operand_338] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_338] = "";
    artlhsL[ARTL_ART_operand_338] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_338] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_340] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_340] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_340] = "";
    artlhsL[ARTL_ART_operand_340] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_340] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_340] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_340] = true;
    arteoR_pL[ARTL_ART_operand_340] = true;
    artPopD[ARTL_ART_operand_340] = true;
    artLabelInternalStrings[ARTL_ART_operand_342] = "operand ::= . REAL ";
    artLabelStrings[ARTL_ART_operand_342] = "";
    artlhsL[ARTL_ART_operand_342] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_342] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_344] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_344] = "operand ::= REAL .";
    artLabelStrings[ARTL_ART_operand_344] = "";
    artlhsL[ARTL_ART_operand_344] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_344] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_operand_344] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_344] = true;
    arteoR_pL[ARTL_ART_operand_344] = true;
    artPopD[ARTL_ART_operand_344] = true;
    artLabelInternalStrings[ARTL_ART_operand_346] = "operand ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_operand_346] = "";
    artlhsL[ARTL_ART_operand_346] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_346] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_348] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_348] = "operand ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_operand_348] = "";
    artlhsL[ARTL_ART_operand_348] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_348] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_operand_348] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_348] = true;
    arteoR_pL[ARTL_ART_operand_348] = true;
    artPopD[ARTL_ART_operand_348] = true;
    artLabelInternalStrings[ARTL_ART_operand_350] = "operand ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_350] = "";
    artlhsL[ARTL_ART_operand_350] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_350] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_352] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_351] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_351] = "";
    artlhsL[ARTL_ART_operand_351] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_352] = "operand ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_352] = "";
    artlhsL[ARTL_ART_operand_352] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_352] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_352] = true;
    artFolds[ARTL_ART_operand_354] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_354] = "operand ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_354] = "";
    artlhsL[ARTL_ART_operand_354] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_354] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_operand_354] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_354] = true;
    artFolds[ARTL_ART_operand_356] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_355] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_355] = "";
    artlhsL[ARTL_ART_operand_355] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_355] = true;
    artLabelInternalStrings[ARTL_ART_operand_356] = "operand ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_356] = "";
    artlhsL[ARTL_ART_operand_356] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_356] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_356] = true;
    arteoR_pL[ARTL_ART_operand_356] = true;
    artPopD[ARTL_ART_operand_356] = true;
  }

  public void artTableInitialiser_ART_or() {
    artLabelInternalStrings[ARTL_ART_or] = "or";
    artLabelStrings[ARTL_ART_or] = "or";
    artKindOfs[ARTL_ART_or] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_or_238] = "or ::= . relExpr '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_238] = "";
    artlhsL[ARTL_ART_or_238] = ARTL_ART_or;
    artKindOfs[ARTL_ART_or_238] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_or_240] = "or ::= relExpr . '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_240] = "";
    artlhsL[ARTL_ART_or_240] = ARTL_ART_or;
    artSlotInstanceOfs[ARTL_ART_or_240] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_or_240] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_or_240] = true;
    artFolds[ARTL_ART_or_242] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_or_241] = "or ::= relExpr '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_241] = "";
    artlhsL[ARTL_ART_or_241] = ARTL_ART_or;
    artLabelInternalStrings[ARTL_ART_or_242] = "or ::= relExpr '||'  . relExpr ";
    artLabelStrings[ARTL_ART_or_242] = "";
    artlhsL[ARTL_ART_or_242] = ARTL_ART_or;
    artKindOfs[ARTL_ART_or_242] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_or_244] = "or ::= relExpr '||'  relExpr .";
    artLabelStrings[ARTL_ART_or_244] = "";
    artlhsL[ARTL_ART_or_244] = ARTL_ART_or;
    artSlotInstanceOfs[ARTL_ART_or_244] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_or_244] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_or_244] = true;
    arteoR_pL[ARTL_ART_or_244] = true;
    artPopD[ARTL_ART_or_244] = true;
  }

  public void artTableInitialiser_ART_paint() {
    artLabelInternalStrings[ARTL_ART_paint] = "paint";
    artLabelStrings[ARTL_ART_paint] = "paint";
    artKindOfs[ARTL_ART_paint] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_paint_152] = "paint ::= . 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_152] = "";
    artlhsL[ARTL_ART_paint_152] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_152] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_152] = true;
    artFolds[ARTL_ART_paint_154] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_153] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_153] = "";
    artlhsL[ARTL_ART_paint_153] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_153] = true;
    artLabelInternalStrings[ARTL_ART_paint_154] = "paint ::= 'paint'  . '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_154] = "";
    artlhsL[ARTL_ART_paint_154] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_154] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_paint_154] = true;
    artPopD[ARTL_ART_paint_154] = true;
    artFolds[ARTL_ART_paint_156] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_155] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_155] = "";
    artlhsL[ARTL_ART_paint_155] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_155] = true;
    artLabelInternalStrings[ARTL_ART_paint_156] = "paint ::= 'paint'  '('  . ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_156] = "";
    artlhsL[ARTL_ART_paint_156] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_156] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_156] = true;
    artFolds[ARTL_ART_paint_158] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_157] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_157] = "";
    artlhsL[ARTL_ART_paint_157] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_157] = true;
    artLabelInternalStrings[ARTL_ART_paint_158] = "paint ::= 'paint'  '('  ')'  . ';'  ";
    artLabelStrings[ARTL_ART_paint_158] = "";
    artlhsL[ARTL_ART_paint_158] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_158] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_158] = true;
    artFolds[ARTL_ART_paint_160] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_159] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_159] = "";
    artlhsL[ARTL_ART_paint_159] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_159] = true;
    artLabelInternalStrings[ARTL_ART_paint_160] = "paint ::= 'paint'  '('  ')'  ';'  .";
    artLabelStrings[ARTL_ART_paint_160] = "";
    artlhsL[ARTL_ART_paint_160] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_160] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_paint_160] = true;
    arteoR_pL[ARTL_ART_paint_160] = true;
    artPopD[ARTL_ART_paint_160] = true;
  }

  public void artTableInitialiser_ART_print() {
    artLabelInternalStrings[ARTL_ART_print] = "print";
    artLabelStrings[ARTL_ART_print] = "print";
    artKindOfs[ARTL_ART_print] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_print_124] = "print ::= . 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_124] = "";
    artlhsL[ARTL_ART_print_124] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_124] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_print_126] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_125] = "print ::= 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_125] = "";
    artlhsL[ARTL_ART_print_125] = ARTL_ART_print;
    artLabelInternalStrings[ARTL_ART_print_126] = "print ::= 'print'  . '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_126] = "";
    artlhsL[ARTL_ART_print_126] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_126] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_print_126] = true;
    artFolds[ARTL_ART_print_128] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_127] = "print ::= 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_127] = "";
    artlhsL[ARTL_ART_print_127] = ARTL_ART_print;
    artLabelInternalStrings[ARTL_ART_print_128] = "print ::= 'print'  '('  . subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_128] = "";
    artlhsL[ARTL_ART_print_128] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_128] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_print_130] = "print ::= 'print'  '('  subExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_130] = "";
    artlhsL[ARTL_ART_print_130] = ARTL_ART_print;
    artSlotInstanceOfs[ARTL_ART_print_130] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_print_130] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_print_130] = true;
    artFolds[ARTL_ART_print_132] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_131] = "print ::= 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_131] = "";
    artlhsL[ARTL_ART_print_131] = ARTL_ART_print;
    artPopD[ARTL_ART_print_131] = true;
    artLabelInternalStrings[ARTL_ART_print_132] = "print ::= 'print'  '('  subExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_print_132] = "";
    artlhsL[ARTL_ART_print_132] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_132] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_print_132] = true;
    artFolds[ARTL_ART_print_134] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_133] = "print ::= 'print'  '('  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_133] = "";
    artlhsL[ARTL_ART_print_133] = ARTL_ART_print;
    artPopD[ARTL_ART_print_133] = true;
    artLabelInternalStrings[ARTL_ART_print_134] = "print ::= 'print'  '('  subExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_print_134] = "";
    artlhsL[ARTL_ART_print_134] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_print_134] = true;
    arteoR_pL[ARTL_ART_print_134] = true;
    artPopD[ARTL_ART_print_134] = true;
  }

  public void artTableInitialiser_ART_relExpr() {
    artLabelInternalStrings[ARTL_ART_relExpr] = "relExpr";
    artLabelStrings[ARTL_ART_relExpr] = "relExpr";
    artKindOfs[ARTL_ART_relExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_relExpr_162] = "relExpr ::= . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_162] = "";
    artlhsL[ARTL_ART_relExpr_162] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_162] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_164] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_164] = "relExpr ::= subExpr .";
    artLabelStrings[ARTL_ART_relExpr_164] = "";
    artlhsL[ARTL_ART_relExpr_164] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_164] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_164] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_164] = true;
    arteoR_pL[ARTL_ART_relExpr_164] = true;
    artPopD[ARTL_ART_relExpr_164] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_166] = "relExpr ::= . gt ";
    artLabelStrings[ARTL_ART_relExpr_166] = "";
    artlhsL[ARTL_ART_relExpr_166] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_166] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_168] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_168] = "relExpr ::= gt .";
    artLabelStrings[ARTL_ART_relExpr_168] = "";
    artlhsL[ARTL_ART_relExpr_168] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_168] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_relExpr_168] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_168] = true;
    arteoR_pL[ARTL_ART_relExpr_168] = true;
    artPopD[ARTL_ART_relExpr_168] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_170] = "relExpr ::= . ne ";
    artLabelStrings[ARTL_ART_relExpr_170] = "";
    artlhsL[ARTL_ART_relExpr_170] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_170] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_172] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_172] = "relExpr ::= ne .";
    artLabelStrings[ARTL_ART_relExpr_172] = "";
    artlhsL[ARTL_ART_relExpr_172] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_172] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_relExpr_172] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_172] = true;
    arteoR_pL[ARTL_ART_relExpr_172] = true;
    artPopD[ARTL_ART_relExpr_172] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_174] = "relExpr ::= . lt ";
    artLabelStrings[ARTL_ART_relExpr_174] = "";
    artlhsL[ARTL_ART_relExpr_174] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_174] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_176] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_176] = "relExpr ::= lt .";
    artLabelStrings[ARTL_ART_relExpr_176] = "";
    artlhsL[ARTL_ART_relExpr_176] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_176] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_relExpr_176] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_176] = true;
    arteoR_pL[ARTL_ART_relExpr_176] = true;
    artPopD[ARTL_ART_relExpr_176] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_178] = "relExpr ::= . eq ";
    artLabelStrings[ARTL_ART_relExpr_178] = "";
    artlhsL[ARTL_ART_relExpr_178] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_178] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_180] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_180] = "relExpr ::= eq .";
    artLabelStrings[ARTL_ART_relExpr_180] = "";
    artlhsL[ARTL_ART_relExpr_180] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_180] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_relExpr_180] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_180] = true;
    arteoR_pL[ARTL_ART_relExpr_180] = true;
    artPopD[ARTL_ART_relExpr_180] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_182] = "relExpr ::= . and ";
    artLabelStrings[ARTL_ART_relExpr_182] = "";
    artlhsL[ARTL_ART_relExpr_182] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_182] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_184] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_184] = "relExpr ::= and .";
    artLabelStrings[ARTL_ART_relExpr_184] = "";
    artlhsL[ARTL_ART_relExpr_184] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_184] = ARTL_ART_and;
    artKindOfs[ARTL_ART_relExpr_184] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_184] = true;
    arteoR_pL[ARTL_ART_relExpr_184] = true;
    artPopD[ARTL_ART_relExpr_184] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_186] = "relExpr ::= . or ";
    artLabelStrings[ARTL_ART_relExpr_186] = "";
    artlhsL[ARTL_ART_relExpr_186] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_186] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_188] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_188] = "relExpr ::= or .";
    artLabelStrings[ARTL_ART_relExpr_188] = "";
    artlhsL[ARTL_ART_relExpr_188] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_188] = ARTL_ART_or;
    artKindOfs[ARTL_ART_relExpr_188] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_188] = true;
    arteoR_pL[ARTL_ART_relExpr_188] = true;
    artPopD[ARTL_ART_relExpr_188] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_190] = "relExpr ::= . not ";
    artLabelStrings[ARTL_ART_relExpr_190] = "";
    artlhsL[ARTL_ART_relExpr_190] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_190] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_192] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_192] = "relExpr ::= not .";
    artLabelStrings[ARTL_ART_relExpr_192] = "";
    artlhsL[ARTL_ART_relExpr_192] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_192] = ARTL_ART_not;
    artKindOfs[ARTL_ART_relExpr_192] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_192] = true;
    arteoR_pL[ARTL_ART_relExpr_192] = true;
    artPopD[ARTL_ART_relExpr_192] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_194] = "relExpr ::= . xor ";
    artLabelStrings[ARTL_ART_relExpr_194] = "";
    artlhsL[ARTL_ART_relExpr_194] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_194] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_196] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_196] = "relExpr ::= xor .";
    artLabelStrings[ARTL_ART_relExpr_196] = "";
    artlhsL[ARTL_ART_relExpr_196] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_196] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_relExpr_196] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_196] = true;
    arteoR_pL[ARTL_ART_relExpr_196] = true;
    artPopD[ARTL_ART_relExpr_196] = true;
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
    artLabelInternalStrings[ARTL_ART_sub_288] = "sub ::= . subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_288] = "";
    artlhsL[ARTL_ART_sub_288] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_288] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_290] = "sub ::= subExpr . '-'  operand ";
    artLabelStrings[ARTL_ART_sub_290] = "";
    artlhsL[ARTL_ART_sub_290] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_290] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_sub_290] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sub_290] = true;
    artFolds[ARTL_ART_sub_292] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sub_291] = "sub ::= subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_291] = "";
    artlhsL[ARTL_ART_sub_291] = ARTL_ART_sub;
    artLabelInternalStrings[ARTL_ART_sub_292] = "sub ::= subExpr '-'  . operand ";
    artLabelStrings[ARTL_ART_sub_292] = "";
    artlhsL[ARTL_ART_sub_292] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_292] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_294] = "sub ::= subExpr '-'  operand .";
    artLabelStrings[ARTL_ART_sub_294] = "";
    artlhsL[ARTL_ART_sub_294] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_294] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_sub_294] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sub_294] = true;
    arteoR_pL[ARTL_ART_sub_294] = true;
    artPopD[ARTL_ART_sub_294] = true;
  }

  public void artTableInitialiser_ART_subExpr() {
    artLabelInternalStrings[ARTL_ART_subExpr] = "subExpr";
    artLabelStrings[ARTL_ART_subExpr] = "subExpr";
    artKindOfs[ARTL_ART_subExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExpr_260] = "subExpr ::= . operand ";
    artLabelStrings[ARTL_ART_subExpr_260] = "";
    artlhsL[ARTL_ART_subExpr_260] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_260] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_262] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_262] = "subExpr ::= operand .";
    artLabelStrings[ARTL_ART_subExpr_262] = "";
    artlhsL[ARTL_ART_subExpr_262] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_262] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_262] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_262] = true;
    arteoR_pL[ARTL_ART_subExpr_262] = true;
    artPopD[ARTL_ART_subExpr_262] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_264] = "subExpr ::= . sub ";
    artLabelStrings[ARTL_ART_subExpr_264] = "";
    artlhsL[ARTL_ART_subExpr_264] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_264] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_266] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_266] = "subExpr ::= sub .";
    artLabelStrings[ARTL_ART_subExpr_266] = "";
    artlhsL[ARTL_ART_subExpr_266] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_266] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_subExpr_266] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_266] = true;
    arteoR_pL[ARTL_ART_subExpr_266] = true;
    artPopD[ARTL_ART_subExpr_266] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_268] = "subExpr ::= . add ";
    artLabelStrings[ARTL_ART_subExpr_268] = "";
    artlhsL[ARTL_ART_subExpr_268] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_268] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_270] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_270] = "subExpr ::= add .";
    artLabelStrings[ARTL_ART_subExpr_270] = "";
    artlhsL[ARTL_ART_subExpr_270] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_270] = ARTL_ART_add;
    artKindOfs[ARTL_ART_subExpr_270] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_270] = true;
    arteoR_pL[ARTL_ART_subExpr_270] = true;
    artPopD[ARTL_ART_subExpr_270] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_272] = "subExpr ::= . mul ";
    artLabelStrings[ARTL_ART_subExpr_272] = "";
    artlhsL[ARTL_ART_subExpr_272] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_272] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_274] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_274] = "subExpr ::= mul .";
    artLabelStrings[ARTL_ART_subExpr_274] = "";
    artlhsL[ARTL_ART_subExpr_274] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_274] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_subExpr_274] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_274] = true;
    arteoR_pL[ARTL_ART_subExpr_274] = true;
    artPopD[ARTL_ART_subExpr_274] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_276] = "subExpr ::= . div ";
    artLabelStrings[ARTL_ART_subExpr_276] = "";
    artlhsL[ARTL_ART_subExpr_276] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_276] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_278] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_278] = "subExpr ::= div .";
    artLabelStrings[ARTL_ART_subExpr_278] = "";
    artlhsL[ARTL_ART_subExpr_278] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_278] = ARTL_ART_div;
    artKindOfs[ARTL_ART_subExpr_278] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_278] = true;
    arteoR_pL[ARTL_ART_subExpr_278] = true;
    artPopD[ARTL_ART_subExpr_278] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_280] = "subExpr ::= . neg ";
    artLabelStrings[ARTL_ART_subExpr_280] = "";
    artlhsL[ARTL_ART_subExpr_280] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_280] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_282] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_282] = "subExpr ::= neg .";
    artLabelStrings[ARTL_ART_subExpr_282] = "";
    artlhsL[ARTL_ART_subExpr_282] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_282] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_subExpr_282] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_282] = true;
    arteoR_pL[ARTL_ART_subExpr_282] = true;
    artPopD[ARTL_ART_subExpr_282] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_284] = "subExpr ::= . exp ";
    artLabelStrings[ARTL_ART_subExpr_284] = "";
    artlhsL[ARTL_ART_subExpr_284] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_284] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_286] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_286] = "subExpr ::= exp .";
    artLabelStrings[ARTL_ART_subExpr_286] = "";
    artlhsL[ARTL_ART_subExpr_286] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_286] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_subExpr_286] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_286] = true;
    arteoR_pL[ARTL_ART_subExpr_286] = true;
    artPopD[ARTL_ART_subExpr_286] = true;
  }

  public void artTableInitialiser_ART_while() {
    artLabelInternalStrings[ARTL_ART_while] = "while";
    artLabelStrings[ARTL_ART_while] = "while";
    artKindOfs[ARTL_ART_while] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_while_90] = "while ::= . 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_90] = "";
    artlhsL[ARTL_ART_while_90] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_90] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_92] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_91] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_91] = "";
    artlhsL[ARTL_ART_while_91] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_92] = "while ::= 'while'  . '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_92] = "";
    artlhsL[ARTL_ART_while_92] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_92] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_while_92] = true;
    artFolds[ARTL_ART_while_94] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_93] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_93] = "";
    artlhsL[ARTL_ART_while_93] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_94] = "while ::= 'while'  '('  . relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_94] = "";
    artlhsL[ARTL_ART_while_94] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_94] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_while_96] = "while ::= 'while'  '('  relExpr . ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_96] = "";
    artlhsL[ARTL_ART_while_96] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_96] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_while_96] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_98] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_97] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_97] = "";
    artlhsL[ARTL_ART_while_97] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_98] = "while ::= 'while'  '('  relExpr ')'  . '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_98] = "";
    artlhsL[ARTL_ART_while_98] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_98] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_100] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_99] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_99] = "";
    artlhsL[ARTL_ART_while_99] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_100] = "while ::= 'while'  '('  relExpr ')'  '{'  . statement '}'  ";
    artLabelStrings[ARTL_ART_while_100] = "";
    artlhsL[ARTL_ART_while_100] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_100] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_while_102] = "while ::= 'while'  '('  relExpr ')'  '{'  statement . '}'  ";
    artLabelStrings[ARTL_ART_while_102] = "";
    artlhsL[ARTL_ART_while_102] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_102] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_while_102] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_while_102] = true;
    artFolds[ARTL_ART_while_104] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_103] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_103] = "";
    artlhsL[ARTL_ART_while_103] = ARTL_ART_while;
    artPopD[ARTL_ART_while_103] = true;
    artLabelInternalStrings[ARTL_ART_while_104] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  .";
    artLabelStrings[ARTL_ART_while_104] = "";
    artlhsL[ARTL_ART_while_104] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_104] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_while_104] = true;
    arteoR_pL[ARTL_ART_while_104] = true;
    artPopD[ARTL_ART_while_104] = true;
  }

  public void artTableInitialiser_ART_xor() {
    artLabelInternalStrings[ARTL_ART_xor] = "xor";
    artLabelStrings[ARTL_ART_xor] = "xor";
    artKindOfs[ARTL_ART_xor] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_xor_252] = "xor ::= . relExpr '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_252] = "";
    artlhsL[ARTL_ART_xor_252] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_xor_252] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_xor_254] = "xor ::= relExpr . '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_254] = "";
    artlhsL[ARTL_ART_xor_254] = ARTL_ART_xor;
    artSlotInstanceOfs[ARTL_ART_xor_254] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_xor_254] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_xor_254] = true;
    artFolds[ARTL_ART_xor_256] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_xor_255] = "xor ::= relExpr '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_255] = "";
    artlhsL[ARTL_ART_xor_255] = ARTL_ART_xor;
    artLabelInternalStrings[ARTL_ART_xor_256] = "xor ::= relExpr '^'  . relExpr ";
    artLabelStrings[ARTL_ART_xor_256] = "";
    artlhsL[ARTL_ART_xor_256] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_xor_256] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_xor_258] = "xor ::= relExpr '^'  relExpr .";
    artLabelStrings[ARTL_ART_xor_258] = "";
    artlhsL[ARTL_ART_xor_258] = ARTL_ART_xor;
    artSlotInstanceOfs[ARTL_ART_xor_258] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_xor_258] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_xor_258] = true;
    arteoR_pL[ARTL_ART_xor_258] = true;
    artPopD[ARTL_ART_xor_258] = true;
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
    artLabelStrings[ARTTS__SHREIK] = "!";
    artLabelInternalStrings[ARTTS__SHREIK] = "'!'";
    artKindOfs[ARTTS__SHREIK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK] = true;
    artLabelStrings[ARTTS__SHREIK_EQUAL] = "!=";
    artLabelInternalStrings[ARTTS__SHREIK_EQUAL] = "'!='";
    artKindOfs[ARTTS__SHREIK_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK_EQUAL] = true;
    artLabelStrings[ARTTS__AMPERSAND_AMPERSAND] = "&&";
    artLabelInternalStrings[ARTTS__AMPERSAND_AMPERSAND] = "'&&'";
    artKindOfs[ARTTS__AMPERSAND_AMPERSAND] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__AMPERSAND_AMPERSAND] = true;
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
    artLabelStrings[ARTTS__UPARROW] = "^";
    artLabelInternalStrings[ARTTS__UPARROW] = "'^'";
    artKindOfs[ARTTS__UPARROW] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__UPARROW] = true;
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
    artLabelStrings[ARTTS__LBRACE] = "{";
    artLabelInternalStrings[ARTTS__LBRACE] = "'{'";
    artKindOfs[ARTTS__LBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACE] = true;
    artLabelStrings[ARTTS__BAR_BAR] = "||";
    artLabelInternalStrings[ARTTS__BAR_BAR] = "'||'";
    artKindOfs[ARTTS__BAR_BAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__BAR_BAR] = true;
    artLabelStrings[ARTTS__RBRACE] = "}";
    artLabelInternalStrings[ARTTS__RBRACE] = "'}'";
    artKindOfs[ARTTS__RBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACE] = true;
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_REAL();
    artTableInitialiser_ART_STRING_DQ();
    artTableInitialiser_ART_add();
    artTableInitialiser_ART_and();
    artTableInitialiser_ART_assign();
    artTableInitialiser_ART_backend();
    artTableInitialiser_ART_deref();
    artTableInitialiser_ART_div();
    artTableInitialiser_ART_eq();
    artTableInitialiser_ART_exp();
    artTableInitialiser_ART_gt();
    artTableInitialiser_ART_if();
    artTableInitialiser_ART_init();
    artTableInitialiser_ART_lt();
    artTableInitialiser_ART_mul();
    artTableInitialiser_ART_ne();
    artTableInitialiser_ART_neg();
    artTableInitialiser_ART_not();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_or();
    artTableInitialiser_ART_paint();
    artTableInitialiser_ART_print();
    artTableInitialiser_ART_relExpr();
    artTableInitialiser_ART_seq();
    artTableInitialiser_ART_statement();
    artTableInitialiser_ART_sub();
    artTableInitialiser_ART_subExpr();
    artTableInitialiser_ART_while();
    artTableInitialiser_ART_xor();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__SHREIK;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 65;
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
      case ARTL_ART_ID_364: 
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
    case ARTL_ART_INTEGER_370: 
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
    case ARTL_ART_REAL_376: 
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
    case ARTL_ART_STRING_DQ_382: 
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
    case ARTL_ART_add_300: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*add ::= subExpr '+'  operand .*/
    case ARTL_ART_add_302: 
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

public void ARTRD_and(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*and ::= relExpr '&&'  . relExpr */
    case ARTL_ART_and_234: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*and ::= relExpr '&&'  relExpr .*/
    case ARTL_ART_and_236: 
            ARTRD_and(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_and: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_assign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*assign ::= ID '='  . relExpr ';'  */
    case ARTL_ART_assign_44: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                        break;
    /*assign ::= ID '='  relExpr . ';'  */
    case ARTL_ART_assign_46: 
      ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*assign ::= ID '='  relExpr ';'  .*/
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
    case ARTL_ART_backend_110: 
                              break;
    /*backend ::= 'backend'  '('  subExpr . ','  subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_112: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  . subExpr ','  subExpr ')'  */
    case ARTL_ART_backend_114: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr . ','  subExpr ')'  */
    case ARTL_ART_backend_116: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  . subExpr ')'  */
    case ARTL_ART_backend_118: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr . ')'  */
    case ARTL_ART_backend_120: 
      ARTRD_backend(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*backend ::= 'backend'  '('  subExpr ','  subExpr ','  subExpr ')'  .*/
    case ARTL_ART_backend_122: 
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
    case ARTL_ART_deref_360: 
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
    case ARTL_ART_div_316: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*div ::= subExpr '/'  operand .*/
    case ARTL_ART_div_318: 
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
    case ARTL_ART_eq_226: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*eq ::= relExpr '=='  subExpr .*/
    case ARTL_ART_eq_228: 
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

public void ARTRD_exp(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*exp ::= subExpr '**'  . operand */
    case ARTL_ART_exp_330: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*exp ::= subExpr '**'  operand .*/
    case ARTL_ART_exp_332: 
            ARTRD_exp(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
        default:
          throw new ARTException("ARTRD_exp: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_gt_202: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*gt ::= relExpr '>'  subExpr .*/
    case ARTL_ART_gt_204: 
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
    /*if ::= 'if'  '('  . relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_54: 
                              break;
    /*if ::= 'if'  '('  relExpr . ')'  '{'  statement '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_56: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  . '{'  statement '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_58: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  . statement '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_60: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement . '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_62: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  . 'else'  '{'  statement '}'  */
    case ARTL_ART_if_64: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  . '{'  statement '}'  */
    case ARTL_ART_if_66: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  . statement '}'  */
    case ARTL_ART_if_68: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement . '}'  */
    case ARTL_ART_if_70: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  .*/
    case ARTL_ART_if_72: 
            ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  . relExpr ')'  '{'  statement '}'  */
    case ARTL_ART_if_78: 
                              break;
    /*if ::= 'if'  '('  relExpr . ')'  '{'  statement '}'  */
    case ARTL_ART_if_80: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  . '{'  statement '}'  */
    case ARTL_ART_if_82: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  . statement '}'  */
    case ARTL_ART_if_84: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement . '}'  */
    case ARTL_ART_if_86: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  .*/
    case ARTL_ART_if_88: 
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
    case ARTL_ART_init_140: 
                              break;
    /*init ::= 'init'  '('  INTEGER . ','  INTEGER ')'  ';'  */
    case ARTL_ART_init_142: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*init ::= 'init'  '('  INTEGER ','  . INTEGER ')'  ';'  */
    case ARTL_ART_init_144: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER . ')'  ';'  */
    case ARTL_ART_init_146: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
      INTEGER2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER2));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER2);
            break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER ')'  . ';'  */
    case ARTL_ART_init_148: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  .*/
    case ARTL_ART_init_150: 
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
    case ARTL_ART_lt_218: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*lt ::= relExpr '<'  subExpr .*/
    case ARTL_ART_lt_220: 
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
    case ARTL_ART_mul_308: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*mul ::= subExpr '*'  operand .*/
    case ARTL_ART_mul_310: 
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
    case ARTL_ART_ne_210: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ne ::= relExpr '!='  subExpr .*/
    case ARTL_ART_ne_212: 
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

public void ARTRD_neg(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*neg ::= '-'  operand .*/
    case ARTL_ART_neg_324: 
                        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
        default:
          throw new ARTException("ARTRD_neg: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_not(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*not ::= '!'  relExpr .*/
    case ARTL_ART_not_250: 
                        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_not: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_operand_336: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_340: 
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
    case ARTL_ART_operand_344: 
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
    case ARTL_ART_operand_348: 
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
    case ARTL_ART_operand_354: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*operand ::= '('  subExpr ')'  .*/
    case ARTL_ART_operand_356: 
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

public void ARTRD_or(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*or ::= relExpr '||'  . relExpr */
    case ARTL_ART_or_242: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*or ::= relExpr '||'  relExpr .*/
    case ARTL_ART_or_244: 
            ARTRD_or(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_or: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_paint_156: 
                              break;
    /*paint ::= 'paint'  '('  ')'  . ';'  */
    case ARTL_ART_paint_158: 
      ARTRD_paint(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*paint ::= 'paint'  '('  ')'  ';'  .*/
    case ARTL_ART_paint_160: 
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
    case ARTL_ART_print_128: 
                              break;
    /*print ::= 'print'  '('  subExpr . ')'  ';'  */
    case ARTL_ART_print_130: 
      ARTRD_print(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*print ::= 'print'  '('  subExpr ')'  . ';'  */
    case ARTL_ART_print_132: 
      ARTRD_print(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*print ::= 'print'  '('  subExpr ')'  ';'  .*/
    case ARTL_ART_print_134: 
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
    case ARTL_ART_relExpr_164: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= gt .*/
    case ARTL_ART_relExpr_168: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_gt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= ne .*/
    case ARTL_ART_relExpr_172: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ne(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= lt .*/
    case ARTL_ART_relExpr_176: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_lt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= eq .*/
    case ARTL_ART_relExpr_180: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_eq(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= and .*/
    case ARTL_ART_relExpr_184: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_and(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= or .*/
    case ARTL_ART_relExpr_188: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_or(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= not .*/
    case ARTL_ART_relExpr_192: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_not(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= xor .*/
    case ARTL_ART_relExpr_196: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_xor(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
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
    case ARTL_ART_sub_292: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*sub ::= subExpr '-'  operand .*/
    case ARTL_ART_sub_294: 
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
    case ARTL_ART_subExpr_262: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*subExpr ::= sub .*/
    case ARTL_ART_subExpr_266: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sub(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= add .*/
    case ARTL_ART_subExpr_270: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_add(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= mul .*/
    case ARTL_ART_subExpr_274: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_mul(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= div .*/
    case ARTL_ART_subExpr_278: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_div(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= neg .*/
    case ARTL_ART_subExpr_282: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_neg(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= exp .*/
    case ARTL_ART_subExpr_286: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_exp(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
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
    /*while ::= 'while'  '('  . relExpr ')'  '{'  statement '}'  */
    case ARTL_ART_while_94: 
                              break;
    /*while ::= 'while'  '('  relExpr . ')'  '{'  statement '}'  */
    case ARTL_ART_while_96: 
      ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*while ::= 'while'  '('  relExpr ')'  . '{'  statement '}'  */
    case ARTL_ART_while_98: 
      ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*while ::= 'while'  '('  relExpr ')'  '{'  . statement '}'  */
    case ARTL_ART_while_100: 
      ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*while ::= 'while'  '('  relExpr ')'  '{'  statement . '}'  */
    case ARTL_ART_while_102: 
      ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  .*/
    case ARTL_ART_while_104: 
            ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_while: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_xor(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*xor ::= relExpr '^'  . relExpr */
    case ARTL_ART_xor_256: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*xor ::= relExpr '^'  relExpr .*/
    case ARTL_ART_xor_258: 
            ARTRD_xor(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_xor: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_and: ARTRD_and(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_assign: ARTRD_assign(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_backend: ARTRD_backend(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_deref: ARTRD_deref(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_div: ARTRD_div(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_eq: ARTRD_eq(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_exp: ARTRD_exp(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_gt: ARTRD_gt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_if: ARTRD_if(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_init: ARTRD_init(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_lt: ARTRD_lt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_mul: ARTRD_mul(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ne: ARTRD_ne(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_neg: ARTRD_neg(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_not: ARTRD_not(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_operand: ARTRD_operand(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_or: ARTRD_or(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_paint: ARTRD_paint(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_print: ARTRD_print(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_relExpr: ARTRD_relExpr(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_seq: ARTRD_seq(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_statement: ARTRD_statement(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_sub: ARTRD_sub(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_subExpr: ARTRD_subExpr(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_while: ARTRD_while(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_xor: ARTRD_xor(artElement.element, artParent, artWriteable); break;
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
