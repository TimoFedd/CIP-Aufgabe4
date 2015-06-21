import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class PuzzleSolver {

  private static final IntegerVariable ZERO = Choco.constant(0);

  /**
   * Loesen des Zahlenraetsels
   */
  public static void main(String[] args) {
    Model model = new CPModel();

    IntegerVariable A = Choco.makeIntVar("A", 0, 9, Options.V_ENUM); 
    IntegerVariable Q = Choco.makeIntVar("Q", 0, 9, Options.V_ENUM); 
    IntegerVariable B = Choco.makeIntVar("B", 0, 9, Options.V_ENUM); 
    IntegerVariable S = Choco.makeIntVar("S", 0, 9, Options.V_ENUM); 
    IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM); 
    IntegerVariable D = Choco.makeIntVar("D", 0, 9, Options.V_ENUM); 
    IntegerVariable U = Choco.makeIntVar("U", 0, 9, Options.V_ENUM); 
    IntegerVariable H = Choco.makeIntVar("H", 0, 9, Options.V_ENUM); 
    IntegerVariable I = Choco.makeIntVar("I", 0, 9, Options.V_ENUM); 
    IntegerVariable Z = Choco.makeIntVar("Z", 0, 9, Options.V_ENUM); 
    IntegerVariable N = Choco.makeIntVar("N", 0, 9, Options.V_ENUM); 


    IntegerExpressionVariable carry = ZERO;
 
    carry = Choco.sum(ZERO, S, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(A, Choco.mod(carry, 10)));
    carry = Choco.sum(ZERO, D, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(S, Choco.mod(carry, 10)));
    carry = Choco.sum(A, S, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(D, Choco.mod(carry, 10)));
    carry = Choco.sum(S, D, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(A, Choco.mod(carry, 10)));
    carry = Choco.sum(D, A, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(D, Choco.mod(carry, 10)));

    carry = ZERO;
    carry = Choco.sum(U, H, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(ZERO, Choco.mod(carry, 10)));
    carry = Choco.sum(I, U, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(I, Choco.mod(carry, 10)));
    carry = Choco.sum(H, I, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(N, Choco.mod(carry, 10)));
    carry = Choco.sum(I, H, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(N, Choco.mod(carry, 10)));

    carry = ZERO;
    carry = Choco.sum(ZERO, U, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(ZERO, Choco.mod(carry, 10)));
    carry = Choco.sum(U, U, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(ZERO, Choco.mod(carry, 10)));
    carry = Choco.sum(B, I, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(Q, Choco.mod(carry, 10)));
    carry = Choco.sum(U, B, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));
    carry = Choco.sum(S, N, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(Z, Choco.mod(carry, 10)));

    carry = ZERO;
    carry = Choco.sum(ZERO, ZERO, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(U, Choco.mod(carry, 10)));
    carry = Choco.sum(A, I, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(B, Choco.mod(carry, 10)));
    carry = Choco.sum(S, N, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(U, Choco.mod(carry, 10)));
    carry = Choco.sum(D, N, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(S, Choco.mod(carry, 10)));

    carry = ZERO;
    carry = Choco.sum(U, ZERO, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(S, Choco.mod(carry, 10)));
    carry = Choco.sum(U, H, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(D, Choco.mod(carry, 10)));
    carry = Choco.sum(I, U, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(S, Choco.mod(carry, 10)));
    carry = Choco.sum(B, I, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(D, Choco.mod(carry, 10)));
    carry = Choco.sum(N, H, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(A, Choco.mod(carry, 10)));

    carry = ZERO;
    carry = Choco.sum(A, ZERO, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(ZERO, Choco.mod(carry, 10)));
    carry = Choco.sum(S, U, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(ZERO, Choco.mod(carry, 10)));
    carry = Choco.sum(D, I, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(Q, Choco.mod(carry, 10)));
    carry = Choco.sum(A, H, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));
    carry = Choco.sum(D, I, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(Z, Choco.mod(carry, 10)));

    carry = ZERO;

    model.addConstraint(Choco.allDifferent(A, Q, B, S, C, D, U, H, I, Z, N));

    Solver s = new CPSolver();
    s.read(model);
    s.solve();

    System.out.println("A = " + s.getVar(A).getVal()); 
    System.out.println("Q = " + s.getVar(Q).getVal()); 
    System.out.println("B = " + s.getVar(B).getVal()); 
    System.out.println("S = " + s.getVar(S).getVal()); 
    System.out.println("C = " + s.getVar(C).getVal()); 
    System.out.println("D = " + s.getVar(D).getVal()); 
    System.out.println("U = " + s.getVar(U).getVal()); 
    System.out.println("H = " + s.getVar(H).getVal()); 
    System.out.println("I = " + s.getVar(I).getVal()); 
    System.out.println("Z = " + s.getVar(Z).getVal()); 
    System.out.println("N = " + s.getVar(N).getVal()); 
  }

}