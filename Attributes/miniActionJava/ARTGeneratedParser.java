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
 import java.util.HashMap; 
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
  private static boolean[] ARTSet86;
  private static boolean[] ARTSet87;
  private static boolean[] ARTSet88;
  private static boolean[] ARTSet89;
  private static boolean[] ARTSet90;
  private static boolean[] ARTSet91;
  private static boolean[] ARTSet92;
  private static boolean[] ARTSet93;
  private static boolean[] ARTSet94;
  private static boolean[] ARTSet95;
  private static boolean[] ARTSet96;
  private static boolean[] ARTSet97;
  private static boolean[] ARTSet98;
  private static boolean[] ARTSet99;
  private static boolean[] ARTSet100;
  private static boolean[] ARTSet101;
  private static boolean[] ARTSet102;
  private static boolean[] ARTSet103;
  private static boolean[] ARTSet104;
  private static boolean[] ARTSet105;
  private static boolean[] ARTSet106;
  private static boolean[] ARTSet107;
  private static boolean[] ARTSet108;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_REAL = 3;
  public static final int ARTTB_SIMPLE_WHITESPACE = 4;
  public static final int ARTTB_STRING_DQ = 5;
  public static final int ARTTS__SHREIK_EQUAL = 6;
  public static final int ARTTS__PERCENT = 7;
  public static final int ARTTS__LPAR = 8;
  public static final int ARTTS__RPAR = 9;
  public static final int ARTTS__STAR = 10;
  public static final int ARTTS__STAR_STAR = 11;
  public static final int ARTTS__PLUS = 12;
  public static final int ARTTS__COMMA = 13;
  public static final int ARTTS__MINUS = 14;
  public static final int ARTTS__PERIOD = 15;
  public static final int ARTTS__PERIOD_PERIOD = 16;
  public static final int ARTTS__PERIOD_PERIOD_PERIOD = 17;
  public static final int ARTTS__PERIOD_PERIOD_PERIOD_PERIOD = 18;
  public static final int ARTTS__SLASH = 19;
  public static final int ARTTS__SEMICOLON = 20;
  public static final int ARTTS__LT = 21;
  public static final int ARTTS__LT_EQUAL = 22;
  public static final int ARTTS__EQUAL = 23;
  public static final int ARTTS__EQUAL_EQUAL = 24;
  public static final int ARTTS__GT = 25;
  public static final int ARTTS__GT_EQUAL = 26;
  public static final int ARTTS_A = 27;
  public static final int ARTTS_A_HASH = 28;
  public static final int ARTTS_Ab = 29;
  public static final int ARTTS_B = 30;
  public static final int ARTTS_Bb = 31;
  public static final int ARTTS_C = 32;
  public static final int ARTTS_C_HASH = 33;
  public static final int ARTTS_D = 34;
  public static final int ARTTS_D_HASH = 35;
  public static final int ARTTS_Db = 36;
  public static final int ARTTS_E = 37;
  public static final int ARTTS_Eb = 38;
  public static final int ARTTS_F = 39;
  public static final int ARTTS_F_HASH = 40;
  public static final int ARTTS_G = 41;
  public static final int ARTTS_G_HASH = 42;
  public static final int ARTTS_Gb = 43;
  public static final int ARTTS_M = 44;
  public static final int ARTTS_M7 = 45;
  public static final int ARTTS__LBRACK = 46;
  public static final int ARTTS__RBRACK = 47;
  public static final int ARTTS_beatRatio = 48;
  public static final int ARTTS_bpm = 49;
  public static final int ARTTS_defaultOctave = 50;
  public static final int ARTTS_do = 51;
  public static final int ARTTS_else = 52;
  public static final int ARTTS_if = 53;
  public static final int ARTTS_m = 54;
  public static final int ARTTS_m7 = 55;
  public static final int ARTTS_melody = 56;
  public static final int ARTTS_play = 57;
  public static final int ARTTS_print = 58;
  public static final int ARTTS_then = 59;
  public static final int ARTTS_while = 60;
  public static final int ARTTS__LBRACE = 61;
  public static final int ARTTS__RBRACE = 62;
  public static final int ARTX_EPSILON = 63;
  public static final int ARTL_ART_ID = 64;
  public static final int ARTL_ART_INTEGER = 65;
  public static final int ARTL_ART_REAL = 66;
  public static final int ARTL_ART_STRING_DQ = 67;
  public static final int ARTL_ART_beatRatio = 68;
  public static final int ARTL_ART_bpm = 69;
  public static final int ARTL_ART_chord = 70;
  public static final int ARTL_ART_chordMode = 71;
  public static final int ARTL_ART_defaultOctave = 72;
  public static final int ARTL_ART_e0 = 73;
  public static final int ARTL_ART_e1 = 74;
  public static final int ARTL_ART_e2 = 75;
  public static final int ARTL_ART_e3 = 76;
  public static final int ARTL_ART_e4 = 77;
  public static final int ARTL_ART_e5 = 78;
  public static final int ARTL_ART_elseOpt = 79;
  public static final int ARTL_ART_note = 80;
  public static final int ARTL_ART_notes = 81;
  public static final int ARTL_ART_printElements = 82;
  public static final int ARTL_ART_rest = 83;
  public static final int ARTL_ART_shifters = 84;
  public static final int ARTL_ART_simpleNote = 85;
  public static final int ARTL_ART_simpleNoteLexeme = 86;
  public static final int ARTL_ART_statement = 87;
  public static final int ARTL_ART_statements = 88;
  public static final int ARTL_ART_ID_565 = 89;
  public static final int ARTL_ART_ID_566 = 90;
  public static final int ARTL_ART_ID_567 = 91;
  public static final int ARTL_ART_ID_568 = 92;
  public static final int ARTL_ART_INTEGER_571 = 93;
  public static final int ARTL_ART_INTEGER_572 = 94;
  public static final int ARTL_ART_INTEGER_573 = 95;
  public static final int ARTL_ART_INTEGER_574 = 96;
  public static final int ARTL_ART_REAL_577 = 97;
  public static final int ARTL_ART_REAL_578 = 98;
  public static final int ARTL_ART_REAL_579 = 99;
  public static final int ARTL_ART_REAL_580 = 100;
  public static final int ARTL_ART_STRING_DQ_583 = 101;
  public static final int ARTL_ART_STRING_DQ_584 = 102;
  public static final int ARTL_ART_STRING_DQ_585 = 103;
  public static final int ARTL_ART_STRING_DQ_586 = 104;
  public static final int ARTL_ART_beatRatio_127 = 105;
  public static final int ARTL_ART_beatRatio_128 = 106;
  public static final int ARTL_ART_beatRatio_129 = 107;
  public static final int ARTL_ART_beatRatio_130 = 108;
  public static final int ARTL_ART_beatRatio_131 = 109;
  public static final int ARTL_ART_beatRatio_132 = 110;
  public static final int ARTL_ART_bpm_119 = 111;
  public static final int ARTL_ART_bpm_120 = 112;
  public static final int ARTL_ART_bpm_121 = 113;
  public static final int ARTL_ART_bpm_122 = 114;
  public static final int ARTL_ART_bpm_123 = 115;
  public static final int ARTL_ART_bpm_124 = 116;
  public static final int ARTL_ART_chord_303 = 117;
  public static final int ARTL_ART_chord_304 = 118;
  public static final int ARTL_ART_chord_305 = 119;
  public static final int ARTL_ART_chord_306 = 120;
  public static final int ARTL_ART_chord_307 = 121;
  public static final int ARTL_ART_chord_308 = 122;
  public static final int ARTL_ART_chord_309 = 123;
  public static final int ARTL_ART_chord_310 = 124;
  public static final int ARTL_ART_chordMode_171 = 125;
  public static final int ARTL_ART_chordMode_172 = 126;
  public static final int ARTL_ART_chordMode_173 = 127;
  public static final int ARTL_ART_chordMode_174 = 128;
  public static final int ARTL_ART_chordMode_177 = 129;
  public static final int ARTL_ART_chordMode_178 = 130;
  public static final int ARTL_ART_chordMode_179 = 131;
  public static final int ARTL_ART_chordMode_180 = 132;
  public static final int ARTL_ART_chordMode_183 = 133;
  public static final int ARTL_ART_chordMode_184 = 134;
  public static final int ARTL_ART_chordMode_185 = 135;
  public static final int ARTL_ART_chordMode_186 = 136;
  public static final int ARTL_ART_chordMode_189 = 137;
  public static final int ARTL_ART_chordMode_190 = 138;
  public static final int ARTL_ART_chordMode_191 = 139;
  public static final int ARTL_ART_chordMode_192 = 140;
  public static final int ARTL_ART_chordMode_195 = 141;
  public static final int ARTL_ART_chordMode_196 = 142;
  public static final int ARTL_ART_chordMode_197 = 143;
  public static final int ARTL_ART_chordMode_198 = 144;
  public static final int ARTL_ART_defaultOctave_135 = 145;
  public static final int ARTL_ART_defaultOctave_136 = 146;
  public static final int ARTL_ART_defaultOctave_137 = 147;
  public static final int ARTL_ART_defaultOctave_138 = 148;
  public static final int ARTL_ART_defaultOctave_139 = 149;
  public static final int ARTL_ART_defaultOctave_140 = 150;
  public static final int ARTL_ART_e0_377 = 151;
  public static final int ARTL_ART_e0_378 = 152;
  public static final int ARTL_ART_e0_379 = 153;
  public static final int ARTL_ART_e0_380 = 154;
  public static final int ARTL_ART_e0_383 = 155;
  public static final int ARTL_ART_e0_384 = 156;
  public static final int ARTL_ART_e0_385 = 157;
  public static final int ARTL_ART_e0_386 = 158;
  public static final int ARTL_ART_e0_387 = 159;
  public static final int ARTL_ART_e0_388 = 160;
  public static final int ARTL_ART_e0_389 = 161;
  public static final int ARTL_ART_e0_390 = 162;
  public static final int ARTL_ART_e0_393 = 163;
  public static final int ARTL_ART_e0_394 = 164;
  public static final int ARTL_ART_e0_395 = 165;
  public static final int ARTL_ART_e0_396 = 166;
  public static final int ARTL_ART_e0_397 = 167;
  public static final int ARTL_ART_e0_398 = 168;
  public static final int ARTL_ART_e0_399 = 169;
  public static final int ARTL_ART_e0_400 = 170;
  public static final int ARTL_ART_e0_403 = 171;
  public static final int ARTL_ART_e0_404 = 172;
  public static final int ARTL_ART_e0_405 = 173;
  public static final int ARTL_ART_e0_406 = 174;
  public static final int ARTL_ART_e0_407 = 175;
  public static final int ARTL_ART_e0_408 = 176;
  public static final int ARTL_ART_e0_409 = 177;
  public static final int ARTL_ART_e0_410 = 178;
  public static final int ARTL_ART_e0_413 = 179;
  public static final int ARTL_ART_e0_414 = 180;
  public static final int ARTL_ART_e0_415 = 181;
  public static final int ARTL_ART_e0_416 = 182;
  public static final int ARTL_ART_e0_417 = 183;
  public static final int ARTL_ART_e0_418 = 184;
  public static final int ARTL_ART_e0_419 = 185;
  public static final int ARTL_ART_e0_420 = 186;
  public static final int ARTL_ART_e0_423 = 187;
  public static final int ARTL_ART_e0_424 = 188;
  public static final int ARTL_ART_e0_425 = 189;
  public static final int ARTL_ART_e0_426 = 190;
  public static final int ARTL_ART_e0_427 = 191;
  public static final int ARTL_ART_e0_428 = 192;
  public static final int ARTL_ART_e0_429 = 193;
  public static final int ARTL_ART_e0_430 = 194;
  public static final int ARTL_ART_e0_433 = 195;
  public static final int ARTL_ART_e0_434 = 196;
  public static final int ARTL_ART_e0_435 = 197;
  public static final int ARTL_ART_e0_436 = 198;
  public static final int ARTL_ART_e0_437 = 199;
  public static final int ARTL_ART_e0_438 = 200;
  public static final int ARTL_ART_e0_439 = 201;
  public static final int ARTL_ART_e0_440 = 202;
  public static final int ARTL_ART_e1_443 = 203;
  public static final int ARTL_ART_e1_444 = 204;
  public static final int ARTL_ART_e1_445 = 205;
  public static final int ARTL_ART_e1_446 = 206;
  public static final int ARTL_ART_e1_449 = 207;
  public static final int ARTL_ART_e1_450 = 208;
  public static final int ARTL_ART_e1_451 = 209;
  public static final int ARTL_ART_e1_452 = 210;
  public static final int ARTL_ART_e1_453 = 211;
  public static final int ARTL_ART_e1_454 = 212;
  public static final int ARTL_ART_e1_455 = 213;
  public static final int ARTL_ART_e1_456 = 214;
  public static final int ARTL_ART_e1_459 = 215;
  public static final int ARTL_ART_e1_460 = 216;
  public static final int ARTL_ART_e1_461 = 217;
  public static final int ARTL_ART_e1_462 = 218;
  public static final int ARTL_ART_e1_463 = 219;
  public static final int ARTL_ART_e1_464 = 220;
  public static final int ARTL_ART_e1_465 = 221;
  public static final int ARTL_ART_e1_466 = 222;
  public static final int ARTL_ART_e2_469 = 223;
  public static final int ARTL_ART_e2_470 = 224;
  public static final int ARTL_ART_e2_471 = 225;
  public static final int ARTL_ART_e2_472 = 226;
  public static final int ARTL_ART_e2_475 = 227;
  public static final int ARTL_ART_e2_476 = 228;
  public static final int ARTL_ART_e2_477 = 229;
  public static final int ARTL_ART_e2_478 = 230;
  public static final int ARTL_ART_e2_479 = 231;
  public static final int ARTL_ART_e2_480 = 232;
  public static final int ARTL_ART_e2_481 = 233;
  public static final int ARTL_ART_e2_482 = 234;
  public static final int ARTL_ART_e2_485 = 235;
  public static final int ARTL_ART_e2_486 = 236;
  public static final int ARTL_ART_e2_487 = 237;
  public static final int ARTL_ART_e2_488 = 238;
  public static final int ARTL_ART_e2_489 = 239;
  public static final int ARTL_ART_e2_490 = 240;
  public static final int ARTL_ART_e2_491 = 241;
  public static final int ARTL_ART_e2_492 = 242;
  public static final int ARTL_ART_e2_495 = 243;
  public static final int ARTL_ART_e2_496 = 244;
  public static final int ARTL_ART_e2_497 = 245;
  public static final int ARTL_ART_e2_498 = 246;
  public static final int ARTL_ART_e2_499 = 247;
  public static final int ARTL_ART_e2_500 = 248;
  public static final int ARTL_ART_e2_501 = 249;
  public static final int ARTL_ART_e2_502 = 250;
  public static final int ARTL_ART_e3_505 = 251;
  public static final int ARTL_ART_e3_506 = 252;
  public static final int ARTL_ART_e3_507 = 253;
  public static final int ARTL_ART_e3_508 = 254;
  public static final int ARTL_ART_e3_511 = 255;
  public static final int ARTL_ART_e3_512 = 256;
  public static final int ARTL_ART_e3_513 = 257;
  public static final int ARTL_ART_e3_514 = 258;
  public static final int ARTL_ART_e3_515 = 259;
  public static final int ARTL_ART_e3_516 = 260;
  public static final int ARTL_ART_e3_519 = 261;
  public static final int ARTL_ART_e3_520 = 262;
  public static final int ARTL_ART_e3_521 = 263;
  public static final int ARTL_ART_e3_522 = 264;
  public static final int ARTL_ART_e3_523 = 265;
  public static final int ARTL_ART_e3_524 = 266;
  public static final int ARTL_ART_e4_527 = 267;
  public static final int ARTL_ART_e4_528 = 268;
  public static final int ARTL_ART_e4_529 = 269;
  public static final int ARTL_ART_e4_530 = 270;
  public static final int ARTL_ART_e4_533 = 271;
  public static final int ARTL_ART_e4_534 = 272;
  public static final int ARTL_ART_e4_535 = 273;
  public static final int ARTL_ART_e4_536 = 274;
  public static final int ARTL_ART_e4_537 = 275;
  public static final int ARTL_ART_e4_538 = 276;
  public static final int ARTL_ART_e4_539 = 277;
  public static final int ARTL_ART_e4_540 = 278;
  public static final int ARTL_ART_e5_543 = 279;
  public static final int ARTL_ART_e5_544 = 280;
  public static final int ARTL_ART_e5_545 = 281;
  public static final int ARTL_ART_e5_546 = 282;
  public static final int ARTL_ART_e5_549 = 283;
  public static final int ARTL_ART_e5_550 = 284;
  public static final int ARTL_ART_e5_551 = 285;
  public static final int ARTL_ART_e5_552 = 286;
  public static final int ARTL_ART_e5_555 = 287;
  public static final int ARTL_ART_e5_556 = 288;
  public static final int ARTL_ART_e5_557 = 289;
  public static final int ARTL_ART_e5_558 = 290;
  public static final int ARTL_ART_e5_559 = 291;
  public static final int ARTL_ART_e5_560 = 292;
  public static final int ARTL_ART_e5_563 = 293;
  public static final int ARTL_ART_e5_564 = 294;
  public static final int ARTL_ART_elseOpt_109 = 295;
  public static final int ARTL_ART_elseOpt_110 = 296;
  public static final int ARTL_ART_elseOpt_111 = 297;
  public static final int ARTL_ART_elseOpt_112 = 298;
  public static final int ARTL_ART_elseOpt_113 = 299;
  public static final int ARTL_ART_elseOpt_114 = 300;
  public static final int ARTL_ART_elseOpt_115 = 301;
  public static final int ARTL_ART_elseOpt_116 = 302;
  public static final int ARTL_ART_elseOpt_117 = 303;
  public static final int ARTL_ART_elseOpt_118 = 304;
  public static final int ARTL_ART_note_143 = 305;
  public static final int ARTL_ART_note_144 = 306;
  public static final int ARTL_ART_note_145 = 307;
  public static final int ARTL_ART_note_146 = 308;
  public static final int ARTL_ART_note_147 = 309;
  public static final int ARTL_ART_note_148 = 310;
  public static final int ARTL_ART_note_151 = 311;
  public static final int ARTL_ART_note_152 = 312;
  public static final int ARTL_ART_note_153 = 313;
  public static final int ARTL_ART_note_154 = 314;
  public static final int ARTL_ART_note_155 = 315;
  public static final int ARTL_ART_note_156 = 316;
  public static final int ARTL_ART_note_157 = 317;
  public static final int ARTL_ART_note_158 = 318;
  public static final int ARTL_ART_note_161 = 319;
  public static final int ARTL_ART_note_162 = 320;
  public static final int ARTL_ART_note_163 = 321;
  public static final int ARTL_ART_note_164 = 322;
  public static final int ARTL_ART_note_165 = 323;
  public static final int ARTL_ART_note_166 = 324;
  public static final int ARTL_ART_note_167 = 325;
  public static final int ARTL_ART_note_168 = 326;
  public static final int ARTL_ART_notes_311 = 327;
  public static final int ARTL_ART_notes_312 = 328;
  public static final int ARTL_ART_notes_313 = 329;
  public static final int ARTL_ART_notes_314 = 330;
  public static final int ARTL_ART_notes_315 = 331;
  public static final int ARTL_ART_notes_316 = 332;
  public static final int ARTL_ART_notes_317 = 333;
  public static final int ARTL_ART_notes_318 = 334;
  public static final int ARTL_ART_notes_319 = 335;
  public static final int ARTL_ART_notes_320 = 336;
  public static final int ARTL_ART_printElements_345 = 337;
  public static final int ARTL_ART_printElements_346 = 338;
  public static final int ARTL_ART_printElements_347 = 339;
  public static final int ARTL_ART_printElements_348 = 340;
  public static final int ARTL_ART_printElements_351 = 341;
  public static final int ARTL_ART_printElements_352 = 342;
  public static final int ARTL_ART_printElements_353 = 343;
  public static final int ARTL_ART_printElements_354 = 344;
  public static final int ARTL_ART_printElements_357 = 345;
  public static final int ARTL_ART_printElements_358 = 346;
  public static final int ARTL_ART_printElements_359 = 347;
  public static final int ARTL_ART_printElements_360 = 348;
  public static final int ARTL_ART_printElements_361 = 349;
  public static final int ARTL_ART_printElements_362 = 350;
  public static final int ARTL_ART_printElements_363 = 351;
  public static final int ARTL_ART_printElements_364 = 352;
  public static final int ARTL_ART_printElements_367 = 353;
  public static final int ARTL_ART_printElements_368 = 354;
  public static final int ARTL_ART_printElements_369 = 355;
  public static final int ARTL_ART_printElements_370 = 356;
  public static final int ARTL_ART_printElements_373 = 357;
  public static final int ARTL_ART_printElements_374 = 358;
  public static final int ARTL_ART_printElements_375 = 359;
  public static final int ARTL_ART_printElements_376 = 360;
  public static final int ARTL_ART_rest_321 = 361;
  public static final int ARTL_ART_rest_322 = 362;
  public static final int ARTL_ART_rest_323 = 363;
  public static final int ARTL_ART_rest_324 = 364;
  public static final int ARTL_ART_rest_327 = 365;
  public static final int ARTL_ART_rest_328 = 366;
  public static final int ARTL_ART_rest_329 = 367;
  public static final int ARTL_ART_rest_330 = 368;
  public static final int ARTL_ART_rest_333 = 369;
  public static final int ARTL_ART_rest_334 = 370;
  public static final int ARTL_ART_rest_335 = 371;
  public static final int ARTL_ART_rest_336 = 372;
  public static final int ARTL_ART_rest_339 = 373;
  public static final int ARTL_ART_rest_340 = 374;
  public static final int ARTL_ART_rest_341 = 375;
  public static final int ARTL_ART_rest_342 = 376;
  public static final int ARTL_ART_shifters_275 = 377;
  public static final int ARTL_ART_shifters_276 = 378;
  public static final int ARTL_ART_shifters_277 = 379;
  public static final int ARTL_ART_shifters_278 = 380;
  public static final int ARTL_ART_shifters_281 = 381;
  public static final int ARTL_ART_shifters_282 = 382;
  public static final int ARTL_ART_shifters_283 = 383;
  public static final int ARTL_ART_shifters_284 = 384;
  public static final int ARTL_ART_shifters_287 = 385;
  public static final int ARTL_ART_shifters_288 = 386;
  public static final int ARTL_ART_shifters_289 = 387;
  public static final int ARTL_ART_shifters_290 = 388;
  public static final int ARTL_ART_shifters_291 = 389;
  public static final int ARTL_ART_shifters_292 = 390;
  public static final int ARTL_ART_shifters_295 = 391;
  public static final int ARTL_ART_shifters_296 = 392;
  public static final int ARTL_ART_shifters_297 = 393;
  public static final int ARTL_ART_shifters_298 = 394;
  public static final int ARTL_ART_shifters_299 = 395;
  public static final int ARTL_ART_shifters_300 = 396;
  public static final int ARTL_ART_simpleNote_201 = 397;
  public static final int ARTL_ART_simpleNote_202 = 398;
  public static final int ARTL_ART_simpleNote_203 = 399;
  public static final int ARTL_ART_simpleNote_204 = 400;
  public static final int ARTL_ART_simpleNoteLexeme_207 = 401;
  public static final int ARTL_ART_simpleNoteLexeme_208 = 402;
  public static final int ARTL_ART_simpleNoteLexeme_209 = 403;
  public static final int ARTL_ART_simpleNoteLexeme_210 = 404;
  public static final int ARTL_ART_simpleNoteLexeme_211 = 405;
  public static final int ARTL_ART_simpleNoteLexeme_212 = 406;
  public static final int ARTL_ART_simpleNoteLexeme_213 = 407;
  public static final int ARTL_ART_simpleNoteLexeme_214 = 408;
  public static final int ARTL_ART_simpleNoteLexeme_215 = 409;
  public static final int ARTL_ART_simpleNoteLexeme_216 = 410;
  public static final int ARTL_ART_simpleNoteLexeme_217 = 411;
  public static final int ARTL_ART_simpleNoteLexeme_218 = 412;
  public static final int ARTL_ART_simpleNoteLexeme_219 = 413;
  public static final int ARTL_ART_simpleNoteLexeme_220 = 414;
  public static final int ARTL_ART_simpleNoteLexeme_221 = 415;
  public static final int ARTL_ART_simpleNoteLexeme_222 = 416;
  public static final int ARTL_ART_simpleNoteLexeme_223 = 417;
  public static final int ARTL_ART_simpleNoteLexeme_224 = 418;
  public static final int ARTL_ART_simpleNoteLexeme_225 = 419;
  public static final int ARTL_ART_simpleNoteLexeme_226 = 420;
  public static final int ARTL_ART_simpleNoteLexeme_227 = 421;
  public static final int ARTL_ART_simpleNoteLexeme_228 = 422;
  public static final int ARTL_ART_simpleNoteLexeme_229 = 423;
  public static final int ARTL_ART_simpleNoteLexeme_230 = 424;
  public static final int ARTL_ART_simpleNoteLexeme_231 = 425;
  public static final int ARTL_ART_simpleNoteLexeme_232 = 426;
  public static final int ARTL_ART_simpleNoteLexeme_233 = 427;
  public static final int ARTL_ART_simpleNoteLexeme_234 = 428;
  public static final int ARTL_ART_simpleNoteLexeme_235 = 429;
  public static final int ARTL_ART_simpleNoteLexeme_236 = 430;
  public static final int ARTL_ART_simpleNoteLexeme_237 = 431;
  public static final int ARTL_ART_simpleNoteLexeme_238 = 432;
  public static final int ARTL_ART_simpleNoteLexeme_239 = 433;
  public static final int ARTL_ART_simpleNoteLexeme_240 = 434;
  public static final int ARTL_ART_simpleNoteLexeme_241 = 435;
  public static final int ARTL_ART_simpleNoteLexeme_242 = 436;
  public static final int ARTL_ART_simpleNoteLexeme_243 = 437;
  public static final int ARTL_ART_simpleNoteLexeme_244 = 438;
  public static final int ARTL_ART_simpleNoteLexeme_245 = 439;
  public static final int ARTL_ART_simpleNoteLexeme_246 = 440;
  public static final int ARTL_ART_simpleNoteLexeme_247 = 441;
  public static final int ARTL_ART_simpleNoteLexeme_248 = 442;
  public static final int ARTL_ART_simpleNoteLexeme_249 = 443;
  public static final int ARTL_ART_simpleNoteLexeme_250 = 444;
  public static final int ARTL_ART_simpleNoteLexeme_251 = 445;
  public static final int ARTL_ART_simpleNoteLexeme_252 = 446;
  public static final int ARTL_ART_simpleNoteLexeme_253 = 447;
  public static final int ARTL_ART_simpleNoteLexeme_254 = 448;
  public static final int ARTL_ART_simpleNoteLexeme_255 = 449;
  public static final int ARTL_ART_simpleNoteLexeme_256 = 450;
  public static final int ARTL_ART_simpleNoteLexeme_257 = 451;
  public static final int ARTL_ART_simpleNoteLexeme_258 = 452;
  public static final int ARTL_ART_simpleNoteLexeme_259 = 453;
  public static final int ARTL_ART_simpleNoteLexeme_260 = 454;
  public static final int ARTL_ART_simpleNoteLexeme_261 = 455;
  public static final int ARTL_ART_simpleNoteLexeme_262 = 456;
  public static final int ARTL_ART_simpleNoteLexeme_263 = 457;
  public static final int ARTL_ART_simpleNoteLexeme_264 = 458;
  public static final int ARTL_ART_simpleNoteLexeme_265 = 459;
  public static final int ARTL_ART_simpleNoteLexeme_266 = 460;
  public static final int ARTL_ART_simpleNoteLexeme_267 = 461;
  public static final int ARTL_ART_simpleNoteLexeme_268 = 462;
  public static final int ARTL_ART_simpleNoteLexeme_269 = 463;
  public static final int ARTL_ART_simpleNoteLexeme_270 = 464;
  public static final int ARTL_ART_simpleNoteLexeme_271 = 465;
  public static final int ARTL_ART_simpleNoteLexeme_272 = 466;
  public static final int ARTL_ART_simpleNoteLexeme_273 = 467;
  public static final int ARTL_ART_simpleNoteLexeme_274 = 468;
  public static final int ARTL_ART_statement_11 = 469;
  public static final int ARTL_ART_statement_12 = 470;
  public static final int ARTL_ART_statement_13 = 471;
  public static final int ARTL_ART_statement_14 = 472;
  public static final int ARTL_ART_statement_15 = 473;
  public static final int ARTL_ART_statement_16 = 474;
  public static final int ARTL_ART_statement_17 = 475;
  public static final int ARTL_ART_statement_18 = 476;
  public static final int ARTL_ART_statement_19 = 477;
  public static final int ARTL_ART_statement_20 = 478;
  public static final int ARTL_ART_statement_23 = 479;
  public static final int ARTL_ART_statement_24 = 480;
  public static final int ARTL_ART_statement_25 = 481;
  public static final int ARTL_ART_statement_26 = 482;
  public static final int ARTL_ART_statement_27 = 483;
  public static final int ARTL_ART_statement_28 = 484;
  public static final int ARTL_ART_statement_29 = 485;
  public static final int ARTL_ART_statement_30 = 486;
  public static final int ARTL_ART_statement_31 = 487;
  public static final int ARTL_ART_statement_32 = 488;
  public static final int ARTL_ART_statement_33 = 489;
  public static final int ARTL_ART_statement_34 = 490;
  public static final int ARTL_ART_statement_37 = 491;
  public static final int ARTL_ART_statement_38 = 492;
  public static final int ARTL_ART_statement_39 = 493;
  public static final int ARTL_ART_statement_40 = 494;
  public static final int ARTL_ART_statement_41 = 495;
  public static final int ARTL_ART_statement_42 = 496;
  public static final int ARTL_ART_statement_43 = 497;
  public static final int ARTL_ART_statement_44 = 498;
  public static final int ARTL_ART_statement_45 = 499;
  public static final int ARTL_ART_statement_46 = 500;
  public static final int ARTL_ART_statement_49 = 501;
  public static final int ARTL_ART_statement_50 = 502;
  public static final int ARTL_ART_statement_51 = 503;
  public static final int ARTL_ART_statement_52 = 504;
  public static final int ARTL_ART_statement_53 = 505;
  public static final int ARTL_ART_statement_54 = 506;
  public static final int ARTL_ART_statement_55 = 507;
  public static final int ARTL_ART_statement_56 = 508;
  public static final int ARTL_ART_statement_57 = 509;
  public static final int ARTL_ART_statement_58 = 510;
  public static final int ARTL_ART_statement_59 = 511;
  public static final int ARTL_ART_statement_60 = 512;
  public static final int ARTL_ART_statement_61 = 513;
  public static final int ARTL_ART_statement_62 = 514;
  public static final int ARTL_ART_statement_63 = 515;
  public static final int ARTL_ART_statement_64 = 516;
  public static final int ARTL_ART_statement_65 = 517;
  public static final int ARTL_ART_statement_66 = 518;
  public static final int ARTL_ART_statement_67 = 519;
  public static final int ARTL_ART_statement_68 = 520;
  public static final int ARTL_ART_statement_71 = 521;
  public static final int ARTL_ART_statement_72 = 522;
  public static final int ARTL_ART_statement_73 = 523;
  public static final int ARTL_ART_statement_74 = 524;
  public static final int ARTL_ART_statement_75 = 525;
  public static final int ARTL_ART_statement_76 = 526;
  public static final int ARTL_ART_statement_77 = 527;
  public static final int ARTL_ART_statement_78 = 528;
  public static final int ARTL_ART_statement_81 = 529;
  public static final int ARTL_ART_statement_82 = 530;
  public static final int ARTL_ART_statement_83 = 531;
  public static final int ARTL_ART_statement_84 = 532;
  public static final int ARTL_ART_statement_85 = 533;
  public static final int ARTL_ART_statement_86 = 534;
  public static final int ARTL_ART_statement_87 = 535;
  public static final int ARTL_ART_statement_88 = 536;
  public static final int ARTL_ART_statement_89 = 537;
  public static final int ARTL_ART_statement_90 = 538;
  public static final int ARTL_ART_statement_91 = 539;
  public static final int ARTL_ART_statement_92 = 540;
  public static final int ARTL_ART_statement_93 = 541;
  public static final int ARTL_ART_statement_94 = 542;
  public static final int ARTL_ART_statement_95 = 543;
  public static final int ARTL_ART_statement_96 = 544;
  public static final int ARTL_ART_statement_97 = 545;
  public static final int ARTL_ART_statement_98 = 546;
  public static final int ARTL_ART_statement_99 = 547;
  public static final int ARTL_ART_statement_100 = 548;
  public static final int ARTL_ART_statement_101 = 549;
  public static final int ARTL_ART_statement_102 = 550;
  public static final int ARTL_ART_statement_103 = 551;
  public static final int ARTL_ART_statement_104 = 552;
  public static final int ARTL_ART_statement_105 = 553;
  public static final int ARTL_ART_statement_106 = 554;
  public static final int ARTL_ART_statement_107 = 555;
  public static final int ARTL_ART_statement_108 = 556;
  public static final int ARTL_ART_statements_1 = 557;
  public static final int ARTL_ART_statements_2 = 558;
  public static final int ARTL_ART_statements_3 = 559;
  public static final int ARTL_ART_statements_4 = 560;
  public static final int ARTL_ART_statements_5 = 561;
  public static final int ARTL_ART_statements_6 = 562;
  public static final int ARTL_ART_statements_7 = 563;
  public static final int ARTL_ART_statements_8 = 564;
  public static final int ARTL_ART_statements_9 = 565;
  public static final int ARTL_ART_statements_10 = 566;
  public static final int ARTX_DESPATCH = 567;
  public static final int ARTX_DUMMY = 568;
  public static final int ARTX_LABEL_EXTENT = 569;
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
          artFindDescriptor(ARTL_ART_ID_566, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_566: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_568, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_INTEGER_572, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_572: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_574, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
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
          artFindDescriptor(ARTL_ART_REAL_578, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_578: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_580, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_STRING_DQ() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal STRING_DQ production descriptor loads*/
      case ARTL_ART_STRING_DQ: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_STRING_DQ_584, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_584: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_586, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_beatRatio() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal beatRatio production descriptor loads*/
      case ARTL_ART_beatRatio: 
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_beatRatio_128, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal beatRatio: match production*/
      case ARTL_ART_beatRatio_128: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_beatRatio, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_beatRatio_130, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_beatRatio_132, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_beatRatio_132: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_bpm() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal bpm production descriptor loads*/
      case ARTL_ART_bpm: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_bpm_120, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal bpm: match production*/
      case ARTL_ART_bpm_120: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_bpm, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_bpm_122, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_bpm_124, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_bpm_124: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_chord() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal chord production descriptor loads*/
      case ARTL_ART_chord: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chord_304, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal chord: match production*/
      case ARTL_ART_chord_304: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chord_306, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_chord_308, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_notes; return; }
      case ARTL_ART_chord_308: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chord_310, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_chordMode() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal chordMode production descriptor loads*/
      case ARTL_ART_chordMode: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_172, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_178, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_184, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_190, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_196, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_172: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_174, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_178: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_m, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_180, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_184: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_m7, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_186, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_190: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_M, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_192, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_196: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_M7, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_198, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_defaultOctave() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal defaultOctave production descriptor loads*/
      case ARTL_ART_defaultOctave: 
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_defaultOctave_136, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal defaultOctave: match production*/
      case ARTL_ART_defaultOctave_136: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_defaultOctave, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_defaultOctave_138, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_defaultOctave_140, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_defaultOctave_140: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e0() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e0 production descriptor loads*/
      case ARTL_ART_e0: 
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_378, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_384, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_394, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_404, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_414, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_424, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_434, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_378: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_380, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_380: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_384: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_386, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_386: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_388, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_390, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_390: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_394: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_396, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_396: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_398, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_400, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_400: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_404: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_406, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_406: 
        /* Nonterminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_408, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_410, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_410: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_414: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_416, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_416: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_418, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_420, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_420: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_424: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_426, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_426: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_428, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_430, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_430: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_434: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_436, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_436: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_438, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_440, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_440: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e1() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e1 production descriptor loads*/
      case ARTL_ART_e1: 
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_444, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_450, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_460, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_444: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_446, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_446: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_450: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_452, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e1_452: 
        /* Nonterminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e1_454, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_456, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_456: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_460: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_462, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e1_462: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e1_464, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_466, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_466: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e2() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e2 production descriptor loads*/
      case ARTL_ART_e2: 
        if (ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_470, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_476, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_486, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_496, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_470: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_472, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_472: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_476: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_478, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_478: 
        /* Nonterminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_480, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_482, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_482: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_486: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_488, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_488: 
        /* Nonterminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_490, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_492, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_492: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_496: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_498, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_498: 
        /* Nonterminal template end */
        if (!ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERCENT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_500, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_502, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_502: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e3() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e3 production descriptor loads*/
      case ARTL_ART_e3: 
        if (ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_506, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_512, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_520, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_506: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_508, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e4; return; }
      case ARTL_ART_e3_508: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_512: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e3_514, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_516, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e3_516: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_520: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e3_522, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_524, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e3_524: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e4() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e4 production descriptor loads*/
      case ARTL_ART_e4: 
        if (ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e4_528, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e4_534, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e4: match production*/
      case ARTL_ART_e4_528: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_530, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e5; return; }
      case ARTL_ART_e4_530: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e4: match production*/
      case ARTL_ART_e4_534: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_536, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e5; return; }
      case ARTL_ART_e4_536: 
        /* Nonterminal template end */
        if (!ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR_STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e4_538, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_540, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e4; return; }
      case ARTL_ART_e4_540: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e5() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e5 production descriptor loads*/
      case ARTL_ART_e5: 
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e5_544, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e5_550, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet49[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e5_556, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e5: match production*/
      case ARTL_ART_e5_544: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e5_546, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_e5_546: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e5: match production*/
      case ARTL_ART_e5_550: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e5_552, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_e5_552: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e5: match production*/
      case ARTL_ART_e5_556: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e5_558, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e5_560, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e5_560: 
        /* Nonterminal template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e5_564, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_elseOpt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal elseOpt production descriptor loads*/
      case ARTL_ART_elseOpt: 
        if (ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_elseOpt_110, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_elseOpt_116, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal elseOpt: match production*/
      case ARTL_ART_elseOpt_110: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_elseOpt_112, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_elseOpt_114, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_elseOpt_114: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal elseOpt: match production*/
      case ARTL_ART_elseOpt_116: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_elseOpt_118, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_note() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal note production descriptor loads*/
      case ARTL_ART_note: 
        if (ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_note_144, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_note_152, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_note_162, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal note: match production*/
      case ARTL_ART_note_144: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_146, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_simpleNote; return; }
      case ARTL_ART_note_146: 
        /* Nonterminal template end */
        if (!ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_148, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_chordMode; return; }
      case ARTL_ART_note_148: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal note: match production*/
      case ARTL_ART_note_152: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_154, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_simpleNote; return; }
      case ARTL_ART_note_154: 
        /* Nonterminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_156, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_shifters; return; }
      case ARTL_ART_note_156: 
        /* Nonterminal template end */
        if (!ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_158, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_chordMode; return; }
      case ARTL_ART_note_158: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal note: match production*/
      case ARTL_ART_note_162: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_164, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_simpleNote; return; }
      case ARTL_ART_note_164: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_166, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_note_166: 
        /* Nonterminal template end */
        if (!ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_168, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_chordMode; return; }
      case ARTL_ART_note_168: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_notes() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal notes production descriptor loads*/
      case ARTL_ART_notes: 
        if (ARTSet58[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_notes_312, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet58[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_notes_316, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal notes: match production*/
      case ARTL_ART_notes_312: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_notes_314, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_note; return; }
      case ARTL_ART_notes_314: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal notes: match production*/
      case ARTL_ART_notes_316: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_notes_318, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_note; return; }
      case ARTL_ART_notes_318: 
        /* Nonterminal template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_notes_320, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_notes; return; }
      case ARTL_ART_notes_320: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_printElements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal printElements production descriptor loads*/
      case ARTL_ART_printElements: 
        if (ARTSet60[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_346, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet60[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_352, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_362, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_368, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_346: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_348, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_printElements_348: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_352: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_354, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_printElements_354: 
        /* Nonterminal template end */
        if (!ARTSet61[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printElements_358, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet62[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_360, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_printElements_360: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_362: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_364, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_printElements_364: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_368: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_370, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_printElements_370: 
        /* Nonterminal template end */
        if (!ARTSet61[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printElements_374, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet62[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_376, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_printElements_376: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_rest() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal rest production descriptor loads*/
      case ARTL_ART_rest: 
        if (ARTSet65[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rest_322, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet66[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rest_328, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet67[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rest_334, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet68[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rest_340, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal rest: match production*/
      case ARTL_ART_rest_322: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rest_324, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal rest: match production*/
      case ARTL_ART_rest_328: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD_PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rest_330, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal rest: match production*/
      case ARTL_ART_rest_334: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD_PERIOD_PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rest_336, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal rest: match production*/
      case ARTL_ART_rest_340: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD_PERIOD_PERIOD_PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rest_342, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_shifters() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal shifters production descriptor loads*/
      case ARTL_ART_shifters: 
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_shifters_276, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_shifters_282, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_shifters_288, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_shifters_296, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal shifters: match production*/
      case ARTL_ART_shifters_276: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_shifters_278, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal shifters: match production*/
      case ARTL_ART_shifters_282: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_shifters_284, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal shifters: match production*/
      case ARTL_ART_shifters_288: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_shifters_290, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_shifters_292, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_shifters; return; }
      case ARTL_ART_shifters_292: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal shifters: match production*/
      case ARTL_ART_shifters_296: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_shifters_298, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_shifters_300, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_shifters; return; }
      case ARTL_ART_shifters_300: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_simpleNote() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal simpleNote production descriptor loads*/
      case ARTL_ART_simpleNote: 
        if (ARTSet70[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNote_202, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal simpleNote: match production*/
      case ARTL_ART_simpleNote_202: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_simpleNote_204, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_simpleNoteLexeme; return; }
      case ARTL_ART_simpleNote_204: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_simpleNoteLexeme() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal simpleNoteLexeme production descriptor loads*/
      case ARTL_ART_simpleNoteLexeme: 
        if (ARTSet73[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_208, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet74[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_212, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet75[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_216, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet76[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_220, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet77[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_224, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet78[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_228, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet79[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_232, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet80[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_236, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_240, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet82[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_244, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet83[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_248, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet84[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_252, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet85[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_256, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_260, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet87[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_264, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet88[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_268, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet89[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_272, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_208: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Ab, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_210, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_212: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_A, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_214, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_216: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_A_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_218, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_220: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Bb, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_222, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_224: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_B, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_226, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_228: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_C, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_230, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_232: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_C_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_234, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_236: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Db, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_238, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_240: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_D, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_242, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_244: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_D_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_246, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_248: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Eb, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_250, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_252: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_E, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_254, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_256: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_F, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_258, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_260: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_F_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_262, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_264: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Gb, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_266, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_268: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_G, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_270, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_272: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_G_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_274, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_12, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet93[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_24, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet96[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_38, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet98[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet99[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_62, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet100[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_72, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet101[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_82, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet104[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_90, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet105[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_94, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet58[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_98, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet106[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_102, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet107[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_106, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_12: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_14: 
        /* Nonterminal template end */
        if (!ARTSet91[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_16, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_18, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_statement_18: 
        /* Nonterminal template end */
        if (!ARTSet92[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_20, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_24: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_26, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_28, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_statement_28: 
        /* Nonterminal template end */
        if (!ARTSet94[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_then, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_30, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_32, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_32: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_34, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_elseOpt; return; }
      case ARTL_ART_statement_34: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_38: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_40, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_42, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_statement_42: 
        /* Nonterminal template end */
        if (!ARTSet97[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_do, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_44, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_46: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_50: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_print, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_52, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet49[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_54, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet62[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_statement_56: 
        /* Nonterminal template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_58, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet92[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_60, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_62: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_melody, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_64, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_66, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_66: 
        /* Nonterminal template end */
        if (!ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_68, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_68: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_72: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_play, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_74, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_76, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_76: 
        /* Nonterminal template end */
        if (!ARTSet92[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_78, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_82: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet102[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_86, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_statement_86: 
        /* Nonterminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_88, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_90: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_92, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_bpm; return; }
      case ARTL_ART_statement_92: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_94: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_defaultOctave; return; }
      case ARTL_ART_statement_96: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_98: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_100, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_note; return; }
      case ARTL_ART_statement_100: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_102: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_104, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_chord; return; }
      case ARTL_ART_statement_104: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_106: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_108, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_rest; return; }
      case ARTL_ART_statement_108: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statements production descriptor loads*/
      case ARTL_ART_statements: 
        if (ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statements_4: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet108[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_6: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_8, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statements_8: 
        /* Nonterminal template end */
        if (!ARTSet102[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_10, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_statements_10: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet108[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 89;
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
        case ARTL_ART_beatRatio: 
          ARTPF_ART_beatRatio();
          break;
        case ARTL_ART_bpm: 
          ARTPF_ART_bpm();
          break;
        case ARTL_ART_chord: 
          ARTPF_ART_chord();
          break;
        case ARTL_ART_chordMode: 
          ARTPF_ART_chordMode();
          break;
        case ARTL_ART_defaultOctave: 
          ARTPF_ART_defaultOctave();
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
        case ARTL_ART_elseOpt: 
          ARTPF_ART_elseOpt();
          break;
        case ARTL_ART_note: 
          ARTPF_ART_note();
          break;
        case ARTL_ART_notes: 
          ARTPF_ART_notes();
          break;
        case ARTL_ART_printElements: 
          ARTPF_ART_printElements();
          break;
        case ARTL_ART_rest: 
          ARTPF_ART_rest();
          break;
        case ARTL_ART_shifters: 
          ARTPF_ART_shifters();
          break;
        case ARTL_ART_simpleNote: 
          ARTPF_ART_simpleNote();
          break;
        case ARTL_ART_simpleNoteLexeme: 
          ARTPF_ART_simpleNoteLexeme();
          break;
        case ARTL_ART_statement: 
          ARTPF_ART_statement();
          break;
        case ARTL_ART_statements: 
          ARTPF_ART_statements();
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

  public void ARTSet70initialise() {
    ARTSet70 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet70, 0, artSetExtent, false);
    ARTSet70[ARTTS_A] = true;
    ARTSet70[ARTTS_A_HASH] = true;
    ARTSet70[ARTTS_Ab] = true;
    ARTSet70[ARTTS_B] = true;
    ARTSet70[ARTTS_Bb] = true;
    ARTSet70[ARTTS_C] = true;
    ARTSet70[ARTTS_C_HASH] = true;
    ARTSet70[ARTTS_D] = true;
    ARTSet70[ARTTS_D_HASH] = true;
    ARTSet70[ARTTS_Db] = true;
    ARTSet70[ARTTS_E] = true;
    ARTSet70[ARTTS_Eb] = true;
    ARTSet70[ARTTS_F] = true;
    ARTSet70[ARTTS_F_HASH] = true;
    ARTSet70[ARTTS_G] = true;
    ARTSet70[ARTTS_G_HASH] = true;
    ARTSet70[ARTTS_Gb] = true;
    ARTSet70[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS_M7] = true;
  }

  public void ARTSet62initialise() {
    ARTSet62 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet62, 0, artSetExtent, false);
    ARTSet62[ARTTB_ID] = true;
    ARTSet62[ARTTB_INTEGER] = true;
    ARTSet62[ARTTB_STRING_DQ] = true;
    ARTSet62[ARTTS__LPAR] = true;
    ARTSet62[ARTTS__PLUS] = true;
    ARTSet62[ARTTS__MINUS] = true;
    ARTSet62[ARTL_ART_ID] = true;
    ARTSet62[ARTL_ART_INTEGER] = true;
    ARTSet62[ARTL_ART_STRING_DQ] = true;
    ARTSet62[ARTL_ART_e0] = true;
    ARTSet62[ARTL_ART_e1] = true;
    ARTSet62[ARTL_ART_e2] = true;
    ARTSet62[ARTL_ART_e3] = true;
    ARTSet62[ARTL_ART_e4] = true;
    ARTSet62[ARTL_ART_e5] = true;
    ARTSet62[ARTL_ART_printElements] = true;
  }

  public void ARTSet97initialise() {
    ARTSet97 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet97, 0, artSetExtent, false);
    ARTSet97[ARTTS_do] = true;
  }

  public void ARTSet72initialise() {
    ARTSet72 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet72, 0, artSetExtent, false);
    ARTSet72[ARTTS_A] = true;
    ARTSet72[ARTTS_A_HASH] = true;
    ARTSet72[ARTTS_Ab] = true;
    ARTSet72[ARTTS_B] = true;
    ARTSet72[ARTTS_Bb] = true;
    ARTSet72[ARTTS_C] = true;
    ARTSet72[ARTTS_C_HASH] = true;
    ARTSet72[ARTTS_D] = true;
    ARTSet72[ARTTS_D_HASH] = true;
    ARTSet72[ARTTS_Db] = true;
    ARTSet72[ARTTS_E] = true;
    ARTSet72[ARTTS_Eb] = true;
    ARTSet72[ARTTS_F] = true;
    ARTSet72[ARTTS_F_HASH] = true;
    ARTSet72[ARTTS_G] = true;
    ARTSet72[ARTTS_G_HASH] = true;
    ARTSet72[ARTTS_Gb] = true;
  }

  public void ARTSet96initialise() {
    ARTSet96 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet96, 0, artSetExtent, false);
    ARTSet96[ARTTS_while] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTS__SHREIK_EQUAL] = true;
    ARTSet47[ARTTS__PERCENT] = true;
    ARTSet47[ARTTS__RPAR] = true;
    ARTSet47[ARTTS__STAR] = true;
    ARTSet47[ARTTS__STAR_STAR] = true;
    ARTSet47[ARTTS__PLUS] = true;
    ARTSet47[ARTTS__COMMA] = true;
    ARTSet47[ARTTS__MINUS] = true;
    ARTSet47[ARTTS__SLASH] = true;
    ARTSet47[ARTTS__SEMICOLON] = true;
    ARTSet47[ARTTS__LT] = true;
    ARTSet47[ARTTS__LT_EQUAL] = true;
    ARTSet47[ARTTS__EQUAL_EQUAL] = true;
    ARTSet47[ARTTS__GT] = true;
    ARTSet47[ARTTS__GT_EQUAL] = true;
    ARTSet47[ARTTS_do] = true;
    ARTSet47[ARTTS_then] = true;
  }

  public void ARTSet86initialise() {
    ARTSet86 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet86, 0, artSetExtent, false);
    ARTSet86[ARTTS_F_HASH] = true;
  }

  public void ARTSet80initialise() {
    ARTSet80 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet80, 0, artSetExtent, false);
    ARTSet80[ARTTS_Db] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTB_ID] = true;
    ARTSet38[ARTTB_INTEGER] = true;
    ARTSet38[ARTTS__LPAR] = true;
    ARTSet38[ARTTS__PLUS] = true;
    ARTSet38[ARTTS__MINUS] = true;
    ARTSet38[ARTL_ART_ID] = true;
    ARTSet38[ARTL_ART_INTEGER] = true;
    ARTSet38[ARTL_ART_e3] = true;
    ARTSet38[ARTL_ART_e4] = true;
    ARTSet38[ARTL_ART_e5] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTB_ID] = true;
    ARTSet42[ARTTB_INTEGER] = true;
    ARTSet42[ARTTS__LPAR] = true;
    ARTSet42[ARTTS__PLUS] = true;
    ARTSet42[ARTTS__MINUS] = true;
    ARTSet42[ARTL_ART_ID] = true;
    ARTSet42[ARTL_ART_INTEGER] = true;
    ARTSet42[ARTL_ART_e4] = true;
    ARTSet42[ARTL_ART_e5] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTB_ID] = true;
    ARTSet34[ARTTB_INTEGER] = true;
    ARTSet34[ARTTS__LPAR] = true;
    ARTSet34[ARTTS__PLUS] = true;
    ARTSet34[ARTTS__MINUS] = true;
    ARTSet34[ARTL_ART_ID] = true;
    ARTSet34[ARTL_ART_INTEGER] = true;
    ARTSet34[ARTL_ART_e2] = true;
    ARTSet34[ARTL_ART_e3] = true;
    ARTSet34[ARTL_ART_e4] = true;
    ARTSet34[ARTL_ART_e5] = true;
  }

  public void ARTSet104initialise() {
    ARTSet104 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet104, 0, artSetExtent, false);
    ARTSet104[ARTTS_bpm] = true;
    ARTSet104[ARTL_ART_bpm] = true;
  }

  public void ARTSet89initialise() {
    ARTSet89 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet89, 0, artSetExtent, false);
    ARTSet89[ARTTS_G_HASH] = true;
  }

  public void ARTSet83initialise() {
    ARTSet83 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet83, 0, artSetExtent, false);
    ARTSet83[ARTTS_Eb] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet66initialise() {
    ARTSet66 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet66, 0, artSetExtent, false);
    ARTSet66[ARTTS__PERIOD_PERIOD] = true;
  }

  public void ARTSet108initialise() {
    ARTSet108 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet108, 0, artSetExtent, false);
    ARTSet108[ARTX_EOS] = true;
    ARTSet108[ARTTS__RBRACE] = true;
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[ARTTS_else] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS__SHREIK_EQUAL] = true;
    ARTSet33[ARTTS__RPAR] = true;
    ARTSet33[ARTTS__PLUS] = true;
    ARTSet33[ARTTS__COMMA] = true;
    ARTSet33[ARTTS__MINUS] = true;
    ARTSet33[ARTTS__SEMICOLON] = true;
    ARTSet33[ARTTS__LT] = true;
    ARTSet33[ARTTS__LT_EQUAL] = true;
    ARTSet33[ARTTS__EQUAL_EQUAL] = true;
    ARTSet33[ARTTS__GT] = true;
    ARTSet33[ARTTS__GT_EQUAL] = true;
    ARTSet33[ARTTS_do] = true;
    ARTSet33[ARTTS_then] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTB_ID] = true;
    ARTSet48[ARTL_ART_ID] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTB_ID] = true;
    ARTSet3[ARTTS__SHREIK_EQUAL] = true;
    ARTSet3[ARTTS__PERCENT] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__STAR] = true;
    ARTSet3[ARTTS__STAR_STAR] = true;
    ARTSet3[ARTTS__PLUS] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__PERIOD] = true;
    ARTSet3[ARTTS__PERIOD_PERIOD] = true;
    ARTSet3[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet3[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet3[ARTTS__SLASH] = true;
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__LT_EQUAL] = true;
    ARTSet3[ARTTS__EQUAL] = true;
    ARTSet3[ARTTS__EQUAL_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS__GT_EQUAL] = true;
    ARTSet3[ARTTS_A] = true;
    ARTSet3[ARTTS_A_HASH] = true;
    ARTSet3[ARTTS_Ab] = true;
    ARTSet3[ARTTS_B] = true;
    ARTSet3[ARTTS_Bb] = true;
    ARTSet3[ARTTS_C] = true;
    ARTSet3[ARTTS_C_HASH] = true;
    ARTSet3[ARTTS_D] = true;
    ARTSet3[ARTTS_D_HASH] = true;
    ARTSet3[ARTTS_Db] = true;
    ARTSet3[ARTTS_E] = true;
    ARTSet3[ARTTS_Eb] = true;
    ARTSet3[ARTTS_F] = true;
    ARTSet3[ARTTS_F_HASH] = true;
    ARTSet3[ARTTS_G] = true;
    ARTSet3[ARTTS_G_HASH] = true;
    ARTSet3[ARTTS_Gb] = true;
    ARTSet3[ARTTS__LBRACK] = true;
    ARTSet3[ARTTS_bpm] = true;
    ARTSet3[ARTTS_defaultOctave] = true;
    ARTSet3[ARTTS_do] = true;
    ARTSet3[ARTTS_if] = true;
    ARTSet3[ARTTS_melody] = true;
    ARTSet3[ARTTS_play] = true;
    ARTSet3[ARTTS_print] = true;
    ARTSet3[ARTTS_then] = true;
    ARTSet3[ARTTS_while] = true;
    ARTSet3[ARTTS__LBRACE] = true;
    ARTSet3[ARTL_ART_ID] = true;
    ARTSet3[ARTL_ART_bpm] = true;
    ARTSet3[ARTL_ART_chord] = true;
    ARTSet3[ARTL_ART_defaultOctave] = true;
    ARTSet3[ARTL_ART_note] = true;
    ARTSet3[ARTL_ART_rest] = true;
    ARTSet3[ARTL_ART_simpleNote] = true;
    ARTSet3[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet3[ARTL_ART_statement] = true;
  }

  public void ARTSet60initialise() {
    ARTSet60 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet60, 0, artSetExtent, false);
    ARTSet60[ARTTB_STRING_DQ] = true;
    ARTSet60[ARTL_ART_STRING_DQ] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS__RPAR] = true;
    ARTSet9[ARTTS__COMMA] = true;
  }

  public void ARTSet69initialise() {
    ARTSet69 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet69, 0, artSetExtent, false);
    ARTSet69[ARTTS__PLUS] = true;
    ARTSet69[ARTTS__MINUS] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTS__SHREIK_EQUAL] = true;
    ARTSet37[ARTTS__PERCENT] = true;
    ARTSet37[ARTTS__RPAR] = true;
    ARTSet37[ARTTS__STAR] = true;
    ARTSet37[ARTTS__PLUS] = true;
    ARTSet37[ARTTS__COMMA] = true;
    ARTSet37[ARTTS__MINUS] = true;
    ARTSet37[ARTTS__SLASH] = true;
    ARTSet37[ARTTS__SEMICOLON] = true;
    ARTSet37[ARTTS__LT] = true;
    ARTSet37[ARTTS__LT_EQUAL] = true;
    ARTSet37[ARTTS__EQUAL_EQUAL] = true;
    ARTSet37[ARTTS__GT] = true;
    ARTSet37[ARTTS__GT_EQUAL] = true;
    ARTSet37[ARTTS_do] = true;
    ARTSet37[ARTTS_then] = true;
  }

  public void ARTSet63initialise() {
    ARTSet63 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet63, 0, artSetExtent, false);
    ARTSet63[ARTTB_ID] = true;
    ARTSet63[ARTTB_INTEGER] = true;
    ARTSet63[ARTTS__LPAR] = true;
    ARTSet63[ARTTS__PLUS] = true;
    ARTSet63[ARTTS__MINUS] = true;
    ARTSet63[ARTL_ART_ID] = true;
    ARTSet63[ARTL_ART_INTEGER] = true;
    ARTSet63[ARTL_ART_e0] = true;
    ARTSet63[ARTL_ART_e1] = true;
    ARTSet63[ARTL_ART_e2] = true;
    ARTSet63[ARTL_ART_e3] = true;
    ARTSet63[ARTL_ART_e4] = true;
    ARTSet63[ARTL_ART_e5] = true;
  }

  public void ARTSet105initialise() {
    ARTSet105 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet105, 0, artSetExtent, false);
    ARTSet105[ARTTS_defaultOctave] = true;
    ARTSet105[ARTL_ART_defaultOctave] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS_M] = true;
    ARTSet18[ARTTS_M7] = true;
    ARTSet18[ARTTS_m] = true;
    ARTSet18[ARTTS_m7] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTS_bpm] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTX_EOS] = true;
    ARTSet19[ARTTB_ID] = true;
    ARTSet19[ARTTS__PERIOD] = true;
    ARTSet19[ARTTS__PERIOD_PERIOD] = true;
    ARTSet19[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet19[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet19[ARTTS_A] = true;
    ARTSet19[ARTTS_A_HASH] = true;
    ARTSet19[ARTTS_Ab] = true;
    ARTSet19[ARTTS_B] = true;
    ARTSet19[ARTTS_Bb] = true;
    ARTSet19[ARTTS_C] = true;
    ARTSet19[ARTTS_C_HASH] = true;
    ARTSet19[ARTTS_D] = true;
    ARTSet19[ARTTS_D_HASH] = true;
    ARTSet19[ARTTS_Db] = true;
    ARTSet19[ARTTS_E] = true;
    ARTSet19[ARTTS_Eb] = true;
    ARTSet19[ARTTS_F] = true;
    ARTSet19[ARTTS_F_HASH] = true;
    ARTSet19[ARTTS_G] = true;
    ARTSet19[ARTTS_G_HASH] = true;
    ARTSet19[ARTTS_Gb] = true;
    ARTSet19[ARTTS__LBRACK] = true;
    ARTSet19[ARTTS__RBRACK] = true;
    ARTSet19[ARTTS_bpm] = true;
    ARTSet19[ARTTS_defaultOctave] = true;
    ARTSet19[ARTTS_else] = true;
    ARTSet19[ARTTS_if] = true;
    ARTSet19[ARTTS_melody] = true;
    ARTSet19[ARTTS_play] = true;
    ARTSet19[ARTTS_print] = true;
    ARTSet19[ARTTS_while] = true;
    ARTSet19[ARTTS__LBRACE] = true;
    ARTSet19[ARTTS__RBRACE] = true;
    ARTSet19[ARTL_ART_ID] = true;
    ARTSet19[ARTL_ART_bpm] = true;
    ARTSet19[ARTL_ART_chord] = true;
    ARTSet19[ARTL_ART_defaultOctave] = true;
    ARTSet19[ARTL_ART_elseOpt] = true;
    ARTSet19[ARTL_ART_note] = true;
    ARTSet19[ARTL_ART_notes] = true;
    ARTSet19[ARTL_ART_rest] = true;
    ARTSet19[ARTL_ART_simpleNote] = true;
    ARTSet19[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet19[ARTL_ART_statement] = true;
    ARTSet19[ARTL_ART_statements] = true;
  }

  public void ARTSet90initialise() {
    ARTSet90 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet90, 0, artSetExtent, false);
    ARTSet90[ARTTB_ID] = true;
    ARTSet90[ARTTS__PERIOD] = true;
    ARTSet90[ARTTS__PERIOD_PERIOD] = true;
    ARTSet90[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet90[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet90[ARTTS_A] = true;
    ARTSet90[ARTTS_A_HASH] = true;
    ARTSet90[ARTTS_Ab] = true;
    ARTSet90[ARTTS_B] = true;
    ARTSet90[ARTTS_Bb] = true;
    ARTSet90[ARTTS_C] = true;
    ARTSet90[ARTTS_C_HASH] = true;
    ARTSet90[ARTTS_D] = true;
    ARTSet90[ARTTS_D_HASH] = true;
    ARTSet90[ARTTS_Db] = true;
    ARTSet90[ARTTS_E] = true;
    ARTSet90[ARTTS_Eb] = true;
    ARTSet90[ARTTS_F] = true;
    ARTSet90[ARTTS_F_HASH] = true;
    ARTSet90[ARTTS_G] = true;
    ARTSet90[ARTTS_G_HASH] = true;
    ARTSet90[ARTTS_Gb] = true;
    ARTSet90[ARTTS__LBRACK] = true;
    ARTSet90[ARTTS_bpm] = true;
    ARTSet90[ARTTS_defaultOctave] = true;
    ARTSet90[ARTTS_if] = true;
    ARTSet90[ARTTS_melody] = true;
    ARTSet90[ARTTS_play] = true;
    ARTSet90[ARTTS_print] = true;
    ARTSet90[ARTTS_while] = true;
    ARTSet90[ARTTS__LBRACE] = true;
    ARTSet90[ARTL_ART_ID] = true;
    ARTSet90[ARTL_ART_bpm] = true;
    ARTSet90[ARTL_ART_chord] = true;
    ARTSet90[ARTL_ART_defaultOctave] = true;
    ARTSet90[ARTL_ART_note] = true;
    ARTSet90[ARTL_ART_rest] = true;
    ARTSet90[ARTL_ART_simpleNote] = true;
    ARTSet90[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTX_EOS] = true;
    ARTSet6[ARTTB_ID] = true;
    ARTSet6[ARTTS__SHREIK_EQUAL] = true;
    ARTSet6[ARTTS__PERCENT] = true;
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__STAR] = true;
    ARTSet6[ARTTS__STAR_STAR] = true;
    ARTSet6[ARTTS__PLUS] = true;
    ARTSet6[ARTTS__COMMA] = true;
    ARTSet6[ARTTS__MINUS] = true;
    ARTSet6[ARTTS__PERIOD] = true;
    ARTSet6[ARTTS__PERIOD_PERIOD] = true;
    ARTSet6[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet6[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet6[ARTTS__SLASH] = true;
    ARTSet6[ARTTS__SEMICOLON] = true;
    ARTSet6[ARTTS__LT] = true;
    ARTSet6[ARTTS__LT_EQUAL] = true;
    ARTSet6[ARTTS__EQUAL_EQUAL] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS__GT_EQUAL] = true;
    ARTSet6[ARTTS_A] = true;
    ARTSet6[ARTTS_A_HASH] = true;
    ARTSet6[ARTTS_Ab] = true;
    ARTSet6[ARTTS_B] = true;
    ARTSet6[ARTTS_Bb] = true;
    ARTSet6[ARTTS_C] = true;
    ARTSet6[ARTTS_C_HASH] = true;
    ARTSet6[ARTTS_D] = true;
    ARTSet6[ARTTS_D_HASH] = true;
    ARTSet6[ARTTS_Db] = true;
    ARTSet6[ARTTS_E] = true;
    ARTSet6[ARTTS_Eb] = true;
    ARTSet6[ARTTS_F] = true;
    ARTSet6[ARTTS_F_HASH] = true;
    ARTSet6[ARTTS_G] = true;
    ARTSet6[ARTTS_G_HASH] = true;
    ARTSet6[ARTTS_Gb] = true;
    ARTSet6[ARTTS_M] = true;
    ARTSet6[ARTTS_M7] = true;
    ARTSet6[ARTTS__LBRACK] = true;
    ARTSet6[ARTTS__RBRACK] = true;
    ARTSet6[ARTTS_bpm] = true;
    ARTSet6[ARTTS_defaultOctave] = true;
    ARTSet6[ARTTS_do] = true;
    ARTSet6[ARTTS_else] = true;
    ARTSet6[ARTTS_if] = true;
    ARTSet6[ARTTS_m] = true;
    ARTSet6[ARTTS_m7] = true;
    ARTSet6[ARTTS_melody] = true;
    ARTSet6[ARTTS_play] = true;
    ARTSet6[ARTTS_print] = true;
    ARTSet6[ARTTS_then] = true;
    ARTSet6[ARTTS_while] = true;
    ARTSet6[ARTTS__LBRACE] = true;
    ARTSet6[ARTTS__RBRACE] = true;
    ARTSet6[ARTL_ART_ID] = true;
    ARTSet6[ARTL_ART_bpm] = true;
    ARTSet6[ARTL_ART_chord] = true;
    ARTSet6[ARTL_ART_chordMode] = true;
    ARTSet6[ARTL_ART_defaultOctave] = true;
    ARTSet6[ARTL_ART_elseOpt] = true;
    ARTSet6[ARTL_ART_note] = true;
    ARTSet6[ARTL_ART_notes] = true;
    ARTSet6[ARTL_ART_rest] = true;
    ARTSet6[ARTL_ART_simpleNote] = true;
    ARTSet6[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet6[ARTL_ART_statement] = true;
    ARTSet6[ARTL_ART_statements] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[ARTTS_A] = true;
    ARTSet54[ARTTS_A_HASH] = true;
    ARTSet54[ARTTS_Ab] = true;
    ARTSet54[ARTTS_B] = true;
    ARTSet54[ARTTS_Bb] = true;
    ARTSet54[ARTTS_C] = true;
    ARTSet54[ARTTS_C_HASH] = true;
    ARTSet54[ARTTS_D] = true;
    ARTSet54[ARTTS_D_HASH] = true;
    ARTSet54[ARTTS_Db] = true;
    ARTSet54[ARTTS_E] = true;
    ARTSet54[ARTTS_Eb] = true;
    ARTSet54[ARTTS_F] = true;
    ARTSet54[ARTTS_F_HASH] = true;
    ARTSet54[ARTTS_G] = true;
    ARTSet54[ARTTS_G_HASH] = true;
    ARTSet54[ARTTS_Gb] = true;
    ARTSet54[ARTL_ART_simpleNote] = true;
    ARTSet54[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTB_REAL] = true;
    ARTSet11[ARTL_ART_REAL] = true;
  }

  public void ARTSet98initialise() {
    ARTSet98 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet98, 0, artSetExtent, false);
    ARTSet98[ARTTS_print] = true;
  }

  public void ARTSet87initialise() {
    ARTSet87 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet87, 0, artSetExtent, false);
    ARTSet87[ARTTS_Gb] = true;
  }

  public void ARTSet106initialise() {
    ARTSet106 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet106, 0, artSetExtent, false);
    ARTSet106[ARTTS__LBRACK] = true;
    ARTSet106[ARTL_ART_chord] = true;
  }

  public void ARTSet75initialise() {
    ARTSet75 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet75, 0, artSetExtent, false);
    ARTSet75[ARTTS_A_HASH] = true;
  }

  public void ARTSet102initialise() {
    ARTSet102 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet102, 0, artSetExtent, false);
    ARTSet102[ARTTB_ID] = true;
    ARTSet102[ARTTS__PERIOD] = true;
    ARTSet102[ARTTS__PERIOD_PERIOD] = true;
    ARTSet102[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet102[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet102[ARTTS_A] = true;
    ARTSet102[ARTTS_A_HASH] = true;
    ARTSet102[ARTTS_Ab] = true;
    ARTSet102[ARTTS_B] = true;
    ARTSet102[ARTTS_Bb] = true;
    ARTSet102[ARTTS_C] = true;
    ARTSet102[ARTTS_C_HASH] = true;
    ARTSet102[ARTTS_D] = true;
    ARTSet102[ARTTS_D_HASH] = true;
    ARTSet102[ARTTS_Db] = true;
    ARTSet102[ARTTS_E] = true;
    ARTSet102[ARTTS_Eb] = true;
    ARTSet102[ARTTS_F] = true;
    ARTSet102[ARTTS_F_HASH] = true;
    ARTSet102[ARTTS_G] = true;
    ARTSet102[ARTTS_G_HASH] = true;
    ARTSet102[ARTTS_Gb] = true;
    ARTSet102[ARTTS__LBRACK] = true;
    ARTSet102[ARTTS_bpm] = true;
    ARTSet102[ARTTS_defaultOctave] = true;
    ARTSet102[ARTTS_if] = true;
    ARTSet102[ARTTS_melody] = true;
    ARTSet102[ARTTS_play] = true;
    ARTSet102[ARTTS_print] = true;
    ARTSet102[ARTTS_while] = true;
    ARTSet102[ARTTS__LBRACE] = true;
    ARTSet102[ARTL_ART_ID] = true;
    ARTSet102[ARTL_ART_bpm] = true;
    ARTSet102[ARTL_ART_chord] = true;
    ARTSet102[ARTL_ART_defaultOctave] = true;
    ARTSet102[ARTL_ART_note] = true;
    ARTSet102[ARTL_ART_rest] = true;
    ARTSet102[ARTL_ART_simpleNote] = true;
    ARTSet102[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet102[ARTL_ART_statement] = true;
    ARTSet102[ARTL_ART_statements] = true;
  }

  public void ARTSet95initialise() {
    ARTSet95 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet95, 0, artSetExtent, false);
    ARTSet95[ARTTS_else] = true;
    ARTSet95[ARTL_ART_elseOpt] = true;
  }

  public void ARTSet100initialise() {
    ARTSet100 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet100, 0, artSetExtent, false);
    ARTSet100[ARTTS_play] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTB_INTEGER] = true;
    ARTSet14[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS_defaultOctave] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS__RPAR] = true;
    ARTSet26[ARTTS__COMMA] = true;
    ARTSet26[ARTTS__SEMICOLON] = true;
    ARTSet26[ARTTS_do] = true;
    ARTSet26[ARTTS_then] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[ARTTB_ID] = true;
    ARTSet53[ARTTS__PERIOD] = true;
    ARTSet53[ARTTS__PERIOD_PERIOD] = true;
    ARTSet53[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet53[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet53[ARTTS_A] = true;
    ARTSet53[ARTTS_A_HASH] = true;
    ARTSet53[ARTTS_Ab] = true;
    ARTSet53[ARTTS_B] = true;
    ARTSet53[ARTTS_Bb] = true;
    ARTSet53[ARTTS_C] = true;
    ARTSet53[ARTTS_C_HASH] = true;
    ARTSet53[ARTTS_D] = true;
    ARTSet53[ARTTS_D_HASH] = true;
    ARTSet53[ARTTS_Db] = true;
    ARTSet53[ARTTS_E] = true;
    ARTSet53[ARTTS_Eb] = true;
    ARTSet53[ARTTS_F] = true;
    ARTSet53[ARTTS_F_HASH] = true;
    ARTSet53[ARTTS_G] = true;
    ARTSet53[ARTTS_G_HASH] = true;
    ARTSet53[ARTTS_Gb] = true;
    ARTSet53[ARTTS__LBRACK] = true;
    ARTSet53[ARTTS_bpm] = true;
    ARTSet53[ARTTS_defaultOctave] = true;
    ARTSet53[ARTTS_if] = true;
    ARTSet53[ARTTS_melody] = true;
    ARTSet53[ARTTS_play] = true;
    ARTSet53[ARTTS_print] = true;
    ARTSet53[ARTTS_while] = true;
    ARTSet53[ARTTS__LBRACE] = true;
    ARTSet53[ARTL_ART_ID] = true;
    ARTSet53[ARTL_ART_bpm] = true;
    ARTSet53[ARTL_ART_chord] = true;
    ARTSet53[ARTL_ART_defaultOctave] = true;
    ARTSet53[ARTL_ART_note] = true;
    ARTSet53[ARTL_ART_rest] = true;
    ARTSet53[ARTL_ART_simpleNote] = true;
    ARTSet53[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet53[ARTL_ART_statement] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS_beatRatio] = true;
  }

  public void ARTSet93initialise() {
    ARTSet93 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet93, 0, artSetExtent, false);
    ARTSet93[ARTTS_if] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[ARTTS_else] = true;
  }

  public void ARTSet57initialise() {
    ARTSet57 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet57, 0, artSetExtent, false);
    ARTSet57[ARTTS__PLUS] = true;
    ARTSet57[ARTTS__MINUS] = true;
    ARTSet57[ARTL_ART_shifters] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTS__PERCENT] = true;
  }

  public void ARTSet49initialise() {
    ARTSet49 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet49, 0, artSetExtent, false);
    ARTSet49[ARTTS__LPAR] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[ARTTS__RPAR] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS__STAR] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTS__PLUS] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS_A] = true;
    ARTSet16[ARTTS_A_HASH] = true;
    ARTSet16[ARTTS_Ab] = true;
    ARTSet16[ARTTS_B] = true;
    ARTSet16[ARTTS_Bb] = true;
    ARTSet16[ARTTS_C] = true;
    ARTSet16[ARTTS_C_HASH] = true;
    ARTSet16[ARTTS_D] = true;
    ARTSet16[ARTTS_D_HASH] = true;
    ARTSet16[ARTTS_Db] = true;
    ARTSet16[ARTTS_E] = true;
    ARTSet16[ARTTS_Eb] = true;
    ARTSet16[ARTTS_F] = true;
    ARTSet16[ARTTS_F_HASH] = true;
    ARTSet16[ARTTS_G] = true;
    ARTSet16[ARTTS_G_HASH] = true;
    ARTSet16[ARTTS_Gb] = true;
    ARTSet16[ARTL_ART_note] = true;
    ARTSet16[ARTL_ART_notes] = true;
    ARTSet16[ARTL_ART_simpleNote] = true;
    ARTSet16[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet61initialise() {
    ARTSet61 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet61, 0, artSetExtent, false);
    ARTSet61[ARTTS__COMMA] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS__MINUS] = true;
  }

  public void ARTSet65initialise() {
    ARTSet65 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet65, 0, artSetExtent, false);
    ARTSet65[ARTTS__PERIOD] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTS__SLASH] = true;
  }

  public void ARTSet107initialise() {
    ARTSet107 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet107, 0, artSetExtent, false);
    ARTSet107[ARTTS__PERIOD] = true;
    ARTSet107[ARTTS__PERIOD_PERIOD] = true;
    ARTSet107[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet107[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet107[ARTL_ART_rest] = true;
  }

  public void ARTSet99initialise() {
    ARTSet99 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet99, 0, artSetExtent, false);
    ARTSet99[ARTTS_melody] = true;
  }

  public void ARTSet94initialise() {
    ARTSet94 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet94, 0, artSetExtent, false);
    ARTSet94[ARTTS_then] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[ARTTS_M] = true;
    ARTSet56[ARTTS_M7] = true;
    ARTSet56[ARTTS_m] = true;
    ARTSet56[ARTTS_m7] = true;
    ARTSet56[ARTL_ART_chordMode] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTX_EOS] = true;
    ARTSet13[ARTTB_ID] = true;
    ARTSet13[ARTTS__PERIOD] = true;
    ARTSet13[ARTTS__PERIOD_PERIOD] = true;
    ARTSet13[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet13[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet13[ARTTS_A] = true;
    ARTSet13[ARTTS_A_HASH] = true;
    ARTSet13[ARTTS_Ab] = true;
    ARTSet13[ARTTS_B] = true;
    ARTSet13[ARTTS_Bb] = true;
    ARTSet13[ARTTS_C] = true;
    ARTSet13[ARTTS_C_HASH] = true;
    ARTSet13[ARTTS_D] = true;
    ARTSet13[ARTTS_D_HASH] = true;
    ARTSet13[ARTTS_Db] = true;
    ARTSet13[ARTTS_E] = true;
    ARTSet13[ARTTS_Eb] = true;
    ARTSet13[ARTTS_F] = true;
    ARTSet13[ARTTS_F_HASH] = true;
    ARTSet13[ARTTS_G] = true;
    ARTSet13[ARTTS_G_HASH] = true;
    ARTSet13[ARTTS_Gb] = true;
    ARTSet13[ARTTS__LBRACK] = true;
    ARTSet13[ARTTS_bpm] = true;
    ARTSet13[ARTTS_defaultOctave] = true;
    ARTSet13[ARTTS_else] = true;
    ARTSet13[ARTTS_if] = true;
    ARTSet13[ARTTS_melody] = true;
    ARTSet13[ARTTS_play] = true;
    ARTSet13[ARTTS_print] = true;
    ARTSet13[ARTTS_while] = true;
    ARTSet13[ARTTS__LBRACE] = true;
    ARTSet13[ARTTS__RBRACE] = true;
    ARTSet13[ARTL_ART_ID] = true;
    ARTSet13[ARTL_ART_bpm] = true;
    ARTSet13[ARTL_ART_chord] = true;
    ARTSet13[ARTL_ART_defaultOctave] = true;
    ARTSet13[ARTL_ART_elseOpt] = true;
    ARTSet13[ARTL_ART_note] = true;
    ARTSet13[ARTL_ART_rest] = true;
    ARTSet13[ARTL_ART_simpleNote] = true;
    ARTSet13[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet13[ARTL_ART_statement] = true;
    ARTSet13[ARTL_ART_statements] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTB_ID] = true;
    ARTSet46[ARTTB_INTEGER] = true;
    ARTSet46[ARTTS__LPAR] = true;
    ARTSet46[ARTL_ART_ID] = true;
    ARTSet46[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet92initialise() {
    ARTSet92 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet92, 0, artSetExtent, false);
    ARTSet92[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS__LT] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet91initialise() {
    ARTSet91 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet91, 0, artSetExtent, false);
    ARTSet91[ARTTS__EQUAL] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS__GT] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS__STAR_STAR] = true;
  }

  public void ARTSet79initialise() {
    ARTSet79 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet79, 0, artSetExtent, false);
    ARTSet79[ARTTS_C_HASH] = true;
  }

  public void ARTSet73initialise() {
    ARTSet73 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet73, 0, artSetExtent, false);
    ARTSet73[ARTTS_Ab] = true;
  }

  public void ARTSet74initialise() {
    ARTSet74 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet74, 0, artSetExtent, false);
    ARTSet74[ARTTS_A] = true;
  }

  public void ARTSet77initialise() {
    ARTSet77 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet77, 0, artSetExtent, false);
    ARTSet77[ARTTS_B] = true;
  }

  public void ARTSet58initialise() {
    ARTSet58 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet58, 0, artSetExtent, false);
    ARTSet58[ARTTS_A] = true;
    ARTSet58[ARTTS_A_HASH] = true;
    ARTSet58[ARTTS_Ab] = true;
    ARTSet58[ARTTS_B] = true;
    ARTSet58[ARTTS_Bb] = true;
    ARTSet58[ARTTS_C] = true;
    ARTSet58[ARTTS_C_HASH] = true;
    ARTSet58[ARTTS_D] = true;
    ARTSet58[ARTTS_D_HASH] = true;
    ARTSet58[ARTTS_Db] = true;
    ARTSet58[ARTTS_E] = true;
    ARTSet58[ARTTS_Eb] = true;
    ARTSet58[ARTTS_F] = true;
    ARTSet58[ARTTS_F_HASH] = true;
    ARTSet58[ARTTS_G] = true;
    ARTSet58[ARTTS_G_HASH] = true;
    ARTSet58[ARTTS_Gb] = true;
    ARTSet58[ARTL_ART_note] = true;
    ARTSet58[ARTL_ART_simpleNote] = true;
    ARTSet58[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet78initialise() {
    ARTSet78 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet78, 0, artSetExtent, false);
    ARTSet78[ARTTS_C] = true;
  }

  public void ARTSet81initialise() {
    ARTSet81 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet81, 0, artSetExtent, false);
    ARTSet81[ARTTS_D] = true;
  }

  public void ARTSet84initialise() {
    ARTSet84 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet84, 0, artSetExtent, false);
    ARTSet84[ARTTS_E] = true;
  }

  public void ARTSet85initialise() {
    ARTSet85 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet85, 0, artSetExtent, false);
    ARTSet85[ARTTS_F] = true;
  }

  public void ARTSet88initialise() {
    ARTSet88 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet88, 0, artSetExtent, false);
    ARTSet88[ARTTS_G] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS_M] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTB_ID] = true;
    ARTSet43[ARTTB_INTEGER] = true;
    ARTSet43[ARTTS__LPAR] = true;
    ARTSet43[ARTL_ART_ID] = true;
    ARTSet43[ARTL_ART_INTEGER] = true;
    ARTSet43[ARTL_ART_e4] = true;
    ARTSet43[ARTL_ART_e5] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTS__LBRACK] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS__RBRACK] = true;
  }

  public void ARTSet64initialise() {
    ARTSet64 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet64, 0, artSetExtent, false);
    ARTSet64[ARTTS__PERIOD] = true;
    ARTSet64[ARTTS__PERIOD_PERIOD] = true;
    ARTSet64[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet64[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
  }

  public void ARTSet82initialise() {
    ARTSet82 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet82, 0, artSetExtent, false);
    ARTSet82[ARTTS_D_HASH] = true;
  }

  public void ARTSet76initialise() {
    ARTSet76 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet76, 0, artSetExtent, false);
    ARTSet76[ARTTS_Bb] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[ARTX_EOS] = true;
    ARTSet55[ARTTB_ID] = true;
    ARTSet55[ARTTS__PERIOD] = true;
    ARTSet55[ARTTS__PERIOD_PERIOD] = true;
    ARTSet55[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet55[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet55[ARTTS_A] = true;
    ARTSet55[ARTTS_A_HASH] = true;
    ARTSet55[ARTTS_Ab] = true;
    ARTSet55[ARTTS_B] = true;
    ARTSet55[ARTTS_Bb] = true;
    ARTSet55[ARTTS_C] = true;
    ARTSet55[ARTTS_C_HASH] = true;
    ARTSet55[ARTTS_D] = true;
    ARTSet55[ARTTS_D_HASH] = true;
    ARTSet55[ARTTS_Db] = true;
    ARTSet55[ARTTS_E] = true;
    ARTSet55[ARTTS_Eb] = true;
    ARTSet55[ARTTS_F] = true;
    ARTSet55[ARTTS_F_HASH] = true;
    ARTSet55[ARTTS_G] = true;
    ARTSet55[ARTTS_G_HASH] = true;
    ARTSet55[ARTTS_Gb] = true;
    ARTSet55[ARTTS_M] = true;
    ARTSet55[ARTTS_M7] = true;
    ARTSet55[ARTTS__LBRACK] = true;
    ARTSet55[ARTTS__RBRACK] = true;
    ARTSet55[ARTTS_bpm] = true;
    ARTSet55[ARTTS_defaultOctave] = true;
    ARTSet55[ARTTS_else] = true;
    ARTSet55[ARTTS_if] = true;
    ARTSet55[ARTTS_m] = true;
    ARTSet55[ARTTS_m7] = true;
    ARTSet55[ARTTS_melody] = true;
    ARTSet55[ARTTS_play] = true;
    ARTSet55[ARTTS_print] = true;
    ARTSet55[ARTTS_while] = true;
    ARTSet55[ARTTS__LBRACE] = true;
    ARTSet55[ARTTS__RBRACE] = true;
    ARTSet55[ARTL_ART_ID] = true;
    ARTSet55[ARTL_ART_bpm] = true;
    ARTSet55[ARTL_ART_chord] = true;
    ARTSet55[ARTL_ART_chordMode] = true;
    ARTSet55[ARTL_ART_defaultOctave] = true;
    ARTSet55[ARTL_ART_elseOpt] = true;
    ARTSet55[ARTL_ART_note] = true;
    ARTSet55[ARTL_ART_notes] = true;
    ARTSet55[ARTL_ART_rest] = true;
    ARTSet55[ARTL_ART_simpleNote] = true;
    ARTSet55[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet55[ARTL_ART_statement] = true;
    ARTSet55[ARTL_ART_statements] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS_m7] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS_m] = true;
  }

  public void ARTSet68initialise() {
    ARTSet68 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet68, 0, artSetExtent, false);
    ARTSet68[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
  }

  public void ARTSet67initialise() {
    ARTSet67 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet67, 0, artSetExtent, false);
    ARTSet67[ARTTS__PERIOD_PERIOD_PERIOD] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTB_ID] = true;
    ARTSet44[ARTTB_INTEGER] = true;
    ARTSet44[ARTTS__LPAR] = true;
    ARTSet44[ARTL_ART_ID] = true;
    ARTSet44[ARTL_ART_INTEGER] = true;
    ARTSet44[ARTL_ART_e5] = true;
  }

  public void ARTSet59initialise() {
    ARTSet59 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet59, 0, artSetExtent, false);
    ARTSet59[ARTTB_ID] = true;
    ARTSet59[ARTTB_INTEGER] = true;
    ARTSet59[ARTTB_STRING_DQ] = true;
    ARTSet59[ARTTS__LPAR] = true;
    ARTSet59[ARTTS__PLUS] = true;
    ARTSet59[ARTTS__MINUS] = true;
    ARTSet59[ARTL_ART_ID] = true;
    ARTSet59[ARTL_ART_INTEGER] = true;
    ARTSet59[ARTL_ART_STRING_DQ] = true;
    ARTSet59[ARTL_ART_e0] = true;
    ARTSet59[ARTL_ART_e1] = true;
    ARTSet59[ARTL_ART_e2] = true;
    ARTSet59[ARTL_ART_e3] = true;
    ARTSet59[ARTL_ART_e4] = true;
    ARTSet59[ARTL_ART_e5] = true;
  }

  public void ARTSet71initialise() {
    ARTSet71 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet71, 0, artSetExtent, false);
    ARTSet71[ARTX_EOS] = true;
    ARTSet71[ARTTB_ID] = true;
    ARTSet71[ARTTB_INTEGER] = true;
    ARTSet71[ARTTS__PLUS] = true;
    ARTSet71[ARTTS__MINUS] = true;
    ARTSet71[ARTTS__PERIOD] = true;
    ARTSet71[ARTTS__PERIOD_PERIOD] = true;
    ARTSet71[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet71[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet71[ARTTS_A] = true;
    ARTSet71[ARTTS_A_HASH] = true;
    ARTSet71[ARTTS_Ab] = true;
    ARTSet71[ARTTS_B] = true;
    ARTSet71[ARTTS_Bb] = true;
    ARTSet71[ARTTS_C] = true;
    ARTSet71[ARTTS_C_HASH] = true;
    ARTSet71[ARTTS_D] = true;
    ARTSet71[ARTTS_D_HASH] = true;
    ARTSet71[ARTTS_Db] = true;
    ARTSet71[ARTTS_E] = true;
    ARTSet71[ARTTS_Eb] = true;
    ARTSet71[ARTTS_F] = true;
    ARTSet71[ARTTS_F_HASH] = true;
    ARTSet71[ARTTS_G] = true;
    ARTSet71[ARTTS_G_HASH] = true;
    ARTSet71[ARTTS_Gb] = true;
    ARTSet71[ARTTS_M] = true;
    ARTSet71[ARTTS_M7] = true;
    ARTSet71[ARTTS__LBRACK] = true;
    ARTSet71[ARTTS__RBRACK] = true;
    ARTSet71[ARTTS_bpm] = true;
    ARTSet71[ARTTS_defaultOctave] = true;
    ARTSet71[ARTTS_else] = true;
    ARTSet71[ARTTS_if] = true;
    ARTSet71[ARTTS_m] = true;
    ARTSet71[ARTTS_m7] = true;
    ARTSet71[ARTTS_melody] = true;
    ARTSet71[ARTTS_play] = true;
    ARTSet71[ARTTS_print] = true;
    ARTSet71[ARTTS_while] = true;
    ARTSet71[ARTTS__LBRACE] = true;
    ARTSet71[ARTTS__RBRACE] = true;
    ARTSet71[ARTL_ART_ID] = true;
    ARTSet71[ARTL_ART_INTEGER] = true;
    ARTSet71[ARTL_ART_bpm] = true;
    ARTSet71[ARTL_ART_chord] = true;
    ARTSet71[ARTL_ART_chordMode] = true;
    ARTSet71[ARTL_ART_defaultOctave] = true;
    ARTSet71[ARTL_ART_elseOpt] = true;
    ARTSet71[ARTL_ART_note] = true;
    ARTSet71[ARTL_ART_notes] = true;
    ARTSet71[ARTL_ART_rest] = true;
    ARTSet71[ARTL_ART_shifters] = true;
    ARTSet71[ARTL_ART_simpleNote] = true;
    ARTSet71[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet71[ARTL_ART_statement] = true;
    ARTSet71[ARTL_ART_statements] = true;
  }

  public void ARTSet101initialise() {
    ARTSet101 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet101, 0, artSetExtent, false);
    ARTSet101[ARTTS__LBRACE] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTB_ID] = true;
    ARTSet25[ARTTB_INTEGER] = true;
    ARTSet25[ARTTS__LPAR] = true;
    ARTSet25[ARTTS__PLUS] = true;
    ARTSet25[ARTTS__MINUS] = true;
    ARTSet25[ARTL_ART_ID] = true;
    ARTSet25[ARTL_ART_INTEGER] = true;
    ARTSet25[ARTL_ART_e1] = true;
    ARTSet25[ARTL_ART_e2] = true;
    ARTSet25[ARTL_ART_e3] = true;
    ARTSet25[ARTL_ART_e4] = true;
    ARTSet25[ARTL_ART_e5] = true;
  }

  public void ARTSet103initialise() {
    ARTSet103 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet103, 0, artSetExtent, false);
    ARTSet103[ARTTS__RBRACE] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_REAL] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS__LT_EQUAL] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet70initialise();
    ARTSet23initialise();
    ARTSet62initialise();
    ARTSet97initialise();
    ARTSet72initialise();
    ARTSet96initialise();
    ARTSet47initialise();
    ARTSet86initialise();
    ARTSet80initialise();
    ARTSet31initialise();
    ARTSet38initialise();
    ARTSet42initialise();
    ARTSet34initialise();
    ARTSet104initialise();
    ARTSet89initialise();
    ARTSet83initialise();
    ARTSet29initialise();
    ARTSet66initialise();
    ARTSet108initialise();
    ARTSet51initialise();
    ARTSet33initialise();
    ARTSet48initialise();
    ARTSet3initialise();
    ARTSet60initialise();
    ARTSet9initialise();
    ARTSet69initialise();
    ARTSet37initialise();
    ARTSet63initialise();
    ARTSet105initialise();
    ARTSet18initialise();
    ARTSet2initialise();
    ARTSet12initialise();
    ARTSet19initialise();
    ARTSet90initialise();
    ARTSet6initialise();
    ARTSet54initialise();
    ARTSet8initialise();
    ARTSet11initialise();
    ARTSet98initialise();
    ARTSet87initialise();
    ARTSet106initialise();
    ARTSet75initialise();
    ARTSet102initialise();
    ARTSet95initialise();
    ARTSet100initialise();
    ARTSet14initialise();
    ARTSet24initialise();
    ARTSet26initialise();
    ARTSet53initialise();
    ARTSet10initialise();
    ARTSet93initialise();
    ARTSet52initialise();
    ARTSet57initialise();
    ARTSet41initialise();
    ARTSet49initialise();
    ARTSet50initialise();
    ARTSet39initialise();
    ARTSet35initialise();
    ARTSet16initialise();
    ARTSet61initialise();
    ARTSet36initialise();
    ARTSet65initialise();
    ARTSet40initialise();
    ARTSet107initialise();
    ARTSet99initialise();
    ARTSet94initialise();
    ARTSet56initialise();
    ARTSet13initialise();
    ARTSet46initialise();
    ARTSet92initialise();
    ARTSet28initialise();
    ARTSet32initialise();
    ARTSet91initialise();
    ARTSet4initialise();
    ARTSet27initialise();
    ARTSet45initialise();
    ARTSet79initialise();
    ARTSet73initialise();
    ARTSet74initialise();
    ARTSet77initialise();
    ARTSet58initialise();
    ARTSet78initialise();
    ARTSet81initialise();
    ARTSet84initialise();
    ARTSet85initialise();
    ARTSet88initialise();
    ARTSet22initialise();
    ARTSet43initialise();
    ARTSet15initialise();
    ARTSet17initialise();
    ARTSet64initialise();
    ARTSet82initialise();
    ARTSet76initialise();
    ARTSet5initialise();
    ARTSet55initialise();
    ARTSet21initialise();
    ARTSet20initialise();
    ARTSet68initialise();
    ARTSet67initialise();
    ARTSet44initialise();
    ARTSet59initialise();
    ARTSet71initialise();
    ARTSet101initialise();
    ARTSet25initialise();
    ARTSet103initialise();
    ARTSet7initialise();
    ARTSet30initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_566] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_566] = "";
    artlhsL[ARTL_ART_ID_566] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_566] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_566] = true;
    artLabelInternalStrings[ARTL_ART_ID_567] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_567] = "";
    artlhsL[ARTL_ART_ID_567] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_567] = true;
    artLabelInternalStrings[ARTL_ART_ID_568] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_568] = "";
    artlhsL[ARTL_ART_ID_568] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_568] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_568] = true;
    arteoR_pL[ARTL_ART_ID_568] = true;
    artPopD[ARTL_ART_ID_568] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_572] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_572] = "";
    artlhsL[ARTL_ART_INTEGER_572] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_572] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_572] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_573] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_573] = "";
    artlhsL[ARTL_ART_INTEGER_573] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_573] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_574] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_574] = "";
    artlhsL[ARTL_ART_INTEGER_574] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_574] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_574] = true;
    arteoR_pL[ARTL_ART_INTEGER_574] = true;
    artPopD[ARTL_ART_INTEGER_574] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_578] = "REAL ::= . &REAL  ";
    artLabelStrings[ARTL_ART_REAL_578] = "";
    artlhsL[ARTL_ART_REAL_578] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_578] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_578] = true;
    artLabelInternalStrings[ARTL_ART_REAL_579] = "REAL ::= &REAL  ";
    artLabelStrings[ARTL_ART_REAL_579] = "";
    artlhsL[ARTL_ART_REAL_579] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_579] = true;
    artLabelInternalStrings[ARTL_ART_REAL_580] = "REAL ::= &REAL  .";
    artLabelStrings[ARTL_ART_REAL_580] = "";
    artlhsL[ARTL_ART_REAL_580] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_580] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_580] = true;
    arteoR_pL[ARTL_ART_REAL_580] = true;
    artPopD[ARTL_ART_REAL_580] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_584] = "STRING_DQ ::= . &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_584] = "";
    artlhsL[ARTL_ART_STRING_DQ_584] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_584] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_584] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_585] = "STRING_DQ ::= &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_585] = "";
    artlhsL[ARTL_ART_STRING_DQ_585] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_585] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_586] = "STRING_DQ ::= &STRING_DQ  .";
    artLabelStrings[ARTL_ART_STRING_DQ_586] = "";
    artlhsL[ARTL_ART_STRING_DQ_586] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_586] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_586] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_586] = true;
    artPopD[ARTL_ART_STRING_DQ_586] = true;
  }

  public void artTableInitialiser_ART_beatRatio() {
    artLabelInternalStrings[ARTL_ART_beatRatio] = "beatRatio";
    artLabelStrings[ARTL_ART_beatRatio] = "beatRatio";
    artKindOfs[ARTL_ART_beatRatio] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_beatRatio_128] = "beatRatio ::= . 'beatRatio'  REAL ";
    artLabelStrings[ARTL_ART_beatRatio_128] = "";
    artlhsL[ARTL_ART_beatRatio_128] = ARTL_ART_beatRatio;
    artKindOfs[ARTL_ART_beatRatio_128] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_beatRatio_129] = "beatRatio ::= 'beatRatio'  REAL ";
    artLabelStrings[ARTL_ART_beatRatio_129] = "";
    artlhsL[ARTL_ART_beatRatio_129] = ARTL_ART_beatRatio;
    artLabelInternalStrings[ARTL_ART_beatRatio_130] = "beatRatio ::= 'beatRatio'  . REAL ";
    artLabelStrings[ARTL_ART_beatRatio_130] = "";
    artlhsL[ARTL_ART_beatRatio_130] = ARTL_ART_beatRatio;
    artKindOfs[ARTL_ART_beatRatio_130] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_beatRatio_130] = true;
    artLabelInternalStrings[ARTL_ART_beatRatio_132] = "beatRatio ::= 'beatRatio'  REAL .";
    artLabelStrings[ARTL_ART_beatRatio_132] = "";
    artlhsL[ARTL_ART_beatRatio_132] = ARTL_ART_beatRatio;
    artSlotInstanceOfs[ARTL_ART_beatRatio_132] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_beatRatio_132] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_beatRatio_132] = true;
    arteoR_pL[ARTL_ART_beatRatio_132] = true;
    artPopD[ARTL_ART_beatRatio_132] = true;
  }

  public void artTableInitialiser_ART_bpm() {
    artLabelInternalStrings[ARTL_ART_bpm] = "bpm";
    artLabelStrings[ARTL_ART_bpm] = "bpm";
    artKindOfs[ARTL_ART_bpm] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_bpm_120] = "bpm ::= . 'bpm'  INTEGER ";
    artLabelStrings[ARTL_ART_bpm_120] = "";
    artlhsL[ARTL_ART_bpm_120] = ARTL_ART_bpm;
    artKindOfs[ARTL_ART_bpm_120] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_bpm_121] = "bpm ::= 'bpm'  INTEGER ";
    artLabelStrings[ARTL_ART_bpm_121] = "";
    artlhsL[ARTL_ART_bpm_121] = ARTL_ART_bpm;
    artLabelInternalStrings[ARTL_ART_bpm_122] = "bpm ::= 'bpm'  . INTEGER ";
    artLabelStrings[ARTL_ART_bpm_122] = "";
    artlhsL[ARTL_ART_bpm_122] = ARTL_ART_bpm;
    artKindOfs[ARTL_ART_bpm_122] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_bpm_122] = true;
    artLabelInternalStrings[ARTL_ART_bpm_124] = "bpm ::= 'bpm'  INTEGER .";
    artLabelStrings[ARTL_ART_bpm_124] = "";
    artlhsL[ARTL_ART_bpm_124] = ARTL_ART_bpm;
    artSlotInstanceOfs[ARTL_ART_bpm_124] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_bpm_124] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_bpm_124] = true;
    arteoR_pL[ARTL_ART_bpm_124] = true;
    artPopD[ARTL_ART_bpm_124] = true;
  }

  public void artTableInitialiser_ART_chord() {
    artLabelInternalStrings[ARTL_ART_chord] = "chord";
    artLabelStrings[ARTL_ART_chord] = "chord";
    artKindOfs[ARTL_ART_chord] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_chord_304] = "chord ::= . '['  notes ']'  ";
    artLabelStrings[ARTL_ART_chord_304] = "";
    artlhsL[ARTL_ART_chord_304] = ARTL_ART_chord;
    artKindOfs[ARTL_ART_chord_304] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_chord_305] = "chord ::= '['  notes ']'  ";
    artLabelStrings[ARTL_ART_chord_305] = "";
    artlhsL[ARTL_ART_chord_305] = ARTL_ART_chord;
    artLabelInternalStrings[ARTL_ART_chord_306] = "chord ::= '['  . notes ']'  ";
    artLabelStrings[ARTL_ART_chord_306] = "";
    artlhsL[ARTL_ART_chord_306] = ARTL_ART_chord;
    artKindOfs[ARTL_ART_chord_306] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_chord_306] = true;
    artLabelInternalStrings[ARTL_ART_chord_308] = "chord ::= '['  notes . ']'  ";
    artLabelStrings[ARTL_ART_chord_308] = "";
    artlhsL[ARTL_ART_chord_308] = ARTL_ART_chord;
    artSlotInstanceOfs[ARTL_ART_chord_308] = ARTL_ART_notes;
    artKindOfs[ARTL_ART_chord_308] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chord_308] = true;
    artLabelInternalStrings[ARTL_ART_chord_309] = "chord ::= '['  notes ']'  ";
    artLabelStrings[ARTL_ART_chord_309] = "";
    artlhsL[ARTL_ART_chord_309] = ARTL_ART_chord;
    artPopD[ARTL_ART_chord_309] = true;
    artLabelInternalStrings[ARTL_ART_chord_310] = "chord ::= '['  notes ']'  .";
    artLabelStrings[ARTL_ART_chord_310] = "";
    artlhsL[ARTL_ART_chord_310] = ARTL_ART_chord;
    artKindOfs[ARTL_ART_chord_310] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chord_310] = true;
    arteoR_pL[ARTL_ART_chord_310] = true;
    artPopD[ARTL_ART_chord_310] = true;
  }

  public void artTableInitialiser_ART_chordMode() {
    artLabelInternalStrings[ARTL_ART_chordMode] = "chordMode";
    artLabelStrings[ARTL_ART_chordMode] = "chordMode";
    artKindOfs[ARTL_ART_chordMode] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_chordMode_172] = "chordMode ::= . # ";
    artLabelStrings[ARTL_ART_chordMode_172] = "";
    artlhsL[ARTL_ART_chordMode_172] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_172] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_172] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_174] = "chordMode ::= # .";
    artLabelStrings[ARTL_ART_chordMode_174] = "";
    artlhsL[ARTL_ART_chordMode_174] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_174] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_174] = true;
    arteoR_pL[ARTL_ART_chordMode_174] = true;
    artPopD[ARTL_ART_chordMode_174] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_178] = "chordMode ::= . 'm'  ";
    artLabelStrings[ARTL_ART_chordMode_178] = "";
    artlhsL[ARTL_ART_chordMode_178] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_178] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_178] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_179] = "chordMode ::= 'm'  ";
    artLabelStrings[ARTL_ART_chordMode_179] = "";
    artlhsL[ARTL_ART_chordMode_179] = ARTL_ART_chordMode;
    artPopD[ARTL_ART_chordMode_179] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_180] = "chordMode ::= 'm'  .";
    artLabelStrings[ARTL_ART_chordMode_180] = "";
    artlhsL[ARTL_ART_chordMode_180] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_180] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_180] = true;
    arteoR_pL[ARTL_ART_chordMode_180] = true;
    artPopD[ARTL_ART_chordMode_180] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_184] = "chordMode ::= . 'm7'  ";
    artLabelStrings[ARTL_ART_chordMode_184] = "";
    artlhsL[ARTL_ART_chordMode_184] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_184] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_184] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_185] = "chordMode ::= 'm7'  ";
    artLabelStrings[ARTL_ART_chordMode_185] = "";
    artlhsL[ARTL_ART_chordMode_185] = ARTL_ART_chordMode;
    artPopD[ARTL_ART_chordMode_185] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_186] = "chordMode ::= 'm7'  .";
    artLabelStrings[ARTL_ART_chordMode_186] = "";
    artlhsL[ARTL_ART_chordMode_186] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_186] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_186] = true;
    arteoR_pL[ARTL_ART_chordMode_186] = true;
    artPopD[ARTL_ART_chordMode_186] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_190] = "chordMode ::= . 'M'  ";
    artLabelStrings[ARTL_ART_chordMode_190] = "";
    artlhsL[ARTL_ART_chordMode_190] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_190] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_190] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_191] = "chordMode ::= 'M'  ";
    artLabelStrings[ARTL_ART_chordMode_191] = "";
    artlhsL[ARTL_ART_chordMode_191] = ARTL_ART_chordMode;
    artPopD[ARTL_ART_chordMode_191] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_192] = "chordMode ::= 'M'  .";
    artLabelStrings[ARTL_ART_chordMode_192] = "";
    artlhsL[ARTL_ART_chordMode_192] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_192] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_192] = true;
    arteoR_pL[ARTL_ART_chordMode_192] = true;
    artPopD[ARTL_ART_chordMode_192] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_196] = "chordMode ::= . 'M7'  ";
    artLabelStrings[ARTL_ART_chordMode_196] = "";
    artlhsL[ARTL_ART_chordMode_196] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_196] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_196] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_197] = "chordMode ::= 'M7'  ";
    artLabelStrings[ARTL_ART_chordMode_197] = "";
    artlhsL[ARTL_ART_chordMode_197] = ARTL_ART_chordMode;
    artPopD[ARTL_ART_chordMode_197] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_198] = "chordMode ::= 'M7'  .";
    artLabelStrings[ARTL_ART_chordMode_198] = "";
    artlhsL[ARTL_ART_chordMode_198] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_198] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_198] = true;
    arteoR_pL[ARTL_ART_chordMode_198] = true;
    artPopD[ARTL_ART_chordMode_198] = true;
  }

  public void artTableInitialiser_ART_defaultOctave() {
    artLabelInternalStrings[ARTL_ART_defaultOctave] = "defaultOctave";
    artLabelStrings[ARTL_ART_defaultOctave] = "defaultOctave";
    artKindOfs[ARTL_ART_defaultOctave] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_defaultOctave_136] = "defaultOctave ::= . 'defaultOctave'  INTEGER ";
    artLabelStrings[ARTL_ART_defaultOctave_136] = "";
    artlhsL[ARTL_ART_defaultOctave_136] = ARTL_ART_defaultOctave;
    artKindOfs[ARTL_ART_defaultOctave_136] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_defaultOctave_137] = "defaultOctave ::= 'defaultOctave'  INTEGER ";
    artLabelStrings[ARTL_ART_defaultOctave_137] = "";
    artlhsL[ARTL_ART_defaultOctave_137] = ARTL_ART_defaultOctave;
    artLabelInternalStrings[ARTL_ART_defaultOctave_138] = "defaultOctave ::= 'defaultOctave'  . INTEGER ";
    artLabelStrings[ARTL_ART_defaultOctave_138] = "";
    artlhsL[ARTL_ART_defaultOctave_138] = ARTL_ART_defaultOctave;
    artKindOfs[ARTL_ART_defaultOctave_138] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_defaultOctave_138] = true;
    artLabelInternalStrings[ARTL_ART_defaultOctave_140] = "defaultOctave ::= 'defaultOctave'  INTEGER .";
    artLabelStrings[ARTL_ART_defaultOctave_140] = "";
    artlhsL[ARTL_ART_defaultOctave_140] = ARTL_ART_defaultOctave;
    artSlotInstanceOfs[ARTL_ART_defaultOctave_140] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_defaultOctave_140] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_defaultOctave_140] = true;
    arteoR_pL[ARTL_ART_defaultOctave_140] = true;
    artPopD[ARTL_ART_defaultOctave_140] = true;
  }

  public void artTableInitialiser_ART_e0() {
    artLabelInternalStrings[ARTL_ART_e0] = "e0";
    artLabelStrings[ARTL_ART_e0] = "e0";
    artKindOfs[ARTL_ART_e0] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e0_378] = "e0 ::= . e1 ";
    artLabelStrings[ARTL_ART_e0_378] = "";
    artlhsL[ARTL_ART_e0_378] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_378] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_380] = "e0 ::= e1 .";
    artLabelStrings[ARTL_ART_e0_380] = "";
    artlhsL[ARTL_ART_e0_380] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_380] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_380] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_380] = true;
    arteoR_pL[ARTL_ART_e0_380] = true;
    artPopD[ARTL_ART_e0_380] = true;
    artLabelInternalStrings[ARTL_ART_e0_384] = "e0 ::= . e1 '>'  e1 ";
    artLabelStrings[ARTL_ART_e0_384] = "";
    artlhsL[ARTL_ART_e0_384] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_384] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_386] = "e0 ::= e1 . '>'  e1 ";
    artLabelStrings[ARTL_ART_e0_386] = "";
    artlhsL[ARTL_ART_e0_386] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_386] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_386] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_386] = true;
    artLabelInternalStrings[ARTL_ART_e0_387] = "e0 ::= e1 '>'  e1 ";
    artLabelStrings[ARTL_ART_e0_387] = "";
    artlhsL[ARTL_ART_e0_387] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_388] = "e0 ::= e1 '>'  . e1 ";
    artLabelStrings[ARTL_ART_e0_388] = "";
    artlhsL[ARTL_ART_e0_388] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_388] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_390] = "e0 ::= e1 '>'  e1 .";
    artLabelStrings[ARTL_ART_e0_390] = "";
    artlhsL[ARTL_ART_e0_390] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_390] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_390] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_390] = true;
    arteoR_pL[ARTL_ART_e0_390] = true;
    artPopD[ARTL_ART_e0_390] = true;
    artLabelInternalStrings[ARTL_ART_e0_394] = "e0 ::= . e1 '<'  e1 ";
    artLabelStrings[ARTL_ART_e0_394] = "";
    artlhsL[ARTL_ART_e0_394] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_394] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_396] = "e0 ::= e1 . '<'  e1 ";
    artLabelStrings[ARTL_ART_e0_396] = "";
    artlhsL[ARTL_ART_e0_396] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_396] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_396] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_396] = true;
    artLabelInternalStrings[ARTL_ART_e0_397] = "e0 ::= e1 '<'  e1 ";
    artLabelStrings[ARTL_ART_e0_397] = "";
    artlhsL[ARTL_ART_e0_397] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_398] = "e0 ::= e1 '<'  . e1 ";
    artLabelStrings[ARTL_ART_e0_398] = "";
    artlhsL[ARTL_ART_e0_398] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_398] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_400] = "e0 ::= e1 '<'  e1 .";
    artLabelStrings[ARTL_ART_e0_400] = "";
    artlhsL[ARTL_ART_e0_400] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_400] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_400] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_400] = true;
    arteoR_pL[ARTL_ART_e0_400] = true;
    artPopD[ARTL_ART_e0_400] = true;
    artLabelInternalStrings[ARTL_ART_e0_404] = "e0 ::= . e1 '>='  e1 ";
    artLabelStrings[ARTL_ART_e0_404] = "";
    artlhsL[ARTL_ART_e0_404] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_404] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_406] = "e0 ::= e1 . '>='  e1 ";
    artLabelStrings[ARTL_ART_e0_406] = "";
    artlhsL[ARTL_ART_e0_406] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_406] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_406] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_406] = true;
    artLabelInternalStrings[ARTL_ART_e0_407] = "e0 ::= e1 '>='  e1 ";
    artLabelStrings[ARTL_ART_e0_407] = "";
    artlhsL[ARTL_ART_e0_407] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_408] = "e0 ::= e1 '>='  . e1 ";
    artLabelStrings[ARTL_ART_e0_408] = "";
    artlhsL[ARTL_ART_e0_408] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_408] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_410] = "e0 ::= e1 '>='  e1 .";
    artLabelStrings[ARTL_ART_e0_410] = "";
    artlhsL[ARTL_ART_e0_410] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_410] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_410] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_410] = true;
    arteoR_pL[ARTL_ART_e0_410] = true;
    artPopD[ARTL_ART_e0_410] = true;
    artLabelInternalStrings[ARTL_ART_e0_414] = "e0 ::= . e1 '<='  e1 ";
    artLabelStrings[ARTL_ART_e0_414] = "";
    artlhsL[ARTL_ART_e0_414] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_414] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_416] = "e0 ::= e1 . '<='  e1 ";
    artLabelStrings[ARTL_ART_e0_416] = "";
    artlhsL[ARTL_ART_e0_416] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_416] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_416] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_416] = true;
    artLabelInternalStrings[ARTL_ART_e0_417] = "e0 ::= e1 '<='  e1 ";
    artLabelStrings[ARTL_ART_e0_417] = "";
    artlhsL[ARTL_ART_e0_417] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_418] = "e0 ::= e1 '<='  . e1 ";
    artLabelStrings[ARTL_ART_e0_418] = "";
    artlhsL[ARTL_ART_e0_418] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_418] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_420] = "e0 ::= e1 '<='  e1 .";
    artLabelStrings[ARTL_ART_e0_420] = "";
    artlhsL[ARTL_ART_e0_420] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_420] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_420] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_420] = true;
    arteoR_pL[ARTL_ART_e0_420] = true;
    artPopD[ARTL_ART_e0_420] = true;
    artLabelInternalStrings[ARTL_ART_e0_424] = "e0 ::= . e1 '=='  e1 ";
    artLabelStrings[ARTL_ART_e0_424] = "";
    artlhsL[ARTL_ART_e0_424] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_424] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_426] = "e0 ::= e1 . '=='  e1 ";
    artLabelStrings[ARTL_ART_e0_426] = "";
    artlhsL[ARTL_ART_e0_426] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_426] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_426] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_426] = true;
    artLabelInternalStrings[ARTL_ART_e0_427] = "e0 ::= e1 '=='  e1 ";
    artLabelStrings[ARTL_ART_e0_427] = "";
    artlhsL[ARTL_ART_e0_427] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_428] = "e0 ::= e1 '=='  . e1 ";
    artLabelStrings[ARTL_ART_e0_428] = "";
    artlhsL[ARTL_ART_e0_428] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_428] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_430] = "e0 ::= e1 '=='  e1 .";
    artLabelStrings[ARTL_ART_e0_430] = "";
    artlhsL[ARTL_ART_e0_430] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_430] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_430] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_430] = true;
    arteoR_pL[ARTL_ART_e0_430] = true;
    artPopD[ARTL_ART_e0_430] = true;
    artLabelInternalStrings[ARTL_ART_e0_434] = "e0 ::= . e1 '!='  e1 ";
    artLabelStrings[ARTL_ART_e0_434] = "";
    artlhsL[ARTL_ART_e0_434] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_434] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_436] = "e0 ::= e1 . '!='  e1 ";
    artLabelStrings[ARTL_ART_e0_436] = "";
    artlhsL[ARTL_ART_e0_436] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_436] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_436] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_436] = true;
    artLabelInternalStrings[ARTL_ART_e0_437] = "e0 ::= e1 '!='  e1 ";
    artLabelStrings[ARTL_ART_e0_437] = "";
    artlhsL[ARTL_ART_e0_437] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_438] = "e0 ::= e1 '!='  . e1 ";
    artLabelStrings[ARTL_ART_e0_438] = "";
    artlhsL[ARTL_ART_e0_438] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_438] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_440] = "e0 ::= e1 '!='  e1 .";
    artLabelStrings[ARTL_ART_e0_440] = "";
    artlhsL[ARTL_ART_e0_440] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_440] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_440] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_440] = true;
    arteoR_pL[ARTL_ART_e0_440] = true;
    artPopD[ARTL_ART_e0_440] = true;
  }

  public void artTableInitialiser_ART_e1() {
    artLabelInternalStrings[ARTL_ART_e1] = "e1";
    artLabelStrings[ARTL_ART_e1] = "e1";
    artKindOfs[ARTL_ART_e1] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e1_444] = "e1 ::= . e2 ";
    artLabelStrings[ARTL_ART_e1_444] = "";
    artlhsL[ARTL_ART_e1_444] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_444] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_446] = "e1 ::= e2 .";
    artLabelStrings[ARTL_ART_e1_446] = "";
    artlhsL[ARTL_ART_e1_446] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_446] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_446] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_446] = true;
    arteoR_pL[ARTL_ART_e1_446] = true;
    artPopD[ARTL_ART_e1_446] = true;
    artLabelInternalStrings[ARTL_ART_e1_450] = "e1 ::= . e1 '+'  e2 ";
    artLabelStrings[ARTL_ART_e1_450] = "";
    artlhsL[ARTL_ART_e1_450] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_450] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_452] = "e1 ::= e1 . '+'  e2 ";
    artLabelStrings[ARTL_ART_e1_452] = "";
    artlhsL[ARTL_ART_e1_452] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_452] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_452] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e1_452] = true;
    artLabelInternalStrings[ARTL_ART_e1_453] = "e1 ::= e1 '+'  e2 ";
    artLabelStrings[ARTL_ART_e1_453] = "";
    artlhsL[ARTL_ART_e1_453] = ARTL_ART_e1;
    artLabelInternalStrings[ARTL_ART_e1_454] = "e1 ::= e1 '+'  . e2 ";
    artLabelStrings[ARTL_ART_e1_454] = "";
    artlhsL[ARTL_ART_e1_454] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_454] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_456] = "e1 ::= e1 '+'  e2 .";
    artLabelStrings[ARTL_ART_e1_456] = "";
    artlhsL[ARTL_ART_e1_456] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_456] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_456] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_456] = true;
    arteoR_pL[ARTL_ART_e1_456] = true;
    artPopD[ARTL_ART_e1_456] = true;
    artLabelInternalStrings[ARTL_ART_e1_460] = "e1 ::= . e1 '-'  e2 ";
    artLabelStrings[ARTL_ART_e1_460] = "";
    artlhsL[ARTL_ART_e1_460] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_460] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_462] = "e1 ::= e1 . '-'  e2 ";
    artLabelStrings[ARTL_ART_e1_462] = "";
    artlhsL[ARTL_ART_e1_462] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_462] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_462] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e1_462] = true;
    artLabelInternalStrings[ARTL_ART_e1_463] = "e1 ::= e1 '-'  e2 ";
    artLabelStrings[ARTL_ART_e1_463] = "";
    artlhsL[ARTL_ART_e1_463] = ARTL_ART_e1;
    artLabelInternalStrings[ARTL_ART_e1_464] = "e1 ::= e1 '-'  . e2 ";
    artLabelStrings[ARTL_ART_e1_464] = "";
    artlhsL[ARTL_ART_e1_464] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_464] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_466] = "e1 ::= e1 '-'  e2 .";
    artLabelStrings[ARTL_ART_e1_466] = "";
    artlhsL[ARTL_ART_e1_466] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_466] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_466] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_466] = true;
    arteoR_pL[ARTL_ART_e1_466] = true;
    artPopD[ARTL_ART_e1_466] = true;
  }

  public void artTableInitialiser_ART_e2() {
    artLabelInternalStrings[ARTL_ART_e2] = "e2";
    artLabelStrings[ARTL_ART_e2] = "e2";
    artKindOfs[ARTL_ART_e2] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e2_470] = "e2 ::= . e3 ";
    artLabelStrings[ARTL_ART_e2_470] = "";
    artlhsL[ARTL_ART_e2_470] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_470] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_472] = "e2 ::= e3 .";
    artLabelStrings[ARTL_ART_e2_472] = "";
    artlhsL[ARTL_ART_e2_472] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_472] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_472] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_472] = true;
    arteoR_pL[ARTL_ART_e2_472] = true;
    artPopD[ARTL_ART_e2_472] = true;
    artLabelInternalStrings[ARTL_ART_e2_476] = "e2 ::= . e2 '*'  e3 ";
    artLabelStrings[ARTL_ART_e2_476] = "";
    artlhsL[ARTL_ART_e2_476] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_476] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_478] = "e2 ::= e2 . '*'  e3 ";
    artLabelStrings[ARTL_ART_e2_478] = "";
    artlhsL[ARTL_ART_e2_478] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_478] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_478] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_478] = true;
    artLabelInternalStrings[ARTL_ART_e2_479] = "e2 ::= e2 '*'  e3 ";
    artLabelStrings[ARTL_ART_e2_479] = "";
    artlhsL[ARTL_ART_e2_479] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_480] = "e2 ::= e2 '*'  . e3 ";
    artLabelStrings[ARTL_ART_e2_480] = "";
    artlhsL[ARTL_ART_e2_480] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_480] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_482] = "e2 ::= e2 '*'  e3 .";
    artLabelStrings[ARTL_ART_e2_482] = "";
    artlhsL[ARTL_ART_e2_482] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_482] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_482] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_482] = true;
    arteoR_pL[ARTL_ART_e2_482] = true;
    artPopD[ARTL_ART_e2_482] = true;
    artLabelInternalStrings[ARTL_ART_e2_486] = "e2 ::= . e2 '/'  e3 ";
    artLabelStrings[ARTL_ART_e2_486] = "";
    artlhsL[ARTL_ART_e2_486] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_486] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_488] = "e2 ::= e2 . '/'  e3 ";
    artLabelStrings[ARTL_ART_e2_488] = "";
    artlhsL[ARTL_ART_e2_488] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_488] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_488] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_488] = true;
    artLabelInternalStrings[ARTL_ART_e2_489] = "e2 ::= e2 '/'  e3 ";
    artLabelStrings[ARTL_ART_e2_489] = "";
    artlhsL[ARTL_ART_e2_489] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_490] = "e2 ::= e2 '/'  . e3 ";
    artLabelStrings[ARTL_ART_e2_490] = "";
    artlhsL[ARTL_ART_e2_490] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_490] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_492] = "e2 ::= e2 '/'  e3 .";
    artLabelStrings[ARTL_ART_e2_492] = "";
    artlhsL[ARTL_ART_e2_492] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_492] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_492] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_492] = true;
    arteoR_pL[ARTL_ART_e2_492] = true;
    artPopD[ARTL_ART_e2_492] = true;
    artLabelInternalStrings[ARTL_ART_e2_496] = "e2 ::= . e2 '%'  e3 ";
    artLabelStrings[ARTL_ART_e2_496] = "";
    artlhsL[ARTL_ART_e2_496] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_496] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_498] = "e2 ::= e2 . '%'  e3 ";
    artLabelStrings[ARTL_ART_e2_498] = "";
    artlhsL[ARTL_ART_e2_498] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_498] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_498] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_498] = true;
    artLabelInternalStrings[ARTL_ART_e2_499] = "e2 ::= e2 '%'  e3 ";
    artLabelStrings[ARTL_ART_e2_499] = "";
    artlhsL[ARTL_ART_e2_499] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_500] = "e2 ::= e2 '%'  . e3 ";
    artLabelStrings[ARTL_ART_e2_500] = "";
    artlhsL[ARTL_ART_e2_500] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_500] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_502] = "e2 ::= e2 '%'  e3 .";
    artLabelStrings[ARTL_ART_e2_502] = "";
    artlhsL[ARTL_ART_e2_502] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_502] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_502] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_502] = true;
    arteoR_pL[ARTL_ART_e2_502] = true;
    artPopD[ARTL_ART_e2_502] = true;
  }

  public void artTableInitialiser_ART_e3() {
    artLabelInternalStrings[ARTL_ART_e3] = "e3";
    artLabelStrings[ARTL_ART_e3] = "e3";
    artKindOfs[ARTL_ART_e3] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e3_506] = "e3 ::= . e4 ";
    artLabelStrings[ARTL_ART_e3_506] = "";
    artlhsL[ARTL_ART_e3_506] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_506] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_508] = "e3 ::= e4 .";
    artLabelStrings[ARTL_ART_e3_508] = "";
    artlhsL[ARTL_ART_e3_508] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_508] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e3_508] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_508] = true;
    arteoR_pL[ARTL_ART_e3_508] = true;
    artPopD[ARTL_ART_e3_508] = true;
    artLabelInternalStrings[ARTL_ART_e3_512] = "e3 ::= . '+'  e3 ";
    artLabelStrings[ARTL_ART_e3_512] = "";
    artlhsL[ARTL_ART_e3_512] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_512] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_513] = "e3 ::= '+'  e3 ";
    artLabelStrings[ARTL_ART_e3_513] = "";
    artlhsL[ARTL_ART_e3_513] = ARTL_ART_e3;
    artLabelInternalStrings[ARTL_ART_e3_514] = "e3 ::= '+'  . e3 ";
    artLabelStrings[ARTL_ART_e3_514] = "";
    artlhsL[ARTL_ART_e3_514] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_514] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e3_514] = true;
    artLabelInternalStrings[ARTL_ART_e3_516] = "e3 ::= '+'  e3 .";
    artLabelStrings[ARTL_ART_e3_516] = "";
    artlhsL[ARTL_ART_e3_516] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_516] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_516] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_516] = true;
    arteoR_pL[ARTL_ART_e3_516] = true;
    artPopD[ARTL_ART_e3_516] = true;
    artLabelInternalStrings[ARTL_ART_e3_520] = "e3 ::= . '-'  e3 ";
    artLabelStrings[ARTL_ART_e3_520] = "";
    artlhsL[ARTL_ART_e3_520] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_520] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_521] = "e3 ::= '-'  e3 ";
    artLabelStrings[ARTL_ART_e3_521] = "";
    artlhsL[ARTL_ART_e3_521] = ARTL_ART_e3;
    artLabelInternalStrings[ARTL_ART_e3_522] = "e3 ::= '-'  . e3 ";
    artLabelStrings[ARTL_ART_e3_522] = "";
    artlhsL[ARTL_ART_e3_522] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_522] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e3_522] = true;
    artLabelInternalStrings[ARTL_ART_e3_524] = "e3 ::= '-'  e3 .";
    artLabelStrings[ARTL_ART_e3_524] = "";
    artlhsL[ARTL_ART_e3_524] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_524] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_524] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_524] = true;
    arteoR_pL[ARTL_ART_e3_524] = true;
    artPopD[ARTL_ART_e3_524] = true;
  }

  public void artTableInitialiser_ART_e4() {
    artLabelInternalStrings[ARTL_ART_e4] = "e4";
    artLabelStrings[ARTL_ART_e4] = "e4";
    artKindOfs[ARTL_ART_e4] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e4_528] = "e4 ::= . e5 ";
    artLabelStrings[ARTL_ART_e4_528] = "";
    artlhsL[ARTL_ART_e4_528] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_528] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_530] = "e4 ::= e5 .";
    artLabelStrings[ARTL_ART_e4_530] = "";
    artlhsL[ARTL_ART_e4_530] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_530] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e4_530] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e4_530] = true;
    arteoR_pL[ARTL_ART_e4_530] = true;
    artPopD[ARTL_ART_e4_530] = true;
    artLabelInternalStrings[ARTL_ART_e4_534] = "e4 ::= . e5 '**'  e4 ";
    artLabelStrings[ARTL_ART_e4_534] = "";
    artlhsL[ARTL_ART_e4_534] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_534] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_536] = "e4 ::= e5 . '**'  e4 ";
    artLabelStrings[ARTL_ART_e4_536] = "";
    artlhsL[ARTL_ART_e4_536] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_536] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e4_536] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e4_536] = true;
    artLabelInternalStrings[ARTL_ART_e4_537] = "e4 ::= e5 '**'  e4 ";
    artLabelStrings[ARTL_ART_e4_537] = "";
    artlhsL[ARTL_ART_e4_537] = ARTL_ART_e4;
    artLabelInternalStrings[ARTL_ART_e4_538] = "e4 ::= e5 '**'  . e4 ";
    artLabelStrings[ARTL_ART_e4_538] = "";
    artlhsL[ARTL_ART_e4_538] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_538] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_540] = "e4 ::= e5 '**'  e4 .";
    artLabelStrings[ARTL_ART_e4_540] = "";
    artlhsL[ARTL_ART_e4_540] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_540] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_540] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e4_540] = true;
    arteoR_pL[ARTL_ART_e4_540] = true;
    artPopD[ARTL_ART_e4_540] = true;
  }

  public void artTableInitialiser_ART_e5() {
    artLabelInternalStrings[ARTL_ART_e5] = "e5";
    artLabelStrings[ARTL_ART_e5] = "e5";
    artKindOfs[ARTL_ART_e5] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e5_544] = "e5 ::= . INTEGER ";
    artLabelStrings[ARTL_ART_e5_544] = "";
    artlhsL[ARTL_ART_e5_544] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_544] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e5_546] = "e5 ::= INTEGER .";
    artLabelStrings[ARTL_ART_e5_546] = "";
    artlhsL[ARTL_ART_e5_546] = ARTL_ART_e5;
    artSlotInstanceOfs[ARTL_ART_e5_546] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_e5_546] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e5_546] = true;
    arteoR_pL[ARTL_ART_e5_546] = true;
    artPopD[ARTL_ART_e5_546] = true;
    artLabelInternalStrings[ARTL_ART_e5_550] = "e5 ::= . ID ";
    artLabelStrings[ARTL_ART_e5_550] = "";
    artlhsL[ARTL_ART_e5_550] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_550] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e5_552] = "e5 ::= ID .";
    artLabelStrings[ARTL_ART_e5_552] = "";
    artlhsL[ARTL_ART_e5_552] = ARTL_ART_e5;
    artSlotInstanceOfs[ARTL_ART_e5_552] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_e5_552] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e5_552] = true;
    arteoR_pL[ARTL_ART_e5_552] = true;
    artPopD[ARTL_ART_e5_552] = true;
    artLabelInternalStrings[ARTL_ART_e5_556] = "e5 ::= . '('  e1 ')'  ";
    artLabelStrings[ARTL_ART_e5_556] = "";
    artlhsL[ARTL_ART_e5_556] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_556] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e5_557] = "e5 ::= '('  e1 ')'  ";
    artLabelStrings[ARTL_ART_e5_557] = "";
    artlhsL[ARTL_ART_e5_557] = ARTL_ART_e5;
    artLabelInternalStrings[ARTL_ART_e5_558] = "e5 ::= '('  . e1 ')'  ";
    artLabelStrings[ARTL_ART_e5_558] = "";
    artlhsL[ARTL_ART_e5_558] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_558] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e5_558] = true;
    artLabelInternalStrings[ARTL_ART_e5_560] = "e5 ::= '('  e1 . ')'  ";
    artLabelStrings[ARTL_ART_e5_560] = "";
    artlhsL[ARTL_ART_e5_560] = ARTL_ART_e5;
    artSlotInstanceOfs[ARTL_ART_e5_560] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e5_560] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_e5_560] = true;
    artLabelInternalStrings[ARTL_ART_e5_563] = "e5 ::= '('  e1 ')'  ";
    artLabelStrings[ARTL_ART_e5_563] = "";
    artlhsL[ARTL_ART_e5_563] = ARTL_ART_e5;
    artPopD[ARTL_ART_e5_563] = true;
    artLabelInternalStrings[ARTL_ART_e5_564] = "e5 ::= '('  e1 ')'  .";
    artLabelStrings[ARTL_ART_e5_564] = "";
    artlhsL[ARTL_ART_e5_564] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_564] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e5_564] = true;
    arteoR_pL[ARTL_ART_e5_564] = true;
    artPopD[ARTL_ART_e5_564] = true;
  }

  public void artTableInitialiser_ART_elseOpt() {
    artLabelInternalStrings[ARTL_ART_elseOpt] = "elseOpt";
    artLabelStrings[ARTL_ART_elseOpt] = "elseOpt";
    artKindOfs[ARTL_ART_elseOpt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_elseOpt_110] = "elseOpt ::= . 'else'  statement ";
    artLabelStrings[ARTL_ART_elseOpt_110] = "";
    artlhsL[ARTL_ART_elseOpt_110] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_elseOpt_110] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_elseOpt_111] = "elseOpt ::= 'else'  statement ";
    artLabelStrings[ARTL_ART_elseOpt_111] = "";
    artlhsL[ARTL_ART_elseOpt_111] = ARTL_ART_elseOpt;
    artLabelInternalStrings[ARTL_ART_elseOpt_112] = "elseOpt ::= 'else'  . statement ";
    artLabelStrings[ARTL_ART_elseOpt_112] = "";
    artlhsL[ARTL_ART_elseOpt_112] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_elseOpt_112] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_elseOpt_112] = true;
    artLabelInternalStrings[ARTL_ART_elseOpt_114] = "elseOpt ::= 'else'  statement .";
    artLabelStrings[ARTL_ART_elseOpt_114] = "";
    artlhsL[ARTL_ART_elseOpt_114] = ARTL_ART_elseOpt;
    artSlotInstanceOfs[ARTL_ART_elseOpt_114] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_elseOpt_114] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_elseOpt_114] = true;
    arteoR_pL[ARTL_ART_elseOpt_114] = true;
    artPopD[ARTL_ART_elseOpt_114] = true;
    artLabelInternalStrings[ARTL_ART_elseOpt_116] = "elseOpt ::= . # ";
    artLabelStrings[ARTL_ART_elseOpt_116] = "";
    artlhsL[ARTL_ART_elseOpt_116] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_elseOpt_116] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_elseOpt_116] = true;
    artLabelInternalStrings[ARTL_ART_elseOpt_118] = "elseOpt ::= # .";
    artLabelStrings[ARTL_ART_elseOpt_118] = "";
    artlhsL[ARTL_ART_elseOpt_118] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_elseOpt_118] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_elseOpt_118] = true;
    arteoR_pL[ARTL_ART_elseOpt_118] = true;
    artPopD[ARTL_ART_elseOpt_118] = true;
  }

  public void artTableInitialiser_ART_note() {
    artLabelInternalStrings[ARTL_ART_note] = "note";
    artLabelStrings[ARTL_ART_note] = "note";
    artKindOfs[ARTL_ART_note] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_note_144] = "note ::= . simpleNote chordMode ";
    artLabelStrings[ARTL_ART_note_144] = "";
    artlhsL[ARTL_ART_note_144] = ARTL_ART_note;
    artKindOfs[ARTL_ART_note_144] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_146] = "note ::= simpleNote . chordMode ";
    artLabelStrings[ARTL_ART_note_146] = "";
    artlhsL[ARTL_ART_note_146] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_146] = ARTL_ART_simpleNote;
    artKindOfs[ARTL_ART_note_146] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_note_146] = true;
    artLabelInternalStrings[ARTL_ART_note_148] = "note ::= simpleNote chordMode .";
    artLabelStrings[ARTL_ART_note_148] = "";
    artlhsL[ARTL_ART_note_148] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_148] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_note_148] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_note_148] = true;
    arteoR_pL[ARTL_ART_note_148] = true;
    artPopD[ARTL_ART_note_148] = true;
    artLabelInternalStrings[ARTL_ART_note_152] = "note ::= . simpleNote shifters chordMode ";
    artLabelStrings[ARTL_ART_note_152] = "";
    artlhsL[ARTL_ART_note_152] = ARTL_ART_note;
    artKindOfs[ARTL_ART_note_152] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_154] = "note ::= simpleNote . shifters chordMode ";
    artLabelStrings[ARTL_ART_note_154] = "";
    artlhsL[ARTL_ART_note_154] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_154] = ARTL_ART_simpleNote;
    artKindOfs[ARTL_ART_note_154] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_note_154] = true;
    artLabelInternalStrings[ARTL_ART_note_156] = "note ::= simpleNote shifters . chordMode ";
    artLabelStrings[ARTL_ART_note_156] = "";
    artlhsL[ARTL_ART_note_156] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_156] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_note_156] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_158] = "note ::= simpleNote shifters chordMode .";
    artLabelStrings[ARTL_ART_note_158] = "";
    artlhsL[ARTL_ART_note_158] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_158] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_note_158] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_note_158] = true;
    arteoR_pL[ARTL_ART_note_158] = true;
    artPopD[ARTL_ART_note_158] = true;
    artLabelInternalStrings[ARTL_ART_note_162] = "note ::= . simpleNote INTEGER chordMode ";
    artLabelStrings[ARTL_ART_note_162] = "";
    artlhsL[ARTL_ART_note_162] = ARTL_ART_note;
    artKindOfs[ARTL_ART_note_162] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_164] = "note ::= simpleNote . INTEGER chordMode ";
    artLabelStrings[ARTL_ART_note_164] = "";
    artlhsL[ARTL_ART_note_164] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_164] = ARTL_ART_simpleNote;
    artKindOfs[ARTL_ART_note_164] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_note_164] = true;
    artLabelInternalStrings[ARTL_ART_note_166] = "note ::= simpleNote INTEGER . chordMode ";
    artLabelStrings[ARTL_ART_note_166] = "";
    artlhsL[ARTL_ART_note_166] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_166] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_note_166] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_168] = "note ::= simpleNote INTEGER chordMode .";
    artLabelStrings[ARTL_ART_note_168] = "";
    artlhsL[ARTL_ART_note_168] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_168] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_note_168] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_note_168] = true;
    arteoR_pL[ARTL_ART_note_168] = true;
    artPopD[ARTL_ART_note_168] = true;
  }

  public void artTableInitialiser_ART_notes() {
    artLabelInternalStrings[ARTL_ART_notes] = "notes";
    artLabelStrings[ARTL_ART_notes] = "notes";
    artKindOfs[ARTL_ART_notes] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_notes_312] = "notes ::= . note ";
    artLabelStrings[ARTL_ART_notes_312] = "";
    artlhsL[ARTL_ART_notes_312] = ARTL_ART_notes;
    artKindOfs[ARTL_ART_notes_312] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_notes_314] = "notes ::= note .";
    artLabelStrings[ARTL_ART_notes_314] = "";
    artlhsL[ARTL_ART_notes_314] = ARTL_ART_notes;
    artSlotInstanceOfs[ARTL_ART_notes_314] = ARTL_ART_note;
    artKindOfs[ARTL_ART_notes_314] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_notes_314] = true;
    arteoR_pL[ARTL_ART_notes_314] = true;
    artPopD[ARTL_ART_notes_314] = true;
    artLabelInternalStrings[ARTL_ART_notes_316] = "notes ::= . note notes ";
    artLabelStrings[ARTL_ART_notes_316] = "";
    artlhsL[ARTL_ART_notes_316] = ARTL_ART_notes;
    artKindOfs[ARTL_ART_notes_316] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_notes_318] = "notes ::= note . notes ";
    artLabelStrings[ARTL_ART_notes_318] = "";
    artlhsL[ARTL_ART_notes_318] = ARTL_ART_notes;
    artSlotInstanceOfs[ARTL_ART_notes_318] = ARTL_ART_note;
    artKindOfs[ARTL_ART_notes_318] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_notes_318] = true;
    artLabelInternalStrings[ARTL_ART_notes_320] = "notes ::= note notes .";
    artLabelStrings[ARTL_ART_notes_320] = "";
    artlhsL[ARTL_ART_notes_320] = ARTL_ART_notes;
    artSlotInstanceOfs[ARTL_ART_notes_320] = ARTL_ART_notes;
    artKindOfs[ARTL_ART_notes_320] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_notes_320] = true;
    arteoR_pL[ARTL_ART_notes_320] = true;
    artPopD[ARTL_ART_notes_320] = true;
  }

  public void artTableInitialiser_ART_printElements() {
    artLabelInternalStrings[ARTL_ART_printElements] = "printElements";
    artLabelStrings[ARTL_ART_printElements] = "printElements";
    artKindOfs[ARTL_ART_printElements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_printElements_346] = "printElements ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_printElements_346] = "";
    artlhsL[ARTL_ART_printElements_346] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_346] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_348] = "printElements ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_printElements_348] = "";
    artlhsL[ARTL_ART_printElements_348] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_348] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_printElements_348] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_348] = true;
    arteoR_pL[ARTL_ART_printElements_348] = true;
    artPopD[ARTL_ART_printElements_348] = true;
    artLabelInternalStrings[ARTL_ART_printElements_352] = "printElements ::= . STRING_DQ ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_352] = "";
    artlhsL[ARTL_ART_printElements_352] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_352] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_354] = "printElements ::= STRING_DQ . ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_354] = "";
    artlhsL[ARTL_ART_printElements_354] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_354] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_printElements_354] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printElements_354] = true;
    artLabelInternalStrings[ARTL_ART_printElements_357] = "printElements ::= STRING_DQ ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_357] = "";
    artlhsL[ARTL_ART_printElements_357] = ARTL_ART_printElements;
    artLabelInternalStrings[ARTL_ART_printElements_358] = "printElements ::= STRING_DQ ','  . printElements ";
    artLabelStrings[ARTL_ART_printElements_358] = "";
    artlhsL[ARTL_ART_printElements_358] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_358] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_360] = "printElements ::= STRING_DQ ','  printElements .";
    artLabelStrings[ARTL_ART_printElements_360] = "";
    artlhsL[ARTL_ART_printElements_360] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_360] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_360] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_360] = true;
    arteoR_pL[ARTL_ART_printElements_360] = true;
    artPopD[ARTL_ART_printElements_360] = true;
    artLabelInternalStrings[ARTL_ART_printElements_362] = "printElements ::= . e0 ";
    artLabelStrings[ARTL_ART_printElements_362] = "";
    artlhsL[ARTL_ART_printElements_362] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_362] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_364] = "printElements ::= e0 .";
    artLabelStrings[ARTL_ART_printElements_364] = "";
    artlhsL[ARTL_ART_printElements_364] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_364] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_printElements_364] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_364] = true;
    arteoR_pL[ARTL_ART_printElements_364] = true;
    artPopD[ARTL_ART_printElements_364] = true;
    artLabelInternalStrings[ARTL_ART_printElements_368] = "printElements ::= . e0 ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_368] = "";
    artlhsL[ARTL_ART_printElements_368] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_368] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_370] = "printElements ::= e0 . ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_370] = "";
    artlhsL[ARTL_ART_printElements_370] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_370] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_printElements_370] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printElements_370] = true;
    artLabelInternalStrings[ARTL_ART_printElements_373] = "printElements ::= e0 ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_373] = "";
    artlhsL[ARTL_ART_printElements_373] = ARTL_ART_printElements;
    artLabelInternalStrings[ARTL_ART_printElements_374] = "printElements ::= e0 ','  . printElements ";
    artLabelStrings[ARTL_ART_printElements_374] = "";
    artlhsL[ARTL_ART_printElements_374] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_374] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_376] = "printElements ::= e0 ','  printElements .";
    artLabelStrings[ARTL_ART_printElements_376] = "";
    artlhsL[ARTL_ART_printElements_376] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_376] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_376] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_376] = true;
    arteoR_pL[ARTL_ART_printElements_376] = true;
    artPopD[ARTL_ART_printElements_376] = true;
  }

  public void artTableInitialiser_ART_rest() {
    artLabelInternalStrings[ARTL_ART_rest] = "rest";
    artLabelStrings[ARTL_ART_rest] = "rest";
    artKindOfs[ARTL_ART_rest] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_rest_322] = "rest ::= . '.'  ";
    artLabelStrings[ARTL_ART_rest_322] = "";
    artlhsL[ARTL_ART_rest_322] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_322] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rest_322] = true;
    artLabelInternalStrings[ARTL_ART_rest_323] = "rest ::= '.'  ";
    artLabelStrings[ARTL_ART_rest_323] = "";
    artlhsL[ARTL_ART_rest_323] = ARTL_ART_rest;
    artPopD[ARTL_ART_rest_323] = true;
    artLabelInternalStrings[ARTL_ART_rest_324] = "rest ::= '.'  .";
    artLabelStrings[ARTL_ART_rest_324] = "";
    artlhsL[ARTL_ART_rest_324] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_324] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rest_324] = true;
    arteoR_pL[ARTL_ART_rest_324] = true;
    artPopD[ARTL_ART_rest_324] = true;
    artLabelInternalStrings[ARTL_ART_rest_328] = "rest ::= . '..'  ";
    artLabelStrings[ARTL_ART_rest_328] = "";
    artlhsL[ARTL_ART_rest_328] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_328] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rest_328] = true;
    artLabelInternalStrings[ARTL_ART_rest_329] = "rest ::= '..'  ";
    artLabelStrings[ARTL_ART_rest_329] = "";
    artlhsL[ARTL_ART_rest_329] = ARTL_ART_rest;
    artPopD[ARTL_ART_rest_329] = true;
    artLabelInternalStrings[ARTL_ART_rest_330] = "rest ::= '..'  .";
    artLabelStrings[ARTL_ART_rest_330] = "";
    artlhsL[ARTL_ART_rest_330] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_330] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rest_330] = true;
    arteoR_pL[ARTL_ART_rest_330] = true;
    artPopD[ARTL_ART_rest_330] = true;
    artLabelInternalStrings[ARTL_ART_rest_334] = "rest ::= . '...'  ";
    artLabelStrings[ARTL_ART_rest_334] = "";
    artlhsL[ARTL_ART_rest_334] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_334] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rest_334] = true;
    artLabelInternalStrings[ARTL_ART_rest_335] = "rest ::= '...'  ";
    artLabelStrings[ARTL_ART_rest_335] = "";
    artlhsL[ARTL_ART_rest_335] = ARTL_ART_rest;
    artPopD[ARTL_ART_rest_335] = true;
    artLabelInternalStrings[ARTL_ART_rest_336] = "rest ::= '...'  .";
    artLabelStrings[ARTL_ART_rest_336] = "";
    artlhsL[ARTL_ART_rest_336] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_336] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rest_336] = true;
    arteoR_pL[ARTL_ART_rest_336] = true;
    artPopD[ARTL_ART_rest_336] = true;
    artLabelInternalStrings[ARTL_ART_rest_340] = "rest ::= . '....'  ";
    artLabelStrings[ARTL_ART_rest_340] = "";
    artlhsL[ARTL_ART_rest_340] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_340] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rest_340] = true;
    artLabelInternalStrings[ARTL_ART_rest_341] = "rest ::= '....'  ";
    artLabelStrings[ARTL_ART_rest_341] = "";
    artlhsL[ARTL_ART_rest_341] = ARTL_ART_rest;
    artPopD[ARTL_ART_rest_341] = true;
    artLabelInternalStrings[ARTL_ART_rest_342] = "rest ::= '....'  .";
    artLabelStrings[ARTL_ART_rest_342] = "";
    artlhsL[ARTL_ART_rest_342] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_342] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rest_342] = true;
    arteoR_pL[ARTL_ART_rest_342] = true;
    artPopD[ARTL_ART_rest_342] = true;
  }

  public void artTableInitialiser_ART_shifters() {
    artLabelInternalStrings[ARTL_ART_shifters] = "shifters";
    artLabelStrings[ARTL_ART_shifters] = "shifters";
    artKindOfs[ARTL_ART_shifters] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_shifters_276] = "shifters ::= . '+'  ";
    artLabelStrings[ARTL_ART_shifters_276] = "";
    artlhsL[ARTL_ART_shifters_276] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_276] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_shifters_276] = true;
    artLabelInternalStrings[ARTL_ART_shifters_277] = "shifters ::= '+'  ";
    artLabelStrings[ARTL_ART_shifters_277] = "";
    artlhsL[ARTL_ART_shifters_277] = ARTL_ART_shifters;
    artPopD[ARTL_ART_shifters_277] = true;
    artLabelInternalStrings[ARTL_ART_shifters_278] = "shifters ::= '+'  .";
    artLabelStrings[ARTL_ART_shifters_278] = "";
    artlhsL[ARTL_ART_shifters_278] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_278] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_shifters_278] = true;
    arteoR_pL[ARTL_ART_shifters_278] = true;
    artPopD[ARTL_ART_shifters_278] = true;
    artLabelInternalStrings[ARTL_ART_shifters_282] = "shifters ::= . '-'  ";
    artLabelStrings[ARTL_ART_shifters_282] = "";
    artlhsL[ARTL_ART_shifters_282] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_282] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_shifters_282] = true;
    artLabelInternalStrings[ARTL_ART_shifters_283] = "shifters ::= '-'  ";
    artLabelStrings[ARTL_ART_shifters_283] = "";
    artlhsL[ARTL_ART_shifters_283] = ARTL_ART_shifters;
    artPopD[ARTL_ART_shifters_283] = true;
    artLabelInternalStrings[ARTL_ART_shifters_284] = "shifters ::= '-'  .";
    artLabelStrings[ARTL_ART_shifters_284] = "";
    artlhsL[ARTL_ART_shifters_284] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_284] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_shifters_284] = true;
    arteoR_pL[ARTL_ART_shifters_284] = true;
    artPopD[ARTL_ART_shifters_284] = true;
    artLabelInternalStrings[ARTL_ART_shifters_288] = "shifters ::= . '+'  shifters ";
    artLabelStrings[ARTL_ART_shifters_288] = "";
    artlhsL[ARTL_ART_shifters_288] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_288] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_shifters_289] = "shifters ::= '+'  shifters ";
    artLabelStrings[ARTL_ART_shifters_289] = "";
    artlhsL[ARTL_ART_shifters_289] = ARTL_ART_shifters;
    artLabelInternalStrings[ARTL_ART_shifters_290] = "shifters ::= '+'  . shifters ";
    artLabelStrings[ARTL_ART_shifters_290] = "";
    artlhsL[ARTL_ART_shifters_290] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_290] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_shifters_290] = true;
    artLabelInternalStrings[ARTL_ART_shifters_292] = "shifters ::= '+'  shifters .";
    artLabelStrings[ARTL_ART_shifters_292] = "";
    artlhsL[ARTL_ART_shifters_292] = ARTL_ART_shifters;
    artSlotInstanceOfs[ARTL_ART_shifters_292] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_292] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_shifters_292] = true;
    arteoR_pL[ARTL_ART_shifters_292] = true;
    artPopD[ARTL_ART_shifters_292] = true;
    artLabelInternalStrings[ARTL_ART_shifters_296] = "shifters ::= . '-'  shifters ";
    artLabelStrings[ARTL_ART_shifters_296] = "";
    artlhsL[ARTL_ART_shifters_296] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_296] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_shifters_297] = "shifters ::= '-'  shifters ";
    artLabelStrings[ARTL_ART_shifters_297] = "";
    artlhsL[ARTL_ART_shifters_297] = ARTL_ART_shifters;
    artLabelInternalStrings[ARTL_ART_shifters_298] = "shifters ::= '-'  . shifters ";
    artLabelStrings[ARTL_ART_shifters_298] = "";
    artlhsL[ARTL_ART_shifters_298] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_298] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_shifters_298] = true;
    artLabelInternalStrings[ARTL_ART_shifters_300] = "shifters ::= '-'  shifters .";
    artLabelStrings[ARTL_ART_shifters_300] = "";
    artlhsL[ARTL_ART_shifters_300] = ARTL_ART_shifters;
    artSlotInstanceOfs[ARTL_ART_shifters_300] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_300] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_shifters_300] = true;
    arteoR_pL[ARTL_ART_shifters_300] = true;
    artPopD[ARTL_ART_shifters_300] = true;
  }

  public void artTableInitialiser_ART_simpleNote() {
    artLabelInternalStrings[ARTL_ART_simpleNote] = "simpleNote";
    artLabelStrings[ARTL_ART_simpleNote] = "simpleNote";
    artKindOfs[ARTL_ART_simpleNote] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_simpleNote_202] = "simpleNote ::= . simpleNoteLexeme ";
    artLabelStrings[ARTL_ART_simpleNote_202] = "";
    artlhsL[ARTL_ART_simpleNote_202] = ARTL_ART_simpleNote;
    artKindOfs[ARTL_ART_simpleNote_202] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_simpleNote_204] = "simpleNote ::= simpleNoteLexeme .";
    artLabelStrings[ARTL_ART_simpleNote_204] = "";
    artlhsL[ARTL_ART_simpleNote_204] = ARTL_ART_simpleNote;
    artSlotInstanceOfs[ARTL_ART_simpleNote_204] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNote_204] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNote_204] = true;
    arteoR_pL[ARTL_ART_simpleNote_204] = true;
    artPopD[ARTL_ART_simpleNote_204] = true;
  }

  public void artTableInitialiser_ART_simpleNoteLexeme() {
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme] = "simpleNoteLexeme";
    artLabelStrings[ARTL_ART_simpleNoteLexeme] = "simpleNoteLexeme";
    artKindOfs[ARTL_ART_simpleNoteLexeme] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_208] = "simpleNoteLexeme ::= . 'Ab'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_208] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_208] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_208] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_208] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_209] = "simpleNoteLexeme ::= 'Ab'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_209] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_209] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_209] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_210] = "simpleNoteLexeme ::= 'Ab'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_210] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_210] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_210] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_210] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_210] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_210] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_212] = "simpleNoteLexeme ::= . 'A'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_212] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_212] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_212] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_212] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_213] = "simpleNoteLexeme ::= 'A'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_213] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_213] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_213] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_214] = "simpleNoteLexeme ::= 'A'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_214] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_214] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_214] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_214] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_214] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_214] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_216] = "simpleNoteLexeme ::= . 'A#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_216] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_216] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_216] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_216] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_217] = "simpleNoteLexeme ::= 'A#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_217] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_217] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_217] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_218] = "simpleNoteLexeme ::= 'A#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_218] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_218] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_218] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_218] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_218] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_218] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_220] = "simpleNoteLexeme ::= . 'Bb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_220] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_220] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_220] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_220] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_221] = "simpleNoteLexeme ::= 'Bb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_221] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_221] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_221] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_222] = "simpleNoteLexeme ::= 'Bb'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_222] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_222] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_222] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_222] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_222] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_222] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_224] = "simpleNoteLexeme ::= . 'B'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_224] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_224] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_224] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_224] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_225] = "simpleNoteLexeme ::= 'B'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_225] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_225] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_225] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_226] = "simpleNoteLexeme ::= 'B'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_226] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_226] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_226] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_226] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_226] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_226] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_228] = "simpleNoteLexeme ::= . 'C'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_228] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_228] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_228] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_228] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_229] = "simpleNoteLexeme ::= 'C'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_229] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_229] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_229] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_230] = "simpleNoteLexeme ::= 'C'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_230] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_230] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_230] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_230] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_230] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_230] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_232] = "simpleNoteLexeme ::= . 'C#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_232] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_232] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_232] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_232] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_233] = "simpleNoteLexeme ::= 'C#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_233] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_233] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_233] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_234] = "simpleNoteLexeme ::= 'C#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_234] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_234] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_234] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_234] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_234] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_234] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_236] = "simpleNoteLexeme ::= . 'Db'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_236] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_236] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_236] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_236] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_237] = "simpleNoteLexeme ::= 'Db'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_237] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_237] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_237] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_238] = "simpleNoteLexeme ::= 'Db'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_238] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_238] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_238] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_238] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_238] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_238] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_240] = "simpleNoteLexeme ::= . 'D'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_240] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_240] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_240] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_240] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_241] = "simpleNoteLexeme ::= 'D'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_241] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_241] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_241] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_242] = "simpleNoteLexeme ::= 'D'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_242] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_242] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_242] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_242] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_242] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_242] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_244] = "simpleNoteLexeme ::= . 'D#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_244] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_244] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_244] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_244] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_245] = "simpleNoteLexeme ::= 'D#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_245] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_245] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_245] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_246] = "simpleNoteLexeme ::= 'D#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_246] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_246] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_246] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_246] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_246] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_246] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_248] = "simpleNoteLexeme ::= . 'Eb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_248] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_248] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_248] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_248] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_249] = "simpleNoteLexeme ::= 'Eb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_249] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_249] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_249] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_250] = "simpleNoteLexeme ::= 'Eb'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_250] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_250] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_250] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_250] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_250] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_250] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_252] = "simpleNoteLexeme ::= . 'E'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_252] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_252] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_252] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_252] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_253] = "simpleNoteLexeme ::= 'E'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_253] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_253] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_253] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_254] = "simpleNoteLexeme ::= 'E'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_254] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_254] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_254] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_254] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_254] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_254] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_256] = "simpleNoteLexeme ::= . 'F'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_256] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_256] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_256] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_256] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_257] = "simpleNoteLexeme ::= 'F'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_257] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_257] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_257] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_258] = "simpleNoteLexeme ::= 'F'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_258] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_258] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_258] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_258] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_258] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_258] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_260] = "simpleNoteLexeme ::= . 'F#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_260] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_260] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_260] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_260] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_261] = "simpleNoteLexeme ::= 'F#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_261] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_261] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_261] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_262] = "simpleNoteLexeme ::= 'F#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_262] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_262] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_262] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_262] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_262] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_262] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_264] = "simpleNoteLexeme ::= . 'Gb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_264] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_264] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_264] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_264] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_265] = "simpleNoteLexeme ::= 'Gb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_265] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_265] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_265] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_266] = "simpleNoteLexeme ::= 'Gb'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_266] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_266] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_266] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_266] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_266] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_266] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_268] = "simpleNoteLexeme ::= . 'G'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_268] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_268] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_268] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_268] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_269] = "simpleNoteLexeme ::= 'G'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_269] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_269] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_269] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_270] = "simpleNoteLexeme ::= 'G'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_270] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_270] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_270] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_270] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_270] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_270] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_272] = "simpleNoteLexeme ::= . 'G#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_272] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_272] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_272] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_272] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_273] = "simpleNoteLexeme ::= 'G#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_273] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_273] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_273] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_274] = "simpleNoteLexeme ::= 'G#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_274] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_274] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_274] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_274] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_274] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_274] = true;
  }

  public void artTableInitialiser_ART_statement() {
    artLabelInternalStrings[ARTL_ART_statement] = "statement";
    artLabelStrings[ARTL_ART_statement] = "statement";
    artKindOfs[ARTL_ART_statement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statement_12] = "statement ::= . ID '='  e0 ';'  ";
    artLabelStrings[ARTL_ART_statement_12] = "";
    artlhsL[ARTL_ART_statement_12] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_12] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_14] = "statement ::= ID . '='  e0 ';'  ";
    artLabelStrings[ARTL_ART_statement_14] = "";
    artlhsL[ARTL_ART_statement_14] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_14] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_14] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_14] = true;
    artLabelInternalStrings[ARTL_ART_statement_15] = "statement ::= ID '='  e0 ';'  ";
    artLabelStrings[ARTL_ART_statement_15] = "";
    artlhsL[ARTL_ART_statement_15] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_16] = "statement ::= ID '='  . e0 ';'  ";
    artLabelStrings[ARTL_ART_statement_16] = "";
    artlhsL[ARTL_ART_statement_16] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_16] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_18] = "statement ::= ID '='  e0 . ';'  ";
    artLabelStrings[ARTL_ART_statement_18] = "";
    artlhsL[ARTL_ART_statement_18] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_18] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_statement_18] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_18] = true;
    artLabelInternalStrings[ARTL_ART_statement_19] = "statement ::= ID '='  e0 ';'  ";
    artLabelStrings[ARTL_ART_statement_19] = "";
    artlhsL[ARTL_ART_statement_19] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_19] = true;
    artLabelInternalStrings[ARTL_ART_statement_20] = "statement ::= ID '='  e0 ';'  .";
    artLabelStrings[ARTL_ART_statement_20] = "";
    artlhsL[ARTL_ART_statement_20] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_20] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_20] = true;
    arteoR_pL[ARTL_ART_statement_20] = true;
    artPopD[ARTL_ART_statement_20] = true;
    artLabelInternalStrings[ARTL_ART_statement_24] = "statement ::= . 'if'  e0 'then'  statement elseOpt ";
    artLabelStrings[ARTL_ART_statement_24] = "";
    artlhsL[ARTL_ART_statement_24] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_24] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_25] = "statement ::= 'if'  e0 'then'  statement elseOpt ";
    artLabelStrings[ARTL_ART_statement_25] = "";
    artlhsL[ARTL_ART_statement_25] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_26] = "statement ::= 'if'  . e0 'then'  statement elseOpt ";
    artLabelStrings[ARTL_ART_statement_26] = "";
    artlhsL[ARTL_ART_statement_26] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_26] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_26] = true;
    artLabelInternalStrings[ARTL_ART_statement_28] = "statement ::= 'if'  e0 . 'then'  statement elseOpt ";
    artLabelStrings[ARTL_ART_statement_28] = "";
    artlhsL[ARTL_ART_statement_28] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_28] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_statement_28] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_29] = "statement ::= 'if'  e0 'then'  statement elseOpt ";
    artLabelStrings[ARTL_ART_statement_29] = "";
    artlhsL[ARTL_ART_statement_29] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_30] = "statement ::= 'if'  e0 'then'  . statement elseOpt ";
    artLabelStrings[ARTL_ART_statement_30] = "";
    artlhsL[ARTL_ART_statement_30] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_30] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_32] = "statement ::= 'if'  e0 'then'  statement . elseOpt ";
    artLabelStrings[ARTL_ART_statement_32] = "";
    artlhsL[ARTL_ART_statement_32] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_32] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_32] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_34] = "statement ::= 'if'  e0 'then'  statement elseOpt .";
    artLabelStrings[ARTL_ART_statement_34] = "";
    artlhsL[ARTL_ART_statement_34] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_34] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_statement_34] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_34] = true;
    arteoR_pL[ARTL_ART_statement_34] = true;
    artPopD[ARTL_ART_statement_34] = true;
    artLabelInternalStrings[ARTL_ART_statement_38] = "statement ::= . 'while'  e0 'do'  statement ";
    artLabelStrings[ARTL_ART_statement_38] = "";
    artlhsL[ARTL_ART_statement_38] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_38] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_39] = "statement ::= 'while'  e0 'do'  statement ";
    artLabelStrings[ARTL_ART_statement_39] = "";
    artlhsL[ARTL_ART_statement_39] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_40] = "statement ::= 'while'  . e0 'do'  statement ";
    artLabelStrings[ARTL_ART_statement_40] = "";
    artlhsL[ARTL_ART_statement_40] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_40] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_40] = true;
    artLabelInternalStrings[ARTL_ART_statement_42] = "statement ::= 'while'  e0 . 'do'  statement ";
    artLabelStrings[ARTL_ART_statement_42] = "";
    artlhsL[ARTL_ART_statement_42] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_42] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_statement_42] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_43] = "statement ::= 'while'  e0 'do'  statement ";
    artLabelStrings[ARTL_ART_statement_43] = "";
    artlhsL[ARTL_ART_statement_43] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_44] = "statement ::= 'while'  e0 'do'  . statement ";
    artLabelStrings[ARTL_ART_statement_44] = "";
    artlhsL[ARTL_ART_statement_44] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_44] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_46] = "statement ::= 'while'  e0 'do'  statement .";
    artLabelStrings[ARTL_ART_statement_46] = "";
    artlhsL[ARTL_ART_statement_46] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_46] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_46] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_46] = true;
    arteoR_pL[ARTL_ART_statement_46] = true;
    artPopD[ARTL_ART_statement_46] = true;
    artLabelInternalStrings[ARTL_ART_statement_50] = "statement ::= . 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_50] = "";
    artlhsL[ARTL_ART_statement_50] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_50] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_51] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_51] = "";
    artlhsL[ARTL_ART_statement_51] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_52] = "statement ::= 'print'  . '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_52] = "";
    artlhsL[ARTL_ART_statement_52] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_52] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_52] = true;
    artLabelInternalStrings[ARTL_ART_statement_53] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_53] = "";
    artlhsL[ARTL_ART_statement_53] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_54] = "statement ::= 'print'  '('  . printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_54] = "";
    artlhsL[ARTL_ART_statement_54] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_54] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_56] = "statement ::= 'print'  '('  printElements . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_56] = "";
    artlhsL[ARTL_ART_statement_56] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_56] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_statement_56] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_56] = true;
    artLabelInternalStrings[ARTL_ART_statement_57] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_57] = "";
    artlhsL[ARTL_ART_statement_57] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_57] = true;
    artLabelInternalStrings[ARTL_ART_statement_58] = "statement ::= 'print'  '('  printElements ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_58] = "";
    artlhsL[ARTL_ART_statement_58] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_58] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_58] = true;
    artLabelInternalStrings[ARTL_ART_statement_59] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_59] = "";
    artlhsL[ARTL_ART_statement_59] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_59] = true;
    artLabelInternalStrings[ARTL_ART_statement_60] = "statement ::= 'print'  '('  printElements ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_60] = "";
    artlhsL[ARTL_ART_statement_60] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_60] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_60] = true;
    arteoR_pL[ARTL_ART_statement_60] = true;
    artPopD[ARTL_ART_statement_60] = true;
    artLabelInternalStrings[ARTL_ART_statement_62] = "statement ::= . 'melody'  ID statement ";
    artLabelStrings[ARTL_ART_statement_62] = "";
    artlhsL[ARTL_ART_statement_62] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_62] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_63] = "statement ::= 'melody'  ID statement ";
    artLabelStrings[ARTL_ART_statement_63] = "";
    artlhsL[ARTL_ART_statement_63] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_64] = "statement ::= 'melody'  . ID statement ";
    artLabelStrings[ARTL_ART_statement_64] = "";
    artlhsL[ARTL_ART_statement_64] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_64] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_64] = true;
    artLabelInternalStrings[ARTL_ART_statement_66] = "statement ::= 'melody'  ID . statement ";
    artLabelStrings[ARTL_ART_statement_66] = "";
    artlhsL[ARTL_ART_statement_66] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_66] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_66] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_68] = "statement ::= 'melody'  ID statement .";
    artLabelStrings[ARTL_ART_statement_68] = "";
    artlhsL[ARTL_ART_statement_68] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_68] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_68] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_68] = true;
    arteoR_pL[ARTL_ART_statement_68] = true;
    artPopD[ARTL_ART_statement_68] = true;
    artLabelInternalStrings[ARTL_ART_statement_72] = "statement ::= . 'play'  ID ';'  ";
    artLabelStrings[ARTL_ART_statement_72] = "";
    artlhsL[ARTL_ART_statement_72] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_72] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_73] = "statement ::= 'play'  ID ';'  ";
    artLabelStrings[ARTL_ART_statement_73] = "";
    artlhsL[ARTL_ART_statement_73] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_74] = "statement ::= 'play'  . ID ';'  ";
    artLabelStrings[ARTL_ART_statement_74] = "";
    artlhsL[ARTL_ART_statement_74] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_74] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_74] = true;
    artLabelInternalStrings[ARTL_ART_statement_76] = "statement ::= 'play'  ID . ';'  ";
    artLabelStrings[ARTL_ART_statement_76] = "";
    artlhsL[ARTL_ART_statement_76] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_76] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_76] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_76] = true;
    artLabelInternalStrings[ARTL_ART_statement_77] = "statement ::= 'play'  ID ';'  ";
    artLabelStrings[ARTL_ART_statement_77] = "";
    artlhsL[ARTL_ART_statement_77] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_77] = true;
    artLabelInternalStrings[ARTL_ART_statement_78] = "statement ::= 'play'  ID ';'  .";
    artLabelStrings[ARTL_ART_statement_78] = "";
    artlhsL[ARTL_ART_statement_78] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_78] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_78] = true;
    arteoR_pL[ARTL_ART_statement_78] = true;
    artPopD[ARTL_ART_statement_78] = true;
    artLabelInternalStrings[ARTL_ART_statement_82] = "statement ::= . '{'  statements '}'  ";
    artLabelStrings[ARTL_ART_statement_82] = "";
    artlhsL[ARTL_ART_statement_82] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_82] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_83] = "statement ::= '{'  statements '}'  ";
    artLabelStrings[ARTL_ART_statement_83] = "";
    artlhsL[ARTL_ART_statement_83] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_84] = "statement ::= '{'  . statements '}'  ";
    artLabelStrings[ARTL_ART_statement_84] = "";
    artlhsL[ARTL_ART_statement_84] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_84] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_84] = true;
    artLabelInternalStrings[ARTL_ART_statement_86] = "statement ::= '{'  statements . '}'  ";
    artLabelStrings[ARTL_ART_statement_86] = "";
    artlhsL[ARTL_ART_statement_86] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_86] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statement_86] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_86] = true;
    artLabelInternalStrings[ARTL_ART_statement_87] = "statement ::= '{'  statements '}'  ";
    artLabelStrings[ARTL_ART_statement_87] = "";
    artlhsL[ARTL_ART_statement_87] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_87] = true;
    artLabelInternalStrings[ARTL_ART_statement_88] = "statement ::= '{'  statements '}'  .";
    artLabelStrings[ARTL_ART_statement_88] = "";
    artlhsL[ARTL_ART_statement_88] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_88] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_88] = true;
    arteoR_pL[ARTL_ART_statement_88] = true;
    artPopD[ARTL_ART_statement_88] = true;
    artLabelInternalStrings[ARTL_ART_statement_90] = "statement ::= . bpm ";
    artLabelStrings[ARTL_ART_statement_90] = "";
    artlhsL[ARTL_ART_statement_90] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_90] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_92] = "statement ::= bpm .";
    artLabelStrings[ARTL_ART_statement_92] = "";
    artlhsL[ARTL_ART_statement_92] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_92] = ARTL_ART_bpm;
    artKindOfs[ARTL_ART_statement_92] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_92] = true;
    arteoR_pL[ARTL_ART_statement_92] = true;
    artPopD[ARTL_ART_statement_92] = true;
    artLabelInternalStrings[ARTL_ART_statement_94] = "statement ::= . defaultOctave ";
    artLabelStrings[ARTL_ART_statement_94] = "";
    artlhsL[ARTL_ART_statement_94] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_94] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_96] = "statement ::= defaultOctave .";
    artLabelStrings[ARTL_ART_statement_96] = "";
    artlhsL[ARTL_ART_statement_96] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_96] = ARTL_ART_defaultOctave;
    artKindOfs[ARTL_ART_statement_96] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_96] = true;
    arteoR_pL[ARTL_ART_statement_96] = true;
    artPopD[ARTL_ART_statement_96] = true;
    artLabelInternalStrings[ARTL_ART_statement_98] = "statement ::= . note ";
    artLabelStrings[ARTL_ART_statement_98] = "";
    artlhsL[ARTL_ART_statement_98] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_98] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_100] = "statement ::= note .";
    artLabelStrings[ARTL_ART_statement_100] = "";
    artlhsL[ARTL_ART_statement_100] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_100] = ARTL_ART_note;
    artKindOfs[ARTL_ART_statement_100] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_100] = true;
    arteoR_pL[ARTL_ART_statement_100] = true;
    artPopD[ARTL_ART_statement_100] = true;
    artLabelInternalStrings[ARTL_ART_statement_102] = "statement ::= . chord ";
    artLabelStrings[ARTL_ART_statement_102] = "";
    artlhsL[ARTL_ART_statement_102] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_102] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_104] = "statement ::= chord .";
    artLabelStrings[ARTL_ART_statement_104] = "";
    artlhsL[ARTL_ART_statement_104] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_104] = ARTL_ART_chord;
    artKindOfs[ARTL_ART_statement_104] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_104] = true;
    arteoR_pL[ARTL_ART_statement_104] = true;
    artPopD[ARTL_ART_statement_104] = true;
    artLabelInternalStrings[ARTL_ART_statement_106] = "statement ::= . rest ";
    artLabelStrings[ARTL_ART_statement_106] = "";
    artlhsL[ARTL_ART_statement_106] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_106] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_108] = "statement ::= rest .";
    artLabelStrings[ARTL_ART_statement_108] = "";
    artlhsL[ARTL_ART_statement_108] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_108] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_statement_108] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_108] = true;
    arteoR_pL[ARTL_ART_statement_108] = true;
    artPopD[ARTL_ART_statement_108] = true;
  }

  public void artTableInitialiser_ART_statements() {
    artLabelInternalStrings[ARTL_ART_statements] = "statements";
    artLabelStrings[ARTL_ART_statements] = "statements";
    artKindOfs[ARTL_ART_statements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statements_2] = "statements ::= . statement ";
    artLabelStrings[ARTL_ART_statements_2] = "";
    artlhsL[ARTL_ART_statements_2] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_4] = "statements ::= statement .";
    artLabelStrings[ARTL_ART_statements_4] = "";
    artlhsL[ARTL_ART_statements_4] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_4] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statements_4] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_4] = true;
    arteoR_pL[ARTL_ART_statements_4] = true;
    artPopD[ARTL_ART_statements_4] = true;
    artLabelInternalStrings[ARTL_ART_statements_6] = "statements ::= . statement statements ";
    artLabelStrings[ARTL_ART_statements_6] = "";
    artlhsL[ARTL_ART_statements_6] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_6] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_8] = "statements ::= statement . statements ";
    artLabelStrings[ARTL_ART_statements_8] = "";
    artlhsL[ARTL_ART_statements_8] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_8] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statements_8] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statements_8] = true;
    artLabelInternalStrings[ARTL_ART_statements_10] = "statements ::= statement statements .";
    artLabelStrings[ARTL_ART_statements_10] = "";
    artlhsL[ARTL_ART_statements_10] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_10] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_10] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_10] = true;
    arteoR_pL[ARTL_ART_statements_10] = true;
    artPopD[ARTL_ART_statements_10] = true;
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
    artLabelStrings[ARTTS__PERIOD] = ".";
    artLabelInternalStrings[ARTTS__PERIOD] = "'.'";
    artKindOfs[ARTTS__PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD] = true;
    artLabelStrings[ARTTS__PERIOD_PERIOD] = "..";
    artLabelInternalStrings[ARTTS__PERIOD_PERIOD] = "'..'";
    artKindOfs[ARTTS__PERIOD_PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD_PERIOD] = true;
    artLabelStrings[ARTTS__PERIOD_PERIOD_PERIOD] = "...";
    artLabelInternalStrings[ARTTS__PERIOD_PERIOD_PERIOD] = "'...'";
    artKindOfs[ARTTS__PERIOD_PERIOD_PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    artLabelStrings[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = "....";
    artLabelInternalStrings[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = "'....'";
    artKindOfs[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
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
    artLabelStrings[ARTTS_A] = "A";
    artLabelInternalStrings[ARTTS_A] = "'A'";
    artKindOfs[ARTTS_A] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_A] = true;
    artLabelStrings[ARTTS_A_HASH] = "A#";
    artLabelInternalStrings[ARTTS_A_HASH] = "'A#'";
    artKindOfs[ARTTS_A_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_A_HASH] = true;
    artLabelStrings[ARTTS_Ab] = "Ab";
    artLabelInternalStrings[ARTTS_Ab] = "'Ab'";
    artKindOfs[ARTTS_Ab] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Ab] = true;
    artLabelStrings[ARTTS_B] = "B";
    artLabelInternalStrings[ARTTS_B] = "'B'";
    artKindOfs[ARTTS_B] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_B] = true;
    artLabelStrings[ARTTS_Bb] = "Bb";
    artLabelInternalStrings[ARTTS_Bb] = "'Bb'";
    artKindOfs[ARTTS_Bb] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Bb] = true;
    artLabelStrings[ARTTS_C] = "C";
    artLabelInternalStrings[ARTTS_C] = "'C'";
    artKindOfs[ARTTS_C] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_C] = true;
    artLabelStrings[ARTTS_C_HASH] = "C#";
    artLabelInternalStrings[ARTTS_C_HASH] = "'C#'";
    artKindOfs[ARTTS_C_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_C_HASH] = true;
    artLabelStrings[ARTTS_D] = "D";
    artLabelInternalStrings[ARTTS_D] = "'D'";
    artKindOfs[ARTTS_D] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_D] = true;
    artLabelStrings[ARTTS_D_HASH] = "D#";
    artLabelInternalStrings[ARTTS_D_HASH] = "'D#'";
    artKindOfs[ARTTS_D_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_D_HASH] = true;
    artLabelStrings[ARTTS_Db] = "Db";
    artLabelInternalStrings[ARTTS_Db] = "'Db'";
    artKindOfs[ARTTS_Db] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Db] = true;
    artLabelStrings[ARTTS_E] = "E";
    artLabelInternalStrings[ARTTS_E] = "'E'";
    artKindOfs[ARTTS_E] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_E] = true;
    artLabelStrings[ARTTS_Eb] = "Eb";
    artLabelInternalStrings[ARTTS_Eb] = "'Eb'";
    artKindOfs[ARTTS_Eb] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Eb] = true;
    artLabelStrings[ARTTS_F] = "F";
    artLabelInternalStrings[ARTTS_F] = "'F'";
    artKindOfs[ARTTS_F] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_F] = true;
    artLabelStrings[ARTTS_F_HASH] = "F#";
    artLabelInternalStrings[ARTTS_F_HASH] = "'F#'";
    artKindOfs[ARTTS_F_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_F_HASH] = true;
    artLabelStrings[ARTTS_G] = "G";
    artLabelInternalStrings[ARTTS_G] = "'G'";
    artKindOfs[ARTTS_G] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_G] = true;
    artLabelStrings[ARTTS_G_HASH] = "G#";
    artLabelInternalStrings[ARTTS_G_HASH] = "'G#'";
    artKindOfs[ARTTS_G_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_G_HASH] = true;
    artLabelStrings[ARTTS_Gb] = "Gb";
    artLabelInternalStrings[ARTTS_Gb] = "'Gb'";
    artKindOfs[ARTTS_Gb] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Gb] = true;
    artLabelStrings[ARTTS_M] = "M";
    artLabelInternalStrings[ARTTS_M] = "'M'";
    artKindOfs[ARTTS_M] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_M] = true;
    artLabelStrings[ARTTS_M7] = "M7";
    artLabelInternalStrings[ARTTS_M7] = "'M7'";
    artKindOfs[ARTTS_M7] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_M7] = true;
    artLabelStrings[ARTTS__LBRACK] = "[";
    artLabelInternalStrings[ARTTS__LBRACK] = "'['";
    artKindOfs[ARTTS__LBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACK] = true;
    artLabelStrings[ARTTS__RBRACK] = "]";
    artLabelInternalStrings[ARTTS__RBRACK] = "']'";
    artKindOfs[ARTTS__RBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACK] = true;
    artLabelStrings[ARTTS_beatRatio] = "beatRatio";
    artLabelInternalStrings[ARTTS_beatRatio] = "'beatRatio'";
    artKindOfs[ARTTS_beatRatio] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_beatRatio] = true;
    artLabelStrings[ARTTS_bpm] = "bpm";
    artLabelInternalStrings[ARTTS_bpm] = "'bpm'";
    artKindOfs[ARTTS_bpm] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_bpm] = true;
    artLabelStrings[ARTTS_defaultOctave] = "defaultOctave";
    artLabelInternalStrings[ARTTS_defaultOctave] = "'defaultOctave'";
    artKindOfs[ARTTS_defaultOctave] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_defaultOctave] = true;
    artLabelStrings[ARTTS_do] = "do";
    artLabelInternalStrings[ARTTS_do] = "'do'";
    artKindOfs[ARTTS_do] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_do] = true;
    artLabelStrings[ARTTS_else] = "else";
    artLabelInternalStrings[ARTTS_else] = "'else'";
    artKindOfs[ARTTS_else] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_else] = true;
    artLabelStrings[ARTTS_if] = "if";
    artLabelInternalStrings[ARTTS_if] = "'if'";
    artKindOfs[ARTTS_if] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_if] = true;
    artLabelStrings[ARTTS_m] = "m";
    artLabelInternalStrings[ARTTS_m] = "'m'";
    artKindOfs[ARTTS_m] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_m] = true;
    artLabelStrings[ARTTS_m7] = "m7";
    artLabelInternalStrings[ARTTS_m7] = "'m7'";
    artKindOfs[ARTTS_m7] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_m7] = true;
    artLabelStrings[ARTTS_melody] = "melody";
    artLabelInternalStrings[ARTTS_melody] = "'melody'";
    artKindOfs[ARTTS_melody] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_melody] = true;
    artLabelStrings[ARTTS_play] = "play";
    artLabelInternalStrings[ARTTS_play] = "'play'";
    artKindOfs[ARTTS_play] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_play] = true;
    artLabelStrings[ARTTS_print] = "print";
    artLabelInternalStrings[ARTTS_print] = "'print'";
    artKindOfs[ARTTS_print] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_print] = true;
    artLabelStrings[ARTTS_then] = "then";
    artLabelInternalStrings[ARTTS_then] = "'then'";
    artKindOfs[ARTTS_then] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_then] = true;
    artLabelStrings[ARTTS_while] = "while";
    artLabelInternalStrings[ARTTS_while] = "'while'";
    artKindOfs[ARTTS_while] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_while] = true;
    artLabelStrings[ARTTS__LBRACE] = "{";
    artLabelInternalStrings[ARTTS__LBRACE] = "'{'";
    artKindOfs[ARTTS__LBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACE] = true;
    artLabelStrings[ARTTS__RBRACE] = "}";
    artLabelInternalStrings[ARTTS__RBRACE] = "'}'";
    artKindOfs[ARTTS__RBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACE] = true;
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_REAL();
    artTableInitialiser_ART_STRING_DQ();
    artTableInitialiser_ART_beatRatio();
    artTableInitialiser_ART_bpm();
    artTableInitialiser_ART_chord();
    artTableInitialiser_ART_chordMode();
    artTableInitialiser_ART_defaultOctave();
    artTableInitialiser_ART_e0();
    artTableInitialiser_ART_e1();
    artTableInitialiser_ART_e2();
    artTableInitialiser_ART_e3();
    artTableInitialiser_ART_e4();
    artTableInitialiser_ART_e5();
    artTableInitialiser_ART_elseOpt();
    artTableInitialiser_ART_note();
    artTableInitialiser_ART_notes();
    artTableInitialiser_ART_printElements();
    artTableInitialiser_ART_rest();
    artTableInitialiser_ART_shifters();
    artTableInitialiser_ART_simpleNote();
    artTableInitialiser_ART_simpleNoteLexeme();
    artTableInitialiser_ART_statement();
    artTableInitialiser_ART_statements();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__SHREIK_EQUAL;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 89;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_statements;
    artBuildDirectives = "ARTDirectives [verbosityLevel=0, statistics=false, trace=false, inputs=[], inputFilenames=[], lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;
 
