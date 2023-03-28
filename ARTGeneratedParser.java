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
  public static final int ARTTS__PLUS_EQUAL = 14;
  public static final int ARTTS__COMMA = 15;
  public static final int ARTTS__MINUS = 16;
  public static final int ARTTS__PERIODrotate = 17;
  public static final int ARTTS__PERIODscale = 18;
  public static final int ARTTS__PERIODtranslate = 19;
  public static final int ARTTS__SLASH = 20;
  public static final int ARTTS__SEMICOLON = 21;
  public static final int ARTTS__LT = 22;
  public static final int ARTTS__LT_EQUAL = 23;
  public static final int ARTTS__EQUAL = 24;
  public static final int ARTTS__EQUAL_EQUAL = 25;
  public static final int ARTTS__GT = 26;
  public static final int ARTTS__GT_EQUAL = 27;
  public static final int ARTTS_BOX = 28;
  public static final int ARTTS_CONE = 29;
  public static final int ARTTS_CUBE = 30;
  public static final int ARTTS_CYLINDER = 31;
  public static final int ARTTS_PYRAMID = 32;
  public static final int ARTTS_SPHERE = 33;
  public static final int ARTTS_TETRAHEDRON = 34;
  public static final int ARTTS_TORUS = 35;
  public static final int ARTTS__UPARROW = 36;
  public static final int ARTTS_else = 37;
  public static final int ARTTS_for = 38;
  public static final int ARTTS_if = 39;
  public static final int ARTTS_init = 40;
  public static final int ARTTS_paint = 41;
  public static final int ARTTS_print = 42;
  public static final int ARTTS_while = 43;
  public static final int ARTTS__LBRACE = 44;
  public static final int ARTTS__BAR_BAR = 45;
  public static final int ARTTS__RBRACE = 46;
  public static final int ARTX_EPSILON = 47;
  public static final int ARTL_ART_ID = 48;
  public static final int ARTL_ART_INTEGER = 49;
  public static final int ARTL_ART_REAL = 50;
  public static final int ARTL_ART_STRING_DQ = 51;
  public static final int ARTL_ART_add = 52;
  public static final int ARTL_ART_and = 53;
  public static final int ARTL_ART_assign = 54;
  public static final int ARTL_ART_box = 55;
  public static final int ARTL_ART_compassign = 56;
  public static final int ARTL_ART_cone = 57;
  public static final int ARTL_ART_cube = 58;
  public static final int ARTL_ART_cylinder = 59;
  public static final int ARTL_ART_deref = 60;
  public static final int ARTL_ART_div = 61;
  public static final int ARTL_ART_eq = 62;
  public static final int ARTL_ART_exp = 63;
  public static final int ARTL_ART_for = 64;
  public static final int ARTL_ART_ge = 65;
  public static final int ARTL_ART_gt = 66;
  public static final int ARTL_ART_if = 67;
  public static final int ARTL_ART_init = 68;
  public static final int ARTL_ART_le = 69;
  public static final int ARTL_ART_lt = 70;
  public static final int ARTL_ART_mul = 71;
  public static final int ARTL_ART_ne = 72;
  public static final int ARTL_ART_neg = 73;
  public static final int ARTL_ART_not = 74;
  public static final int ARTL_ART_operand = 75;
  public static final int ARTL_ART_or = 76;
  public static final int ARTL_ART_paint = 77;
  public static final int ARTL_ART_print = 78;
  public static final int ARTL_ART_pyramid = 79;
  public static final int ARTL_ART_relExpr = 80;
  public static final int ARTL_ART_rotate = 81;
  public static final int ARTL_ART_scale = 82;
  public static final int ARTL_ART_seq = 83;
  public static final int ARTL_ART_sphere = 84;
  public static final int ARTL_ART_statement = 85;
  public static final int ARTL_ART_sub = 86;
  public static final int ARTL_ART_subExpr = 87;
  public static final int ARTL_ART_tetrahedron = 88;
  public static final int ARTL_ART_torus = 89;
  public static final int ARTL_ART_translate = 90;
  public static final int ARTL_ART_while = 91;
  public static final int ARTL_ART_xor = 92;
  public static final int ARTL_ART_ID_633 = 93;
  public static final int ARTL_ART_ID_634 = 94;
  public static final int ARTL_ART_ID_635 = 95;
  public static final int ARTL_ART_ID_636 = 96;
  public static final int ARTL_ART_INTEGER_639 = 97;
  public static final int ARTL_ART_INTEGER_640 = 98;
  public static final int ARTL_ART_INTEGER_641 = 99;
  public static final int ARTL_ART_INTEGER_642 = 100;
  public static final int ARTL_ART_REAL_645 = 101;
  public static final int ARTL_ART_REAL_646 = 102;
  public static final int ARTL_ART_REAL_647 = 103;
  public static final int ARTL_ART_REAL_648 = 104;
  public static final int ARTL_ART_STRING_DQ_651 = 105;
  public static final int ARTL_ART_STRING_DQ_652 = 106;
  public static final int ARTL_ART_STRING_DQ_653 = 107;
  public static final int ARTL_ART_STRING_DQ_654 = 108;
  public static final int ARTL_ART_add_431 = 109;
  public static final int ARTL_ART_add_432 = 110;
  public static final int ARTL_ART_add_433 = 111;
  public static final int ARTL_ART_add_434 = 112;
  public static final int ARTL_ART_add_435 = 113;
  public static final int ARTL_ART_add_436 = 114;
  public static final int ARTL_ART_add_437 = 115;
  public static final int ARTL_ART_add_438 = 116;
  public static final int ARTL_ART_and_357 = 117;
  public static final int ARTL_ART_and_358 = 118;
  public static final int ARTL_ART_and_359 = 119;
  public static final int ARTL_ART_and_360 = 120;
  public static final int ARTL_ART_and_361 = 121;
  public static final int ARTL_ART_and_362 = 122;
  public static final int ARTL_ART_and_363 = 123;
  public static final int ARTL_ART_and_364 = 124;
  public static final int ARTL_ART_assign_55 = 125;
  public static final int ARTL_ART_assign_56 = 126;
  public static final int ARTL_ART_assign_57 = 127;
  public static final int ARTL_ART_assign_58 = 128;
  public static final int ARTL_ART_assign_59 = 129;
  public static final int ARTL_ART_assign_60 = 130;
  public static final int ARTL_ART_assign_61 = 131;
  public static final int ARTL_ART_assign_62 = 132;
  public static final int ARTL_ART_assign_63 = 133;
  public static final int ARTL_ART_assign_64 = 134;
  public static final int ARTL_ART_box_529 = 135;
  public static final int ARTL_ART_box_530 = 136;
  public static final int ARTL_ART_box_531 = 137;
  public static final int ARTL_ART_box_532 = 138;
  public static final int ARTL_ART_box_533 = 139;
  public static final int ARTL_ART_box_534 = 140;
  public static final int ARTL_ART_box_535 = 141;
  public static final int ARTL_ART_box_536 = 142;
  public static final int ARTL_ART_box_537 = 143;
  public static final int ARTL_ART_box_538 = 144;
  public static final int ARTL_ART_box_539 = 145;
  public static final int ARTL_ART_box_540 = 146;
  public static final int ARTL_ART_box_541 = 147;
  public static final int ARTL_ART_box_542 = 148;
  public static final int ARTL_ART_box_543 = 149;
  public static final int ARTL_ART_box_544 = 150;
  public static final int ARTL_ART_box_545 = 151;
  public static final int ARTL_ART_box_546 = 152;
  public static final int ARTL_ART_compassign_65 = 153;
  public static final int ARTL_ART_compassign_66 = 154;
  public static final int ARTL_ART_compassign_67 = 155;
  public static final int ARTL_ART_compassign_68 = 156;
  public static final int ARTL_ART_compassign_69 = 157;
  public static final int ARTL_ART_compassign_70 = 158;
  public static final int ARTL_ART_compassign_71 = 159;
  public static final int ARTL_ART_compassign_72 = 160;
  public static final int ARTL_ART_compassign_73 = 161;
  public static final int ARTL_ART_compassign_74 = 162;
  public static final int ARTL_ART_cone_581 = 163;
  public static final int ARTL_ART_cone_582 = 164;
  public static final int ARTL_ART_cone_583 = 165;
  public static final int ARTL_ART_cone_584 = 166;
  public static final int ARTL_ART_cone_585 = 167;
  public static final int ARTL_ART_cone_586 = 168;
  public static final int ARTL_ART_cone_587 = 169;
  public static final int ARTL_ART_cone_588 = 170;
  public static final int ARTL_ART_cone_589 = 171;
  public static final int ARTL_ART_cone_590 = 172;
  public static final int ARTL_ART_cone_591 = 173;
  public static final int ARTL_ART_cone_592 = 174;
  public static final int ARTL_ART_cone_593 = 175;
  public static final int ARTL_ART_cone_594 = 176;
  public static final int ARTL_ART_cube_547 = 177;
  public static final int ARTL_ART_cube_548 = 178;
  public static final int ARTL_ART_cube_549 = 179;
  public static final int ARTL_ART_cube_550 = 180;
  public static final int ARTL_ART_cube_551 = 181;
  public static final int ARTL_ART_cube_552 = 182;
  public static final int ARTL_ART_cube_553 = 183;
  public static final int ARTL_ART_cube_554 = 184;
  public static final int ARTL_ART_cube_555 = 185;
  public static final int ARTL_ART_cube_556 = 186;
  public static final int ARTL_ART_cylinder_567 = 187;
  public static final int ARTL_ART_cylinder_568 = 188;
  public static final int ARTL_ART_cylinder_569 = 189;
  public static final int ARTL_ART_cylinder_570 = 190;
  public static final int ARTL_ART_cylinder_571 = 191;
  public static final int ARTL_ART_cylinder_572 = 192;
  public static final int ARTL_ART_cylinder_573 = 193;
  public static final int ARTL_ART_cylinder_574 = 194;
  public static final int ARTL_ART_cylinder_575 = 195;
  public static final int ARTL_ART_cylinder_576 = 196;
  public static final int ARTL_ART_cylinder_577 = 197;
  public static final int ARTL_ART_cylinder_578 = 198;
  public static final int ARTL_ART_cylinder_579 = 199;
  public static final int ARTL_ART_cylinder_580 = 200;
  public static final int ARTL_ART_deref_525 = 201;
  public static final int ARTL_ART_deref_526 = 202;
  public static final int ARTL_ART_deref_527 = 203;
  public static final int ARTL_ART_deref_528 = 204;
  public static final int ARTL_ART_div_447 = 205;
  public static final int ARTL_ART_div_448 = 206;
  public static final int ARTL_ART_div_449 = 207;
  public static final int ARTL_ART_div_450 = 208;
  public static final int ARTL_ART_div_451 = 209;
  public static final int ARTL_ART_div_452 = 210;
  public static final int ARTL_ART_div_453 = 211;
  public static final int ARTL_ART_div_454 = 212;
  public static final int ARTL_ART_eq_309 = 213;
  public static final int ARTL_ART_eq_310 = 214;
  public static final int ARTL_ART_eq_311 = 215;
  public static final int ARTL_ART_eq_312 = 216;
  public static final int ARTL_ART_eq_313 = 217;
  public static final int ARTL_ART_eq_314 = 218;
  public static final int ARTL_ART_eq_315 = 219;
  public static final int ARTL_ART_eq_316 = 220;
  public static final int ARTL_ART_exp_461 = 221;
  public static final int ARTL_ART_exp_462 = 222;
  public static final int ARTL_ART_exp_463 = 223;
  public static final int ARTL_ART_exp_464 = 224;
  public static final int ARTL_ART_exp_465 = 225;
  public static final int ARTL_ART_exp_466 = 226;
  public static final int ARTL_ART_exp_467 = 227;
  public static final int ARTL_ART_exp_468 = 228;
  public static final int ARTL_ART_for_131 = 229;
  public static final int ARTL_ART_for_132 = 230;
  public static final int ARTL_ART_for_133 = 231;
  public static final int ARTL_ART_for_134 = 232;
  public static final int ARTL_ART_for_135 = 233;
  public static final int ARTL_ART_for_136 = 234;
  public static final int ARTL_ART_for_137 = 235;
  public static final int ARTL_ART_for_138 = 236;
  public static final int ARTL_ART_for_139 = 237;
  public static final int ARTL_ART_for_140 = 238;
  public static final int ARTL_ART_for_141 = 239;
  public static final int ARTL_ART_for_142 = 240;
  public static final int ARTL_ART_for_143 = 241;
  public static final int ARTL_ART_for_144 = 242;
  public static final int ARTL_ART_for_145 = 243;
  public static final int ARTL_ART_for_146 = 244;
  public static final int ARTL_ART_for_147 = 245;
  public static final int ARTL_ART_for_148 = 246;
  public static final int ARTL_ART_for_149 = 247;
  public static final int ARTL_ART_for_150 = 248;
  public static final int ARTL_ART_for_151 = 249;
  public static final int ARTL_ART_for_152 = 250;
  public static final int ARTL_ART_ge_333 = 251;
  public static final int ARTL_ART_ge_334 = 252;
  public static final int ARTL_ART_ge_335 = 253;
  public static final int ARTL_ART_ge_336 = 254;
  public static final int ARTL_ART_ge_337 = 255;
  public static final int ARTL_ART_ge_338 = 256;
  public static final int ARTL_ART_ge_339 = 257;
  public static final int ARTL_ART_ge_340 = 258;
  public static final int ARTL_ART_gt_325 = 259;
  public static final int ARTL_ART_gt_326 = 260;
  public static final int ARTL_ART_gt_327 = 261;
  public static final int ARTL_ART_gt_328 = 262;
  public static final int ARTL_ART_gt_329 = 263;
  public static final int ARTL_ART_gt_330 = 264;
  public static final int ARTL_ART_gt_331 = 265;
  public static final int ARTL_ART_gt_332 = 266;
  public static final int ARTL_ART_if_75 = 267;
  public static final int ARTL_ART_if_76 = 268;
  public static final int ARTL_ART_if_77 = 269;
  public static final int ARTL_ART_if_78 = 270;
  public static final int ARTL_ART_if_79 = 271;
  public static final int ARTL_ART_if_80 = 272;
  public static final int ARTL_ART_if_81 = 273;
  public static final int ARTL_ART_if_82 = 274;
  public static final int ARTL_ART_if_83 = 275;
  public static final int ARTL_ART_if_84 = 276;
  public static final int ARTL_ART_if_85 = 277;
  public static final int ARTL_ART_if_86 = 278;
  public static final int ARTL_ART_if_87 = 279;
  public static final int ARTL_ART_if_88 = 280;
  public static final int ARTL_ART_if_89 = 281;
  public static final int ARTL_ART_if_90 = 282;
  public static final int ARTL_ART_if_91 = 283;
  public static final int ARTL_ART_if_92 = 284;
  public static final int ARTL_ART_if_93 = 285;
  public static final int ARTL_ART_if_94 = 286;
  public static final int ARTL_ART_if_95 = 287;
  public static final int ARTL_ART_if_96 = 288;
  public static final int ARTL_ART_if_97 = 289;
  public static final int ARTL_ART_if_98 = 290;
  public static final int ARTL_ART_if_99 = 291;
  public static final int ARTL_ART_if_100 = 292;
  public static final int ARTL_ART_if_101 = 293;
  public static final int ARTL_ART_if_102 = 294;
  public static final int ARTL_ART_if_103 = 295;
  public static final int ARTL_ART_if_104 = 296;
  public static final int ARTL_ART_if_105 = 297;
  public static final int ARTL_ART_if_106 = 298;
  public static final int ARTL_ART_if_107 = 299;
  public static final int ARTL_ART_if_108 = 300;
  public static final int ARTL_ART_if_109 = 301;
  public static final int ARTL_ART_if_110 = 302;
  public static final int ARTL_ART_if_111 = 303;
  public static final int ARTL_ART_if_112 = 304;
  public static final int ARTL_ART_if_113 = 305;
  public static final int ARTL_ART_if_114 = 306;
  public static final int ARTL_ART_init_165 = 307;
  public static final int ARTL_ART_init_166 = 308;
  public static final int ARTL_ART_init_167 = 309;
  public static final int ARTL_ART_init_168 = 310;
  public static final int ARTL_ART_init_169 = 311;
  public static final int ARTL_ART_init_170 = 312;
  public static final int ARTL_ART_init_171 = 313;
  public static final int ARTL_ART_init_172 = 314;
  public static final int ARTL_ART_init_173 = 315;
  public static final int ARTL_ART_init_174 = 316;
  public static final int ARTL_ART_init_175 = 317;
  public static final int ARTL_ART_init_176 = 318;
  public static final int ARTL_ART_init_177 = 319;
  public static final int ARTL_ART_init_178 = 320;
  public static final int ARTL_ART_init_179 = 321;
  public static final int ARTL_ART_init_180 = 322;
  public static final int ARTL_ART_le_349 = 323;
  public static final int ARTL_ART_le_350 = 324;
  public static final int ARTL_ART_le_351 = 325;
  public static final int ARTL_ART_le_352 = 326;
  public static final int ARTL_ART_le_353 = 327;
  public static final int ARTL_ART_le_354 = 328;
  public static final int ARTL_ART_le_355 = 329;
  public static final int ARTL_ART_le_356 = 330;
  public static final int ARTL_ART_lt_341 = 331;
  public static final int ARTL_ART_lt_342 = 332;
  public static final int ARTL_ART_lt_343 = 333;
  public static final int ARTL_ART_lt_344 = 334;
  public static final int ARTL_ART_lt_345 = 335;
  public static final int ARTL_ART_lt_346 = 336;
  public static final int ARTL_ART_lt_347 = 337;
  public static final int ARTL_ART_lt_348 = 338;
  public static final int ARTL_ART_mul_439 = 339;
  public static final int ARTL_ART_mul_440 = 340;
  public static final int ARTL_ART_mul_441 = 341;
  public static final int ARTL_ART_mul_442 = 342;
  public static final int ARTL_ART_mul_443 = 343;
  public static final int ARTL_ART_mul_444 = 344;
  public static final int ARTL_ART_mul_445 = 345;
  public static final int ARTL_ART_mul_446 = 346;
  public static final int ARTL_ART_ne_317 = 347;
  public static final int ARTL_ART_ne_318 = 348;
  public static final int ARTL_ART_ne_319 = 349;
  public static final int ARTL_ART_ne_320 = 350;
  public static final int ARTL_ART_ne_321 = 351;
  public static final int ARTL_ART_ne_322 = 352;
  public static final int ARTL_ART_ne_323 = 353;
  public static final int ARTL_ART_ne_324 = 354;
  public static final int ARTL_ART_neg_455 = 355;
  public static final int ARTL_ART_neg_456 = 356;
  public static final int ARTL_ART_neg_457 = 357;
  public static final int ARTL_ART_neg_458 = 358;
  public static final int ARTL_ART_neg_459 = 359;
  public static final int ARTL_ART_neg_460 = 360;
  public static final int ARTL_ART_not_373 = 361;
  public static final int ARTL_ART_not_374 = 362;
  public static final int ARTL_ART_not_375 = 363;
  public static final int ARTL_ART_not_376 = 364;
  public static final int ARTL_ART_not_377 = 365;
  public static final int ARTL_ART_not_378 = 366;
  public static final int ARTL_ART_operand_469 = 367;
  public static final int ARTL_ART_operand_470 = 368;
  public static final int ARTL_ART_operand_471 = 369;
  public static final int ARTL_ART_operand_472 = 370;
  public static final int ARTL_ART_operand_473 = 371;
  public static final int ARTL_ART_operand_474 = 372;
  public static final int ARTL_ART_operand_475 = 373;
  public static final int ARTL_ART_operand_476 = 374;
  public static final int ARTL_ART_operand_477 = 375;
  public static final int ARTL_ART_operand_478 = 376;
  public static final int ARTL_ART_operand_479 = 377;
  public static final int ARTL_ART_operand_480 = 378;
  public static final int ARTL_ART_operand_481 = 379;
  public static final int ARTL_ART_operand_482 = 380;
  public static final int ARTL_ART_operand_483 = 381;
  public static final int ARTL_ART_operand_484 = 382;
  public static final int ARTL_ART_operand_485 = 383;
  public static final int ARTL_ART_operand_486 = 384;
  public static final int ARTL_ART_operand_487 = 385;
  public static final int ARTL_ART_operand_488 = 386;
  public static final int ARTL_ART_operand_489 = 387;
  public static final int ARTL_ART_operand_490 = 388;
  public static final int ARTL_ART_operand_491 = 389;
  public static final int ARTL_ART_operand_492 = 390;
  public static final int ARTL_ART_operand_493 = 391;
  public static final int ARTL_ART_operand_494 = 392;
  public static final int ARTL_ART_operand_495 = 393;
  public static final int ARTL_ART_operand_496 = 394;
  public static final int ARTL_ART_operand_497 = 395;
  public static final int ARTL_ART_operand_498 = 396;
  public static final int ARTL_ART_operand_499 = 397;
  public static final int ARTL_ART_operand_500 = 398;
  public static final int ARTL_ART_operand_501 = 399;
  public static final int ARTL_ART_operand_502 = 400;
  public static final int ARTL_ART_operand_503 = 401;
  public static final int ARTL_ART_operand_504 = 402;
  public static final int ARTL_ART_operand_505 = 403;
  public static final int ARTL_ART_operand_506 = 404;
  public static final int ARTL_ART_operand_507 = 405;
  public static final int ARTL_ART_operand_508 = 406;
  public static final int ARTL_ART_operand_509 = 407;
  public static final int ARTL_ART_operand_510 = 408;
  public static final int ARTL_ART_operand_511 = 409;
  public static final int ARTL_ART_operand_512 = 410;
  public static final int ARTL_ART_operand_513 = 411;
  public static final int ARTL_ART_operand_514 = 412;
  public static final int ARTL_ART_operand_515 = 413;
  public static final int ARTL_ART_operand_516 = 414;
  public static final int ARTL_ART_operand_517 = 415;
  public static final int ARTL_ART_operand_518 = 416;
  public static final int ARTL_ART_operand_519 = 417;
  public static final int ARTL_ART_operand_520 = 418;
  public static final int ARTL_ART_operand_521 = 419;
  public static final int ARTL_ART_operand_522 = 420;
  public static final int ARTL_ART_operand_523 = 421;
  public static final int ARTL_ART_operand_524 = 422;
  public static final int ARTL_ART_or_365 = 423;
  public static final int ARTL_ART_or_366 = 424;
  public static final int ARTL_ART_or_367 = 425;
  public static final int ARTL_ART_or_368 = 426;
  public static final int ARTL_ART_or_369 = 427;
  public static final int ARTL_ART_or_370 = 428;
  public static final int ARTL_ART_or_371 = 429;
  public static final int ARTL_ART_or_372 = 430;
  public static final int ARTL_ART_paint_181 = 431;
  public static final int ARTL_ART_paint_182 = 432;
  public static final int ARTL_ART_paint_183 = 433;
  public static final int ARTL_ART_paint_184 = 434;
  public static final int ARTL_ART_paint_185 = 435;
  public static final int ARTL_ART_paint_186 = 436;
  public static final int ARTL_ART_paint_187 = 437;
  public static final int ARTL_ART_paint_188 = 438;
  public static final int ARTL_ART_paint_189 = 439;
  public static final int ARTL_ART_paint_190 = 440;
  public static final int ARTL_ART_print_153 = 441;
  public static final int ARTL_ART_print_154 = 442;
  public static final int ARTL_ART_print_155 = 443;
  public static final int ARTL_ART_print_156 = 444;
  public static final int ARTL_ART_print_157 = 445;
  public static final int ARTL_ART_print_158 = 446;
  public static final int ARTL_ART_print_159 = 447;
  public static final int ARTL_ART_print_160 = 448;
  public static final int ARTL_ART_print_161 = 449;
  public static final int ARTL_ART_print_162 = 450;
  public static final int ARTL_ART_print_163 = 451;
  public static final int ARTL_ART_print_164 = 452;
  public static final int ARTL_ART_pyramid_619 = 453;
  public static final int ARTL_ART_pyramid_620 = 454;
  public static final int ARTL_ART_pyramid_621 = 455;
  public static final int ARTL_ART_pyramid_622 = 456;
  public static final int ARTL_ART_pyramid_623 = 457;
  public static final int ARTL_ART_pyramid_624 = 458;
  public static final int ARTL_ART_pyramid_625 = 459;
  public static final int ARTL_ART_pyramid_626 = 460;
  public static final int ARTL_ART_pyramid_627 = 461;
  public static final int ARTL_ART_pyramid_628 = 462;
  public static final int ARTL_ART_pyramid_629 = 463;
  public static final int ARTL_ART_pyramid_630 = 464;
  public static final int ARTL_ART_pyramid_631 = 465;
  public static final int ARTL_ART_pyramid_632 = 466;
  public static final int ARTL_ART_relExpr_257 = 467;
  public static final int ARTL_ART_relExpr_258 = 468;
  public static final int ARTL_ART_relExpr_259 = 469;
  public static final int ARTL_ART_relExpr_260 = 470;
  public static final int ARTL_ART_relExpr_261 = 471;
  public static final int ARTL_ART_relExpr_262 = 472;
  public static final int ARTL_ART_relExpr_263 = 473;
  public static final int ARTL_ART_relExpr_264 = 474;
  public static final int ARTL_ART_relExpr_265 = 475;
  public static final int ARTL_ART_relExpr_266 = 476;
  public static final int ARTL_ART_relExpr_267 = 477;
  public static final int ARTL_ART_relExpr_268 = 478;
  public static final int ARTL_ART_relExpr_269 = 479;
  public static final int ARTL_ART_relExpr_270 = 480;
  public static final int ARTL_ART_relExpr_271 = 481;
  public static final int ARTL_ART_relExpr_272 = 482;
  public static final int ARTL_ART_relExpr_273 = 483;
  public static final int ARTL_ART_relExpr_274 = 484;
  public static final int ARTL_ART_relExpr_275 = 485;
  public static final int ARTL_ART_relExpr_276 = 486;
  public static final int ARTL_ART_relExpr_277 = 487;
  public static final int ARTL_ART_relExpr_278 = 488;
  public static final int ARTL_ART_relExpr_279 = 489;
  public static final int ARTL_ART_relExpr_280 = 490;
  public static final int ARTL_ART_relExpr_281 = 491;
  public static final int ARTL_ART_relExpr_282 = 492;
  public static final int ARTL_ART_relExpr_283 = 493;
  public static final int ARTL_ART_relExpr_284 = 494;
  public static final int ARTL_ART_relExpr_285 = 495;
  public static final int ARTL_ART_relExpr_286 = 496;
  public static final int ARTL_ART_relExpr_287 = 497;
  public static final int ARTL_ART_relExpr_288 = 498;
  public static final int ARTL_ART_relExpr_289 = 499;
  public static final int ARTL_ART_relExpr_290 = 500;
  public static final int ARTL_ART_relExpr_291 = 501;
  public static final int ARTL_ART_relExpr_292 = 502;
  public static final int ARTL_ART_relExpr_293 = 503;
  public static final int ARTL_ART_relExpr_294 = 504;
  public static final int ARTL_ART_relExpr_295 = 505;
  public static final int ARTL_ART_relExpr_296 = 506;
  public static final int ARTL_ART_relExpr_297 = 507;
  public static final int ARTL_ART_relExpr_298 = 508;
  public static final int ARTL_ART_relExpr_299 = 509;
  public static final int ARTL_ART_relExpr_300 = 510;
  public static final int ARTL_ART_relExpr_301 = 511;
  public static final int ARTL_ART_relExpr_302 = 512;
  public static final int ARTL_ART_relExpr_303 = 513;
  public static final int ARTL_ART_relExpr_304 = 514;
  public static final int ARTL_ART_relExpr_305 = 515;
  public static final int ARTL_ART_relExpr_306 = 516;
  public static final int ARTL_ART_relExpr_307 = 517;
  public static final int ARTL_ART_relExpr_308 = 518;
  public static final int ARTL_ART_rotate_213 = 519;
  public static final int ARTL_ART_rotate_214 = 520;
  public static final int ARTL_ART_rotate_215 = 521;
  public static final int ARTL_ART_rotate_216 = 522;
  public static final int ARTL_ART_rotate_217 = 523;
  public static final int ARTL_ART_rotate_218 = 524;
  public static final int ARTL_ART_rotate_219 = 525;
  public static final int ARTL_ART_rotate_220 = 526;
  public static final int ARTL_ART_rotate_221 = 527;
  public static final int ARTL_ART_rotate_222 = 528;
  public static final int ARTL_ART_rotate_223 = 529;
  public static final int ARTL_ART_rotate_224 = 530;
  public static final int ARTL_ART_rotate_225 = 531;
  public static final int ARTL_ART_rotate_226 = 532;
  public static final int ARTL_ART_rotate_227 = 533;
  public static final int ARTL_ART_rotate_228 = 534;
  public static final int ARTL_ART_rotate_229 = 535;
  public static final int ARTL_ART_rotate_230 = 536;
  public static final int ARTL_ART_rotate_231 = 537;
  public static final int ARTL_ART_rotate_232 = 538;
  public static final int ARTL_ART_rotate_233 = 539;
  public static final int ARTL_ART_rotate_234 = 540;
  public static final int ARTL_ART_scale_235 = 541;
  public static final int ARTL_ART_scale_236 = 542;
  public static final int ARTL_ART_scale_237 = 543;
  public static final int ARTL_ART_scale_238 = 544;
  public static final int ARTL_ART_scale_239 = 545;
  public static final int ARTL_ART_scale_240 = 546;
  public static final int ARTL_ART_scale_241 = 547;
  public static final int ARTL_ART_scale_242 = 548;
  public static final int ARTL_ART_scale_243 = 549;
  public static final int ARTL_ART_scale_244 = 550;
  public static final int ARTL_ART_scale_245 = 551;
  public static final int ARTL_ART_scale_246 = 552;
  public static final int ARTL_ART_scale_247 = 553;
  public static final int ARTL_ART_scale_248 = 554;
  public static final int ARTL_ART_scale_249 = 555;
  public static final int ARTL_ART_scale_250 = 556;
  public static final int ARTL_ART_scale_251 = 557;
  public static final int ARTL_ART_scale_252 = 558;
  public static final int ARTL_ART_scale_253 = 559;
  public static final int ARTL_ART_scale_254 = 560;
  public static final int ARTL_ART_scale_255 = 561;
  public static final int ARTL_ART_scale_256 = 562;
  public static final int ARTL_ART_seq_49 = 563;
  public static final int ARTL_ART_seq_50 = 564;
  public static final int ARTL_ART_seq_51 = 565;
  public static final int ARTL_ART_seq_52 = 566;
  public static final int ARTL_ART_seq_53 = 567;
  public static final int ARTL_ART_seq_54 = 568;
  public static final int ARTL_ART_sphere_557 = 569;
  public static final int ARTL_ART_sphere_558 = 570;
  public static final int ARTL_ART_sphere_559 = 571;
  public static final int ARTL_ART_sphere_560 = 572;
  public static final int ARTL_ART_sphere_561 = 573;
  public static final int ARTL_ART_sphere_562 = 574;
  public static final int ARTL_ART_sphere_563 = 575;
  public static final int ARTL_ART_sphere_564 = 576;
  public static final int ARTL_ART_sphere_565 = 577;
  public static final int ARTL_ART_sphere_566 = 578;
  public static final int ARTL_ART_statement_1 = 579;
  public static final int ARTL_ART_statement_2 = 580;
  public static final int ARTL_ART_statement_3 = 581;
  public static final int ARTL_ART_statement_4 = 582;
  public static final int ARTL_ART_statement_5 = 583;
  public static final int ARTL_ART_statement_6 = 584;
  public static final int ARTL_ART_statement_7 = 585;
  public static final int ARTL_ART_statement_8 = 586;
  public static final int ARTL_ART_statement_9 = 587;
  public static final int ARTL_ART_statement_10 = 588;
  public static final int ARTL_ART_statement_11 = 589;
  public static final int ARTL_ART_statement_12 = 590;
  public static final int ARTL_ART_statement_13 = 591;
  public static final int ARTL_ART_statement_14 = 592;
  public static final int ARTL_ART_statement_15 = 593;
  public static final int ARTL_ART_statement_16 = 594;
  public static final int ARTL_ART_statement_17 = 595;
  public static final int ARTL_ART_statement_18 = 596;
  public static final int ARTL_ART_statement_19 = 597;
  public static final int ARTL_ART_statement_20 = 598;
  public static final int ARTL_ART_statement_21 = 599;
  public static final int ARTL_ART_statement_22 = 600;
  public static final int ARTL_ART_statement_23 = 601;
  public static final int ARTL_ART_statement_24 = 602;
  public static final int ARTL_ART_statement_25 = 603;
  public static final int ARTL_ART_statement_26 = 604;
  public static final int ARTL_ART_statement_27 = 605;
  public static final int ARTL_ART_statement_28 = 606;
  public static final int ARTL_ART_statement_29 = 607;
  public static final int ARTL_ART_statement_30 = 608;
  public static final int ARTL_ART_statement_31 = 609;
  public static final int ARTL_ART_statement_32 = 610;
  public static final int ARTL_ART_statement_33 = 611;
  public static final int ARTL_ART_statement_34 = 612;
  public static final int ARTL_ART_statement_35 = 613;
  public static final int ARTL_ART_statement_36 = 614;
  public static final int ARTL_ART_statement_37 = 615;
  public static final int ARTL_ART_statement_38 = 616;
  public static final int ARTL_ART_statement_39 = 617;
  public static final int ARTL_ART_statement_40 = 618;
  public static final int ARTL_ART_statement_41 = 619;
  public static final int ARTL_ART_statement_42 = 620;
  public static final int ARTL_ART_statement_43 = 621;
  public static final int ARTL_ART_statement_44 = 622;
  public static final int ARTL_ART_statement_45 = 623;
  public static final int ARTL_ART_statement_46 = 624;
  public static final int ARTL_ART_statement_47 = 625;
  public static final int ARTL_ART_statement_48 = 626;
  public static final int ARTL_ART_sub_423 = 627;
  public static final int ARTL_ART_sub_424 = 628;
  public static final int ARTL_ART_sub_425 = 629;
  public static final int ARTL_ART_sub_426 = 630;
  public static final int ARTL_ART_sub_427 = 631;
  public static final int ARTL_ART_sub_428 = 632;
  public static final int ARTL_ART_sub_429 = 633;
  public static final int ARTL_ART_sub_430 = 634;
  public static final int ARTL_ART_subExpr_387 = 635;
  public static final int ARTL_ART_subExpr_388 = 636;
  public static final int ARTL_ART_subExpr_389 = 637;
  public static final int ARTL_ART_subExpr_390 = 638;
  public static final int ARTL_ART_subExpr_391 = 639;
  public static final int ARTL_ART_subExpr_392 = 640;
  public static final int ARTL_ART_subExpr_393 = 641;
  public static final int ARTL_ART_subExpr_394 = 642;
  public static final int ARTL_ART_subExpr_395 = 643;
  public static final int ARTL_ART_subExpr_396 = 644;
  public static final int ARTL_ART_subExpr_397 = 645;
  public static final int ARTL_ART_subExpr_398 = 646;
  public static final int ARTL_ART_subExpr_399 = 647;
  public static final int ARTL_ART_subExpr_400 = 648;
  public static final int ARTL_ART_subExpr_401 = 649;
  public static final int ARTL_ART_subExpr_402 = 650;
  public static final int ARTL_ART_subExpr_403 = 651;
  public static final int ARTL_ART_subExpr_404 = 652;
  public static final int ARTL_ART_subExpr_405 = 653;
  public static final int ARTL_ART_subExpr_406 = 654;
  public static final int ARTL_ART_subExpr_407 = 655;
  public static final int ARTL_ART_subExpr_408 = 656;
  public static final int ARTL_ART_subExpr_409 = 657;
  public static final int ARTL_ART_subExpr_410 = 658;
  public static final int ARTL_ART_subExpr_411 = 659;
  public static final int ARTL_ART_subExpr_412 = 660;
  public static final int ARTL_ART_subExpr_413 = 661;
  public static final int ARTL_ART_subExpr_414 = 662;
  public static final int ARTL_ART_subExpr_415 = 663;
  public static final int ARTL_ART_subExpr_416 = 664;
  public static final int ARTL_ART_subExpr_417 = 665;
  public static final int ARTL_ART_subExpr_418 = 666;
  public static final int ARTL_ART_subExpr_419 = 667;
  public static final int ARTL_ART_subExpr_420 = 668;
  public static final int ARTL_ART_subExpr_421 = 669;
  public static final int ARTL_ART_subExpr_422 = 670;
  public static final int ARTL_ART_tetrahedron_609 = 671;
  public static final int ARTL_ART_tetrahedron_610 = 672;
  public static final int ARTL_ART_tetrahedron_611 = 673;
  public static final int ARTL_ART_tetrahedron_612 = 674;
  public static final int ARTL_ART_tetrahedron_613 = 675;
  public static final int ARTL_ART_tetrahedron_614 = 676;
  public static final int ARTL_ART_tetrahedron_615 = 677;
  public static final int ARTL_ART_tetrahedron_616 = 678;
  public static final int ARTL_ART_tetrahedron_617 = 679;
  public static final int ARTL_ART_tetrahedron_618 = 680;
  public static final int ARTL_ART_torus_595 = 681;
  public static final int ARTL_ART_torus_596 = 682;
  public static final int ARTL_ART_torus_597 = 683;
  public static final int ARTL_ART_torus_598 = 684;
  public static final int ARTL_ART_torus_599 = 685;
  public static final int ARTL_ART_torus_600 = 686;
  public static final int ARTL_ART_torus_601 = 687;
  public static final int ARTL_ART_torus_602 = 688;
  public static final int ARTL_ART_torus_603 = 689;
  public static final int ARTL_ART_torus_604 = 690;
  public static final int ARTL_ART_torus_605 = 691;
  public static final int ARTL_ART_torus_606 = 692;
  public static final int ARTL_ART_torus_607 = 693;
  public static final int ARTL_ART_torus_608 = 694;
  public static final int ARTL_ART_translate_191 = 695;
  public static final int ARTL_ART_translate_192 = 696;
  public static final int ARTL_ART_translate_193 = 697;
  public static final int ARTL_ART_translate_194 = 698;
  public static final int ARTL_ART_translate_195 = 699;
  public static final int ARTL_ART_translate_196 = 700;
  public static final int ARTL_ART_translate_197 = 701;
  public static final int ARTL_ART_translate_198 = 702;
  public static final int ARTL_ART_translate_199 = 703;
  public static final int ARTL_ART_translate_200 = 704;
  public static final int ARTL_ART_translate_201 = 705;
  public static final int ARTL_ART_translate_202 = 706;
  public static final int ARTL_ART_translate_203 = 707;
  public static final int ARTL_ART_translate_204 = 708;
  public static final int ARTL_ART_translate_205 = 709;
  public static final int ARTL_ART_translate_206 = 710;
  public static final int ARTL_ART_translate_207 = 711;
  public static final int ARTL_ART_translate_208 = 712;
  public static final int ARTL_ART_translate_209 = 713;
  public static final int ARTL_ART_translate_210 = 714;
  public static final int ARTL_ART_translate_211 = 715;
  public static final int ARTL_ART_translate_212 = 716;
  public static final int ARTL_ART_while_115 = 717;
  public static final int ARTL_ART_while_116 = 718;
  public static final int ARTL_ART_while_117 = 719;
  public static final int ARTL_ART_while_118 = 720;
  public static final int ARTL_ART_while_119 = 721;
  public static final int ARTL_ART_while_120 = 722;
  public static final int ARTL_ART_while_121 = 723;
  public static final int ARTL_ART_while_122 = 724;
  public static final int ARTL_ART_while_123 = 725;
  public static final int ARTL_ART_while_124 = 726;
  public static final int ARTL_ART_while_125 = 727;
  public static final int ARTL_ART_while_126 = 728;
  public static final int ARTL_ART_while_127 = 729;
  public static final int ARTL_ART_while_128 = 730;
  public static final int ARTL_ART_while_129 = 731;
  public static final int ARTL_ART_while_130 = 732;
  public static final int ARTL_ART_xor_379 = 733;
  public static final int ARTL_ART_xor_380 = 734;
  public static final int ARTL_ART_xor_381 = 735;
  public static final int ARTL_ART_xor_382 = 736;
  public static final int ARTL_ART_xor_383 = 737;
  public static final int ARTL_ART_xor_384 = 738;
  public static final int ARTL_ART_xor_385 = 739;
  public static final int ARTL_ART_xor_386 = 740;
  public static final int ARTX_DESPATCH = 741;
  public static final int ARTX_DUMMY = 742;
  public static final int ARTX_LABEL_EXTENT = 743;
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
          artFindDescriptor(ARTL_ART_ID_634, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_634: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_636, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_INTEGER_640, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_640: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_642, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_REAL_646, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_646: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_648, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_STRING_DQ_652, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_652: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_654, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_add() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal add production descriptor loads*/
      case ARTL_ART_add: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_add_432, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal add: match production*/
      case ARTL_ART_add_432: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_434, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_add_434: 
        /* Nonterminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_add_436, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_add_438, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_add_438: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_and() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal and production descriptor loads*/
      case ARTL_ART_and: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_and_358, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal and: match production*/
      case ARTL_ART_and_358: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_and_360, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_and_360: 
        /* Nonterminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND_AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_and_362, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_and_364, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_and_364: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_assign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal assign production descriptor loads*/
      case ARTL_ART_assign: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_60, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_assign_62, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_assign_62: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_assign_64, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_box() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal box production descriptor loads*/
      case ARTL_ART_box: 
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_box_530, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal box: match production*/
      case ARTL_ART_box_530: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_BOX, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_532, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_534, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_box_536, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_box_536: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_538, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_box_540, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_box_540: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_542, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_box_544, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_box_544: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_box_546, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_compassign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal compassign production descriptor loads*/
      case ARTL_ART_compassign: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_compassign_70, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_compassign_72, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_compassign_72: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_compassign_74, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_cone() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal cone production descriptor loads*/
      case ARTL_ART_cone: 
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_cone_582, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal cone: match production*/
      case ARTL_ART_cone_582: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_CONE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cone_584, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cone_586, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cone_588, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cone_588: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cone_590, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cone_592, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cone_592: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cone_594, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_cube() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal cube production descriptor loads*/
      case ARTL_ART_cube: 
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_cube_548, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal cube: match production*/
      case ARTL_ART_cube_548: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_CUBE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cube_550, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cube_552, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cube_554, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cube_554: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cube_556, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_cylinder() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal cylinder production descriptor loads*/
      case ARTL_ART_cylinder: 
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_cylinder_568, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal cylinder: match production*/
      case ARTL_ART_cylinder_568: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_CYLINDER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cylinder_570, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cylinder_572, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cylinder_574, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cylinder_574: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cylinder_576, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_cylinder_578, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_cylinder_578: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_cylinder_580, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_deref() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal deref production descriptor loads*/
      case ARTL_ART_deref: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_deref_526, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal deref: match production*/
      case ARTL_ART_deref_526: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_deref_528, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_deref_528: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_div() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal div production descriptor loads*/
      case ARTL_ART_div: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_div_448, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal div: match production*/
      case ARTL_ART_div_448: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_450, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_div_450: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_div_452, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_div_454, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_div_454: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_eq() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal eq production descriptor loads*/
      case ARTL_ART_eq: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_eq_310, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal eq: match production*/
      case ARTL_ART_eq_310: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_312, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_eq_312: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_eq_314, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_eq_316, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_eq_316: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_exp() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal exp production descriptor loads*/
      case ARTL_ART_exp: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_exp_462, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal exp: match production*/
      case ARTL_ART_exp_462: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_exp_464, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_exp_464: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR_STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_exp_466, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_exp_468, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_exp_468: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_for() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal for production descriptor loads*/
      case ARTL_ART_for: 
        if (ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_136, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_for_138, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_for_138: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_for_140, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_for_140: 
        /* Nonterminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_142, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_for_144, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_for_144: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_146, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_148, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_for_150, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_for_150: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_for_152, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ge() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ge production descriptor loads*/
      case ARTL_ART_ge: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ge_334, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ge: match production*/
      case ARTL_ART_ge_334: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ge_336, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_ge_336: 
        /* Nonterminal template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ge_338, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ge_340, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_ge_340: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_gt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal gt production descriptor loads*/
      case ARTL_ART_gt: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_gt_326, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal gt: match production*/
      case ARTL_ART_gt_326: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_328, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_gt_328: 
        /* Nonterminal template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_gt_330, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_gt_332, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_gt_332: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_if() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal if production descriptor loads*/
      case ARTL_ART_if: 
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_if_76, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_80, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_82, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_82: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_86, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_88, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_88: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_90, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_92, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_94, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_96: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_98, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_104, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_if_106: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_108, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_110, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_if_112, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_if_112: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_if_114, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_init() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal init production descriptor loads*/
      case ARTL_ART_init: 
        if (ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_init_166, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal init: match production*/
      case ARTL_ART_init_166: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_init, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_168, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_170, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_init_172, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_init_172: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_174, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_init_176, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_init_176: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_178, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_init_180, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_le() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal le production descriptor loads*/
      case ARTL_ART_le: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_le_350, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal le: match production*/
      case ARTL_ART_le_350: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_le_352, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_le_352: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_le_354, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_le_356, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_le_356: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_lt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal lt production descriptor loads*/
      case ARTL_ART_lt: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_lt_342, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal lt: match production*/
      case ARTL_ART_lt_342: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_344, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_lt_344: 
        /* Nonterminal template end */
        if (!ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_lt_346, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_lt_348, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_lt_348: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_mul() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal mul production descriptor loads*/
      case ARTL_ART_mul: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mul_440, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal mul: match production*/
      case ARTL_ART_mul_440: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_442, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_mul_442: 
        /* Nonterminal template end */
        if (!ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_mul_444, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mul_446, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_mul_446: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ne() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ne production descriptor loads*/
      case ARTL_ART_ne: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ne_318, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ne: match production*/
      case ARTL_ART_ne_318: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_320, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_ne_320: 
        /* Nonterminal template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ne_322, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ne_324, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_ne_324: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_neg() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal neg production descriptor loads*/
      case ARTL_ART_neg: 
        if (ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_neg_456, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal neg: match production*/
      case ARTL_ART_neg_456: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_neg_458, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_neg_460, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_neg_460: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_not() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal not production descriptor loads*/
      case ARTL_ART_not: 
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_not_374, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal not: match production*/
      case ARTL_ART_not_374: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_not_376, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_not_378, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_not_378: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_470, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_474, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_478, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet51[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_482, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_486, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_494, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_498, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_502, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_506, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_510, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_514, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet58[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_518, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_522, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_470: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_472, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_operand_472: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_474: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_476, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_476: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_478: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_480, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_operand_480: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_482: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_484, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_operand_484: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_486: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_488, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_490, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_operand_490: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_492, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_494: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_496, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_box; return; }
      case ARTL_ART_operand_496: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_498: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_500, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_cube; return; }
      case ARTL_ART_operand_500: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_502: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_504, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sphere; return; }
      case ARTL_ART_operand_504: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_506: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_508, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_cylinder; return; }
      case ARTL_ART_operand_508: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_510: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_512, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_cone; return; }
      case ARTL_ART_operand_512: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_514: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_516, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_torus; return; }
      case ARTL_ART_operand_516: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_518: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_520, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_tetrahedron; return; }
      case ARTL_ART_operand_520: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_522: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_524, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_pyramid; return; }
      case ARTL_ART_operand_524: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_or() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal or production descriptor loads*/
      case ARTL_ART_or: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_or_366, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal or: match production*/
      case ARTL_ART_or_366: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_or_368, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_or_368: 
        /* Nonterminal template end */
        if (!ARTSet60[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__BAR_BAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_or_370, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_or_372, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_or_372: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_paint() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal paint production descriptor loads*/
      case ARTL_ART_paint: 
        if (ARTSet61[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_paint_182, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal paint: match production*/
      case ARTL_ART_paint_182: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_paint, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_184, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_186, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_188, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_paint_190, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_print() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal print production descriptor loads*/
      case ARTL_ART_print: 
        if (ARTSet62[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_print_154, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal print: match production*/
      case ARTL_ART_print_154: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_print, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_156, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_158, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_print_160, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_print_160: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_162, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_print_164, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_pyramid() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal pyramid production descriptor loads*/
      case ARTL_ART_pyramid: 
        if (ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_pyramid_620, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal pyramid: match production*/
      case ARTL_ART_pyramid_620: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_PYRAMID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pyramid_622, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pyramid_624, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_pyramid_626, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_pyramid_626: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pyramid_628, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_pyramid_630, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_pyramid_630: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pyramid_632, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_relExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal relExpr production descriptor loads*/
      case ARTL_ART_relExpr: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_258, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_262, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_266, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_270, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_274, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_278, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_282, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_286, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_290, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet64[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_294, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_298, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_302, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_258: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_260, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_260: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_262: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_264, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_eq; return; }
      case ARTL_ART_relExpr_264: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_266: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_268, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ne; return; }
      case ARTL_ART_relExpr_268: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_270: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_272, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_gt; return; }
      case ARTL_ART_relExpr_272: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_274: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_276, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ge; return; }
      case ARTL_ART_relExpr_276: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_278: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_280, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_lt; return; }
      case ARTL_ART_relExpr_280: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_282: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_284, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_le; return; }
      case ARTL_ART_relExpr_284: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_286: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_288, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_and; return; }
      case ARTL_ART_relExpr_288: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_290: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_292, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_or; return; }
      case ARTL_ART_relExpr_292: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_294: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_296, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_not; return; }
      case ARTL_ART_relExpr_296: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_298: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_300, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_xor; return; }
      case ARTL_ART_relExpr_300: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_302: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_304, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_306, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_relExpr_306: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_308, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_rotate() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal rotate production descriptor loads*/
      case ARTL_ART_rotate: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rotate_214, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal rotate: match production*/
      case ARTL_ART_rotate_214: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_rotate_216, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_rotate_216: 
        /* Nonterminal template end */
        if (!ARTSet65[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIODrotate, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_218, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_220, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_rotate_222, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_rotate_222: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_224, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_rotate_226, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_rotate_226: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_228, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_rotate_230, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_rotate_230: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_232, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rotate_234, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_scale() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal scale production descriptor loads*/
      case ARTL_ART_scale: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_scale_236, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal scale: match production*/
      case ARTL_ART_scale_236: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_scale_238, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_scale_238: 
        /* Nonterminal template end */
        if (!ARTSet66[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIODscale, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_240, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_242, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_scale_244, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_scale_244: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_246, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_scale_248, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_scale_248: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_250, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_scale_252, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_scale_252: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_254, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_scale_256, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
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
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_seq_54, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_seq_54: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sphere() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sphere production descriptor loads*/
      case ARTL_ART_sphere: 
        if (ARTSet67[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sphere_558, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sphere: match production*/
      case ARTL_ART_sphere_558: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_SPHERE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sphere_560, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sphere_562, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sphere_564, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_sphere_564: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sphere_566, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet68[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet69[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_10, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet70[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_18, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet72[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_22, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet73[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_26, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet74[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_30, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet75[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_34, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet76[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_38, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet77[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_42, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet78[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_26: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_28, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_print; return; }
      case ARTL_ART_statement_28: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
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
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_sub() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal sub production descriptor loads*/
      case ARTL_ART_sub: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_sub_424, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal sub: match production*/
      case ARTL_ART_sub_424: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_426, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_sub_426: 
        /* Nonterminal template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_sub_428, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_sub_430, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_sub_430: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExpr production descriptor loads*/
      case ARTL_ART_subExpr: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_388, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_392, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_396, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_400, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_404, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet79[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_408, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_412, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_416, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_388: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_390, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_390: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_392: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_394, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_sub; return; }
      case ARTL_ART_subExpr_394: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_396: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_398, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_add; return; }
      case ARTL_ART_subExpr_398: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_400: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_402, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mul; return; }
      case ARTL_ART_subExpr_402: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_404: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_406, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_div; return; }
      case ARTL_ART_subExpr_406: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_408: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_410, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_neg; return; }
      case ARTL_ART_subExpr_410: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_412: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_414, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_exp; return; }
      case ARTL_ART_subExpr_414: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_416: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_418, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_420, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_420: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_422, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_tetrahedron() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal tetrahedron production descriptor loads*/
      case ARTL_ART_tetrahedron: 
        if (ARTSet80[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_tetrahedron_610, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal tetrahedron: match production*/
      case ARTL_ART_tetrahedron_610: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_TETRAHEDRON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_tetrahedron_612, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_tetrahedron_614, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_tetrahedron_616, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_tetrahedron_616: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_tetrahedron_618, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_torus() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal torus production descriptor loads*/
      case ARTL_ART_torus: 
        if (ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_torus_596, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal torus: match production*/
      case ARTL_ART_torus_596: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_TORUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_torus_598, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_torus_600, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_torus_602, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_torus_602: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_torus_604, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_torus_606, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_torus_606: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_torus_608, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_translate() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal translate production descriptor loads*/
      case ARTL_ART_translate: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_translate_192, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal translate: match production*/
      case ARTL_ART_translate_192: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_translate_194, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_deref; return; }
      case ARTL_ART_translate_194: 
        /* Nonterminal template end */
        if (!ARTSet82[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIODtranslate, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_196, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_198, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_translate_200, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_translate_200: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_202, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_translate_204, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_translate_204: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_206, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_translate_208, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_translate_208: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_210, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_translate_212, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_while() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal while production descriptor loads*/
      case ARTL_ART_while: 
        if (ARTSet83[artInputPairBuffer[artCurrentInputPairReference]]) 
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
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_120, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_122, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_while_122: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_124, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_126, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_while_128, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_while_128: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_while_130, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_xor() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal xor production descriptor loads*/
      case ARTL_ART_xor: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_xor_380, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal xor: match production*/
      case ARTL_ART_xor_380: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_xor_382, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_xor_382: 
        /* Nonterminal template end */
        if (!ARTSet84[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__UPARROW, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_xor_384, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_xor_386, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_xor_386: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 93;
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

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS_CONE] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS_CYLINDER] = true;
  }

  public void ARTSet69initialise() {
    ARTSet69 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet69, 0, artSetExtent, false);
    ARTSet69[ARTTB_ID] = true;
    ARTSet69[ARTL_ART_ID] = true;
    ARTSet69[ARTL_ART_compassign] = true;
  }

  public void ARTSet77initialise() {
    ARTSet77 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet77, 0, artSetExtent, false);
    ARTSet77[ARTTB_ID] = true;
    ARTSet77[ARTL_ART_ID] = true;
    ARTSet77[ARTL_ART_deref] = true;
    ARTSet77[ARTL_ART_rotate] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTB_INTEGER] = true;
    ARTSet42[ARTL_ART_INTEGER] = true;
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
    ARTSet3[ARTTS__PLUS_EQUAL] = true;
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

  public void ARTSet74initialise() {
    ARTSet74 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet74, 0, artSetExtent, false);
    ARTSet74[ARTTS_init] = true;
    ARTSet74[ARTL_ART_init] = true;
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

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTB_ID] = true;
    ARTSet10[ARTTB_INTEGER] = true;
    ARTSet10[ARTTB_REAL] = true;
    ARTSet10[ARTTB_STRING_DQ] = true;
    ARTSet10[ARTTS__LPAR] = true;
    ARTSet10[ARTTS__MINUS] = true;
    ARTSet10[ARTTS_BOX] = true;
    ARTSet10[ARTTS_CONE] = true;
    ARTSet10[ARTTS_CUBE] = true;
    ARTSet10[ARTTS_CYLINDER] = true;
    ARTSet10[ARTTS_PYRAMID] = true;
    ARTSet10[ARTTS_SPHERE] = true;
    ARTSet10[ARTTS_TETRAHEDRON] = true;
    ARTSet10[ARTTS_TORUS] = true;
    ARTSet10[ARTL_ART_ID] = true;
    ARTSet10[ARTL_ART_INTEGER] = true;
    ARTSet10[ARTL_ART_REAL] = true;
    ARTSet10[ARTL_ART_STRING_DQ] = true;
    ARTSet10[ARTL_ART_add] = true;
    ARTSet10[ARTL_ART_box] = true;
    ARTSet10[ARTL_ART_cone] = true;
    ARTSet10[ARTL_ART_cube] = true;
    ARTSet10[ARTL_ART_cylinder] = true;
    ARTSet10[ARTL_ART_deref] = true;
    ARTSet10[ARTL_ART_div] = true;
    ARTSet10[ARTL_ART_exp] = true;
    ARTSet10[ARTL_ART_mul] = true;
    ARTSet10[ARTL_ART_neg] = true;
    ARTSet10[ARTL_ART_operand] = true;
    ARTSet10[ARTL_ART_pyramid] = true;
    ARTSet10[ARTL_ART_sphere] = true;
    ARTSet10[ARTL_ART_sub] = true;
    ARTSet10[ARTL_ART_subExpr] = true;
    ARTSet10[ARTL_ART_tetrahedron] = true;
    ARTSet10[ARTL_ART_torus] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[ARTTS_CUBE] = true;
    ARTSet53[ARTL_ART_cube] = true;
  }

  public void ARTSet83initialise() {
    ARTSet83 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet83, 0, artSetExtent, false);
    ARTSet83[ARTTS_while] = true;
  }

  public void ARTSet76initialise() {
    ARTSet76 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet76, 0, artSetExtent, false);
    ARTSet76[ARTTB_ID] = true;
    ARTSet76[ARTL_ART_ID] = true;
    ARTSet76[ARTL_ART_deref] = true;
    ARTSet76[ARTL_ART_translate] = true;
  }

  public void ARTSet78initialise() {
    ARTSet78 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet78, 0, artSetExtent, false);
    ARTSet78[ARTTB_ID] = true;
    ARTSet78[ARTL_ART_ID] = true;
    ARTSet78[ARTL_ART_deref] = true;
    ARTSet78[ARTL_ART_scale] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS_if] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTS_else] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTS__SHREIK] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[ARTTS_CYLINDER] = true;
    ARTSet55[ARTL_ART_cylinder] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS__LPAR] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS__RPAR] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS_BOX] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS__STAR] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS__PLUS] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS__COMMA] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTS__MINUS] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS__SLASH] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS__SHREIK_EQUAL] = true;
    ARTSet29[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet29[ARTTS__RPAR] = true;
    ARTSet29[ARTTS__STAR] = true;
    ARTSet29[ARTTS__STAR_STAR] = true;
    ARTSet29[ARTTS__PLUS] = true;
    ARTSet29[ARTTS__MINUS] = true;
    ARTSet29[ARTTS__PERIODrotate] = true;
    ARTSet29[ARTTS__PERIODscale] = true;
    ARTSet29[ARTTS__PERIODtranslate] = true;
    ARTSet29[ARTTS__SLASH] = true;
    ARTSet29[ARTTS__SEMICOLON] = true;
    ARTSet29[ARTTS__LT] = true;
    ARTSet29[ARTTS__LT_EQUAL] = true;
    ARTSet29[ARTTS__EQUAL_EQUAL] = true;
    ARTSet29[ARTTS__GT] = true;
    ARTSet29[ARTTS__GT_EQUAL] = true;
    ARTSet29[ARTTS__UPARROW] = true;
    ARTSet29[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet57initialise() {
    ARTSet57 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet57, 0, artSetExtent, false);
    ARTSet57[ARTTS_TORUS] = true;
    ARTSet57[ARTL_ART_torus] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS_CUBE] = true;
  }

  public void ARTSet82initialise() {
    ARTSet82 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet82, 0, artSetExtent, false);
    ARTSet82[ARTTS__PERIODtranslate] = true;
  }

  public void ARTSet73initialise() {
    ARTSet73 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet73, 0, artSetExtent, false);
    ARTSet73[ARTTS_print] = true;
    ARTSet73[ARTL_ART_print] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTS__LT] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__EQUAL] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS__GT] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTS__AMPERSAND_AMPERSAND] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS__STAR_STAR] = true;
  }

  public void ARTSet65initialise() {
    ARTSet65 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet65, 0, artSetExtent, false);
    ARTSet65[ARTTS__PERIODrotate] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTS_init] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[ARTTS_CONE] = true;
    ARTSet56[ARTL_ART_cone] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS_for] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTB_ID] = true;
    ARTSet16[ARTL_ART_ID] = true;
  }

  public void ARTSet70initialise() {
    ARTSet70 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet70, 0, artSetExtent, false);
    ARTSet70[ARTTS_if] = true;
    ARTSet70[ARTL_ART_if] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS__SHREIK_EQUAL] = true;
    ARTSet9[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet9[ARTTS__RPAR] = true;
    ARTSet9[ARTTS__STAR] = true;
    ARTSet9[ARTTS__STAR_STAR] = true;
    ARTSet9[ARTTS__PLUS] = true;
    ARTSet9[ARTTS__MINUS] = true;
    ARTSet9[ARTTS__SLASH] = true;
    ARTSet9[ARTTS__SEMICOLON] = true;
    ARTSet9[ARTTS__LT] = true;
    ARTSet9[ARTTS__LT_EQUAL] = true;
    ARTSet9[ARTTS__EQUAL_EQUAL] = true;
    ARTSet9[ARTTS__GT] = true;
    ARTSet9[ARTTS__GT_EQUAL] = true;
    ARTSet9[ARTTS__UPARROW] = true;
    ARTSet9[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[ARTTB_STRING_DQ] = true;
    ARTSet51[ARTL_ART_STRING_DQ] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTB_ID] = true;
    ARTSet12[ARTTB_INTEGER] = true;
    ARTSet12[ARTTB_REAL] = true;
    ARTSet12[ARTTB_STRING_DQ] = true;
    ARTSet12[ARTTS__LPAR] = true;
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
    ARTSet12[ARTL_ART_box] = true;
    ARTSet12[ARTL_ART_cone] = true;
    ARTSet12[ARTL_ART_cube] = true;
    ARTSet12[ARTL_ART_cylinder] = true;
    ARTSet12[ARTL_ART_deref] = true;
    ARTSet12[ARTL_ART_operand] = true;
    ARTSet12[ARTL_ART_pyramid] = true;
    ARTSet12[ARTL_ART_sphere] = true;
    ARTSet12[ARTL_ART_tetrahedron] = true;
    ARTSet12[ARTL_ART_torus] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[ARTTB_ID] = true;
    ARTSet50[ARTL_ART_ID] = true;
    ARTSet50[ARTL_ART_deref] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTB_ID] = true;
    ARTSet34[ARTTS_for] = true;
    ARTSet34[ARTTS_if] = true;
    ARTSet34[ARTTS_init] = true;
    ARTSet34[ARTTS_paint] = true;
    ARTSet34[ARTTS_print] = true;
    ARTSet34[ARTTS_while] = true;
    ARTSet34[ARTL_ART_ID] = true;
    ARTSet34[ARTL_ART_assign] = true;
    ARTSet34[ARTL_ART_compassign] = true;
    ARTSet34[ARTL_ART_deref] = true;
    ARTSet34[ARTL_ART_for] = true;
    ARTSet34[ARTL_ART_if] = true;
    ARTSet34[ARTL_ART_init] = true;
    ARTSet34[ARTL_ART_paint] = true;
    ARTSet34[ARTL_ART_print] = true;
    ARTSet34[ARTL_ART_rotate] = true;
    ARTSet34[ARTL_ART_scale] = true;
    ARTSet34[ARTL_ART_seq] = true;
    ARTSet34[ARTL_ART_statement] = true;
    ARTSet34[ARTL_ART_translate] = true;
    ARTSet34[ARTL_ART_while] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[ARTTS_BOX] = true;
    ARTSet52[ARTL_ART_box] = true;
  }

  public void ARTSet81initialise() {
    ARTSet81 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet81, 0, artSetExtent, false);
    ARTSet81[ARTTS_TORUS] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTB_ID] = true;
    ARTSet13[ARTTB_INTEGER] = true;
    ARTSet13[ARTTB_REAL] = true;
    ARTSet13[ARTTB_STRING_DQ] = true;
    ARTSet13[ARTTS__SHREIK] = true;
    ARTSet13[ARTTS__LPAR] = true;
    ARTSet13[ARTTS__MINUS] = true;
    ARTSet13[ARTTS_BOX] = true;
    ARTSet13[ARTTS_CONE] = true;
    ARTSet13[ARTTS_CUBE] = true;
    ARTSet13[ARTTS_CYLINDER] = true;
    ARTSet13[ARTTS_PYRAMID] = true;
    ARTSet13[ARTTS_SPHERE] = true;
    ARTSet13[ARTTS_TETRAHEDRON] = true;
    ARTSet13[ARTTS_TORUS] = true;
    ARTSet13[ARTL_ART_ID] = true;
    ARTSet13[ARTL_ART_INTEGER] = true;
    ARTSet13[ARTL_ART_REAL] = true;
    ARTSet13[ARTL_ART_STRING_DQ] = true;
    ARTSet13[ARTL_ART_add] = true;
    ARTSet13[ARTL_ART_and] = true;
    ARTSet13[ARTL_ART_box] = true;
    ARTSet13[ARTL_ART_cone] = true;
    ARTSet13[ARTL_ART_cube] = true;
    ARTSet13[ARTL_ART_cylinder] = true;
    ARTSet13[ARTL_ART_deref] = true;
    ARTSet13[ARTL_ART_div] = true;
    ARTSet13[ARTL_ART_eq] = true;
    ARTSet13[ARTL_ART_exp] = true;
    ARTSet13[ARTL_ART_ge] = true;
    ARTSet13[ARTL_ART_gt] = true;
    ARTSet13[ARTL_ART_le] = true;
    ARTSet13[ARTL_ART_lt] = true;
    ARTSet13[ARTL_ART_mul] = true;
    ARTSet13[ARTL_ART_ne] = true;
    ARTSet13[ARTL_ART_neg] = true;
    ARTSet13[ARTL_ART_not] = true;
    ARTSet13[ARTL_ART_operand] = true;
    ARTSet13[ARTL_ART_or] = true;
    ARTSet13[ARTL_ART_pyramid] = true;
    ARTSet13[ARTL_ART_relExpr] = true;
    ARTSet13[ARTL_ART_sphere] = true;
    ARTSet13[ARTL_ART_sub] = true;
    ARTSet13[ARTL_ART_subExpr] = true;
    ARTSet13[ARTL_ART_tetrahedron] = true;
    ARTSet13[ARTL_ART_torus] = true;
    ARTSet13[ARTL_ART_xor] = true;
  }

  public void ARTSet59initialise() {
    ARTSet59 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet59, 0, artSetExtent, false);
    ARTSet59[ARTTS_PYRAMID] = true;
    ARTSet59[ARTL_ART_pyramid] = true;
  }

  public void ARTSet63initialise() {
    ARTSet63 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet63, 0, artSetExtent, false);
    ARTSet63[ARTTS_PYRAMID] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet66initialise() {
    ARTSet66 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet66, 0, artSetExtent, false);
    ARTSet66[ARTTS__PERIODscale] = true;
  }

  public void ARTSet84initialise() {
    ARTSet84 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet84, 0, artSetExtent, false);
    ARTSet84[ARTTS__UPARROW] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet67initialise() {
    ARTSet67 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet67, 0, artSetExtent, false);
    ARTSet67[ARTTS_SPHERE] = true;
  }

  public void ARTSet68initialise() {
    ARTSet68 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet68, 0, artSetExtent, false);
    ARTSet68[ARTTB_ID] = true;
    ARTSet68[ARTL_ART_ID] = true;
    ARTSet68[ARTL_ART_assign] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[ARTTS_SPHERE] = true;
    ARTSet54[ARTL_ART_sphere] = true;
  }

  public void ARTSet75initialise() {
    ARTSet75 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet75, 0, artSetExtent, false);
    ARTSet75[ARTTS_paint] = true;
    ARTSet75[ARTL_ART_paint] = true;
  }

  public void ARTSet64initialise() {
    ARTSet64 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet64, 0, artSetExtent, false);
    ARTSet64[ARTTS__SHREIK] = true;
    ARTSet64[ARTL_ART_not] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__SHREIK_EQUAL] = true;
    ARTSet14[ARTTS__AMPERSAND_AMPERSAND] = true;
    ARTSet14[ARTTS__RPAR] = true;
    ARTSet14[ARTTS__SEMICOLON] = true;
    ARTSet14[ARTTS__LT] = true;
    ARTSet14[ARTTS__LT_EQUAL] = true;
    ARTSet14[ARTTS__EQUAL_EQUAL] = true;
    ARTSet14[ARTTS__GT] = true;
    ARTSet14[ARTTS__GT_EQUAL] = true;
    ARTSet14[ARTTS__UPARROW] = true;
    ARTSet14[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTB_REAL] = true;
    ARTSet22[ARTL_ART_REAL] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS__PLUS_EQUAL] = true;
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
    ARTSet6[ARTTS__LT_EQUAL] = true;
    ARTSet6[ARTTS__EQUAL_EQUAL] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS__GT_EQUAL] = true;
    ARTSet6[ARTTS__UPARROW] = true;
    ARTSet6[ARTTS__BAR_BAR] = true;
  }

  public void ARTSet80initialise() {
    ARTSet80 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet80, 0, artSetExtent, false);
    ARTSet80[ARTTS_TETRAHEDRON] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTX_EOS] = true;
    ARTSet17[ARTTB_ID] = true;
    ARTSet17[ARTTB_INTEGER] = true;
    ARTSet17[ARTTB_REAL] = true;
    ARTSet17[ARTTB_STRING_DQ] = true;
    ARTSet17[ARTTS__SHREIK] = true;
    ARTSet17[ARTTS__LPAR] = true;
    ARTSet17[ARTTS__RPAR] = true;
    ARTSet17[ARTTS__MINUS] = true;
    ARTSet17[ARTTS_BOX] = true;
    ARTSet17[ARTTS_CONE] = true;
    ARTSet17[ARTTS_CUBE] = true;
    ARTSet17[ARTTS_CYLINDER] = true;
    ARTSet17[ARTTS_PYRAMID] = true;
    ARTSet17[ARTTS_SPHERE] = true;
    ARTSet17[ARTTS_TETRAHEDRON] = true;
    ARTSet17[ARTTS_TORUS] = true;
    ARTSet17[ARTTS_for] = true;
    ARTSet17[ARTTS_if] = true;
    ARTSet17[ARTTS_init] = true;
    ARTSet17[ARTTS_paint] = true;
    ARTSet17[ARTTS_print] = true;
    ARTSet17[ARTTS_while] = true;
    ARTSet17[ARTTS__RBRACE] = true;
    ARTSet17[ARTL_ART_ID] = true;
    ARTSet17[ARTL_ART_INTEGER] = true;
    ARTSet17[ARTL_ART_REAL] = true;
    ARTSet17[ARTL_ART_STRING_DQ] = true;
    ARTSet17[ARTL_ART_add] = true;
    ARTSet17[ARTL_ART_and] = true;
    ARTSet17[ARTL_ART_assign] = true;
    ARTSet17[ARTL_ART_box] = true;
    ARTSet17[ARTL_ART_compassign] = true;
    ARTSet17[ARTL_ART_cone] = true;
    ARTSet17[ARTL_ART_cube] = true;
    ARTSet17[ARTL_ART_cylinder] = true;
    ARTSet17[ARTL_ART_deref] = true;
    ARTSet17[ARTL_ART_div] = true;
    ARTSet17[ARTL_ART_eq] = true;
    ARTSet17[ARTL_ART_exp] = true;
    ARTSet17[ARTL_ART_for] = true;
    ARTSet17[ARTL_ART_ge] = true;
    ARTSet17[ARTL_ART_gt] = true;
    ARTSet17[ARTL_ART_if] = true;
    ARTSet17[ARTL_ART_init] = true;
    ARTSet17[ARTL_ART_le] = true;
    ARTSet17[ARTL_ART_lt] = true;
    ARTSet17[ARTL_ART_mul] = true;
    ARTSet17[ARTL_ART_ne] = true;
    ARTSet17[ARTL_ART_neg] = true;
    ARTSet17[ARTL_ART_not] = true;
    ARTSet17[ARTL_ART_operand] = true;
    ARTSet17[ARTL_ART_or] = true;
    ARTSet17[ARTL_ART_paint] = true;
    ARTSet17[ARTL_ART_print] = true;
    ARTSet17[ARTL_ART_pyramid] = true;
    ARTSet17[ARTL_ART_relExpr] = true;
    ARTSet17[ARTL_ART_rotate] = true;
    ARTSet17[ARTL_ART_scale] = true;
    ARTSet17[ARTL_ART_seq] = true;
    ARTSet17[ARTL_ART_sphere] = true;
    ARTSet17[ARTL_ART_statement] = true;
    ARTSet17[ARTL_ART_sub] = true;
    ARTSet17[ARTL_ART_subExpr] = true;
    ARTSet17[ARTL_ART_tetrahedron] = true;
    ARTSet17[ARTL_ART_torus] = true;
    ARTSet17[ARTL_ART_translate] = true;
    ARTSet17[ARTL_ART_while] = true;
    ARTSet17[ARTL_ART_xor] = true;
  }

  public void ARTSet62initialise() {
    ARTSet62 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet62, 0, artSetExtent, false);
    ARTSet62[ARTTS_print] = true;
  }

  public void ARTSet79initialise() {
    ARTSet79 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet79, 0, artSetExtent, false);
    ARTSet79[ARTTS__MINUS] = true;
    ARTSet79[ARTL_ART_neg] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTS__LBRACE] = true;
  }

  public void ARTSet72initialise() {
    ARTSet72 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet72, 0, artSetExtent, false);
    ARTSet72[ARTTS_for] = true;
    ARTSet72[ARTL_ART_for] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS__RBRACE] = true;
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

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS__LT_EQUAL] = true;
  }

  public void ARTSet71initialise() {
    ARTSet71 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet71, 0, artSetExtent, false);
    ARTSet71[ARTTS_while] = true;
    ARTSet71[ARTL_ART_while] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet26initialise();
    ARTSet28initialise();
    ARTSet69initialise();
    ARTSet77initialise();
    ARTSet42initialise();
    ARTSet3initialise();
    ARTSet74initialise();
    ARTSet58initialise();
    ARTSet61initialise();
    ARTSet10initialise();
    ARTSet53initialise();
    ARTSet83initialise();
    ARTSet76initialise();
    ARTSet78initialise();
    ARTSet39initialise();
    ARTSet40initialise();
    ARTSet31initialise();
    ARTSet48initialise();
    ARTSet55initialise();
    ARTSet21initialise();
    ARTSet24initialise();
    ARTSet20initialise();
    ARTSet45initialise();
    ARTSet11initialise();
    ARTSet23initialise();
    ARTSet47initialise();
    ARTSet30initialise();
    ARTSet29initialise();
    ARTSet57initialise();
    ARTSet27initialise();
    ARTSet82initialise();
    ARTSet73initialise();
    ARTSet19initialise();
    ARTSet44initialise();
    ARTSet46initialise();
    ARTSet18initialise();
    ARTSet4initialise();
    ARTSet38initialise();
    ARTSet37initialise();
    ARTSet15initialise();
    ARTSet32initialise();
    ARTSet65initialise();
    ARTSet41initialise();
    ARTSet56initialise();
    ARTSet33initialise();
    ARTSet16initialise();
    ARTSet70initialise();
    ARTSet9initialise();
    ARTSet51initialise();
    ARTSet12initialise();
    ARTSet50initialise();
    ARTSet34initialise();
    ARTSet52initialise();
    ARTSet81initialise();
    ARTSet13initialise();
    ARTSet59initialise();
    ARTSet63initialise();
    ARTSet2initialise();
    ARTSet66initialise();
    ARTSet84initialise();
    ARTSet5initialise();
    ARTSet67initialise();
    ARTSet68initialise();
    ARTSet54initialise();
    ARTSet75initialise();
    ARTSet64initialise();
    ARTSet8initialise();
    ARTSet14initialise();
    ARTSet22initialise();
    ARTSet25initialise();
    ARTSet6initialise();
    ARTSet80initialise();
    ARTSet17initialise();
    ARTSet62initialise();
    ARTSet79initialise();
    ARTSet35initialise();
    ARTSet72initialise();
    ARTSet36initialise();
    ARTSet7initialise();
    ARTSet49initialise();
    ARTSet60initialise();
    ARTSet43initialise();
    ARTSet71initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_634] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_634] = "";
    artlhsL[ARTL_ART_ID_634] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_634] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_634] = true;
    artFolds[ARTL_ART_ID_636] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_ID_635] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_635] = "";
    artlhsL[ARTL_ART_ID_635] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_635] = true;
    artLabelInternalStrings[ARTL_ART_ID_636] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_636] = "";
    artlhsL[ARTL_ART_ID_636] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_636] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_636] = true;
    arteoR_pL[ARTL_ART_ID_636] = true;
    artPopD[ARTL_ART_ID_636] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_640] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_640] = "";
    artlhsL[ARTL_ART_INTEGER_640] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_640] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_640] = true;
    artFolds[ARTL_ART_INTEGER_642] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_INTEGER_641] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_641] = "";
    artlhsL[ARTL_ART_INTEGER_641] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_641] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_642] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_642] = "";
    artlhsL[ARTL_ART_INTEGER_642] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_642] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_642] = true;
    arteoR_pL[ARTL_ART_INTEGER_642] = true;
    artPopD[ARTL_ART_INTEGER_642] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_646] = "REAL ::= . &REAL  ";
    artLabelStrings[ARTL_ART_REAL_646] = "";
    artlhsL[ARTL_ART_REAL_646] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_646] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_646] = true;
    artFolds[ARTL_ART_REAL_648] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_REAL_647] = "REAL ::= &REAL  ";
    artLabelStrings[ARTL_ART_REAL_647] = "";
    artlhsL[ARTL_ART_REAL_647] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_647] = true;
    artLabelInternalStrings[ARTL_ART_REAL_648] = "REAL ::= &REAL  .";
    artLabelStrings[ARTL_ART_REAL_648] = "";
    artlhsL[ARTL_ART_REAL_648] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_648] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_648] = true;
    arteoR_pL[ARTL_ART_REAL_648] = true;
    artPopD[ARTL_ART_REAL_648] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_652] = "STRING_DQ ::= . &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_652] = "";
    artlhsL[ARTL_ART_STRING_DQ_652] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_652] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_652] = true;
    artFolds[ARTL_ART_STRING_DQ_654] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_653] = "STRING_DQ ::= &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_653] = "";
    artlhsL[ARTL_ART_STRING_DQ_653] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_653] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_654] = "STRING_DQ ::= &STRING_DQ  .";
    artLabelStrings[ARTL_ART_STRING_DQ_654] = "";
    artlhsL[ARTL_ART_STRING_DQ_654] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_654] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_654] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_654] = true;
    artPopD[ARTL_ART_STRING_DQ_654] = true;
  }

  public void artTableInitialiser_ART_add() {
    artLabelInternalStrings[ARTL_ART_add] = "add";
    artLabelStrings[ARTL_ART_add] = "add";
    artKindOfs[ARTL_ART_add] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_add_432] = "add ::= . subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_432] = "";
    artlhsL[ARTL_ART_add_432] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_432] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_434] = "add ::= subExpr . '+'  operand ";
    artLabelStrings[ARTL_ART_add_434] = "";
    artlhsL[ARTL_ART_add_434] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_434] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_add_434] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_add_434] = true;
    artFolds[ARTL_ART_add_436] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_add_435] = "add ::= subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_add_435] = "";
    artlhsL[ARTL_ART_add_435] = ARTL_ART_add;
    artLabelInternalStrings[ARTL_ART_add_436] = "add ::= subExpr '+'  . operand ";
    artLabelStrings[ARTL_ART_add_436] = "";
    artlhsL[ARTL_ART_add_436] = ARTL_ART_add;
    artKindOfs[ARTL_ART_add_436] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_add_438] = "add ::= subExpr '+'  operand .";
    artLabelStrings[ARTL_ART_add_438] = "";
    artlhsL[ARTL_ART_add_438] = ARTL_ART_add;
    artSlotInstanceOfs[ARTL_ART_add_438] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_add_438] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_add_438] = true;
    arteoR_pL[ARTL_ART_add_438] = true;
    artPopD[ARTL_ART_add_438] = true;
  }

  public void artTableInitialiser_ART_and() {
    artLabelInternalStrings[ARTL_ART_and] = "and";
    artLabelStrings[ARTL_ART_and] = "and";
    artKindOfs[ARTL_ART_and] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_and_358] = "and ::= . relExpr '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_358] = "";
    artlhsL[ARTL_ART_and_358] = ARTL_ART_and;
    artKindOfs[ARTL_ART_and_358] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_and_360] = "and ::= relExpr . '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_360] = "";
    artlhsL[ARTL_ART_and_360] = ARTL_ART_and;
    artSlotInstanceOfs[ARTL_ART_and_360] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_and_360] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_and_360] = true;
    artFolds[ARTL_ART_and_362] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_and_361] = "and ::= relExpr '&&'  relExpr ";
    artLabelStrings[ARTL_ART_and_361] = "";
    artlhsL[ARTL_ART_and_361] = ARTL_ART_and;
    artLabelInternalStrings[ARTL_ART_and_362] = "and ::= relExpr '&&'  . relExpr ";
    artLabelStrings[ARTL_ART_and_362] = "";
    artlhsL[ARTL_ART_and_362] = ARTL_ART_and;
    artKindOfs[ARTL_ART_and_362] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_and_364] = "and ::= relExpr '&&'  relExpr .";
    artLabelStrings[ARTL_ART_and_364] = "";
    artlhsL[ARTL_ART_and_364] = ARTL_ART_and;
    artSlotInstanceOfs[ARTL_ART_and_364] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_and_364] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_and_364] = true;
    arteoR_pL[ARTL_ART_and_364] = true;
    artPopD[ARTL_ART_and_364] = true;
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
    artLabelInternalStrings[ARTL_ART_box_530] = "box ::= . 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_530] = "";
    artlhsL[ARTL_ART_box_530] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_530] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_box_532] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_531] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_531] = "";
    artlhsL[ARTL_ART_box_531] = ARTL_ART_box;
    artLabelInternalStrings[ARTL_ART_box_532] = "box ::= 'BOX'  . '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_532] = "";
    artlhsL[ARTL_ART_box_532] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_532] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_box_532] = true;
    artFolds[ARTL_ART_box_534] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_533] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_533] = "";
    artlhsL[ARTL_ART_box_533] = ARTL_ART_box;
    artLabelInternalStrings[ARTL_ART_box_534] = "box ::= 'BOX'  '('  . REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_534] = "";
    artlhsL[ARTL_ART_box_534] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_534] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_box_536] = "box ::= 'BOX'  '('  REAL . ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_536] = "";
    artlhsL[ARTL_ART_box_536] = ARTL_ART_box;
    artSlotInstanceOfs[ARTL_ART_box_536] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_box_536] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_box_538] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_537] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_537] = "";
    artlhsL[ARTL_ART_box_537] = ARTL_ART_box;
    artLabelInternalStrings[ARTL_ART_box_538] = "box ::= 'BOX'  '('  REAL ','  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_538] = "";
    artlhsL[ARTL_ART_box_538] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_538] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_box_540] = "box ::= 'BOX'  '('  REAL ','  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_540] = "";
    artlhsL[ARTL_ART_box_540] = ARTL_ART_box;
    artSlotInstanceOfs[ARTL_ART_box_540] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_box_540] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_box_542] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_541] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_541] = "";
    artlhsL[ARTL_ART_box_541] = ARTL_ART_box;
    artLabelInternalStrings[ARTL_ART_box_542] = "box ::= 'BOX'  '('  REAL ','  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_box_542] = "";
    artlhsL[ARTL_ART_box_542] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_542] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_box_544] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_box_544] = "";
    artlhsL[ARTL_ART_box_544] = ARTL_ART_box;
    artSlotInstanceOfs[ARTL_ART_box_544] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_box_544] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_box_544] = true;
    artFolds[ARTL_ART_box_546] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_box_545] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_box_545] = "";
    artlhsL[ARTL_ART_box_545] = ARTL_ART_box;
    artPopD[ARTL_ART_box_545] = true;
    artLabelInternalStrings[ARTL_ART_box_546] = "box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_box_546] = "";
    artlhsL[ARTL_ART_box_546] = ARTL_ART_box;
    artKindOfs[ARTL_ART_box_546] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_box_546] = true;
    arteoR_pL[ARTL_ART_box_546] = true;
    artPopD[ARTL_ART_box_546] = true;
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
    artLabelInternalStrings[ARTL_ART_cone_582] = "cone ::= . 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_582] = "";
    artlhsL[ARTL_ART_cone_582] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_582] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cone_584] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cone_583] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_583] = "";
    artlhsL[ARTL_ART_cone_583] = ARTL_ART_cone;
    artLabelInternalStrings[ARTL_ART_cone_584] = "cone ::= 'CONE'  . '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_584] = "";
    artlhsL[ARTL_ART_cone_584] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_584] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_cone_584] = true;
    artFolds[ARTL_ART_cone_586] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cone_585] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_585] = "";
    artlhsL[ARTL_ART_cone_585] = ARTL_ART_cone;
    artLabelInternalStrings[ARTL_ART_cone_586] = "cone ::= 'CONE'  '('  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_586] = "";
    artlhsL[ARTL_ART_cone_586] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_586] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cone_588] = "cone ::= 'CONE'  '('  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_588] = "";
    artlhsL[ARTL_ART_cone_588] = ARTL_ART_cone;
    artSlotInstanceOfs[ARTL_ART_cone_588] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cone_588] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cone_590] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cone_589] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_589] = "";
    artlhsL[ARTL_ART_cone_589] = ARTL_ART_cone;
    artLabelInternalStrings[ARTL_ART_cone_590] = "cone ::= 'CONE'  '('  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_590] = "";
    artlhsL[ARTL_ART_cone_590] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_590] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cone_592] = "cone ::= 'CONE'  '('  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_cone_592] = "";
    artlhsL[ARTL_ART_cone_592] = ARTL_ART_cone;
    artSlotInstanceOfs[ARTL_ART_cone_592] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cone_592] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_cone_592] = true;
    artFolds[ARTL_ART_cone_594] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cone_593] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cone_593] = "";
    artlhsL[ARTL_ART_cone_593] = ARTL_ART_cone;
    artPopD[ARTL_ART_cone_593] = true;
    artLabelInternalStrings[ARTL_ART_cone_594] = "cone ::= 'CONE'  '('  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_cone_594] = "";
    artlhsL[ARTL_ART_cone_594] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_cone_594] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_cone_594] = true;
    arteoR_pL[ARTL_ART_cone_594] = true;
    artPopD[ARTL_ART_cone_594] = true;
  }

  public void artTableInitialiser_ART_cube() {
    artLabelInternalStrings[ARTL_ART_cube] = "cube";
    artLabelStrings[ARTL_ART_cube] = "cube";
    artKindOfs[ARTL_ART_cube] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_cube_548] = "cube ::= . 'CUBE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_548] = "";
    artlhsL[ARTL_ART_cube_548] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_cube_548] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cube_550] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cube_549] = "cube ::= 'CUBE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_549] = "";
    artlhsL[ARTL_ART_cube_549] = ARTL_ART_cube;
    artLabelInternalStrings[ARTL_ART_cube_550] = "cube ::= 'CUBE'  . '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_550] = "";
    artlhsL[ARTL_ART_cube_550] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_cube_550] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_cube_550] = true;
    artFolds[ARTL_ART_cube_552] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cube_551] = "cube ::= 'CUBE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_551] = "";
    artlhsL[ARTL_ART_cube_551] = ARTL_ART_cube;
    artLabelInternalStrings[ARTL_ART_cube_552] = "cube ::= 'CUBE'  '('  . REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_552] = "";
    artlhsL[ARTL_ART_cube_552] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_cube_552] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cube_554] = "cube ::= 'CUBE'  '('  REAL . ')'  ";
    artLabelStrings[ARTL_ART_cube_554] = "";
    artlhsL[ARTL_ART_cube_554] = ARTL_ART_cube;
    artSlotInstanceOfs[ARTL_ART_cube_554] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cube_554] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_cube_554] = true;
    artFolds[ARTL_ART_cube_556] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cube_555] = "cube ::= 'CUBE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_cube_555] = "";
    artlhsL[ARTL_ART_cube_555] = ARTL_ART_cube;
    artPopD[ARTL_ART_cube_555] = true;
    artLabelInternalStrings[ARTL_ART_cube_556] = "cube ::= 'CUBE'  '('  REAL ')'  .";
    artLabelStrings[ARTL_ART_cube_556] = "";
    artlhsL[ARTL_ART_cube_556] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_cube_556] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_cube_556] = true;
    arteoR_pL[ARTL_ART_cube_556] = true;
    artPopD[ARTL_ART_cube_556] = true;
  }

  public void artTableInitialiser_ART_cylinder() {
    artLabelInternalStrings[ARTL_ART_cylinder] = "cylinder";
    artLabelStrings[ARTL_ART_cylinder] = "cylinder";
    artKindOfs[ARTL_ART_cylinder] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_cylinder_568] = "cylinder ::= . 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_568] = "";
    artlhsL[ARTL_ART_cylinder_568] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_568] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cylinder_570] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cylinder_569] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_569] = "";
    artlhsL[ARTL_ART_cylinder_569] = ARTL_ART_cylinder;
    artLabelInternalStrings[ARTL_ART_cylinder_570] = "cylinder ::= 'CYLINDER'  . '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_570] = "";
    artlhsL[ARTL_ART_cylinder_570] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_570] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_cylinder_570] = true;
    artFolds[ARTL_ART_cylinder_572] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cylinder_571] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_571] = "";
    artlhsL[ARTL_ART_cylinder_571] = ARTL_ART_cylinder;
    artLabelInternalStrings[ARTL_ART_cylinder_572] = "cylinder ::= 'CYLINDER'  '('  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_572] = "";
    artlhsL[ARTL_ART_cylinder_572] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_572] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cylinder_574] = "cylinder ::= 'CYLINDER'  '('  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_574] = "";
    artlhsL[ARTL_ART_cylinder_574] = ARTL_ART_cylinder;
    artSlotInstanceOfs[ARTL_ART_cylinder_574] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cylinder_574] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_cylinder_576] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cylinder_575] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_575] = "";
    artlhsL[ARTL_ART_cylinder_575] = ARTL_ART_cylinder;
    artLabelInternalStrings[ARTL_ART_cylinder_576] = "cylinder ::= 'CYLINDER'  '('  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_576] = "";
    artlhsL[ARTL_ART_cylinder_576] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_576] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_cylinder_578] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_cylinder_578] = "";
    artlhsL[ARTL_ART_cylinder_578] = ARTL_ART_cylinder;
    artSlotInstanceOfs[ARTL_ART_cylinder_578] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_cylinder_578] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_cylinder_578] = true;
    artFolds[ARTL_ART_cylinder_580] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_cylinder_579] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_cylinder_579] = "";
    artlhsL[ARTL_ART_cylinder_579] = ARTL_ART_cylinder;
    artPopD[ARTL_ART_cylinder_579] = true;
    artLabelInternalStrings[ARTL_ART_cylinder_580] = "cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_cylinder_580] = "";
    artlhsL[ARTL_ART_cylinder_580] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_cylinder_580] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_cylinder_580] = true;
    arteoR_pL[ARTL_ART_cylinder_580] = true;
    artPopD[ARTL_ART_cylinder_580] = true;
  }

  public void artTableInitialiser_ART_deref() {
    artLabelInternalStrings[ARTL_ART_deref] = "deref";
    artLabelStrings[ARTL_ART_deref] = "deref";
    artKindOfs[ARTL_ART_deref] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_deref_526] = "deref ::= . ID ";
    artLabelStrings[ARTL_ART_deref_526] = "";
    artlhsL[ARTL_ART_deref_526] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_deref_526] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_deref_528] = "deref ::= ID .";
    artLabelStrings[ARTL_ART_deref_528] = "";
    artlhsL[ARTL_ART_deref_528] = ARTL_ART_deref;
    artSlotInstanceOfs[ARTL_ART_deref_528] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_deref_528] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_deref_528] = true;
    arteoR_pL[ARTL_ART_deref_528] = true;
    artPopD[ARTL_ART_deref_528] = true;
  }

  public void artTableInitialiser_ART_div() {
    artLabelInternalStrings[ARTL_ART_div] = "div";
    artLabelStrings[ARTL_ART_div] = "div";
    artKindOfs[ARTL_ART_div] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_div_448] = "div ::= . subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_448] = "";
    artlhsL[ARTL_ART_div_448] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_448] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_450] = "div ::= subExpr . '/'  operand ";
    artLabelStrings[ARTL_ART_div_450] = "";
    artlhsL[ARTL_ART_div_450] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_450] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_div_450] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_div_450] = true;
    artFolds[ARTL_ART_div_452] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_div_451] = "div ::= subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_div_451] = "";
    artlhsL[ARTL_ART_div_451] = ARTL_ART_div;
    artLabelInternalStrings[ARTL_ART_div_452] = "div ::= subExpr '/'  . operand ";
    artLabelStrings[ARTL_ART_div_452] = "";
    artlhsL[ARTL_ART_div_452] = ARTL_ART_div;
    artKindOfs[ARTL_ART_div_452] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_div_454] = "div ::= subExpr '/'  operand .";
    artLabelStrings[ARTL_ART_div_454] = "";
    artlhsL[ARTL_ART_div_454] = ARTL_ART_div;
    artSlotInstanceOfs[ARTL_ART_div_454] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_div_454] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_div_454] = true;
    arteoR_pL[ARTL_ART_div_454] = true;
    artPopD[ARTL_ART_div_454] = true;
  }

  public void artTableInitialiser_ART_eq() {
    artLabelInternalStrings[ARTL_ART_eq] = "eq";
    artLabelStrings[ARTL_ART_eq] = "eq";
    artKindOfs[ARTL_ART_eq] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_eq_310] = "eq ::= . relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_310] = "";
    artlhsL[ARTL_ART_eq_310] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_310] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_312] = "eq ::= relExpr . '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_312] = "";
    artlhsL[ARTL_ART_eq_312] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_312] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_eq_312] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_eq_312] = true;
    artFolds[ARTL_ART_eq_314] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_eq_313] = "eq ::= relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_eq_313] = "";
    artlhsL[ARTL_ART_eq_313] = ARTL_ART_eq;
    artLabelInternalStrings[ARTL_ART_eq_314] = "eq ::= relExpr '=='  . subExpr ";
    artLabelStrings[ARTL_ART_eq_314] = "";
    artlhsL[ARTL_ART_eq_314] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_eq_314] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_eq_316] = "eq ::= relExpr '=='  subExpr .";
    artLabelStrings[ARTL_ART_eq_316] = "";
    artlhsL[ARTL_ART_eq_316] = ARTL_ART_eq;
    artSlotInstanceOfs[ARTL_ART_eq_316] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_eq_316] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_eq_316] = true;
    arteoR_pL[ARTL_ART_eq_316] = true;
    artPopD[ARTL_ART_eq_316] = true;
  }

  public void artTableInitialiser_ART_exp() {
    artLabelInternalStrings[ARTL_ART_exp] = "exp";
    artLabelStrings[ARTL_ART_exp] = "exp";
    artKindOfs[ARTL_ART_exp] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_exp_462] = "exp ::= . subExpr '**'  operand ";
    artLabelStrings[ARTL_ART_exp_462] = "";
    artlhsL[ARTL_ART_exp_462] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_exp_462] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_exp_464] = "exp ::= subExpr . '**'  operand ";
    artLabelStrings[ARTL_ART_exp_464] = "";
    artlhsL[ARTL_ART_exp_464] = ARTL_ART_exp;
    artSlotInstanceOfs[ARTL_ART_exp_464] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_exp_464] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_exp_464] = true;
    artFolds[ARTL_ART_exp_466] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_exp_465] = "exp ::= subExpr '**'  operand ";
    artLabelStrings[ARTL_ART_exp_465] = "";
    artlhsL[ARTL_ART_exp_465] = ARTL_ART_exp;
    artLabelInternalStrings[ARTL_ART_exp_466] = "exp ::= subExpr '**'  . operand ";
    artLabelStrings[ARTL_ART_exp_466] = "";
    artlhsL[ARTL_ART_exp_466] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_exp_466] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_exp_468] = "exp ::= subExpr '**'  operand .";
    artLabelStrings[ARTL_ART_exp_468] = "";
    artlhsL[ARTL_ART_exp_468] = ARTL_ART_exp;
    artSlotInstanceOfs[ARTL_ART_exp_468] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_exp_468] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_exp_468] = true;
    arteoR_pL[ARTL_ART_exp_468] = true;
    artPopD[ARTL_ART_exp_468] = true;
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
    artLabelInternalStrings[ARTL_ART_ge_334] = "ge ::= . relExpr '>='  subExpr ";
    artLabelStrings[ARTL_ART_ge_334] = "";
    artlhsL[ARTL_ART_ge_334] = ARTL_ART_ge;
    artKindOfs[ARTL_ART_ge_334] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ge_336] = "ge ::= relExpr . '>='  subExpr ";
    artLabelStrings[ARTL_ART_ge_336] = "";
    artlhsL[ARTL_ART_ge_336] = ARTL_ART_ge;
    artSlotInstanceOfs[ARTL_ART_ge_336] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_ge_336] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ge_336] = true;
    artFolds[ARTL_ART_ge_338] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_ge_337] = "ge ::= relExpr '>='  subExpr ";
    artLabelStrings[ARTL_ART_ge_337] = "";
    artlhsL[ARTL_ART_ge_337] = ARTL_ART_ge;
    artLabelInternalStrings[ARTL_ART_ge_338] = "ge ::= relExpr '>='  . subExpr ";
    artLabelStrings[ARTL_ART_ge_338] = "";
    artlhsL[ARTL_ART_ge_338] = ARTL_ART_ge;
    artKindOfs[ARTL_ART_ge_338] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ge_340] = "ge ::= relExpr '>='  subExpr .";
    artLabelStrings[ARTL_ART_ge_340] = "";
    artlhsL[ARTL_ART_ge_340] = ARTL_ART_ge;
    artSlotInstanceOfs[ARTL_ART_ge_340] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_ge_340] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ge_340] = true;
    arteoR_pL[ARTL_ART_ge_340] = true;
    artPopD[ARTL_ART_ge_340] = true;
  }

  public void artTableInitialiser_ART_gt() {
    artLabelInternalStrings[ARTL_ART_gt] = "gt";
    artLabelStrings[ARTL_ART_gt] = "gt";
    artKindOfs[ARTL_ART_gt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_gt_326] = "gt ::= . relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_326] = "";
    artlhsL[ARTL_ART_gt_326] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_326] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_328] = "gt ::= relExpr . '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_328] = "";
    artlhsL[ARTL_ART_gt_328] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_328] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_gt_328] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_gt_328] = true;
    artFolds[ARTL_ART_gt_330] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_gt_329] = "gt ::= relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_gt_329] = "";
    artlhsL[ARTL_ART_gt_329] = ARTL_ART_gt;
    artLabelInternalStrings[ARTL_ART_gt_330] = "gt ::= relExpr '>'  . subExpr ";
    artLabelStrings[ARTL_ART_gt_330] = "";
    artlhsL[ARTL_ART_gt_330] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_gt_330] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_gt_332] = "gt ::= relExpr '>'  subExpr .";
    artLabelStrings[ARTL_ART_gt_332] = "";
    artlhsL[ARTL_ART_gt_332] = ARTL_ART_gt;
    artSlotInstanceOfs[ARTL_ART_gt_332] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_gt_332] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_gt_332] = true;
    arteoR_pL[ARTL_ART_gt_332] = true;
    artPopD[ARTL_ART_gt_332] = true;
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
    artLabelInternalStrings[ARTL_ART_init_166] = "init ::= . 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_166] = "";
    artlhsL[ARTL_ART_init_166] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_166] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_init_168] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_167] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_167] = "";
    artlhsL[ARTL_ART_init_167] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_168] = "init ::= 'init'  . '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_168] = "";
    artlhsL[ARTL_ART_init_168] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_168] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_init_168] = true;
    artFolds[ARTL_ART_init_170] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_169] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_169] = "";
    artlhsL[ARTL_ART_init_169] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_170] = "init ::= 'init'  '('  . INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_170] = "";
    artlhsL[ARTL_ART_init_170] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_170] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_init_172] = "init ::= 'init'  '('  INTEGER . ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_172] = "";
    artlhsL[ARTL_ART_init_172] = ARTL_ART_init;
    artSlotInstanceOfs[ARTL_ART_init_172] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_init_172] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_init_174] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_173] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_173] = "";
    artlhsL[ARTL_ART_init_173] = ARTL_ART_init;
    artLabelInternalStrings[ARTL_ART_init_174] = "init ::= 'init'  '('  INTEGER ','  . INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_174] = "";
    artlhsL[ARTL_ART_init_174] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_174] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_init_176] = "init ::= 'init'  '('  INTEGER ','  INTEGER . ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_176] = "";
    artlhsL[ARTL_ART_init_176] = ARTL_ART_init;
    artSlotInstanceOfs[ARTL_ART_init_176] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_init_176] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_init_176] = true;
    artFolds[ARTL_ART_init_178] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_177] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_177] = "";
    artlhsL[ARTL_ART_init_177] = ARTL_ART_init;
    artPopD[ARTL_ART_init_177] = true;
    artLabelInternalStrings[ARTL_ART_init_178] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  . ';'  ";
    artLabelStrings[ARTL_ART_init_178] = "";
    artlhsL[ARTL_ART_init_178] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_178] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_init_178] = true;
    artFolds[ARTL_ART_init_180] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_init_179] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  ";
    artLabelStrings[ARTL_ART_init_179] = "";
    artlhsL[ARTL_ART_init_179] = ARTL_ART_init;
    artPopD[ARTL_ART_init_179] = true;
    artLabelInternalStrings[ARTL_ART_init_180] = "init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  .";
    artLabelStrings[ARTL_ART_init_180] = "";
    artlhsL[ARTL_ART_init_180] = ARTL_ART_init;
    artKindOfs[ARTL_ART_init_180] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_init_180] = true;
    arteoR_pL[ARTL_ART_init_180] = true;
    artPopD[ARTL_ART_init_180] = true;
  }

  public void artTableInitialiser_ART_le() {
    artLabelInternalStrings[ARTL_ART_le] = "le";
    artLabelStrings[ARTL_ART_le] = "le";
    artKindOfs[ARTL_ART_le] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_le_350] = "le ::= . relExpr '<='  subExpr ";
    artLabelStrings[ARTL_ART_le_350] = "";
    artlhsL[ARTL_ART_le_350] = ARTL_ART_le;
    artKindOfs[ARTL_ART_le_350] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_le_352] = "le ::= relExpr . '<='  subExpr ";
    artLabelStrings[ARTL_ART_le_352] = "";
    artlhsL[ARTL_ART_le_352] = ARTL_ART_le;
    artSlotInstanceOfs[ARTL_ART_le_352] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_le_352] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_le_352] = true;
    artFolds[ARTL_ART_le_354] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_le_353] = "le ::= relExpr '<='  subExpr ";
    artLabelStrings[ARTL_ART_le_353] = "";
    artlhsL[ARTL_ART_le_353] = ARTL_ART_le;
    artLabelInternalStrings[ARTL_ART_le_354] = "le ::= relExpr '<='  . subExpr ";
    artLabelStrings[ARTL_ART_le_354] = "";
    artlhsL[ARTL_ART_le_354] = ARTL_ART_le;
    artKindOfs[ARTL_ART_le_354] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_le_356] = "le ::= relExpr '<='  subExpr .";
    artLabelStrings[ARTL_ART_le_356] = "";
    artlhsL[ARTL_ART_le_356] = ARTL_ART_le;
    artSlotInstanceOfs[ARTL_ART_le_356] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_le_356] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_le_356] = true;
    arteoR_pL[ARTL_ART_le_356] = true;
    artPopD[ARTL_ART_le_356] = true;
  }

  public void artTableInitialiser_ART_lt() {
    artLabelInternalStrings[ARTL_ART_lt] = "lt";
    artLabelStrings[ARTL_ART_lt] = "lt";
    artKindOfs[ARTL_ART_lt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_lt_342] = "lt ::= . relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_342] = "";
    artlhsL[ARTL_ART_lt_342] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_342] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_344] = "lt ::= relExpr . '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_344] = "";
    artlhsL[ARTL_ART_lt_344] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_344] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_lt_344] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_lt_344] = true;
    artFolds[ARTL_ART_lt_346] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_lt_345] = "lt ::= relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_lt_345] = "";
    artlhsL[ARTL_ART_lt_345] = ARTL_ART_lt;
    artLabelInternalStrings[ARTL_ART_lt_346] = "lt ::= relExpr '<'  . subExpr ";
    artLabelStrings[ARTL_ART_lt_346] = "";
    artlhsL[ARTL_ART_lt_346] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_lt_346] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_lt_348] = "lt ::= relExpr '<'  subExpr .";
    artLabelStrings[ARTL_ART_lt_348] = "";
    artlhsL[ARTL_ART_lt_348] = ARTL_ART_lt;
    artSlotInstanceOfs[ARTL_ART_lt_348] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_lt_348] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_lt_348] = true;
    arteoR_pL[ARTL_ART_lt_348] = true;
    artPopD[ARTL_ART_lt_348] = true;
  }

  public void artTableInitialiser_ART_mul() {
    artLabelInternalStrings[ARTL_ART_mul] = "mul";
    artLabelStrings[ARTL_ART_mul] = "mul";
    artKindOfs[ARTL_ART_mul] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_mul_440] = "mul ::= . subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_440] = "";
    artlhsL[ARTL_ART_mul_440] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_440] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_442] = "mul ::= subExpr . '*'  operand ";
    artLabelStrings[ARTL_ART_mul_442] = "";
    artlhsL[ARTL_ART_mul_442] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_442] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_mul_442] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mul_442] = true;
    artFolds[ARTL_ART_mul_444] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_mul_443] = "mul ::= subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_mul_443] = "";
    artlhsL[ARTL_ART_mul_443] = ARTL_ART_mul;
    artLabelInternalStrings[ARTL_ART_mul_444] = "mul ::= subExpr '*'  . operand ";
    artLabelStrings[ARTL_ART_mul_444] = "";
    artlhsL[ARTL_ART_mul_444] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_mul_444] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mul_446] = "mul ::= subExpr '*'  operand .";
    artLabelStrings[ARTL_ART_mul_446] = "";
    artlhsL[ARTL_ART_mul_446] = ARTL_ART_mul;
    artSlotInstanceOfs[ARTL_ART_mul_446] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_mul_446] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mul_446] = true;
    arteoR_pL[ARTL_ART_mul_446] = true;
    artPopD[ARTL_ART_mul_446] = true;
  }

  public void artTableInitialiser_ART_ne() {
    artLabelInternalStrings[ARTL_ART_ne] = "ne";
    artLabelStrings[ARTL_ART_ne] = "ne";
    artKindOfs[ARTL_ART_ne] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ne_318] = "ne ::= . relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_318] = "";
    artlhsL[ARTL_ART_ne_318] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_318] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_320] = "ne ::= relExpr . '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_320] = "";
    artlhsL[ARTL_ART_ne_320] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_320] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_ne_320] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ne_320] = true;
    artFolds[ARTL_ART_ne_322] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_ne_321] = "ne ::= relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_ne_321] = "";
    artlhsL[ARTL_ART_ne_321] = ARTL_ART_ne;
    artLabelInternalStrings[ARTL_ART_ne_322] = "ne ::= relExpr '!='  . subExpr ";
    artLabelStrings[ARTL_ART_ne_322] = "";
    artlhsL[ARTL_ART_ne_322] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_ne_322] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ne_324] = "ne ::= relExpr '!='  subExpr .";
    artLabelStrings[ARTL_ART_ne_324] = "";
    artlhsL[ARTL_ART_ne_324] = ARTL_ART_ne;
    artSlotInstanceOfs[ARTL_ART_ne_324] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_ne_324] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ne_324] = true;
    arteoR_pL[ARTL_ART_ne_324] = true;
    artPopD[ARTL_ART_ne_324] = true;
  }

  public void artTableInitialiser_ART_neg() {
    artLabelInternalStrings[ARTL_ART_neg] = "neg";
    artLabelStrings[ARTL_ART_neg] = "neg";
    artKindOfs[ARTL_ART_neg] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_neg_456] = "neg ::= . '-'  operand ";
    artLabelStrings[ARTL_ART_neg_456] = "";
    artlhsL[ARTL_ART_neg_456] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_neg_456] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_neg_458] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_neg_457] = "neg ::= '-'  operand ";
    artLabelStrings[ARTL_ART_neg_457] = "";
    artlhsL[ARTL_ART_neg_457] = ARTL_ART_neg;
    artLabelInternalStrings[ARTL_ART_neg_458] = "neg ::= '-'  . operand ";
    artLabelStrings[ARTL_ART_neg_458] = "";
    artlhsL[ARTL_ART_neg_458] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_neg_458] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_neg_458] = true;
    artLabelInternalStrings[ARTL_ART_neg_460] = "neg ::= '-'  operand .";
    artLabelStrings[ARTL_ART_neg_460] = "";
    artlhsL[ARTL_ART_neg_460] = ARTL_ART_neg;
    artSlotInstanceOfs[ARTL_ART_neg_460] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_neg_460] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_neg_460] = true;
    arteoR_pL[ARTL_ART_neg_460] = true;
    artPopD[ARTL_ART_neg_460] = true;
  }

  public void artTableInitialiser_ART_not() {
    artLabelInternalStrings[ARTL_ART_not] = "not";
    artLabelStrings[ARTL_ART_not] = "not";
    artKindOfs[ARTL_ART_not] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_not_374] = "not ::= . '!'  relExpr ";
    artLabelStrings[ARTL_ART_not_374] = "";
    artlhsL[ARTL_ART_not_374] = ARTL_ART_not;
    artKindOfs[ARTL_ART_not_374] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_not_376] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_not_375] = "not ::= '!'  relExpr ";
    artLabelStrings[ARTL_ART_not_375] = "";
    artlhsL[ARTL_ART_not_375] = ARTL_ART_not;
    artLabelInternalStrings[ARTL_ART_not_376] = "not ::= '!'  . relExpr ";
    artLabelStrings[ARTL_ART_not_376] = "";
    artlhsL[ARTL_ART_not_376] = ARTL_ART_not;
    artKindOfs[ARTL_ART_not_376] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_not_376] = true;
    artLabelInternalStrings[ARTL_ART_not_378] = "not ::= '!'  relExpr .";
    artLabelStrings[ARTL_ART_not_378] = "";
    artlhsL[ARTL_ART_not_378] = ARTL_ART_not;
    artSlotInstanceOfs[ARTL_ART_not_378] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_not_378] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_not_378] = true;
    arteoR_pL[ARTL_ART_not_378] = true;
    artPopD[ARTL_ART_not_378] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_470] = "operand ::= . deref ";
    artLabelStrings[ARTL_ART_operand_470] = "";
    artlhsL[ARTL_ART_operand_470] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_470] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_472] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_472] = "operand ::= deref .";
    artLabelStrings[ARTL_ART_operand_472] = "";
    artlhsL[ARTL_ART_operand_472] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_472] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_operand_472] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_472] = true;
    arteoR_pL[ARTL_ART_operand_472] = true;
    artPopD[ARTL_ART_operand_472] = true;
    artLabelInternalStrings[ARTL_ART_operand_474] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_474] = "";
    artlhsL[ARTL_ART_operand_474] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_474] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_476] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_476] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_476] = "";
    artlhsL[ARTL_ART_operand_476] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_476] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_476] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_476] = true;
    arteoR_pL[ARTL_ART_operand_476] = true;
    artPopD[ARTL_ART_operand_476] = true;
    artLabelInternalStrings[ARTL_ART_operand_478] = "operand ::= . REAL ";
    artLabelStrings[ARTL_ART_operand_478] = "";
    artlhsL[ARTL_ART_operand_478] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_478] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_480] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_480] = "operand ::= REAL .";
    artLabelStrings[ARTL_ART_operand_480] = "";
    artlhsL[ARTL_ART_operand_480] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_480] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_operand_480] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_480] = true;
    arteoR_pL[ARTL_ART_operand_480] = true;
    artPopD[ARTL_ART_operand_480] = true;
    artLabelInternalStrings[ARTL_ART_operand_482] = "operand ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_operand_482] = "";
    artlhsL[ARTL_ART_operand_482] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_482] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_484] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_484] = "operand ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_operand_484] = "";
    artlhsL[ARTL_ART_operand_484] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_484] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_operand_484] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_484] = true;
    arteoR_pL[ARTL_ART_operand_484] = true;
    artPopD[ARTL_ART_operand_484] = true;
    artLabelInternalStrings[ARTL_ART_operand_486] = "operand ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_486] = "";
    artlhsL[ARTL_ART_operand_486] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_486] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_488] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_487] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_487] = "";
    artlhsL[ARTL_ART_operand_487] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_488] = "operand ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_488] = "";
    artlhsL[ARTL_ART_operand_488] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_488] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_488] = true;
    artFolds[ARTL_ART_operand_490] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_490] = "operand ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_490] = "";
    artlhsL[ARTL_ART_operand_490] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_490] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_operand_490] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_490] = true;
    artFolds[ARTL_ART_operand_492] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_operand_491] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_491] = "";
    artlhsL[ARTL_ART_operand_491] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_491] = true;
    artLabelInternalStrings[ARTL_ART_operand_492] = "operand ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_492] = "";
    artlhsL[ARTL_ART_operand_492] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_492] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_492] = true;
    arteoR_pL[ARTL_ART_operand_492] = true;
    artPopD[ARTL_ART_operand_492] = true;
    artLabelInternalStrings[ARTL_ART_operand_494] = "operand ::= . box ";
    artLabelStrings[ARTL_ART_operand_494] = "";
    artlhsL[ARTL_ART_operand_494] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_494] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_496] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_496] = "operand ::= box .";
    artLabelStrings[ARTL_ART_operand_496] = "";
    artlhsL[ARTL_ART_operand_496] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_496] = ARTL_ART_box;
    artKindOfs[ARTL_ART_operand_496] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_496] = true;
    arteoR_pL[ARTL_ART_operand_496] = true;
    artPopD[ARTL_ART_operand_496] = true;
    artLabelInternalStrings[ARTL_ART_operand_498] = "operand ::= . cube ";
    artLabelStrings[ARTL_ART_operand_498] = "";
    artlhsL[ARTL_ART_operand_498] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_498] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_500] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_500] = "operand ::= cube .";
    artLabelStrings[ARTL_ART_operand_500] = "";
    artlhsL[ARTL_ART_operand_500] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_500] = ARTL_ART_cube;
    artKindOfs[ARTL_ART_operand_500] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_500] = true;
    arteoR_pL[ARTL_ART_operand_500] = true;
    artPopD[ARTL_ART_operand_500] = true;
    artLabelInternalStrings[ARTL_ART_operand_502] = "operand ::= . sphere ";
    artLabelStrings[ARTL_ART_operand_502] = "";
    artlhsL[ARTL_ART_operand_502] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_502] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_504] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_504] = "operand ::= sphere .";
    artLabelStrings[ARTL_ART_operand_504] = "";
    artlhsL[ARTL_ART_operand_504] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_504] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_operand_504] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_504] = true;
    arteoR_pL[ARTL_ART_operand_504] = true;
    artPopD[ARTL_ART_operand_504] = true;
    artLabelInternalStrings[ARTL_ART_operand_506] = "operand ::= . cylinder ";
    artLabelStrings[ARTL_ART_operand_506] = "";
    artlhsL[ARTL_ART_operand_506] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_506] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_508] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_508] = "operand ::= cylinder .";
    artLabelStrings[ARTL_ART_operand_508] = "";
    artlhsL[ARTL_ART_operand_508] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_508] = ARTL_ART_cylinder;
    artKindOfs[ARTL_ART_operand_508] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_508] = true;
    arteoR_pL[ARTL_ART_operand_508] = true;
    artPopD[ARTL_ART_operand_508] = true;
    artLabelInternalStrings[ARTL_ART_operand_510] = "operand ::= . cone ";
    artLabelStrings[ARTL_ART_operand_510] = "";
    artlhsL[ARTL_ART_operand_510] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_510] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_512] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_512] = "operand ::= cone .";
    artLabelStrings[ARTL_ART_operand_512] = "";
    artlhsL[ARTL_ART_operand_512] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_512] = ARTL_ART_cone;
    artKindOfs[ARTL_ART_operand_512] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_512] = true;
    arteoR_pL[ARTL_ART_operand_512] = true;
    artPopD[ARTL_ART_operand_512] = true;
    artLabelInternalStrings[ARTL_ART_operand_514] = "operand ::= . torus ";
    artLabelStrings[ARTL_ART_operand_514] = "";
    artlhsL[ARTL_ART_operand_514] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_514] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_516] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_516] = "operand ::= torus .";
    artLabelStrings[ARTL_ART_operand_516] = "";
    artlhsL[ARTL_ART_operand_516] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_516] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_operand_516] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_516] = true;
    arteoR_pL[ARTL_ART_operand_516] = true;
    artPopD[ARTL_ART_operand_516] = true;
    artLabelInternalStrings[ARTL_ART_operand_518] = "operand ::= . tetrahedron ";
    artLabelStrings[ARTL_ART_operand_518] = "";
    artlhsL[ARTL_ART_operand_518] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_518] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_520] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_520] = "operand ::= tetrahedron .";
    artLabelStrings[ARTL_ART_operand_520] = "";
    artlhsL[ARTL_ART_operand_520] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_520] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_operand_520] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_520] = true;
    arteoR_pL[ARTL_ART_operand_520] = true;
    artPopD[ARTL_ART_operand_520] = true;
    artLabelInternalStrings[ARTL_ART_operand_522] = "operand ::= . pyramid ";
    artLabelStrings[ARTL_ART_operand_522] = "";
    artlhsL[ARTL_ART_operand_522] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_522] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_operand_524] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_operand_524] = "operand ::= pyramid .";
    artLabelStrings[ARTL_ART_operand_524] = "";
    artlhsL[ARTL_ART_operand_524] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_524] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_operand_524] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_524] = true;
    arteoR_pL[ARTL_ART_operand_524] = true;
    artPopD[ARTL_ART_operand_524] = true;
  }

  public void artTableInitialiser_ART_or() {
    artLabelInternalStrings[ARTL_ART_or] = "or";
    artLabelStrings[ARTL_ART_or] = "or";
    artKindOfs[ARTL_ART_or] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_or_366] = "or ::= . relExpr '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_366] = "";
    artlhsL[ARTL_ART_or_366] = ARTL_ART_or;
    artKindOfs[ARTL_ART_or_366] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_or_368] = "or ::= relExpr . '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_368] = "";
    artlhsL[ARTL_ART_or_368] = ARTL_ART_or;
    artSlotInstanceOfs[ARTL_ART_or_368] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_or_368] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_or_368] = true;
    artFolds[ARTL_ART_or_370] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_or_369] = "or ::= relExpr '||'  relExpr ";
    artLabelStrings[ARTL_ART_or_369] = "";
    artlhsL[ARTL_ART_or_369] = ARTL_ART_or;
    artLabelInternalStrings[ARTL_ART_or_370] = "or ::= relExpr '||'  . relExpr ";
    artLabelStrings[ARTL_ART_or_370] = "";
    artlhsL[ARTL_ART_or_370] = ARTL_ART_or;
    artKindOfs[ARTL_ART_or_370] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_or_372] = "or ::= relExpr '||'  relExpr .";
    artLabelStrings[ARTL_ART_or_372] = "";
    artlhsL[ARTL_ART_or_372] = ARTL_ART_or;
    artSlotInstanceOfs[ARTL_ART_or_372] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_or_372] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_or_372] = true;
    arteoR_pL[ARTL_ART_or_372] = true;
    artPopD[ARTL_ART_or_372] = true;
  }

  public void artTableInitialiser_ART_paint() {
    artLabelInternalStrings[ARTL_ART_paint] = "paint";
    artLabelStrings[ARTL_ART_paint] = "paint";
    artKindOfs[ARTL_ART_paint] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_paint_182] = "paint ::= . 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_182] = "";
    artlhsL[ARTL_ART_paint_182] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_182] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_182] = true;
    artFolds[ARTL_ART_paint_184] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_183] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_183] = "";
    artlhsL[ARTL_ART_paint_183] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_183] = true;
    artLabelInternalStrings[ARTL_ART_paint_184] = "paint ::= 'paint'  . '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_184] = "";
    artlhsL[ARTL_ART_paint_184] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_184] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_paint_184] = true;
    artPopD[ARTL_ART_paint_184] = true;
    artFolds[ARTL_ART_paint_186] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_185] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_185] = "";
    artlhsL[ARTL_ART_paint_185] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_185] = true;
    artLabelInternalStrings[ARTL_ART_paint_186] = "paint ::= 'paint'  '('  . ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_186] = "";
    artlhsL[ARTL_ART_paint_186] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_186] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_186] = true;
    artFolds[ARTL_ART_paint_188] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_187] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_187] = "";
    artlhsL[ARTL_ART_paint_187] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_187] = true;
    artLabelInternalStrings[ARTL_ART_paint_188] = "paint ::= 'paint'  '('  ')'  . ';'  ";
    artLabelStrings[ARTL_ART_paint_188] = "";
    artlhsL[ARTL_ART_paint_188] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_188] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_paint_188] = true;
    artFolds[ARTL_ART_paint_190] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_paint_189] = "paint ::= 'paint'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_paint_189] = "";
    artlhsL[ARTL_ART_paint_189] = ARTL_ART_paint;
    artPopD[ARTL_ART_paint_189] = true;
    artLabelInternalStrings[ARTL_ART_paint_190] = "paint ::= 'paint'  '('  ')'  ';'  .";
    artLabelStrings[ARTL_ART_paint_190] = "";
    artlhsL[ARTL_ART_paint_190] = ARTL_ART_paint;
    artKindOfs[ARTL_ART_paint_190] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_paint_190] = true;
    arteoR_pL[ARTL_ART_paint_190] = true;
    artPopD[ARTL_ART_paint_190] = true;
  }

  public void artTableInitialiser_ART_print() {
    artLabelInternalStrings[ARTL_ART_print] = "print";
    artLabelStrings[ARTL_ART_print] = "print";
    artKindOfs[ARTL_ART_print] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_print_154] = "print ::= . 'print'  '('  relExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_154] = "";
    artlhsL[ARTL_ART_print_154] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_154] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_print_156] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_155] = "print ::= 'print'  '('  relExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_155] = "";
    artlhsL[ARTL_ART_print_155] = ARTL_ART_print;
    artLabelInternalStrings[ARTL_ART_print_156] = "print ::= 'print'  . '('  relExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_156] = "";
    artlhsL[ARTL_ART_print_156] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_156] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_print_156] = true;
    artFolds[ARTL_ART_print_158] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_157] = "print ::= 'print'  '('  relExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_157] = "";
    artlhsL[ARTL_ART_print_157] = ARTL_ART_print;
    artLabelInternalStrings[ARTL_ART_print_158] = "print ::= 'print'  '('  . relExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_158] = "";
    artlhsL[ARTL_ART_print_158] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_158] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_print_160] = "print ::= 'print'  '('  relExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_160] = "";
    artlhsL[ARTL_ART_print_160] = ARTL_ART_print;
    artSlotInstanceOfs[ARTL_ART_print_160] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_print_160] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_print_160] = true;
    artFolds[ARTL_ART_print_162] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_161] = "print ::= 'print'  '('  relExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_161] = "";
    artlhsL[ARTL_ART_print_161] = ARTL_ART_print;
    artPopD[ARTL_ART_print_161] = true;
    artLabelInternalStrings[ARTL_ART_print_162] = "print ::= 'print'  '('  relExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_print_162] = "";
    artlhsL[ARTL_ART_print_162] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_162] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_print_162] = true;
    artFolds[ARTL_ART_print_164] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_print_163] = "print ::= 'print'  '('  relExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_print_163] = "";
    artlhsL[ARTL_ART_print_163] = ARTL_ART_print;
    artPopD[ARTL_ART_print_163] = true;
    artLabelInternalStrings[ARTL_ART_print_164] = "print ::= 'print'  '('  relExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_print_164] = "";
    artlhsL[ARTL_ART_print_164] = ARTL_ART_print;
    artKindOfs[ARTL_ART_print_164] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_print_164] = true;
    arteoR_pL[ARTL_ART_print_164] = true;
    artPopD[ARTL_ART_print_164] = true;
  }

  public void artTableInitialiser_ART_pyramid() {
    artLabelInternalStrings[ARTL_ART_pyramid] = "pyramid";
    artLabelStrings[ARTL_ART_pyramid] = "pyramid";
    artKindOfs[ARTL_ART_pyramid] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_pyramid_620] = "pyramid ::= . 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_620] = "";
    artlhsL[ARTL_ART_pyramid_620] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_620] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_pyramid_622] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_pyramid_621] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_621] = "";
    artlhsL[ARTL_ART_pyramid_621] = ARTL_ART_pyramid;
    artLabelInternalStrings[ARTL_ART_pyramid_622] = "pyramid ::= 'PYRAMID'  . '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_622] = "";
    artlhsL[ARTL_ART_pyramid_622] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_622] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_pyramid_622] = true;
    artFolds[ARTL_ART_pyramid_624] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_pyramid_623] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_623] = "";
    artlhsL[ARTL_ART_pyramid_623] = ARTL_ART_pyramid;
    artLabelInternalStrings[ARTL_ART_pyramid_624] = "pyramid ::= 'PYRAMID'  '('  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_624] = "";
    artlhsL[ARTL_ART_pyramid_624] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_624] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_pyramid_626] = "pyramid ::= 'PYRAMID'  '('  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_626] = "";
    artlhsL[ARTL_ART_pyramid_626] = ARTL_ART_pyramid;
    artSlotInstanceOfs[ARTL_ART_pyramid_626] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_pyramid_626] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_pyramid_628] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_pyramid_627] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_627] = "";
    artlhsL[ARTL_ART_pyramid_627] = ARTL_ART_pyramid;
    artLabelInternalStrings[ARTL_ART_pyramid_628] = "pyramid ::= 'PYRAMID'  '('  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_628] = "";
    artlhsL[ARTL_ART_pyramid_628] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_628] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_pyramid_630] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_pyramid_630] = "";
    artlhsL[ARTL_ART_pyramid_630] = ARTL_ART_pyramid;
    artSlotInstanceOfs[ARTL_ART_pyramid_630] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_pyramid_630] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_pyramid_630] = true;
    artFolds[ARTL_ART_pyramid_632] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_pyramid_631] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_pyramid_631] = "";
    artlhsL[ARTL_ART_pyramid_631] = ARTL_ART_pyramid;
    artPopD[ARTL_ART_pyramid_631] = true;
    artLabelInternalStrings[ARTL_ART_pyramid_632] = "pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_pyramid_632] = "";
    artlhsL[ARTL_ART_pyramid_632] = ARTL_ART_pyramid;
    artKindOfs[ARTL_ART_pyramid_632] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_pyramid_632] = true;
    arteoR_pL[ARTL_ART_pyramid_632] = true;
    artPopD[ARTL_ART_pyramid_632] = true;
  }

  public void artTableInitialiser_ART_relExpr() {
    artLabelInternalStrings[ARTL_ART_relExpr] = "relExpr";
    artLabelStrings[ARTL_ART_relExpr] = "relExpr";
    artKindOfs[ARTL_ART_relExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_relExpr_258] = "relExpr ::= . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_258] = "";
    artlhsL[ARTL_ART_relExpr_258] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_258] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_260] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_260] = "relExpr ::= subExpr .";
    artLabelStrings[ARTL_ART_relExpr_260] = "";
    artlhsL[ARTL_ART_relExpr_260] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_260] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_260] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_260] = true;
    arteoR_pL[ARTL_ART_relExpr_260] = true;
    artPopD[ARTL_ART_relExpr_260] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_262] = "relExpr ::= . eq ";
    artLabelStrings[ARTL_ART_relExpr_262] = "";
    artlhsL[ARTL_ART_relExpr_262] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_262] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_264] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_264] = "relExpr ::= eq .";
    artLabelStrings[ARTL_ART_relExpr_264] = "";
    artlhsL[ARTL_ART_relExpr_264] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_264] = ARTL_ART_eq;
    artKindOfs[ARTL_ART_relExpr_264] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_264] = true;
    arteoR_pL[ARTL_ART_relExpr_264] = true;
    artPopD[ARTL_ART_relExpr_264] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_266] = "relExpr ::= . ne ";
    artLabelStrings[ARTL_ART_relExpr_266] = "";
    artlhsL[ARTL_ART_relExpr_266] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_266] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_268] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_268] = "relExpr ::= ne .";
    artLabelStrings[ARTL_ART_relExpr_268] = "";
    artlhsL[ARTL_ART_relExpr_268] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_268] = ARTL_ART_ne;
    artKindOfs[ARTL_ART_relExpr_268] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_268] = true;
    arteoR_pL[ARTL_ART_relExpr_268] = true;
    artPopD[ARTL_ART_relExpr_268] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_270] = "relExpr ::= . gt ";
    artLabelStrings[ARTL_ART_relExpr_270] = "";
    artlhsL[ARTL_ART_relExpr_270] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_270] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_272] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_272] = "relExpr ::= gt .";
    artLabelStrings[ARTL_ART_relExpr_272] = "";
    artlhsL[ARTL_ART_relExpr_272] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_272] = ARTL_ART_gt;
    artKindOfs[ARTL_ART_relExpr_272] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_272] = true;
    arteoR_pL[ARTL_ART_relExpr_272] = true;
    artPopD[ARTL_ART_relExpr_272] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_274] = "relExpr ::= . ge ";
    artLabelStrings[ARTL_ART_relExpr_274] = "";
    artlhsL[ARTL_ART_relExpr_274] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_274] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_276] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_276] = "relExpr ::= ge .";
    artLabelStrings[ARTL_ART_relExpr_276] = "";
    artlhsL[ARTL_ART_relExpr_276] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_276] = ARTL_ART_ge;
    artKindOfs[ARTL_ART_relExpr_276] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_276] = true;
    arteoR_pL[ARTL_ART_relExpr_276] = true;
    artPopD[ARTL_ART_relExpr_276] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_278] = "relExpr ::= . lt ";
    artLabelStrings[ARTL_ART_relExpr_278] = "";
    artlhsL[ARTL_ART_relExpr_278] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_278] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_280] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_280] = "relExpr ::= lt .";
    artLabelStrings[ARTL_ART_relExpr_280] = "";
    artlhsL[ARTL_ART_relExpr_280] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_280] = ARTL_ART_lt;
    artKindOfs[ARTL_ART_relExpr_280] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_280] = true;
    arteoR_pL[ARTL_ART_relExpr_280] = true;
    artPopD[ARTL_ART_relExpr_280] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_282] = "relExpr ::= . le ";
    artLabelStrings[ARTL_ART_relExpr_282] = "";
    artlhsL[ARTL_ART_relExpr_282] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_282] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_284] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_284] = "relExpr ::= le .";
    artLabelStrings[ARTL_ART_relExpr_284] = "";
    artlhsL[ARTL_ART_relExpr_284] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_284] = ARTL_ART_le;
    artKindOfs[ARTL_ART_relExpr_284] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_284] = true;
    arteoR_pL[ARTL_ART_relExpr_284] = true;
    artPopD[ARTL_ART_relExpr_284] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_286] = "relExpr ::= . and ";
    artLabelStrings[ARTL_ART_relExpr_286] = "";
    artlhsL[ARTL_ART_relExpr_286] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_286] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_288] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_288] = "relExpr ::= and .";
    artLabelStrings[ARTL_ART_relExpr_288] = "";
    artlhsL[ARTL_ART_relExpr_288] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_288] = ARTL_ART_and;
    artKindOfs[ARTL_ART_relExpr_288] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_288] = true;
    arteoR_pL[ARTL_ART_relExpr_288] = true;
    artPopD[ARTL_ART_relExpr_288] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_290] = "relExpr ::= . or ";
    artLabelStrings[ARTL_ART_relExpr_290] = "";
    artlhsL[ARTL_ART_relExpr_290] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_290] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_292] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_292] = "relExpr ::= or .";
    artLabelStrings[ARTL_ART_relExpr_292] = "";
    artlhsL[ARTL_ART_relExpr_292] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_292] = ARTL_ART_or;
    artKindOfs[ARTL_ART_relExpr_292] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_292] = true;
    arteoR_pL[ARTL_ART_relExpr_292] = true;
    artPopD[ARTL_ART_relExpr_292] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_294] = "relExpr ::= . not ";
    artLabelStrings[ARTL_ART_relExpr_294] = "";
    artlhsL[ARTL_ART_relExpr_294] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_294] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_296] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_296] = "relExpr ::= not .";
    artLabelStrings[ARTL_ART_relExpr_296] = "";
    artlhsL[ARTL_ART_relExpr_296] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_296] = ARTL_ART_not;
    artKindOfs[ARTL_ART_relExpr_296] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_296] = true;
    arteoR_pL[ARTL_ART_relExpr_296] = true;
    artPopD[ARTL_ART_relExpr_296] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_298] = "relExpr ::= . xor ";
    artLabelStrings[ARTL_ART_relExpr_298] = "";
    artlhsL[ARTL_ART_relExpr_298] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_298] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_300] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_300] = "relExpr ::= xor .";
    artLabelStrings[ARTL_ART_relExpr_300] = "";
    artlhsL[ARTL_ART_relExpr_300] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_300] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_relExpr_300] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_300] = true;
    arteoR_pL[ARTL_ART_relExpr_300] = true;
    artPopD[ARTL_ART_relExpr_300] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_302] = "relExpr ::= . '('  relExpr ')'  ";
    artLabelStrings[ARTL_ART_relExpr_302] = "";
    artlhsL[ARTL_ART_relExpr_302] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_302] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_relExpr_304] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_relExpr_303] = "relExpr ::= '('  relExpr ')'  ";
    artLabelStrings[ARTL_ART_relExpr_303] = "";
    artlhsL[ARTL_ART_relExpr_303] = ARTL_ART_relExpr;
    artLabelInternalStrings[ARTL_ART_relExpr_304] = "relExpr ::= '('  . relExpr ')'  ";
    artLabelStrings[ARTL_ART_relExpr_304] = "";
    artlhsL[ARTL_ART_relExpr_304] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_304] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_relExpr_304] = true;
    artFolds[ARTL_ART_relExpr_306] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_relExpr_306] = "relExpr ::= '('  relExpr . ')'  ";
    artLabelStrings[ARTL_ART_relExpr_306] = "";
    artlhsL[ARTL_ART_relExpr_306] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_306] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_306] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_relExpr_306] = true;
    artFolds[ARTL_ART_relExpr_308] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_relExpr_307] = "relExpr ::= '('  relExpr ')'  ";
    artLabelStrings[ARTL_ART_relExpr_307] = "";
    artlhsL[ARTL_ART_relExpr_307] = ARTL_ART_relExpr;
    artPopD[ARTL_ART_relExpr_307] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_308] = "relExpr ::= '('  relExpr ')'  .";
    artLabelStrings[ARTL_ART_relExpr_308] = "";
    artlhsL[ARTL_ART_relExpr_308] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_308] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_308] = true;
    arteoR_pL[ARTL_ART_relExpr_308] = true;
    artPopD[ARTL_ART_relExpr_308] = true;
  }

  public void artTableInitialiser_ART_rotate() {
    artLabelInternalStrings[ARTL_ART_rotate] = "rotate";
    artLabelStrings[ARTL_ART_rotate] = "rotate";
    artKindOfs[ARTL_ART_rotate] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_rotate_214] = "rotate ::= . deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_214] = "";
    artlhsL[ARTL_ART_rotate_214] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_214] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_rotate_216] = "rotate ::= deref . '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_216] = "";
    artlhsL[ARTL_ART_rotate_216] = ARTL_ART_rotate;
    artSlotInstanceOfs[ARTL_ART_rotate_216] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_rotate_216] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_rotate_216] = true;
    artFolds[ARTL_ART_rotate_218] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_217] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_217] = "";
    artlhsL[ARTL_ART_rotate_217] = ARTL_ART_rotate;
    artLabelInternalStrings[ARTL_ART_rotate_218] = "rotate ::= deref '.rotate'  . '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_218] = "";
    artlhsL[ARTL_ART_rotate_218] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_218] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_rotate_220] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_219] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_219] = "";
    artlhsL[ARTL_ART_rotate_219] = ARTL_ART_rotate;
    artLabelInternalStrings[ARTL_ART_rotate_220] = "rotate ::= deref '.rotate'  '('  . REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_220] = "";
    artlhsL[ARTL_ART_rotate_220] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_220] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_rotate_222] = "rotate ::= deref '.rotate'  '('  REAL . ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_222] = "";
    artlhsL[ARTL_ART_rotate_222] = ARTL_ART_rotate;
    artSlotInstanceOfs[ARTL_ART_rotate_222] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_rotate_222] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_rotate_224] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_223] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_223] = "";
    artlhsL[ARTL_ART_rotate_223] = ARTL_ART_rotate;
    artLabelInternalStrings[ARTL_ART_rotate_224] = "rotate ::= deref '.rotate'  '('  REAL ','  . REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_224] = "";
    artlhsL[ARTL_ART_rotate_224] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_224] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_rotate_226] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL . ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_226] = "";
    artlhsL[ARTL_ART_rotate_226] = ARTL_ART_rotate;
    artSlotInstanceOfs[ARTL_ART_rotate_226] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_rotate_226] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_rotate_228] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_227] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_227] = "";
    artlhsL[ARTL_ART_rotate_227] = ARTL_ART_rotate;
    artLabelInternalStrings[ARTL_ART_rotate_228] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  . REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_228] = "";
    artlhsL[ARTL_ART_rotate_228] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_228] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_rotate_230] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL . ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_230] = "";
    artlhsL[ARTL_ART_rotate_230] = ARTL_ART_rotate;
    artSlotInstanceOfs[ARTL_ART_rotate_230] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_rotate_230] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rotate_230] = true;
    artFolds[ARTL_ART_rotate_232] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_231] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_231] = "";
    artlhsL[ARTL_ART_rotate_231] = ARTL_ART_rotate;
    artPopD[ARTL_ART_rotate_231] = true;
    artLabelInternalStrings[ARTL_ART_rotate_232] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  . ';'  ";
    artLabelStrings[ARTL_ART_rotate_232] = "";
    artlhsL[ARTL_ART_rotate_232] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_232] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rotate_232] = true;
    artFolds[ARTL_ART_rotate_234] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_rotate_233] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_rotate_233] = "";
    artlhsL[ARTL_ART_rotate_233] = ARTL_ART_rotate;
    artPopD[ARTL_ART_rotate_233] = true;
    artLabelInternalStrings[ARTL_ART_rotate_234] = "rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  .";
    artLabelStrings[ARTL_ART_rotate_234] = "";
    artlhsL[ARTL_ART_rotate_234] = ARTL_ART_rotate;
    artKindOfs[ARTL_ART_rotate_234] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rotate_234] = true;
    arteoR_pL[ARTL_ART_rotate_234] = true;
    artPopD[ARTL_ART_rotate_234] = true;
  }

  public void artTableInitialiser_ART_scale() {
    artLabelInternalStrings[ARTL_ART_scale] = "scale";
    artLabelStrings[ARTL_ART_scale] = "scale";
    artKindOfs[ARTL_ART_scale] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_scale_236] = "scale ::= . deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_236] = "";
    artlhsL[ARTL_ART_scale_236] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_236] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_scale_238] = "scale ::= deref . '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_238] = "";
    artlhsL[ARTL_ART_scale_238] = ARTL_ART_scale;
    artSlotInstanceOfs[ARTL_ART_scale_238] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_scale_238] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_scale_238] = true;
    artFolds[ARTL_ART_scale_240] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_239] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_239] = "";
    artlhsL[ARTL_ART_scale_239] = ARTL_ART_scale;
    artLabelInternalStrings[ARTL_ART_scale_240] = "scale ::= deref '.scale'  . '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_240] = "";
    artlhsL[ARTL_ART_scale_240] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_240] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_scale_242] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_241] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_241] = "";
    artlhsL[ARTL_ART_scale_241] = ARTL_ART_scale;
    artLabelInternalStrings[ARTL_ART_scale_242] = "scale ::= deref '.scale'  '('  . REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_242] = "";
    artlhsL[ARTL_ART_scale_242] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_242] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_scale_244] = "scale ::= deref '.scale'  '('  REAL . ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_244] = "";
    artlhsL[ARTL_ART_scale_244] = ARTL_ART_scale;
    artSlotInstanceOfs[ARTL_ART_scale_244] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_scale_244] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_scale_246] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_245] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_245] = "";
    artlhsL[ARTL_ART_scale_245] = ARTL_ART_scale;
    artLabelInternalStrings[ARTL_ART_scale_246] = "scale ::= deref '.scale'  '('  REAL ','  . REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_246] = "";
    artlhsL[ARTL_ART_scale_246] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_246] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_scale_248] = "scale ::= deref '.scale'  '('  REAL ','  REAL . ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_248] = "";
    artlhsL[ARTL_ART_scale_248] = ARTL_ART_scale;
    artSlotInstanceOfs[ARTL_ART_scale_248] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_scale_248] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_scale_250] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_249] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_249] = "";
    artlhsL[ARTL_ART_scale_249] = ARTL_ART_scale;
    artLabelInternalStrings[ARTL_ART_scale_250] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  . REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_250] = "";
    artlhsL[ARTL_ART_scale_250] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_250] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_scale_252] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL . ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_252] = "";
    artlhsL[ARTL_ART_scale_252] = ARTL_ART_scale;
    artSlotInstanceOfs[ARTL_ART_scale_252] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_scale_252] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_scale_252] = true;
    artFolds[ARTL_ART_scale_254] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_253] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_253] = "";
    artlhsL[ARTL_ART_scale_253] = ARTL_ART_scale;
    artPopD[ARTL_ART_scale_253] = true;
    artLabelInternalStrings[ARTL_ART_scale_254] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  . ';'  ";
    artLabelStrings[ARTL_ART_scale_254] = "";
    artlhsL[ARTL_ART_scale_254] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_254] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_scale_254] = true;
    artFolds[ARTL_ART_scale_256] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_scale_255] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_scale_255] = "";
    artlhsL[ARTL_ART_scale_255] = ARTL_ART_scale;
    artPopD[ARTL_ART_scale_255] = true;
    artLabelInternalStrings[ARTL_ART_scale_256] = "scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  .";
    artLabelStrings[ARTL_ART_scale_256] = "";
    artlhsL[ARTL_ART_scale_256] = ARTL_ART_scale;
    artKindOfs[ARTL_ART_scale_256] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_scale_256] = true;
    arteoR_pL[ARTL_ART_scale_256] = true;
    artPopD[ARTL_ART_scale_256] = true;
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
    artLabelInternalStrings[ARTL_ART_sphere_558] = "sphere ::= . 'SPHERE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_558] = "";
    artlhsL[ARTL_ART_sphere_558] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_sphere_558] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_sphere_560] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sphere_559] = "sphere ::= 'SPHERE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_559] = "";
    artlhsL[ARTL_ART_sphere_559] = ARTL_ART_sphere;
    artLabelInternalStrings[ARTL_ART_sphere_560] = "sphere ::= 'SPHERE'  . '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_560] = "";
    artlhsL[ARTL_ART_sphere_560] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_sphere_560] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sphere_560] = true;
    artFolds[ARTL_ART_sphere_562] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sphere_561] = "sphere ::= 'SPHERE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_561] = "";
    artlhsL[ARTL_ART_sphere_561] = ARTL_ART_sphere;
    artLabelInternalStrings[ARTL_ART_sphere_562] = "sphere ::= 'SPHERE'  '('  . REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_562] = "";
    artlhsL[ARTL_ART_sphere_562] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_sphere_562] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sphere_564] = "sphere ::= 'SPHERE'  '('  REAL . ')'  ";
    artLabelStrings[ARTL_ART_sphere_564] = "";
    artlhsL[ARTL_ART_sphere_564] = ARTL_ART_sphere;
    artSlotInstanceOfs[ARTL_ART_sphere_564] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_sphere_564] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_sphere_564] = true;
    artFolds[ARTL_ART_sphere_566] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sphere_565] = "sphere ::= 'SPHERE'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_sphere_565] = "";
    artlhsL[ARTL_ART_sphere_565] = ARTL_ART_sphere;
    artPopD[ARTL_ART_sphere_565] = true;
    artLabelInternalStrings[ARTL_ART_sphere_566] = "sphere ::= 'SPHERE'  '('  REAL ')'  .";
    artLabelStrings[ARTL_ART_sphere_566] = "";
    artlhsL[ARTL_ART_sphere_566] = ARTL_ART_sphere;
    artKindOfs[ARTL_ART_sphere_566] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sphere_566] = true;
    arteoR_pL[ARTL_ART_sphere_566] = true;
    artPopD[ARTL_ART_sphere_566] = true;
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
    artLabelInternalStrings[ARTL_ART_statement_26] = "statement ::= . print ";
    artLabelStrings[ARTL_ART_statement_26] = "";
    artlhsL[ARTL_ART_statement_26] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_26] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_statement_28] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_statement_28] = "statement ::= print .";
    artLabelStrings[ARTL_ART_statement_28] = "";
    artlhsL[ARTL_ART_statement_28] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_28] = ARTL_ART_print;
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
    artLabelInternalStrings[ARTL_ART_sub_424] = "sub ::= . subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_424] = "";
    artlhsL[ARTL_ART_sub_424] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_424] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_426] = "sub ::= subExpr . '-'  operand ";
    artLabelStrings[ARTL_ART_sub_426] = "";
    artlhsL[ARTL_ART_sub_426] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_426] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_sub_426] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_sub_426] = true;
    artFolds[ARTL_ART_sub_428] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_sub_427] = "sub ::= subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_sub_427] = "";
    artlhsL[ARTL_ART_sub_427] = ARTL_ART_sub;
    artLabelInternalStrings[ARTL_ART_sub_428] = "sub ::= subExpr '-'  . operand ";
    artLabelStrings[ARTL_ART_sub_428] = "";
    artlhsL[ARTL_ART_sub_428] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_sub_428] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_sub_430] = "sub ::= subExpr '-'  operand .";
    artLabelStrings[ARTL_ART_sub_430] = "";
    artlhsL[ARTL_ART_sub_430] = ARTL_ART_sub;
    artSlotInstanceOfs[ARTL_ART_sub_430] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_sub_430] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_sub_430] = true;
    arteoR_pL[ARTL_ART_sub_430] = true;
    artPopD[ARTL_ART_sub_430] = true;
  }

  public void artTableInitialiser_ART_subExpr() {
    artLabelInternalStrings[ARTL_ART_subExpr] = "subExpr";
    artLabelStrings[ARTL_ART_subExpr] = "subExpr";
    artKindOfs[ARTL_ART_subExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExpr_388] = "subExpr ::= . operand ";
    artLabelStrings[ARTL_ART_subExpr_388] = "";
    artlhsL[ARTL_ART_subExpr_388] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_388] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_390] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_390] = "subExpr ::= operand .";
    artLabelStrings[ARTL_ART_subExpr_390] = "";
    artlhsL[ARTL_ART_subExpr_390] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_390] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_390] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_390] = true;
    arteoR_pL[ARTL_ART_subExpr_390] = true;
    artPopD[ARTL_ART_subExpr_390] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_392] = "subExpr ::= . sub ";
    artLabelStrings[ARTL_ART_subExpr_392] = "";
    artlhsL[ARTL_ART_subExpr_392] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_392] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_394] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_394] = "subExpr ::= sub .";
    artLabelStrings[ARTL_ART_subExpr_394] = "";
    artlhsL[ARTL_ART_subExpr_394] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_394] = ARTL_ART_sub;
    artKindOfs[ARTL_ART_subExpr_394] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_394] = true;
    arteoR_pL[ARTL_ART_subExpr_394] = true;
    artPopD[ARTL_ART_subExpr_394] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_396] = "subExpr ::= . add ";
    artLabelStrings[ARTL_ART_subExpr_396] = "";
    artlhsL[ARTL_ART_subExpr_396] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_396] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_398] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_398] = "subExpr ::= add .";
    artLabelStrings[ARTL_ART_subExpr_398] = "";
    artlhsL[ARTL_ART_subExpr_398] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_398] = ARTL_ART_add;
    artKindOfs[ARTL_ART_subExpr_398] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_398] = true;
    arteoR_pL[ARTL_ART_subExpr_398] = true;
    artPopD[ARTL_ART_subExpr_398] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_400] = "subExpr ::= . mul ";
    artLabelStrings[ARTL_ART_subExpr_400] = "";
    artlhsL[ARTL_ART_subExpr_400] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_400] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_402] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_402] = "subExpr ::= mul .";
    artLabelStrings[ARTL_ART_subExpr_402] = "";
    artlhsL[ARTL_ART_subExpr_402] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_402] = ARTL_ART_mul;
    artKindOfs[ARTL_ART_subExpr_402] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_402] = true;
    arteoR_pL[ARTL_ART_subExpr_402] = true;
    artPopD[ARTL_ART_subExpr_402] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_404] = "subExpr ::= . div ";
    artLabelStrings[ARTL_ART_subExpr_404] = "";
    artlhsL[ARTL_ART_subExpr_404] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_404] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_406] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_406] = "subExpr ::= div .";
    artLabelStrings[ARTL_ART_subExpr_406] = "";
    artlhsL[ARTL_ART_subExpr_406] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_406] = ARTL_ART_div;
    artKindOfs[ARTL_ART_subExpr_406] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_406] = true;
    arteoR_pL[ARTL_ART_subExpr_406] = true;
    artPopD[ARTL_ART_subExpr_406] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_408] = "subExpr ::= . neg ";
    artLabelStrings[ARTL_ART_subExpr_408] = "";
    artlhsL[ARTL_ART_subExpr_408] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_408] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_410] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_410] = "subExpr ::= neg .";
    artLabelStrings[ARTL_ART_subExpr_410] = "";
    artlhsL[ARTL_ART_subExpr_410] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_410] = ARTL_ART_neg;
    artKindOfs[ARTL_ART_subExpr_410] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_410] = true;
    arteoR_pL[ARTL_ART_subExpr_410] = true;
    artPopD[ARTL_ART_subExpr_410] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_412] = "subExpr ::= . exp ";
    artLabelStrings[ARTL_ART_subExpr_412] = "";
    artlhsL[ARTL_ART_subExpr_412] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_412] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_414] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_414] = "subExpr ::= exp .";
    artLabelStrings[ARTL_ART_subExpr_414] = "";
    artlhsL[ARTL_ART_subExpr_414] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_414] = ARTL_ART_exp;
    artKindOfs[ARTL_ART_subExpr_414] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_414] = true;
    arteoR_pL[ARTL_ART_subExpr_414] = true;
    artPopD[ARTL_ART_subExpr_414] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_416] = "subExpr ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subExpr_416] = "";
    artlhsL[ARTL_ART_subExpr_416] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_416] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_subExpr_418] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subExpr_417] = "subExpr ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subExpr_417] = "";
    artlhsL[ARTL_ART_subExpr_417] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_418] = "subExpr ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_subExpr_418] = "";
    artlhsL[ARTL_ART_subExpr_418] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_418] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_418] = true;
    artFolds[ARTL_ART_subExpr_420] = ARTFOLD_OVER;
    artLabelInternalStrings[ARTL_ART_subExpr_420] = "subExpr ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_subExpr_420] = "";
    artlhsL[ARTL_ART_subExpr_420] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_420] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_420] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_subExpr_420] = true;
    artFolds[ARTL_ART_subExpr_422] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_subExpr_421] = "subExpr ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_subExpr_421] = "";
    artlhsL[ARTL_ART_subExpr_421] = ARTL_ART_subExpr;
    artPopD[ARTL_ART_subExpr_421] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_422] = "subExpr ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_subExpr_422] = "";
    artlhsL[ARTL_ART_subExpr_422] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_422] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_422] = true;
    arteoR_pL[ARTL_ART_subExpr_422] = true;
    artPopD[ARTL_ART_subExpr_422] = true;
  }

  public void artTableInitialiser_ART_tetrahedron() {
    artLabelInternalStrings[ARTL_ART_tetrahedron] = "tetrahedron";
    artLabelStrings[ARTL_ART_tetrahedron] = "tetrahedron";
    artKindOfs[ARTL_ART_tetrahedron] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_tetrahedron_610] = "tetrahedron ::= . 'TETRAHEDRON'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_610] = "";
    artlhsL[ARTL_ART_tetrahedron_610] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_tetrahedron_610] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_tetrahedron_612] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_tetrahedron_611] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_611] = "";
    artlhsL[ARTL_ART_tetrahedron_611] = ARTL_ART_tetrahedron;
    artLabelInternalStrings[ARTL_ART_tetrahedron_612] = "tetrahedron ::= 'TETRAHEDRON'  . '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_612] = "";
    artlhsL[ARTL_ART_tetrahedron_612] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_tetrahedron_612] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_tetrahedron_612] = true;
    artFolds[ARTL_ART_tetrahedron_614] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_tetrahedron_613] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_613] = "";
    artlhsL[ARTL_ART_tetrahedron_613] = ARTL_ART_tetrahedron;
    artLabelInternalStrings[ARTL_ART_tetrahedron_614] = "tetrahedron ::= 'TETRAHEDRON'  '('  . REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_614] = "";
    artlhsL[ARTL_ART_tetrahedron_614] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_tetrahedron_614] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_tetrahedron_616] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL . ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_616] = "";
    artlhsL[ARTL_ART_tetrahedron_616] = ARTL_ART_tetrahedron;
    artSlotInstanceOfs[ARTL_ART_tetrahedron_616] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_tetrahedron_616] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_tetrahedron_616] = true;
    artFolds[ARTL_ART_tetrahedron_618] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_tetrahedron_617] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  ";
    artLabelStrings[ARTL_ART_tetrahedron_617] = "";
    artlhsL[ARTL_ART_tetrahedron_617] = ARTL_ART_tetrahedron;
    artPopD[ARTL_ART_tetrahedron_617] = true;
    artLabelInternalStrings[ARTL_ART_tetrahedron_618] = "tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  .";
    artLabelStrings[ARTL_ART_tetrahedron_618] = "";
    artlhsL[ARTL_ART_tetrahedron_618] = ARTL_ART_tetrahedron;
    artKindOfs[ARTL_ART_tetrahedron_618] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_tetrahedron_618] = true;
    arteoR_pL[ARTL_ART_tetrahedron_618] = true;
    artPopD[ARTL_ART_tetrahedron_618] = true;
  }

  public void artTableInitialiser_ART_torus() {
    artLabelInternalStrings[ARTL_ART_torus] = "torus";
    artLabelStrings[ARTL_ART_torus] = "torus";
    artKindOfs[ARTL_ART_torus] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_torus_596] = "torus ::= . 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_596] = "";
    artlhsL[ARTL_ART_torus_596] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_596] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_torus_598] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_torus_597] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_597] = "";
    artlhsL[ARTL_ART_torus_597] = ARTL_ART_torus;
    artLabelInternalStrings[ARTL_ART_torus_598] = "torus ::= 'TORUS'  . '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_598] = "";
    artlhsL[ARTL_ART_torus_598] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_598] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_torus_598] = true;
    artFolds[ARTL_ART_torus_600] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_torus_599] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_599] = "";
    artlhsL[ARTL_ART_torus_599] = ARTL_ART_torus;
    artLabelInternalStrings[ARTL_ART_torus_600] = "torus ::= 'TORUS'  '('  . REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_600] = "";
    artlhsL[ARTL_ART_torus_600] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_600] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_torus_602] = "torus ::= 'TORUS'  '('  REAL . ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_602] = "";
    artlhsL[ARTL_ART_torus_602] = ARTL_ART_torus;
    artSlotInstanceOfs[ARTL_ART_torus_602] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_torus_602] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_torus_604] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_torus_603] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_603] = "";
    artlhsL[ARTL_ART_torus_603] = ARTL_ART_torus;
    artLabelInternalStrings[ARTL_ART_torus_604] = "torus ::= 'TORUS'  '('  REAL ','  . REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_604] = "";
    artlhsL[ARTL_ART_torus_604] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_604] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_torus_606] = "torus ::= 'TORUS'  '('  REAL ','  REAL . ')'  ";
    artLabelStrings[ARTL_ART_torus_606] = "";
    artlhsL[ARTL_ART_torus_606] = ARTL_ART_torus;
    artSlotInstanceOfs[ARTL_ART_torus_606] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_torus_606] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_torus_606] = true;
    artFolds[ARTL_ART_torus_608] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_torus_607] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  ";
    artLabelStrings[ARTL_ART_torus_607] = "";
    artlhsL[ARTL_ART_torus_607] = ARTL_ART_torus;
    artPopD[ARTL_ART_torus_607] = true;
    artLabelInternalStrings[ARTL_ART_torus_608] = "torus ::= 'TORUS'  '('  REAL ','  REAL ')'  .";
    artLabelStrings[ARTL_ART_torus_608] = "";
    artlhsL[ARTL_ART_torus_608] = ARTL_ART_torus;
    artKindOfs[ARTL_ART_torus_608] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_torus_608] = true;
    arteoR_pL[ARTL_ART_torus_608] = true;
    artPopD[ARTL_ART_torus_608] = true;
  }

  public void artTableInitialiser_ART_translate() {
    artLabelInternalStrings[ARTL_ART_translate] = "translate";
    artLabelStrings[ARTL_ART_translate] = "translate";
    artKindOfs[ARTL_ART_translate] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_translate_192] = "translate ::= . deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_192] = "";
    artlhsL[ARTL_ART_translate_192] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_192] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_translate_194] = "translate ::= deref . '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_194] = "";
    artlhsL[ARTL_ART_translate_194] = ARTL_ART_translate;
    artSlotInstanceOfs[ARTL_ART_translate_194] = ARTL_ART_deref;
    artKindOfs[ARTL_ART_translate_194] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_translate_194] = true;
    artFolds[ARTL_ART_translate_196] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_195] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_195] = "";
    artlhsL[ARTL_ART_translate_195] = ARTL_ART_translate;
    artLabelInternalStrings[ARTL_ART_translate_196] = "translate ::= deref '.translate'  . '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_196] = "";
    artlhsL[ARTL_ART_translate_196] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_196] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_translate_198] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_197] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_197] = "";
    artlhsL[ARTL_ART_translate_197] = ARTL_ART_translate;
    artLabelInternalStrings[ARTL_ART_translate_198] = "translate ::= deref '.translate'  '('  . REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_198] = "";
    artlhsL[ARTL_ART_translate_198] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_198] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_translate_200] = "translate ::= deref '.translate'  '('  REAL . ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_200] = "";
    artlhsL[ARTL_ART_translate_200] = ARTL_ART_translate;
    artSlotInstanceOfs[ARTL_ART_translate_200] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_translate_200] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_translate_202] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_201] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_201] = "";
    artlhsL[ARTL_ART_translate_201] = ARTL_ART_translate;
    artLabelInternalStrings[ARTL_ART_translate_202] = "translate ::= deref '.translate'  '('  REAL ','  . REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_202] = "";
    artlhsL[ARTL_ART_translate_202] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_202] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_translate_204] = "translate ::= deref '.translate'  '('  REAL ','  REAL . ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_204] = "";
    artlhsL[ARTL_ART_translate_204] = ARTL_ART_translate;
    artSlotInstanceOfs[ARTL_ART_translate_204] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_translate_204] = ARTK_INTERMEDIATE;
    artFolds[ARTL_ART_translate_206] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_205] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_205] = "";
    artlhsL[ARTL_ART_translate_205] = ARTL_ART_translate;
    artLabelInternalStrings[ARTL_ART_translate_206] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  . REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_206] = "";
    artlhsL[ARTL_ART_translate_206] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_206] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_translate_208] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL . ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_208] = "";
    artlhsL[ARTL_ART_translate_208] = ARTL_ART_translate;
    artSlotInstanceOfs[ARTL_ART_translate_208] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_translate_208] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_translate_208] = true;
    artFolds[ARTL_ART_translate_210] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_209] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_209] = "";
    artlhsL[ARTL_ART_translate_209] = ARTL_ART_translate;
    artPopD[ARTL_ART_translate_209] = true;
    artLabelInternalStrings[ARTL_ART_translate_210] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  . ';'  ";
    artLabelStrings[ARTL_ART_translate_210] = "";
    artlhsL[ARTL_ART_translate_210] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_210] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_translate_210] = true;
    artFolds[ARTL_ART_translate_212] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_translate_211] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  ";
    artLabelStrings[ARTL_ART_translate_211] = "";
    artlhsL[ARTL_ART_translate_211] = ARTL_ART_translate;
    artPopD[ARTL_ART_translate_211] = true;
    artLabelInternalStrings[ARTL_ART_translate_212] = "translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  .";
    artLabelStrings[ARTL_ART_translate_212] = "";
    artlhsL[ARTL_ART_translate_212] = ARTL_ART_translate;
    artKindOfs[ARTL_ART_translate_212] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_translate_212] = true;
    arteoR_pL[ARTL_ART_translate_212] = true;
    artPopD[ARTL_ART_translate_212] = true;
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
    artLabelInternalStrings[ARTL_ART_xor_380] = "xor ::= . relExpr '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_380] = "";
    artlhsL[ARTL_ART_xor_380] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_xor_380] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_xor_382] = "xor ::= relExpr . '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_382] = "";
    artlhsL[ARTL_ART_xor_382] = ARTL_ART_xor;
    artSlotInstanceOfs[ARTL_ART_xor_382] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_xor_382] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_xor_382] = true;
    artFolds[ARTL_ART_xor_384] = ARTFOLD_UNDER;
    artLabelInternalStrings[ARTL_ART_xor_383] = "xor ::= relExpr '^'  relExpr ";
    artLabelStrings[ARTL_ART_xor_383] = "";
    artlhsL[ARTL_ART_xor_383] = ARTL_ART_xor;
    artLabelInternalStrings[ARTL_ART_xor_384] = "xor ::= relExpr '^'  . relExpr ";
    artLabelStrings[ARTL_ART_xor_384] = "";
    artlhsL[ARTL_ART_xor_384] = ARTL_ART_xor;
    artKindOfs[ARTL_ART_xor_384] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_xor_386] = "xor ::= relExpr '^'  relExpr .";
    artLabelStrings[ARTL_ART_xor_386] = "";
    artlhsL[ARTL_ART_xor_386] = ARTL_ART_xor;
    artSlotInstanceOfs[ARTL_ART_xor_386] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_xor_386] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_xor_386] = true;
    arteoR_pL[ARTL_ART_xor_386] = true;
    artPopD[ARTL_ART_xor_386] = true;
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
    artTableInitialiser_ART_mul();
    artTableInitialiser_ART_ne();
    artTableInitialiser_ART_neg();
    artTableInitialiser_ART_not();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_or();
    artTableInitialiser_ART_paint();
    artTableInitialiser_ART_print();
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
    artSetExtent = 93;
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
      case ARTL_ART_ID_636: 
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
    case ARTL_ART_INTEGER_642: 
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
    case ARTL_ART_REAL_648: 
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
    case ARTL_ART_STRING_DQ_654: 
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
    case ARTL_ART_add_436: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*add ::= subExpr '+'  operand .*/
    case ARTL_ART_add_438: 
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
    case ARTL_ART_and_362: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*and ::= relExpr '&&'  relExpr .*/
    case ARTL_ART_and_364: 
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
    case ARTL_ART_box_534: 
                              break;
    /*box ::= 'BOX'  '('  REAL . ','  REAL ','  REAL ')'  */
    case ARTL_ART_box_536: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*box ::= 'BOX'  '('  REAL ','  . REAL ','  REAL ')'  */
    case ARTL_ART_box_538: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*box ::= 'BOX'  '('  REAL ','  REAL . ','  REAL ')'  */
    case ARTL_ART_box_540: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*box ::= 'BOX'  '('  REAL ','  REAL ','  . REAL ')'  */
    case ARTL_ART_box_542: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*box ::= 'BOX'  '('  REAL ','  REAL ','  REAL . ')'  */
    case ARTL_ART_box_544: 
      ARTRD_box(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL3));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL3);
            break;
    /*box ::= 'BOX'  '('  REAL ','  REAL ','  REAL ')'  .*/
    case ARTL_ART_box_546: 
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
    case ARTL_ART_cone_586: 
                              break;
    /*cone ::= 'CONE'  '('  REAL . ','  REAL ')'  */
    case ARTL_ART_cone_588: 
      ARTRD_cone(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*cone ::= 'CONE'  '('  REAL ','  . REAL ')'  */
    case ARTL_ART_cone_590: 
      ARTRD_cone(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
    /*cone ::= 'CONE'  '('  REAL ','  REAL . ')'  */
    case ARTL_ART_cone_592: 
      ARTRD_cone(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*cone ::= 'CONE'  '('  REAL ','  REAL ')'  .*/
    case ARTL_ART_cone_594: 
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
    case ARTL_ART_cube_552: 
                              break;
    /*cube ::= 'CUBE'  '('  REAL . ')'  */
    case ARTL_ART_cube_554: 
      ARTRD_cube(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*cube ::= 'CUBE'  '('  REAL ')'  .*/
    case ARTL_ART_cube_556: 
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
    case ARTL_ART_cylinder_572: 
                              break;
    /*cylinder ::= 'CYLINDER'  '('  REAL . ','  REAL ')'  */
    case ARTL_ART_cylinder_574: 
      ARTRD_cylinder(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*cylinder ::= 'CYLINDER'  '('  REAL ','  . REAL ')'  */
    case ARTL_ART_cylinder_576: 
      ARTRD_cylinder(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
    /*cylinder ::= 'CYLINDER'  '('  REAL ','  REAL . ')'  */
    case ARTL_ART_cylinder_578: 
      ARTRD_cylinder(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*cylinder ::= 'CYLINDER'  '('  REAL ','  REAL ')'  .*/
    case ARTL_ART_cylinder_580: 
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
    case ARTL_ART_deref_528: 
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
    case ARTL_ART_div_452: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*div ::= subExpr '/'  operand .*/
    case ARTL_ART_div_454: 
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
    case ARTL_ART_eq_314: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*eq ::= relExpr '=='  subExpr .*/
    case ARTL_ART_eq_316: 
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
    case ARTL_ART_exp_466: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*exp ::= subExpr '**'  operand .*/
    case ARTL_ART_exp_468: 
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
    case ARTL_ART_ge_338: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ge ::= relExpr '>='  subExpr .*/
    case ARTL_ART_ge_340: 
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
    case ARTL_ART_gt_330: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*gt ::= relExpr '>'  subExpr .*/
    case ARTL_ART_gt_332: 
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
    case ARTL_ART_init_170: 
                              break;
    /*init ::= 'init'  '('  INTEGER . ','  INTEGER ')'  ';'  */
    case ARTL_ART_init_172: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*init ::= 'init'  '('  INTEGER ','  . INTEGER ')'  ';'  */
    case ARTL_ART_init_174: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER . ')'  ';'  */
    case ARTL_ART_init_176: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
      INTEGER2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER2));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER2);
            break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER ')'  . ';'  */
    case ARTL_ART_init_178: 
      ARTRD_init(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, INTEGER2);
                  break;
    /*init ::= 'init'  '('  INTEGER ','  INTEGER ')'  ';'  .*/
    case ARTL_ART_init_180: 
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
    case ARTL_ART_le_354: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*le ::= relExpr '<='  subExpr .*/
    case ARTL_ART_le_356: 
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
    case ARTL_ART_lt_346: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*lt ::= relExpr '<'  subExpr .*/
    case ARTL_ART_lt_348: 
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
    case ARTL_ART_mul_444: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*mul ::= subExpr '*'  operand .*/
    case ARTL_ART_mul_446: 
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
    case ARTL_ART_ne_322: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ne ::= relExpr '!='  subExpr .*/
    case ARTL_ART_ne_324: 
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
    case ARTL_ART_neg_460: 
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
    case ARTL_ART_not_378: 
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
    case ARTL_ART_operand_472: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_476: 
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
    case ARTL_ART_operand_480: 
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
    case ARTL_ART_operand_484: 
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
    case ARTL_ART_operand_490: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*operand ::= '('  subExpr ')'  .*/
    case ARTL_ART_operand_492: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
                  break;
    /*operand ::= box .*/
    case ARTL_ART_operand_496: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_box(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*operand ::= cube .*/
    case ARTL_ART_operand_500: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_cube(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= sphere .*/
    case ARTL_ART_operand_504: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sphere(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= cylinder .*/
    case ARTL_ART_operand_508: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_cylinder(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*operand ::= cone .*/
    case ARTL_ART_operand_512: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_cone(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*operand ::= torus .*/
    case ARTL_ART_operand_516: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_torus(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*operand ::= tetrahedron .*/
    case ARTL_ART_operand_520: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      REAL1 = new ARTAT_ART_REAL();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, REAL1, STRING_DQ1);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_tetrahedron(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*operand ::= pyramid .*/
    case ARTL_ART_operand_524: 
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
    case ARTL_ART_or_370: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*or ::= relExpr '||'  relExpr .*/
    case ARTL_ART_or_372: 
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
    case ARTL_ART_paint_186: 
                              break;
    /*paint ::= 'paint'  '('  ')'  . ';'  */
    case ARTL_ART_paint_188: 
      ARTRD_paint(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*paint ::= 'paint'  '('  ')'  ';'  .*/
    case ARTL_ART_paint_190: 
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
    /*print ::= 'print'  '('  . relExpr ')'  ';'  */
    case ARTL_ART_print_158: 
                              break;
    /*print ::= 'print'  '('  relExpr . ')'  ';'  */
    case ARTL_ART_print_160: 
      ARTRD_print(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*print ::= 'print'  '('  relExpr ')'  . ';'  */
    case ARTL_ART_print_162: 
      ARTRD_print(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*print ::= 'print'  '('  relExpr ')'  ';'  .*/
    case ARTL_ART_print_164: 
            ARTRD_print(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_print: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_pyramid_624: 
                              break;
    /*pyramid ::= 'PYRAMID'  '('  REAL . ','  REAL ')'  */
    case ARTL_ART_pyramid_626: 
      ARTRD_pyramid(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*pyramid ::= 'PYRAMID'  '('  REAL ','  . REAL ')'  */
    case ARTL_ART_pyramid_628: 
      ARTRD_pyramid(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
    /*pyramid ::= 'PYRAMID'  '('  REAL ','  REAL . ')'  */
    case ARTL_ART_pyramid_630: 
      ARTRD_pyramid(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*pyramid ::= 'PYRAMID'  '('  REAL ','  REAL ')'  .*/
    case ARTL_ART_pyramid_632: 
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
    case ARTL_ART_relExpr_260: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= eq .*/
    case ARTL_ART_relExpr_264: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_eq(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= ne .*/
    case ARTL_ART_relExpr_268: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ne(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= gt .*/
    case ARTL_ART_relExpr_272: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_gt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= ge .*/
    case ARTL_ART_relExpr_276: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ge(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= lt .*/
    case ARTL_ART_relExpr_280: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_lt(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= le .*/
    case ARTL_ART_relExpr_284: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_le(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= and .*/
    case ARTL_ART_relExpr_288: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_and(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= or .*/
    case ARTL_ART_relExpr_292: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_or(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= not .*/
    case ARTL_ART_relExpr_296: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_not(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= xor .*/
    case ARTL_ART_relExpr_300: 
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_xor(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= '('  relExpr . ')'  */
    case ARTL_ART_relExpr_306: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*relExpr ::= '('  relExpr ')'  .*/
    case ARTL_ART_relExpr_308: 
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
    case ARTL_ART_rotate_218: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null);
                        break;
    /*rotate ::= deref '.rotate'  '('  . REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_220: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*rotate ::= deref '.rotate'  '('  REAL . ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_222: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  . REAL ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_224: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL . ','  REAL ')'  ';'  */
    case ARTL_ART_rotate_226: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  . REAL ')'  ';'  */
    case ARTL_ART_rotate_228: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL . ')'  ';'  */
    case ARTL_ART_rotate_230: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL3));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL3);
            break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  . ';'  */
    case ARTL_ART_rotate_232: 
      ARTRD_rotate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*rotate ::= deref '.rotate'  '('  REAL ','  REAL ','  REAL ')'  ';'  .*/
    case ARTL_ART_rotate_234: 
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
    case ARTL_ART_scale_240: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null);
                        break;
    /*scale ::= deref '.scale'  '('  . REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_scale_242: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*scale ::= deref '.scale'  '('  REAL . ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_scale_244: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*scale ::= deref '.scale'  '('  REAL ','  . REAL ','  REAL ')'  ';'  */
    case ARTL_ART_scale_246: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL . ','  REAL ')'  ';'  */
    case ARTL_ART_scale_248: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL ','  . REAL ')'  ';'  */
    case ARTL_ART_scale_250: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL . ')'  ';'  */
    case ARTL_ART_scale_252: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL3));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL3);
            break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  . ';'  */
    case ARTL_ART_scale_254: 
      ARTRD_scale(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*scale ::= deref '.scale'  '('  REAL ','  REAL ','  REAL ')'  ';'  .*/
    case ARTL_ART_scale_256: 
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
    case ARTL_ART_sphere_562: 
                              break;
    /*sphere ::= 'SPHERE'  '('  REAL . ')'  */
    case ARTL_ART_sphere_564: 
      ARTRD_sphere(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*sphere ::= 'SPHERE'  '('  REAL ')'  .*/
    case ARTL_ART_sphere_566: 
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
    /*statement ::= print .*/
    case ARTL_ART_statement_28: 
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_print(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
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
    case ARTL_ART_sub_428: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*sub ::= subExpr '-'  operand .*/
    case ARTL_ART_sub_430: 
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
    case ARTL_ART_subExpr_390: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*subExpr ::= sub .*/
    case ARTL_ART_subExpr_394: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_sub(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= add .*/
    case ARTL_ART_subExpr_398: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_add(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= mul .*/
    case ARTL_ART_subExpr_402: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_mul(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= div .*/
    case ARTL_ART_subExpr_406: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_div(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= neg .*/
    case ARTL_ART_subExpr_410: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_neg(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= exp .*/
    case ARTL_ART_subExpr_414: 
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_exp(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= '('  subExpr . ')'  */
    case ARTL_ART_subExpr_420: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*subExpr ::= '('  subExpr ')'  .*/
    case ARTL_ART_subExpr_422: 
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
    case ARTL_ART_tetrahedron_614: 
                              break;
    /*tetrahedron ::= 'TETRAHEDRON'  '('  REAL . ')'  */
    case ARTL_ART_tetrahedron_616: 
      ARTRD_tetrahedron(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*tetrahedron ::= 'TETRAHEDRON'  '('  REAL ')'  .*/
    case ARTL_ART_tetrahedron_618: 
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
    case ARTL_ART_torus_600: 
                              break;
    /*torus ::= 'TORUS'  '('  REAL . ','  REAL ')'  */
    case ARTL_ART_torus_602: 
      ARTRD_torus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*torus ::= 'TORUS'  '('  REAL ','  . REAL ')'  */
    case ARTL_ART_torus_604: 
      ARTRD_torus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
                  break;
    /*torus ::= 'TORUS'  '('  REAL ','  REAL . ')'  */
    case ARTL_ART_torus_606: 
      ARTRD_torus(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*torus ::= 'TORUS'  '('  REAL ','  REAL ')'  .*/
    case ARTL_ART_torus_608: 
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
    case ARTL_ART_translate_196: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_deref(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null);
                        break;
    /*translate ::= deref '.translate'  '('  . REAL ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_translate_198: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*translate ::= deref '.translate'  '('  REAL . ','  REAL ','  REAL ')'  ';'  */
    case ARTL_ART_translate_200: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*translate ::= deref '.translate'  '('  REAL ','  . REAL ','  REAL ')'  ';'  */
    case ARTL_ART_translate_202: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL . ','  REAL ')'  ';'  */
    case ARTL_ART_translate_204: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL2));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL2);
            break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL ','  . REAL ')'  ';'  */
    case ARTL_ART_translate_206: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL . ')'  ';'  */
    case ARTL_ART_translate_208: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
      REAL3.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL3.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL3));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL3);
            break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  . ';'  */
    case ARTL_ART_translate_210: 
      ARTRD_translate(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1, REAL2, REAL3);
                  break;
    /*translate ::= deref '.translate'  '('  REAL ','  REAL ','  REAL ')'  ';'  .*/
    case ARTL_ART_translate_212: 
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
    case ARTL_ART_xor_384: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*xor ::= relExpr '^'  relExpr .*/
    case ARTL_ART_xor_386: 
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
    case ARTL_ART_mul: ARTRD_mul(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ne: ARTRD_ne(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_neg: ARTRD_neg(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_not: ARTRD_not(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_operand: ARTRD_operand(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_or: ARTRD_or(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_paint: ARTRD_paint(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_print: ARTRD_print(artElement.element, artParent, artWriteable); break;
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
