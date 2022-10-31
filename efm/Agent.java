package GestionEmploye;

public class Agent extends Employe {
	  private double primeResponsabilite;

	public double getPrimeResponsabilite() {
		return primeResponsabilite;
	}

	public void setPrimeResponsabilite(double primeResponsabilite) {
		this.primeResponsabilite = primeResponsabilite;
	}
	

	public Agent(double primeResponsabilite) {
		super();
		this.primeResponsabilite = primeResponsabilite;
	}

	@Override
	public double SalaireAPayer() {
         
		return (salaireBase+primeResponsabilite)*(1-IR.getIR(salaireBase*12));

	}

}
