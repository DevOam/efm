package GestionEmploye;

public class Formateur extends Employe{

	 private int heureSup;
     private static double remunerationHSup=70;
   
	public Formateur() {
		super();
		this.heureSup=0;
	}
	@Override
	public String toString() {
		return "Formateur [heureSup=" + heureSup + "]";
	}

	@Override
	public double SalaireAPayer() {
		int NbreHS = heureSup;
        if (NbreHS >= 30)
            NbreHS = 30;
        return (salaireBase + NbreHS*remunerationHSup) * (1 - IR.getIR(salaireBase*12));

	} 	



}
