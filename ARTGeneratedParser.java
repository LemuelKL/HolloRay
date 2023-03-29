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
  private static boolean[] ARTSet57;
  private static boolean[] ARTSet58;
  private static boolean[] ARTSet59;
  private static boolean[] ARTSet60;
  private static boolean[] ARTSet61;
  private static boolean[] ARTSet62;
  private static boolean[] ARTSet63;
  private static boolean[] ARTSet64;
  private static boolean[] ARTSet65;
  private static boolean[] ARTSet66;
  private static boolean[] ARTSet67;
  private static boolean[] ARTSet68;
  private static boolean[] ARTSet69;
  private static boolean[] ARTSet70;
  private static boolean[] ARTSet71;
  private static boolean[] ARTSet72;
  private static boolean[] ARTSet73;
  private static boolean[] ARTSet74;
  private static boolean[] ARTSet75;
  private static boolean[] ARTSet76;
  private static boolean[] ARTSet77;
  private static boolean[] ARTSet78;
  private static boolean[] ARTSet79;
  private static boolean[] ARTSet80;
  private static boolean[] ARTSet81;
  private static boolean[] ARTSet82;
  private static boolean[] ARTSet83;
  private static boolean[] ARTSet84;
  private static boolean[] ARTSet85;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_REAL = 3;
  public static final int ARTTB_SIMPLE_WHITESPACE = 4;
  public static final int ARTTB_STRING_DQ = 5;
  public static final int ARTTS__SHREIK = 6;
  public static final int ARTTS__SHREIK_EQUAL = 7;
  public static final int ARTTS__PERCENT = 8;
  public static final int ARTTS__AMPERSAND_AMPERSAND = 9;
  public static final int ARTTS__LPAR = 10;
  public static final int ARTTS__RPAR = 11;
  public static final int ARTTS__STAR = 12;
  public static final int ARTTS__STAR_STAR = 13;
  public static final int ARTTS__PLUS = 14;
  public static final int ARTTS__PLUS_EQUAL = 15;
  public static final int ARTTS__COMMA = 16;
  public static final int ARTTS__MINUS = 17;
  public static final int ARTTS__PERIODrotate = 18;
  public static final int ARTTS__PERIODscale = 19;
  public static final int ARTTS__PERIODtranslate = 20;
  public static final int ARTTS__SLASH = 21;
  public static final int ARTTS__SEMICOLON = 22;
  public static final int ARTTS__LT = 23;
  public static final int ARTTS__LT_EQUAL = 24;
  public static final int ARTTS__EQUAL = 25;
  public static final int ARTTS__EQUAL_EQUAL = 26;
  public static final int ARTTS__GT = 27;
  public static final int ARTTS__GT_EQUAL = 28;
  public static final int ARTTS_BOX = 29;
  public static final int ARTTS_CONE = 30;
  public static final int ARTTS_CUBE = 31;
  public static final int ARTTS_CYLINDER = 32;
  public static final int ARTTS_PYRAMID = 33;
  public static final int ARTTS_SPHERE = 34;
  public static final int ARTTS_TETRAHEDRON = 35;
  public static final int ARTTS_TORUS = 36;
  public static final int ARTTS__UPARROW = 37;
  public static final int ARTTS_else = 38;
  public static final int ARTTS_for = 39;
  public static final int ARTTS_if = 40;
  public static final int ARTTS_init = 41;
  public static final int ARTTS_paint = 42;
  public static final int ARTTS_println = 43;
  public static final int ARTTS_while = 44;
  public static final int ARTTS__LBRACE = 45;
  public static final int ARTTS__BAR_BAR = 46;
  public static final int ARTTS__RBRACE = 47;
  public static final int ARTX_EPSILON = 48;
  public static final int ARTL_ART_ID = 49;
  public static final int ARTL_ART_INTEGER = 50;
  public static final int ARTL_ART_REAL = 51;
  public static final int ARTL_ART_STRING_DQ = 52;
  public static final int ARTL_ART_add = 53;
  public static final int ARTL_ART_and = 54;
  public static final int ARTL_ART_assign = 55;
  public static final int ARTL_ART_box = 56;
  public static final int ARTL_ART_compassign = 57;
  public static final int ARTL_ART_cone = 58;
  public static final int ARTL_ART_cube = 59;
  public static final int ARTL_ART_cylinder = 60;
  public static final int ARTL_ART_deref = 61;
  public static final int ARTL_ART_div = 62;
  public static final int ARTL_ART_eq = 63;
  public static final int ARTL_ART_exp = 64;
  public static final int ARTL_ART_for = 65;
  public static final int ARTL_ART_ge = 66;
  public static final int ARTL_ART_gt = 67;
  public static final int ARTL_ART_if = 68;
  public static final int ARTL_ART_init = 69;
  public static final int ARTL_ART_le = 70;
  public static final int ARTL_ART_lt = 71;
  public static final int ARTL_ART_mod = 72;
  public static final int ARTL_ART_mul = 73;
  public static final int ARTL_ART_ne = 74;
  public static final int ARTL_ART_neg = 75;
  public static final int ARTL_ART_not = 76;
  public static final int ARTL_ART_operand = 77;
  public static final int ARTL_ART_or = 78;
  public static final int ARTL_ART_paint = 79;
  public static final int ARTL_ART_println = 80;
  public static final int ARTL_ART_printlnElem = 81;
  public static final int ARTL_ART_pyramid = 82;
  public static final int ARTL_ART_relExpr = 83;
  public static final int ARTL_ART_rotate = 84;
  public static final int ARTL_ART_scale = 85;
  public static final int ARTL_ART_seq = 86;
  public static final int ARTL_ART_sphere = 87;
  public static final int ARTL_ART_statement = 88;
  public static final int ARTL_ART_sub = 89;
  public static final int ARTL_ART_subExpr = 90;
  public static final int ARTL_ART_tetrahedron = 91;
  public static final int ARTL_ART_torus = 92;
  public static final int ARTL_ART_translate = 93;
  public static final int ARTL_ART_while = 94;
  public static final int ARTL_ART_xor = 95;
  public static final int ARTL_ART_ID_657 = 96;
  public static final int ARTL_ART_ID_658 = 97;
  public static final int ARTL_ART_ID_659 = 98;
  public static final int ARTL_ART_ID_660 = 99;
  public static final int ARTL_ART_INTEGER_663 = 100;
  public static final int ARTL_ART_INTEGER_664 = 101;
  public static final int ARTL_ART_INTEGER_665 = 102;
  public static final int ARTL_ART_INTEGER_666 = 103;
  public static final int ARTL_ART_REAL_669 = 104;
  public static final int ARTL_ART_REAL_670 = 105;
  public static final int ARTL_ART_REAL_671 = 106;
  public static final int ARTL_ART_REAL_672 = 107;
  public static final int ARTL_ART_STRING_DQ_675 = 108;
  public static final int ARTL_ART_STRING_DQ_676 = 109;
  public static final int ARTL_ART_STRING_DQ_677 = 110;
  public static final int ARTL_ART_STRING_DQ_678 = 111;
  public static final int ARTL_ART_add_447 = 112;
  public static final int ARTL_ART_add_448 = 113;
  public static final int ARTL_ART_add_449 = 114;
  public static final int ARTL_ART_add_450 = 115;
  public static final int ARTL_ART_add_451 = 116;
  public static final int ARTL_ART_add_452 = 117;
  public static final int ARTL_ART_add_453 = 118;
  public static final int ARTL_ART_add_454 = 119;
  public static final int ARTL_ART_and_369 = 120;
  public static final int ARTL_ART_and_370 = 121;
  public static final int ARTL_ART_and_371 = 122;
  public static final int ARTL_ART_and_372 = 123;
  public static final int ARTL_ART_and_373 = 124;
  public static final int ARTL_ART_and_374 = 125;
  public static final int ARTL_ART_and_375 = 126;
  public static final int ARTL_ART_and_376 = 127;
  public static final int ARTL_ART_assign_55 = 128;
  public static final int ARTL_ART_assign_56 = 129;
  public static final int ARTL_ART_assign_57 = 130;
  public static final int ARTL_ART_assign_58 = 131;
  public static final int ARTL_ART_assign_59 = 132;
  public static final int ARTL_ART_assign_60 = 133;
  public static final int ARTL_ART_assign_61 = 134;
  public static final int ARTL_ART_assign_62 = 135;
  public static final int ARTL_ART_assign_63 = 136;
  public static final int ARTL_ART_assign_64 = 137;
  public static final int ARTL_ART_box_553 = 138;
  public static final int ARTL_ART_box_554 = 139;
  public static final int ARTL_ART_box_555 = 140;
  public static final int ARTL_ART_box_556 = 141;
  public static final int ARTL_ART_box_557 = 142;
  public static final int ARTL_ART_box_558 = 143;
  public static final int ARTL_ART_box_559 = 144;
  public static final int ARTL_ART_box_560 = 145;
  public static final int ARTL_ART_box_561 = 146;
  public static final int ARTL_ART_box_562 = 147;
  public static final int ARTL_ART_box_563 = 148;
  public static final int ARTL_ART_box_564 = 149;
  public static final int ARTL_ART_box_565 = 150;
  public static final int ARTL_ART_box_566 = 151;
  public static final int ARTL_ART_box_567 = 152;
  public static final int ARTL_ART_box_568 = 153;
  public static final int ARTL_ART_box_569 = 154;
  public static final int ARTL_ART_box_570 = 155;
  public static final int ARTL_ART_compassign_65 = 156;
  public static final int ARTL_ART_compassign_66 = 157;
  public static final int ARTL_ART_compassign_67 = 158;
  public static final int ARTL_ART_compassign_68 = 159;
  public static final int ARTL_ART_compassign_69 = 160;
  public static final int ARTL_ART_compassign_70 = 161;
  public static final int ARTL_ART_compassign_71 = 162;
  public static final int ARTL_ART_compassign_72 = 163;
  public static final int ARTL_ART_compassign_73 = 164;
  public static final int ARTL_ART_compassign_74 = 165;
  public static final int ARTL_ART_cone_605 = 166;
  public static final int ARTL_ART_cone_606 = 167;
  public static final int ARTL_ART_cone_607 = 168;
  public static final int ARTL_ART_cone_608 = 169;
  public static final int ARTL_ART_cone_609 = 170;
  public static final int ARTL_ART_cone_610 = 171;
  public static final int ARTL_ART_cone_611 = 172;
  public static final int ARTL_ART_cone_612 = 173;
  public static final int ARTL_ART_cone_613 = 174;
  public static final int ARTL_ART_cone_614 = 175;
  public static final int ARTL_ART_cone_615 = 176;
  public static final int ARTL_ART_cone_616 = 177;
  public static final int ARTL_ART_cone_617 = 178;
  public static final int ARTL_ART_cone_618 = 179;
  public static final int ARTL_ART_cube_571 = 180;
  public static final int ARTL_ART_cube_572 = 181;
  public static final int ARTL_ART_cube_573 = 182;
  public static final int ARTL_ART_cube_574 = 183;
  public static final int ARTL_ART_cube_575 = 184;
  public static final int ARTL_ART_cube_576 = 185;
  public static final int ARTL_ART_cube_577 = 186;
  public static final int ARTL_ART_cube_578 = 187;
  public static final int ARTL_ART_cube_579 = 188;
  public static final int ARTL_ART_cube_580 = 189;
  public static final int ARTL_ART_cylinder_591 = 190;
  public static final int ARTL_ART_cylinder_592 = 191;
  public static final int ARTL_ART_cylinder_593 = 192;
  public static final int ARTL_ART_cylinder_594 = 193;
  public static final int ARTL_ART_cylinder_595 = 194;
  public static final int ARTL_ART_cylinder_596 = 195;
  public static final int ARTL_ART_cylinder_597 = 196;
  public static final int ARTL_ART_cylinder_598 = 197;
  public static final int ARTL_ART_cylinder_599 = 198;
  public static final int ARTL_ART_cylinder_600 = 199;
  public static final int ARTL_ART_cylinder_601 = 200;
  public static final int ARTL_ART_cylinder_602 = 201;
  public static final int ARTL_ART_cylinder_603 = 202;
  public static final int ARTL_ART_cylinder_604 = 203;
  public static final int ARTL_ART_deref_549 = 204;
  public static final int ARTL_ART_deref_550 = 205;
  public static final int ARTL_ART_deref_551 = 206;
  public static final int ARTL_ART_deref_552 = 207;
  public static final int ARTL_ART_div_463 = 208;
  public static final int ARTL_ART_div_464 = 209;
  public static final int ARTL_ART_div_465 = 210;
  public static final int ARTL_ART_div_466 = 211;
  public static final int ARTL_ART_div_467 = 212;
  public static final int ARTL_ART_div_468 = 213;
  public static final int ARTL_ART_div_469 = 214;
  public static final int ARTL_ART_div_470 = 215;
  public static final int ARTL_ART_eq_321 = 216;
  public static final int ARTL_ART_eq_322 = 217;
  public static final int ARTL_ART_eq_323 = 218;
  public static final int ARTL_ART_eq_324 = 219;
  public static final int ARTL_ART_eq_325 = 220;
  public static final int ARTL_ART_eq_326 = 221;
  public static final int ARTL_ART_eq_327 = 222;
  public static final int ARTL_ART_eq_328 = 223;
  public static final int ARTL_ART_exp_485 = 224;
  public static final int ARTL_ART_exp_486 = 225;
  public static final int ARTL_ART_exp_487 = 226;
  public static final int ARTL_ART_exp_488 = 227;
  public static final int ARTL_ART_exp_489 = 228;
  public static final int ARTL_ART_exp_490 = 229;
  public static final int ARTL_ART_exp_491 = 230;
  public static final int ARTL_ART_exp_492 = 231;
  public static final int ARTL_ART_for_131 = 232;
  public static final int ARTL_ART_for_132 = 233;
  public static final int ARTL_ART_for_133 = 234;
  public static final int ARTL_ART_for_134 = 235;
  public static final int ARTL_ART_for_135 = 236;
  public static final int ARTL_ART_for_136 = 237;
  public static final int ARTL_ART_for_137 = 238;
  public static final int ARTL_ART_for_138 = 239;
  public static final int ARTL_ART_for_139 = 240;
  public static final int ARTL_ART_for_140 = 241;
  public static final int ARTL_ART_for_141 = 242;
  public static final int ARTL_ART_for_142 = 243;
  public static final int ARTL_ART_for_143 = 244;
  public static final int ARTL_ART_for_144 = 245;
  public static final int ARTL_ART_for_145 = 246;
  public static final int ARTL_ART_for_146 = 247;
  public static final int ARTL_ART_for_147 = 248;
  public static final int ARTL_ART_for_148 = 249;
  public static final int ARTL_ART_for_149 = 250;
  public static final int ARTL_ART_for_150 = 251;
  public static final int ARTL_ART_for_151 = 252;
  public static final int ARTL_ART_for_152 = 253;
  public static final int ARTL_ART_ge_345 = 254;
  public static final int ARTL_ART_ge_346 = 255;
  public static final int ARTL_ART_ge_347 = 256;
  public static final int ARTL_ART_ge_348 = 257;
  public static final int ARTL_ART_ge_349 = 258;
  public static final int ARTL_ART_ge_350 = 259;
  public static final int ARTL_ART_ge_351 = 260;
  public static final int ARTL_ART_ge_352 = 261;
  public static final int ARTL_ART_gt_337 = 262;
  public static final int ARTL_ART_gt_338 = 263;
  public static final int ARTL_ART_gt_339 = 264;
  public static final int ARTL_ART_gt_340 = 265;
  public static final int ARTL_ART_gt_341 = 266;
  public static final int ARTL_ART_gt_342 = 267;
  public static final int ARTL_ART_gt_343 = 268;
  public static final int ARTL_ART_gt_344 = 269;
  public static final int ARTL_ART_if_75 = 270;
  public static final int ARTL_ART_if_76 = 271;
  public static final int ARTL_ART_if_77 = 272;
  public static final int ARTL_ART_if_78 = 273;
  public static final int ARTL_ART_if_79 = 274;
  public static final int ARTL_ART_if_80 = 275;
  public static final int ARTL_ART_if_81 = 276;
  public static final int ARTL_ART_if_82 = 277;
  public static final int ARTL_ART_if_83 = 278;
  public static final int ARTL_ART_if_84 = 279;
  public static final int ARTL_ART_if_85 = 280;
  public static final int ARTL_ART_if_86 = 281;
  public static final int ARTL_ART_if_87 = 282;
  public static final int ARTL_ART_if_88 = 283;
  public static final int ARTL_ART_if_89 = 284;
  public static final int ARTL_ART_if_90 = 285;
  public static final int ARTL_ART_if_91 = 286;
  public static final int ARTL_ART_if_92 = 287;
  public static final int ARTL_ART_if_93 = 288;
  public static final int ARTL_ART_if_94 = 289;
  public static final int ARTL_ART_if_95 = 290;
  public static final int ARTL_ART_if_96 = 291;
  public static final int ARTL_ART_if_97 = 292;
  public static final int ARTL_ART_if_98 = 293;
  public static final int ARTL_ART_if_99 = 294;
  public static final int ARTL_ART_if_100 = 295;
  public static final int ARTL_ART_if_101 = 296;
  public static final int ARTL_ART_if_102 = 297;
  public static final int ARTL_ART_if_103 = 298;
  public static final int ARTL_ART_if_104 = 299;
  public static final int ARTL_ART_if_105 = 300;
  public static final int ARTL_ART_if_106 = 301;
  public static final int ARTL_ART_if_107 = 302;
  public static final int ARTL_ART_if_108 = 303;
  public static final int ARTL_ART_if_109 = 304;
  public static final int ARTL_ART_if_110 = 305;
  public static final int ARTL_ART_if_111 = 306;
  public static final int ARTL_ART_if_112 = 307;
  public static final int ARTL_ART_if_113 = 308;
  public static final int ARTL_ART_if_114 = 309;
  public static final int ARTL_ART_init_177 = 310;
  public static final int ARTL_ART_init_178 = 311;
  public static final int ARTL_ART_init_179 = 312;
  public static final int ARTL_ART_init_180 = 313;
  public static final int ARTL_ART_init_181 = 314;
  public static final int ARTL_ART_init_182 = 315;
  public static final int ARTL_ART_init_183 = 316;
  public static final int ARTL_ART_init_184 = 317;
  public static final int ARTL_ART_init_185 = 318;
  public static final int ARTL_ART_init_186 = 319;
  public static final int ARTL_ART_init_187 = 320;
  public static final int ARTL_ART_init_188 = 321;
  public static final int ARTL_ART_init_189 = 322;
  public static final int ARTL_ART_init_190 = 323;
  public static final int ARTL_ART_init_191 = 324;
  public static final int ARTL_ART_init_192 = 325;
  public static final int ARTL_ART_le_361 = 326;
  public static final int ARTL_ART_le_362 = 327;
  public static final int ARTL_ART_le_363 = 328;
  public static final int ARTL_ART_le_364 = 329;
  public static final int ARTL_ART_le_365 = 330;
  public static final int ARTL_ART_le_366 = 331;
  public static final int ARTL_ART_le_367 = 332;
  public static final int ARTL_ART_le_368 = 333;
  public static final int ARTL_ART_lt_353 = 334;
  public static final int ARTL_ART_lt_354 = 335;
  public static final int ARTL_ART_lt_355 = 336;
  public static final int ARTL_ART_lt_356 = 337;
  public static final int ARTL_ART_lt_357 = 338;
  public static final int ARTL_ART_lt_358 = 339;
  public static final int ARTL_ART_lt_359 = 340;
  public static final int ARTL_ART_lt_360 = 341;
  public static final int ARTL_ART_mod_471 = 342;
  public static final int ARTL_ART_mod_472 = 343;
  public static final int ARTL_ART_mod_473 = 344;
  public static final int ARTL_ART_mod_474 = 345;
  public static final int ARTL_ART_mod_475 = 346;
  public static final int ARTL_ART_mod_476 = 347;
  public static final int ARTL_ART_mod_477 = 348;
  public static final int ARTL_ART_mod_478 = 349;
  public static final int ARTL_ART_mul_455 = 350;
  public static final int ARTL_ART_mul_456 = 351;
  public static final int ARTL_ART_mul_457 = 352;
  public static final int ARTL_ART_mul_458 = 353;
  public static final int ARTL_ART_mul_459 = 354;
  public static final int ARTL_ART_mul_460 = 355;
  public static final int ARTL_ART_mul_461 = 356;
  public static final int ARTL_ART_mul_462 = 357;
  public static final int ARTL_ART_ne_329 = 358;
  public static final int ARTL_ART_ne_330 = 359;
  public static final int ARTL_ART_ne_331 = 360;
  public static final int ARTL_ART_ne_332 = 361;
  public static final int ARTL_ART_ne_333 = 362;
  public static final int ARTL_ART_ne_334 = 363;
  public static final int ARTL_ART_ne_335 = 364;
  public static final int ARTL_ART_ne_336 = 365;
  public static final int ARTL_ART_neg_479 = 366;
  public static final int ARTL_ART_neg_480 = 367;
  public static final int ARTL_ART_neg_481 = 368;
  public static final int ARTL_ART_neg_482 = 369;
  public static final int ARTL_ART_neg_483 = 370;
  public static final int ARTL_ART_neg_484 = 371;
  public static final int ARTL_ART_not_385 = 372;
  public static final int ARTL_ART_not_386 = 373;
  public static final int ARTL_ART_not_387 = 374;
  public static final int ARTL_ART_not_388 = 375;
  public static final int ARTL_ART_not_389 = 376;
  public static final int ARTL_ART_not_390 = 377;
  public static final int ARTL_ART_operand_493 = 378;
  public static final int ARTL_ART_operand_494 = 379;
  public static final int ARTL_ART_operand_495 = 380;
  public static final int ARTL_ART_operand_496 = 381;
  public static final int ARTL_ART_operand_497 = 382;
  public static final int ARTL_ART_operand_498 = 383;
  public static final int ARTL_ART_operand_499 = 384;
  public static final int ARTL_ART_operand_500 = 385;
  public static final int ARTL_ART_operand_501 = 386;
  public static final int ARTL_ART_operand_502 = 387;
  public static final int ARTL_ART_operand_503 = 388;
  public static final int ARTL_ART_operand_504 = 389;
  public static final int ARTL_ART_operand_505 = 390;
  public static final int ARTL_ART_operand_506 = 391;
  public static final int ARTL_ART_operand_507 = 392;
  public static final int ARTL_ART_operand_508 = 393;
  public static final int ARTL_ART_operand_509 = 394;
  public static final int ARTL_ART_operand_510 = 395;
  public static final int ARTL_ART_operand_511 = 396;
  public static final int ARTL_ART_operand_512 = 397;
  public static final int ARTL_ART_operand_513 = 398;
  public static final int ARTL_ART_operand_514 = 399;
  public static final int ARTL_ART_operand_515 = 400;
  public static final int ARTL_ART_operand_516 = 401;
  public static final int ARTL_ART_operand_517 = 402;
  public static final int ARTL_ART_operand_518 = 403;
  public static final int ARTL_ART_operand_519 = 404;
  public static final int ARTL_ART_operand_520 = 405;
  public static final int ARTL_ART_operand_521 = 406;
  public static final int ARTL_ART_operand_522 = 407;
  public static final int ARTL_ART_operand_523 = 408;
  public static final int ARTL_ART_operand_524 = 409;
  public static final int ARTL_ART_operand_525 = 410;
  public static final int ARTL_ART_operand_526 = 411;
  public static final int ARTL_ART_operand_527 = 412;
  public static final int ARTL_ART_operand_528 = 413;
  public static final int ARTL_ART_operand_529 = 414;
  public static final int ARTL_ART_operand_530 = 415;
  public static final int ARTL_ART_operand_531 = 416;
  public static final int ARTL_ART_operand_532 = 417;
  public static final int ARTL_ART_operand_533 = 418;
  public static final int ARTL_ART_operand_534 = 419;
  public static final int ARTL_ART_operand_535 = 420;
  public static final int ARTL_ART_operand_536 = 421;
  public static final int ARTL_ART_operand_537 = 422;
  public static final int ARTL_ART_operand_538 = 423;
  public static final int ARTL_ART_operand_539 = 424;
  public static final int ARTL_ART_operand_540 = 425;
  public static final int ARTL_ART_operand_541 = 426;
  public static final int ARTL_ART_operand_542 = 427;
  public static final int ARTL_ART_operand_543 = 428;
  public static final int ARTL_ART_operand_544 = 429;
  public static final int ARTL_ART_operand_545 = 430;
  public static final int ARTL_ART_operand_546 = 431;
  public static final int ARTL_ART_operand_547 = 432;
  public static final int ARTL_ART_operand_548 = 433;
  public static final int ARTL_ART_or_377 = 434;
  public static final int ARTL_ART_or_378 = 435;
  public static final int ARTL_ART_or_379 = 436;
  public static final int ARTL_ART_or_380 = 437;
  public static final int ARTL_ART_or_381 = 438;
  public static final int ARTL_ART_or_382 = 439;
  public static final int ARTL_ART_or_383 = 440;
  public static final int ARTL_ART_or_384 = 441;
  public static final int ARTL_ART_paint_193 = 442;
  public static final int ARTL_ART_paint_194 = 443;
  public static final int ARTL_ART_paint_195 = 444;
  public static final int ARTL_ART_paint_196 = 445;
  public static final int ARTL_ART_paint_197 = 446;
  public static final int ARTL_ART_paint_198 = 447;
  public static final int ARTL_ART_paint_199 = 448;
  public static final int ARTL_ART_paint_200 = 449;
  public static final int ARTL_ART_paint_201 = 450;
  public static final int ARTL_ART_paint_202 = 451;
  public static final int ARTL_ART_println_153 = 452;
  public static final int ARTL_ART_println_154 = 453;
  public static final int ARTL_ART_println_155 = 454;
  public static final int ARTL_ART_println_156 = 455;
  public static final int ARTL_ART_println_157 = 456;
  public static final int ARTL_ART_println_158 = 457;
  public static final int ARTL_ART_println_159 = 458;
  public static final int ARTL_ART_println_160 = 459;
  public static final int ARTL_ART_println_161 = 460;
  public static final int ARTL_ART_println_162 = 461;
  public static final int ARTL_ART_println_163 = 462;
  public static final int ARTL_ART_println_164 = 463;
  public static final int ARTL_ART_printlnElem_165 = 464;
  public static final int ARTL_ART_printlnElem_166 = 465;
  public static final int ARTL_ART_printlnElem_167 = 466;
  public static final int ARTL_ART_printlnElem_168 = 467;
  public static final int ARTL_ART_printlnElem_169 = 468;
  public static final int ARTL_ART_printlnElem_170 = 469;
  public static final int ARTL_ART_printlnElem_171 = 470;
  public static final int ARTL_ART_printlnElem_172 = 471;
  public static final int ARTL_ART_printlnElem_173 = 472;
  public static final int ARTL_ART_printlnElem_174 = 473;
  public static final int ARTL_ART_printlnElem_175 = 474;
  public static final int ARTL_ART_printlnElem_176 = 475;
  public static final int ARTL_ART_pyramid_643 = 476;
  public static final int ARTL_ART_pyramid_644 = 477;
  public static final int ARTL_ART_pyramid_645 = 478;
  public static final int ARTL_ART_pyramid_646 = 479;
  public static final int ARTL_ART_pyramid_647 = 480;
  public static final int ARTL_ART_pyramid_648 = 481;
  public static final int ARTL_ART_pyramid_649 = 482;
  public static final int ARTL_ART_pyramid_650 = 483;
  public static final int ARTL_ART_pyramid_651 = 484;
  public static final int ARTL_ART_pyramid_652 = 485;
  public static final int ARTL_ART_pyramid_653 = 486;
  public static final int ARTL_ART_pyramid_654 = 487;
  public static final int ARTL_ART_pyramid_655 = 488;
  public static final int ARTL_ART_pyramid_656 = 489;
  public static final int ARTL_ART_relExpr_269 = 490;
  public static final int ARTL_ART_relExpr_270 = 491;
  public static final int ARTL_ART_relExpr_271 = 492;
  public static final int ARTL_ART_relExpr_272 = 493;
  public static final int ARTL_ART_relExpr_273 = 494;
  public static final int ARTL_ART_relExpr_274 = 495;
  public static final int ARTL_ART_relExpr_275 = 496;
  public static final int ARTL_ART_relExpr_276 = 497;
  public static final int ARTL_ART_relExpr_277 = 498;
  public static final int ARTL_ART_relExpr_278 = 499;
  public static final int ARTL_ART_relExpr_279 = 500;
  public static final int ARTL_ART_relExpr_280 = 501;
  public static final int ARTL_ART_relExpr_281 = 502;
  public static final int ARTL_ART_relExpr_282 = 503;
  public static final int ARTL_ART_relExpr_283 = 504;
  public static final int ARTL_ART_relExpr_284 = 505;
  public static final int ARTL_ART_relExpr_285 = 506;
  public static final int ARTL_ART_relExpr_286 = 507;
  public static final int ARTL_ART_relExpr_287 = 508;
  public static final int ARTL_ART_relExpr_288 = 509;
  public static final int ARTL_ART_relExpr_289 = 510;
  public static final int ARTL_ART_relExpr_290 = 511;
  public static final int ARTL_ART_relExpr_291 = 512;
  public static final int ARTL_ART_relExpr_292 = 513;
  public static final int ARTL_ART_relExpr_293 = 514;
  public static final int ARTL_ART_relExpr_294 = 515;
  public static final int ARTL_ART_relExpr_295 = 516;
  public static final int ARTL_ART_relExpr_296 = 517;
  public static final int ARTL_ART_relExpr_297 = 518;
  public static final int ARTL_ART_relExpr_298 = 519;
  public static final int ARTL_ART_relExpr_299 = 520;
  public static final int ARTL_ART_relExpr_300 = 521;
  public static final int ARTL_ART_relExpr_301 = 522;
  public static final int ARTL_ART_relExpr_302 = 523;
  public static final int ARTL_ART_relExpr_303 = 524;
  public static final int ARTL_ART_relExpr_304 = 525;
  public static final int ARTL_ART_relExpr_305 = 526;
  public static final int ARTL_ART_relExpr_306 = 527;
  public static final int ARTL_ART_relExpr_307 = 528;
  public static final int ARTL_ART_relExpr_308 = 529;
  public static final int ARTL_ART_relExpr_309 = 530;
  public static final int ARTL_ART_relExpr_310 = 531;
  public static final int ARTL_ART_relExpr_311 = 532;
  public static final int ARTL_ART_relExpr_312 = 533;
  public static final int ARTL_ART_relExpr_313 = 534;
  public static final int ARTL_ART_relExpr_314 = 535;
  public static final int ARTL_ART_relExpr_315 = 536;
  public static final int ARTL_ART_relExpr_316 = 537;
  public static final int ARTL_ART_relExpr_317 = 538;
  public static final int ARTL_ART_relExpr_318 = 539;
  public static final int ARTL_ART_relExpr_319 = 540;
  public static final int ARTL_ART_relExpr_320 = 541;
  public static final int ARTL_ART_rotate_225 = 542;
  public static final int ARTL_ART_rotate_226 = 543;
  public static final int ARTL_ART_rotate_227 = 544;
  public static final int ARTL_ART_rotate_228 = 545;
  public static final int ARTL_ART_rotate_229 = 546;
  public static final int ARTL_ART_rotate_230 = 547;
  public static final int ARTL_ART_rotate_231 = 548;
  public static final int ARTL_ART_rotate_232 = 549;
  public static final int ARTL_ART_rotate_233 = 550;
  public static final int ARTL_ART_rotate_234 = 551;
  public static final int ARTL_ART_rotate_235 = 552;
  public static final int ARTL_ART_rotate_236 = 553;
  public static final int ARTL_ART_rotate_237 = 554;
  public static final int ARTL_ART_rotate_238 = 555;
  public static final int ARTL_ART_rotate_239 = 556;
  public static final int ARTL_ART_rotate_240 = 557;
  public static final int ARTL_ART_rotate_241 = 558;
  public static final int ARTL_ART_rotate_242 = 559;
  public static final int ARTL_ART_rotate_243 = 560;
  public static final int ARTL_ART_rotate_244 = 561;
  public static final int ARTL_ART_rotate_245 = 562;
  public static final int ARTL_ART_rotate_246 = 563;
  public static final int ARTL_ART_scale_247 = 564;
  public static final int ARTL_ART_scale_248 = 565;
  public static final int ARTL_ART_scale_249 = 566;
  public static final int ARTL_ART_scale_250 = 567;
  public static final int ARTL_ART_scale_251 = 568;
  public static final int ARTL_ART_scale_252 = 569;
  public static final int ARTL_ART_scale_253 = 570;
  public static final int ARTL_ART_scale_254 = 571;
  public static final int ARTL_ART_scale_255 = 572;
  public static final int ARTL_ART_scale_256 = 573;
  public static final int ARTL_ART_scale_257 = 574;
  public static final int ARTL_ART_scale_258 = 575;
  public static final int ARTL_ART_scale_259 = 576;
  public static final int ARTL_ART_scale_260 = 577;
  public static final int ARTL_ART_scale_261 = 578;
  public static final int ARTL_ART_scale_262 = 579;
  public static final int ARTL_ART_scale_263 = 580;
  public static final int ARTL_ART_scale_264 = 581;
  public static final int ARTL_ART_scale_265 = 582;
  public static final int ARTL_ART_scale_266 = 583;
  public static final int ARTL_ART_scale_267 = 584;
  public static final int ARTL_ART_scale_268 = 585;
  public static final int ARTL_ART_seq_49 = 586;
  public static final int ARTL_ART_seq_50 = 587;
  public static final int ARTL_ART_seq_51 = 588;
  public static final int ARTL_ART_seq_52 = 589;
  public static final int ARTL_ART_seq_53 = 590;
  public static final int ARTL_ART_seq_54 = 591;
  public static final int ARTL_ART_sphere_581 = 592;
  public static final int ARTL_ART_sphere_582 = 593;
  public static final int ARTL_ART_sphere_583 = 594;
  public static final int ARTL_ART_sphere_584 = 595;
  public static final int ARTL_ART_sphere_585 = 596;
  public static final int ARTL_ART_sphere_586 = 597;
  public static final int ARTL_ART_sphere_587 = 598;
  public static final int ARTL_ART_sphere_588 = 599;
  public static final int ARTL_ART_sphere_589 = 600;
  public static final int ARTL_ART_sphere_590 = 601;
  public static final int ARTL_ART_statement_1 = 602;
  public static final int ARTL_ART_statement_2 = 603;
  public static final int ARTL_ART_statement_3 = 604;
  public static final int ARTL_ART_statement_4 = 605;
  public static final int ARTL_ART_statement_5 = 606;
  public static final int ARTL_ART_statement_6 = 607;
  public static final int ARTL_ART_statement_7 = 608;
  public static final int ARTL_ART_statement_8 = 609;
  public static final int ARTL_ART_statement_9 = 610;
  public static final int ARTL_ART_statement_10 = 611;
  public static final int ARTL_ART_statement_11 = 612;
  public static final int ARTL_ART_statement_12 = 613;
  public static final int ARTL_ART_statement_13 = 614;
  public static final int ARTL_ART_statement_14 = 615;
  public static final int ARTL_ART_statement_15 = 616;
  public static final int ARTL_ART_statement_16 = 617;
  public static final int ARTL_ART_statement_17 = 618;
  public static final int ARTL_ART_statement_18 = 619;
  public static final int ARTL_ART_statement_19 = 620;
  public static final int ARTL_ART_statement_20 = 621;
  public static final int ARTL_ART_statement_21 = 622;
  public static final int ARTL_ART_statement_22 = 623;
  public static final int ARTL_ART_statement_23 = 624;
  public static final int ARTL_ART_statement_24 = 625;
  public static final int ARTL_ART_statement_25 = 626;
  public static final int ARTL_ART_statement_26 = 627;
  public static final int ARTL_ART_statement_27 = 628;
  public static final int ARTL_ART_statement_28 = 629;
  public static final int ARTL_ART_statement_29 = 630;
  public static final int ARTL_ART_statement_30 = 631;
  public static final int ARTL_ART_statement_31 = 632;
  public static final int ARTL_ART_statement_32 = 633;
  public static final int ARTL_ART_statement_33 = 634;
  public static final int ARTL_ART_statement_34 = 635;
  public static final int ARTL_ART_statement_35 = 636;
  public static final int ARTL_ART_statement_36 = 637;
  public static final int ARTL_ART_statement_37 = 638;
  public static final int ARTL_ART_statement_38 = 639;
  public static final int ARTL_ART_statement_39 = 640;
  public static final int ARTL_ART_statement_40 = 641;
  public static final int ARTL_ART_statement_41 = 642;
  public static final int ARTL_ART_statement_42 = 643;
  public static final int ARTL_ART_statement_43 = 644;
  public static final int ARTL_ART_statement_44 = 645;
  public static final int ARTL_ART_statement_45 = 646;
  public static final int ARTL_ART_statement_46 = 647;
  public static final int ARTL_ART_statement_47 = 648;
  public static final int ARTL_ART_statement_48 = 649;
  public static final int ARTL_ART_sub_439 = 650;
  public static final int ARTL_ART_sub_440 = 651;
  public static final int ARTL_ART_sub_441 = 652;
  public static final int ARTL_ART_sub_442 = 653;
  public static final int ARTL_ART_sub_443 = 654;
  public static final int ARTL_ART_sub_444 = 655;
  public static final int ARTL_ART_sub_445 = 656;
  public static final int ARTL_ART_sub_446 = 657;
  public static final int ARTL_ART_subExpr_399 = 658;
  public static final int ARTL_ART_subExpr_400 = 659;
  public static final int ARTL_ART_subExpr_401 = 660;
  public static final int ARTL_ART_subExpr_402 = 661;
  public static final int ARTL_ART_subExpr_403 = 662;
  public static final int ARTL_ART_subExpr_404 = 663;
  public static final int ARTL_ART_subExpr_405 = 664;
  public static final int ARTL_ART_subExpr_406 = 665;
  public static final int ARTL_ART_subExpr_407 = 666;
  public static final int ARTL_ART_subExpr_408 = 667;
  public static final int ARTL_ART_subExpr_409 = 668;
  public static final int ARTL_ART_subExpr_410 = 669;
  public static final int ARTL_ART_subExpr_411 = 670;
  public static final int ARTL_ART_subExpr_412 = 671;
  public static final int ARTL_ART_subExpr_413 = 672;
  public static final int ARTL_ART_subExpr_414 = 673;
  public static final int ARTL_ART_subExpr_415 = 674;
  public static final int ARTL_ART_subExpr_416 = 675;
  public static final int ARTL_ART_subExpr_417 = 676;
  public static final int ARTL_ART_subExpr_418 = 677;
  public static final int ARTL_ART_subExpr_419 = 678;
  public static final int ARTL_ART_subExpr_420 = 679;
  public static final int ARTL_ART_subExpr_421 = 680;
  public static final int ARTL_ART_subExpr_422 = 681;
  public static final int ARTL_ART_subExpr_423 = 682;
  public static final int ARTL_ART_subExpr_424 = 683;
  public static final int ARTL_ART_subExpr_425 = 684;
  public static final int ARTL_ART_subExpr_426 = 685;
  public static final int ARTL_ART_subExpr_427 = 686;
  public static final int ARTL_ART_subExpr_428 = 687;
  public static final int ARTL_ART_subExpr_429 = 688;
  public static final int ARTL_ART_subExpr_430 = 689;
  public static final int ARTL_ART_subExpr_431 = 690;
  public static final int ARTL_ART_subExpr_432 = 691;
  public static final int ARTL_ART_subExpr_433 = 692;
  public static final int ARTL_ART_subExpr_434 = 693;
  public static final int ARTL_ART_subExpr_435 = 694;
  public static final int ARTL_ART_subExpr_436 = 695;
  public static final int ARTL_ART_subExpr_437 = 696;
  public static final int ARTL_ART_subExpr_438 = 697;
  public static final int ARTL_ART_tetrahedron_633 = 698;
  public static final int ARTL_ART_tetrahedron_634 = 699;
  public static final int ARTL_ART_tetrahedron_635 = 700;
  public static final int ARTL_ART_tetrahedron_636 = 701;
  public static final int ARTL_ART_tetrahedron_637 = 702;
  public static final int ARTL_ART_tetrahedron_638 = 703;
  public static final int ARTL_ART_tetrahedron_639 = 704;
  public static final int ARTL_ART_tetrahedron_640 = 705;
  public static final int ARTL_ART_tetrahedron_641 = 706;
  public static final int ARTL_ART_tetrahedron_642 = 707;
  public static final int ARTL_ART_torus_619 = 708;
  public static final int ARTL_ART_torus_620 = 709;
  public static final int ARTL_ART_torus_621 = 710;
  public static final int ARTL_ART_torus_622 = 711;
  public static final int ARTL_ART_torus_623 = 712;
  public static final int ARTL_ART_torus_624 = 713;
  public static final int ARTL_ART_torus_625 = 714;
  public static final int ARTL_ART_torus_626 = 715;
  public static final int ARTL_ART_torus_627 = 716;
  public static final int ARTL_ART_torus_628 = 717;
  public static final int ARTL_ART_torus_629 = 718;
  public static final int ARTL_ART_torus_630 = 719;
  public static final int ARTL_ART_torus_631 = 720;
  public static final int ARTL_ART_torus_632 = 721;
  public static final int ARTL_ART_translate_203 = 722;
  public static final int ARTL_ART_translate_204 = 723;
  public static final int ARTL_ART_translate_205 = 724;
  public static final int ARTL_ART_translate_206 = 725;
  public static final int ARTL_ART_translate_207 = 726;
  public static final int ARTL_ART_translate_208 = 727;
  public static final int ARTL_ART_translate_209 = 728;
  public static final int ARTL_ART_translate_210 = 729;
  public static final int ARTL_ART_translate_211 = 730;
  public static final int ARTL_ART_translate_212 = 731;
  public static final int ARTL_ART_translate_213 = 732;
  public static final int ARTL_ART_translate_214 = 733;
  public static final int ARTL_ART_translate_215 = 734;
  public static final int ARTL_ART_translate_216 = 735;
  public static final int ARTL_ART_translate_217 = 736;
  public static final int ARTL_ART_translate_218 = 737;
  public static final int ARTL_ART_translate_219 = 738;
  public static final int ARTL_ART_translate_220 = 739;
  public static final int ARTL_ART_translate_221 = 740;
  public static final int ARTL_ART_translate_222 = 741;
  public static final int ARTL_ART_translate_223 = 742;
  public static final int ARTL_ART_translate_224 = 743;
  public static final int ARTL_ART_while_115 = 744;
  public static final int ARTL_ART_while_116 = 745;
  public static final int ARTL_ART_while_117 = 746;
  public static final int ARTL_ART_while_118 = 747;
  public static final int ARTL_ART_while_119 = 748;
  public static final int ARTL_ART_while_120 = 749;
  public static final int ARTL_ART_while_121 = 750;
  public static final int ARTL_ART_while_122 = 751;
  public static final int ARTL_ART_while_123 = 752;
  public static final int ARTL_ART_while_124 = 753;
  public static final int ARTL_ART_while_125 = 754;
  public static final int ARTL_ART_while_126 = 755;
  public static final int ARTL_ART_while_127 = 756;
  public static final int ARTL_ART_while_128 = 757;
  public static final int ARTL_ART_while_129 = 758;
  public static final int ARTL_ART_while_130 = 759;
  public static final int ARTL_ART_xor_391 = 760;
  public static final int ARTL_ART_xor_392 = 761;
  public static final int ARTL_ART_xor_393 = 762;
  public static final int ARTL_ART_xor_394 = 763;
  public static final int ARTL_ART_xor_395 = 764;
  public static final int ARTL_ART_xor_396 = 765;
  public static final int ARTL_ART_xor_397 = 766;
  public static final int ARTL_ART_xor_398 = 767;
  public static final int ARTX_DESPATCH = 768;
  public static final int ARTX_DUMMY = 769;
  public static final int ARTX_LABEL_EXTENT = 770;
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
          artFindDescriptor(ARTL_ART_ID_658, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_658: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_660, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_INTEGER_664, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_664: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_666, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_REAL_670, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_670: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_672, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_STRING_DQ_676, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_676: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_678, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_add_448, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal add: match production*/
      case ARTL_ART_add_448: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_450, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_add_450: 
        /* Nonterminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_add_452, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_454, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_add_454: 
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
          artFindDescriptor(ARTL_ART_and_370, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal and: match production*/
      case ARTL_ART_and_370: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_and_372, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_and_372: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND_AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_and_374, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_and_376, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_and_376: 
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
          artFindDescriptor(ARTL_ART_assign_56, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal assign: match production*/
      case ARTL_ART_assign_56: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_58, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_assign_58: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_60, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_62, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_assign_62: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_64, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_box() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal box production descriptor loads*/
      case ARTL_ART_box: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_box_554, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal box: match production*/
      case ARTL_ART_box_554: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_BOX, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_556, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_558, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_box_560, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_box_560: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_562, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_box_564, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_box_564: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_566, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_box_568, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_box_568: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_570, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_compassign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal compassign production descriptor loads*/
      case ARTL_ART_compassign: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_compassign_66, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal compassign: match production*/
      case ARTL_ART_compassign_66: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_compassign_68, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_compassign_68: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_compassign_70, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_compassign_72, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_compassign_72: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_compassign_74, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_cone() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal cone production descriptor loads*/
      case ARTL_ART_cone: 
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_cone_606, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal cone: match production*/
      case ARTL_ART_cone_606: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_CONE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cone_608, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cone_610, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cone_612, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cone_612: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cone_614, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cone_616, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cone_616: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cone_618, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_cube() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal cube production descriptor loads*/
      case ARTL_ART_cube: 
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_cube_572, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal cube: match production*/
      case ARTL_ART_cube_572: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_CUBE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cube_574, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cube_576, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cube_578, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cube_578: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cube_580, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_cylinder() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal cylinder production descriptor loads*/
      case ARTL_ART_cylinder: 
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_cylinder_592, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal cylinder: match production*/
      case ARTL_ART_cylinder_592: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_CYLINDER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cylinder_594, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cylinder_596, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cylinder_598, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cylinder_598: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cylinder_600, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cylinder_602, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cylinder_602: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cylinder_604, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_deref() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal deref production descriptor loads*/
      case ARTL_ART_deref: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_deref_550, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal deref: match production*/
      case ARTL_ART_deref_550: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_deref_552, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_deref_552: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_div() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal div production descriptor loads*/
      case ARTL_ART_div: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_div_464, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal div: match production*/
      case ARTL_ART_div_464: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_466, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_div_466: 
        /* Nonterminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_div_468, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_470, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_div_470: 
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
          artFindDescriptor(ARTL_ART_eq_322, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal eq: match production*/
      case ARTL_ART_eq_322: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_324, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_eq_324: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_eq_326, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_328, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_eq_328: 
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
          artFindDescriptor(ARTL_ART_exp_486, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal exp: match production*/
      case ARTL_ART_exp_486: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_exp_488, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_exp_488: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR_STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_exp_490, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_exp_492, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_exp_492: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_for() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal for production descriptor loads*/
      case ARTL_ART_for: 
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_for_132, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal for: match production*/
      case ARTL_ART_for_132: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_for, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_134, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_136, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_for_138, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_for_138: 
        /* Nonterminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_for_140, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_for_140: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_142, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_for_144, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_for_144: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_146, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_148, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_for_150, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_for_150: 
        /* Nonterminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_152, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ge() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ge production descriptor loads*/
      case ARTL_ART_ge: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ge_346, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ge: match production*/
      case ARTL_ART_ge_346: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ge_348, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_ge_348: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ge_350, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ge_352, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_ge_352: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_gt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal gt production descriptor loads*/
      case ARTL_ART_gt: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_gt_338, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal gt: match production*/
      case ARTL_ART_gt_338: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_340, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_gt_340: 
        /* Nonterminal template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_gt_342, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_344, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_gt_344: 
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
        if (ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_76, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_100, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal if: match production*/
      case ARTL_ART_if_76: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_78, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_80, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_82, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_82: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_86, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_88, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_88: 
        /* Nonterminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_90, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_92, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_94, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_96: 
        /* Nonterminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_98, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal if: match production*/
      case ARTL_ART_if_100: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_102, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_104, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_106: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_108, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_110, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_112, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_112: 
        /* Nonterminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_114, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
        if (ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_init_178, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal init: match production*/
      case ARTL_ART_init_178: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_init, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_180, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_182, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_init_184, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_init_184: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_186, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_init_188, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_init_188: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_190, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_192, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_le() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal le production descriptor loads*/
      case ARTL_ART_le: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_le_362, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal le: match production*/
      case ARTL_ART_le_362: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_le_364, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_le_364: 
        /* Nonterminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_le_366, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_le_368, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_le_368: 
        /* Nonterminal template end */
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
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_lt_354, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal lt: match production*/
      case ARTL_ART_lt_354: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_356, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_lt_356: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_lt_358, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_360, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_lt_360: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_mod() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal mod production descriptor loads*/
      case ARTL_ART_mod: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mod_472, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal mod: match production*/
      case ARTL_ART_mod_472: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mod_474, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_mod_474: 
        /* Nonterminal template end */
        if (!ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERCENT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_mod_476, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mod_478, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_mod_478: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_mul() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal mul production descriptor loads*/
      case ARTL_ART_mul: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mul_456, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal mul: match production*/
      case ARTL_ART_mul_456: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_458, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_mul_458: 
        /* Nonterminal template end */
        if (!ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_mul_460, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_462, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_mul_462: 
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
          artFindDescriptor(ARTL_ART_ne_330, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ne: match production*/
      case ARTL_ART_ne_330: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_332, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_ne_332: 
        /* Nonterminal template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ne_334, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_336, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_ne_336: 
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
        if (ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_neg_480, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal neg: match production*/
      case ARTL_ART_neg_480: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_neg_482, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_neg_484, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_neg_484: 
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
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_not_386, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal not: match production*/
      case ARTL_ART_not_386: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_not_388, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_not_390, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_not_390: 
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
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_494, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_498, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_502, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet51[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_506, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_510, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_518, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_522, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_526, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_530, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_534, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_538, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet58[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_542, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_546, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_494: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_496, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_operand_496: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_498: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_500, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_500: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_502: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_504, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_operand_504: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_506: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_508, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_operand_508: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_510: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_512, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_514, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_operand_514: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_516, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_518: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_520, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_box; return; }
      case ARTL_ART_operand_520: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_522: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_524, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_cube; return; }
      case ARTL_ART_operand_524: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_526: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_528, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sphere; return; }
      case ARTL_ART_operand_528: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_530: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_532, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_cylinder; return; }
      case ARTL_ART_operand_532: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_534: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_536, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_cone; return; }
      case ARTL_ART_operand_536: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_538: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_540, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_torus; return; }
      case ARTL_ART_operand_540: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_542: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_544, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_tetrahedron; return; }
      case ARTL_ART_operand_544: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_546: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_548, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_pyramid; return; }
      case ARTL_ART_operand_548: 
        /* Nonterminal template end */
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
          artFindDescriptor(ARTL_ART_or_378, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal or: match production*/
      case ARTL_ART_or_378: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_or_380, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_or_380: 
        /* Nonterminal template end */
        if (!ARTSet60[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__BAR_BAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_or_382, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_or_384, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_or_384: 
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
        if (ARTSet61[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_paint_194, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal paint: match production*/
      case ARTL_ART_paint_194: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_paint, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_196, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_198, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_200, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_202, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_println() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal println production descriptor loads*/
      case ARTL_ART_println: 
        if (ARTSet62[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_println_154, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal println: match production*/
      case ARTL_ART_println_154: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_println, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_println_156, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_println_158, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_println_160, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printlnElem; return; }
      case ARTL_ART_println_160: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_println_162, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_println_164, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_printlnElem() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal printlnElem production descriptor loads*/
      case ARTL_ART_printlnElem: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printlnElem_166, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printlnElem_170, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal printlnElem: match production*/
      case ARTL_ART_printlnElem_166: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printlnElem_168, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_printlnElem_168: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printlnElem: match production*/
      case ARTL_ART_printlnElem_170: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printlnElem_172, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_printlnElem_172: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printlnElem_174, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printlnElem_176, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printlnElem; return; }
      case ARTL_ART_printlnElem_176: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_pyramid() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal pyramid production descriptor loads*/
      case ARTL_ART_pyramid: 
        if (ARTSet64[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_pyramid_644, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal pyramid: match production*/
      case ARTL_ART_pyramid_644: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_PYRAMID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pyramid_646, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pyramid_648, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_pyramid_650, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_pyramid_650: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pyramid_652, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_pyramid_654, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_pyramid_654: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pyramid_656, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_270, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_274, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_278, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_282, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_286, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_290, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_294, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_298, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_302, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet65[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_306, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_310, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_314, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_270: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_272, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_272: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_274: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_276, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_eq; return; }
      case ARTL_ART_relExpr_276: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_278: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_280, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ne; return; }
      case ARTL_ART_relExpr_280: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_282: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_284, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_gt; return; }
      case ARTL_ART_relExpr_284: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_286: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_288, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ge; return; }
      case ARTL_ART_relExpr_288: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_290: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_292, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_lt; return; }
      case ARTL_ART_relExpr_292: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_294: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_296, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_le; return; }
      case ARTL_ART_relExpr_296: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_298: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_300, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_and; return; }
      case ARTL_ART_relExpr_300: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_302: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_304, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_or; return; }
      case ARTL_ART_relExpr_304: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_306: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_308, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_not; return; }
      case ARTL_ART_relExpr_308: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_310: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_312, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_xor; return; }
      case ARTL_ART_relExpr_312: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_314: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_316, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_318, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_relExpr_318: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_320, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_rotate() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal rotate production descriptor loads*/
      case ARTL_ART_rotate: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rotate_226, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal rotate: match production*/
      case ARTL_ART_rotate_226: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_rotate_228, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_rotate_228: 
        /* Nonterminal template end */
        if (!ARTSet66[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIODrotate, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_230, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_232, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_rotate_234, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_rotate_234: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_236, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_rotate_238, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_rotate_238: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_240, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_rotate_242, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_rotate_242: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_244, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_246, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_scale() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal scale production descriptor loads*/
      case ARTL_ART_scale: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_scale_248, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal scale: match production*/
      case ARTL_ART_scale_248: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_scale_250, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_scale_250: 
        /* Nonterminal template end */
        if (!ARTSet67[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIODscale, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_252, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_254, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_scale_256, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_scale_256: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_258, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_scale_260, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_scale_260: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_262, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_scale_264, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_scale_264: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_266, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_268, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_seq() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal seq production descriptor loads*/
      case ARTL_ART_seq: 
        if (ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_seq_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal seq: match production*/
      case ARTL_ART_seq_50: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_52, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_52: 
        /* Nonterminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_54, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_54: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sphere() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sphere production descriptor loads*/
      case ARTL_ART_sphere: 
        if (ARTSet68[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sphere_582, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sphere: match production*/
      case ARTL_ART_sphere_582: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_SPHERE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sphere_584, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sphere_586, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sphere_588, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_sphere_588: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sphere_590, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet69[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet70[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_10, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet72[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_18, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet73[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_22, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet74[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_26, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet75[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_30, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet76[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_34, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet77[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_38, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet78[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_42, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet79[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_46, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
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
        { artCurrentRestartLabel = ARTL_ART_compassign; return; }
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
        { artCurrentRestartLabel = ARTL_ART_if; return; }
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
        { artCurrentRestartLabel = ARTL_ART_while; return; }
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
        { artCurrentRestartLabel = ARTL_ART_for; return; }
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
        { artCurrentRestartLabel = ARTL_ART_println; return; }
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
        { artCurrentRestartLabel = ARTL_ART_init; return; }
      case ARTL_ART_statement_32: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_34: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_36, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_paint; return; }
      case ARTL_ART_statement_36: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_38: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_40, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_translate; return; }
      case ARTL_ART_statement_40: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_42: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_44, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_rotate; return; }
      case ARTL_ART_statement_44: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_46: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_48, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_scale; return; }
      case ARTL_ART_statement_48: 
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
          artFindDescriptor(ARTL_ART_sub_440, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sub: match production*/
      case ARTL_ART_sub_440: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_442, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_sub_442: 
        /* Nonterminal template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sub_444, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_446, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_sub_446: 
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
          artFindDescriptor(ARTL_ART_subExpr_400, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_404, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_408, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_412, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_416, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_420, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet80[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_424, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_428, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_432, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_400: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_402, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_402: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_404: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_406, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sub; return; }
      case ARTL_ART_subExpr_406: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_408: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_410, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_add; return; }
      case ARTL_ART_subExpr_410: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_412: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_414, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mul; return; }
      case ARTL_ART_subExpr_414: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_416: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_418, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_div; return; }
      case ARTL_ART_subExpr_418: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_420: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_422, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mod; return; }
      case ARTL_ART_subExpr_422: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_424: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_426, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_neg; return; }
      case ARTL_ART_subExpr_426: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_428: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_430, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_exp; return; }
      case ARTL_ART_subExpr_430: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_432: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_434, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_436, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_436: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_438, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_tetrahedron() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal tetrahedron production descriptor loads*/
      case ARTL_ART_tetrahedron: 
        if (ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_tetrahedron_634, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal tetrahedron: match production*/
      case ARTL_ART_tetrahedron_634: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_TETRAHEDRON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_tetrahedron_636, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_tetrahedron_638, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_tetrahedron_640, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_tetrahedron_640: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_tetrahedron_642, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_torus() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal torus production descriptor loads*/
      case ARTL_ART_torus: 
        if (ARTSet82[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_torus_620, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal torus: match production*/
      case ARTL_ART_torus_620: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_TORUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_torus_622, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_torus_624, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_torus_626, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_torus_626: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_torus_628, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_torus_630, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_torus_630: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_torus_632, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_translate() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal translate production descriptor loads*/
      case ARTL_ART_translate: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_translate_204, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal translate: match production*/
      case ARTL_ART_translate_204: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_translate_206, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_translate_206: 
        /* Nonterminal template end */
        if (!ARTSet83[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIODtranslate, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_208, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_210, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_translate_212, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_translate_212: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_214, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_translate_216, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_translate_216: 
        /* Nonterminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_218, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_translate_220, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_translate_220: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_222, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_224, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_while() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal while production descriptor loads*/
      case ARTL_ART_while: 
        if (ARTSet84[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_while_116, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal while: match production*/
      case ARTL_ART_while_116: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_118, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_120, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_122, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_while_122: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_124, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_126, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_128, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_while_128: 
        /* Nonterminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_130, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_xor_392, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal xor: match production*/
      case ARTL_ART_xor_392: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_xor_394, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_xor_394: 
        /* Nonterminal template end */
        if (!ARTSet85[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__UPARROW, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_xor_396, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_xor_398, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_xor_398: 
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
    artTokenExtent = 96;
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
        case ARTL_ART_box: 
          ARTPF_ART_box();
          break;
        case ARTL_ART_compassign: 
          ARTPF_ART_compassign();
          break;
        case ARTL_ART_cone: 
          ARTPF_ART_cone();
          break;
        case ARTL_ART_cube: 
          ARTPF_ART_cube();
          break;
        case ARTL_ART_cylinder: 
          ARTPF_ART_cylinder();
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
        case ARTL_ART_for: 
          ARTPF_ART_for();
          break;
        case ARTL_ART_ge: 
          ARTPF_ART_ge();
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
        case ARTL_ART_le: 
          ARTPF_ART_le();
          break;
        case ARTL_ART_lt: 
          ARTPF_ART_lt();
          break;
        case ARTL_ART_mod: 
          ARTPF_ART_mod();
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
        case ARTL_ART_println: 
          ARTPF_ART_println();
          break;
        case ARTL_ART_printlnElem: 
          ARTPF_ART_printlnElem();
          break;
        case ARTL_ART_pyramid: 
          ARTPF_ART_pyramid();
          break;
        case ARTL_ART_relExpr: 
          ARTPF_ART_relExpr();
          break;
        case ARTL_ART_rotate: 
          ARTPF_ART_rotate();
          break;
        case ARTL_ART_scale: 
          ARTPF_ART_scale();
          break;
        case ARTL_ART_seq: 
          ARTPF_ART_seq();
          break;
        case ARTL_ART_sphere: 
          ARTPF_ART_sphere();
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
        case ARTL_ART_tetrahedron: 
          ARTPF_ART_tetrahedron();
          break;
        case ARTL_ART_torus: 
          ARTPF_ART_torus();
          break;
        case ARTL_ART_translate: 
          ARTPF_ART_translate();
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

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS_CONE] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS_CYLINDER] = true;
  }

  public void ARTSet70initialise() {
    ARTSet70 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet70, 0, artSetExtent, false);
    ARTSet70[ARTTB_ID] = true;
    ARTSet70[ARTL_ART_ID] = true;
    ARTSet70[ARTL_ART_compassign] = true;
  }

  public void ARTSet78initialise() {
    ARTSet78 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet78, 0, artSetExtent, false);
    ARTSet78[ARTTB_ID] = true;
    ARTSet78[ARTL_ART_ID] = true;
    ARTSet78[ARTL_ART_deref] = true;
    ARTSet78[ARTL_ART_rotate] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTB_INTEGER] = true;
    ARTSet41[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet75initialise() {
    ARTSet75 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet75, 0, artSetExtent, false);
    ARTSet75[ARTTS_init] = true;
    ARTSet75[ARTL_ART_init] = true;
  }

  public void ARTSet58initialise() {
    ARTSet58 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet58, 0, artSetExtent, false);
    ARTSet58[ARTTS_TETRAHEDRON] = true;
    ARTSet58[ARTL_ART_tetrahedron] = true;
  }

  public void ARTSet61initialise() {
    ARTSet61 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet61, 0, artSetExtent, false);
    ARTSet61[ARTTS_paint] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[ARTTS_CUBE] = true;
    ARTSet53[ARTL_ART_cube] = true;
  }

  public void ARTSet84initialise() {
    ARTSet84 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet84, 0, artSetExtent, false);
    ARTSet84[ARTTS_while] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTS__SHREIK_EQUAL] = true;
    ARTSet6[ARTTS__PERCENT] = true;
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
    ARTSet6[ARTTS__LT_EQUAL] = true;
    ARTSet6[ARTTS__EQUAL_EQUAL] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS__GT_EQUAL] = true;
    ARTSet6[ARTTS__UPARROW] = true;
    ARTSet6[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet77initialise() {
    ARTSet77 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet77, 0, artSetExtent, false);
    ARTSet77[ARTTB_ID] = true;
    ARTSet77[ARTL_ART_ID] = true;
    ARTSet77[ARTL_ART_deref] = true;
    ARTSet77[ARTL_ART_translate] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTS__SHREIK_EQUAL] = true;
    ARTSet13[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet13[ARTTS__RPAR] = true;
    ARTSet13[ARTTS__COMMA] = true;
    ARTSet13[ARTTS__SEMICOLON] = true;
    ARTSet13[ARTTS__LT] = true;
    ARTSet13[ARTTS__LT_EQUAL] = true;
    ARTSet13[ARTTS__EQUAL_EQUAL] = true;
    ARTSet13[ARTTS__GT] = true;
    ARTSet13[ARTTS__GT_EQUAL] = true;
    ARTSet13[ARTTS__UPARROW] = true;
    ARTSet13[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet79initialise() {
    ARTSet79 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet79, 0, artSetExtent, false);
    ARTSet79[ARTTB_ID] = true;
    ARTSet79[ARTL_ART_ID] = true;
    ARTSet79[ARTL_ART_deref] = true;
    ARTSet79[ARTL_ART_scale] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS_if] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS_else] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTS__SHREIK] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTS__PERCENT] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[ARTTS_CYLINDER] = true;
    ARTSet55[ARTL_ART_cylinder] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS__LPAR] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS__RPAR] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS_BOX] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS__STAR] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS__PLUS] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS__COMMA] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTS__MINUS] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS__SLASH] = true;
  }

  public void ARTSet57initialise() {
    ARTSet57 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet57, 0, artSetExtent, false);
    ARTSet57[ARTTS_TORUS] = true;
    ARTSet57[ARTL_ART_torus] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS_CUBE] = true;
  }

  public void ARTSet83initialise() {
    ARTSet83 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet83, 0, artSetExtent, false);
    ARTSet83[ARTTS__PERIODtranslate] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS__LT] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS__SHREIK_EQUAL] = true;
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

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTS__GT] = true;
  }

  public void ARTSet63initialise() {
    ARTSet63 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet63, 0, artSetExtent, false);
    ARTSet63[ARTTB_ID] = true;
    ARTSet63[ARTTB_INTEGER] = true;
    ARTSet63[ARTTB_REAL] = true;
    ARTSet63[ARTTB_STRING_DQ] = true;
    ARTSet63[ARTTS__SHREIK] = true;
    ARTSet63[ARTTS__LPAR] = true;
    ARTSet63[ARTTS__MINUS] = true;
    ARTSet63[ARTTS_BOX] = true;
    ARTSet63[ARTTS_CONE] = true;
    ARTSet63[ARTTS_CUBE] = true;
    ARTSet63[ARTTS_CYLINDER] = true;
    ARTSet63[ARTTS_PYRAMID] = true;
    ARTSet63[ARTTS_SPHERE] = true;
    ARTSet63[ARTTS_TETRAHEDRON] = true;
    ARTSet63[ARTTS_TORUS] = true;
    ARTSet63[ARTL_ART_ID] = true;
    ARTSet63[ARTL_ART_INTEGER] = true;
    ARTSet63[ARTL_ART_REAL] = true;
    ARTSet63[ARTL_ART_STRING_DQ] = true;
    ARTSet63[ARTL_ART_add] = true;
    ARTSet63[ARTL_ART_and] = true;
    ARTSet63[ARTL_ART_box] = true;
    ARTSet63[ARTL_ART_cone] = true;
    ARTSet63[ARTL_ART_cube] = true;
    ARTSet63[ARTL_ART_cylinder] = true;
    ARTSet63[ARTL_ART_deref] = true;
    ARTSet63[ARTL_ART_div] = true;
    ARTSet63[ARTL_ART_eq] = true;
    ARTSet63[ARTL_ART_exp] = true;
    ARTSet63[ARTL_ART_ge] = true;
    ARTSet63[ARTL_ART_gt] = true;
    ARTSet63[ARTL_ART_le] = true;
    ARTSet63[ARTL_ART_lt] = true;
    ARTSet63[ARTL_ART_mod] = true;
    ARTSet63[ARTL_ART_mul] = true;
    ARTSet63[ARTL_ART_ne] = true;
    ARTSet63[ARTL_ART_neg] = true;
    ARTSet63[ARTL_ART_not] = true;
    ARTSet63[ARTL_ART_operand] = true;
    ARTSet63[ARTL_ART_or] = true;
    ARTSet63[ARTL_ART_printlnElem] = true;
    ARTSet63[ARTL_ART_pyramid] = true;
    ARTSet63[ARTL_ART_relExpr] = true;
    ARTSet63[ARTL_ART_sphere] = true;
    ARTSet63[ARTL_ART_sub] = true;
    ARTSet63[ARTL_ART_subExpr] = true;
    ARTSet63[ARTL_ART_tetrahedron] = true;
    ARTSet63[ARTL_ART_torus] = true;
    ARTSet63[ARTL_ART_xor] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__AMPERSAND_AMPERSAND] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS__STAR_STAR] = true;
  }

  public void ARTSet66initialise() {
    ARTSet66 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet66, 0, artSetExtent, false);
    ARTSet66[ARTTS__PERIODrotate] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTS_init] = true;
  }

  public void ARTSet74initialise() {
    ARTSet74 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet74, 0, artSetExtent, false);
    ARTSet74[ARTTS_println] = true;
    ARTSet74[ARTL_ART_println] = true;
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
    ARTSet9[ARTTS_BOX] = true;
    ARTSet9[ARTTS_CONE] = true;
    ARTSet9[ARTTS_CUBE] = true;
    ARTSet9[ARTTS_CYLINDER] = true;
    ARTSet9[ARTTS_PYRAMID] = true;
    ARTSet9[ARTTS_SPHERE] = true;
    ARTSet9[ARTTS_TETRAHEDRON] = true;
    ARTSet9[ARTTS_TORUS] = true;
    ARTSet9[ARTL_ART_ID] = true;
    ARTSet9[ARTL_ART_INTEGER] = true;
    ARTSet9[ARTL_ART_REAL] = true;
    ARTSet9[ARTL_ART_STRING_DQ] = true;
    ARTSet9[ARTL_ART_add] = true;
    ARTSet9[ARTL_ART_box] = true;
    ARTSet9[ARTL_ART_cone] = true;
    ARTSet9[ARTL_ART_cube] = true;
    ARTSet9[ARTL_ART_cylinder] = true;
    ARTSet9[ARTL_ART_deref] = true;
    ARTSet9[ARTL_ART_div] = true;
    ARTSet9[ARTL_ART_exp] = true;
    ARTSet9[ARTL_ART_mod] = true;
    ARTSet9[ARTL_ART_mul] = true;
    ARTSet9[ARTL_ART_neg] = true;
    ARTSet9[ARTL_ART_operand] = true;
    ARTSet9[ARTL_ART_pyramid] = true;
    ARTSet9[ARTL_ART_sphere] = true;
    ARTSet9[ARTL_ART_sub] = true;
    ARTSet9[ARTL_ART_subExpr] = true;
    ARTSet9[ARTL_ART_tetrahedron] = true;
    ARTSet9[ARTL_ART_torus] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[ARTTS_CONE] = true;
    ARTSet56[ARTL_ART_cone] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS_for] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTB_ID] = true;
    ARTSet15[ARTL_ART_ID] = true;
  }

  public void ARTSet71initialise() {
    ARTSet71 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet71, 0, artSetExtent, false);
    ARTSet71[ARTTS_if] = true;
    ARTSet71[ARTL_ART_if] = true;
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[ARTTB_STRING_DQ] = true;
    ARTSet51[ARTL_ART_STRING_DQ] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTB_ID] = true;
    ARTSet11[ARTTB_INTEGER] = true;
    ARTSet11[ARTTB_REAL] = true;
    ARTSet11[ARTTB_STRING_DQ] = true;
    ARTSet11[ARTTS__LPAR] = true;
    ARTSet11[ARTTS_BOX] = true;
    ARTSet11[ARTTS_CONE] = true;
    ARTSet11[ARTTS_CUBE] = true;
    ARTSet11[ARTTS_CYLINDER] = true;
    ARTSet11[ARTTS_PYRAMID] = true;
    ARTSet11[ARTTS_SPHERE] = true;
    ARTSet11[ARTTS_TETRAHEDRON] = true;
    ARTSet11[ARTTS_TORUS] = true;
    ARTSet11[ARTL_ART_ID] = true;
    ARTSet11[ARTL_ART_INTEGER] = true;
    ARTSet11[ARTL_ART_REAL] = true;
    ARTSet11[ARTL_ART_STRING_DQ] = true;
    ARTSet11[ARTL_ART_box] = true;
    ARTSet11[ARTL_ART_cone] = true;
    ARTSet11[ARTL_ART_cube] = true;
    ARTSet11[ARTL_ART_cylinder] = true;
    ARTSet11[ARTL_ART_deref] = true;
    ARTSet11[ARTL_ART_operand] = true;
    ARTSet11[ARTL_ART_pyramid] = true;
    ARTSet11[ARTL_ART_sphere] = true;
    ARTSet11[ARTL_ART_tetrahedron] = true;
    ARTSet11[ARTL_ART_torus] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[ARTTB_ID] = true;
    ARTSet50[ARTL_ART_ID] = true;
    ARTSet50[ARTL_ART_deref] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[ARTTS_BOX] = true;
    ARTSet52[ARTL_ART_box] = true;
  }

  public void ARTSet82initialise() {
    ARTSet82 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet82, 0, artSetExtent, false);
    ARTSet82[ARTTS_TORUS] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTB_ID] = true;
    ARTSet33[ARTTS_for] = true;
    ARTSet33[ARTTS_if] = true;
    ARTSet33[ARTTS_init] = true;
    ARTSet33[ARTTS_paint] = true;
    ARTSet33[ARTTS_println] = true;
    ARTSet33[ARTTS_while] = true;
    ARTSet33[ARTL_ART_ID] = true;
    ARTSet33[ARTL_ART_assign] = true;
    ARTSet33[ARTL_ART_compassign] = true;
    ARTSet33[ARTL_ART_deref] = true;
    ARTSet33[ARTL_ART_for] = true;
    ARTSet33[ARTL_ART_if] = true;
    ARTSet33[ARTL_ART_init] = true;
    ARTSet33[ARTL_ART_paint] = true;
    ARTSet33[ARTL_ART_println] = true;
    ARTSet33[ARTL_ART_rotate] = true;
    ARTSet33[ARTL_ART_scale] = true;
    ARTSet33[ARTL_ART_seq] = true;
    ARTSet33[ARTL_ART_statement] = true;
    ARTSet33[ARTL_ART_translate] = true;
    ARTSet33[ARTL_ART_while] = true;
  }

  public void ARTSet62initialise() {
    ARTSet62 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet62, 0, artSetExtent, false);
    ARTSet62[ARTTS_println] = true;
  }

  public void ARTSet59initialise() {
    ARTSet59 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet59, 0, artSetExtent, false);
    ARTSet59[ARTTS_PYRAMID] = true;
    ARTSet59[ARTL_ART_pyramid] = true;
  }

  public void ARTSet64initialise() {
    ARTSet64 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet64, 0, artSetExtent, false);
    ARTSet64[ARTTS_PYRAMID] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet67initialise() {
    ARTSet67 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet67, 0, artSetExtent, false);
    ARTSet67[ARTTS__PERIODscale] = true;
  }

  public void ARTSet85initialise() {
    ARTSet85 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet85, 0, artSetExtent, false);
    ARTSet85[ARTTS__UPARROW] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTS__SHREIK_EQUAL] = true;
    ARTSet3[ARTTS__PERCENT] = true;
    ARTSet3[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__STAR] = true;
    ARTSet3[ARTTS__STAR_STAR] = true;
    ARTSet3[ARTTS__PLUS] = true;
    ARTSet3[ARTTS__PLUS_EQUAL] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__PERIODrotate] = true;
    ARTSet3[ARTTS__PERIODscale] = true;
    ARTSet3[ARTTS__PERIODtranslate] = true;
    ARTSet3[ARTTS__SLASH] = true;
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__LT_EQUAL] = true;
    ARTSet3[ARTTS__EQUAL] = true;
    ARTSet3[ARTTS__EQUAL_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS__GT_EQUAL] = true;
    ARTSet3[ARTTS__UPARROW] = true;
    ARTSet3[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTX_EOS] = true;
    ARTSet16[ARTTB_ID] = true;
    ARTSet16[ARTTB_INTEGER] = true;
    ARTSet16[ARTTB_REAL] = true;
    ARTSet16[ARTTB_STRING_DQ] = true;
    ARTSet16[ARTTS__SHREIK] = true;
    ARTSet16[ARTTS__LPAR] = true;
    ARTSet16[ARTTS__RPAR] = true;
    ARTSet16[ARTTS__MINUS] = true;
    ARTSet16[ARTTS_BOX] = true;
    ARTSet16[ARTTS_CONE] = true;
    ARTSet16[ARTTS_CUBE] = true;
    ARTSet16[ARTTS_CYLINDER] = true;
    ARTSet16[ARTTS_PYRAMID] = true;
    ARTSet16[ARTTS_SPHERE] = true;
    ARTSet16[ARTTS_TETRAHEDRON] = true;
    ARTSet16[ARTTS_TORUS] = true;
    ARTSet16[ARTTS_for] = true;
    ARTSet16[ARTTS_if] = true;
    ARTSet16[ARTTS_init] = true;
    ARTSet16[ARTTS_paint] = true;
    ARTSet16[ARTTS_println] = true;
    ARTSet16[ARTTS_while] = true;
    ARTSet16[ARTTS__RBRACE] = true;
    ARTSet16[ARTL_ART_ID] = true;
    ARTSet16[ARTL_ART_INTEGER] = true;
    ARTSet16[ARTL_ART_REAL] = true;
    ARTSet16[ARTL_ART_STRING_DQ] = true;
    ARTSet16[ARTL_ART_add] = true;
    ARTSet16[ARTL_ART_and] = true;
    ARTSet16[ARTL_ART_assign] = true;
    ARTSet16[ARTL_ART_box] = true;
    ARTSet16[ARTL_ART_compassign] = true;
    ARTSet16[ARTL_ART_cone] = true;
    ARTSet16[ARTL_ART_cube] = true;
    ARTSet16[ARTL_ART_cylinder] = true;
    ARTSet16[ARTL_ART_deref] = true;
    ARTSet16[ARTL_ART_div] = true;
    ARTSet16[ARTL_ART_eq] = true;
    ARTSet16[ARTL_ART_exp] = true;
    ARTSet16[ARTL_ART_for] = true;
    ARTSet16[ARTL_ART_ge] = true;
    ARTSet16[ARTL_ART_gt] = true;
    ARTSet16[ARTL_ART_if] = true;
    ARTSet16[ARTL_ART_init] = true;
    ARTSet16[ARTL_ART_le] = true;
    ARTSet16[ARTL_ART_lt] = true;
    ARTSet16[ARTL_ART_mod] = true;
    ARTSet16[ARTL_ART_mul] = true;
    ARTSet16[ARTL_ART_ne] = true;
    ARTSet16[ARTL_ART_neg] = true;
    ARTSet16[ARTL_ART_not] = true;
    ARTSet16[ARTL_ART_operand] = true;
    ARTSet16[ARTL_ART_or] = true;
    ARTSet16[ARTL_ART_paint] = true;
    ARTSet16[ARTL_ART_println] = true;
    ARTSet16[ARTL_ART_pyramid] = true;
    ARTSet16[ARTL_ART_relExpr] = true;
    ARTSet16[ARTL_ART_rotate] = true;
    ARTSet16[ARTL_ART_scale] = true;
    ARTSet16[ARTL_ART_seq] = true;
    ARTSet16[ARTL_ART_sphere] = true;
    ARTSet16[ARTL_ART_statement] = true;
    ARTSet16[ARTL_ART_sub] = true;
    ARTSet16[ARTL_ART_subExpr] = true;
    ARTSet16[ARTL_ART_tetrahedron] = true;
    ARTSet16[ARTL_ART_torus] = true;
    ARTSet16[ARTL_ART_translate] = true;
    ARTSet16[ARTL_ART_while] = true;
    ARTSet16[ARTL_ART_xor] = true;
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
    ARTSet12[ARTTS_BOX] = true;
    ARTSet12[ARTTS_CONE] = true;
    ARTSet12[ARTTS_CUBE] = true;
    ARTSet12[ARTTS_CYLINDER] = true;
    ARTSet12[ARTTS_PYRAMID] = true;
    ARTSet12[ARTTS_SPHERE] = true;
    ARTSet12[ARTTS_TETRAHEDRON] = true;
    ARTSet12[ARTTS_TORUS] = true;
    ARTSet12[ARTL_ART_ID] = true;
    ARTSet12[ARTL_ART_INTEGER] = true;
    ARTSet12[ARTL_ART_REAL] = true;
    ARTSet12[ARTL_ART_STRING_DQ] = true;
    ARTSet12[ARTL_ART_add] = true;
    ARTSet12[ARTL_ART_and] = true;
    ARTSet12[ARTL_ART_box] = true;
    ARTSet12[ARTL_ART_cone] = true;
    ARTSet12[ARTL_ART_cube] = true;
    ARTSet12[ARTL_ART_cylinder] = true;
    ARTSet12[ARTL_ART_deref] = true;
    ARTSet12[ARTL_ART_div] = true;
    ARTSet12[ARTL_ART_eq] = true;
    ARTSet12[ARTL_ART_exp] = true;
    ARTSet12[ARTL_ART_ge] = true;
    ARTSet12[ARTL_ART_gt] = true;
    ARTSet12[ARTL_ART_le] = true;
    ARTSet12[ARTL_ART_lt] = true;
    ARTSet12[ARTL_ART_mod] = true;
    ARTSet12[ARTL_ART_mul] = true;
    ARTSet12[ARTL_ART_ne] = true;
    ARTSet12[ARTL_ART_neg] = true;
    ARTSet12[ARTL_ART_not] = true;
    ARTSet12[ARTL_ART_operand] = true;
    ARTSet12[ARTL_ART_or] = true;
    ARTSet12[ARTL_ART_pyramid] = true;
    ARTSet12[ARTL_ART_relExpr] = true;
    ARTSet12[ARTL_ART_sphere] = true;
    ARTSet12[ARTL_ART_sub] = true;
    ARTSet12[ARTL_ART_subExpr] = true;
    ARTSet12[ARTL_ART_tetrahedron] = true;
    ARTSet12[ARTL_ART_torus] = true;
    ARTSet12[ARTL_ART_xor] = true;
  }

  public void ARTSet68initialise() {
    ARTSet68 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet68, 0, artSetExtent, false);
    ARTSet68[ARTTS_SPHERE] = true;
  }

  public void ARTSet69initialise() {
    ARTSet69 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet69, 0, artSetExtent, false);
    ARTSet69[ARTTB_ID] = true;
    ARTSet69[ARTL_ART_ID] = true;
    ARTSet69[ARTL_ART_assign] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[ARTTS_SPHERE] = true;
    ARTSet54[ARTL_ART_sphere] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS__SHREIK_EQUAL] = true;
    ARTSet28[ARTTS__PERCENT] = true;
    ARTSet28[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet28[ARTTS__RPAR] = true;
    ARTSet28[ARTTS__STAR] = true;
    ARTSet28[ARTTS__STAR_STAR] = true;
    ARTSet28[ARTTS__PLUS] = true;
    ARTSet28[ARTTS__COMMA] = true;
    ARTSet28[ARTTS__MINUS] = true;
    ARTSet28[ARTTS__PERIODrotate] = true;
    ARTSet28[ARTTS__PERIODscale] = true;
    ARTSet28[ARTTS__PERIODtranslate] = true;
    ARTSet28[ARTTS__SLASH] = true;
    ARTSet28[ARTTS__SEMICOLON] = true;
    ARTSet28[ARTTS__LT] = true;
    ARTSet28[ARTTS__LT_EQUAL] = true;
    ARTSet28[ARTTS__EQUAL_EQUAL] = true;
    ARTSet28[ARTTS__GT] = true;
    ARTSet28[ARTTS__GT_EQUAL] = true;
    ARTSet28[ARTTS__UPARROW] = true;
    ARTSet28[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet76initialise() {
    ARTSet76 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet76, 0, artSetExtent, false);
    ARTSet76[ARTTS_paint] = true;
    ARTSet76[ARTL_ART_paint] = true;
  }

  public void ARTSet65initialise() {
    ARTSet65 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet65, 0, artSetExtent, false);
    ARTSet65[ARTTS__SHREIK] = true;
    ARTSet65[ARTL_ART_not] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTB_REAL] = true;
    ARTSet21[ARTL_ART_REAL] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS__PLUS_EQUAL] = true;
  }

  public void ARTSet81initialise() {
    ARTSet81 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet81, 0, artSetExtent, false);
    ARTSet81[ARTTS_TETRAHEDRON] = true;
  }

  public void ARTSet80initialise() {
    ARTSet80 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet80, 0, artSetExtent, false);
    ARTSet80[ARTTS__MINUS] = true;
    ARTSet80[ARTL_ART_neg] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTS__LBRACE] = true;
  }

  public void ARTSet73initialise() {
    ARTSet73 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet73, 0, artSetExtent, false);
    ARTSet73[ARTTS_for] = true;
    ARTSet73[ARTL_ART_for] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTS__RBRACE] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_REAL] = true;
  }

  public void ARTSet49initialise() {
    ARTSet49 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet49, 0, artSetExtent, false);
    ARTSet49[ARTTB_ID] = true;
    ARTSet49[ARTTB_INTEGER] = true;
    ARTSet49[ARTTB_REAL] = true;
    ARTSet49[ARTTB_STRING_DQ] = true;
    ARTSet49[ARTTS__LPAR] = true;
    ARTSet49[ARTTS_BOX] = true;
    ARTSet49[ARTTS_CONE] = true;
    ARTSet49[ARTTS_CUBE] = true;
    ARTSet49[ARTTS_CYLINDER] = true;
    ARTSet49[ARTTS_PYRAMID] = true;
    ARTSet49[ARTTS_SPHERE] = true;
    ARTSet49[ARTTS_TETRAHEDRON] = true;
    ARTSet49[ARTTS_TORUS] = true;
    ARTSet49[ARTL_ART_ID] = true;
    ARTSet49[ARTL_ART_INTEGER] = true;
    ARTSet49[ARTL_ART_REAL] = true;
    ARTSet49[ARTL_ART_STRING_DQ] = true;
    ARTSet49[ARTL_ART_box] = true;
    ARTSet49[ARTL_ART_cone] = true;
    ARTSet49[ARTL_ART_cube] = true;
    ARTSet49[ARTL_ART_cylinder] = true;
    ARTSet49[ARTL_ART_deref] = true;
    ARTSet49[ARTL_ART_pyramid] = true;
    ARTSet49[ARTL_ART_sphere] = true;
    ARTSet49[ARTL_ART_tetrahedron] = true;
    ARTSet49[ARTL_ART_torus] = true;
  }

  public void ARTSet60initialise() {
    ARTSet60 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet60, 0, artSetExtent, false);
    ARTSet60[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTS__LT_EQUAL] = true;
  }

  public void ARTSet72initialise() {
    ARTSet72 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet72, 0, artSetExtent, false);
    ARTSet72[ARTTS_while] = true;
    ARTSet72[ARTL_ART_while] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet25initialise();
    ARTSet27initialise();
    ARTSet70initialise();
    ARTSet78initialise();
    ARTSet41initialise();
    ARTSet75initialise();
    ARTSet58initialise();
    ARTSet61initialise();
    ARTSet53initialise();
    ARTSet84initialise();
    ARTSet6initialise();
    ARTSet77initialise();
    ARTSet13initialise();
    ARTSet79initialise();
    ARTSet38initialise();
    ARTSet39initialise();
    ARTSet30initialise();
    ARTSet48initialise();
    ARTSet44initialise();
    ARTSet55initialise();
    ARTSet20initialise();
    ARTSet23initialise();
    ARTSet19initialise();
    ARTSet45initialise();
    ARTSet10initialise();
    ARTSet22initialise();
    ARTSet47initialise();
    ARTSet29initialise();
    ARTSet57initialise();
    ARTSet26initialise();
    ARTSet83initialise();
    ARTSet18initialise();
    ARTSet43initialise();
    ARTSet46initialise();
    ARTSet17initialise();
    ARTSet4initialise();
    ARTSet37initialise();
    ARTSet63initialise();
    ARTSet36initialise();
    ARTSet14initialise();
    ARTSet31initialise();
    ARTSet66initialise();
    ARTSet40initialise();
    ARTSet74initialise();
    ARTSet9initialise();
    ARTSet56initialise();
    ARTSet32initialise();
    ARTSet15initialise();
    ARTSet71initialise();
    ARTSet51initialise();
    ARTSet11initialise();
    ARTSet50initialise();
    ARTSet52initialise();
    ARTSet82initialise();
    ARTSet33initialise();
    ARTSet62initialise();
    ARTSet59initialise();
    ARTSet64initialise();
    ARTSet2initialise();
    ARTSet67initialise();
    ARTSet85initialise();
    ARTSet3initialise();
    ARTSet5initialise();
    ARTSet16initialise();
    ARTSet12initialise();
    ARTSet68initialise();
    ARTSet69initialise();
    ARTSet54initialise();
    ARTSet28initialise();
    ARTSet76initialise();
    ARTSet65initialise();
    ARTSet8initialise();
    ARTSet21initialise();
    ARTSet24initialise();
    ARTSet81initialise();
    ARTSet80initialise();
    ARTSet34initialise();
    ARTSet73initialise();
    ARTSet35initialise();
    ARTSet7initialise();
    ARTSet49initialise();
    ARTSet60initialise();
    ARTSet42initialise();
    ARTSet72initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_658] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_658] = "";
    artlhsL[ARTL_ART_ID_658] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_658] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_658] = true;
    artFolds[ARTL_ART_ID_660] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_ID_659] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_659] = "";
    artlhsL[ARTL_ART_ID_659] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_659] = true;
    artLabelInternalStrings[ARTL_ART_ID_660] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_660] = "";
    artlhsL[ARTL_ART_ID_660] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_660] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_660] = true;
    arteoR_pL[ARTL_ART_ID_660] = true;
    artPopD[ARTL_ART_ID_660] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_664] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_664] = "";
    artlhsL[ARTL_ART_INTEGER_664] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_664] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_664] = true;
    artFolds[ARTL_ART_INTEGER_666] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_INTEGER_665] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_665] = "";
    artlhsL[ARTL_ART_INTEGER_665] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_665] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_666] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_666] = "";
    artlhsL[ARTL_ART_INTEGER_666] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_666] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_666] = true;
    arteoR_pL[ARTL_ART_INTEGER_666] = true;
    artPopD[ARTL_ART_INTEGER_666] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_670] = "REAL ::= . &REAL  ";
    artLabelStrings[ARTL_ART_REAL_670] = "";
    artlhsL[ARTL_ART_REAL_670] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_670] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_670] = true;
    artFolds[ARTL_ART_REAL_672] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_REAL_671] = "REAL ::= &REAL  ";
    artLabelStrings[ARTL_ART_REAL_671] = "";
    artlhsL[ARTL_ART_REAL_671] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_671] = true;
    artLabelInternalStrings[ARTL_ART_REAL_672] = "REAL ::= &REAL  .";
    artLabelStrings[ARTL_ART_REAL_672] = "";
    artlhsL[ARTL_ART_REAL_672] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_672] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_672] = true;
    arteoR_pL[ARTL_ART_REAL_672] = true;
    artPopD[ARTL_ART_REAL_672] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_676] = "STRING_DQ ::= . &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_676] = "";
    artlhsL[ARTL_ART_STRING_DQ_676] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_676] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_676] = true;
    artFolds[ARTL_ART_STRING_DQ_678] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_677] = "STRING_DQ ::= &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_677] = "";
    artlhsL[ARTL_ART_STRING_DQ_677] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_677] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_678] = "STRING_DQ ::= &STRING_DQ  .";
    artLabelStrings[ARTL_ART_STRING_DQ_678] = "";
    artlhsL[ARTL_ART_STRING_DQ_678] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_678] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_678] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_678] = true;
    artPopD[ARTL_ART_STRING_DQ_678] = true;
  }

  public void artTableInitialiser_ART_add() {
    artLabelInternalStrings[ARTL_ART_add] = "add";
    artLabelStrings[ARTL_ART_add] = "add";
    artKindOfs[ARTL_ART_add] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_add_448] = "add ::= . subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_448] = "";
    artlhsL[ARTL_ART_add_448] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_448] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_450] = "add ::= subExpr . '+'  operand ";
    artLabelStrings[ARTL_ART_add_450] = "";
    artlhsL[ARTL_ART_add_450] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_450] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_add_450] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_add_450] = true;
    artFolds[ARTL_ART_add_452] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_add_451] = "add ::= subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_451] = "";
    artlhsL[ARTL_ART_add_451] = ARTL_ART_add;
    artLabelInternalStrings[ARTL_ART_add_452] = "add ::= subExpr '+'  . operand ";
    artLabelStrings[ARTL_ART_add_452] = "";
    artlhsL[ARTL_ART_add_452] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_452] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_454] = "add ::= subExpr '+'  operand .";
    artLabelStrings[ARTL_ART_add_454] = "";
    artlhsL[ARTL_ART_add_454] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_454] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_add_454] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_add_454] = true;
    arteoR_pL[ARTL_ART_add_454] = true;
    artPopD[ARTL_ART_add_454] = true;
  }

  public void artTableInitialiser_ART_and() {
    artLabelInternalStrings[ARTL_ART_and] = "and";
    artLabelStrings[ARTL_ART_and] = "and";
    artKindOfs[ARTL_ART_and] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_and_370] = "and ::= . relExpr '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_370] = "";
    artlhsL[ARTL_ART_and_370] = ARTL_ART_and;
    artKindOfs[ARTL_ART_and_370] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_and_372] = "and ::= relExpr . '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_372] = "";
    artlhsL[ARTL_ART_and_372] = ARTL_ART_and;
    artSlotInstanceOfs[ARTL_ART_and_372] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_and_372] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_and_372] = true;
    artFolds[ARTL_ART_and_374] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_and_373] = "and ::= relExpr '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_373] = "";
    artlhsL[ARTL_ART_and_373] = ARTL_ART_and;
    artLabelInternalStrings[ARTL_ART_and_374] = "and ::= relExpr '&&'  . relExpr ";
    artLabelStrings[ARTL_ART_and_374] = "";
    artlhsL[ARTL_ART_and_374] = ARTL_ART_and;
    artKindOfs[ARTL_ART_and_374] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_and_376] = "and ::= relExpr '&&'  relExpr .";
    artLabelStrings[ARTL_ART_and_376] = "";
    artlhsL[ARTL_ART_and_376] = ARTL_ART_and;
    artSlotInstanceOfs[ARTL_ART_and_376] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_and_376] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_and_376] = true;
    arteoR_pL[ARTL_ART_and_376] = true;
    artPopD[ARTL_ART_and_376] = true;
  }

  public void artTableInitialiser_ART_assign() {
    artLabelInternalStrings[ARTL_ART_assign] = "assign";
    artLabelStrings[ARTL_ART_assign] = "assign";
    artKindOfs[ARTL_ART_assign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_assign_56] = "assign ::= . ID '='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_56] = "";
    artlhsL[ARTL_ART_assign_56] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_56] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_58] = "assign ::= ID . '='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_58] = "";
    artlhsL[ARTL_ART_assign_58] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_58] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_assign_58] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_assign_58] = true;
    artFolds[ARTL_ART_assign_60] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_59] = "assign ::= ID '='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_59] = "";
    artlhsL[ARTL_ART_assign_59] = ARTL_ART_assign;
    artLabelInternalStrings[ARTL_ART_assign_60] = "assign ::= ID '='  . relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_60] = "";
    artlhsL[ARTL_ART_assign_60] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_60] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_assign_62] = "assign ::= ID '='  relExpr . ';'  ";
    artLabelStrings[ARTL_ART_assign_62] = "";
    artlhsL[ARTL_ART_assign_62] = ARTL_ART_assign;
    artSlotInstanceOfs[ARTL_ART_assign_62] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_assign_62] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_assign_62] = true;
    artFolds[ARTL_ART_assign_64] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_assign_63] = "assign ::= ID '='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_assign_63] = "";
    artlhsL[ARTL_ART_assign_63] = ARTL_ART_assign;
    artPopD[ARTL_ART_assign_63] = true;
    artLabelInternalStrings[ARTL_ART_assign_64] = "assign ::= ID '='  relExpr ';'  .";
    artLabelStrings[ARTL_ART_assign_64] = "";
    artlhsL[ARTL_ART_assign_64] = ARTL_ART_assign;
    artKindOfs[ARTL_ART_assign_64] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_assign_64] = true;
    arteoR_pL[ARTL_ART_assign_64] = true;
    artPopD[ARTL_ART_assign_64] = true;
  }

  public void artTableInitialiser_ART_box() {
    artLabelInternalStrings[ARTL_ART_box] = "box";
    artLabelStrings[ARTL_ART_box] = "box";
    artKindOfs[ARTL_ART_box] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_box_554] = "box ::= . 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_554] = "";
    artlhsL[ARTL_ART_box_554] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_554] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_box_556] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_555] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_555] = "";
    artlhsL[ARTL_ART_box_555] = ARTL_ART_box;
    artLabelInternalStrings[ARTL_ART_box_556] = "box ::= 'BOX'  . '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_556] = "";
    artlhsL[ARTL_ART_box_556] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_556] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_box_556] = true;
    artFolds[ARTL_ART_box_558] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_557] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_557] = "";
    artlhsL[ARTL_ART_box_557] = ARTL_ART_box;
    artLabelInternalStrings[ARTL_ART_box_558] = "box ::= 'BOX'  '('  . REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_558] = "";
    artlhsL[ARTL_ART_box_558] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_558] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_box_560] = "box ::= 'BOX'  '('  REAL . ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_560] = "";
    artlhsL[ARTL_ART_box_560] = ARTL_ART_box;
    artSlotInstanceOfs[ARTL_ART_box_560] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_box_560] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_box_562] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_561] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_561] = "";
    artlhsL[ARTL_ART_box_561] = ARTL_ART_box;
    artLabelInternalStrings[ARTL_ART_box_562] = "box ::= 'BOX'  '('  REAL ','  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_562] = "";
    artlhsL[ARTL_ART_box_562] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_562] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_box_564] = "box ::= 'BOX'  '('  REAL ','  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_564] = "";
    artlhsL[ARTL_ART_box_564] = ARTL_ART_box;
    artSlotInstanceOfs[ARTL_ART_box_564] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_box_564] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_box_566] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_565] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_565] = "";
    artlhsL[ARTL_ART_box_565] = ARTL_ART_box;
    artLabelInternalStrings[ARTL_ART_box_566] = "box ::= 'BOX'  '('  REAL ','  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_box_566] = "";
    artlhsL[ARTL_ART_box_566] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_566] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_box_568] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_box_568] = "";
    artlhsL[ARTL_ART_box_568] = ARTL_ART_box;
    artSlotInstanceOfs[ARTL_ART_box_568] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_box_568] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_box_568] = true;
    artFolds[ARTL_ART_box_570] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_569] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_569] = "";
    artlhsL[ARTL_ART_box_569] = ARTL_ART_box;
    artPopD[ARTL_ART_box_569] = true;
    artLabelInternalStrings[ARTL_ART_box_570] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_box_570] = "";
    artlhsL[ARTL_ART_box_570] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_570] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_box_570] = true;
    arteoR_pL[ARTL_ART_box_570] = true;
    artPopD[ARTL_ART_box_570] = true;
  }

  public void artTableInitialiser_ART_compassign() {
    artLabelInternalStrings[ARTL_ART_compassign] = "compassign";
    artLabelStrings[ARTL_ART_compassign] = "compassign";
    artKindOfs[ARTL_ART_compassign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_compassign_66] = "compassign ::= . ID '+='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_compassign_66] = "";
    artlhsL[ARTL_ART_compassign_66] = ARTL_ART_compassign;
    artKindOfs[ARTL_ART_compassign_66] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_compassign_68] = "compassign ::= ID . '+='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_compassign_68] = "";
    artlhsL[ARTL_ART_compassign_68] = ARTL_ART_compassign;
    artSlotInstanceOfs[ARTL_ART_compassign_68] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_compassign_68] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_compassign_68] = true;
    artFolds[ARTL_ART_compassign_70] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_compassign_69] = "compassign ::= ID '+='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_compassign_69] = "";
    artlhsL[ARTL_ART_compassign_69] = ARTL_ART_compassign;
    artLabelInternalStrings[ARTL_ART_compassign_70] = "compassign ::= ID '+='  . relExpr ';'  ";
    artLabelStrings[ARTL_ART_compassign_70] = "";
    artlhsL[ARTL_ART_compassign_70] = ARTL_ART_compassign;
    artKindOfs[ARTL_ART_compassign_70] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_compassign_72] = "compassign ::= ID '+='  relExpr . ';'  ";
    artLabelStrings[ARTL_ART_compassign_72] = "";
    artlhsL[ARTL_ART_compassign_72] = ARTL_ART_compassign;
    artSlotInstanceOfs[ARTL_ART_compassign_72] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_compassign_72] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_compassign_72] = true;
    artFolds[ARTL_ART_compassign_74] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_compassign_73] = "compassign ::= ID '+='  relExpr ';'  ";
    artLabelStrings[ARTL_ART_compassign_73] = "";
    artlhsL[ARTL_ART_compassign_73] = ARTL_ART_compassign;
    artPopD[ARTL_ART_compassign_73] = true;
    artLabelInternalStrings[ARTL_ART_compassign_74] = "compassign ::= ID '+='  relExpr ';'  .";
    artLabelStrings[ARTL_ART_compassign_74] = "";
    artlhsL[ARTL_ART_compassign_74] = ARTL_ART_compassign;
    artKindOfs[ARTL_ART_compassign_74] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_compassign_74] = true;
    arteoR_pL[ARTL_ART_compassign_74] = true;
    artPopD[ARTL_ART_compassign_74] = true;
  }

  public void artTableInitialiser_ART_cone() {
    artLabelInternalStrings[ARTL_ART_cone] = "cone";
    artLabelStrings[ARTL_ART_cone] = "cone";
    artKindOfs[ARTL_ART_cone] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_cone_606] = "cone ::= . 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_606] = "";
    artlhsL[ARTL_ART_cone_606] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_606] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cone_608] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cone_607] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_607] = "";
    artlhsL[ARTL_ART_cone_607] = ARTL_ART_cone;
    artLabelInternalStrings[ARTL_ART_cone_608] = "cone ::= 'CONE'  . '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_608] = "";
    artlhsL[ARTL_ART_cone_608] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_608] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_cone_608] = true;
    artFolds[ARTL_ART_cone_610] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cone_609] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_609] = "";
    artlhsL[ARTL_ART_cone_609] = ARTL_ART_cone;
    artLabelInternalStrings[ARTL_ART_cone_610] = "cone ::= 'CONE'  '('  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_610] = "";
    artlhsL[ARTL_ART_cone_610] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_610] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cone_612] = "cone ::= 'CONE'  '('  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_612] = "";
    artlhsL[ARTL_ART_cone_612] = ARTL_ART_cone;
    artSlotInstanceOfs[ARTL_ART_cone_612] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cone_612] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cone_614] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cone_613] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_613] = "";
    artlhsL[ARTL_ART_cone_613] = ARTL_ART_cone;
    artLabelInternalStrings[ARTL_ART_cone_614] = "cone ::= 'CONE'  '('  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_614] = "";
    artlhsL[ARTL_ART_cone_614] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_614] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cone_616] = "cone ::= 'CONE'  '('  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_cone_616] = "";
    artlhsL[ARTL_ART_cone_616] = ARTL_ART_cone;
    artSlotInstanceOfs[ARTL_ART_cone_616] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cone_616] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_cone_616] = true;
    artFolds[ARTL_ART_cone_618] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cone_617] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_617] = "";
    artlhsL[ARTL_ART_cone_617] = ARTL_ART_cone;
    artPopD[ARTL_ART_cone_617] = true;
    artLabelInternalStrings[ARTL_ART_cone_618] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_cone_618] = "";
    artlhsL[ARTL_ART_cone_618] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_618] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_cone_618] = true;
    arteoR_pL[ARTL_ART_cone_618] = true;
    artPopD[ARTL_ART_cone_618] = true;
  }

  public void artTableInitialiser_ART_cube() {
    artLabelInternalStrings[ARTL_ART_cube] = "cube";
    artLabelStrings[ARTL_ART_cube] = "cube";
    artKindOfs[ARTL_ART_cube] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_cube_572] = "cube ::= . 'CUBE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_572] = "";
    artlhsL[ARTL_ART_cube_572] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_cube_572] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cube_574] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cube_573] = "cube ::= 'CUBE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_573] = "";
    artlhsL[ARTL_ART_cube_573] = ARTL_ART_cube;
    artLabelInternalStrings[ARTL_ART_cube_574] = "cube ::= 'CUBE'  . '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_574] = "";
    artlhsL[ARTL_ART_cube_574] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_cube_574] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_cube_574] = true;
    artFolds[ARTL_ART_cube_576] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cube_575] = "cube ::= 'CUBE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_575] = "";
    artlhsL[ARTL_ART_cube_575] = ARTL_ART_cube;
    artLabelInternalStrings[ARTL_ART_cube_576] = "cube ::= 'CUBE'  '('  . REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_576] = "";
    artlhsL[ARTL_ART_cube_576] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_cube_576] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cube_578] = "cube ::= 'CUBE'  '('  REAL . ')'  ";
    artLabelStrings[ARTL_ART_cube_578] = "";
    artlhsL[ARTL_ART_cube_578] = ARTL_ART_cube;
    artSlotInstanceOfs[ARTL_ART_cube_578] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cube_578] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_cube_578] = true;
    artFolds[ARTL_ART_cube_580] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cube_579] = "cube ::= 'CUBE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_579] = "";
    artlhsL[ARTL_ART_cube_579] = ARTL_ART_cube;
    artPopD[ARTL_ART_cube_579] = true;
    artLabelInternalStrings[ARTL_ART_cube_580] = "cube ::= 'CUBE'  '('  REAL ')'  .";
    artLabelStrings[ARTL_ART_cube_580] = "";
    artlhsL[ARTL_ART_cube_580] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_cube_580] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_cube_580] = true;
    arteoR_pL[ARTL_ART_cube_580] = true;
    artPopD[ARTL_ART_cube_580] = true;
  }

  public void artTableInitialiser_ART_cylinder() {
    artLabelInternalStrings[ARTL_ART_cylinder] = "cylinder";
    artLabelStrings[ARTL_ART_cylinder] = "cylinder";
    artKindOfs[ARTL_ART_cylinder] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_cylinder_592] = "cylinder ::= . 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_592] = "";
    artlhsL[ARTL_ART_cylinder_592] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_592] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cylinder_594] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cylinder_593] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_593] = "";
    artlhsL[ARTL_ART_cylinder_593] = ARTL_ART_cylinder;
    artLabelInternalStrings[ARTL_ART_cylinder_594] = "cylinder ::= 'CYLINDER'  . '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_594] = "";
    artlhsL[ARTL_ART_cylinder_594] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_594] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_cylinder_594] = true;
    artFolds[ARTL_ART_cylinder_596] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cylinder_595] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_595] = "";
    artlhsL[ARTL_ART_cylinder_595] = ARTL_ART_cylinder;
    artLabelInternalStrings[ARTL_ART_cylinder_596] = "cylinder ::= 'CYLINDER'  '('  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_596] = "";
    artlhsL[ARTL_ART_cylinder_596] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_596] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cylinder_598] = "cylinder ::= 'CYLINDER'  '('  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_598] = "";
    artlhsL[ARTL_ART_cylinder_598] = ARTL_ART_cylinder;
    artSlotInstanceOfs[ARTL_ART_cylinder_598] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cylinder_598] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cylinder_600] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cylinder_599] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_599] = "";
    artlhsL[ARTL_ART_cylinder_599] = ARTL_ART_cylinder;
    artLabelInternalStrings[ARTL_ART_cylinder_600] = "cylinder ::= 'CYLINDER'  '('  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_600] = "";
    artlhsL[ARTL_ART_cylinder_600] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_600] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cylinder_602] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_cylinder_602] = "";
    artlhsL[ARTL_ART_cylinder_602] = ARTL_ART_cylinder;
    artSlotInstanceOfs[ARTL_ART_cylinder_602] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cylinder_602] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_cylinder_602] = true;
    artFolds[ARTL_ART_cylinder_604] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cylinder_603] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_603] = "";
    artlhsL[ARTL_ART_cylinder_603] = ARTL_ART_cylinder;
    artPopD[ARTL_ART_cylinder_603] = true;
    artLabelInternalStrings[ARTL_ART_cylinder_604] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_cylinder_604] = "";
    artlhsL[ARTL_ART_cylinder_604] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_604] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_cylinder_604] = true;
    arteoR_pL[ARTL_ART_cylinder_604] = true;
    artPopD[ARTL_ART_cylinder_604] = true;
  }

  public void artTableInitialiser_ART_deref() {
    artLabelInternalStrings[ARTL_ART_deref] = "deref";
    artLabelStrings[ARTL_ART_deref] = "deref";
    artKindOfs[ARTL_ART_deref] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_deref_550] = "deref ::= . ID ";
    artLabelStrings[ARTL_ART_deref_550] = "";
    artlhsL[ARTL_ART_deref_550] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_deref_550] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_deref_552] = "deref ::= ID .";
    artLabelStrings[ARTL_ART_deref_552] = "";
    artlhsL[ARTL_ART_deref_552] = ARTL_ART_deref;
    artSlotInstanceOfs[ARTL_ART_deref_552] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_deref_552] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_deref_552] = true;
    arteoR_pL[ARTL_ART_deref_552] = true;
    artPopD[ARTL_ART_deref_552] = true;
  }

  public void artTableInitialiser_ART_div() {
    artLabelInternalStrings[ARTL_ART_div] = "div";
    artLabelStrings[ARTL_ART_div] = "div";
    artKindOfs[ARTL_ART_div] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_div_464] = "div ::= . subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_464] = "";
    artlhsL[ARTL_ART_div_464] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_464] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_466] = "div ::= subExpr . '/'  operand ";
    artLabelStrings[ARTL_ART_div_466] = "";
    artlhsL[ARTL_ART_div_466] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_466] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_div_466] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_div_466] = true;
    artFolds[ARTL_ART_div_468] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_div_467] = "div ::= subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_467] = "";
    artlhsL[ARTL_ART_div_467] = ARTL_ART_div;
    artLabelInternalStrings[ARTL_ART_div_468] = "div ::= subExpr '/'  . operand ";
    artLabelStrings[ARTL_ART_div_468] = "";
    artlhsL[ARTL_ART_div_468] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_468] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_470] = "div ::= subExpr '/'  operand .";
    artLabelStrings[ARTL_ART_div_470] = "";
    artlhsL[ARTL_ART_div_470] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_470] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_div_470] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_div_470] = true;
    arteoR_pL[ARTL_ART_div_470] = true;
    artPopD[ARTL_ART_div_470] = true;
  }

  public void artTableInitialiser_ART_eq() {
    artLabelInternalStrings[ARTL_ART_eq] = "eq";
    artLabelStrings[ARTL_ART_eq] = "eq";
    artKindOfs[ARTL_ART_eq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_eq_322] = "eq ::= . relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_322] = "";
    artlhsL[ARTL_ART_eq_322] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_322] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_324] = "eq ::= relExpr . '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_324] = "";
    artlhsL[ARTL_ART_eq_324] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_324] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_eq_324] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_eq_324] = true;
    artFolds[ARTL_ART_eq_326] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_eq_325] = "eq ::= relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_325] = "";
    artlhsL[ARTL_ART_eq_325] = ARTL_ART_eq;
    artLabelInternalStrings[ARTL_ART_eq_326] = "eq ::= relExpr '=='  . subExpr ";
    artLabelStrings[ARTL_ART_eq_326] = "";
    artlhsL[ARTL_ART_eq_326] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_326] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_328] = "eq ::= relExpr '=='  subExpr .";
    artLabelStrings[ARTL_ART_eq_328] = "";
    artlhsL[ARTL_ART_eq_328] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_328] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_eq_328] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_eq_328] = true;
    arteoR_pL[ARTL_ART_eq_328] = true;
    artPopD[ARTL_ART_eq_328] = true;
  }

  public void artTableInitialiser_ART_exp() {
    artLabelInternalStrings[ARTL_ART_exp] = "exp";
    artLabelStrings[ARTL_ART_exp] = "exp";
    artKindOfs[ARTL_ART_exp] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_exp_486] = "exp ::= . subExpr '**'  operand ";
    artLabelStrings[ARTL_ART_exp_486] = "";
    artlhsL[ARTL_ART_exp_486] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_exp_486] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_exp_488] = "exp ::= subExpr . '**'  operand ";
    artLabelStrings[ARTL_ART_exp_488] = "";
    artlhsL[ARTL_ART_exp_488] = ARTL_ART_exp;
    artSlotInstanceOfs[ARTL_ART_exp_488] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_exp_488] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_exp_488] = true;
    artFolds[ARTL_ART_exp_490] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_exp_489] = "exp ::= subExpr '**'  operand ";
    artLabelStrings[ARTL_ART_exp_489] = "";
    artlhsL[ARTL_ART_exp_489] = ARTL_ART_exp;
    artLabelInternalStrings[ARTL_ART_exp_490] = "exp ::= subExpr '**'  . operand ";
    artLabelStrings[ARTL_ART_exp_490] = "";
    artlhsL[ARTL_ART_exp_490] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_exp_490] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_exp_492] = "exp ::= subExpr '**'  operand .";
    artLabelStrings[ARTL_ART_exp_492] = "";
    artlhsL[ARTL_ART_exp_492] = ARTL_ART_exp;
    artSlotInstanceOfs[ARTL_ART_exp_492] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_exp_492] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_exp_492] = true;
    arteoR_pL[ARTL_ART_exp_492] = true;
    artPopD[ARTL_ART_exp_492] = true;
  }

  public void artTableInitialiser_ART_for() {
    artLabelInternalStrings[ARTL_ART_for] = "for";
    artLabelStrings[ARTL_ART_for] = "for";
    artKindOfs[ARTL_ART_for] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_for_132] = "for ::= . 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_132] = "";
    artlhsL[ARTL_ART_for_132] = ARTL_ART_for;
    artKindOfs[ARTL_ART_for_132] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_for_134] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_for_133] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_133] = "";
    artlhsL[ARTL_ART_for_133] = ARTL_ART_for;
    artLabelInternalStrings[ARTL_ART_for_134] = "for ::= 'for'  . '('  statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_134] = "";
    artlhsL[ARTL_ART_for_134] = ARTL_ART_for;
    artKindOfs[ARTL_ART_for_134] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_for_134] = true;
    artFolds[ARTL_ART_for_136] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_for_135] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_135] = "";
    artlhsL[ARTL_ART_for_135] = ARTL_ART_for;
    artLabelInternalStrings[ARTL_ART_for_136] = "for ::= 'for'  '('  . statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_136] = "";
    artlhsL[ARTL_ART_for_136] = ARTL_ART_for;
    artKindOfs[ARTL_ART_for_136] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_for_138] = "for ::= 'for'  '('  statement . relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_138] = "";
    artlhsL[ARTL_ART_for_138] = ARTL_ART_for;
    artSlotInstanceOfs[ARTL_ART_for_138] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_for_138] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_for_140] = "for ::= 'for'  '('  statement relExpr . ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_140] = "";
    artlhsL[ARTL_ART_for_140] = ARTL_ART_for;
    artSlotInstanceOfs[ARTL_ART_for_140] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_for_140] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_for_142] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_for_141] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_141] = "";
    artlhsL[ARTL_ART_for_141] = ARTL_ART_for;
    artLabelInternalStrings[ARTL_ART_for_142] = "for ::= 'for'  '('  statement relExpr ';'  . statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_142] = "";
    artlhsL[ARTL_ART_for_142] = ARTL_ART_for;
    artKindOfs[ARTL_ART_for_142] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_for_144] = "for ::= 'for'  '('  statement relExpr ';'  statement . ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_144] = "";
    artlhsL[ARTL_ART_for_144] = ARTL_ART_for;
    artSlotInstanceOfs[ARTL_ART_for_144] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_for_144] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_for_146] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_for_145] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_145] = "";
    artlhsL[ARTL_ART_for_145] = ARTL_ART_for;
    artLabelInternalStrings[ARTL_ART_for_146] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  . '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_146] = "";
    artlhsL[ARTL_ART_for_146] = ARTL_ART_for;
    artKindOfs[ARTL_ART_for_146] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_for_148] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_for_147] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_147] = "";
    artlhsL[ARTL_ART_for_147] = ARTL_ART_for;
    artLabelInternalStrings[ARTL_ART_for_148] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  . statement '}'  ";
    artLabelStrings[ARTL_ART_for_148] = "";
    artlhsL[ARTL_ART_for_148] = ARTL_ART_for;
    artKindOfs[ARTL_ART_for_148] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_for_150] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement . '}'  ";
    artLabelStrings[ARTL_ART_for_150] = "";
    artlhsL[ARTL_ART_for_150] = ARTL_ART_for;
    artSlotInstanceOfs[ARTL_ART_for_150] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_for_150] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_for_150] = true;
    artFolds[ARTL_ART_for_152] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_for_151] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_for_151] = "";
    artlhsL[ARTL_ART_for_151] = ARTL_ART_for;
    artPopD[ARTL_ART_for_151] = true;
    artLabelInternalStrings[ARTL_ART_for_152] = "for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  .";
    artLabelStrings[ARTL_ART_for_152] = "";
    artlhsL[ARTL_ART_for_152] = ARTL_ART_for;
    artKindOfs[ARTL_ART_for_152] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_for_152] = true;
    arteoR_pL[ARTL_ART_for_152] = true;
    artPopD[ARTL_ART_for_152] = true;
  }

  public void artTableInitialiser_ART_ge() {
    artLabelInternalStrings[ARTL_ART_ge] = "ge";
    artLabelStrings[ARTL_ART_ge] = "ge";
    artKindOfs[ARTL_ART_ge] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ge_346] = "ge ::= . relExpr '>='  subExpr ";
    artLabelStrings[ARTL_ART_ge_346] = "";
    artlhsL[ARTL_ART_ge_346] = ARTL_ART_ge;
    artKindOfs[ARTL_ART_ge_346] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ge_348] = "ge ::= relExpr . '>='  subExpr ";
    artLabelStrings[ARTL_ART_ge_348] = "";
    artlhsL[ARTL_ART_ge_348] = ARTL_ART_ge;
    artSlotInstanceOfs[ARTL_ART_ge_348] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_ge_348] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ge_348] = true;
    artFolds[ARTL_ART_ge_350] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_ge_349] = "ge ::= relExpr '>='  subExpr ";
    artLabelStrings[ARTL_ART_ge_349] = "";
    artlhsL[ARTL_ART_ge_349] = ARTL_ART_ge;
    artLabelInternalStrings[ARTL_ART_ge_350] = "ge ::= relExpr '>='  . subExpr ";
    artLabelStrings[ARTL_ART_ge_350] = "";
    artlhsL[ARTL_ART_ge_350] = ARTL_ART_ge;
    artKindOfs[ARTL_ART_ge_350] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ge_352] = "ge ::= relExpr '>='  subExpr .";
    artLabelStrings[ARTL_ART_ge_352] = "";
    artlhsL[ARTL_ART_ge_352] = ARTL_ART_ge;
    artSlotInstanceOfs[ARTL_ART_ge_352] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_ge_352] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ge_352] = true;
    arteoR_pL[ARTL_ART_ge_352] = true;
    artPopD[ARTL_ART_ge_352] = true;
  }

  public void artTableInitialiser_ART_gt() {
    artLabelInternalStrings[ARTL_ART_gt] = "gt";
    artLabelStrings[ARTL_ART_gt] = "gt";
    artKindOfs[ARTL_ART_gt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_gt_338] = "gt ::= . relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_338] = "";
    artlhsL[ARTL_ART_gt_338] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_338] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_340] = "gt ::= relExpr . '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_340] = "";
    artlhsL[ARTL_ART_gt_340] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_340] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_gt_340] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_gt_340] = true;
    artFolds[ARTL_ART_gt_342] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_gt_341] = "gt ::= relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_341] = "";
    artlhsL[ARTL_ART_gt_341] = ARTL_ART_gt;
    artLabelInternalStrings[ARTL_ART_gt_342] = "gt ::= relExpr '>'  . subExpr ";
    artLabelStrings[ARTL_ART_gt_342] = "";
    artlhsL[ARTL_ART_gt_342] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_342] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_344] = "gt ::= relExpr '>'  subExpr .";
    artLabelStrings[ARTL_ART_gt_344] = "";
    artlhsL[ARTL_ART_gt_344] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_344] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_gt_344] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_gt_344] = true;
    arteoR_pL[ARTL_ART_gt_344] = true;
    artPopD[ARTL_ART_gt_344] = true;
  }

  public void artTableInitialiser_ART_if() {
    artLabelInternalStrings[ARTL_ART_if] = "if";
    artLabelStrings[ARTL_ART_if] = "if";
    artKindOfs[ARTL_ART_if] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_if_76] = "if ::= . 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_76] = "";
    artlhsL[ARTL_ART_if_76] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_76] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_78] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_77] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_77] = "";
    artlhsL[ARTL_ART_if_77] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_78] = "if ::= 'if'  . '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_78] = "";
    artlhsL[ARTL_ART_if_78] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_78] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_if_78] = true;
    artFolds[ARTL_ART_if_80] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_79] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_79] = "";
    artlhsL[ARTL_ART_if_79] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_80] = "if ::= 'if'  '('  . relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_80] = "";
    artlhsL[ARTL_ART_if_80] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_80] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_82] = "if ::= 'if'  '('  relExpr . ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_82] = "";
    artlhsL[ARTL_ART_if_82] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_82] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_if_82] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_84] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_83] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_83] = "";
    artlhsL[ARTL_ART_if_83] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_84] = "if ::= 'if'  '('  relExpr ')'  . '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_84] = "";
    artlhsL[ARTL_ART_if_84] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_84] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_86] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_85] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_85] = "";
    artlhsL[ARTL_ART_if_85] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_86] = "if ::= 'if'  '('  relExpr ')'  '{'  . statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_86] = "";
    artlhsL[ARTL_ART_if_86] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_86] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_88] = "if ::= 'if'  '('  relExpr ')'  '{'  statement . '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_88] = "";
    artlhsL[ARTL_ART_if_88] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_88] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_88] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_90] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_89] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_89] = "";
    artlhsL[ARTL_ART_if_89] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_90] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  . 'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_90] = "";
    artlhsL[ARTL_ART_if_90] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_90] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_92] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_91] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_91] = "";
    artlhsL[ARTL_ART_if_91] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_92] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  . '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_92] = "";
    artlhsL[ARTL_ART_if_92] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_92] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_94] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_93] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_93] = "";
    artlhsL[ARTL_ART_if_93] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_94] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  . statement '}'  ";
    artLabelStrings[ARTL_ART_if_94] = "";
    artlhsL[ARTL_ART_if_94] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_94] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_96] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement . '}'  ";
    artLabelStrings[ARTL_ART_if_96] = "";
    artlhsL[ARTL_ART_if_96] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_96] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_96] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_if_96] = true;
    artFolds[ARTL_ART_if_98] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_97] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_97] = "";
    artlhsL[ARTL_ART_if_97] = ARTL_ART_if;
    artPopD[ARTL_ART_if_97] = true;
    artLabelInternalStrings[ARTL_ART_if_98] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  .";
    artLabelStrings[ARTL_ART_if_98] = "";
    artlhsL[ARTL_ART_if_98] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_98] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_if_98] = true;
    arteoR_pL[ARTL_ART_if_98] = true;
    artPopD[ARTL_ART_if_98] = true;
    artLabelInternalStrings[ARTL_ART_if_100] = "if ::= . 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_100] = "";
    artlhsL[ARTL_ART_if_100] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_100] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_102] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_101] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_101] = "";
    artlhsL[ARTL_ART_if_101] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_102] = "if ::= 'if'  . '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_102] = "";
    artlhsL[ARTL_ART_if_102] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_102] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_if_102] = true;
    artFolds[ARTL_ART_if_104] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_103] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_103] = "";
    artlhsL[ARTL_ART_if_103] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_104] = "if ::= 'if'  '('  . relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_104] = "";
    artlhsL[ARTL_ART_if_104] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_104] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_106] = "if ::= 'if'  '('  relExpr . ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_106] = "";
    artlhsL[ARTL_ART_if_106] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_106] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_if_106] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_108] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_107] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_107] = "";
    artlhsL[ARTL_ART_if_107] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_108] = "if ::= 'if'  '('  relExpr ')'  . '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_108] = "";
    artlhsL[ARTL_ART_if_108] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_108] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_if_110] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_109] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_109] = "";
    artlhsL[ARTL_ART_if_109] = ARTL_ART_if;
    artLabelInternalStrings[ARTL_ART_if_110] = "if ::= 'if'  '('  relExpr ')'  '{'  . statement '}'  ";
    artLabelStrings[ARTL_ART_if_110] = "";
    artlhsL[ARTL_ART_if_110] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_110] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_if_112] = "if ::= 'if'  '('  relExpr ')'  '{'  statement . '}'  ";
    artLabelStrings[ARTL_ART_if_112] = "";
    artlhsL[ARTL_ART_if_112] = ARTL_ART_if;
    artSlotInstanceOfs[ARTL_ART_if_112] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_if_112] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_if_112] = true;
    artFolds[ARTL_ART_if_114] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_if_113] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_if_113] = "";
    artlhsL[ARTL_ART_if_113] = ARTL_ART_if;
    artPopD[ARTL_ART_if_113] = true;
    artLabelInternalStrings[ARTL_ART_if_114] = "if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  .";
    artLabelStrings[ARTL_ART_if_114] = "";
    artlhsL[ARTL_ART_if_114] = ARTL_ART_if;
    artKindOfs[ARTL_ART_if_114] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_if_114] = true;
    arteoR_pL[ARTL_ART_if_114] = true;
    artPopD[ARTL_ART_if_114] = true;
  }

  public void artTableInitialiser_ART_init() {
    artLabelInternalStrings[ARTL_ART_init] = "init";
    artLabelStrings[ARTL_ART_init] = "init";
    artKindOfs[ARTL_ART_init] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_init_178] = "init ::= . 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_178] = "";
    artlhsL[ARTL_ART_init_178] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_178] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_init_180] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_179] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_179] = "";
    artlhsL[ARTL_ART_init_179] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_180] = "init ::= 'init'  . '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_180] = "";
    artlhsL[ARTL_ART_init_180] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_180] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_init_180] = true;
    artFolds[ARTL_ART_init_182] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_181] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_181] = "";
    artlhsL[ARTL_ART_init_181] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_182] = "init ::= 'init'  '('  . INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_182] = "";
    artlhsL[ARTL_ART_init_182] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_182] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_init_184] = "init ::= 'init'  '('  INTEGER . ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_184] = "";
    artlhsL[ARTL_ART_init_184] = ARTL_ART_init;
    artSlotInstanceOfs[ARTL_ART_init_184] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_init_184] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_init_186] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_185] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_185] = "";
    artlhsL[ARTL_ART_init_185] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_186] = "init ::= 'init'  '('  INTEGER ','  . INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_186] = "";
    artlhsL[ARTL_ART_init_186] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_186] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_init_188] = "init ::= 'init'  '('  INTEGER ','  INTEGER . ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_188] = "";
    artlhsL[ARTL_ART_init_188] = ARTL_ART_init;
    artSlotInstanceOfs[ARTL_ART_init_188] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_init_188] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_init_188] = true;
    artFolds[ARTL_ART_init_190] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_189] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_189] = "";
    artlhsL[ARTL_ART_init_189] = ARTL_ART_init;
    artPopD[ARTL_ART_init_189] = true;
    artLabelInternalStrings[ARTL_ART_init_190] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  . ';'  ";
    artLabelStrings[ARTL_ART_init_190] = "";
    artlhsL[ARTL_ART_init_190] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_190] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_init_190] = true;
    artFolds[ARTL_ART_init_192] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_191] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_191] = "";
    artlhsL[ARTL_ART_init_191] = ARTL_ART_init;
    artPopD[ARTL_ART_init_191] = true;
    artLabelInternalStrings[ARTL_ART_init_192] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  .";
    artLabelStrings[ARTL_ART_init_192] = "";
    artlhsL[ARTL_ART_init_192] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_192] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_init_192] = true;
    arteoR_pL[ARTL_ART_init_192] = true;
    artPopD[ARTL_ART_init_192] = true;
  }

  public void artTableInitialiser_ART_le() {
    artLabelInternalStrings[ARTL_ART_le] = "le";
    artLabelStrings[ARTL_ART_le] = "le";
    artKindOfs[ARTL_ART_le] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_le_362] = "le ::= . relExpr '<='  subExpr ";
    artLabelStrings[ARTL_ART_le_362] = "";
    artlhsL[ARTL_ART_le_362] = ARTL_ART_le;
    artKindOfs[ARTL_ART_le_362] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_le_364] = "le ::= relExpr . '<='  subExpr ";
    artLabelStrings[ARTL_ART_le_364] = "";
    artlhsL[ARTL_ART_le_364] = ARTL_ART_le;
    artSlotInstanceOfs[ARTL_ART_le_364] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_le_364] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_le_364] = true;
    artFolds[ARTL_ART_le_366] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_le_365] = "le ::= relExpr '<='  subExpr ";
    artLabelStrings[ARTL_ART_le_365] = "";
    artlhsL[ARTL_ART_le_365] = ARTL_ART_le;
    artLabelInternalStrings[ARTL_ART_le_366] = "le ::= relExpr '<='  . subExpr ";
    artLabelStrings[ARTL_ART_le_366] = "";
    artlhsL[ARTL_ART_le_366] = ARTL_ART_le;
    artKindOfs[ARTL_ART_le_366] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_le_368] = "le ::= relExpr '<='  subExpr .";
    artLabelStrings[ARTL_ART_le_368] = "";
    artlhsL[ARTL_ART_le_368] = ARTL_ART_le;
    artSlotInstanceOfs[ARTL_ART_le_368] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_le_368] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_le_368] = true;
    arteoR_pL[ARTL_ART_le_368] = true;
    artPopD[ARTL_ART_le_368] = true;
  }

  public void artTableInitialiser_ART_lt() {
    artLabelInternalStrings[ARTL_ART_lt] = "lt";
    artLabelStrings[ARTL_ART_lt] = "lt";
    artKindOfs[ARTL_ART_lt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_lt_354] = "lt ::= . relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_354] = "";
    artlhsL[ARTL_ART_lt_354] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_354] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_356] = "lt ::= relExpr . '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_356] = "";
    artlhsL[ARTL_ART_lt_356] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_356] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_lt_356] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_lt_356] = true;
    artFolds[ARTL_ART_lt_358] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_lt_357] = "lt ::= relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_357] = "";
    artlhsL[ARTL_ART_lt_357] = ARTL_ART_lt;
    artLabelInternalStrings[ARTL_ART_lt_358] = "lt ::= relExpr '<'  . subExpr ";
    artLabelStrings[ARTL_ART_lt_358] = "";
    artlhsL[ARTL_ART_lt_358] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_358] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_360] = "lt ::= relExpr '<'  subExpr .";
    artLabelStrings[ARTL_ART_lt_360] = "";
    artlhsL[ARTL_ART_lt_360] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_360] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_lt_360] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_lt_360] = true;
    arteoR_pL[ARTL_ART_lt_360] = true;
    artPopD[ARTL_ART_lt_360] = true;
  }

  public void artTableInitialiser_ART_mod() {
    artLabelInternalStrings[ARTL_ART_mod] = "mod";
    artLabelStrings[ARTL_ART_mod] = "mod";
    artKindOfs[ARTL_ART_mod] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_mod_472] = "mod ::= . subExpr '%'  operand ";
    artLabelStrings[ARTL_ART_mod_472] = "";
    artlhsL[ARTL_ART_mod_472] = ARTL_ART_mod;
    artKindOfs[ARTL_ART_mod_472] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mod_474] = "mod ::= subExpr . '%'  operand ";
    artLabelStrings[ARTL_ART_mod_474] = "";
    artlhsL[ARTL_ART_mod_474] = ARTL_ART_mod;
    artSlotInstanceOfs[ARTL_ART_mod_474] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_mod_474] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mod_474] = true;
    artFolds[ARTL_ART_mod_476] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_mod_475] = "mod ::= subExpr '%'  operand ";
    artLabelStrings[ARTL_ART_mod_475] = "";
    artlhsL[ARTL_ART_mod_475] = ARTL_ART_mod;
    artLabelInternalStrings[ARTL_ART_mod_476] = "mod ::= subExpr '%'  . operand ";
    artLabelStrings[ARTL_ART_mod_476] = "";
    artlhsL[ARTL_ART_mod_476] = ARTL_ART_mod;
    artKindOfs[ARTL_ART_mod_476] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mod_478] = "mod ::= subExpr '%'  operand .";
    artLabelStrings[ARTL_ART_mod_478] = "";
    artlhsL[ARTL_ART_mod_478] = ARTL_ART_mod;
    artSlotInstanceOfs[ARTL_ART_mod_478] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_mod_478] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mod_478] = true;
    arteoR_pL[ARTL_ART_mod_478] = true;
    artPopD[ARTL_ART_mod_478] = true;
  }

  public void artTableInitialiser_ART_mul() {
    artLabelInternalStrings[ARTL_ART_mul] = "mul";
    artLabelStrings[ARTL_ART_mul] = "mul";
    artKindOfs[ARTL_ART_mul] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_mul_456] = "mul ::= . subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_456] = "";
    artlhsL[ARTL_ART_mul_456] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_456] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_458] = "mul ::= subExpr . '*'  operand ";
    artLabelStrings[ARTL_ART_mul_458] = "";
    artlhsL[ARTL_ART_mul_458] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_458] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_mul_458] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mul_458] = true;
    artFolds[ARTL_ART_mul_460] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_mul_459] = "mul ::= subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_459] = "";
    artlhsL[ARTL_ART_mul_459] = ARTL_ART_mul;
    artLabelInternalStrings[ARTL_ART_mul_460] = "mul ::= subExpr '*'  . operand ";
    artLabelStrings[ARTL_ART_mul_460] = "";
    artlhsL[ARTL_ART_mul_460] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_460] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_462] = "mul ::= subExpr '*'  operand .";
    artLabelStrings[ARTL_ART_mul_462] = "";
    artlhsL[ARTL_ART_mul_462] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_462] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_mul_462] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mul_462] = true;
    arteoR_pL[ARTL_ART_mul_462] = true;
    artPopD[ARTL_ART_mul_462] = true;
  }

  public void artTableInitialiser_ART_ne() {
    artLabelInternalStrings[ARTL_ART_ne] = "ne";
    artLabelStrings[ARTL_ART_ne] = "ne";
    artKindOfs[ARTL_ART_ne] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ne_330] = "ne ::= . relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_330] = "";
    artlhsL[ARTL_ART_ne_330] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_330] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_332] = "ne ::= relExpr . '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_332] = "";
    artlhsL[ARTL_ART_ne_332] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_332] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_ne_332] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ne_332] = true;
    artFolds[ARTL_ART_ne_334] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_ne_333] = "ne ::= relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_333] = "";
    artlhsL[ARTL_ART_ne_333] = ARTL_ART_ne;
    artLabelInternalStrings[ARTL_ART_ne_334] = "ne ::= relExpr '!='  . subExpr ";
    artLabelStrings[ARTL_ART_ne_334] = "";
    artlhsL[ARTL_ART_ne_334] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_334] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_336] = "ne ::= relExpr '!='  subExpr .";
    artLabelStrings[ARTL_ART_ne_336] = "";
    artlhsL[ARTL_ART_ne_336] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_336] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_ne_336] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ne_336] = true;
    arteoR_pL[ARTL_ART_ne_336] = true;
    artPopD[ARTL_ART_ne_336] = true;
  }

  public void artTableInitialiser_ART_neg() {
    artLabelInternalStrings[ARTL_ART_neg] = "neg";
    artLabelStrings[ARTL_ART_neg] = "neg";
    artKindOfs[ARTL_ART_neg] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_neg_480] = "neg ::= . '-'  operand ";
    artLabelStrings[ARTL_ART_neg_480] = "";
    artlhsL[ARTL_ART_neg_480] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_neg_480] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_neg_482] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_neg_481] = "neg ::= '-'  operand ";
    artLabelStrings[ARTL_ART_neg_481] = "";
    artlhsL[ARTL_ART_neg_481] = ARTL_ART_neg;
    artLabelInternalStrings[ARTL_ART_neg_482] = "neg ::= '-'  . operand ";
    artLabelStrings[ARTL_ART_neg_482] = "";
    artlhsL[ARTL_ART_neg_482] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_neg_482] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_neg_482] = true;
    artLabelInternalStrings[ARTL_ART_neg_484] = "neg ::= '-'  operand .";
    artLabelStrings[ARTL_ART_neg_484] = "";
    artlhsL[ARTL_ART_neg_484] = ARTL_ART_neg;
    artSlotInstanceOfs[ARTL_ART_neg_484] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_neg_484] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_neg_484] = true;
    arteoR_pL[ARTL_ART_neg_484] = true;
    artPopD[ARTL_ART_neg_484] = true;
  }

  public void artTableInitialiser_ART_not() {
    artLabelInternalStrings[ARTL_ART_not] = "not";
    artLabelStrings[ARTL_ART_not] = "not";
    artKindOfs[ARTL_ART_not] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_not_386] = "not ::= . '!'  relExpr ";
    artLabelStrings[ARTL_ART_not_386] = "";
    artlhsL[ARTL_ART_not_386] = ARTL_ART_not;
    artKindOfs[ARTL_ART_not_386] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_not_388] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_not_387] = "not ::= '!'  relExpr ";
    artLabelStrings[ARTL_ART_not_387] = "";
    artlhsL[ARTL_ART_not_387] = ARTL_ART_not;
    artLabelInternalStrings[ARTL_ART_not_388] = "not ::= '!'  . relExpr ";
    artLabelStrings[ARTL_ART_not_388] = "";
    artlhsL[ARTL_ART_not_388] = ARTL_ART_not;
    artKindOfs[ARTL_ART_not_388] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_not_388] = true;
    artLabelInternalStrings[ARTL_ART_not_390] = "not ::= '!'  relExpr .";
    artLabelStrings[ARTL_ART_not_390] = "";
    artlhsL[ARTL_ART_not_390] = ARTL_ART_not;
    artSlotInstanceOfs[ARTL_ART_not_390] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_not_390] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_not_390] = true;
    arteoR_pL[ARTL_ART_not_390] = true;
    artPopD[ARTL_ART_not_390] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_494] = "operand ::= . deref ";
    artLabelStrings[ARTL_ART_operand_494] = "";
    artlhsL[ARTL_ART_operand_494] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_494] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_496] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_496] = "operand ::= deref .";
    artLabelStrings[ARTL_ART_operand_496] = "";
    artlhsL[ARTL_ART_operand_496] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_496] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_operand_496] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_496] = true;
    arteoR_pL[ARTL_ART_operand_496] = true;
    artPopD[ARTL_ART_operand_496] = true;
    artLabelInternalStrings[ARTL_ART_operand_498] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_498] = "";
    artlhsL[ARTL_ART_operand_498] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_498] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_500] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_500] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_500] = "";
    artlhsL[ARTL_ART_operand_500] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_500] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_500] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_500] = true;
    arteoR_pL[ARTL_ART_operand_500] = true;
    artPopD[ARTL_ART_operand_500] = true;
    artLabelInternalStrings[ARTL_ART_operand_502] = "operand ::= . REAL ";
    artLabelStrings[ARTL_ART_operand_502] = "";
    artlhsL[ARTL_ART_operand_502] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_502] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_504] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_504] = "operand ::= REAL .";
    artLabelStrings[ARTL_ART_operand_504] = "";
    artlhsL[ARTL_ART_operand_504] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_504] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_operand_504] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_504] = true;
    arteoR_pL[ARTL_ART_operand_504] = true;
    artPopD[ARTL_ART_operand_504] = true;
    artLabelInternalStrings[ARTL_ART_operand_506] = "operand ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_operand_506] = "";
    artlhsL[ARTL_ART_operand_506] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_506] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_508] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_508] = "operand ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_operand_508] = "";
    artlhsL[ARTL_ART_operand_508] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_508] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_operand_508] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_508] = true;
    arteoR_pL[ARTL_ART_operand_508] = true;
    artPopD[ARTL_ART_operand_508] = true;
    artLabelInternalStrings[ARTL_ART_operand_510] = "operand ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_510] = "";
    artlhsL[ARTL_ART_operand_510] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_510] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_512] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_511] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_511] = "";
    artlhsL[ARTL_ART_operand_511] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_512] = "operand ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_512] = "";
    artlhsL[ARTL_ART_operand_512] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_512] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_512] = true;
    artFolds[ARTL_ART_operand_514] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_514] = "operand ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_514] = "";
    artlhsL[ARTL_ART_operand_514] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_514] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_operand_514] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_514] = true;
    artFolds[ARTL_ART_operand_516] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_515] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_515] = "";
    artlhsL[ARTL_ART_operand_515] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_515] = true;
    artLabelInternalStrings[ARTL_ART_operand_516] = "operand ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_516] = "";
    artlhsL[ARTL_ART_operand_516] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_516] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_516] = true;
    arteoR_pL[ARTL_ART_operand_516] = true;
    artPopD[ARTL_ART_operand_516] = true;
    artLabelInternalStrings[ARTL_ART_operand_518] = "operand ::= . box ";
    artLabelStrings[ARTL_ART_operand_518] = "";
    artlhsL[ARTL_ART_operand_518] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_518] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_520] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_520] = "operand ::= box .";
    artLabelStrings[ARTL_ART_operand_520] = "";
    artlhsL[ARTL_ART_operand_520] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_520] = ARTL_ART_box;
    artKindOfs[ARTL_ART_operand_520] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_520] = true;
    arteoR_pL[ARTL_ART_operand_520] = true;
    artPopD[ARTL_ART_operand_520] = true;
    artLabelInternalStrings[ARTL_ART_operand_522] = "operand ::= . cube ";
    artLabelStrings[ARTL_ART_operand_522] = "";
    artlhsL[ARTL_ART_operand_522] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_522] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_524] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_524] = "operand ::= cube .";
    artLabelStrings[ARTL_ART_operand_524] = "";
    artlhsL[ARTL_ART_operand_524] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_524] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_operand_524] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_524] = true;
    arteoR_pL[ARTL_ART_operand_524] = true;
    artPopD[ARTL_ART_operand_524] = true;
    artLabelInternalStrings[ARTL_ART_operand_526] = "operand ::= . sphere ";
    artLabelStrings[ARTL_ART_operand_526] = "";
    artlhsL[ARTL_ART_operand_526] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_526] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_528] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_528] = "operand ::= sphere .";
    artLabelStrings[ARTL_ART_operand_528] = "";
    artlhsL[ARTL_ART_operand_528] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_528] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_operand_528] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_528] = true;
    arteoR_pL[ARTL_ART_operand_528] = true;
    artPopD[ARTL_ART_operand_528] = true;
    artLabelInternalStrings[ARTL_ART_operand_530] = "operand ::= . cylinder ";
    artLabelStrings[ARTL_ART_operand_530] = "";
    artlhsL[ARTL_ART_operand_530] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_530] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_532] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_532] = "operand ::= cylinder .";
    artLabelStrings[ARTL_ART_operand_532] = "";
    artlhsL[ARTL_ART_operand_532] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_532] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_operand_532] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_532] = true;
    arteoR_pL[ARTL_ART_operand_532] = true;
    artPopD[ARTL_ART_operand_532] = true;
    artLabelInternalStrings[ARTL_ART_operand_534] = "operand ::= . cone ";
    artLabelStrings[ARTL_ART_operand_534] = "";
    artlhsL[ARTL_ART_operand_534] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_534] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_536] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_536] = "operand ::= cone .";
    artLabelStrings[ARTL_ART_operand_536] = "";
    artlhsL[ARTL_ART_operand_536] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_536] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_operand_536] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_536] = true;
    arteoR_pL[ARTL_ART_operand_536] = true;
    artPopD[ARTL_ART_operand_536] = true;
    artLabelInternalStrings[ARTL_ART_operand_538] = "operand ::= . torus ";
    artLabelStrings[ARTL_ART_operand_538] = "";
    artlhsL[ARTL_ART_operand_538] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_538] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_540] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_540] = "operand ::= torus .";
    artLabelStrings[ARTL_ART_operand_540] = "";
    artlhsL[ARTL_ART_operand_540] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_540] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_operand_540] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_540] = true;
    arteoR_pL[ARTL_ART_operand_540] = true;
    artPopD[ARTL_ART_operand_540] = true;
    artLabelInternalStrings[ARTL_ART_operand_542] = "operand ::= . tetrahedron ";
    artLabelStrings[ARTL_ART_operand_542] = "";
    artlhsL[ARTL_ART_operand_542] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_542] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_544] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_544] = "operand ::= tetrahedron .";
    artLabelStrings[ARTL_ART_operand_544] = "";
    artlhsL[ARTL_ART_operand_544] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_544] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_operand_544] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_544] = true;
    arteoR_pL[ARTL_ART_operand_544] = true;
    artPopD[ARTL_ART_operand_544] = true;
    artLabelInternalStrings[ARTL_ART_operand_546] = "operand ::= . pyramid ";
    artLabelStrings[ARTL_ART_operand_546] = "";
    artlhsL[ARTL_ART_operand_546] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_546] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_548] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_548] = "operand ::= pyramid .";
    artLabelStrings[ARTL_ART_operand_548] = "";
    artlhsL[ARTL_ART_operand_548] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_548] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_operand_548] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_548] = true;
    arteoR_pL[ARTL_ART_operand_548] = true;
    artPopD[ARTL_ART_operand_548] = true;
  }

  public void artTableInitialiser_ART_or() {
    artLabelInternalStrings[ARTL_ART_or] = "or";
    artLabelStrings[ARTL_ART_or] = "or";
    artKindOfs[ARTL_ART_or] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_or_378] = "or ::= . relExpr '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_378] = "";
    artlhsL[ARTL_ART_or_378] = ARTL_ART_or;
    artKindOfs[ARTL_ART_or_378] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_or_380] = "or ::= relExpr . '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_380] = "";
    artlhsL[ARTL_ART_or_380] = ARTL_ART_or;
    artSlotInstanceOfs[ARTL_ART_or_380] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_or_380] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_or_380] = true;
    artFolds[ARTL_ART_or_382] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_or_381] = "or ::= relExpr '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_381] = "";
    artlhsL[ARTL_ART_or_381] = ARTL_ART_or;
    artLabelInternalStrings[ARTL_ART_or_382] = "or ::= relExpr '||'  . relExpr ";
    artLabelStrings[ARTL_ART_or_382] = "";
    artlhsL[ARTL_ART_or_382] = ARTL_ART_or;
    artKindOfs[ARTL_ART_or_382] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_or_384] = "or ::= relExpr '||'  relExpr .";
    artLabelStrings[ARTL_ART_or_384] = "";
    artlhsL[ARTL_ART_or_384] = ARTL_ART_or;
    artSlotInstanceOfs[ARTL_ART_or_384] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_or_384] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_or_384] = true;
    arteoR_pL[ARTL_ART_or_384] = true;
    artPopD[ARTL_ART_or_384] = true;
  }

  public void artTableInitialiser_ART_paint() {
    artLabelInternalStrings[ARTL_ART_paint] = "paint";
    artLabelStrings[ARTL_ART_paint] = "paint";
    artKindOfs[ARTL_ART_paint] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_paint_194] = "paint ::= . 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_194] = "";
    artlhsL[ARTL_ART_paint_194] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_194] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_194] = true;
    artFolds[ARTL_ART_paint_196] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_195] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_195] = "";
    artlhsL[ARTL_ART_paint_195] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_195] = true;
    artLabelInternalStrings[ARTL_ART_paint_196] = "paint ::= 'paint'  . '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_196] = "";
    artlhsL[ARTL_ART_paint_196] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_196] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_paint_196] = true;
    artPopD[ARTL_ART_paint_196] = true;
    artFolds[ARTL_ART_paint_198] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_197] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_197] = "";
    artlhsL[ARTL_ART_paint_197] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_197] = true;
    artLabelInternalStrings[ARTL_ART_paint_198] = "paint ::= 'paint'  '('  . ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_198] = "";
    artlhsL[ARTL_ART_paint_198] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_198] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_198] = true;
    artFolds[ARTL_ART_paint_200] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_199] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_199] = "";
    artlhsL[ARTL_ART_paint_199] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_199] = true;
    artLabelInternalStrings[ARTL_ART_paint_200] = "paint ::= 'paint'  '('  ')'  . ';'  ";
    artLabelStrings[ARTL_ART_paint_200] = "";
    artlhsL[ARTL_ART_paint_200] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_200] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_200] = true;
    artFolds[ARTL_ART_paint_202] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_201] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_201] = "";
    artlhsL[ARTL_ART_paint_201] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_201] = true;
    artLabelInternalStrings[ARTL_ART_paint_202] = "paint ::= 'paint'  '('  ')'  ';'  .";
    artLabelStrings[ARTL_ART_paint_202] = "";
    artlhsL[ARTL_ART_paint_202] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_202] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_paint_202] = true;
    arteoR_pL[ARTL_ART_paint_202] = true;
    artPopD[ARTL_ART_paint_202] = true;
  }

  public void artTableInitialiser_ART_println() {
    artLabelInternalStrings[ARTL_ART_println] = "println";
    artLabelStrings[ARTL_ART_println] = "println";
    artKindOfs[ARTL_ART_println] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_println_154] = "println ::= . 'println'  '('  printlnElem ')'  ';'  ";
    artLabelStrings[ARTL_ART_println_154] = "";
    artlhsL[ARTL_ART_println_154] = ARTL_ART_println;
    artKindOfs[ARTL_ART_println_154] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_println_156] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_println_155] = "println ::= 'println'  '('  printlnElem ')'  ';'  ";
    artLabelStrings[ARTL_ART_println_155] = "";
    artlhsL[ARTL_ART_println_155] = ARTL_ART_println;
    artLabelInternalStrings[ARTL_ART_println_156] = "println ::= 'println'  . '('  printlnElem ')'  ';'  ";
    artLabelStrings[ARTL_ART_println_156] = "";
    artlhsL[ARTL_ART_println_156] = ARTL_ART_println;
    artKindOfs[ARTL_ART_println_156] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_println_156] = true;
    artFolds[ARTL_ART_println_158] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_println_157] = "println ::= 'println'  '('  printlnElem ')'  ';'  ";
    artLabelStrings[ARTL_ART_println_157] = "";
    artlhsL[ARTL_ART_println_157] = ARTL_ART_println;
    artLabelInternalStrings[ARTL_ART_println_158] = "println ::= 'println'  '('  . printlnElem ')'  ';'  ";
    artLabelStrings[ARTL_ART_println_158] = "";
    artlhsL[ARTL_ART_println_158] = ARTL_ART_println;
    artKindOfs[ARTL_ART_println_158] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_println_160] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_println_160] = "println ::= 'println'  '('  printlnElem . ')'  ';'  ";
    artLabelStrings[ARTL_ART_println_160] = "";
    artlhsL[ARTL_ART_println_160] = ARTL_ART_println;
    artSlotInstanceOfs[ARTL_ART_println_160] = ARTL_ART_printlnElem;
    artKindOfs[ARTL_ART_println_160] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_println_160] = true;
    artFolds[ARTL_ART_println_162] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_println_161] = "println ::= 'println'  '('  printlnElem ')'  ';'  ";
    artLabelStrings[ARTL_ART_println_161] = "";
    artlhsL[ARTL_ART_println_161] = ARTL_ART_println;
    artPopD[ARTL_ART_println_161] = true;
    artLabelInternalStrings[ARTL_ART_println_162] = "println ::= 'println'  '('  printlnElem ')'  . ';'  ";
    artLabelStrings[ARTL_ART_println_162] = "";
    artlhsL[ARTL_ART_println_162] = ARTL_ART_println;
    artKindOfs[ARTL_ART_println_162] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_println_162] = true;
    artFolds[ARTL_ART_println_164] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_println_163] = "println ::= 'println'  '('  printlnElem ')'  ';'  ";
    artLabelStrings[ARTL_ART_println_163] = "";
    artlhsL[ARTL_ART_println_163] = ARTL_ART_println;
    artPopD[ARTL_ART_println_163] = true;
    artLabelInternalStrings[ARTL_ART_println_164] = "println ::= 'println'  '('  printlnElem ')'  ';'  .";
    artLabelStrings[ARTL_ART_println_164] = "";
    artlhsL[ARTL_ART_println_164] = ARTL_ART_println;
    artKindOfs[ARTL_ART_println_164] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_println_164] = true;
    arteoR_pL[ARTL_ART_println_164] = true;
    artPopD[ARTL_ART_println_164] = true;
  }

  public void artTableInitialiser_ART_printlnElem() {
    artLabelInternalStrings[ARTL_ART_printlnElem] = "printlnElem";
    artLabelStrings[ARTL_ART_printlnElem] = "printlnElem";
    artKindOfs[ARTL_ART_printlnElem] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_printlnElem_166] = "printlnElem ::= . relExpr ";
    artLabelStrings[ARTL_ART_printlnElem_166] = "";
    artlhsL[ARTL_ART_printlnElem_166] = ARTL_ART_printlnElem;
    artKindOfs[ARTL_ART_printlnElem_166] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printlnElem_168] = "printlnElem ::= relExpr .";
    artLabelStrings[ARTL_ART_printlnElem_168] = "";
    artlhsL[ARTL_ART_printlnElem_168] = ARTL_ART_printlnElem;
    artSlotInstanceOfs[ARTL_ART_printlnElem_168] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_printlnElem_168] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printlnElem_168] = true;
    arteoR_pL[ARTL_ART_printlnElem_168] = true;
    artPopD[ARTL_ART_printlnElem_168] = true;
    artLabelInternalStrings[ARTL_ART_printlnElem_170] = "printlnElem ::= . relExpr ','  printlnElem ";
    artLabelStrings[ARTL_ART_printlnElem_170] = "";
    artlhsL[ARTL_ART_printlnElem_170] = ARTL_ART_printlnElem;
    artKindOfs[ARTL_ART_printlnElem_170] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printlnElem_172] = "printlnElem ::= relExpr . ','  printlnElem ";
    artLabelStrings[ARTL_ART_printlnElem_172] = "";
    artlhsL[ARTL_ART_printlnElem_172] = ARTL_ART_printlnElem;
    artSlotInstanceOfs[ARTL_ART_printlnElem_172] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_printlnElem_172] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printlnElem_172] = true;
    artFolds[ARTL_ART_printlnElem_174] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_printlnElem_173] = "printlnElem ::= relExpr ','  printlnElem ";
    artLabelStrings[ARTL_ART_printlnElem_173] = "";
    artlhsL[ARTL_ART_printlnElem_173] = ARTL_ART_printlnElem;
    artLabelInternalStrings[ARTL_ART_printlnElem_174] = "printlnElem ::= relExpr ','  . printlnElem ";
    artLabelStrings[ARTL_ART_printlnElem_174] = "";
    artlhsL[ARTL_ART_printlnElem_174] = ARTL_ART_printlnElem;
    artKindOfs[ARTL_ART_printlnElem_174] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printlnElem_176] = "printlnElem ::= relExpr ','  printlnElem .";
    artLabelStrings[ARTL_ART_printlnElem_176] = "";
    artlhsL[ARTL_ART_printlnElem_176] = ARTL_ART_printlnElem;
    artSlotInstanceOfs[ARTL_ART_printlnElem_176] = ARTL_ART_printlnElem;
    artKindOfs[ARTL_ART_printlnElem_176] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printlnElem_176] = true;
    arteoR_pL[ARTL_ART_printlnElem_176] = true;
    artPopD[ARTL_ART_printlnElem_176] = true;
  }

  public void artTableInitialiser_ART_pyramid() {
    artLabelInternalStrings[ARTL_ART_pyramid] = "pyramid";
    artLabelStrings[ARTL_ART_pyramid] = "pyramid";
    artKindOfs[ARTL_ART_pyramid] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_pyramid_644] = "pyramid ::= . 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_644] = "";
    artlhsL[ARTL_ART_pyramid_644] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_644] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_pyramid_646] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_pyramid_645] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_645] = "";
    artlhsL[ARTL_ART_pyramid_645] = ARTL_ART_pyramid;
    artLabelInternalStrings[ARTL_ART_pyramid_646] = "pyramid ::= 'PYRAMID'  . '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_646] = "";
    artlhsL[ARTL_ART_pyramid_646] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_646] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_pyramid_646] = true;
    artFolds[ARTL_ART_pyramid_648] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_pyramid_647] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_647] = "";
    artlhsL[ARTL_ART_pyramid_647] = ARTL_ART_pyramid;
    artLabelInternalStrings[ARTL_ART_pyramid_648] = "pyramid ::= 'PYRAMID'  '('  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_648] = "";
    artlhsL[ARTL_ART_pyramid_648] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_648] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_pyramid_650] = "pyramid ::= 'PYRAMID'  '('  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_650] = "";
    artlhsL[ARTL_ART_pyramid_650] = ARTL_ART_pyramid;
    artSlotInstanceOfs[ARTL_ART_pyramid_650] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_pyramid_650] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_pyramid_652] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_pyramid_651] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_651] = "";
    artlhsL[ARTL_ART_pyramid_651] = ARTL_ART_pyramid;
    artLabelInternalStrings[ARTL_ART_pyramid_652] = "pyramid ::= 'PYRAMID'  '('  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_652] = "";
    artlhsL[ARTL_ART_pyramid_652] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_652] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_pyramid_654] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_pyramid_654] = "";
    artlhsL[ARTL_ART_pyramid_654] = ARTL_ART_pyramid;
    artSlotInstanceOfs[ARTL_ART_pyramid_654] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_pyramid_654] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_pyramid_654] = true;
    artFolds[ARTL_ART_pyramid_656] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_pyramid_655] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_655] = "";
    artlhsL[ARTL_ART_pyramid_655] = ARTL_ART_pyramid;
    artPopD[ARTL_ART_pyramid_655] = true;
    artLabelInternalStrings[ARTL_ART_pyramid_656] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_pyramid_656] = "";
    artlhsL[ARTL_ART_pyramid_656] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_656] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_pyramid_656] = true;
    arteoR_pL[ARTL_ART_pyramid_656] = true;
    artPopD[ARTL_ART_pyramid_656] = true;
  }

  public void artTableInitialiser_ART_relExpr() {
    artLabelInternalStrings[ARTL_ART_relExpr] = "relExpr";
    artLabelStrings[ARTL_ART_relExpr] = "relExpr";
    artKindOfs[ARTL_ART_relExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_relExpr_270] = "relExpr ::= . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_270] = "";
    artlhsL[ARTL_ART_relExpr_270] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_270] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_272] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_272] = "relExpr ::= subExpr .";
    artLabelStrings[ARTL_ART_relExpr_272] = "";
    artlhsL[ARTL_ART_relExpr_272] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_272] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_272] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_272] = true;
    arteoR_pL[ARTL_ART_relExpr_272] = true;
    artPopD[ARTL_ART_relExpr_272] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_274] = "relExpr ::= . eq ";
    artLabelStrings[ARTL_ART_relExpr_274] = "";
    artlhsL[ARTL_ART_relExpr_274] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_274] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_276] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_276] = "relExpr ::= eq .";
    artLabelStrings[ARTL_ART_relExpr_276] = "";
    artlhsL[ARTL_ART_relExpr_276] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_276] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_relExpr_276] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_276] = true;
    arteoR_pL[ARTL_ART_relExpr_276] = true;
    artPopD[ARTL_ART_relExpr_276] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_278] = "relExpr ::= . ne ";
    artLabelStrings[ARTL_ART_relExpr_278] = "";
    artlhsL[ARTL_ART_relExpr_278] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_278] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_280] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_280] = "relExpr ::= ne .";
    artLabelStrings[ARTL_ART_relExpr_280] = "";
    artlhsL[ARTL_ART_relExpr_280] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_280] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_relExpr_280] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_280] = true;
    arteoR_pL[ARTL_ART_relExpr_280] = true;
    artPopD[ARTL_ART_relExpr_280] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_282] = "relExpr ::= . gt ";
    artLabelStrings[ARTL_ART_relExpr_282] = "";
    artlhsL[ARTL_ART_relExpr_282] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_282] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_284] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_284] = "relExpr ::= gt .";
    artLabelStrings[ARTL_ART_relExpr_284] = "";
    artlhsL[ARTL_ART_relExpr_284] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_284] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_relExpr_284] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_284] = true;
    arteoR_pL[ARTL_ART_relExpr_284] = true;
    artPopD[ARTL_ART_relExpr_284] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_286] = "relExpr ::= . ge ";
    artLabelStrings[ARTL_ART_relExpr_286] = "";
    artlhsL[ARTL_ART_relExpr_286] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_286] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_288] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_288] = "relExpr ::= ge .";
    artLabelStrings[ARTL_ART_relExpr_288] = "";
    artlhsL[ARTL_ART_relExpr_288] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_288] = ARTL_ART_ge;
    artKindOfs[ARTL_ART_relExpr_288] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_288] = true;
    arteoR_pL[ARTL_ART_relExpr_288] = true;
    artPopD[ARTL_ART_relExpr_288] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_290] = "relExpr ::= . lt ";
    artLabelStrings[ARTL_ART_relExpr_290] = "";
    artlhsL[ARTL_ART_relExpr_290] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_290] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_292] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_292] = "relExpr ::= lt .";
    artLabelStrings[ARTL_ART_relExpr_292] = "";
    artlhsL[ARTL_ART_relExpr_292] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_292] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_relExpr_292] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_292] = true;
    arteoR_pL[ARTL_ART_relExpr_292] = true;
    artPopD[ARTL_ART_relExpr_292] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_294] = "relExpr ::= . le ";
    artLabelStrings[ARTL_ART_relExpr_294] = "";
    artlhsL[ARTL_ART_relExpr_294] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_294] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_296] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_296] = "relExpr ::= le .";
    artLabelStrings[ARTL_ART_relExpr_296] = "";
    artlhsL[ARTL_ART_relExpr_296] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_296] = ARTL_ART_le;
    artKindOfs[ARTL_ART_relExpr_296] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_296] = true;
    arteoR_pL[ARTL_ART_relExpr_296] = true;
    artPopD[ARTL_ART_relExpr_296] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_298] = "relExpr ::= . and ";
    artLabelStrings[ARTL_ART_relExpr_298] = "";
    artlhsL[ARTL_ART_relExpr_298] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_298] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_300] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_300] = "relExpr ::= and .";
    artLabelStrings[ARTL_ART_relExpr_300] = "";
    artlhsL[ARTL_ART_relExpr_300] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_300] = ARTL_ART_and;
    artKindOfs[ARTL_ART_relExpr_300] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_300] = true;
    arteoR_pL[ARTL_ART_relExpr_300] = true;
    artPopD[ARTL_ART_relExpr_300] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_302] = "relExpr ::= . or ";
    artLabelStrings[ARTL_ART_relExpr_302] = "";
    artlhsL[ARTL_ART_relExpr_302] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_302] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_304] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_304] = "relExpr ::= or .";
    artLabelStrings[ARTL_ART_relExpr_304] = "";
    artlhsL[ARTL_ART_relExpr_304] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_304] = ARTL_ART_or;
    artKindOfs[ARTL_ART_relExpr_304] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_304] = true;
    arteoR_pL[ARTL_ART_relExpr_304] = true;
    artPopD[ARTL_ART_relExpr_304] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_306] = "relExpr ::= . not ";
    artLabelStrings[ARTL_ART_relExpr_306] = "";
    artlhsL[ARTL_ART_relExpr_306] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_306] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_308] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_308] = "relExpr ::= not .";
    artLabelStrings[ARTL_ART_relExpr_308] = "";
    artlhsL[ARTL_ART_relExpr_308] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_308] = ARTL_ART_not;
    artKindOfs[ARTL_ART_relExpr_308] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_308] = true;
    arteoR_pL[ARTL_ART_relExpr_308] = true;
    artPopD[ARTL_ART_relExpr_308] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_310] = "relExpr ::= . xor ";
    artLabelStrings[ARTL_ART_relExpr_310] = "";
    artlhsL[ARTL_ART_relExpr_310] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_310] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_312] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_312] = "relExpr ::= xor .";
    artLabelStrings[ARTL_ART_relExpr_312] = "";
    artlhsL[ARTL_ART_relExpr_312] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_312] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_relExpr_312] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_312] = true;
    arteoR_pL[ARTL_ART_relExpr_312] = true;
    artPopD[ARTL_ART_relExpr_312] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_314] = "relExpr ::= . '('  relExpr ')'  ";
    artLabelStrings[ARTL_ART_relExpr_314] = "";
    artlhsL[ARTL_ART_relExpr_314] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_314] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_316] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_relExpr_315] = "relExpr ::= '('  relExpr ')'  ";
    artLabelStrings[ARTL_ART_relExpr_315] = "";
    artlhsL[ARTL_ART_relExpr_315] = ARTL_ART_relExpr;
    artLabelInternalStrings[ARTL_ART_relExpr_316] = "relExpr ::= '('  . relExpr ')'  ";
    artLabelStrings[ARTL_ART_relExpr_316] = "";
    artlhsL[ARTL_ART_relExpr_316] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_316] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_relExpr_316] = true;
    artFolds[ARTL_ART_relExpr_318] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_318] = "relExpr ::= '('  relExpr . ')'  ";
    artLabelStrings[ARTL_ART_relExpr_318] = "";
    artlhsL[ARTL_ART_relExpr_318] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_318] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_318] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_relExpr_318] = true;
    artFolds[ARTL_ART_relExpr_320] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_relExpr_319] = "relExpr ::= '('  relExpr ')'  ";
    artLabelStrings[ARTL_ART_relExpr_319] = "";
    artlhsL[ARTL_ART_relExpr_319] = ARTL_ART_relExpr;
    artPopD[ARTL_ART_relExpr_319] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_320] = "relExpr ::= '('  relExpr ')'  .";
    artLabelStrings[ARTL_ART_relExpr_320] = "";
    artlhsL[ARTL_ART_relExpr_320] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_320] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_320] = true;
    arteoR_pL[ARTL_ART_relExpr_320] = true;
    artPopD[ARTL_ART_relExpr_320] = true;
  }

  public void artTableInitialiser_ART_rotate() {
    artLabelInternalStrings[ARTL_ART_rotate] = "rotate";
    artLabelStrings[ARTL_ART_rotate] = "rotate";
    artKindOfs[ARTL_ART_rotate] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_rotate_226] = "rotate ::= . deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_226] = "";
    artlhsL[ARTL_ART_rotate_226] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_226] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_rotate_228] = "rotate ::= deref . '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_228] = "";
    artlhsL[ARTL_ART_rotate_228] = ARTL_ART_rotate;
    artSlotInstanceOfs[ARTL_ART_rotate_228] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_rotate_228] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_rotate_228] = true;
    artFolds[ARTL_ART_rotate_230] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_229] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_229] = "";
    artlhsL[ARTL_ART_rotate_229] = ARTL_ART_rotate;
    artLabelInternalStrings[ARTL_ART_rotate_230] = "rotate ::= deref '.rotate'  . '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_230] = "";
    artlhsL[ARTL_ART_rotate_230] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_230] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_rotate_232] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_231] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_231] = "";
    artlhsL[ARTL_ART_rotate_231] = ARTL_ART_rotate;
    artLabelInternalStrings[ARTL_ART_rotate_232] = "rotate ::= deref '.rotate'  '('  . REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_232] = "";
    artlhsL[ARTL_ART_rotate_232] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_232] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_rotate_234] = "rotate ::= deref '.rotate'  '('  REAL . ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_234] = "";
    artlhsL[ARTL_ART_rotate_234] = ARTL_ART_rotate;
    artSlotInstanceOfs[ARTL_ART_rotate_234] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_rotate_234] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_rotate_236] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_235] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_235] = "";
    artlhsL[ARTL_ART_rotate_235] = ARTL_ART_rotate;
    artLabelInternalStrings[ARTL_ART_rotate_236] = "rotate ::= deref '.rotate'  '('  REAL ','  . REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_236] = "";
    artlhsL[ARTL_ART_rotate_236] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_236] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_rotate_238] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL . ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_238] = "";
    artlhsL[ARTL_ART_rotate_238] = ARTL_ART_rotate;
    artSlotInstanceOfs[ARTL_ART_rotate_238] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_rotate_238] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_rotate_240] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_239] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_239] = "";
    artlhsL[ARTL_ART_rotate_239] = ARTL_ART_rotate;
    artLabelInternalStrings[ARTL_ART_rotate_240] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  . REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_240] = "";
    artlhsL[ARTL_ART_rotate_240] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_240] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_rotate_242] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL . ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_242] = "";
    artlhsL[ARTL_ART_rotate_242] = ARTL_ART_rotate;
    artSlotInstanceOfs[ARTL_ART_rotate_242] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_rotate_242] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rotate_242] = true;
    artFolds[ARTL_ART_rotate_244] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_243] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_243] = "";
    artlhsL[ARTL_ART_rotate_243] = ARTL_ART_rotate;
    artPopD[ARTL_ART_rotate_243] = true;
    artLabelInternalStrings[ARTL_ART_rotate_244] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  . ';'  ";
    artLabelStrings[ARTL_ART_rotate_244] = "";
    artlhsL[ARTL_ART_rotate_244] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_244] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rotate_244] = true;
    artFolds[ARTL_ART_rotate_246] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_245] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_245] = "";
    artlhsL[ARTL_ART_rotate_245] = ARTL_ART_rotate;
    artPopD[ARTL_ART_rotate_245] = true;
    artLabelInternalStrings[ARTL_ART_rotate_246] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  .";
    artLabelStrings[ARTL_ART_rotate_246] = "";
    artlhsL[ARTL_ART_rotate_246] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_246] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rotate_246] = true;
    arteoR_pL[ARTL_ART_rotate_246] = true;
    artPopD[ARTL_ART_rotate_246] = true;
  }

  public void artTableInitialiser_ART_scale() {
    artLabelInternalStrings[ARTL_ART_scale] = "scale";
    artLabelStrings[ARTL_ART_scale] = "scale";
    artKindOfs[ARTL_ART_scale] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_scale_248] = "scale ::= . deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_248] = "";
    artlhsL[ARTL_ART_scale_248] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_248] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_scale_250] = "scale ::= deref . '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_250] = "";
    artlhsL[ARTL_ART_scale_250] = ARTL_ART_scale;
    artSlotInstanceOfs[ARTL_ART_scale_250] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_scale_250] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_scale_250] = true;
    artFolds[ARTL_ART_scale_252] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_251] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_251] = "";
    artlhsL[ARTL_ART_scale_251] = ARTL_ART_scale;
    artLabelInternalStrings[ARTL_ART_scale_252] = "scale ::= deref '.scale'  . '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_252] = "";
    artlhsL[ARTL_ART_scale_252] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_252] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_scale_254] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_253] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_253] = "";
    artlhsL[ARTL_ART_scale_253] = ARTL_ART_scale;
    artLabelInternalStrings[ARTL_ART_scale_254] = "scale ::= deref '.scale'  '('  . REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_254] = "";
    artlhsL[ARTL_ART_scale_254] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_254] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_scale_256] = "scale ::= deref '.scale'  '('  REAL . ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_256] = "";
    artlhsL[ARTL_ART_scale_256] = ARTL_ART_scale;
    artSlotInstanceOfs[ARTL_ART_scale_256] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_scale_256] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_scale_258] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_257] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_257] = "";
    artlhsL[ARTL_ART_scale_257] = ARTL_ART_scale;
    artLabelInternalStrings[ARTL_ART_scale_258] = "scale ::= deref '.scale'  '('  REAL ','  . REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_258] = "";
    artlhsL[ARTL_ART_scale_258] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_258] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_scale_260] = "scale ::= deref '.scale'  '('  REAL ','  REAL . ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_260] = "";
    artlhsL[ARTL_ART_scale_260] = ARTL_ART_scale;
    artSlotInstanceOfs[ARTL_ART_scale_260] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_scale_260] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_scale_262] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_261] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_261] = "";
    artlhsL[ARTL_ART_scale_261] = ARTL_ART_scale;
    artLabelInternalStrings[ARTL_ART_scale_262] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  . REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_262] = "";
    artlhsL[ARTL_ART_scale_262] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_262] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_scale_264] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL . ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_264] = "";
    artlhsL[ARTL_ART_scale_264] = ARTL_ART_scale;
    artSlotInstanceOfs[ARTL_ART_scale_264] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_scale_264] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_scale_264] = true;
    artFolds[ARTL_ART_scale_266] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_265] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_265] = "";
    artlhsL[ARTL_ART_scale_265] = ARTL_ART_scale;
    artPopD[ARTL_ART_scale_265] = true;
    artLabelInternalStrings[ARTL_ART_scale_266] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  . ';'  ";
    artLabelStrings[ARTL_ART_scale_266] = "";
    artlhsL[ARTL_ART_scale_266] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_266] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_scale_266] = true;
    artFolds[ARTL_ART_scale_268] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_267] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_267] = "";
    artlhsL[ARTL_ART_scale_267] = ARTL_ART_scale;
    artPopD[ARTL_ART_scale_267] = true;
    artLabelInternalStrings[ARTL_ART_scale_268] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  .";
    artLabelStrings[ARTL_ART_scale_268] = "";
    artlhsL[ARTL_ART_scale_268] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_268] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_scale_268] = true;
    arteoR_pL[ARTL_ART_scale_268] = true;
    artPopD[ARTL_ART_scale_268] = true;
  }

  public void artTableInitialiser_ART_seq() {
    artLabelInternalStrings[ARTL_ART_seq] = "seq";
    artLabelStrings[ARTL_ART_seq] = "seq";
    artKindOfs[ARTL_ART_seq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_seq_50] = "seq ::= . statement statement ";
    artLabelStrings[ARTL_ART_seq_50] = "";
    artlhsL[ARTL_ART_seq_50] = ARTL_ART_seq;
    artKindOfs[ARTL_ART_seq_50] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_seq_52] = "seq ::= statement . statement ";
    artLabelStrings[ARTL_ART_seq_52] = "";
    artlhsL[ARTL_ART_seq_52] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_52] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_52] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_seq_52] = true;
    artLabelInternalStrings[ARTL_ART_seq_54] = "seq ::= statement statement .";
    artLabelStrings[ARTL_ART_seq_54] = "";
    artlhsL[ARTL_ART_seq_54] = ARTL_ART_seq;
    artSlotInstanceOfs[ARTL_ART_seq_54] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_seq_54] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_seq_54] = true;
    arteoR_pL[ARTL_ART_seq_54] = true;
    artPopD[ARTL_ART_seq_54] = true;
  }

  public void artTableInitialiser_ART_sphere() {
    artLabelInternalStrings[ARTL_ART_sphere] = "sphere";
    artLabelStrings[ARTL_ART_sphere] = "sphere";
    artKindOfs[ARTL_ART_sphere] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_sphere_582] = "sphere ::= . 'SPHERE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_582] = "";
    artlhsL[ARTL_ART_sphere_582] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_sphere_582] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_sphere_584] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sphere_583] = "sphere ::= 'SPHERE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_583] = "";
    artlhsL[ARTL_ART_sphere_583] = ARTL_ART_sphere;
    artLabelInternalStrings[ARTL_ART_sphere_584] = "sphere ::= 'SPHERE'  . '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_584] = "";
    artlhsL[ARTL_ART_sphere_584] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_sphere_584] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sphere_584] = true;
    artFolds[ARTL_ART_sphere_586] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sphere_585] = "sphere ::= 'SPHERE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_585] = "";
    artlhsL[ARTL_ART_sphere_585] = ARTL_ART_sphere;
    artLabelInternalStrings[ARTL_ART_sphere_586] = "sphere ::= 'SPHERE'  '('  . REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_586] = "";
    artlhsL[ARTL_ART_sphere_586] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_sphere_586] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sphere_588] = "sphere ::= 'SPHERE'  '('  REAL . ')'  ";
    artLabelStrings[ARTL_ART_sphere_588] = "";
    artlhsL[ARTL_ART_sphere_588] = ARTL_ART_sphere;
    artSlotInstanceOfs[ARTL_ART_sphere_588] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_sphere_588] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_sphere_588] = true;
    artFolds[ARTL_ART_sphere_590] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sphere_589] = "sphere ::= 'SPHERE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_589] = "";
    artlhsL[ARTL_ART_sphere_589] = ARTL_ART_sphere;
    artPopD[ARTL_ART_sphere_589] = true;
    artLabelInternalStrings[ARTL_ART_sphere_590] = "sphere ::= 'SPHERE'  '('  REAL ')'  .";
    artLabelStrings[ARTL_ART_sphere_590] = "";
    artlhsL[ARTL_ART_sphere_590] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_sphere_590] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sphere_590] = true;
    arteoR_pL[ARTL_ART_sphere_590] = true;
    artPopD[ARTL_ART_sphere_590] = true;
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
    artLabelInternalStrings[ARTL_ART_statement_10] = "statement ::= . compassign ";
    artLabelStrings[ARTL_ART_statement_10] = "";
    artlhsL[ARTL_ART_statement_10] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_10] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_12] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_12] = "statement ::= compassign .";
    artLabelStrings[ARTL_ART_statement_12] = "";
    artlhsL[ARTL_ART_statement_12] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_12] = ARTL_ART_compassign;
    artKindOfs[ARTL_ART_statement_12] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_12] = true;
    arteoR_pL[ARTL_ART_statement_12] = true;
    artPopD[ARTL_ART_statement_12] = true;
    artLabelInternalStrings[ARTL_ART_statement_14] = "statement ::= . if ";
    artLabelStrings[ARTL_ART_statement_14] = "";
    artlhsL[ARTL_ART_statement_14] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_14] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_16] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_16] = "statement ::= if .";
    artLabelStrings[ARTL_ART_statement_16] = "";
    artlhsL[ARTL_ART_statement_16] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_16] = ARTL_ART_if;
    artKindOfs[ARTL_ART_statement_16] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_16] = true;
    arteoR_pL[ARTL_ART_statement_16] = true;
    artPopD[ARTL_ART_statement_16] = true;
    artLabelInternalStrings[ARTL_ART_statement_18] = "statement ::= . while ";
    artLabelStrings[ARTL_ART_statement_18] = "";
    artlhsL[ARTL_ART_statement_18] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_18] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_20] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_20] = "statement ::= while .";
    artLabelStrings[ARTL_ART_statement_20] = "";
    artlhsL[ARTL_ART_statement_20] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_20] = ARTL_ART_while;
    artKindOfs[ARTL_ART_statement_20] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_20] = true;
    arteoR_pL[ARTL_ART_statement_20] = true;
    artPopD[ARTL_ART_statement_20] = true;
    artLabelInternalStrings[ARTL_ART_statement_22] = "statement ::= . for ";
    artLabelStrings[ARTL_ART_statement_22] = "";
    artlhsL[ARTL_ART_statement_22] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_22] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_24] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_24] = "statement ::= for .";
    artLabelStrings[ARTL_ART_statement_24] = "";
    artlhsL[ARTL_ART_statement_24] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_24] = ARTL_ART_for;
    artKindOfs[ARTL_ART_statement_24] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_24] = true;
    arteoR_pL[ARTL_ART_statement_24] = true;
    artPopD[ARTL_ART_statement_24] = true;
    artLabelInternalStrings[ARTL_ART_statement_26] = "statement ::= . println ";
    artLabelStrings[ARTL_ART_statement_26] = "";
    artlhsL[ARTL_ART_statement_26] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_26] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_28] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_28] = "statement ::= println .";
    artLabelStrings[ARTL_ART_statement_28] = "";
    artlhsL[ARTL_ART_statement_28] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_28] = ARTL_ART_println;
    artKindOfs[ARTL_ART_statement_28] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_28] = true;
    arteoR_pL[ARTL_ART_statement_28] = true;
    artPopD[ARTL_ART_statement_28] = true;
    artLabelInternalStrings[ARTL_ART_statement_30] = "statement ::= . init ";
    artLabelStrings[ARTL_ART_statement_30] = "";
    artlhsL[ARTL_ART_statement_30] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_30] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_32] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_32] = "statement ::= init .";
    artLabelStrings[ARTL_ART_statement_32] = "";
    artlhsL[ARTL_ART_statement_32] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_32] = ARTL_ART_init;
    artKindOfs[ARTL_ART_statement_32] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_32] = true;
    arteoR_pL[ARTL_ART_statement_32] = true;
    artPopD[ARTL_ART_statement_32] = true;
    artLabelInternalStrings[ARTL_ART_statement_34] = "statement ::= . paint ";
    artLabelStrings[ARTL_ART_statement_34] = "";
    artlhsL[ARTL_ART_statement_34] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_34] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_36] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_36] = "statement ::= paint .";
    artLabelStrings[ARTL_ART_statement_36] = "";
    artlhsL[ARTL_ART_statement_36] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_36] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_statement_36] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_36] = true;
    arteoR_pL[ARTL_ART_statement_36] = true;
    artPopD[ARTL_ART_statement_36] = true;
    artLabelInternalStrings[ARTL_ART_statement_38] = "statement ::= . translate ";
    artLabelStrings[ARTL_ART_statement_38] = "";
    artlhsL[ARTL_ART_statement_38] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_38] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_40] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_40] = "statement ::= translate .";
    artLabelStrings[ARTL_ART_statement_40] = "";
    artlhsL[ARTL_ART_statement_40] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_40] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_statement_40] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_40] = true;
    arteoR_pL[ARTL_ART_statement_40] = true;
    artPopD[ARTL_ART_statement_40] = true;
    artLabelInternalStrings[ARTL_ART_statement_42] = "statement ::= . rotate ";
    artLabelStrings[ARTL_ART_statement_42] = "";
    artlhsL[ARTL_ART_statement_42] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_42] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_44] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_44] = "statement ::= rotate .";
    artLabelStrings[ARTL_ART_statement_44] = "";
    artlhsL[ARTL_ART_statement_44] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_44] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_statement_44] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_44] = true;
    arteoR_pL[ARTL_ART_statement_44] = true;
    artPopD[ARTL_ART_statement_44] = true;
    artLabelInternalStrings[ARTL_ART_statement_46] = "statement ::= . scale ";
    artLabelStrings[ARTL_ART_statement_46] = "";
    artlhsL[ARTL_ART_statement_46] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_46] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_48] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_48] = "statement ::= scale .";
    artLabelStrings[ARTL_ART_statement_48] = "";
    artlhsL[ARTL_ART_statement_48] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_48] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_statement_48] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_48] = true;
    arteoR_pL[ARTL_ART_statement_48] = true;
    artPopD[ARTL_ART_statement_48] = true;
  }

  public void artTableInitialiser_ART_sub() {
    artLabelInternalStrings[ARTL_ART_sub] = "sub";
    artLabelStrings[ARTL_ART_sub] = "sub";
    artKindOfs[ARTL_ART_sub] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_sub_440] = "sub ::= . subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_440] = "";
    artlhsL[ARTL_ART_sub_440] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_440] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_442] = "sub ::= subExpr . '-'  operand ";
    artLabelStrings[ARTL_ART_sub_442] = "";
    artlhsL[ARTL_ART_sub_442] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_442] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_sub_442] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sub_442] = true;
    artFolds[ARTL_ART_sub_444] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sub_443] = "sub ::= subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_443] = "";
    artlhsL[ARTL_ART_sub_443] = ARTL_ART_sub;
    artLabelInternalStrings[ARTL_ART_sub_444] = "sub ::= subExpr '-'  . operand ";
    artLabelStrings[ARTL_ART_sub_444] = "";
    artlhsL[ARTL_ART_sub_444] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_444] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_446] = "sub ::= subExpr '-'  operand .";
    artLabelStrings[ARTL_ART_sub_446] = "";
    artlhsL[ARTL_ART_sub_446] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_446] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_sub_446] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sub_446] = true;
    arteoR_pL[ARTL_ART_sub_446] = true;
    artPopD[ARTL_ART_sub_446] = true;
  }

  public void artTableInitialiser_ART_subExpr() {
    artLabelInternalStrings[ARTL_ART_subExpr] = "subExpr";
    artLabelStrings[ARTL_ART_subExpr] = "subExpr";
    artKindOfs[ARTL_ART_subExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExpr_400] = "subExpr ::= . operand ";
    artLabelStrings[ARTL_ART_subExpr_400] = "";
    artlhsL[ARTL_ART_subExpr_400] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_400] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_402] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_402] = "subExpr ::= operand .";
    artLabelStrings[ARTL_ART_subExpr_402] = "";
    artlhsL[ARTL_ART_subExpr_402] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_402] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_402] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_402] = true;
    arteoR_pL[ARTL_ART_subExpr_402] = true;
    artPopD[ARTL_ART_subExpr_402] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_404] = "subExpr ::= . sub ";
    artLabelStrings[ARTL_ART_subExpr_404] = "";
    artlhsL[ARTL_ART_subExpr_404] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_404] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_406] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_406] = "subExpr ::= sub .";
    artLabelStrings[ARTL_ART_subExpr_406] = "";
    artlhsL[ARTL_ART_subExpr_406] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_406] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_subExpr_406] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_406] = true;
    arteoR_pL[ARTL_ART_subExpr_406] = true;
    artPopD[ARTL_ART_subExpr_406] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_408] = "subExpr ::= . add ";
    artLabelStrings[ARTL_ART_subExpr_408] = "";
    artlhsL[ARTL_ART_subExpr_408] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_408] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_410] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_410] = "subExpr ::= add .";
    artLabelStrings[ARTL_ART_subExpr_410] = "";
    artlhsL[ARTL_ART_subExpr_410] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_410] = ARTL_ART_add;
    artKindOfs[ARTL_ART_subExpr_410] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_410] = true;
    arteoR_pL[ARTL_ART_subExpr_410] = true;
    artPopD[ARTL_ART_subExpr_410] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_412] = "subExpr ::= . mul ";
    artLabelStrings[ARTL_ART_subExpr_412] = "";
    artlhsL[ARTL_ART_subExpr_412] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_412] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_414] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_414] = "subExpr ::= mul .";
    artLabelStrings[ARTL_ART_subExpr_414] = "";
    artlhsL[ARTL_ART_subExpr_414] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_414] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_subExpr_414] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_414] = true;
    arteoR_pL[ARTL_ART_subExpr_414] = true;
    artPopD[ARTL_ART_subExpr_414] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_416] = "subExpr ::= . div ";
    artLabelStrings[ARTL_ART_subExpr_416] = "";
    artlhsL[ARTL_ART_subExpr_416] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_416] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_418] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_418] = "subExpr ::= div .";
    artLabelStrings[ARTL_ART_subExpr_418] = "";
    artlhsL[ARTL_ART_subExpr_418] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_418] = ARTL_ART_div;
    artKindOfs[ARTL_ART_subExpr_418] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_418] = true;
    arteoR_pL[ARTL_ART_subExpr_418] = true;
    artPopD[ARTL_ART_subExpr_418] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_420] = "subExpr ::= . mod ";
    artLabelStrings[ARTL_ART_subExpr_420] = "";
    artlhsL[ARTL_ART_subExpr_420] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_420] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_422] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_422] = "subExpr ::= mod .";
    artLabelStrings[ARTL_ART_subExpr_422] = "";
    artlhsL[ARTL_ART_subExpr_422] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_422] = ARTL_ART_mod;
    artKindOfs[ARTL_ART_subExpr_422] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_422] = true;
    arteoR_pL[ARTL_ART_subExpr_422] = true;
    artPopD[ARTL_ART_subExpr_422] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_424] = "subExpr ::= . neg ";
    artLabelStrings[ARTL_ART_subExpr_424] = "";
    artlhsL[ARTL_ART_subExpr_424] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_424] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_426] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_426] = "subExpr ::= neg .";
    artLabelStrings[ARTL_ART_subExpr_426] = "";
    artlhsL[ARTL_ART_subExpr_426] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_426] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_subExpr_426] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_426] = true;
    arteoR_pL[ARTL_ART_subExpr_426] = true;
    artPopD[ARTL_ART_subExpr_426] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_428] = "subExpr ::= . exp ";
    artLabelStrings[ARTL_ART_subExpr_428] = "";
    artlhsL[ARTL_ART_subExpr_428] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_428] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_430] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_430] = "subExpr ::= exp .";
    artLabelStrings[ARTL_ART_subExpr_430] = "";
    artlhsL[ARTL_ART_subExpr_430] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_430] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_subExpr_430] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_430] = true;
    arteoR_pL[ARTL_ART_subExpr_430] = true;
    artPopD[ARTL_ART_subExpr_430] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_432] = "subExpr ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subExpr_432] = "";
    artlhsL[ARTL_ART_subExpr_432] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_432] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_434] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subExpr_433] = "subExpr ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subExpr_433] = "";
    artlhsL[ARTL_ART_subExpr_433] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_434] = "subExpr ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_subExpr_434] = "";
    artlhsL[ARTL_ART_subExpr_434] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_434] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_434] = true;
    artFolds[ARTL_ART_subExpr_436] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_436] = "subExpr ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_subExpr_436] = "";
    artlhsL[ARTL_ART_subExpr_436] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_436] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_436] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_subExpr_436] = true;
    artFolds[ARTL_ART_subExpr_438] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subExpr_437] = "subExpr ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subExpr_437] = "";
    artlhsL[ARTL_ART_subExpr_437] = ARTL_ART_subExpr;
    artPopD[ARTL_ART_subExpr_437] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_438] = "subExpr ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_subExpr_438] = "";
    artlhsL[ARTL_ART_subExpr_438] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_438] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_438] = true;
    arteoR_pL[ARTL_ART_subExpr_438] = true;
    artPopD[ARTL_ART_subExpr_438] = true;
  }

  public void artTableInitialiser_ART_tetrahedron() {
    artLabelInternalStrings[ARTL_ART_tetrahedron] = "tetrahedron";
    artLabelStrings[ARTL_ART_tetrahedron] = "tetrahedron";
    artKindOfs[ARTL_ART_tetrahedron] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_tetrahedron_634] = "tetrahedron ::= . 'TETRAHEDRON'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_634] = "";
    artlhsL[ARTL_ART_tetrahedron_634] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_tetrahedron_634] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_tetrahedron_636] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_tetrahedron_635] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_635] = "";
    artlhsL[ARTL_ART_tetrahedron_635] = ARTL_ART_tetrahedron;
    artLabelInternalStrings[ARTL_ART_tetrahedron_636] = "tetrahedron ::= 'TETRAHEDRON'  . '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_636] = "";
    artlhsL[ARTL_ART_tetrahedron_636] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_tetrahedron_636] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_tetrahedron_636] = true;
    artFolds[ARTL_ART_tetrahedron_638] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_tetrahedron_637] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_637] = "";
    artlhsL[ARTL_ART_tetrahedron_637] = ARTL_ART_tetrahedron;
    artLabelInternalStrings[ARTL_ART_tetrahedron_638] = "tetrahedron ::= 'TETRAHEDRON'  '('  . REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_638] = "";
    artlhsL[ARTL_ART_tetrahedron_638] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_tetrahedron_638] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_tetrahedron_640] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL . ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_640] = "";
    artlhsL[ARTL_ART_tetrahedron_640] = ARTL_ART_tetrahedron;
    artSlotInstanceOfs[ARTL_ART_tetrahedron_640] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_tetrahedron_640] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_tetrahedron_640] = true;
    artFolds[ARTL_ART_tetrahedron_642] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_tetrahedron_641] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_641] = "";
    artlhsL[ARTL_ART_tetrahedron_641] = ARTL_ART_tetrahedron;
    artPopD[ARTL_ART_tetrahedron_641] = true;
    artLabelInternalStrings[ARTL_ART_tetrahedron_642] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  .";
    artLabelStrings[ARTL_ART_tetrahedron_642] = "";
    artlhsL[ARTL_ART_tetrahedron_642] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_tetrahedron_642] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_tetrahedron_642] = true;
    arteoR_pL[ARTL_ART_tetrahedron_642] = true;
    artPopD[ARTL_ART_tetrahedron_642] = true;
  }

  public void artTableInitialiser_ART_torus() {
    artLabelInternalStrings[ARTL_ART_torus] = "torus";
    artLabelStrings[ARTL_ART_torus] = "torus";
    artKindOfs[ARTL_ART_torus] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_torus_620] = "torus ::= . 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_620] = "";
    artlhsL[ARTL_ART_torus_620] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_620] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_torus_622] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_torus_621] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_621] = "";
    artlhsL[ARTL_ART_torus_621] = ARTL_ART_torus;
    artLabelInternalStrings[ARTL_ART_torus_622] = "torus ::= 'TORUS'  . '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_622] = "";
    artlhsL[ARTL_ART_torus_622] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_622] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_torus_622] = true;
    artFolds[ARTL_ART_torus_624] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_torus_623] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_623] = "";
    artlhsL[ARTL_ART_torus_623] = ARTL_ART_torus;
    artLabelInternalStrings[ARTL_ART_torus_624] = "torus ::= 'TORUS'  '('  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_624] = "";
    artlhsL[ARTL_ART_torus_624] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_624] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_torus_626] = "torus ::= 'TORUS'  '('  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_626] = "";
    artlhsL[ARTL_ART_torus_626] = ARTL_ART_torus;
    artSlotInstanceOfs[ARTL_ART_torus_626] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_torus_626] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_torus_628] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_torus_627] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_627] = "";
    artlhsL[ARTL_ART_torus_627] = ARTL_ART_torus;
    artLabelInternalStrings[ARTL_ART_torus_628] = "torus ::= 'TORUS'  '('  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_628] = "";
    artlhsL[ARTL_ART_torus_628] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_628] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_torus_630] = "torus ::= 'TORUS'  '('  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_torus_630] = "";
    artlhsL[ARTL_ART_torus_630] = ARTL_ART_torus;
    artSlotInstanceOfs[ARTL_ART_torus_630] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_torus_630] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_torus_630] = true;
    artFolds[ARTL_ART_torus_632] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_torus_631] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_631] = "";
    artlhsL[ARTL_ART_torus_631] = ARTL_ART_torus;
    artPopD[ARTL_ART_torus_631] = true;
    artLabelInternalStrings[ARTL_ART_torus_632] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_torus_632] = "";
    artlhsL[ARTL_ART_torus_632] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_632] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_torus_632] = true;
    arteoR_pL[ARTL_ART_torus_632] = true;
    artPopD[ARTL_ART_torus_632] = true;
  }

  public void artTableInitialiser_ART_translate() {
    artLabelInternalStrings[ARTL_ART_translate] = "translate";
    artLabelStrings[ARTL_ART_translate] = "translate";
    artKindOfs[ARTL_ART_translate] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_translate_204] = "translate ::= . deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_204] = "";
    artlhsL[ARTL_ART_translate_204] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_204] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_translate_206] = "translate ::= deref . '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_206] = "";
    artlhsL[ARTL_ART_translate_206] = ARTL_ART_translate;
    artSlotInstanceOfs[ARTL_ART_translate_206] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_translate_206] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_translate_206] = true;
    artFolds[ARTL_ART_translate_208] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_207] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_207] = "";
    artlhsL[ARTL_ART_translate_207] = ARTL_ART_translate;
    artLabelInternalStrings[ARTL_ART_translate_208] = "translate ::= deref '.translate'  . '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_208] = "";
    artlhsL[ARTL_ART_translate_208] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_208] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_translate_210] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_209] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_209] = "";
    artlhsL[ARTL_ART_translate_209] = ARTL_ART_translate;
    artLabelInternalStrings[ARTL_ART_translate_210] = "translate ::= deref '.translate'  '('  . REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_210] = "";
    artlhsL[ARTL_ART_translate_210] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_210] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_translate_212] = "translate ::= deref '.translate'  '('  REAL . ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_212] = "";
    artlhsL[ARTL_ART_translate_212] = ARTL_ART_translate;
    artSlotInstanceOfs[ARTL_ART_translate_212] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_translate_212] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_translate_214] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_213] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_213] = "";
    artlhsL[ARTL_ART_translate_213] = ARTL_ART_translate;
    artLabelInternalStrings[ARTL_ART_translate_214] = "translate ::= deref '.translate'  '('  REAL ','  . REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_214] = "";
    artlhsL[ARTL_ART_translate_214] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_214] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_translate_216] = "translate ::= deref '.translate'  '('  REAL ','  REAL . ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_216] = "";
    artlhsL[ARTL_ART_translate_216] = ARTL_ART_translate;
    artSlotInstanceOfs[ARTL_ART_translate_216] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_translate_216] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_translate_218] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_217] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_217] = "";
    artlhsL[ARTL_ART_translate_217] = ARTL_ART_translate;
    artLabelInternalStrings[ARTL_ART_translate_218] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  . REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_218] = "";
    artlhsL[ARTL_ART_translate_218] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_218] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_translate_220] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL . ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_220] = "";
    artlhsL[ARTL_ART_translate_220] = ARTL_ART_translate;
    artSlotInstanceOfs[ARTL_ART_translate_220] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_translate_220] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_translate_220] = true;
    artFolds[ARTL_ART_translate_222] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_221] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_221] = "";
    artlhsL[ARTL_ART_translate_221] = ARTL_ART_translate;
    artPopD[ARTL_ART_translate_221] = true;
    artLabelInternalStrings[ARTL_ART_translate_222] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  . ';'  ";
    artLabelStrings[ARTL_ART_translate_222] = "";
    artlhsL[ARTL_ART_translate_222] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_222] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_translate_222] = true;
    artFolds[ARTL_ART_translate_224] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_223] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_223] = "";
    artlhsL[ARTL_ART_translate_223] = ARTL_ART_translate;
    artPopD[ARTL_ART_translate_223] = true;
    artLabelInternalStrings[ARTL_ART_translate_224] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  .";
    artLabelStrings[ARTL_ART_translate_224] = "";
    artlhsL[ARTL_ART_translate_224] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_224] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_translate_224] = true;
    arteoR_pL[ARTL_ART_translate_224] = true;
    artPopD[ARTL_ART_translate_224] = true;
  }

  public void artTableInitialiser_ART_while() {
    artLabelInternalStrings[ARTL_ART_while] = "while";
    artLabelStrings[ARTL_ART_while] = "while";
    artKindOfs[ARTL_ART_while] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_while_116] = "while ::= . 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_116] = "";
    artlhsL[ARTL_ART_while_116] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_116] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_118] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_117] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_117] = "";
    artlhsL[ARTL_ART_while_117] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_118] = "while ::= 'while'  . '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_118] = "";
    artlhsL[ARTL_ART_while_118] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_118] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_while_118] = true;
    artFolds[ARTL_ART_while_120] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_119] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_119] = "";
    artlhsL[ARTL_ART_while_119] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_120] = "while ::= 'while'  '('  . relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_120] = "";
    artlhsL[ARTL_ART_while_120] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_120] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_while_122] = "while ::= 'while'  '('  relExpr . ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_122] = "";
    artlhsL[ARTL_ART_while_122] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_122] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_while_122] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_124] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_123] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_123] = "";
    artlhsL[ARTL_ART_while_123] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_124] = "while ::= 'while'  '('  relExpr ')'  . '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_124] = "";
    artlhsL[ARTL_ART_while_124] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_124] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_while_126] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_125] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_125] = "";
    artlhsL[ARTL_ART_while_125] = ARTL_ART_while;
    artLabelInternalStrings[ARTL_ART_while_126] = "while ::= 'while'  '('  relExpr ')'  '{'  . statement '}'  ";
    artLabelStrings[ARTL_ART_while_126] = "";
    artlhsL[ARTL_ART_while_126] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_126] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_while_128] = "while ::= 'while'  '('  relExpr ')'  '{'  statement . '}'  ";
    artLabelStrings[ARTL_ART_while_128] = "";
    artlhsL[ARTL_ART_while_128] = ARTL_ART_while;
    artSlotInstanceOfs[ARTL_ART_while_128] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_while_128] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_while_128] = true;
    artFolds[ARTL_ART_while_130] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_while_129] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  ";
    artLabelStrings[ARTL_ART_while_129] = "";
    artlhsL[ARTL_ART_while_129] = ARTL_ART_while;
    artPopD[ARTL_ART_while_129] = true;
    artLabelInternalStrings[ARTL_ART_while_130] = "while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  .";
    artLabelStrings[ARTL_ART_while_130] = "";
    artlhsL[ARTL_ART_while_130] = ARTL_ART_while;
    artKindOfs[ARTL_ART_while_130] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_while_130] = true;
    arteoR_pL[ARTL_ART_while_130] = true;
    artPopD[ARTL_ART_while_130] = true;
  }

  public void artTableInitialiser_ART_xor() {
    artLabelInternalStrings[ARTL_ART_xor] = "xor";
    artLabelStrings[ARTL_ART_xor] = "xor";
    artKindOfs[ARTL_ART_xor] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_xor_392] = "xor ::= . relExpr '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_392] = "";
    artlhsL[ARTL_ART_xor_392] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_xor_392] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_xor_394] = "xor ::= relExpr . '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_394] = "";
    artlhsL[ARTL_ART_xor_394] = ARTL_ART_xor;
    artSlotInstanceOfs[ARTL_ART_xor_394] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_xor_394] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_xor_394] = true;
    artFolds[ARTL_ART_xor_396] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_xor_395] = "xor ::= relExpr '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_395] = "";
    artlhsL[ARTL_ART_xor_395] = ARTL_ART_xor;
    artLabelInternalStrings[ARTL_ART_xor_396] = "xor ::= relExpr '^'  . relExpr ";
    artLabelStrings[ARTL_ART_xor_396] = "";
    artlhsL[ARTL_ART_xor_396] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_xor_396] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_xor_398] = "xor ::= relExpr '^'  relExpr .";
    artLabelStrings[ARTL_ART_xor_398] = "";
    artlhsL[ARTL_ART_xor_398] = ARTL_ART_xor;
    artSlotInstanceOfs[ARTL_ART_xor_398] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_xor_398] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_xor_398] = true;
    arteoR_pL[ARTL_ART_xor_398] = true;
    artPopD[ARTL_ART_xor_398] = true;
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
    artLabelStrings[ARTTS__PERCENT] = "%";
    artLabelInternalStrings[ARTTS__PERCENT] = "'%'";
    artKindOfs[ARTTS__PERCENT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERCENT] = true;
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
    artLabelStrings[ARTTS__PLUS_EQUAL] = "+=";
    artLabelInternalStrings[ARTTS__PLUS_EQUAL] = "'+='";
    artKindOfs[ARTTS__PLUS_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PLUS_EQUAL] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS] = "-";
    artLabelInternalStrings[ARTTS__MINUS] = "'-'";
    artKindOfs[ARTTS__MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS] = true;
    artLabelStrings[ARTTS__PERIODrotate] = ".rotate";
    artLabelInternalStrings[ARTTS__PERIODrotate] = "'.rotate'";
    artKindOfs[ARTTS__PERIODrotate] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIODrotate] = true;
    artLabelStrings[ARTTS__PERIODscale] = ".scale";
    artLabelInternalStrings[ARTTS__PERIODscale] = "'.scale'";
    artKindOfs[ARTTS__PERIODscale] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIODscale] = true;
    artLabelStrings[ARTTS__PERIODtranslate] = ".translate";
    artLabelInternalStrings[ARTTS__PERIODtranslate] = "'.translate'";
    artKindOfs[ARTTS__PERIODtranslate] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIODtranslate] = true;
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
    artLabelStrings[ARTTS__GT_EQUAL] = ">=";
    artLabelInternalStrings[ARTTS__GT_EQUAL] = "'>='";
    artKindOfs[ARTTS__GT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT_EQUAL] = true;
    artLabelStrings[ARTTS_BOX] = "BOX";
    artLabelInternalStrings[ARTTS_BOX] = "'BOX'";
    artKindOfs[ARTTS_BOX] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_BOX] = true;
    artLabelStrings[ARTTS_CONE] = "CONE";
    artLabelInternalStrings[ARTTS_CONE] = "'CONE'";
    artKindOfs[ARTTS_CONE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_CONE] = true;
    artLabelStrings[ARTTS_CUBE] = "CUBE";
    artLabelInternalStrings[ARTTS_CUBE] = "'CUBE'";
    artKindOfs[ARTTS_CUBE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_CUBE] = true;
    artLabelStrings[ARTTS_CYLINDER] = "CYLINDER";
    artLabelInternalStrings[ARTTS_CYLINDER] = "'CYLINDER'";
    artKindOfs[ARTTS_CYLINDER] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_CYLINDER] = true;
    artLabelStrings[ARTTS_PYRAMID] = "PYRAMID";
    artLabelInternalStrings[ARTTS_PYRAMID] = "'PYRAMID'";
    artKindOfs[ARTTS_PYRAMID] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_PYRAMID] = true;
    artLabelStrings[ARTTS_SPHERE] = "SPHERE";
    artLabelInternalStrings[ARTTS_SPHERE] = "'SPHERE'";
    artKindOfs[ARTTS_SPHERE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_SPHERE] = true;
    artLabelStrings[ARTTS_TETRAHEDRON] = "TETRAHEDRON";
    artLabelInternalStrings[ARTTS_TETRAHEDRON] = "'TETRAHEDRON'";
    artKindOfs[ARTTS_TETRAHEDRON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_TETRAHEDRON] = true;
    artLabelStrings[ARTTS_TORUS] = "TORUS";
    artLabelInternalStrings[ARTTS_TORUS] = "'TORUS'";
    artKindOfs[ARTTS_TORUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_TORUS] = true;
    artLabelStrings[ARTTS__UPARROW] = "^";
    artLabelInternalStrings[ARTTS__UPARROW] = "'^'";
    artKindOfs[ARTTS__UPARROW] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__UPARROW] = true;
    artLabelStrings[ARTTS_else] = "else";
    artLabelInternalStrings[ARTTS_else] = "'else'";
    artKindOfs[ARTTS_else] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_else] = true;
    artLabelStrings[ARTTS_for] = "for";
    artLabelInternalStrings[ARTTS_for] = "'for'";
    artKindOfs[ARTTS_for] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_for] = true;
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
    artLabelStrings[ARTTS_println] = "println";
    artLabelInternalStrings[ARTTS_println] = "'println'";
    artKindOfs[ARTTS_println] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_println] = true;
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
    artTableInitialiser_ART_box();
    artTableInitialiser_ART_compassign();
    artTableInitialiser_ART_cone();
    artTableInitialiser_ART_cube();
    artTableInitialiser_ART_cylinder();
    artTableInitialiser_ART_deref();
    artTableInitialiser_ART_div();
    artTableInitialiser_ART_eq();
    artTableInitialiser_ART_exp();
    artTableInitialiser_ART_for();
    artTableInitialiser_ART_ge();
    artTableInitialiser_ART_gt();
    artTableInitialiser_ART_if();
    artTableInitialiser_ART_init();
    artTableInitialiser_ART_le();
    artTableInitialiser_ART_lt();
    artTableInitialiser_ART_mod();
    artTableInitialiser_ART_mul();
    artTableInitialiser_ART_ne();
    artTableInitialiser_ART_neg();
    artTableInitialiser_ART_not();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_or();
    artTableInitialiser_ART_paint();
    artTableInitialiser_ART_println();
    artTableInitialiser_ART_printlnElem();
    artTableInitialiser_ART_pyramid();
    artTableInitialiser_ART_relExpr();
    artTableInitialiser_ART_rotate();
    artTableInitialiser_ART_scale();
    artTableInitialiser_ART_seq();
    artTableInitialiser_ART_sphere();
    artTableInitialiser_ART_statement();
    artTableInitialiser_ART_sub();
    artTableInitialiser_ART_subExpr();
    artTableInitialiser_ART_tetrahedron();
    artTableInitialiser_ART_torus();
    artTableInitialiser_ART_translate();
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
    artSetExtent = 96;
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
      case ARTL_ART_ID_660: 
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
    case ARTL_ART_INTEGER_666: 
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
    case ARTL_ART_REAL_672: 
            ARTRD_REAL(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL);
            if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      REAL.lexeme = artLexeme(REAL.leftExtent, REAL.rightExtent);
