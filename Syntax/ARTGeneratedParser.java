import java.io.FileNotFoundException;

class ARTGeneratedParser extends uk.ac.rhul.cs.csle.art.alg.osbrd.ARTOSBRDBase {

boolean parse_ID() {
  int rc = cc, ro = co;

  /* Nonterminal ID, alternate 1 */
  cc = rc; co = ro; oracleSet(1);
  if (match("A")) {return true; }

  /* Nonterminal ID, alternate 2 */
  cc = rc; co = ro; oracleSet(2);
  if (match("B")) {return true; }

  /* Nonterminal ID, alternate 3 */
  cc = rc; co = ro; oracleSet(3);
  if (match("C")) {return true; }

  return false;
}

boolean parse_add() {
  int rc = cc, ro = co;

  /* Nonterminal add, alternate 1 */
  cc = rc; co = ro; oracleSet(1);
  if (parse_mul()) {
  if (match("+")) {
  if (parse_add()) {return true; }}}

  /* Nonterminal add, alternate 2 */
  cc = rc; co = ro; oracleSet(2);
  if (parse_mul()) {return true; }

  return false;
}

boolean parse_expr() {
  int rc = cc, ro = co;

  /* Nonterminal expr, alternate 1 */
  cc = rc; co = ro; oracleSet(1);
  if (parse_add()) {return true; }

  return false;
}

boolean parse_mul() {
  int rc = cc, ro = co;

  /* Nonterminal mul, alternate 1 */
  cc = rc; co = ro; oracleSet(1);
  if (parse_op()) {
  if (match("*")) {
  if (parse_mul()) {return true; }}}

  /* Nonterminal mul, alternate 2 */
  cc = rc; co = ro; oracleSet(2);
  if (parse_op()) {return true; }

  return false;
}

boolean parse_op() {
  int rc = cc, ro = co;

  /* Nonterminal op, alternate 1 */
  cc = rc; co = ro; oracleSet(1);
  if (parse_ID()) {return true; }

  /* Nonterminal op, alternate 2 */
  cc = rc; co = ro; oracleSet(2);
  if (match("(")) {
  if (parse_expr()) {
  if (match(")")) {return true; }}}

  return false;
}

  class Attribute_ID {
  }

  void semantics_ID(Attribute_ID ID) {
    switch(oracle[co++]) {
      case 1: {
        match("A");
        break; }

      case 2: {
        match("B");
        break; }

      case 3: {
        match("C");
        break; }

    }
  }

  class Attribute_add {
  }

  void semantics_add(Attribute_add add) {
    switch(oracle[co++]) {
      case 1: {
        Attribute_mul mul1 = new Attribute_mul();
        Attribute_add add1 = new Attribute_add();
        // Instance mul1
        semantics_mul(mul1);
        match("+");
        // Instance add1
        semantics_add(add1);
        break; }

      case 2: {
        Attribute_mul mul1 = new Attribute_mul();
        // Instance mul1
        semantics_mul(mul1);
        break; }

    }
  }

  class Attribute_expr {
  }

  void semantics_expr(Attribute_expr expr) {
    switch(oracle[co++]) {
      case 1: {
        Attribute_add add1 = new Attribute_add();
        // Instance add1
        semantics_add(add1);
        break; }

    }
  }

  class Attribute_mul {
  }

  void semantics_mul(Attribute_mul mul) {
    switch(oracle[co++]) {
      case 1: {
        Attribute_op op1 = new Attribute_op();
        Attribute_mul mul1 = new Attribute_mul();
        // Instance op1
        semantics_op(op1);
        match("*");
        // Instance mul1
        semantics_mul(mul1);
        break; }

      case 2: {
        Attribute_op op1 = new Attribute_op();
        // Instance op1
        semantics_op(op1);
        break; }

    }
  }

  class Attribute_op {
  }

  void semantics_op(Attribute_op op) {
    switch(oracle[co++]) {
      case 1: {
        Attribute_ID ID1 = new Attribute_ID();
        // Instance ID1
        semantics_ID(ID1);
        break; }

      case 2: {
        Attribute_expr expr1 = new Attribute_expr();
        match("(");
        // Instance expr1
        semantics_expr(expr1);
        match(")");
        break; }

    }
  }

  TreeNode tree_ID() {
    TreeNode leftNode = null, rightNode = null;
    switch(oracle[co++]) {
        case 1:
           leftNode = rightNode = new TreeNode("A", null, rightNode, TreeKind.TERMINAL, GIFTKind.FOLD_OVER); match("A");
        break;

        case 2:
           leftNode = rightNode = new TreeNode("B", null, rightNode, TreeKind.TERMINAL, GIFTKind.FOLD_OVER); match("B");
        break;

        case 3:
           leftNode = rightNode = new TreeNode("C", null, rightNode, TreeKind.TERMINAL, GIFTKind.FOLD_OVER); match("C");
        break;

    }
  return leftNode;
}

