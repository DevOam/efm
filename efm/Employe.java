package GestionEmploye;

public abstract class Employe  implements IEmploye{
	
    protected int mtle;
    protected String nom;
    protected int dateNaissance, dateEmbauche;
    protected double salaireBase;
    private static int count = 0;



	public Employe(int mtle, String nom, int dateNaissance, int dateEmbauche, double salaireBase) {
		super();
		this.mtle = mtle;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.salaireBase = salaireBase;
	}
	
	public Employe() {
		super();
		this.mtle = count++;
		this.nom ="";
		this.dateNaissance = 0;
		this.dateEmbauche = 0;
		this.salaireBase = 0;
		
	}
	public int getMtle() {
		return mtle;
	}
	public void setMtle(int mtle) {
		this.mtle = mtle;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String value) {
		this.nom = value;
	}
	public  int getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(int value) {
		this.dateNaissance = value;
	}
	public int getDateEmbauche() {
		return dateEmbauche;
	}

	public double getSalaireBase() {
		return salaireBase;
	}
	public void setSalaireBase(double salaireBase) {
		this.salaireBase = salaireBase;
	}
	@Override
	public int Age(int dateAujourdhui) {

		return  dateAujourdhui-dateNaissance;
	}
	@Override
	public int Anciennete(int dateAujourdhui) {

		return dateAujourdhui-dateEmbauche;
	}
	@Override
	public int DateRetraite(int ageRetraite) {
         return dateNaissance+ageRetraite;
	}
	public abstract double SalaireAPayer();
	@Override
	public String toString() {
		return "Employe [mtle=" + mtle + ", nom=" + nom + ", dateNaissance=" + dateNaissance + ", dateEmbauche="
				+ dateEmbauche + ", salaireBase=" + salaireBase + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return mtle == other.mtle;
	}

	
}