REAL.v = artLexemeAsReal(REAL.leftExtent, REAL.rightExtent); 
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
    case ARTL_ART_STRING_DQ_678: 
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
    case ARTL_ART_add_452: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*add ::= subExpr '+'  operand .*/
    case ARTL_ART_add_454: 
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
    case ARTL_ART_and_374: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*and ::= relExpr '&&'  relExpr .*/
    case ARTL_ART_and_376: 
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
    case ARTL_ART_assign_60: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                        break;
    /*assign ::= ID '='  relExpr . ';'  */
    case ARTL_ART_assign_62: 
      ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*assign ::= ID '='  relExpr ';'  .*/
    case ARTL_ART_assign_64: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_assign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
                  break;
        default:
          throw new ARTException("ARTRD_assign: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_box(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1, ARTAT_ART_REAL REAL2, ARTAT_ART_REAL REAL3) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*box ::= 'BOX'  '('  . REAL ','  REAL ','  REAL ')'  */
    case ARTL_ART_box_558: 
                              break;
    /*box ::= 'BOX'  '('  REAL . ','  REAL ','  REAL ')'  */
    case ARTL_ART_box_560: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*box ::= 'BOX'  '('  REAL ','  . REAL ','  REAL ')'  */
    case ARTL_ART_box_562: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*box ::= 'BOX'  '('  REAL ','  REAL . ','  REAL ')'  */
    case ARTL_ART_box_564: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*box ::= 'BOX'  '('  REAL ','  REAL ','  . REAL ')'  */
    case ARTL_ART_box_566: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*box ::= 'BOX'  '('  REAL ','  REAL ','  REAL . ')'  */
    case ARTL_ART_box_568: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL3));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL3);
            break;
    /*box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  .*/
    case ARTL_ART_box_570: 
      REAL1 = new ARTAT_ART_REAL();
      REAL2 = new ARTAT_ART_REAL();
      REAL3 = new ARTAT_ART_REAL();
            ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
        default:
          throw new ARTException("ARTRD_box: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_compassign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*compassign ::= ID '+='  . relExpr ';'  */
    case ARTL_ART_compassign_70: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
                        break;
    /*compassign ::= ID '+='  relExpr . ';'  */
    case ARTL_ART_compassign_72: 
      ARTRD_compassign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*compassign ::= ID '+='  relExpr ';'  .*/
    case ARTL_ART_compassign_74: 
      ID1 = new ARTAT_ART_ID();
            ARTRD_compassign(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1);
                  break;
        default:
          throw new ARTException("ARTRD_compassign: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_cone(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1, ARTAT_ART_REAL REAL2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*cone ::= 'CONE'  '('  . REAL ','  REAL ')'  */
    case ARTL_ART_cone_610: 
                              break;
    /*cone ::= 'CONE'  '('  REAL . ','  REAL ')'  */
    case ARTL_ART_cone_612: 
      ARTRD_cone(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*cone ::= 'CONE'  '('  REAL ','  . REAL ')'  */
    case ARTL_ART_cone_614: 
      ARTRD_cone(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
    /*cone ::= 'CONE'  '('  REAL ','  REAL . ')'  */
    case ARTL_ART_cone_616: 
      ARTRD_cone(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*cone ::= 'CONE'  '('  REAL ','  REAL ')'  .*/
    case ARTL_ART_cone_618: 
      REAL1 = new ARTAT_ART_REAL();
      REAL2 = new ARTAT_ART_REAL();
            ARTRD_cone(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
        default:
          throw new ARTException("ARTRD_cone: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_cube(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*cube ::= 'CUBE'  '('  . REAL ')'  */
    case ARTL_ART_cube_576: 
                              break;
    /*cube ::= 'CUBE'  '('  REAL . ')'  */
    case ARTL_ART_cube_578: 
      ARTRD_cube(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*cube ::= 'CUBE'  '('  REAL ')'  .*/
    case ARTL_ART_cube_580: 
      REAL1 = new ARTAT_ART_REAL();
            ARTRD_cube(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
                  break;
        default:
          throw new ARTException("ARTRD_cube: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_cylinder(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1, ARTAT_ART_REAL REAL2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*cylinder ::= 'CYLINDER'  '('  . REAL ','  REAL ')'  */
    case ARTL_ART_cylinder_596: 
                              break;
    /*cylinder ::= 'CYLINDER'  '('  REAL . ','  REAL ')'  */
    case ARTL_ART_cylinder_598: 
      ARTRD_cylinder(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*cylinder ::= 'CYLINDER'  '('  REAL ','  . REAL ')'  */
    case ARTL_ART_cylinder_600: 
      ARTRD_cylinder(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
    /*cylinder ::= 'CYLINDER'  '('  REAL ','  REAL . ')'  */
    case ARTL_ART_cylinder_602: 
      ARTRD_cylinder(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  .*/
    case ARTL_ART_cylinder_604: 
      REAL1 = new ARTAT_ART_REAL();
      REAL2 = new ARTAT_ART_REAL();
            ARTRD_cylinder(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
        default:
          throw new ARTException("ARTRD_cylinder: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_deref_552: 
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
    case ARTL_ART_div_468: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*div ::= subExpr '/'  operand .*/
    case ARTL_ART_div_470: 
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
    case ARTL_ART_eq_326: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*eq ::= relExpr '=='  subExpr .*/
    case ARTL_ART_eq_328: 
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
    case ARTL_ART_exp_490: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*exp ::= subExpr '**'  operand .*/
    case ARTL_ART_exp_492: 
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

public void ARTRD_for(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*for ::= 'for'  '('  . statement relExpr ';'  statement ')'  '{'  statement '}'  */
    case ARTL_ART_for_136: 
                              break;
    /*for ::= 'for'  '('  statement . relExpr ';'  statement ')'  '{'  statement '}'  */
    case ARTL_ART_for_138: 
      ARTRD_for(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*for ::= 'for'  '('  statement relExpr . ';'  statement ')'  '{'  statement '}'  */
    case ARTL_ART_for_140: 
      ARTRD_for(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*for ::= 'for'  '('  statement relExpr ';'  . statement ')'  '{'  statement '}'  */
    case ARTL_ART_for_142: 
      ARTRD_for(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*for ::= 'for'  '('  statement relExpr ';'  statement . ')'  '{'  statement '}'  */
    case ARTL_ART_for_144: 
      ARTRD_for(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*for ::= 'for'  '('  statement relExpr ';'  statement ')'  . '{'  statement '}'  */
    case ARTL_ART_for_146: 
      ARTRD_for(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  . statement '}'  */
    case ARTL_ART_for_148: 
      ARTRD_for(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement . '}'  */
    case ARTL_ART_for_150: 
      ARTRD_for(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*for ::= 'for'  '('  statement relExpr ';'  statement ')'  '{'  statement '}'  .*/
    case ARTL_ART_for_152: 
            ARTRD_for(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_for: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ge(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ge ::= relExpr '>='  . subExpr */
    case ARTL_ART_ge_350: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ge ::= relExpr '>='  subExpr .*/
    case ARTL_ART_ge_352: 
            ARTRD_ge(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ge: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_gt_342: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*gt ::= relExpr '>'  subExpr .*/
    case ARTL_ART_gt_344: 
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
    case ARTL_ART_if_80: 
                              break;
    /*if ::= 'if'  '('  relExpr . ')'  '{'  statement '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_82: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  . '{'  statement '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_84: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  . statement '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_86: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement . '}'  'else'  '{'  statement '}'  */
    case ARTL_ART_if_88: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  . 'else'  '{'  statement '}'  */
    case ARTL_ART_if_90: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  . '{'  statement '}'  */
    case ARTL_ART_if_92: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  . statement '}'  */
    case ARTL_ART_if_94: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement . '}'  */
    case ARTL_ART_if_96: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  'else'  '{'  statement '}'  .*/
    case ARTL_ART_if_98: 
            ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  . relExpr ')'  '{'  statement '}'  */
    case ARTL_ART_if_104: 
                              break;
    /*if ::= 'if'  '('  relExpr . ')'  '{'  statement '}'  */
    case ARTL_ART_if_106: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  . '{'  statement '}'  */
    case ARTL_ART_if_108: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  . statement '}'  */
    case ARTL_ART_if_110: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement . '}'  */
    case ARTL_ART_if_112: 
      ARTRD_if(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*if ::= 'if'  '('  relExpr ')'  '{'  statement '}'  .*/
    case ARTL_ART_if_114: 
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
    case ARTL_ART_init_182: 
                              break;
    /*init ::= 'init'  '('  INTEGER . ','  INTEGER ')'  ';'  */
    case ARTL_ART_init_184: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*init ::= 'init'  '('  INTEGER ','  . INTEGER ')'  ';'  */
    case ARTL_ART_init_186: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER . ')'  ';'  */
    case ARTL_ART_init_188: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
      INTEGER2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER2));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER2);
            break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER ')'  . ';'  */
    case ARTL_ART_init_190: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  .*/
    case ARTL_ART_init_192: 
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

public void ARTRD_le(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*le ::= relExpr '<='  . subExpr */
    case ARTL_ART_le_366: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*le ::= relExpr '<='  subExpr .*/
    case ARTL_ART_le_368: 
            ARTRD_le(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_le: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_lt_358: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*lt ::= relExpr '<'  subExpr .*/
    case ARTL_ART_lt_360: 
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

public void ARTRD_mod(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*mod ::= subExpr '%'  . operand */
    case ARTL_ART_mod_476: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*mod ::= subExpr '%'  operand .*/
    case ARTL_ART_mod_478: 
            ARTRD_mod(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
        default:
          throw new ARTException("ARTRD_mod: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_mul_460: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*mul ::= subExpr '*'  operand .*/
    case ARTL_ART_mul_462: 
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
    case ARTL_ART_ne_334: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ne ::= relExpr '!='  subExpr .*/
    case ARTL_ART_ne_336: 
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
    case ARTL_ART_neg_484: 
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
    case ARTL_ART_not_390: 
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
    case ARTL_ART_operand_496: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_500: 
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
    case ARTL_ART_operand_504: 
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
    case ARTL_ART_operand_508: 
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
    case ARTL_ART_operand_514: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*operand ::= '('  subExpr ')'  .*/
    case ARTL_ART_operand_516: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
                  break;
    /*operand ::= box .*/
    case ARTL_ART_operand_520: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_box(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*operand ::= cube .*/
    case ARTL_ART_operand_524: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_cube(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= sphere .*/
    case ARTL_ART_operand_528: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sphere(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= cylinder .*/
    case ARTL_ART_operand_532: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_cylinder(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*operand ::= cone .*/
    case ARTL_ART_operand_536: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_cone(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*operand ::= torus .*/
    case ARTL_ART_operand_540: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_torus(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*operand ::= tetrahedron .*/
    case ARTL_ART_operand_544: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_tetrahedron(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= pyramid .*/
    case ARTL_ART_operand_548: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_pyramid(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
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
    case ARTL_ART_or_382: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*or ::= relExpr '||'  relExpr .*/
    case ARTL_ART_or_384: 
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
    case ARTL_ART_paint_198: 
                              break;
    /*paint ::= 'paint'  '('  ')'  . ';'  */
    case ARTL_ART_paint_200: 
      ARTRD_paint(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*paint ::= 'paint'  '('  ')'  ';'  .*/
    case ARTL_ART_paint_202: 
            ARTRD_paint(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_paint: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_println(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*println ::= 'println'  '('  . printlnElem ')'  ';'  */
    case ARTL_ART_println_158: 
                              break;
    /*println ::= 'println'  '('  printlnElem . ')'  ';'  */
    case ARTL_ART_println_160: 
      ARTRD_println(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_printlnElem(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*println ::= 'println'  '('  printlnElem ')'  . ';'  */
    case ARTL_ART_println_162: 
      ARTRD_println(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*println ::= 'println'  '('  printlnElem ')'  ';'  .*/
    case ARTL_ART_println_164: 
            ARTRD_println(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_println: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_printlnElem(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*printlnElem ::= relExpr .*/
    case ARTL_ART_printlnElem_168: 
            ARTRD_printlnElem(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*printlnElem ::= relExpr ','  . printlnElem */
    case ARTL_ART_printlnElem_174: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*printlnElem ::= relExpr ','  printlnElem .*/
    case ARTL_ART_printlnElem_176: 
            ARTRD_printlnElem(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printlnElem(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_printlnElem: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_pyramid(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1, ARTAT_ART_REAL REAL2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*pyramid ::= 'PYRAMID'  '('  . REAL ','  REAL ')'  */
    case ARTL_ART_pyramid_648: 
                              break;
    /*pyramid ::= 'PYRAMID'  '('  REAL . ','  REAL ')'  */
    case ARTL_ART_pyramid_650: 
      ARTRD_pyramid(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*pyramid ::= 'PYRAMID'  '('  REAL ','  . REAL ')'  */
    case ARTL_ART_pyramid_652: 
      ARTRD_pyramid(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
    /*pyramid ::= 'PYRAMID'  '('  REAL ','  REAL . ')'  */
    case ARTL_ART_pyramid_654: 
      ARTRD_pyramid(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  .*/
    case ARTL_ART_pyramid_656: 
      REAL1 = new ARTAT_ART_REAL();
      REAL2 = new ARTAT_ART_REAL();
            ARTRD_pyramid(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
        default:
          throw new ARTException("ARTRD_pyramid: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_relExpr_272: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= eq .*/
    case ARTL_ART_relExpr_276: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_eq(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= ne .*/
    case ARTL_ART_relExpr_280: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ne(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= gt .*/
    case ARTL_ART_relExpr_284: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_gt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= ge .*/
    case ARTL_ART_relExpr_288: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ge(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= lt .*/
    case ARTL_ART_relExpr_292: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_lt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= le .*/
    case ARTL_ART_relExpr_296: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_le(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= and .*/
    case ARTL_ART_relExpr_300: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_and(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= or .*/
    case ARTL_ART_relExpr_304: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_or(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= not .*/
    case ARTL_ART_relExpr_308: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_not(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= xor .*/
    case ARTL_ART_relExpr_312: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_xor(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= '('  relExpr . ')'  */
    case ARTL_ART_relExpr_318: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= '('  relExpr ')'  .*/
    case ARTL_ART_relExpr_320: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_relExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_rotate(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1, ARTAT_ART_REAL REAL2, ARTAT_ART_REAL REAL3) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*rotate ::= deref '.rotate'  . '('  REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_230: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null);
                        break;
    /*rotate ::= deref '.rotate'  '('  . REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_232: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*rotate ::= deref '.rotate'  '('  REAL . ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_234: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  . REAL ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_236: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL . ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_238: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  . REAL ')'  ';'  */
    case ARTL_ART_rotate_240: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL . ')'  ';'  */
    case ARTL_ART_rotate_242: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL3));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL3);
            break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  . ';'  */
    case ARTL_ART_rotate_244: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  .*/
    case ARTL_ART_rotate_246: 
      REAL1 = new ARTAT_ART_REAL();
      REAL2 = new ARTAT_ART_REAL();
      REAL3 = new ARTAT_ART_REAL();
            ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
        default:
          throw new ARTException("ARTRD_rotate: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_scale(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1, ARTAT_ART_REAL REAL2, ARTAT_ART_REAL REAL3) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*scale ::= deref '.scale'  . '('  REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_scale_252: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null);
                        break;
    /*scale ::= deref '.scale'  '('  . REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_scale_254: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*scale ::= deref '.scale'  '('  REAL . ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_scale_256: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*scale ::= deref '.scale'  '('  REAL ','  . REAL ','  REAL ')'  ';'  */
    case ARTL_ART_scale_258: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL . ','  REAL ')'  ';'  */
    case ARTL_ART_scale_260: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL ','  . REAL ')'  ';'  */
    case ARTL_ART_scale_262: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL . ')'  ';'  */
    case ARTL_ART_scale_264: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL3));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL3);
            break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  . ';'  */
    case ARTL_ART_scale_266: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  .*/
    case ARTL_ART_scale_268: 
      REAL1 = new ARTAT_ART_REAL();
      REAL2 = new ARTAT_ART_REAL();
      REAL3 = new ARTAT_ART_REAL();
            ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
        default:
          throw new ARTException("ARTRD_scale: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_seq_54: 
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

public void ARTRD_sphere(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*sphere ::= 'SPHERE'  '('  . REAL ')'  */
    case ARTL_ART_sphere_586: 
                              break;
    /*sphere ::= 'SPHERE'  '('  REAL . ')'  */
    case ARTL_ART_sphere_588: 
      ARTRD_sphere(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*sphere ::= 'SPHERE'  '('  REAL ')'  .*/
    case ARTL_ART_sphere_590: 
      REAL1 = new ARTAT_ART_REAL();
            ARTRD_sphere(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
                  break;
        default:
          throw new ARTException("ARTRD_sphere: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    /*statement ::= compassign .*/
    case ARTL_ART_statement_12: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_compassign(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= if .*/
    case ARTL_ART_statement_16: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_if(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= while .*/
    case ARTL_ART_statement_20: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_while(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= for .*/
    case ARTL_ART_statement_24: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_for(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= println .*/
    case ARTL_ART_statement_28: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_println(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= init .*/
    case ARTL_ART_statement_32: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_init(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*statement ::= paint .*/
    case ARTL_ART_statement_36: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_paint(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= translate .*/
    case ARTL_ART_statement_40: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_translate(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*statement ::= rotate .*/
    case ARTL_ART_statement_44: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_rotate(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*statement ::= scale .*/
    case ARTL_ART_statement_48: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_scale(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
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
    case ARTL_ART_sub_444: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*sub ::= subExpr '-'  operand .*/
    case ARTL_ART_sub_446: 
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
    case ARTL_ART_subExpr_402: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*subExpr ::= sub .*/
    case ARTL_ART_subExpr_406: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sub(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= add .*/
    case ARTL_ART_subExpr_410: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_add(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= mul .*/
    case ARTL_ART_subExpr_414: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_mul(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= div .*/
    case ARTL_ART_subExpr_418: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_div(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= mod .*/
    case ARTL_ART_subExpr_422: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_mod(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= neg .*/
    case ARTL_ART_subExpr_426: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_neg(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= exp .*/
    case ARTL_ART_subExpr_430: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_exp(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= '('  subExpr . ')'  */
    case ARTL_ART_subExpr_436: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= '('  subExpr ')'  .*/
    case ARTL_ART_subExpr_438: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_subExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_tetrahedron(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*tetrahedron ::= 'TETRAHEDRON'  '('  . REAL ')'  */
    case ARTL_ART_tetrahedron_638: 
                              break;
    /*tetrahedron ::= 'TETRAHEDRON'  '('  REAL . ')'  */
    case ARTL_ART_tetrahedron_640: 
      ARTRD_tetrahedron(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  .*/
    case ARTL_ART_tetrahedron_642: 
      REAL1 = new ARTAT_ART_REAL();
            ARTRD_tetrahedron(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
                  break;
        default:
          throw new ARTException("ARTRD_tetrahedron: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_torus(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1, ARTAT_ART_REAL REAL2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*torus ::= 'TORUS'  '('  . REAL ','  REAL ')'  */
    case ARTL_ART_torus_624: 
                              break;
    /*torus ::= 'TORUS'  '('  REAL . ','  REAL ')'  */
    case ARTL_ART_torus_626: 
      ARTRD_torus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*torus ::= 'TORUS'  '('  REAL ','  . REAL ')'  */
    case ARTL_ART_torus_628: 
      ARTRD_torus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
    /*torus ::= 'TORUS'  '('  REAL ','  REAL . ')'  */
    case ARTL_ART_torus_630: 
      ARTRD_torus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*torus ::= 'TORUS'  '('  REAL ','  REAL ')'  .*/
    case ARTL_ART_torus_632: 
      REAL1 = new ARTAT_ART_REAL();
      REAL2 = new ARTAT_ART_REAL();
            ARTRD_torus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
        default:
          throw new ARTException("ARTRD_torus: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_translate(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1, ARTAT_ART_REAL REAL2, ARTAT_ART_REAL REAL3) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*translate ::= deref '.translate'  . '('  REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_translate_208: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null);
                        break;
    /*translate ::= deref '.translate'  '('  . REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_translate_210: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*translate ::= deref '.translate'  '('  REAL . ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_translate_212: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*translate ::= deref '.translate'  '('  REAL ','  . REAL ','  REAL ')'  ';'  */
    case ARTL_ART_translate_214: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL . ','  REAL ')'  ';'  */
    case ARTL_ART_translate_216: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL ','  . REAL ')'  ';'  */
    case ARTL_ART_translate_218: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL . ')'  ';'  */
    case ARTL_ART_translate_220: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL3));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL3);
            break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  . ';'  */
    case ARTL_ART_translate_222: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  .*/
    case ARTL_ART_translate_224: 
      REAL1 = new ARTAT_ART_REAL();
      REAL2 = new ARTAT_ART_REAL();
      REAL3 = new ARTAT_ART_REAL();
            ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
        default:
          throw new ARTException("ARTRD_translate: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_while_120: 
                              break;
    /*while ::= 'while'  '('  relExpr . ')'  '{'  statement '}'  */
    case ARTL_ART_while_122: 
      ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*while ::= 'while'  '('  relExpr ')'  . '{'  statement '}'  */
    case ARTL_ART_while_124: 
      ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*while ::= 'while'  '('  relExpr ')'  '{'  . statement '}'  */
    case ARTL_ART_while_126: 
      ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*while ::= 'while'  '('  relExpr ')'  '{'  statement . '}'  */
    case ARTL_ART_while_128: 
      ARTRD_while(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*while ::= 'while'  '('  relExpr ')'  '{'  statement '}'  .*/
    case ARTL_ART_while_130: 
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
    case ARTL_ART_xor_396: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*xor ::= relExpr '^'  relExpr .*/
    case ARTL_ART_xor_398: 
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
    case ARTL_ART_box: ARTRD_box(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_compassign: ARTRD_compassign(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_cone: ARTRD_cone(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_cube: ARTRD_cube(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_cylinder: ARTRD_cylinder(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_deref: ARTRD_deref(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_div: ARTRD_div(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_eq: ARTRD_eq(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_exp: ARTRD_exp(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_for: ARTRD_for(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ge: ARTRD_ge(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_gt: ARTRD_gt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_if: ARTRD_if(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_init: ARTRD_init(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_le: ARTRD_le(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_lt: ARTRD_lt(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_mod: ARTRD_mod(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_mul: ARTRD_mul(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ne: ARTRD_ne(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_neg: ARTRD_neg(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_not: ARTRD_not(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_operand: ARTRD_operand(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_or: ARTRD_or(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_paint: ARTRD_paint(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_println: ARTRD_println(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_printlnElem: ARTRD_printlnElem(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_pyramid: ARTRD_pyramid(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_relExpr: ARTRD_relExpr(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_rotate: ARTRD_rotate(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_scale: ARTRD_scale(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_seq: ARTRD_seq(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_sphere: ARTRD_sphere(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_statement: ARTRD_statement(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_sub: ARTRD_sub(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_subExpr: ARTRD_subExpr(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_tetrahedron: ARTRD_tetrahedron(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_torus: ARTRD_torus(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_translate: ARTRD_translate(artElement.element, artParent, artWriteable, null, null, null); break;
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
