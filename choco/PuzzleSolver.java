import java.util.HashMap;
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



    HashMap<Integer,IntegerVariable> uebertraege = new HashMap<Integer,IntegerVariable>();
    uebertraege.put(0,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));
    int i = 0;
    


    uebertraege.put(i+1,Choco.makeIntVar("u2", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(K, K), uebertraege.get(i)), Choco.plus(H, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u3", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, L), uebertraege.get(i)), Choco.plus(G, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u4", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, F), uebertraege.get(i)), Choco.plus(L, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u5", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, ZERO), uebertraege.get(i)), Choco.plus(G, Choco.mult( uebertraege.get(i+1),10))));
    i++;





    uebertraege.put(i+1,Choco.makeIntVar("u6", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, J), uebertraege.get(i)), Choco.plus(C, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u7", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(A, J), uebertraege.get(i)), Choco.plus(H, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u8", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, B), uebertraege.get(i)), Choco.plus(F, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u9", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(C, ZERO), uebertraege.get(i)), Choco.plus(C, Choco.mult( uebertraege.get(i+1),10))));
    i++;





    uebertraege.put(i+1,Choco.makeIntVar("u10", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(J, B), uebertraege.get(i)), Choco.plus(K, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u111", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, C), uebertraege.get(i)), Choco.plus(B, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u12", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(D, A), uebertraege.get(i)), Choco.plus(F, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u13", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(K, ZERO), uebertraege.get(i)), Choco.plus(K, Choco.mult( uebertraege.get(i+1),10))));
    i++;





    uebertraege.put(i+1,Choco.makeIntVar("u14", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(K, L), uebertraege.get(i)), Choco.plus(J, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u15", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, A), uebertraege.get(i)), Choco.plus(L, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u16", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, H), uebertraege.get(i)), Choco.plus(D, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u17", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, C), uebertraege.get(i)), Choco.plus(K, Choco.mult( uebertraege.get(i+1),10))));
    i++;





    uebertraege.put(i+1,Choco.makeIntVar("u18", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(K, J), uebertraege.get(i)), Choco.plus(B, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u19", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, J), uebertraege.get(i)), Choco.plus(C, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u20", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, B), uebertraege.get(i)), Choco.plus(A, Choco.mult( uebertraege.get(i+1),10))));
    i++;





    uebertraege.put(i+1,Choco.makeIntVar("u21", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, C), uebertraege.get(i)), Choco.plus(K, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u22", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, H), uebertraege.get(i)), Choco.plus(B, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u23", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, F), uebertraege.get(i)), Choco.plus(F, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u24", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, C), uebertraege.get(i)), Choco.plus(K, Choco.mult( uebertraege.get(i+1),10))));
    i++;




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