  TreeNode tree_add() {
    TreeNode leftNode = null, rightNode = null;
    switch(oracle[co++]) {
        case 1:
           leftNode = rightNode = new TreeNode("mul", tree_mul(), rightNode, TreeKind.NONTERMINAL, GIFTKind.NONE);
           rightNode = new TreeNode("+", null, rightNode, TreeKind.TERMINAL, GIFTKind.FOLD_OVER); match("+");
           rightNode = new TreeNode("add", tree_add(), rightNode, TreeKind.NONTERMINAL, GIFTKind.NONE);
        break;

        case 2:
           leftNode = rightNode = new TreeNode("mul", tree_mul(), rightNode, TreeKind.NONTERMINAL, GIFTKind.FOLD_OVER);
        break;

    }
  return leftNode;
}

  TreeNode tree_expr() {
    TreeNode leftNode = null, rightNode = null;
    switch(oracle[co++]) {
        case 1:
           leftNode = rightNode = new TreeNode("add", tree_add(), rightNode, TreeKind.NONTERMINAL, GIFTKind.FOLD_OVER);
        break;

    }
  return leftNode;
}

  TreeNode tree_mul() {
    TreeNode leftNode = null, rightNode = null;
    switch(oracle[co++]) {
        case 1:
           leftNode = rightNode = new TreeNode("op", tree_op(), rightNode, TreeKind.NONTERMINAL, GIFTKind.NONE);
           rightNode = new TreeNode("*", null, rightNode, TreeKind.TERMINAL, GIFTKind.FOLD_OVER); match("*");
           rightNode = new TreeNode("mul", tree_mul(), rightNode, TreeKind.NONTERMINAL, GIFTKind.NONE);
        break;

        case 2:
           leftNode = rightNode = new TreeNode("op", tree_op(), rightNode, TreeKind.NONTERMINAL, GIFTKind.FOLD_OVER);
        break;

    }
  return leftNode;
}

  TreeNode tree_op() {
    TreeNode leftNode = null, rightNode = null;
    switch(oracle[co++]) {
        case 1:
           leftNode = rightNode = new TreeNode("ID", tree_ID(), rightNode, TreeKind.NONTERMINAL, GIFTKind.FOLD_OVER);
        break;

        case 2:
           leftNode = rightNode = new TreeNode("(", null, rightNode, TreeKind.TERMINAL, GIFTKind.FOLD_UNDER); match("(");
           rightNode = new TreeNode("expr", tree_expr(), rightNode, TreeKind.NONTERMINAL, GIFTKind.FOLD_OVER);
           rightNode = new TreeNode(")", null, rightNode, TreeKind.TERMINAL, GIFTKind.FOLD_UNDER); match(")");
        break;

    }
  return leftNode;
}

void parse(String filename) throws FileNotFoundException {
  input = readInput(filename);

  System.out.printf("Input: '%s'\n", input);
  cc = co = 0; builtIn_WHITESPACE();
  if (!(parse_expr() && input.charAt(cc) == '\0')) {System.out.print("Rejected\n"); return; }

  System.out.print("Accepted\n");
  System.out.print("Oracle:"); for (int i = 0; i < co; i++) System.out.printf(" %d", oracle[i]); System.out.printf("\n");
  System.out.print("\nSemantics phase\n"); cc = 0; co = 0; builtIn_WHITESPACE(); Attribute_expr expr = new Attribute_expr(); semantics_expr(expr);
  System.out.print("\nTree construction phase\n"); cc = 0; co = 0; builtIn_WHITESPACE();
  TreeNode dt = new TreeNode("expr", tree_expr(), null, TreeKind.NONTERMINAL, GIFTKind.NONE);
  dt.dot("dt.dot");  System.out.print("\nDerivation term\n"); dt.printTerm(0);
  System.out.print("\n\nDerivation tree\n"); dt.printTree(0);
  TreeNode cloneRoot = dt.clone(null, null);
    cloneRoot.dot("clone.dot");

    // System.out.print("\nCloned derivation tree\n");
    // cloneRoot.printTree(0);
    TreeNode rdtEpsilon = dt.evaluateTIF(null, null, true);
    rdtEpsilon.dot("rdtEpsilon.dot");

    //System.out.print("\nRDTEpsilon fold tree\n");
    //rdtEpsilon.printTree(0);
    rdtEpsilon.foldunderEpsilon();
    rdtEpsilon.dot("rdtEpsilonFold.dot");

    //System.out.print("\nAnnotated RDTEpsilon tree\n");
    //rdtEpsilon.printTree(0);
    rdt = rdtEpsilon.evaluateTIF(null, null, true);
    rdt.dot("rdt.dot");

    System.out.print("\nRewritten Derivation term\n"); rdt.printTerm(0);
    System.out.print("\n\nRewritten Derivation Tree\n");
    rdt.printTree(0);
    postParse(rdt);

}

public static void main(String[] args) throws FileNotFoundException{
    if (args.length < 1) {
      System.err.println("No input file name supplied");
      System.exit(1);
    } else
      new ARTGeneratedParser().parse(args[0]);
  }
}
