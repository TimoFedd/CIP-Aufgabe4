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
    IntegerVariable B = Choco.makeIntVar("B", 0, 9, Options.V_ENUM); 
    IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM); 
    IntegerVariable D = Choco.makeIntVar("D", 0, 9, Options.V_ENUM); 
    IntegerVariable F = Choco.makeIntVar("F", 0, 9, Options.V_ENUM); 
    IntegerVariable G = Choco.makeIntVar("G", 0, 9, Options.V_ENUM); 
    IntegerVariable H = Choco.makeIntVar("H", 0, 9, Options.V_ENUM); 
    IntegerVariable J = Choco.makeIntVar("J", 0, 9, Options.V_ENUM); 
    IntegerVariable K = Choco.makeIntVar("K", 0, 9, Options.V_ENUM); 
    IntegerVariable L = Choco.makeIntVar("L", 0, 9, Options.V_ENUM); 


    IntegerExpressionVariable carry = ZERO;
 




    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(K, K), carry), Choco.plus(H, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, L), carry), Choco.plus(G, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, F), carry), Choco.plus(L, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, ZERO), carry), Choco.plus(G, Choco.mult( carry,10))));




    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, J), carry), Choco.plus(C, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(A, J), carry), Choco.plus(H, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, B), carry), Choco.plus(F, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(C, ZERO), carry), Choco.plus(C, Choco.mult( carry,10))));




    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(J, B), carry), Choco.plus(K, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, C), carry), Choco.plus(B, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(D, A), carry), Choco.plus(F, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(K, ZERO), carry), Choco.plus(K, Choco.mult( carry,10))));




    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(K, L), carry), Choco.plus(J, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, A), carry), Choco.plus(L, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, H), carry), Choco.plus(D, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, C), carry), Choco.plus(K, Choco.mult( carry,10))));




    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(K, J), carry), Choco.plus(B, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, J), carry), Choco.plus(C, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, B), carry), Choco.plus(A, Choco.mult( carry,10))));




    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, C), carry), Choco.plus(K, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, H), carry), Choco.plus(B, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, F), carry), Choco.plus(F, Choco.mult( carry,10))));

    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, C), carry), Choco.plus(K, Choco.mult( carry,10))));

    model.addConstraint(Choco.allDifferent(A, B, C, D, F, G, H, J, K, L));

    Solver s = new CPSolver();
    s.read(model);
    s.solve();

    System.out.println("A = " + s.getVar(A).getVal()); 
    System.out.println("B = " + s.getVar(B).getVal()); 
    System.out.println("C = " + s.getVar(C).getVal()); 
    System.out.println("D = " + s.getVar(D).getVal()); 
    System.out.println("F = " + s.getVar(F).getVal()); 
    System.out.println("G = " + s.getVar(G).getVal()); 
    System.out.println("H = " + s.getVar(H).getVal()); 
    System.out.println("J = " + s.getVar(J).getVal()); 
    System.out.println("K = " + s.getVar(K).getVal()); 
    System.out.println("L = " + s.getVar(L).getVal()); 
  }

}