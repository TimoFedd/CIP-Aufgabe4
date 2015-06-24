import java.util.HashMap;
import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
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
    int i = 0;
    
    uebertraege.put(i,Choco.constant(0));

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(B, G), uebertraege.get(i)), Choco.plus(H, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(D, D), uebertraege.get(i)), Choco.plus(H, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, D), uebertraege.get(i)), Choco.plus(J, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, C), uebertraege.get(i)), Choco.plus(H, Choco.mult( uebertraege.get(i+1),10))));
    i++;



    uebertraege.put(i,Choco.constant(0));

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, B), uebertraege.get(i)), Choco.plus(G, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(J, L), uebertraege.get(i)), Choco.plus(J, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, H), uebertraege.get(i)), Choco.plus(G, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(ZERO, G), uebertraege.get(i)), Choco.plus(C, Choco.mult( uebertraege.get(i+1),10))));
    i++;



    uebertraege.put(i,Choco.constant(0));

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, H), uebertraege.get(i)), Choco.plus(J, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, C), uebertraege.get(i)), Choco.plus(D, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(L, A), uebertraege.get(i)), Choco.plus(L, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, F), uebertraege.get(i)), Choco.plus(K, Choco.mult( uebertraege.get(i+1),10))));
    i++;



    uebertraege.put(i,Choco.constant(0));

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(B, H), uebertraege.get(i)), Choco.plus(G, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(D, J), uebertraege.get(i)), Choco.plus(G, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, F), uebertraege.get(i)), Choco.plus(L, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, ZERO), uebertraege.get(i)), Choco.plus(F, Choco.mult( uebertraege.get(i+1),10))));
    i++;



    uebertraege.put(i,Choco.constant(0));

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, B), uebertraege.get(i)), Choco.plus(H, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(D, L), uebertraege.get(i)), Choco.plus(C, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(D, H), uebertraege.get(i)), Choco.plus(A, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(C, G), uebertraege.get(i)), Choco.plus(F, Choco.mult( uebertraege.get(i+1),10))));
    i++;



    uebertraege.put(i,Choco.constant(0));

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, G), uebertraege.get(i)), Choco.plus(J, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, J), uebertraege.get(i)), Choco.plus(D, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(J, G), uebertraege.get(i)), Choco.plus(L, Choco.mult( uebertraege.get(i+1),10))));
    i++;

    uebertraege.put(i+1,Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM}));  
    model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, C), uebertraege.get(i)), Choco.plus(K, Choco.mult( uebertraege.get(i+1),10))));
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