HashMap<String, Integer> variables = new HashMap<String, Integer>(); 
HashMap<String, ARTGLLRDTHandle> melodies = new HashMap<String, ARTGLLRDTHandle>(); 
MiniMusicPlayer mp = new MiniMusicPlayer();

  public static class ARTAT_ART_ID extends ARTGLLAttributeBlock {
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

  public static class ARTAT_ART_INTEGER extends ARTGLLAttributeBlock {
    public int v;
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

  public static class ARTAT_ART_chordMode extends ARTGLLAttributeBlock {
    public Chord v;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e0 extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle e11;
    ARTGLLRDTHandle e12;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e1 extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle e11;
    ARTGLLRDTHandle e21;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e2 extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle e21;
    ARTGLLRDTHandle e31;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e3 extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle e31;
    ARTGLLRDTHandle e41;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e4 extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle e41;
    ARTGLLRDTHandle e51;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e5 extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle INTEGER1;
    ARTGLLRDTHandle e11;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_elseOpt extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle statement1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public static class ARTAT_ART_shifters extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle shifters1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_simpleNote extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_statement extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle e01;
    ARTGLLRDTHandle elseOpt1;
    ARTGLLRDTHandle statement1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*ID ::= &ID  .*/
      case ARTL_ART_ID_568: 
                ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID);
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
        ID.lexeme = artLexeme(ID.leftExtent, ID.rightExtent); ID.v = artLexemeAsID(ID.leftExtent, ID.rightExtent); 
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
    case ARTL_ART_INTEGER_574: 
            ARTRD_INTEGER(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      INTEGER.lexeme = artLexeme(INTEGER.leftExtent, INTEGER.rightExtent); INTEGER.v = artLexemeAsInteger(INTEGER.leftExtent, INTEGER.rightExtent); 
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
    case ARTL_ART_REAL_580: 
            ARTRD_REAL(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      REAL.lexeme = artLexeme(REAL.leftExtent, REAL.rightExtent); REAL.v = artLexemeAsInteger(REAL.leftExtent, REAL.rightExtent); 
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
    case ARTL_ART_STRING_DQ_586: 
            ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      STRING_DQ.lexeme = artLexeme(STRING_DQ.leftExtent, STRING_DQ.rightExtent); STRING_DQ.v = artLexemeAsString(STRING_DQ.leftExtent, STRING_DQ.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_STRING_DQ: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_beatRatio(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*beatRatio ::= 'beatRatio'  REAL .*/
    case ARTL_ART_beatRatio_132: 
      REAL1 = new ARTAT_ART_REAL();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
       mp.setBeatRatio(REAL1.v); 
      break;
        default:
          throw new ARTException("ARTRD_beatRatio: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_bpm(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*bpm ::= 'bpm'  INTEGER .*/
    case ARTL_ART_bpm_124: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
       mp.setBpm(INTEGER1.v); 
      break;
        default:
          throw new ARTException("ARTRD_bpm: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_chord(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*chord ::= '['  notes . ']'  */
    case ARTL_ART_chord_308: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_notes(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*chord ::= '['  notes ']'  .*/
    case ARTL_ART_chord_310: 
            ARTRD_chord(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_chord: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_chordMode(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_chordMode chordMode) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*chordMode ::= # .*/
    case ARTL_ART_chordMode_174: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.NONE; 
      break;
    /*chordMode ::= 'm'  .*/
    case ARTL_ART_chordMode_180: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.MINOR; 
      break;
    /*chordMode ::= 'm7'  .*/
    case ARTL_ART_chordMode_186: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.MINOR7; 
      break;
    /*chordMode ::= 'M'  .*/
    case ARTL_ART_chordMode_192: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.MAJOR; 
      break;
    /*chordMode ::= 'M7'  .*/
    case ARTL_ART_chordMode_198: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.MAJOR7; 
      break;
        default:
          throw new ARTException("ARTRD_chordMode: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_defaultOctave(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*defaultOctave ::= 'defaultOctave'  INTEGER .*/
    case ARTL_ART_defaultOctave_140: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
       if (INTEGER1.v < 0 || INTEGER1.v > 10) 
     artText.println(ARTTextLevel.WARNING, "ignoring illegal MIDI octave number " + INTEGER1.v);
    else
      mp.setDefaultOctave(INTEGER1.v); 
 
      break;
        default:
          throw new ARTException("ARTRD_defaultOctave: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_e0_380: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
       e0.v = e11.v; 
      break;
    /*e0 ::= e1 '>'  . e1 */
    case ARTL_ART_e0_388: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '>'  e1 .*/
    case ARTL_ART_e0_390: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v >  e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '<'  . e1 */
    case ARTL_ART_e0_398: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '<'  e1 .*/
    case ARTL_ART_e0_400: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v <  e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '>='  . e1 */
    case ARTL_ART_e0_408: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '>='  e1 .*/
    case ARTL_ART_e0_410: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v >= e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '<='  . e1 */
    case ARTL_ART_e0_418: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '<='  e1 .*/
    case ARTL_ART_e0_420: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v <= e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '=='  . e1 */
    case ARTL_ART_e0_428: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '=='  e1 .*/
    case ARTL_ART_e0_430: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v == e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '!='  . e1 */
    case ARTL_ART_e0_438: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '!='  e1 .*/
    case ARTL_ART_e0_440: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v != e12.v ? 1 : 0; 
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
    case ARTL_ART_e1_446: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e21.v; 
      break;
    /*e1 ::= e1 '+'  . e2 */
    case ARTL_ART_e1_454: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e1 ::= e1 '+'  e2 .*/
    case ARTL_ART_e1_456: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e11.v + e21.v; 
      break;
    /*e1 ::= e1 '-'  . e2 */
    case ARTL_ART_e1_464: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e1 ::= e1 '-'  e2 .*/
    case ARTL_ART_e1_466: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e11.v - e21.v; 
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
    case ARTL_ART_e2_472: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v= e31.v; 
      break;
    /*e2 ::= e2 '*'  . e3 */
    case ARTL_ART_e2_480: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '*'  e3 .*/
    case ARTL_ART_e2_482: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v * e31.v; 
      break;
    /*e2 ::= e2 '/'  . e3 */
    case ARTL_ART_e2_490: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '/'  e3 .*/
    case ARTL_ART_e2_492: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v / e31.v; 
      break;
    /*e2 ::= e2 '%'  . e3 */
    case ARTL_ART_e2_500: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '%'  e3 .*/
    case ARTL_ART_e2_502: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v % e31.v; 
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
    case ARTL_ART_e3_508: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            ARTRD_e3(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e3, e31, e41);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e41));
      ARTRD_e4(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e41, null, null);
      e3.v = e41.v; 
      break;
    /*e3 ::= '+'  e3 .*/
    case ARTL_ART_e3_516: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
      e3.v = e31.v; 
      break;
    /*e3 ::= '-'  e3 .*/
    case ARTL_ART_e3_524: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
      e3.v = -e31.v; 
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
    case ARTL_ART_e4_530: 
      e41 = new ARTAT_ART_e4();
      e51 = new ARTAT_ART_e5();
            ARTRD_e4(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e4, e41, e51);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e51));
      ARTRD_e5(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e51, null, null, null);
       e4.v = e51.v; 
      break;
    /*e4 ::= e5 '**'  . e4 */
    case ARTL_ART_e4_538: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e51));
      ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e51, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e4 ::= e5 '**'  e4 .*/
    case ARTL_ART_e4_540: 
      e41 = new ARTAT_ART_e4();
      e51 = new ARTAT_ART_e5();
            ARTRD_e4(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e4, e41, e51);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e41));
      ARTRD_e4(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e41, null, null);
      e4.v = (int) Math.pow(e51.v, e41.v); 
      break;
        default:
          throw new ARTException("ARTRD_e4: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e5(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e5 e5, ARTAT_ART_ID ID1, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_e1 e11) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e5 ::= INTEGER .*/
    case ARTL_ART_e5_546: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      e11 = new ARTAT_ART_e1();
            ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e5, ID1, INTEGER1, e11);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
      e5.v = INTEGER1.v; 
      break;
    /*e5 ::= ID .*/
    case ARTL_ART_e5_552: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      e11 = new ARTAT_ART_e1();
            ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e5, ID1, INTEGER1, e11);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
       e5.v = variables.get(ID1.v); 
      break;
    /*e5 ::= '('  e1 . ')'  */
    case ARTL_ART_e5_560: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
       e5.v = e11.v; 
      break;
    /*e5 ::= '('  e1 ')'  .*/
    case ARTL_ART_e5_564: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      e11 = new ARTAT_ART_e1();
            ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e5, ID1, INTEGER1, e11);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_e5: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_elseOpt(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_statement statement1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*elseOpt ::= 'else'  statement .*/
    case ARTL_ART_elseOpt_114: 
      statement1 = new ARTAT_ART_statement();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, statement1, null, null, null, null);
            break;
    /*elseOpt ::= # .*/
    case ARTL_ART_elseOpt_118: 
      statement1 = new ARTAT_ART_statement();
            ARTRD_elseOpt(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_elseOpt: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_note(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_chordMode chordMode1, ARTAT_ART_shifters shifters1, ARTAT_ART_simpleNote simpleNote1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*note ::= simpleNote chordMode .*/
    case ARTL_ART_note_148: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      chordMode1 = new ARTAT_ART_chordMode();
      shifters1 = new ARTAT_ART_shifters();
      simpleNote1 = new ARTAT_ART_simpleNote();
            simpleNote1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      simpleNote1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), simpleNote1));
      ARTRD_simpleNote(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, simpleNote1);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), chordMode1));
      ARTRD_chordMode(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, chordMode1);
       mp.playChord(simpleNote1.v.trim(), chordMode1.v ); 
      break;
    /*note ::= simpleNote shifters . chordMode */
    case ARTL_ART_note_156: 
      simpleNote1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      simpleNote1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), simpleNote1));
      ARTRD_simpleNote(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, simpleNote1);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), shifters1));
      ARTRD_shifters(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, shifters1, null);
            break;
    /*note ::= simpleNote shifters chordMode .*/
    case ARTL_ART_note_158: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      chordMode1 = new ARTAT_ART_chordMode();
      shifters1 = new ARTAT_ART_shifters();
      simpleNote1 = new ARTAT_ART_simpleNote();
            ARTRD_note(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, chordMode1, shifters1, simpleNote1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), chordMode1));
      ARTRD_chordMode(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, chordMode1);
       mp.playChord(simpleNote1.v.trim(), mp.getDefaultOctave() + shifters1.v, chordMode1.v); 
      break;
    /*note ::= simpleNote INTEGER . chordMode */
    case ARTL_ART_note_166: 
      simpleNote1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      simpleNote1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), simpleNote1));
      ARTRD_simpleNote(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, simpleNote1);
            INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*note ::= simpleNote INTEGER chordMode .*/
    case ARTL_ART_note_168: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      chordMode1 = new ARTAT_ART_chordMode();
      shifters1 = new ARTAT_ART_shifters();
      simpleNote1 = new ARTAT_ART_simpleNote();
            ARTRD_note(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, chordMode1, shifters1, simpleNote1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), chordMode1));
      ARTRD_chordMode(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, chordMode1);
       mp.playChord(simpleNote1.v.trim(), INTEGER1.v, chordMode1.v); 
      break;
        default:
          throw new ARTException("ARTRD_note: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_notes(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*notes ::= note .*/
    case ARTL_ART_notes_314: 
            ARTRD_notes(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_note(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null);
            break;
    /*notes ::= note notes .*/
    case ARTL_ART_notes_320: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_note(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_notes(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_notes: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_printElements_348: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       artText.printf("%s", STRING_DQ1.v); 
      break;
    /*printElements ::= STRING_DQ ','  . printElements */
    case ARTL_ART_printElements_358: 
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       artText.printf("%s", STRING_DQ1.v); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*printElements ::= STRING_DQ ','  printElements .*/
    case ARTL_ART_printElements_360: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*printElements ::= e0 .*/
    case ARTL_ART_printElements_364: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
       artText.printf("%d", e01.v); 
      break;
    /*printElements ::= e0 ','  . printElements */
    case ARTL_ART_printElements_374: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
       artText.printf("%d", e01.v); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*printElements ::= e0 ','  printElements .*/
    case ARTL_ART_printElements_376: 
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

public void ARTRD_rest(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*rest ::= '.'  .*/
    case ARTL_ART_rest_324: 
            ARTRD_rest(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       mp.rest(1); 
      break;
    /*rest ::= '..'  .*/
    case ARTL_ART_rest_330: 
            ARTRD_rest(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       mp.rest(2); 
      break;
    /*rest ::= '...'  .*/
    case ARTL_ART_rest_336: 
            ARTRD_rest(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       mp.rest(3); 
      break;
    /*rest ::= '....'  .*/
    case ARTL_ART_rest_342: 
            ARTRD_rest(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       mp.rest(4); 
      break;
        default:
          throw new ARTException("ARTRD_rest: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_shifters(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_shifters shifters, ARTAT_ART_shifters shifters1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*shifters ::= '+'  .*/
    case ARTL_ART_shifters_278: 
      shifters1 = new ARTAT_ART_shifters();
            ARTRD_shifters(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, shifters, shifters1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      shifters.v = 1;
      break;
    /*shifters ::= '-'  .*/
    case ARTL_ART_shifters_284: 
      shifters1 = new ARTAT_ART_shifters();
            ARTRD_shifters(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, shifters, shifters1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      shifters.v = -1;
      break;
    /*shifters ::= '+'  shifters .*/
    case ARTL_ART_shifters_292: 
      shifters1 = new ARTAT_ART_shifters();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), shifters1));
      ARTRD_shifters(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, shifters1, null);
      shifters.v = shifters1.v + 1; 
      break;
    /*shifters ::= '-'  shifters .*/
    case ARTL_ART_shifters_300: 
      shifters1 = new ARTAT_ART_shifters();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), shifters1));
      ARTRD_shifters(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, shifters1, null);
      shifters.v = shifters1.v - 1; 
      break;
        default:
          throw new ARTException("ARTRD_shifters: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_simpleNote(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_simpleNote simpleNote) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*simpleNote ::= simpleNoteLexeme .*/
    case ARTL_ART_simpleNote_204: 
            ARTRD_simpleNote(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, simpleNote);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_simpleNoteLexeme(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
       simpleNote.v = artLexeme(simpleNote.leftExtent, simpleNote.rightExtent).trim(); 
      break;
        default:
          throw new ARTException("ARTRD_simpleNote: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_simpleNoteLexeme(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*simpleNoteLexeme ::= 'Ab'  .*/
    case ARTL_ART_simpleNoteLexeme_210: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'A'  .*/
    case ARTL_ART_simpleNoteLexeme_214: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'A#'  .*/
    case ARTL_ART_simpleNoteLexeme_218: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'Bb'  .*/
    case ARTL_ART_simpleNoteLexeme_222: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'B'  .*/
    case ARTL_ART_simpleNoteLexeme_226: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'C'  .*/
    case ARTL_ART_simpleNoteLexeme_230: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'C#'  .*/
    case ARTL_ART_simpleNoteLexeme_234: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'Db'  .*/
    case ARTL_ART_simpleNoteLexeme_238: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'D'  .*/
    case ARTL_ART_simpleNoteLexeme_242: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'D#'  .*/
    case ARTL_ART_simpleNoteLexeme_246: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'Eb'  .*/
    case ARTL_ART_simpleNoteLexeme_250: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'E'  .*/
    case ARTL_ART_simpleNoteLexeme_254: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'F'  .*/
    case ARTL_ART_simpleNoteLexeme_258: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'F#'  .*/
    case ARTL_ART_simpleNoteLexeme_262: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'Gb'  .*/
    case ARTL_ART_simpleNoteLexeme_266: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'G'  .*/
    case ARTL_ART_simpleNoteLexeme_270: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'G#'  .*/
    case ARTL_ART_simpleNoteLexeme_274: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_simpleNoteLexeme: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_statement statement, ARTAT_ART_ID ID1, ARTAT_ART_e0 e01, ARTAT_ART_elseOpt elseOpt1, ARTAT_ART_statement statement1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statement ::= ID '='  . e0 ';'  */
    case ARTL_ART_statement_16: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= ID '='  e0 . ';'  */
    case ARTL_ART_statement_18: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
            break;
    /*statement ::= ID '='  e0 ';'  .*/
    case ARTL_ART_statement_20: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       variables.put(ID1.v, e01.v); 
      break;
    /*statement ::= 'if'  e0 . 'then'  statement elseOpt */
    case ARTL_ART_statement_28: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
            break;
    /*statement ::= 'if'  e0 'then'  . statement elseOpt */
    case ARTL_ART_statement_30: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'if'  e0 'then'  statement . elseOpt */
    case ARTL_ART_statement_32: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'if'  e0 'then'  statement elseOpt .*/
    case ARTL_ART_statement_34: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.elseOpt1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       if (e01.v != 0) 
                  artEvaluate(statement.statement1, statement1); 
                else
                  artEvaluate(statement.elseOpt1, elseOpt1);  
              
      break;
    /*statement ::= 'while'  e0 . 'do'  statement */
    case ARTL_ART_statement_42: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      statement.e01 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'while'  e0 'do'  . statement */
    case ARTL_ART_statement_44: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'while'  e0 'do'  statement .*/
    case ARTL_ART_statement_46: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       artEvaluate(statement.e01, e01); 
                while (e01.v != 0) { 
                  artEvaluate(statement.statement1, statement1); 
                  artEvaluate(statement.e01, e01); 
                } 
              
      break;
    /*statement ::= 'print'  '('  . printElements ')'  ';'  */
    case ARTL_ART_statement_54: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'print'  '('  printElements . ')'  ';'  */
    case ARTL_ART_statement_56: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*statement ::= 'print'  '('  printElements ')'  . ';'  */
    case ARTL_ART_statement_58: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'print'  '('  printElements ')'  ';'  .*/
    case ARTL_ART_statement_60: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'melody'  ID . statement */
    case ARTL_ART_statement_66: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*statement ::= 'melody'  ID statement .*/
    case ARTL_ART_statement_68: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       melodies.put(ID1.v, statement.statement1); 
      break;
    /*statement ::= 'play'  ID . ';'  */
    case ARTL_ART_statement_76: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*statement ::= 'play'  ID ';'  .*/
    case ARTL_ART_statement_78: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       if (!melodies.containsKey(ID1.v))
                    artText.println(ARTTextLevel.WARNING, "ignoring request to play undefined melody: " + ID1.v);
                  else
                    artEvaluate(melodies.get(ID1.v), null); 
                
      break;
    /*statement ::= '{'  statements . '}'  */
    case ARTL_ART_statement_86: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= '{'  statements '}'  .*/
    case ARTL_ART_statement_88: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= bpm .*/
    case ARTL_ART_statement_92: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_bpm(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= defaultOctave .*/
    case ARTL_ART_statement_96: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_defaultOctave(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= note .*/
    case ARTL_ART_statement_100: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_note(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null);
            break;
    /*statement ::= chord .*/
    case ARTL_ART_statement_104: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_chord(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= rest .*/
    case ARTL_ART_statement_108: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      statement1 = new ARTAT_ART_statement();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, e01, elseOpt1, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_rest(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_statement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_statement statement1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statements ::= statement .*/
    case ARTL_ART_statements_4: 
      statement1 = new ARTAT_ART_statement();
            ARTRD_statements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, statement1, null, null, null, null);
            break;
    /*statements ::= statement statements .*/
    case ARTL_ART_statements_10: 
      statement1 = new ARTAT_ART_statement();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, statement1, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_statements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
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
    case ARTL_ART_beatRatio: ARTRD_beatRatio(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_bpm: ARTRD_bpm(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_chord: ARTRD_chord(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_chordMode:  ARTRD_chordMode(artElement.element, artParent, artWriteable, (ARTAT_ART_chordMode) artAttributes); break;
    case ARTL_ART_defaultOctave: ARTRD_defaultOctave(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_e0:  ARTRD_e0(artElement.element, artParent, artWriteable, (ARTAT_ART_e0) artAttributes, null, null); break;
    case ARTL_ART_e1:  ARTRD_e1(artElement.element, artParent, artWriteable, (ARTAT_ART_e1) artAttributes, null, null); break;
    case ARTL_ART_e2:  ARTRD_e2(artElement.element, artParent, artWriteable, (ARTAT_ART_e2) artAttributes, null, null); break;
    case ARTL_ART_e3:  ARTRD_e3(artElement.element, artParent, artWriteable, (ARTAT_ART_e3) artAttributes, null, null); break;
    case ARTL_ART_e4:  ARTRD_e4(artElement.element, artParent, artWriteable, (ARTAT_ART_e4) artAttributes, null, null); break;
    case ARTL_ART_e5:  ARTRD_e5(artElement.element, artParent, artWriteable, (ARTAT_ART_e5) artAttributes, null, null, null); break;
    case ARTL_ART_elseOpt: ARTRD_elseOpt(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_note: ARTRD_note(artElement.element, artParent, artWriteable, null, null, null, null); break;
    case ARTL_ART_notes: ARTRD_notes(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_printElements: ARTRD_printElements(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_rest: ARTRD_rest(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_shifters:  ARTRD_shifters(artElement.element, artParent, artWriteable, (ARTAT_ART_shifters) artAttributes, null); break;
    case ARTL_ART_simpleNote:  ARTRD_simpleNote(artElement.element, artParent, artWriteable, (ARTAT_ART_simpleNote) artAttributes); break;
    case ARTL_ART_simpleNoteLexeme: ARTRD_simpleNoteLexeme(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_statement:  ARTRD_statement(artElement.element, artParent, artWriteable, (ARTAT_ART_statement) artAttributes, null, null, null, null); break;
    case ARTL_ART_statements: ARTRD_statements(artElement.element, artParent, artWriteable, null); break;
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
