import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;


public class ExDonaldGeraldRobert {

	public static void main(String[] arg){
		
		// Build model
				Model model = new CPModel();

				// Declare every letter as a variable
				IntegerVariable d = Choco.makeIntVar("d", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable o = Choco.makeIntVar("o", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable n = Choco.makeIntVar("n", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable a = Choco.makeIntVar("a", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable l = Choco.makeIntVar("l", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable g = Choco.makeIntVar("g", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable e = Choco.makeIntVar("e", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable r = Choco.makeIntVar("r", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable b = Choco.makeIntVar("b", 0, 9, new String[]{Options.V_ENUM});
				IntegerVariable t = Choco.makeIntVar("t", 0, 9, new String[]{Options.V_ENUM});
				
				// NEW: Declare every carry as a variable
				IntegerVariable u0 = Choco.constant(0);
				IntegerVariable u1 = Choco.makeIntVar("u1", 0, 1, new String[]{Options.V_ENUM});
				IntegerVariable u2 = Choco.makeIntVar("u2", 0, 1, new String[]{Options.V_ENUM});
				IntegerVariable u3 = Choco.makeIntVar("u3", 0, 1, new String[]{Options.V_ENUM});
				IntegerVariable u4 = Choco.makeIntVar("u4", 0, 1, new String[]{Options.V_ENUM});
				IntegerVariable u5 = Choco.makeIntVar("u5", 0, 1, new String[]{Options.V_ENUM});
				
				HashMap<Integer,IntegerVariable> uebertraege = new HashMap<Integer,IntegerVariable>();
				
			
				// DIFFERENT: Add constraint by letter
				model.addConstraint(Choco.eq(Choco.plus(Choco.plus(d, d), u0), Choco.plus(t, Choco.mult(u1, 10))));
				model.addConstraint(Choco.eq(Choco.plus(Choco.plus(l, l), u1), Choco.plus(r, Choco.mult(u2, 10))));
				model.addConstraint(Choco.eq(Choco.plus(Choco.plus(a, a), u2), Choco.plus(e, Choco.mult(u3, 10))));
				model.addConstraint(Choco.eq(Choco.plus(Choco.plus(n, r), u3), Choco.plus(b, Choco.mult(u4, 10))));
				model.addConstraint(Choco.eq(Choco.plus(Choco.plus(o, e), u4), Choco.plus(o, Choco.mult(u5, 10))));
				model.addConstraint(Choco.eq(Choco.plus(Choco.plus(d, g), u5), Choco.plus(r, Choco.mult(u0, 10))));

				
				
				//donald
				//gerald
				//robert
				
				// Add constraint of all different letters.
				model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));

				// Build a solver, read the model and solve it
				Solver s = new CPSolver();
				s.read(model);
				long start = System.currentTimeMillis();
				s.solve();
				System.out.println("Laufzeit in ms: " + (System.currentTimeMillis() - start));
				System.out.println("############################");

				
				
				ArrayList<IntegerVariable> donald =  new ArrayList<IntegerVariable>(){{add(d);add(o);add(n);add(a);add(l);add(d);}};
				
				System.out.print("Donald = ");
				for(IntegerVariable letter : donald){
					System.out.print(s.getVar(letter).getVal());
				}
				System.out.println("");
				
                ArrayList<IntegerVariable> gerald =  new ArrayList<IntegerVariable>(){{add(g);add(e);add(r);add(a);add(l);add(d);}};
				
				System.out.print("Gerald = ");
				for(IntegerVariable letter : gerald){
					System.out.print(s.getVar(letter).getVal());
				}
				System.out.println("");
				
                ArrayList<IntegerVariable> robert =  new ArrayList<IntegerVariable>(){{add(r);add(o);add(b);add(e);add(r);add(t);}};
				
				System.out.print("Robert = ");
				for(IntegerVariable letter : robert){
					System.out.print(s.getVar(letter).getVal());
				
				}
				
				
		
	}
	

	
	
}

